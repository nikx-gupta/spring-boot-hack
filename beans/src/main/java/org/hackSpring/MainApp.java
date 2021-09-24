package org.hackSpring;

import org.hackSpring.simpleBean.Dog;
import org.hackSpring.simpleBean.MainBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        MainBean bn  = (MainBean) context.getBean("bean");
        bn.shout();
    }

}

