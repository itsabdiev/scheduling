package com.sunny.scheduled.schedule;


import com.sunny.scheduled.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class ScheduleProp {
    private BookRepository bookRepository;


    @Scheduled(cron = "* * * * * 2")
    public void checkRepoCount() {
        log.info("There are { %d } books in database".formatted(bookRepository.count()));
    }

}
