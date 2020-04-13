
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
    "radioButtonListCitizenship",
    "textFieldResidentType",
    "dateAlienAuthDate",
    "numAlienOrUSCIS"
})
public class SubCitizenshipStatus {

    @JsonProperty("radioButtonListCitizenship")
    private String radioButtonListCitizenship;
    @JsonProperty("textFieldResidentType")
    private String textFieldResidentType;
    @JsonProperty("dateAlienAuthDate")
    private String dateAlienAuthDate;
    @JsonProperty("numAlienOrUSCIS")
    private String numAlienOrUSCIS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("radioButtonListCitizenship")
    public String getRadioButtonListCitizenship() {
        return radioButtonListCitizenship;
    }

    @JsonProperty("radioButtonListCitizenship")
    public void setRadioButtonListCitizenship(String radioButtonListCitizenship) {
        this.radioButtonListCitizenship = radioButtonListCitizenship;
    }

    @JsonProperty("textFieldResidentType")
    public String getTextFieldResidentType() {
        return textFieldResidentType;
    }

    @JsonProperty("textFieldResidentType")
    public void setTextFieldResidentType(String textFieldResidentType) {
        this.textFieldResidentType = textFieldResidentType;
    }

    @JsonProperty("dateAlienAuthDate")
    public String getDateAlienAuthDate() {
        return dateAlienAuthDate;
    }

    @JsonProperty("dateAlienAuthDate")
    public void setDateAlienAuthDate(String dateAlienAuthDate) {
        this.dateAlienAuthDate = dateAlienAuthDate;
    }

    @JsonProperty("numAlienOrUSCIS")
    public String getNumAlienOrUSCIS() {
        return numAlienOrUSCIS;
    }

    @JsonProperty("numAlienOrUSCIS")
    public void setNumAlienOrUSCIS(String numAlienOrUSCIS) {
        this.numAlienOrUSCIS = numAlienOrUSCIS;
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
