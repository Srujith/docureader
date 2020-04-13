
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
    "selectListA3DocumentTitle",
    "textFieldIssuingAuthority",
    "textFieldDocumentNumber",
    "dateExpiration"
})
public class SubDocListA3 {

    @JsonProperty("selectListA3DocumentTitle")
    private String selectListA3DocumentTitle;
    @JsonProperty("textFieldIssuingAuthority")
    private String textFieldIssuingAuthority;
    @JsonProperty("textFieldDocumentNumber")
    private String textFieldDocumentNumber;
    @JsonProperty("dateExpiration")
    private String dateExpiration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("selectListA3DocumentTitle")
    public String getSelectListA3DocumentTitle() {
        return selectListA3DocumentTitle;
    }

    @JsonProperty("selectListA3DocumentTitle")
    public void setSelectListA3DocumentTitle(String selectListA3DocumentTitle) {
        this.selectListA3DocumentTitle = selectListA3DocumentTitle;
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
