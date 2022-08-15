package com.bernardo.engine.rule.model;

import java.util.HashMap;

public abstract class BusinessComponent<I, O> {

    //TODO: javadoc
    public abstract O execute(I input, HashMap<String, Object> params);

    /**
     * Component name, represent the name used in configuration for execution
     */
    public String getName() {
        return this.getClass().getSimpleName();
    }

}
