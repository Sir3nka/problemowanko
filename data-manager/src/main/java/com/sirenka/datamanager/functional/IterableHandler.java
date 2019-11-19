package com.sirenka.datamanager.functional;

import java.util.ArrayList;
import java.util.List;

public class IterableHandler<T> {
    public List<T> makeListOffIterable(Iterable<T> arg) {
        List<T> payLoad = new ArrayList<>();
        arg.forEach(payLoad::add);
        return payLoad;
    }
}
