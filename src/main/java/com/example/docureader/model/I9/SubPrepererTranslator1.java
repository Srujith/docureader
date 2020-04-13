
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subTranslatorSignature"
})
public class SubPrepererTranslator1 {

    @JsonProperty("subTranslatorSignature")
    private SubTranslatorSignature subTranslatorSignature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subTranslatorSignature")
    public SubTranslatorSignature getSubTranslatorSignature() {
        return subTranslatorSignature;
    }

    @JsonProperty("subTranslatorSignature")
    public void setSubTranslatorSignature(SubTranslatorSignature subTranslatorSignature) {
        this.subTranslatorSignature = subTranslatorSignature;
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
