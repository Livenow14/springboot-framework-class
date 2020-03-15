package me.livenow.spirngframework.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;            //바로 사용할 수있음

    @Override
    public void run(ApplicationArguments args) throws Exception {

        while(true) {

            System.out.println(messageSource.getMessage("greeting", new String[]{"Taejeong"}, Locale.getDefault()));
            System.out.println(messageSource.getMessage("greeting", new String[]{"Taejeong"}, Locale.getDefault()));
            Thread.sleep(1000l);
        }

    }

}
