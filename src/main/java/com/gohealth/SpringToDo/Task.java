package com.gohealth.SpringToDo;

import java.time.LocalDateTime;

/**
 * @author <a href="mailto:cmullikin@gohealth.com">Colin Mullikin</a>
 */
public class Task {

    private final String name;
    private final LocalDateTime createdDate;

    public Task(String name) {
        this.name = name;
        createdDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate(){
        return createdDate;
    }

}
