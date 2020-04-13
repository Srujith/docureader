
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subEmployeeInfo"
})
public class SubSection1Top {

    @JsonProperty("subEmployeeInfo")
    private SubEmployeeInfo subEmployeeInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subEmployeeInfo")
    public SubEmployeeInfo getSubEmployeeInfo() {
        return subEmployeeInfo;
    }

    @JsonProperty("subEmployeeInfo")
    public void setSubEmployeeInfo(SubEmployeeInfo subEmployeeInfo) {
        this.subEmployeeInfo = subEmployeeInfo;
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
