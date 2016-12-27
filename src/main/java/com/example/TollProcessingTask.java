package com.example;

import org.springframework.boot.CommandLineRunner;

public class TollProcessingTask implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        if(strings != null) {
            System.out.println("parameter length is " + strings.length);
            String stationId = strings[0];
            String licensePlate = strings[1];
            String timestamp = strings[2];
            System.out.println("Station Id is " + stationId + ", plate is " + licensePlate + ", timestamp is " + timestamp);
        }
    }
}
