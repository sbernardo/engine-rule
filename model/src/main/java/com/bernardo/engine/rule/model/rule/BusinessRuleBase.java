package com.bernardo.engine.rule.model.rule;

import lombok.Data;

@Data
public class BusinessRuleBase extends BusinessRule {

    private BusinessWhen when;

    private BusinessThen then;

}
