DROP TABLE Students;

CREATE TABLE Students (
    ID  SERIAL PRIMARY KEY,
    STUDENTNAME TEXT    NOT NULL,
    AGE int,
    DESCRIPTION TEXT    NOT NULL
);

INSERT INTO Students (STUDENTNAME,AGE,DESCRIPTION)
VALUES ('John', '28', 'Description about the student!');

INSERT INTO Students (STUDENTNAME,AGE,DESCRIPTION)
VALUES ('Sundar', '38', 'Description about the student!');
