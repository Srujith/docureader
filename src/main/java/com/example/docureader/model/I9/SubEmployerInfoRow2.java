
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
    "textFieldLastName",
    "textFieldFirstName"
})
public class SubEmployerInfoRow2 {

    @JsonProperty("textFieldLastName")
    private String textFieldLastName;
    @JsonProperty("textFieldFirstName")
    private String textFieldFirstName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textFieldLastName")
    public String getTextFieldLastName() {
        return textFieldLastName;
    }

    @JsonProperty("textFieldLastName")
    public void setTextFieldLastName(String textFieldLastName) {
        this.textFieldLastName = textFieldLastName;
    }

    @JsonProperty("textFieldFirstName")
    public String getTextFieldFirstName() {
        return textFieldFirstName;
    }

    @JsonProperty("textFieldFirstName")
    public void setTextFieldFirstName(String textFieldFirstName) {
        this.textFieldFirstName = textFieldFirstName;
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
