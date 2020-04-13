
package com.example.docureader.model.I9;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rbListPerparerOrTranslator",
    "dropdownMultiPreparerOrTranslator"
})
public class SubPreparerTranslatorSelection {

    @JsonProperty("rbListPerparerOrTranslator")
    private String rbListPerparerOrTranslator;
    @JsonProperty("dropdownMultiPreparerOrTranslator")
    private Object dropdownMultiPreparerOrTranslator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rbListPerparerOrTranslator")
    public String getRbListPerparerOrTranslator() {
        return rbListPerparerOrTranslator;
    }

    @JsonProperty("rbListPerparerOrTranslator")
    public void setRbListPerparerOrTranslator(String rbListPerparerOrTranslator) {
        this.rbListPerparerOrTranslator = rbListPerparerOrTranslator;
    }

    @JsonProperty("dropdownMultiPreparerOrTranslator")
    public Object getDropdownMultiPreparerOrTranslator() {
        return dropdownMultiPreparerOrTranslator;
    }

    @JsonProperty("dropdownMultiPreparerOrTranslator")
    public void setDropdownMultiPreparerOrTranslator(Object dropdownMultiPreparerOrTranslator) {
        this.dropdownMultiPreparerOrTranslator = dropdownMultiPreparerOrTranslator;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
