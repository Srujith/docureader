
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
    "subEmployeeName",
    "subSection2EmployeeNameHelp",
    "subSection2LastNameHelp",
    "subSection2FirstNameHelp",
    "subSection2MIHelp",
    "subSection2CitHelp",
    "subDocumentsHeading",
    "subVerificationListsBorder",
    "subCertification"
})
public class SubSection2 {

    @JsonProperty("subEmployeeName")
    private SubEmployeeName_ subEmployeeName;
    @JsonProperty("subSection2EmployeeNameHelp")
    private SubSection2EmployeeNameHelp subSection2EmployeeNameHelp;
    @JsonProperty("subSection2LastNameHelp")
    private SubSection2LastNameHelp subSection2LastNameHelp;
    @JsonProperty("subSection2FirstNameHelp")
    private SubSection2FirstNameHelp subSection2FirstNameHelp;
    @JsonProperty("subSection2MIHelp")
    private SubSection2MIHelp subSection2MIHelp;
    @JsonProperty("subSection2CitHelp")
    private SubSection2CitHelp subSection2CitHelp;
    @JsonProperty("subDocumentsHeading")
    private SubDocumentsHeading subDocumentsHeading;
    @JsonProperty("subVerificationListsBorder")
    private SubVerificationListsBorder subVerificationListsBorder;
    @JsonProperty("subCertification")
    private SubCertification subCertification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subEmployeeName")
    public SubEmployeeName_ getSubEmployeeName() {
        return subEmployeeName;
    }

    @JsonProperty("subEmployeeName")
    public void setSubEmployeeName(SubEmployeeName_ subEmployeeName) {
        this.subEmployeeName = subEmployeeName;
    }

    @JsonProperty("subSection2EmployeeNameHelp")
    public SubSection2EmployeeNameHelp getSubSection2EmployeeNameHelp() {
        return subSection2EmployeeNameHelp;
    }

    @JsonProperty("subSection2EmployeeNameHelp")
    public void setSubSection2EmployeeNameHelp(SubSection2EmployeeNameHelp subSection2EmployeeNameHelp) {
        this.subSection2EmployeeNameHelp = subSection2EmployeeNameHelp;
    }

    @JsonProperty("subSection2LastNameHelp")
    public SubSection2LastNameHelp getSubSection2LastNameHelp() {
        return subSection2LastNameHelp;
    }

    @JsonProperty("subSection2LastNameHelp")
    public void setSubSection2LastNameHelp(SubSection2LastNameHelp subSection2LastNameHelp) {
        this.subSection2LastNameHelp = subSection2LastNameHelp;
    }

    @JsonProperty("subSection2FirstNameHelp")
    public SubSection2FirstNameHelp getSubSection2FirstNameHelp() {
        return subSection2FirstNameHelp;
    }

    @JsonProperty("subSection2FirstNameHelp")
    public void setSubSection2FirstNameHelp(SubSection2FirstNameHelp subSection2FirstNameHelp) {
        this.subSection2FirstNameHelp = subSection2FirstNameHelp;
    }

    @JsonProperty("subSection2MIHelp")
    public SubSection2MIHelp getSubSection2MIHelp() {
        return subSection2MIHelp;
    }

    @JsonProperty("subSection2MIHelp")
    public void setSubSection2MIHelp(SubSection2MIHelp subSection2MIHelp) {
        this.subSection2MIHelp = subSection2MIHelp;
    }

    @JsonProperty("subSection2CitHelp")
    public SubSection2CitHelp getSubSection2CitHelp() {
        return subSection2CitHelp;
    }

    @JsonProperty("subSection2CitHelp")
    public void setSubSection2CitHelp(SubSection2CitHelp subSection2CitHelp) {
        this.subSection2CitHelp = subSection2CitHelp;
    }

    @JsonProperty("subDocumentsHeading")
    public SubDocumentsHeading getSubDocumentsHeading() {
        return subDocumentsHeading;
    }

    @JsonProperty("subDocumentsHeading")
    public void setSubDocumentsHeading(SubDocumentsHeading subDocumentsHeading) {
        this.subDocumentsHeading = subDocumentsHeading;
    }

    @JsonProperty("subVerificationListsBorder")
    public SubVerificationListsBorder getSubVerificationListsBorder() {
        return subVerificationListsBorder;
    }

    @JsonProperty("subVerificationListsBorder")
    public void setSubVerificationListsBorder(SubVerificationListsBorder subVerificationListsBorder) {
        this.subVerificationListsBorder = subVerificationListsBorder;
    }

    @JsonProperty("subCertification")
    public SubCertification getSubCertification() {
        return subCertification;
    }

    @JsonProperty("subCertification")
    public void setSubCertification(SubCertification subCertification) {
        this.subCertification = subCertification;
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
