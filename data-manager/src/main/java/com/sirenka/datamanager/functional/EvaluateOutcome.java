package com.sirenka.datamanager.functional;


import com.sirenka.datamanager.model.ResponseClass;

public class EvaluateOutcome <T> {
    public ResponseClass evaluateActionOutcome(IBooleanExecute R, T t){
        return R.execute(t) ? ResponseClass.builder().content("Succesfully completed request").build()
            : ResponseClass.builder().content("Failed to execute request").build();
    }
}
