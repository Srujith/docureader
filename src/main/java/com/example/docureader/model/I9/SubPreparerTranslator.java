
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subPreparerTranslatorSelection",
    "subPrepTransMultiSelectHelp",
    "subPrepererTranslator1"
})
public class SubPreparerTranslator {

    @JsonProperty("subPreparerTranslatorSelection")
    private SubPreparerTranslatorSelection subPreparerTranslatorSelection;
    @JsonProperty("subPrepTransMultiSelectHelp")
    private SubPrepTransMultiSelectHelp subPrepTransMultiSelectHelp;
    @JsonProperty("subPrepererTranslator1")
    private SubPrepererTranslator1 subPrepererTranslator1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subPreparerTranslatorSelection")
    public SubPreparerTranslatorSelection getSubPreparerTranslatorSelection() {
        return subPreparerTranslatorSelection;
    }

    @JsonProperty("subPreparerTranslatorSelection")
    public void setSubPreparerTranslatorSelection(SubPreparerTranslatorSelection subPreparerTranslatorSelection) {
        this.subPreparerTranslatorSelection = subPreparerTranslatorSelection;
    }

    @JsonProperty("subPrepTransMultiSelectHelp")
    public SubPrepTransMultiSelectHelp getSubPrepTransMultiSelectHelp() {
        return subPrepTransMultiSelectHelp;
    }

    @JsonProperty("subPrepTransMultiSelectHelp")
    public void setSubPrepTransMultiSelectHelp(SubPrepTransMultiSelectHelp subPrepTransMultiSelectHelp) {
        this.subPrepTransMultiSelectHelp = subPrepTransMultiSelectHelp;
    }

    @JsonProperty("subPrepererTranslator1")
    public SubPrepererTranslator1 getSubPrepererTranslator1() {
        return subPrepererTranslator1;
    }

    @JsonProperty("subPrepererTranslator1")
    public void setSubPrepererTranslator1(SubPrepererTranslator1 subPrepererTranslator1) {
        this.subPrepererTranslator1 = subPrepererTranslator1;
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
