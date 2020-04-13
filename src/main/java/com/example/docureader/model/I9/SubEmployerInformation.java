
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
    "subEmployerInfoRow1",
    "subSec2AttestHelpSig",
    "subSec2AttestHelpEmpDate",
    "subSec2AttestHelpEmpTitle",
    "subEmployerInfoRow2",
    "subSec2AttestHelpLname",
    "subSec2AttestHelpFname",
    "subSec2AttestHelpOrgName",
    "subEmployerInfoRow3",
    "subSec2AttestHelpEmployerAddress",
    "subSec2AttestHelpCityTown",
    "subSec2AttestHelpState",
    "subSec2AttestHelpZip"
})
public class SubEmployerInformation {

    @JsonProperty("subEmployerInfoRow1")
    private SubEmployerInfoRow1 subEmployerInfoRow1;
    @JsonProperty("subSec2AttestHelpSig")
    private SubSec2AttestHelpSig subSec2AttestHelpSig;
    @JsonProperty("subSec2AttestHelpEmpDate")
    private SubSec2AttestHelpEmpDate subSec2AttestHelpEmpDate;
    @JsonProperty("subSec2AttestHelpEmpTitle")
    private SubSec2AttestHelpEmpTitle subSec2AttestHelpEmpTitle;
    @JsonProperty("subEmployerInfoRow2")
    private SubEmployerInfoRow2 subEmployerInfoRow2;
    @JsonProperty("subSec2AttestHelpLname")
    private SubSec2AttestHelpLname subSec2AttestHelpLname;
    @JsonProperty("subSec2AttestHelpFname")
    private SubSec2AttestHelpFname subSec2AttestHelpFname;
    @JsonProperty("subSec2AttestHelpOrgName")
    private SubSec2AttestHelpOrgName subSec2AttestHelpOrgName;
    @JsonProperty("subEmployerInfoRow3")
    private SubEmployerInfoRow3 subEmployerInfoRow3;
    @JsonProperty("subSec2AttestHelpEmployerAddress")
    private SubSec2AttestHelpEmployerAddress subSec2AttestHelpEmployerAddress;
    @JsonProperty("subSec2AttestHelpCityTown")
    private SubSec2AttestHelpCityTown subSec2AttestHelpCityTown;
    @JsonProperty("subSec2AttestHelpState")
    private SubSec2AttestHelpState subSec2AttestHelpState;
    @JsonProperty("subSec2AttestHelpZip")
    private SubSec2AttestHelpZip subSec2AttestHelpZip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subEmployerInfoRow1")
    public SubEmployerInfoRow1 getSubEmployerInfoRow1() {
        return subEmployerInfoRow1;
    }

    @JsonProperty("subEmployerInfoRow1")
    public void setSubEmployerInfoRow1(SubEmployerInfoRow1 subEmployerInfoRow1) {
        this.subEmployerInfoRow1 = subEmployerInfoRow1;
    }

    @JsonProperty("subSec2AttestHelpSig")
    public SubSec2AttestHelpSig getSubSec2AttestHelpSig() {
        return subSec2AttestHelpSig;
    }

    @JsonProperty("subSec2AttestHelpSig")
    public void setSubSec2AttestHelpSig(SubSec2AttestHelpSig subSec2AttestHelpSig) {
        this.subSec2AttestHelpSig = subSec2AttestHelpSig;
    }

    @JsonProperty("subSec2AttestHelpEmpDate")
    public SubSec2AttestHelpEmpDate getSubSec2AttestHelpEmpDate() {
        return subSec2AttestHelpEmpDate;
    }

    @JsonProperty("subSec2AttestHelpEmpDate")
    public void setSubSec2AttestHelpEmpDate(SubSec2AttestHelpEmpDate subSec2AttestHelpEmpDate) {
        this.subSec2AttestHelpEmpDate = subSec2AttestHelpEmpDate;
    }

    @JsonProperty("subSec2AttestHelpEmpTitle")
    public SubSec2AttestHelpEmpTitle getSubSec2AttestHelpEmpTitle() {
        return subSec2AttestHelpEmpTitle;
    }

    @JsonProperty("subSec2AttestHelpEmpTitle")
    public void setSubSec2AttestHelpEmpTitle(SubSec2AttestHelpEmpTitle subSec2AttestHelpEmpTitle) {
        this.subSec2AttestHelpEmpTitle = subSec2AttestHelpEmpTitle;
    }

