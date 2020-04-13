
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
    "subCitizenshipStatus",
    "subSection1CitizenshipHelpCitizen",
    "subSection1CitizenshipHelpNonCitizen",
    "subSection1CitizenshipHelpPermResident",
    "subSection1CitizenshipHelpAlienNo",
    "subSection1CitizenshipHelpAuthWork",
    "subSection1CitizenshipHelpAlienExpDate",
    "subAuthorizedAlien",
    "subSection1AliensAuthorizedToWorkHelpAlienRegNum",
    "subSection1AliensAuthorizedToWorkHelpI94",
    "subSection1AliensAuthorizedToWorkHelpPassportNum",
    "subSection1AliensAuthorizedToWorkHelpCountry",
    "subEmployeeSignature",
    "subEmployeeSignatureHelp",
    "subEmployeeSignatureDateHelp",
    "subPreparerTranslator",
    "appendixScreen",
    "subEndSection1"
})
public class SubSection1Bottom {

    @JsonProperty("subCitizenshipStatus")
    private SubCitizenshipStatus subCitizenshipStatus;
    @JsonProperty("subSection1CitizenshipHelpCitizen")
    private SubSection1CitizenshipHelpCitizen subSection1CitizenshipHelpCitizen;
    @JsonProperty("subSection1CitizenshipHelpNonCitizen")
    private SubSection1CitizenshipHelpNonCitizen subSection1CitizenshipHelpNonCitizen;
    @JsonProperty("subSection1CitizenshipHelpPermResident")
    private SubSection1CitizenshipHelpPermResident subSection1CitizenshipHelpPermResident;
    @JsonProperty("subSection1CitizenshipHelpAlienNo")
    private SubSection1CitizenshipHelpAlienNo subSection1CitizenshipHelpAlienNo;
    @JsonProperty("subSection1CitizenshipHelpAuthWork")
    private SubSection1CitizenshipHelpAuthWork subSection1CitizenshipHelpAuthWork;
    @JsonProperty("subSection1CitizenshipHelpAlienExpDate")
    private SubSection1CitizenshipHelpAlienExpDate subSection1CitizenshipHelpAlienExpDate;
    @JsonProperty("subAuthorizedAlien")
    private SubAuthorizedAlien subAuthorizedAlien;
    @JsonProperty("subSection1AliensAuthorizedToWorkHelpAlienRegNum")
    private SubSection1AliensAuthorizedToWorkHelpAlienRegNum subSection1AliensAuthorizedToWorkHelpAlienRegNum;
    @JsonProperty("subSection1AliensAuthorizedToWorkHelpI94")
    private SubSection1AliensAuthorizedToWorkHelpI94 subSection1AliensAuthorizedToWorkHelpI94;
    @JsonProperty("subSection1AliensAuthorizedToWorkHelpPassportNum")
    private SubSection1AliensAuthorizedToWorkHelpPassportNum subSection1AliensAuthorizedToWorkHelpPassportNum;
    @JsonProperty("subSection1AliensAuthorizedToWorkHelpCountry")
    private SubSection1AliensAuthorizedToWorkHelpCountry subSection1AliensAuthorizedToWorkHelpCountry;
    @JsonProperty("subEmployeeSignature")
    private SubEmployeeSignature subEmployeeSignature;
    @JsonProperty("subEmployeeSignatureHelp")
    private SubEmployeeSignatureHelp subEmployeeSignatureHelp;
    @JsonProperty("subEmployeeSignatureDateHelp")
    private SubEmployeeSignatureDateHelp subEmployeeSignatureDateHelp;
    @JsonProperty("subPreparerTranslator")
    private SubPreparerTranslator subPreparerTranslator;
    @JsonProperty("appendixScreen")
    private AppendixScreen appendixScreen;
    @JsonProperty("subEndSection1")
    private SubEndSection1 subEndSection1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subCitizenshipStatus")
    public SubCitizenshipStatus getSubCitizenshipStatus() {
        return subCitizenshipStatus;
    }

    @JsonProperty("subCitizenshipStatus")
    public void setSubCitizenshipStatus(SubCitizenshipStatus subCitizenshipStatus) {
        this.subCitizenshipStatus = subCitizenshipStatus;
    }

