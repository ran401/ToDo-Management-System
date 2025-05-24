package com.dmm.task.data.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TaskForm {
  private String title;
  private String text;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;
  private boolean done;
}