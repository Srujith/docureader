
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
    "selectListA2DocumentTitle",
    "textFieldIssuingAuthority",
    "textFieldDocumentNumber",
    "dateExpiration"
})
public class SubDocListA2 {

    @JsonProperty("selectListA2DocumentTitle")
    private String selectListA2DocumentTitle;
    @JsonProperty("textFieldIssuingAuthority")
    private String textFieldIssuingAuthority;
    @JsonProperty("textFieldDocumentNumber")
    private String textFieldDocumentNumber;
    @JsonProperty("dateExpiration")
    private String dateExpiration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("selectListA2DocumentTitle")
    public String getSelectListA2DocumentTitle() {
        return selectListA2DocumentTitle;
    }

    @JsonProperty("selectListA2DocumentTitle")
    public void setSelectListA2DocumentTitle(String selectListA2DocumentTitle) {
        this.selectListA2DocumentTitle = selectListA2DocumentTitle;
    }

    @JsonProperty("textFieldIssuingAuthority")
    public String getTextFieldIssuingAuthority() {
        return textFieldIssuingAuthority;
    }

    @JsonProperty("textFieldIssuingAuthority")
    public void setTextFieldIssuingAuthority(String textFieldIssuingAuthority) {
        this.textFieldIssuingAuthority = textFieldIssuingAuthority;
    }

    @JsonProperty("textFieldDocumentNumber")
    public String getTextFieldDocumentNumber() {
        return textFieldDocumentNumber;
    }

    @JsonProperty("textFieldDocumentNumber")
    public void setTextFieldDocumentNumber(String textFieldDocumentNumber) {
        this.textFieldDocumentNumber = textFieldDocumentNumber;
    }

    @JsonProperty("dateExpiration")
    public String getDateExpiration() {
        return dateExpiration;
    }

    @JsonProperty("dateExpiration")
    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
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
