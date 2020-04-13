
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
    "subSection1Top",
    "subSection1Bottom"
})
public class SubSection1PositionWrapper {

    @JsonProperty("subSection1Top")
    private SubSection1Top subSection1Top;
    @JsonProperty("subSection1Bottom")
    private SubSection1Bottom subSection1Bottom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subSection1Top")
    public SubSection1Top getSubSection1Top() {
        return subSection1Top;
    }

    @JsonProperty("subSection1Top")
    public void setSubSection1Top(SubSection1Top subSection1Top) {
        this.subSection1Top = subSection1Top;
    }

    @JsonProperty("subSection1Bottom")
    public SubSection1Bottom getSubSection1Bottom() {
        return subSection1Bottom;
    }

    @JsonProperty("subSection1Bottom")
    public void setSubSection1Bottom(SubSection1Bottom subSection1Bottom) {
        this.subSection1Bottom = subSection1Bottom;
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
