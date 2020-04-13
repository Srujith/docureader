
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
    "textFieldLastNameGlobal",
    "textFieldFirstNameGlobal",
    "textFieldMiddleInitialGlobal",
    "textFieldOtherNames"
})
public class SubSection1Row1 {

    @JsonProperty("textFieldLastNameGlobal")
    private String textFieldLastNameGlobal;
    @JsonProperty("textFieldFirstNameGlobal")
    private String textFieldFirstNameGlobal;
    @JsonProperty("textFieldMiddleInitialGlobal")
    private String textFieldMiddleInitialGlobal;
    @JsonProperty("textFieldOtherNames")
    private String textFieldOtherNames;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textFieldLastNameGlobal")
    public String getTextFieldLastNameGlobal() {
        return textFieldLastNameGlobal;
    }

    @JsonProperty("textFieldLastNameGlobal")
    public void setTextFieldLastNameGlobal(String textFieldLastNameGlobal) {
        this.textFieldLastNameGlobal = textFieldLastNameGlobal;
    }

    @JsonProperty("textFieldFirstNameGlobal")
    public String getTextFieldFirstNameGlobal() {
        return textFieldFirstNameGlobal;
    }

    @JsonProperty("textFieldFirstNameGlobal")
    public void setTextFieldFirstNameGlobal(String textFieldFirstNameGlobal) {
        this.textFieldFirstNameGlobal = textFieldFirstNameGlobal;
    }

    @JsonProperty("textFieldMiddleInitialGlobal")
    public String getTextFieldMiddleInitialGlobal() {
        return textFieldMiddleInitialGlobal;
    }

    @JsonProperty("textFieldMiddleInitialGlobal")
    public void setTextFieldMiddleInitialGlobal(String textFieldMiddleInitialGlobal) {
        this.textFieldMiddleInitialGlobal = textFieldMiddleInitialGlobal;
    }

    @JsonProperty("textFieldOtherNames")
    public String getTextFieldOtherNames() {
        return textFieldOtherNames;
    }

    @JsonProperty("textFieldOtherNames")
    public void setTextFieldOtherNames(String textFieldOtherNames) {
        this.textFieldOtherNames = textFieldOtherNames;
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
