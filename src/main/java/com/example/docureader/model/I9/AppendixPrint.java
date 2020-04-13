
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subEmployeeName",
    "subSection2EmployeeNameHelpMultiPrep",
    "subPrepererTranslatorRepeat"
})
public class AppendixPrint {

    @JsonProperty("subEmployeeName")
    private SubEmployeeName___ subEmployeeName;
    @JsonProperty("subSection2EmployeeNameHelpMultiPrep")
    private SubSection2EmployeeNameHelpMultiPrep_ subSection2EmployeeNameHelpMultiPrep;
    @JsonProperty("subPrepererTranslatorRepeat")
    private SubPrepererTranslatorRepeat_ subPrepererTranslatorRepeat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subEmployeeName")
    public SubEmployeeName___ getSubEmployeeName() {
        return subEmployeeName;
    }

    @JsonProperty("subEmployeeName")
    public void setSubEmployeeName(SubEmployeeName___ subEmployeeName) {
        this.subEmployeeName = subEmployeeName;
    }

    @JsonProperty("subSection2EmployeeNameHelpMultiPrep")
    public SubSection2EmployeeNameHelpMultiPrep_ getSubSection2EmployeeNameHelpMultiPrep() {
        return subSection2EmployeeNameHelpMultiPrep;
    }

    @JsonProperty("subSection2EmployeeNameHelpMultiPrep")
    public void setSubSection2EmployeeNameHelpMultiPrep(SubSection2EmployeeNameHelpMultiPrep_ subSection2EmployeeNameHelpMultiPrep) {
        this.subSection2EmployeeNameHelpMultiPrep = subSection2EmployeeNameHelpMultiPrep;
    }

    @JsonProperty("subPrepererTranslatorRepeat")
    public SubPrepererTranslatorRepeat_ getSubPrepererTranslatorRepeat() {
        return subPrepererTranslatorRepeat;
    }

    @JsonProperty("subPrepererTranslatorRepeat")
    public void setSubPrepererTranslatorRepeat(SubPrepererTranslatorRepeat_ subPrepererTranslatorRepeat) {
        this.subPrepererTranslatorRepeat = subPrepererTranslatorRepeat;
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
