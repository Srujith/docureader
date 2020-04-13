
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subAttest",
    "subSec2AttestHelpEmpSigDate",
    "subEmployerInformation"
})
public class SubCertification {

    @JsonProperty("subAttest")
    private SubAttest subAttest;
    @JsonProperty("subSec2AttestHelpEmpSigDate")
    private SubSec2AttestHelpEmpSigDate subSec2AttestHelpEmpSigDate;
    @JsonProperty("subEmployerInformation")
    private SubEmployerInformation subEmployerInformation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subAttest")
    public SubAttest getSubAttest() {
        return subAttest;
    }

    @JsonProperty("subAttest")
    public void setSubAttest(SubAttest subAttest) {
        this.subAttest = subAttest;
    }

    @JsonProperty("subSec2AttestHelpEmpSigDate")
    public SubSec2AttestHelpEmpSigDate getSubSec2AttestHelpEmpSigDate() {
        return subSec2AttestHelpEmpSigDate;
    }

    @JsonProperty("subSec2AttestHelpEmpSigDate")
    public void setSubSec2AttestHelpEmpSigDate(SubSec2AttestHelpEmpSigDate subSec2AttestHelpEmpSigDate) {
        this.subSec2AttestHelpEmpSigDate = subSec2AttestHelpEmpSigDate;
    }

    @JsonProperty("subEmployerInformation")
    public SubEmployerInformation getSubEmployerInformation() {
        return subEmployerInformation;
    }

    @JsonProperty("subEmployerInformation")
    public void setSubEmployerInformation(SubEmployerInformation subEmployerInformation) {
        this.subEmployerInformation = subEmployerInformation;
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
