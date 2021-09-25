package org.hackspring.samplejdbc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<Student> findAll() {
        return jdbcTemplate.query("select * from students", new StudentRowMapper());
    }

    public Boolean insertUsingLegacy(Student student) {
        jdbcTemplate.update("INSERT into students(studentname,age,description) VALUES(?,?,?)", "Nikx", 35, "Sample insert");
        return true;
    }

    public Boolean insertUsingPrepare(Student student) {
        String query = "INSERT into students(studentname,age,description) VALUES(?,?,?)";
        return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1,"Nikx_Modern");
                ps.setInt(2, 24);
                ps.setString(3, "This is inserted from Prepared Statemnt");
                return ps.execute();
            }
        });
    }


    class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("studentname"));
            student.setAge(rs.getInt("age"));
            student.setDescription(rs.getString("description"));

            return student;
        }
    }
}
