
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
    "subTranslatorSignature1",
    "subTranslatorSignature2",
    "subTranslatorSignature3",
    "subTranslatorSignature4"
})
public class SubPrepererTranslatorRepeat_ {

    @JsonProperty("subTranslatorSignature1")
    private SubTranslatorSignature1_ subTranslatorSignature1;
    @JsonProperty("subTranslatorSignature2")
    private SubTranslatorSignature2_ subTranslatorSignature2;
    @JsonProperty("subTranslatorSignature3")
    private SubTranslatorSignature3_ subTranslatorSignature3;
    @JsonProperty("subTranslatorSignature4")
    private SubTranslatorSignature4_ subTranslatorSignature4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subTranslatorSignature1")
    public SubTranslatorSignature1_ getSubTranslatorSignature1() {
        return subTranslatorSignature1;
    }

    @JsonProperty("subTranslatorSignature1")
    public void setSubTranslatorSignature1(SubTranslatorSignature1_ subTranslatorSignature1) {
        this.subTranslatorSignature1 = subTranslatorSignature1;
    }

    @JsonProperty("subTranslatorSignature2")
    public SubTranslatorSignature2_ getSubTranslatorSignature2() {
        return subTranslatorSignature2;
    }

    @JsonProperty("subTranslatorSignature2")
    public void setSubTranslatorSignature2(SubTranslatorSignature2_ subTranslatorSignature2) {
        this.subTranslatorSignature2 = subTranslatorSignature2;
    }

    @JsonProperty("subTranslatorSignature3")
    public SubTranslatorSignature3_ getSubTranslatorSignature3() {
        return subTranslatorSignature3;
    }

    @JsonProperty("subTranslatorSignature3")
    public void setSubTranslatorSignature3(SubTranslatorSignature3_ subTranslatorSignature3) {
        this.subTranslatorSignature3 = subTranslatorSignature3;
    }

    @JsonProperty("subTranslatorSignature4")
    public SubTranslatorSignature4_ getSubTranslatorSignature4() {
        return subTranslatorSignature4;
    }

    @JsonProperty("subTranslatorSignature4")
    public void setSubTranslatorSignature4(SubTranslatorSignature4_ subTranslatorSignature4) {
        this.subTranslatorSignature4 = subTranslatorSignature4;
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
