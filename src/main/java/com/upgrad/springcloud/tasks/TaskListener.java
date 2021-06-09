package com.upgrad.springcloud.tasks;

import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;

/**
 * Created by Vishwa 10th June 2021
 */
public class TaskListener implements TaskExecutionListener {
  @Override
  public void onTaskStartup(TaskExecution taskExecution) {

    System.out.println("Task started");

  }

  @Override
  public void onTaskEnd(TaskExecution taskExecution) {
    System.out.println("Task Completed");
  }

  @Override
  public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
    System.out.println("Task Failed");
  }
}
