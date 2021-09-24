package com.hackspring.depinjection.simpleBean;

import com.hackspring.depinjection.simpleBean.Dog;
import com.hackspring.depinjection.simpleBean.MainBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class BeanController {

    @GetMapping("/")
    public void get() {
        MainBean bean = new MainBean(new Dog());
        bean.shout();
    }
}
