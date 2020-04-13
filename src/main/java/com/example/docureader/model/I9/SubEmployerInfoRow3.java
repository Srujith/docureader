
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
    "textFieldAddress",
    "textFieldCityOrTown",
    "State",
    "textFieldZipCode"
})
public class SubEmployerInfoRow3 {

    @JsonProperty("textFieldAddress")
    private String textFieldAddress;
    @JsonProperty("textFieldCityOrTown")
    private String textFieldCityOrTown;
    @JsonProperty("State")
    private String state;
    @JsonProperty("textFieldZipCode")
    private String textFieldZipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textFieldAddress")
    public String getTextFieldAddress() {
        return textFieldAddress;
    }

    @JsonProperty("textFieldAddress")
    public void setTextFieldAddress(String textFieldAddress) {
        this.textFieldAddress = textFieldAddress;
    }

    @JsonProperty("textFieldCityOrTown")
    public String getTextFieldCityOrTown() {
        return textFieldCityOrTown;
    }

    @JsonProperty("textFieldCityOrTown")
    public void setTextFieldCityOrTown(String textFieldCityOrTown) {
        this.textFieldCityOrTown = textFieldCityOrTown;
    }

    @JsonProperty("State")
    public String getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("textFieldZipCode")
    public String getTextFieldZipCode() {
        return textFieldZipCode;
    }

    @JsonProperty("textFieldZipCode")
    public void setTextFieldZipCode(String textFieldZipCode) {
        this.textFieldZipCode = textFieldZipCode;
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
