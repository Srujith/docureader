
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
public class SubRow2 {

    @JsonProperty("textFieldLastName")
    private Object textFieldLastName;
    @JsonProperty("textFieldFirstName")
    private Object textFieldFirstName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textFieldLastName")
    public Object getTextFieldLastName() {
        return textFieldLastName;
    }

    @JsonProperty("textFieldLastName")
    public void setTextFieldLastName(Object textFieldLastName) {
        this.textFieldLastName = textFieldLastName;
    }

    @JsonProperty("textFieldFirstName")
    public Object getTextFieldFirstName() {
        return textFieldFirstName;
    }

    @JsonProperty("textFieldFirstName")
    public void setTextFieldFirstName(Object textFieldFirstName) {
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
