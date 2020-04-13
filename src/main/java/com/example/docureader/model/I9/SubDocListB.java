
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
    "selectListBDocumentTitle",
    "textFieldIssuingAuthority",
    "textFieldDocumentNumber",
    "ReceiptB",
    "dateExpiration"
})
public class SubDocListB {

    @JsonProperty("selectListBDocumentTitle")
    private String selectListBDocumentTitle;
    @JsonProperty("textFieldIssuingAuthority")
    private String textFieldIssuingAuthority;
    @JsonProperty("textFieldDocumentNumber")
    private String textFieldDocumentNumber;
    @JsonProperty("ReceiptB")
    private Object receiptB;
    @JsonProperty("dateExpiration")
    private String dateExpiration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("selectListBDocumentTitle")
    public String getSelectListBDocumentTitle() {
        return selectListBDocumentTitle;
    }

    @JsonProperty("selectListBDocumentTitle")
    public void setSelectListBDocumentTitle(String selectListBDocumentTitle) {
        this.selectListBDocumentTitle = selectListBDocumentTitle;
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

    @JsonProperty("ReceiptB")
    public Object getReceiptB() {
        return receiptB;
    }

    @JsonProperty("ReceiptB")
    public void setReceiptB(Object receiptB) {
        this.receiptB = receiptB;
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
