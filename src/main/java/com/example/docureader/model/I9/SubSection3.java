
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
    "subSection3LastNameHelp",
    "subSection3FirstNameHelp",
    "subSection3MIHelp",
    "subSec3EmpSec1Spacer",
    "subReverificationRehire",
    "subSpacer",
    "subSEction3PartC",
    "subSec3HelpDocTitle",
    "subSec3HelpDocNum",
    "subSec3HelpDocExpDate",
    "subAttestSignature",
    "subSec3HelpEmpSig",
    "subSec3HelpEmpSigDate",
    "subSec3HelpEmpSigName",
    "subSec3End"
})
public class SubSection3 {

    @JsonProperty("subEmployeeName")
    private SubEmployeeName__ subEmployeeName;
    @JsonProperty("subSection3LastNameHelp")
    private SubSection3LastNameHelp subSection3LastNameHelp;
    @JsonProperty("subSection3FirstNameHelp")
    private SubSection3FirstNameHelp subSection3FirstNameHelp;
    @JsonProperty("subSection3MIHelp")
    private SubSection3MIHelp subSection3MIHelp;
    @JsonProperty("subSec3EmpSec1Spacer")
    private SubSec3EmpSec1Spacer subSec3EmpSec1Spacer;
    @JsonProperty("subReverificationRehire")
    private SubReverificationRehire subReverificationRehire;
    @JsonProperty("subSpacer")
    private SubSpacer_ subSpacer;
    @JsonProperty("subSEction3PartC")
    private SubSEction3PartC subSEction3PartC;
    @JsonProperty("subSec3HelpDocTitle")
    private SubSec3HelpDocTitle subSec3HelpDocTitle;
    @JsonProperty("subSec3HelpDocNum")
    private SubSec3HelpDocNum subSec3HelpDocNum;
    @JsonProperty("subSec3HelpDocExpDate")
    private SubSec3HelpDocExpDate subSec3HelpDocExpDate;
    @JsonProperty("subAttestSignature")
    private SubAttestSignature subAttestSignature;
    @JsonProperty("subSec3HelpEmpSig")
    private SubSec3HelpEmpSig subSec3HelpEmpSig;
    @JsonProperty("subSec3HelpEmpSigDate")
    private SubSec3HelpEmpSigDate subSec3HelpEmpSigDate;
    @JsonProperty("subSec3HelpEmpSigName")
    private SubSec3HelpEmpSigName subSec3HelpEmpSigName;
    @JsonProperty("subSec3End")
    private SubSec3End subSec3End;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subEmployeeName")
    public SubEmployeeName__ getSubEmployeeName() {
        return subEmployeeName;
    }

    @JsonProperty("subEmployeeName")
    public void setSubEmployeeName(SubEmployeeName__ subEmployeeName) {
        this.subEmployeeName = subEmployeeName;
    }

    @JsonProperty("subSection3LastNameHelp")
    public SubSection3LastNameHelp getSubSection3LastNameHelp() {
        return subSection3LastNameHelp;
    }

    @JsonProperty("subSection3LastNameHelp")
    public void setSubSection3LastNameHelp(SubSection3LastNameHelp subSection3LastNameHelp) {
        this.subSection3LastNameHelp = subSection3LastNameHelp;
    }

    @JsonProperty("subSection3FirstNameHelp")
    public SubSection3FirstNameHelp getSubSection3FirstNameHelp() {
        return subSection3FirstNameHelp;
    }

    @JsonProperty("subSection3FirstNameHelp")
    public void setSubSection3FirstNameHelp(SubSection3FirstNameHelp subSection3FirstNameHelp) {
        this.subSection3FirstNameHelp = subSection3FirstNameHelp;
    }

    @JsonProperty("subSection3MIHelp")
    public SubSection3MIHelp getSubSection3MIHelp() {
        return subSection3MIHelp;
    }

    @JsonProperty("subSection3MIHelp")
    public void setSubSection3MIHelp(SubSection3MIHelp subSection3MIHelp) {
        this.subSection3MIHelp = subSection3MIHelp;
    }

    @JsonProperty("subSec3EmpSec1Spacer")
    public SubSec3EmpSec1Spacer getSubSec3EmpSec1Spacer() {
        return subSec3EmpSec1Spacer;
    }

    @JsonProperty("subSec3EmpSec1Spacer")
    public void setSubSec3EmpSec1Spacer(SubSec3EmpSec1Spacer subSec3EmpSec1Spacer) {
        this.subSec3EmpSec1Spacer = subSec3EmpSec1Spacer;
    }