    @JsonProperty("subSection1CitizenshipHelpCitizen")
    public SubSection1CitizenshipHelpCitizen getSubSection1CitizenshipHelpCitizen() {
        return subSection1CitizenshipHelpCitizen;
    }

    @JsonProperty("subSection1CitizenshipHelpCitizen")
    public void setSubSection1CitizenshipHelpCitizen(SubSection1CitizenshipHelpCitizen subSection1CitizenshipHelpCitizen) {
        this.subSection1CitizenshipHelpCitizen = subSection1CitizenshipHelpCitizen;
    }

    @JsonProperty("subSection1CitizenshipHelpNonCitizen")
    public SubSection1CitizenshipHelpNonCitizen getSubSection1CitizenshipHelpNonCitizen() {
        return subSection1CitizenshipHelpNonCitizen;
    }

    @JsonProperty("subSection1CitizenshipHelpNonCitizen")
    public void setSubSection1CitizenshipHelpNonCitizen(SubSection1CitizenshipHelpNonCitizen subSection1CitizenshipHelpNonCitizen) {
        this.subSection1CitizenshipHelpNonCitizen = subSection1CitizenshipHelpNonCitizen;
    }

    @JsonProperty("subSection1CitizenshipHelpPermResident")
    public SubSection1CitizenshipHelpPermResident getSubSection1CitizenshipHelpPermResident() {
        return subSection1CitizenshipHelpPermResident;
    }

    @JsonProperty("subSection1CitizenshipHelpPermResident")
    public void setSubSection1CitizenshipHelpPermResident(SubSection1CitizenshipHelpPermResident subSection1CitizenshipHelpPermResident) {
        this.subSection1CitizenshipHelpPermResident = subSection1CitizenshipHelpPermResident;
    }

    @JsonProperty("subSection1CitizenshipHelpAlienNo")
    public SubSection1CitizenshipHelpAlienNo getSubSection1CitizenshipHelpAlienNo() {
        return subSection1CitizenshipHelpAlienNo;
    }

    @JsonProperty("subSection1CitizenshipHelpAlienNo")
    public void setSubSection1CitizenshipHelpAlienNo(SubSection1CitizenshipHelpAlienNo subSection1CitizenshipHelpAlienNo) {
        this.subSection1CitizenshipHelpAlienNo = subSection1CitizenshipHelpAlienNo;
    }

    @JsonProperty("subSection1CitizenshipHelpAuthWork")
    public SubSection1CitizenshipHelpAuthWork getSubSection1CitizenshipHelpAuthWork() {
        return subSection1CitizenshipHelpAuthWork;
    }

    @JsonProperty("subSection1CitizenshipHelpAuthWork")
    public void setSubSection1CitizenshipHelpAuthWork(SubSection1CitizenshipHelpAuthWork subSection1CitizenshipHelpAuthWork) {
        this.subSection1CitizenshipHelpAuthWork = subSection1CitizenshipHelpAuthWork;
    }

    @JsonProperty("subSection1CitizenshipHelpAlienExpDate")
    public SubSection1CitizenshipHelpAlienExpDate getSubSection1CitizenshipHelpAlienExpDate() {
        return subSection1CitizenshipHelpAlienExpDate;
    }

    @JsonProperty("subSection1CitizenshipHelpAlienExpDate")
    public void setSubSection1CitizenshipHelpAlienExpDate(SubSection1CitizenshipHelpAlienExpDate subSection1CitizenshipHelpAlienExpDate) {
        this.subSection1CitizenshipHelpAlienExpDate = subSection1CitizenshipHelpAlienExpDate;
    }

    @JsonProperty("subAuthorizedAlien")
    public SubAuthorizedAlien getSubAuthorizedAlien() {
        return subAuthorizedAlien;
    }

