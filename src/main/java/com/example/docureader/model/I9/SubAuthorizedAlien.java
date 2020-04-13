
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
    "numFormI94Admission",
    "numForeignPassport",
    "CountryofIssuance",
    "textFieldResidentType"
})
public class SubAuthorizedAlien {

    @JsonProperty("numFormI94Admission")
    private String numFormI94Admission;
    @JsonProperty("numForeignPassport")
    private String numForeignPassport;
    @JsonProperty("CountryofIssuance")
    private String countryofIssuance;
    @JsonProperty("textFieldResidentType")
    private Object textFieldResidentType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numFormI94Admission")
    public String getNumFormI94Admission() {
        return numFormI94Admission;
    }

    @JsonProperty("numFormI94Admission")
    public void setNumFormI94Admission(String numFormI94Admission) {
        this.numFormI94Admission = numFormI94Admission;
    }

    @JsonProperty("numForeignPassport")
    public String getNumForeignPassport() {
        return numForeignPassport;
    }

    @JsonProperty("numForeignPassport")
    public void setNumForeignPassport(String numForeignPassport) {
        this.numForeignPassport = numForeignPassport;
    }

    @JsonProperty("CountryofIssuance")
    public String getCountryofIssuance() {
        return countryofIssuance;
    }

    @JsonProperty("CountryofIssuance")
    public void setCountryofIssuance(String countryofIssuance) {
        this.countryofIssuance = countryofIssuance;
    }

    @JsonProperty("textFieldResidentType")
    public Object getTextFieldResidentType() {
        return textFieldResidentType;
    }

    @JsonProperty("textFieldResidentType")
    public void setTextFieldResidentType(Object textFieldResidentType) {
        this.textFieldResidentType = textFieldResidentType;
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
