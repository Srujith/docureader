
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
    "textFieldMiddleInitialGlobal",
    "textFieldFirstNameGlobal",
    "selectListCitizenshipPage2"
})
public class SubEmployeeName_ {

    @JsonProperty("textFieldLastNameGlobal")
    private String textFieldLastNameGlobal;
    @JsonProperty("textFieldMiddleInitialGlobal")
    private String textFieldMiddleInitialGlobal;
    @JsonProperty("textFieldFirstNameGlobal")
    private String textFieldFirstNameGlobal;
    @JsonProperty("selectListCitizenshipPage2")
    private String selectListCitizenshipPage2;
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

    @JsonProperty("textFieldMiddleInitialGlobal")
    public String getTextFieldMiddleInitialGlobal() {
        return textFieldMiddleInitialGlobal;
    }

    @JsonProperty("textFieldMiddleInitialGlobal")
    public void setTextFieldMiddleInitialGlobal(String textFieldMiddleInitialGlobal) {
        this.textFieldMiddleInitialGlobal = textFieldMiddleInitialGlobal;
    }

    @JsonProperty("textFieldFirstNameGlobal")
    public String getTextFieldFirstNameGlobal() {
        return textFieldFirstNameGlobal;
    }

    @JsonProperty("textFieldFirstNameGlobal")
    public void setTextFieldFirstNameGlobal(String textFieldFirstNameGlobal) {
        this.textFieldFirstNameGlobal = textFieldFirstNameGlobal;
    }

    @JsonProperty("selectListCitizenshipPage2")
    public String getSelectListCitizenshipPage2() {
        return selectListCitizenshipPage2;
    }

    @JsonProperty("selectListCitizenshipPage2")
    public void setSelectListCitizenshipPage2(String selectListCitizenshipPage2) {
        this.selectListCitizenshipPage2 = selectListCitizenshipPage2;
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
