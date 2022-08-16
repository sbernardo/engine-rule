package com.bernardo.engine.rule.model.rule;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Assert;
import org.junit.Test;

public class BusinessRuleBaseTest {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final XmlMapper xmlMapper = new XmlMapper();

    @Test
    public void baseRuleToJson() throws JsonProcessingException {
        BusinessRuleBase rule = new BusinessRuleBase();
        rule.setBlocking(true);
        rule.setEnabled(false);
        rule.setGroup("logic");
        rule.setType("base");
        rule.setOrder(1);
        rule.setName("rule1");
        String jsonString = objectMapper.writeValueAsString(rule);
        BusinessRuleBase ruleReadAgain = objectMapper.readValue(jsonString, BusinessRuleBase.class);

        Assert.assertEquals(rule, ruleReadAgain);
    }

    @Test
    public void baseRuleToXml() throws JsonProcessingException {
        BusinessRuleBase rule = new BusinessRuleBase();
        rule.setBlocking(true);
        rule.setEnabled(false);
        rule.setGroup("logic");
        rule.setType("base");
        rule.setOrder(1);
        rule.setName("rule1");
        String xmlString = xmlMapper.writeValueAsString(rule);
        System.out.println(xmlString);
        BusinessRuleBase ruleReadAgain = xmlMapper.readValue(xmlString, BusinessRuleBase.class);

        Assert.assertEquals(rule, ruleReadAgain);
    }

    @Test
    public void baseRuleJsonAndXml() throws JsonProcessingException {
        BusinessRuleBase rule = new BusinessRuleBase();
        rule.setBlocking(true);
        rule.setEnabled(false);
        rule.setGroup("logic");
        rule.setType("base");
        rule.setOrder(1);
        rule.setName("rule1");
        String jsonString = objectMapper.writeValueAsString(rule);
        BusinessRuleBase ruleJsonReadAgain = objectMapper.readValue(jsonString, BusinessRuleBase.class);
        String xmlString = xmlMapper.writeValueAsString(rule);
        BusinessRuleBase ruleXmlReadAgain = xmlMapper.readValue(xmlString, BusinessRuleBase.class);

        Assert.assertEquals(ruleJsonReadAgain, ruleXmlReadAgain);
    }

}
