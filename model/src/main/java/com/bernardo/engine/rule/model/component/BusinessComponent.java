package com.bernardo.engine.rule.model.component;

import java.util.HashMap;

public abstract class BusinessComponent<I> {

    //TODO: javadoc
    public abstract boolean execute(I input, HashMap<String, Object> params);

    /**
     * Component name, represent the name used in configuration for execution
     */
    public String getName() {
        return this.getClass().getSimpleName();
    }

}
