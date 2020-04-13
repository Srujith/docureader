
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
    "subRow1",
    "subPrepTransRow1HelpSig",
    "subPrepTransRow1HelpDate",
    "subRow2",
    "subRow2PreparerTranslatorHelpLastName",
    "subRow2PreparerTranslatorHelpFirstName",
    "subRow3",
    "subRow3PreparerTranslatorHelpAddress",
    "subRow3PreparerTranslatorHelpCity",
    "subRow3PreparerTranslatorHelpState",
    "subRow3PreparerTranslatorHelpZip"
})
public class SubTranslatorSignature {

    @JsonProperty("subRow1")
    private SubRow1 subRow1;
    @JsonProperty("subPrepTransRow1HelpSig")
    private SubPrepTransRow1HelpSig subPrepTransRow1HelpSig;
    @JsonProperty("subPrepTransRow1HelpDate")
    private SubPrepTransRow1HelpDate subPrepTransRow1HelpDate;
    @JsonProperty("subRow2")
    private SubRow2 subRow2;
    @JsonProperty("subRow2PreparerTranslatorHelpLastName")
    private SubRow2PreparerTranslatorHelpLastName subRow2PreparerTranslatorHelpLastName;
    @JsonProperty("subRow2PreparerTranslatorHelpFirstName")
    private SubRow2PreparerTranslatorHelpFirstName subRow2PreparerTranslatorHelpFirstName;
    @JsonProperty("subRow3")
    private SubRow3 subRow3;
    @JsonProperty("subRow3PreparerTranslatorHelpAddress")
    private SubRow3PreparerTranslatorHelpAddress subRow3PreparerTranslatorHelpAddress;
    @JsonProperty("subRow3PreparerTranslatorHelpCity")
    private SubRow3PreparerTranslatorHelpCity subRow3PreparerTranslatorHelpCity;
    @JsonProperty("subRow3PreparerTranslatorHelpState")
    private SubRow3PreparerTranslatorHelpState subRow3PreparerTranslatorHelpState;
    @JsonProperty("subRow3PreparerTranslatorHelpZip")
    private SubRow3PreparerTranslatorHelpZip subRow3PreparerTranslatorHelpZip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subRow1")
    public SubRow1 getSubRow1() {
        return subRow1;
    }

    @JsonProperty("subRow1")
    public void setSubRow1(SubRow1 subRow1) {
        this.subRow1 = subRow1;
    }

    @JsonProperty("subPrepTransRow1HelpSig")
    public SubPrepTransRow1HelpSig getSubPrepTransRow1HelpSig() {
        return subPrepTransRow1HelpSig;
    }

    @JsonProperty("subPrepTransRow1HelpSig")
    public void setSubPrepTransRow1HelpSig(SubPrepTransRow1HelpSig subPrepTransRow1HelpSig) {
        this.subPrepTransRow1HelpSig = subPrepTransRow1HelpSig;
    }

    @JsonProperty("subPrepTransRow1HelpDate")
    public SubPrepTransRow1HelpDate getSubPrepTransRow1HelpDate() {
        return subPrepTransRow1HelpDate;
    }

    @JsonProperty("subPrepTransRow1HelpDate")
    public void setSubPrepTransRow1HelpDate(SubPrepTransRow1HelpDate subPrepTransRow1HelpDate) {
        this.subPrepTransRow1HelpDate = subPrepTransRow1HelpDate;
    }

    @JsonProperty("subRow2")
    public SubRow2 getSubRow2() {
        return subRow2;
    }

    @JsonProperty("subRow2")
    public void setSubRow2(SubRow2 subRow2) {
        this.subRow2 = subRow2;
    }

    @JsonProperty("subRow2PreparerTranslatorHelpLastName")
    public SubRow2PreparerTranslatorHelpLastName getSubRow2PreparerTranslatorHelpLastName() {
        return subRow2PreparerTranslatorHelpLastName;
    }

    @JsonProperty("subRow2PreparerTranslatorHelpLastName")
    public void setSubRow2PreparerTranslatorHelpLastName(SubRow2PreparerTranslatorHelpLastName subRow2PreparerTranslatorHelpLastName) {
        this.subRow2PreparerTranslatorHelpLastName = subRow2PreparerTranslatorHelpLastName;
    }

    @JsonProperty("subRow2PreparerTranslatorHelpFirstName")
    public SubRow2PreparerTranslatorHelpFirstName getSubRow2PreparerTranslatorHelpFirstName() {
        return subRow2PreparerTranslatorHelpFirstName;
    }

    @JsonProperty("subRow2PreparerTranslatorHelpFirstName")
    public void setSubRow2PreparerTranslatorHelpFirstName(SubRow2PreparerTranslatorHelpFirstName subRow2PreparerTranslatorHelpFirstName) {
        this.subRow2PreparerTranslatorHelpFirstName = subRow2PreparerTranslatorHelpFirstName;
    }

    @JsonProperty("subRow3")
    public SubRow3 getSubRow3() {
        return subRow3;
    }

    @JsonProperty("subRow3")
    public void setSubRow3(SubRow3 subRow3) {
        this.subRow3 = subRow3;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpAddress")
    public SubRow3PreparerTranslatorHelpAddress getSubRow3PreparerTranslatorHelpAddress() {
        return subRow3PreparerTranslatorHelpAddress;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpAddress")
    public void setSubRow3PreparerTranslatorHelpAddress(SubRow3PreparerTranslatorHelpAddress subRow3PreparerTranslatorHelpAddress) {
        this.subRow3PreparerTranslatorHelpAddress = subRow3PreparerTranslatorHelpAddress;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpCity")
    public SubRow3PreparerTranslatorHelpCity getSubRow3PreparerTranslatorHelpCity() {
        return subRow3PreparerTranslatorHelpCity;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpCity")
    public void setSubRow3PreparerTranslatorHelpCity(SubRow3PreparerTranslatorHelpCity subRow3PreparerTranslatorHelpCity) {
        this.subRow3PreparerTranslatorHelpCity = subRow3PreparerTranslatorHelpCity;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpState")
    public SubRow3PreparerTranslatorHelpState getSubRow3PreparerTranslatorHelpState() {
        return subRow3PreparerTranslatorHelpState;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpState")
    public void setSubRow3PreparerTranslatorHelpState(SubRow3PreparerTranslatorHelpState subRow3PreparerTranslatorHelpState) {
        this.subRow3PreparerTranslatorHelpState = subRow3PreparerTranslatorHelpState;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpZip")
    public SubRow3PreparerTranslatorHelpZip getSubRow3PreparerTranslatorHelpZip() {
        return subRow3PreparerTranslatorHelpZip;
    }

    @JsonProperty("subRow3PreparerTranslatorHelpZip")
    public void setSubRow3PreparerTranslatorHelpZip(SubRow3PreparerTranslatorHelpZip subRow3PreparerTranslatorHelpZip) {
        this.subRow3PreparerTranslatorHelpZip = subRow3PreparerTranslatorHelpZip;
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
