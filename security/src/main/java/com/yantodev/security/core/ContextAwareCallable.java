package com.yantodev.security.core;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.concurrent.Callable;

public class ContextAwareCallable<T> implements Callable<T> {
    private final Callable<T> task;
    private final RequestAttributes context;

    public ContextAwareCallable(Callable<T> task, RequestAttributes context) {
        this.task = task;
        this.context = context;
    }

    @Override
    public T call() throws Exception {
        if (context != null) {
            RequestContextHolder.setRequestAttributes(context);
        }

        try {
            return task.call();
        } finally {
            RequestContextHolder.resetRequestAttributes();
        }
    }
}