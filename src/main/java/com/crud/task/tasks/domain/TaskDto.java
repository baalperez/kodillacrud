package com.crud.task.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private Long id;
    private String title;
    private String content;

    public TaskDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
