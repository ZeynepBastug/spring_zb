package com.spring_example.proxy;

import com.spring_example.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
