
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
    "textFieldAdditionalInfo",
    "text3DBarcode",
    "subDocHelpParent",
    "subDocListA2",
    "subDocListA3",
    "subListBandCBorder",
    "subDocListA1"
})
public class SubVerificationListsBorder {

    @JsonProperty("textFieldAdditionalInfo")
    private Object textFieldAdditionalInfo;
    @JsonProperty("text3DBarcode")
    private String text3DBarcode;
    @JsonProperty("subDocHelpParent")
    private SubDocHelpParent subDocHelpParent;
    @JsonProperty("subDocListA2")
    private SubDocListA2 subDocListA2;
    @JsonProperty("subDocListA3")
    private SubDocListA3 subDocListA3;
    @JsonProperty("subListBandCBorder")
    private SubListBandCBorder subListBandCBorder;
    @JsonProperty("subDocListA1")
    private SubDocListA1 subDocListA1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textFieldAdditionalInfo")
    public Object getTextFieldAdditionalInfo() {
        return textFieldAdditionalInfo;
    }

    @JsonProperty("textFieldAdditionalInfo")
    public void setTextFieldAdditionalInfo(Object textFieldAdditionalInfo) {
        this.textFieldAdditionalInfo = textFieldAdditionalInfo;
    }

    @JsonProperty("text3DBarcode")
    public String getText3DBarcode() {
        return text3DBarcode;
    }

    @JsonProperty("text3DBarcode")
    public void setText3DBarcode(String text3DBarcode) {
        this.text3DBarcode = text3DBarcode;
    }

    @JsonProperty("subDocHelpParent")
    public SubDocHelpParent getSubDocHelpParent() {
        return subDocHelpParent;
    }

    @JsonProperty("subDocHelpParent")
    public void setSubDocHelpParent(SubDocHelpParent subDocHelpParent) {
        this.subDocHelpParent = subDocHelpParent;
    }

    @JsonProperty("subDocListA2")
    public SubDocListA2 getSubDocListA2() {
        return subDocListA2;
    }

    @JsonProperty("subDocListA2")
    public void setSubDocListA2(SubDocListA2 subDocListA2) {
        this.subDocListA2 = subDocListA2;
    }

    @JsonProperty("subDocListA3")
    public SubDocListA3 getSubDocListA3() {
        return subDocListA3;
    }

    @JsonProperty("subDocListA3")
    public void setSubDocListA3(SubDocListA3 subDocListA3) {
        this.subDocListA3 = subDocListA3;
    }

    @JsonProperty("subListBandCBorder")
    public SubListBandCBorder getSubListBandCBorder() {
        return subListBandCBorder;
    }

    @JsonProperty("subListBandCBorder")
    public void setSubListBandCBorder(SubListBandCBorder subListBandCBorder) {
        this.subListBandCBorder = subListBandCBorder;
    }

    @JsonProperty("subDocListA1")
    public SubDocListA1 getSubDocListA1() {
        return subDocListA1;
    }

    @JsonProperty("subDocListA1")
    public void setSubDocListA1(SubDocListA1 subDocListA1) {
        this.subDocListA1 = subDocListA1;
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