    @JsonProperty("subEmployerInfoRow2")
    public SubEmployerInfoRow2 getSubEmployerInfoRow2() {
        return subEmployerInfoRow2;
    }

    @JsonProperty("subEmployerInfoRow2")
    public void setSubEmployerInfoRow2(SubEmployerInfoRow2 subEmployerInfoRow2) {
        this.subEmployerInfoRow2 = subEmployerInfoRow2;
    }

    @JsonProperty("subSec2AttestHelpLname")
    public SubSec2AttestHelpLname getSubSec2AttestHelpLname() {
        return subSec2AttestHelpLname;
    }

    @JsonProperty("subSec2AttestHelpLname")
    public void setSubSec2AttestHelpLname(SubSec2AttestHelpLname subSec2AttestHelpLname) {
        this.subSec2AttestHelpLname = subSec2AttestHelpLname;
    }

    @JsonProperty("subSec2AttestHelpFname")
    public SubSec2AttestHelpFname getSubSec2AttestHelpFname() {
        return subSec2AttestHelpFname;
    }

    @JsonProperty("subSec2AttestHelpFname")
    public void setSubSec2AttestHelpFname(SubSec2AttestHelpFname subSec2AttestHelpFname) {
        this.subSec2AttestHelpFname = subSec2AttestHelpFname;
    }

    @JsonProperty("subSec2AttestHelpOrgName")
    public SubSec2AttestHelpOrgName getSubSec2AttestHelpOrgName() {
        return subSec2AttestHelpOrgName;
    }

    @JsonProperty("subSec2AttestHelpOrgName")
    public void setSubSec2AttestHelpOrgName(SubSec2AttestHelpOrgName subSec2AttestHelpOrgName) {
        this.subSec2AttestHelpOrgName = subSec2AttestHelpOrgName;
    }

    @JsonProperty("subEmployerInfoRow3")
    public SubEmployerInfoRow3 getSubEmployerInfoRow3() {
        return subEmployerInfoRow3;
    }

    @JsonProperty("subEmployerInfoRow3")
    public void setSubEmployerInfoRow3(SubEmployerInfoRow3 subEmployerInfoRow3) {
        this.subEmployerInfoRow3 = subEmployerInfoRow3;
    }

    @JsonProperty("subSec2AttestHelpEmployerAddress")
    public SubSec2AttestHelpEmployerAddress getSubSec2AttestHelpEmployerAddress() {
        return subSec2AttestHelpEmployerAddress;
    }

    @JsonProperty("subSec2AttestHelpEmployerAddress")
    public void setSubSec2AttestHelpEmployerAddress(SubSec2AttestHelpEmployerAddress subSec2AttestHelpEmployerAddress) {
        this.subSec2AttestHelpEmployerAddress = subSec2AttestHelpEmployerAddress;
    }

    @JsonProperty("subSec2AttestHelpCityTown")
    public SubSec2AttestHelpCityTown getSubSec2AttestHelpCityTown() {
        return subSec2AttestHelpCityTown;
    }

    @JsonProperty("subSec2AttestHelpCityTown")
    public void setSubSec2AttestHelpCityTown(SubSec2AttestHelpCityTown subSec2AttestHelpCityTown) {
        this.subSec2AttestHelpCityTown = subSec2AttestHelpCityTown;
    }

    @JsonProperty("subSec2AttestHelpState")
    public SubSec2AttestHelpState getSubSec2AttestHelpState() {
        return subSec2AttestHelpState;
    }

    @JsonProperty("subSec2AttestHelpState")
    public void setSubSec2AttestHelpState(SubSec2AttestHelpState subSec2AttestHelpState) {
        this.subSec2AttestHelpState = subSec2AttestHelpState;
    }

    @JsonProperty("subSec2AttestHelpZip")
    public SubSec2AttestHelpZip getSubSec2AttestHelpZip() {
        return subSec2AttestHelpZip;
    }

    @JsonProperty("subSec2AttestHelpZip")
    public void setSubSec2AttestHelpZip(SubSec2AttestHelpZip subSec2AttestHelpZip) {
        this.subSec2AttestHelpZip = subSec2AttestHelpZip;
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