    @JsonProperty("subAuthorizedAlien")
    public void setSubAuthorizedAlien(SubAuthorizedAlien subAuthorizedAlien) {
        this.subAuthorizedAlien = subAuthorizedAlien;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpAlienRegNum")
    public SubSection1AliensAuthorizedToWorkHelpAlienRegNum getSubSection1AliensAuthorizedToWorkHelpAlienRegNum() {
        return subSection1AliensAuthorizedToWorkHelpAlienRegNum;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpAlienRegNum")
    public void setSubSection1AliensAuthorizedToWorkHelpAlienRegNum(SubSection1AliensAuthorizedToWorkHelpAlienRegNum subSection1AliensAuthorizedToWorkHelpAlienRegNum) {
        this.subSection1AliensAuthorizedToWorkHelpAlienRegNum = subSection1AliensAuthorizedToWorkHelpAlienRegNum;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpI94")
    public SubSection1AliensAuthorizedToWorkHelpI94 getSubSection1AliensAuthorizedToWorkHelpI94() {
        return subSection1AliensAuthorizedToWorkHelpI94;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpI94")
    public void setSubSection1AliensAuthorizedToWorkHelpI94(SubSection1AliensAuthorizedToWorkHelpI94 subSection1AliensAuthorizedToWorkHelpI94) {
        this.subSection1AliensAuthorizedToWorkHelpI94 = subSection1AliensAuthorizedToWorkHelpI94;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpPassportNum")
    public SubSection1AliensAuthorizedToWorkHelpPassportNum getSubSection1AliensAuthorizedToWorkHelpPassportNum() {
        return subSection1AliensAuthorizedToWorkHelpPassportNum;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpPassportNum")
    public void setSubSection1AliensAuthorizedToWorkHelpPassportNum(SubSection1AliensAuthorizedToWorkHelpPassportNum subSection1AliensAuthorizedToWorkHelpPassportNum) {
        this.subSection1AliensAuthorizedToWorkHelpPassportNum = subSection1AliensAuthorizedToWorkHelpPassportNum;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpCountry")
    public SubSection1AliensAuthorizedToWorkHelpCountry getSubSection1AliensAuthorizedToWorkHelpCountry() {
        return subSection1AliensAuthorizedToWorkHelpCountry;
    }

    @JsonProperty("subSection1AliensAuthorizedToWorkHelpCountry")
    public void setSubSection1AliensAuthorizedToWorkHelpCountry(SubSection1AliensAuthorizedToWorkHelpCountry subSection1AliensAuthorizedToWorkHelpCountry) {
        this.subSection1AliensAuthorizedToWorkHelpCountry = subSection1AliensAuthorizedToWorkHelpCountry;
    }

    @JsonProperty("subEmployeeSignature")
    public SubEmployeeSignature getSubEmployeeSignature() {
        return subEmployeeSignature;
    }

    @JsonProperty("subEmployeeSignature")
    public void setSubEmployeeSignature(SubEmployeeSignature subEmployeeSignature) {
        this.subEmployeeSignature = subEmployeeSignature;
    }

    @JsonProperty("subEmployeeSignatureHelp")
    public SubEmployeeSignatureHelp getSubEmployeeSignatureHelp() {
        return subEmployeeSignatureHelp;
    }

    @JsonProperty("subEmployeeSignatureHelp")
    public void setSubEmployeeSignatureHelp(SubEmployeeSignatureHelp subEmployeeSignatureHelp) {
        this.subEmployeeSignatureHelp = subEmployeeSignatureHelp;
    }

    @JsonProperty("subEmployeeSignatureDateHelp")
    public SubEmployeeSignatureDateHelp getSubEmployeeSignatureDateHelp() {
        return subEmployeeSignatureDateHelp;
    }

    @JsonProperty("subEmployeeSignatureDateHelp")
    public void setSubEmployeeSignatureDateHelp(SubEmployeeSignatureDateHelp subEmployeeSignatureDateHelp) {
        this.subEmployeeSignatureDateHelp = subEmployeeSignatureDateHelp;
    }

    @JsonProperty("subPreparerTranslator")
    public SubPreparerTranslator getSubPreparerTranslator() {
        return subPreparerTranslator;
    }

    @JsonProperty("subPreparerTranslator")
    public void setSubPreparerTranslator(SubPreparerTranslator subPreparerTranslator) {
        this.subPreparerTranslator = subPreparerTranslator;
    }

    @JsonProperty("appendixScreen")
    public AppendixScreen getAppendixScreen() {
        return appendixScreen;
    }

    @JsonProperty("appendixScreen")
    public void setAppendixScreen(AppendixScreen appendixScreen) {
        this.appendixScreen = appendixScreen;
    }

    @JsonProperty("subEndSection1")
    public SubEndSection1 getSubEndSection1() {
        return subEndSection1;
    }

    @JsonProperty("subEndSection1")
    public void setSubEndSection1(SubEndSection1 subEndSection1) {
        this.subEndSection1 = subEndSection1;
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
