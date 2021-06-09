package com.upgrad.springcloud.tasks;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;


/**
 * Created by Vishwa 10th June 2021
 */
@SpringBootApplication
@EnableTask
public class TasksApplication implements ApplicationRunner {

  public static void main(String[] args) {
    SpringApplication.run(TasksApplication.class, args);
  }

  /**
   * Registering the bean of the task Listener
   * @return
   */
  @Bean
  public TaskListener taskListener() {
    return new TaskListener();
  }

  /**
   * Short lived task that gets executed once the application is stated
   * @param args
   * @throws Exception
   */
  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("Hello World");
  }
}
