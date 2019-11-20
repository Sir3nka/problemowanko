package com.sirenka.datamanager.functional;

public class HandleExecution<T> {
    public void executeThrowableFunction(ThrowableConsumer<T> R, T t) throws Exception {
            R.apply(t);
    }
}
