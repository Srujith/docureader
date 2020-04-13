
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
    "subSection1Row1",
    "subSection1Row1HelpLastName",
    "subSection1Row1HelpFirstName",
    "subSection1Row1HelpMiddleInitial",
    "subSection1Row1HelpOtherNames",
    "subSection1Row2",
    "subSection1Row2HelpAddress",
    "subSection1Row2HelpAptNum",
    "subSection1Row2HelpCity",
    "subSection1Row2HelpState",
    "subSection1Row2HelpZip",
    "subSection1Row3",
    "subSection1Row3BdayHelp",
    "subSection1Row3Help",
    "subSection1Row3EmailHelp",
    "subSection1Row3PhoneHelp"
})
public class SubEmployeeInfo {

    @JsonProperty("subSection1Row1")
    private SubSection1Row1 subSection1Row1;
    @JsonProperty("subSection1Row1HelpLastName")
    private SubSection1Row1HelpLastName subSection1Row1HelpLastName;
    @JsonProperty("subSection1Row1HelpFirstName")
    private SubSection1Row1HelpFirstName subSection1Row1HelpFirstName;
    @JsonProperty("subSection1Row1HelpMiddleInitial")
    private SubSection1Row1HelpMiddleInitial subSection1Row1HelpMiddleInitial;
    @JsonProperty("subSection1Row1HelpOtherNames")
    private SubSection1Row1HelpOtherNames subSection1Row1HelpOtherNames;
    @JsonProperty("subSection1Row2")
    private SubSection1Row2 subSection1Row2;
    @JsonProperty("subSection1Row2HelpAddress")
    private SubSection1Row2HelpAddress subSection1Row2HelpAddress;
    @JsonProperty("subSection1Row2HelpAptNum")
    private SubSection1Row2HelpAptNum subSection1Row2HelpAptNum;
    @JsonProperty("subSection1Row2HelpCity")
    private SubSection1Row2HelpCity subSection1Row2HelpCity;
    @JsonProperty("subSection1Row2HelpState")
    private SubSection1Row2HelpState subSection1Row2HelpState;
    @JsonProperty("subSection1Row2HelpZip")
    private SubSection1Row2HelpZip subSection1Row2HelpZip;
    @JsonProperty("subSection1Row3")
    private SubSection1Row3 subSection1Row3;
    @JsonProperty("subSection1Row3BdayHelp")
    private SubSection1Row3BdayHelp subSection1Row3BdayHelp;
    @JsonProperty("subSection1Row3Help")
    private SubSection1Row3Help subSection1Row3Help;
    @JsonProperty("subSection1Row3EmailHelp")
    private SubSection1Row3EmailHelp subSection1Row3EmailHelp;
    @JsonProperty("subSection1Row3PhoneHelp")
    private SubSection1Row3PhoneHelp subSection1Row3PhoneHelp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subSection1Row1")
    public SubSection1Row1 getSubSection1Row1() {
        return subSection1Row1;
    }

    @JsonProperty("subSection1Row1")
    public void setSubSection1Row1(SubSection1Row1 subSection1Row1) {
        this.subSection1Row1 = subSection1Row1;
    }

    @JsonProperty("subSection1Row1HelpLastName")
    public SubSection1Row1HelpLastName getSubSection1Row1HelpLastName() {
        return subSection1Row1HelpLastName;
    }

    @JsonProperty("subSection1Row1HelpLastName")
    public void setSubSection1Row1HelpLastName(SubSection1Row1HelpLastName subSection1Row1HelpLastName) {
        this.subSection1Row1HelpLastName = subSection1Row1HelpLastName;
    }

    @JsonProperty("subSection1Row1HelpFirstName")
    public SubSection1Row1HelpFirstName getSubSection1Row1HelpFirstName() {
        return subSection1Row1HelpFirstName;
    }

    @JsonProperty("subSection1Row1HelpFirstName")
    public void setSubSection1Row1HelpFirstName(SubSection1Row1HelpFirstName subSection1Row1HelpFirstName) {
        this.subSection1Row1HelpFirstName = subSection1Row1HelpFirstName;
    }

    @JsonProperty("subSection1Row1HelpMiddleInitial")
    public SubSection1Row1HelpMiddleInitial getSubSection1Row1HelpMiddleInitial() {
        return subSection1Row1HelpMiddleInitial;
    }

    @JsonProperty("subSection1Row1HelpMiddleInitial")
    public void setSubSection1Row1HelpMiddleInitial(SubSection1Row1HelpMiddleInitial subSection1Row1HelpMiddleInitial) {
        this.subSection1Row1HelpMiddleInitial = subSection1Row1HelpMiddleInitial;
    }

    @JsonProperty("subSection1Row1HelpOtherNames")
    public SubSection1Row1HelpOtherNames getSubSection1Row1HelpOtherNames() {
        return subSection1Row1HelpOtherNames;
    }

