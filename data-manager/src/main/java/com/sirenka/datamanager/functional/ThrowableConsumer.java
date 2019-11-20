package com.sirenka.datamanager.functional;

@FunctionalInterface
public interface ThrowableConsumer<T> {

    void apply (T t) throws Exception;
}
