
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subSec3Row1",
    "subSec3HelpLastName",
    "subSec3HelpNewName",
    "subSec3HelpFirstName",
    "subSec3HelpMiddleInitial",
    "subSec3HelpDateRehire"
})
public class SubReverificationRehire {

    @JsonProperty("subSec3Row1")
    private SubSec3Row1 subSec3Row1;
    @JsonProperty("subSec3HelpLastName")
    private SubSec3HelpLastName subSec3HelpLastName;
    @JsonProperty("subSec3HelpNewName")
    private SubSec3HelpNewName subSec3HelpNewName;
    @JsonProperty("subSec3HelpFirstName")
    private SubSec3HelpFirstName subSec3HelpFirstName;
    @JsonProperty("subSec3HelpMiddleInitial")
    private SubSec3HelpMiddleInitial subSec3HelpMiddleInitial;
    @JsonProperty("subSec3HelpDateRehire")
    private SubSec3HelpDateRehire subSec3HelpDateRehire;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subSec3Row1")
    public SubSec3Row1 getSubSec3Row1() {
        return subSec3Row1;
    }

    @JsonProperty("subSec3Row1")
    public void setSubSec3Row1(SubSec3Row1 subSec3Row1) {
        this.subSec3Row1 = subSec3Row1;
    }

    @JsonProperty("subSec3HelpLastName")
    public SubSec3HelpLastName getSubSec3HelpLastName() {
        return subSec3HelpLastName;
    }

    @JsonProperty("subSec3HelpLastName")
    public void setSubSec3HelpLastName(SubSec3HelpLastName subSec3HelpLastName) {
        this.subSec3HelpLastName = subSec3HelpLastName;
    }

    @JsonProperty("subSec3HelpNewName")
    public SubSec3HelpNewName getSubSec3HelpNewName() {
        return subSec3HelpNewName;
    }

    @JsonProperty("subSec3HelpNewName")
    public void setSubSec3HelpNewName(SubSec3HelpNewName subSec3HelpNewName) {
        this.subSec3HelpNewName = subSec3HelpNewName;
    }

    @JsonProperty("subSec3HelpFirstName")
    public SubSec3HelpFirstName getSubSec3HelpFirstName() {
        return subSec3HelpFirstName;
    }

    @JsonProperty("subSec3HelpFirstName")
    public void setSubSec3HelpFirstName(SubSec3HelpFirstName subSec3HelpFirstName) {
        this.subSec3HelpFirstName = subSec3HelpFirstName;
    }

    @JsonProperty("subSec3HelpMiddleInitial")
    public SubSec3HelpMiddleInitial getSubSec3HelpMiddleInitial() {
        return subSec3HelpMiddleInitial;
    }

    @JsonProperty("subSec3HelpMiddleInitial")
    public void setSubSec3HelpMiddleInitial(SubSec3HelpMiddleInitial subSec3HelpMiddleInitial) {
        this.subSec3HelpMiddleInitial = subSec3HelpMiddleInitial;
    }

    @JsonProperty("subSec3HelpDateRehire")
    public SubSec3HelpDateRehire getSubSec3HelpDateRehire() {
        return subSec3HelpDateRehire;
    }

    @JsonProperty("subSec3HelpDateRehire")
    public void setSubSec3HelpDateRehire(SubSec3HelpDateRehire subSec3HelpDateRehire) {
        this.subSec3HelpDateRehire = subSec3HelpDateRehire;
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
