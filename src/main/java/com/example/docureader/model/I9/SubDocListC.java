
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
    "selectListCDocumentTitle",
    "textFieldIssuingAuthority",
    "textFieldDocumentNumber",
    "selectListCountry",
    "dateExpiration",
    "ReceiptC"
})
public class SubDocListC {

    @JsonProperty("selectListCDocumentTitle")
    private String selectListCDocumentTitle;
    @JsonProperty("textFieldIssuingAuthority")
    private String textFieldIssuingAuthority;
    @JsonProperty("textFieldDocumentNumber")
    private String textFieldDocumentNumber;
    @JsonProperty("selectListCountry")
    private Object selectListCountry;
    @JsonProperty("dateExpiration")
    private String dateExpiration;
    @JsonProperty("ReceiptC")
    private Object receiptC;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("selectListCDocumentTitle")
    public String getSelectListCDocumentTitle() {
        return selectListCDocumentTitle;
    }

    @JsonProperty("selectListCDocumentTitle")
    public void setSelectListCDocumentTitle(String selectListCDocumentTitle) {
        this.selectListCDocumentTitle = selectListCDocumentTitle;
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

    @JsonProperty("selectListCountry")
    public Object getSelectListCountry() {
        return selectListCountry;
    }

    @JsonProperty("selectListCountry")
    public void setSelectListCountry(Object selectListCountry) {
        this.selectListCountry = selectListCountry;
    }

    @JsonProperty("dateExpiration")
    public String getDateExpiration() {
        return dateExpiration;
    }

    @JsonProperty("dateExpiration")
    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @JsonProperty("ReceiptC")
    public Object getReceiptC() {
        return receiptC;
    }

    @JsonProperty("ReceiptC")
    public void setReceiptC(Object receiptC) {
        this.receiptC = receiptC;
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
