package com.spring_example;


import com.spring_example.config.ProjectConfig;
import com.spring_example.model.Comment;
import com.spring_example.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        Comment comment =  new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = container.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