    @JsonProperty("subSection1Row1HelpOtherNames")
    public void setSubSection1Row1HelpOtherNames(SubSection1Row1HelpOtherNames subSection1Row1HelpOtherNames) {
        this.subSection1Row1HelpOtherNames = subSection1Row1HelpOtherNames;
    }

    @JsonProperty("subSection1Row2")
    public SubSection1Row2 getSubSection1Row2() {
        return subSection1Row2;
    }

    @JsonProperty("subSection1Row2")
    public void setSubSection1Row2(SubSection1Row2 subSection1Row2) {
        this.subSection1Row2 = subSection1Row2;
    }

    @JsonProperty("subSection1Row2HelpAddress")
    public SubSection1Row2HelpAddress getSubSection1Row2HelpAddress() {
        return subSection1Row2HelpAddress;
    }

    @JsonProperty("subSection1Row2HelpAddress")
    public void setSubSection1Row2HelpAddress(SubSection1Row2HelpAddress subSection1Row2HelpAddress) {
        this.subSection1Row2HelpAddress = subSection1Row2HelpAddress;
    }

    @JsonProperty("subSection1Row2HelpAptNum")
    public SubSection1Row2HelpAptNum getSubSection1Row2HelpAptNum() {
        return subSection1Row2HelpAptNum;
    }

    @JsonProperty("subSection1Row2HelpAptNum")
    public void setSubSection1Row2HelpAptNum(SubSection1Row2HelpAptNum subSection1Row2HelpAptNum) {
        this.subSection1Row2HelpAptNum = subSection1Row2HelpAptNum;
    }

    @JsonProperty("subSection1Row2HelpCity")
    public SubSection1Row2HelpCity getSubSection1Row2HelpCity() {
        return subSection1Row2HelpCity;
    }

    @JsonProperty("subSection1Row2HelpCity")
    public void setSubSection1Row2HelpCity(SubSection1Row2HelpCity subSection1Row2HelpCity) {
        this.subSection1Row2HelpCity = subSection1Row2HelpCity;
    }

    @JsonProperty("subSection1Row2HelpState")
    public SubSection1Row2HelpState getSubSection1Row2HelpState() {
        return subSection1Row2HelpState;
    }

    @JsonProperty("subSection1Row2HelpState")
    public void setSubSection1Row2HelpState(SubSection1Row2HelpState subSection1Row2HelpState) {
        this.subSection1Row2HelpState = subSection1Row2HelpState;
    }

    @JsonProperty("subSection1Row2HelpZip")
    public SubSection1Row2HelpZip getSubSection1Row2HelpZip() {
        return subSection1Row2HelpZip;
    }

    @JsonProperty("subSection1Row2HelpZip")
    public void setSubSection1Row2HelpZip(SubSection1Row2HelpZip subSection1Row2HelpZip) {
        this.subSection1Row2HelpZip = subSection1Row2HelpZip;
    }

    @JsonProperty("subSection1Row3")
    public SubSection1Row3 getSubSection1Row3() {
        return subSection1Row3;
    }

    @JsonProperty("subSection1Row3")
    public void setSubSection1Row3(SubSection1Row3 subSection1Row3) {
        this.subSection1Row3 = subSection1Row3;
    }

    @JsonProperty("subSection1Row3BdayHelp")
    public SubSection1Row3BdayHelp getSubSection1Row3BdayHelp() {
        return subSection1Row3BdayHelp;
    }

    @JsonProperty("subSection1Row3BdayHelp")
    public void setSubSection1Row3BdayHelp(SubSection1Row3BdayHelp subSection1Row3BdayHelp) {
        this.subSection1Row3BdayHelp = subSection1Row3BdayHelp;
    }

    @JsonProperty("subSection1Row3Help")
    public SubSection1Row3Help getSubSection1Row3Help() {
        return subSection1Row3Help;
    }

    @JsonProperty("subSection1Row3Help")
    public void setSubSection1Row3Help(SubSection1Row3Help subSection1Row3Help) {
        this.subSection1Row3Help = subSection1Row3Help;
    }

    @JsonProperty("subSection1Row3EmailHelp")
    public SubSection1Row3EmailHelp getSubSection1Row3EmailHelp() {
        return subSection1Row3EmailHelp;
    }

    @JsonProperty("subSection1Row3EmailHelp")
    public void setSubSection1Row3EmailHelp(SubSection1Row3EmailHelp subSection1Row3EmailHelp) {
        this.subSection1Row3EmailHelp = subSection1Row3EmailHelp;
    }

    @JsonProperty("subSection1Row3PhoneHelp")
    public SubSection1Row3PhoneHelp getSubSection1Row3PhoneHelp() {
        return subSection1Row3PhoneHelp;
    }

    @JsonProperty("subSection1Row3PhoneHelp")
    public void setSubSection1Row3PhoneHelp(SubSection1Row3PhoneHelp subSection1Row3PhoneHelp) {
        this.subSection1Row3PhoneHelp = subSection1Row3PhoneHelp;
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
