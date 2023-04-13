package com.records.records;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecordsApplication {

    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass("Lovemore", "lmakore@19gmail.com");

        StudentRecords studentRecords = new StudentRecords("Tafara","tmakumbe@99gmail.com");

        SpringApplication.run(RecordsApplication.class, args);
    }

}
