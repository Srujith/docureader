
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subIntro",
    "subSection1PositionWrapper"
})
public class Section1Page1 {

    @JsonProperty("subIntro")
    private SubIntro subIntro;
    @JsonProperty("subSection1PositionWrapper")
    private SubSection1PositionWrapper subSection1PositionWrapper;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subIntro")
    public SubIntro getSubIntro() {
        return subIntro;
    }

    @JsonProperty("subIntro")
    public void setSubIntro(SubIntro subIntro) {
        this.subIntro = subIntro;
    }

    @JsonProperty("subSection1PositionWrapper")
    public SubSection1PositionWrapper getSubSection1PositionWrapper() {
        return subSection1PositionWrapper;
    }

    @JsonProperty("subSection1PositionWrapper")
    public void setSubSection1PositionWrapper(SubSection1PositionWrapper subSection1PositionWrapper) {
        this.subSection1PositionWrapper = subSection1PositionWrapper;
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
