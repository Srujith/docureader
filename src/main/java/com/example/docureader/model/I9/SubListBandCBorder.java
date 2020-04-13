
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
    "subDocListB",
    "subDocListC"
})
public class SubListBandCBorder {

    @JsonProperty("subDocListB")
    private SubDocListB subDocListB;
    @JsonProperty("subDocListC")
    private SubDocListC subDocListC;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subDocListB")
    public SubDocListB getSubDocListB() {
        return subDocListB;
    }

    @JsonProperty("subDocListB")
    public void setSubDocListB(SubDocListB subDocListB) {
        this.subDocListB = subDocListB;
    }

    @JsonProperty("subDocListC")
    public SubDocListC getSubDocListC() {
        return subDocListC;
    }

    @JsonProperty("subDocListC")
    public void setSubDocListC(SubDocListC subDocListC) {
        this.subDocListC = subDocListC;
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
