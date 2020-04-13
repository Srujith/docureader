
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
    "subSection2",
    "subSec2End",
    "subSec2EndSpacer",
    "subSection3"
})
public class Section2and3Page2 {

    @JsonProperty("subSection2")
    private SubSection2 subSection2;
    @JsonProperty("subSec2End")
    private SubSec2End subSec2End;
    @JsonProperty("subSec2EndSpacer")
    private SubSec2EndSpacer subSec2EndSpacer;
    @JsonProperty("subSection3")
    private SubSection3 subSection3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subSection2")
    public SubSection2 getSubSection2() {
        return subSection2;
    }

    @JsonProperty("subSection2")
    public void setSubSection2(SubSection2 subSection2) {
        this.subSection2 = subSection2;
    }

    @JsonProperty("subSec2End")
    public SubSec2End getSubSec2End() {
        return subSec2End;
    }

    @JsonProperty("subSec2End")
    public void setSubSec2End(SubSec2End subSec2End) {
        this.subSec2End = subSec2End;
    }

    @JsonProperty("subSec2EndSpacer")
    public SubSec2EndSpacer getSubSec2EndSpacer() {
        return subSec2EndSpacer;
    }

    @JsonProperty("subSec2EndSpacer")
    public void setSubSec2EndSpacer(SubSec2EndSpacer subSec2EndSpacer) {
        this.subSec2EndSpacer = subSec2EndSpacer;
    }

    @JsonProperty("subSection3")
    public SubSection3 getSubSection3() {
        return subSection3;
    }

    @JsonProperty("subSection3")
    public void setSubSection3(SubSection3 subSection3) {
        this.subSection3 = subSection3;
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
