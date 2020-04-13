
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
    "selectListA1DocumentTitle",
    "textFieldIssuingAuthority",
    "textFieldDocumentNumber",
    "ReceiptA1",
    "dateExpiration"
})
public class SubDocListA1 {

    @JsonProperty("selectListA1DocumentTitle")
    private String selectListA1DocumentTitle;
    @JsonProperty("textFieldIssuingAuthority")
    private String textFieldIssuingAuthority;
    @JsonProperty("textFieldDocumentNumber")
    private String textFieldDocumentNumber;
    @JsonProperty("ReceiptA1")
    private Object receiptA1;
    @JsonProperty("dateExpiration")
    private String dateExpiration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("selectListA1DocumentTitle")
    public String getSelectListA1DocumentTitle() {
        return selectListA1DocumentTitle;
    }

    @JsonProperty("selectListA1DocumentTitle")
    public void setSelectListA1DocumentTitle(String selectListA1DocumentTitle) {
        this.selectListA1DocumentTitle = selectListA1DocumentTitle;
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

    @JsonProperty("ReceiptA1")
    public Object getReceiptA1() {
        return receiptA1;
    }

    @JsonProperty("ReceiptA1")
    public void setReceiptA1(Object receiptA1) {
        this.receiptA1 = receiptA1;
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