    @JsonProperty("subReverificationRehire")
    public SubReverificationRehire getSubReverificationRehire() {
        return subReverificationRehire;
    }

    @JsonProperty("subReverificationRehire")
    public void setSubReverificationRehire(SubReverificationRehire subReverificationRehire) {
        this.subReverificationRehire = subReverificationRehire;
    }

    @JsonProperty("subSpacer")
    public SubSpacer_ getSubSpacer() {
        return subSpacer;
    }

    @JsonProperty("subSpacer")
    public void setSubSpacer(SubSpacer_ subSpacer) {
        this.subSpacer = subSpacer;
    }

    @JsonProperty("subSEction3PartC")
    public SubSEction3PartC getSubSEction3PartC() {
        return subSEction3PartC;
    }

    @JsonProperty("subSEction3PartC")
    public void setSubSEction3PartC(SubSEction3PartC subSEction3PartC) {
        this.subSEction3PartC = subSEction3PartC;
    }

    @JsonProperty("subSec3HelpDocTitle")
    public SubSec3HelpDocTitle getSubSec3HelpDocTitle() {
        return subSec3HelpDocTitle;
    }

    @JsonProperty("subSec3HelpDocTitle")
    public void setSubSec3HelpDocTitle(SubSec3HelpDocTitle subSec3HelpDocTitle) {
        this.subSec3HelpDocTitle = subSec3HelpDocTitle;
    }

    @JsonProperty("subSec3HelpDocNum")
    public SubSec3HelpDocNum getSubSec3HelpDocNum() {
        return subSec3HelpDocNum;
    }

    @JsonProperty("subSec3HelpDocNum")
    public void setSubSec3HelpDocNum(SubSec3HelpDocNum subSec3HelpDocNum) {
        this.subSec3HelpDocNum = subSec3HelpDocNum;
    }

    @JsonProperty("subSec3HelpDocExpDate")
    public SubSec3HelpDocExpDate getSubSec3HelpDocExpDate() {
        return subSec3HelpDocExpDate;
    }

    @JsonProperty("subSec3HelpDocExpDate")
    public void setSubSec3HelpDocExpDate(SubSec3HelpDocExpDate subSec3HelpDocExpDate) {
        this.subSec3HelpDocExpDate = subSec3HelpDocExpDate;
    }

    @JsonProperty("subAttestSignature")
    public SubAttestSignature getSubAttestSignature() {
        return subAttestSignature;
    }

    @JsonProperty("subAttestSignature")
    public void setSubAttestSignature(SubAttestSignature subAttestSignature) {
        this.subAttestSignature = subAttestSignature;
    }

    @JsonProperty("subSec3HelpEmpSig")
    public SubSec3HelpEmpSig getSubSec3HelpEmpSig() {
        return subSec3HelpEmpSig;
    }

    @JsonProperty("subSec3HelpEmpSig")
    public void setSubSec3HelpEmpSig(SubSec3HelpEmpSig subSec3HelpEmpSig) {
        this.subSec3HelpEmpSig = subSec3HelpEmpSig;
    }

    @JsonProperty("subSec3HelpEmpSigDate")
    public SubSec3HelpEmpSigDate getSubSec3HelpEmpSigDate() {
        return subSec3HelpEmpSigDate;
    }

    @JsonProperty("subSec3HelpEmpSigDate")
    public void setSubSec3HelpEmpSigDate(SubSec3HelpEmpSigDate subSec3HelpEmpSigDate) {
        this.subSec3HelpEmpSigDate = subSec3HelpEmpSigDate;
    }

    @JsonProperty("subSec3HelpEmpSigName")
    public SubSec3HelpEmpSigName getSubSec3HelpEmpSigName() {
        return subSec3HelpEmpSigName;
    }

    @JsonProperty("subSec3HelpEmpSigName")
    public void setSubSec3HelpEmpSigName(SubSec3HelpEmpSigName subSec3HelpEmpSigName) {
        this.subSec3HelpEmpSigName = subSec3HelpEmpSigName;
    }

    @JsonProperty("subSec3End")
    public SubSec3End getSubSec3End() {
        return subSec3End;
    }

    @JsonProperty("subSec3End")
    public void setSubSec3End(SubSec3End subSec3End) {
        this.subSec3End = subSec3End;
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
