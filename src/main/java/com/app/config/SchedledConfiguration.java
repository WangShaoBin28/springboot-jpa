package com.app.config;

import com.app.model.EnumDemo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component

public class SchedledConfiguration {


    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");

    /**
     * 定时1分钟执行一次
     */
    @Scheduled(cron = "0 */1 * * * ? ")
    public void schedledTime() {

        System.out.println(format.format(new Date()) + " --余生很长，请多指教。 ");

        EnumDemo blue = EnumDemo.BLUE;
        System.out.println( blue.getKey());
        System.out.println( blue.getValue());
        System.out.println( blue.getInteger());

    }
}
