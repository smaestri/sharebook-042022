//package com.udemy.demo.configuration;
//
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.web.client.RestTemplate;
//
//@Configuration
//@EnableScheduling
//public class ScheduledConf {
//
//    private final RestTemplate restTemplate;
//
//    public ScheduledConf(RestTemplateBuilder restTemplateBuilder) {
//        this.restTemplate = restTemplateBuilder.build();
//    }
//
//    @Scheduled(fixedDelay = 60000)
//    public void scheduleFixedDelayTask() {
//        System.out.println(
//                "Fixed delay task - " + System.currentTimeMillis() / 1000);
//        String url = "https://sharebook.azurewebsites.net/";
//        String forObject = restTemplate.getForObject(url, String.class);
//        System.out.println("response=" + forObject);
//    }
//}
