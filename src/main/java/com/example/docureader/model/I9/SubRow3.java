
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
public class SubRow3 {

    @JsonProperty("textFieldAddress")
    private Object textFieldAddress;
    @JsonProperty("textFieldCityOrTown")
    private Object textFieldCityOrTown;
    @JsonProperty("State")
    private Object state;
    @JsonProperty("textFieldZipCode")
    private Object textFieldZipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textFieldAddress")
    public Object getTextFieldAddress() {
        return textFieldAddress;
    }

    @JsonProperty("textFieldAddress")
    public void setTextFieldAddress(Object textFieldAddress) {
        this.textFieldAddress = textFieldAddress;
    }

    @JsonProperty("textFieldCityOrTown")
    public Object getTextFieldCityOrTown() {
        return textFieldCityOrTown;
    }

    @JsonProperty("textFieldCityOrTown")
    public void setTextFieldCityOrTown(Object textFieldCityOrTown) {
        this.textFieldCityOrTown = textFieldCityOrTown;
    }

    @JsonProperty("State")
    public Object getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(Object state) {
        this.state = state;
    }

    @JsonProperty("textFieldZipCode")
    public Object getTextFieldZipCode() {
        return textFieldZipCode;
    }

    @JsonProperty("textFieldZipCode")
    public void setTextFieldZipCode(Object textFieldZipCode) {
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
