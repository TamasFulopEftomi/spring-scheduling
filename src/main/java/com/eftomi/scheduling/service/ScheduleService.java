package com.eftomi.scheduling.service;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class ScheduleService {

    @Scheduled(cron = "${scheduled.stay.cronString}")
    public void doScheduling() {
        log.info("Scheduling according to cron setup. " + LocalDateTime.now());
    }
}
