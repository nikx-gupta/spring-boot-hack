package com.hackspring.depinjection;

import com.hackspring.depinjection.simpleBean.Dog;
import com.hackspring.depinjection.simpleBean.MainBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DepInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepInjectionApplication.class, args);
    }


}

