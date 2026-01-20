package com.example.MD_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MdStoreApplication {
    public static void main(String[] args) {
        System.setProperty("spring.data.mongodb.uri", "mongodb+srv://tylerth852_db_user:748223@ecommerce.pwwkptv.mongodb.net/?appName=ecommerce");
        SpringApplication.run(MdStoreApplication.class, args);
    }
}
