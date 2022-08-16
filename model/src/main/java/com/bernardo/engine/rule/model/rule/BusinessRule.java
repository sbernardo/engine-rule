package com.bernardo.engine.rule.model.rule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BusinessRuleBase.class, name = "base")
})
@JacksonXmlRootElement(localName = "rule")
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BusinessRule implements Comparable<BusinessRule> {

    /**
     * Type rule
     */
    private String type;

    /**
     * Rule name
     */
    private String name;

    /**
     * Group name
     */
    private String group;

    /**
     * Order execution rule
     */
    private int order;

    /**
     * Enable rule or not. If false the rule will be skipped
     */
    private boolean enabled;

    /**
     * If true stop execution of current rule's group
     */
    private boolean blocking;

    /**
     * Defines ordering of execution
     *
     * @param o the object to be compared.
     */
    @Override
    public int compareTo(BusinessRule o) {
        return Integer.compare(this.getOrder(), o.getOrder());
    }
}
