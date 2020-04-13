
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
    "subSpacer",
    "subAdditionalInfoHelp",
    "subDocListA1HelpExp",
    "subDocListA1HelpDocNum",
    "subDocListA1HelpIssuingAuth",
    "subDocListA1HelpDocTitle",
    "subDocListA2HelpExp",
    "subDocListA2HelpDocNum",
    "subDocListA2HelpIssuingAuth",
    "subDocListA2HelpDocTitle",
    "subDocListA3HelpExp",
    "subDocListA3HelpDocNum",
    "subDocListA3HelpIssuingAuth",
    "subDocListA3HelpDocTitle",
    "subDocListBHelpExp",
    "subDocListBHelpDocNum",
    "subDocListBHelpIssuingAuth",
    "subDocListBHelpDocTitle",
    "subDocListCHelpExp",
    "subDocListCHelpDocNum",
    "subDocListCHelpIssuingAuth",
    "subDocListCHelpDocTitle",
    "subDocDummyHelp"
})
public class SubDocHelpParent {

    @JsonProperty("subSpacer")
    private SubSpacer subSpacer;
    @JsonProperty("subAdditionalInfoHelp")
    private SubAdditionalInfoHelp subAdditionalInfoHelp;
    @JsonProperty("subDocListA1HelpExp")
    private SubDocListA1HelpExp subDocListA1HelpExp;
    @JsonProperty("subDocListA1HelpDocNum")
    private SubDocListA1HelpDocNum subDocListA1HelpDocNum;
    @JsonProperty("subDocListA1HelpIssuingAuth")
    private SubDocListA1HelpIssuingAuth subDocListA1HelpIssuingAuth;
    @JsonProperty("subDocListA1HelpDocTitle")
    private SubDocListA1HelpDocTitle subDocListA1HelpDocTitle;
    @JsonProperty("subDocListA2HelpExp")
    private SubDocListA2HelpExp subDocListA2HelpExp;
    @JsonProperty("subDocListA2HelpDocNum")
    private SubDocListA2HelpDocNum subDocListA2HelpDocNum;
    @JsonProperty("subDocListA2HelpIssuingAuth")
    private SubDocListA2HelpIssuingAuth subDocListA2HelpIssuingAuth;
    @JsonProperty("subDocListA2HelpDocTitle")
    private SubDocListA2HelpDocTitle subDocListA2HelpDocTitle;
    @JsonProperty("subDocListA3HelpExp")
    private SubDocListA3HelpExp subDocListA3HelpExp;
    @JsonProperty("subDocListA3HelpDocNum")
    private SubDocListA3HelpDocNum subDocListA3HelpDocNum;
    @JsonProperty("subDocListA3HelpIssuingAuth")
    private SubDocListA3HelpIssuingAuth subDocListA3HelpIssuingAuth;
    @JsonProperty("subDocListA3HelpDocTitle")
    private SubDocListA3HelpDocTitle subDocListA3HelpDocTitle;
    @JsonProperty("subDocListBHelpExp")
    private SubDocListBHelpExp subDocListBHelpExp;
    @JsonProperty("subDocListBHelpDocNum")
    private SubDocListBHelpDocNum subDocListBHelpDocNum;
    @JsonProperty("subDocListBHelpIssuingAuth")
    private SubDocListBHelpIssuingAuth subDocListBHelpIssuingAuth;
    @JsonProperty("subDocListBHelpDocTitle")
    private SubDocListBHelpDocTitle subDocListBHelpDocTitle;
    @JsonProperty("subDocListCHelpExp")
    private SubDocListCHelpExp subDocListCHelpExp;
    @JsonProperty("subDocListCHelpDocNum")
    private SubDocListCHelpDocNum subDocListCHelpDocNum;
    @JsonProperty("subDocListCHelpIssuingAuth")
    private SubDocListCHelpIssuingAuth subDocListCHelpIssuingAuth;
    @JsonProperty("subDocListCHelpDocTitle")
    private SubDocListCHelpDocTitle subDocListCHelpDocTitle;
    @JsonProperty("subDocDummyHelp")
    private SubDocDummyHelp subDocDummyHelp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("subSpacer")
    public SubSpacer getSubSpacer() {
        return subSpacer;
    }

    @JsonProperty("subSpacer")
    public void setSubSpacer(SubSpacer subSpacer) {
        this.subSpacer = subSpacer;
    }

    @JsonProperty("subAdditionalInfoHelp")
    public SubAdditionalInfoHelp getSubAdditionalInfoHelp() {
        return subAdditionalInfoHelp;
    }

    @JsonProperty("subAdditionalInfoHelp")
    public void setSubAdditionalInfoHelp(SubAdditionalInfoHelp subAdditionalInfoHelp) {
        this.subAdditionalInfoHelp = subAdditionalInfoHelp;
    }

    @JsonProperty("subDocListA1HelpExp")
    public SubDocListA1HelpExp getSubDocListA1HelpExp() {
        return subDocListA1HelpExp;
    }

    @JsonProperty("subDocListA1HelpExp")
    public void setSubDocListA1HelpExp(SubDocListA1HelpExp subDocListA1HelpExp) {
        this.subDocListA1HelpExp = subDocListA1HelpExp;
    }

    @JsonProperty("subDocListA1HelpDocNum")
    public SubDocListA1HelpDocNum getSubDocListA1HelpDocNum() {
        return subDocListA1HelpDocNum;
    }

    @JsonProperty("subDocListA1HelpDocNum")
    public void setSubDocListA1HelpDocNum(SubDocListA1HelpDocNum subDocListA1HelpDocNum) {
        this.subDocListA1HelpDocNum = subDocListA1HelpDocNum;
    }

    @JsonProperty("subDocListA1HelpIssuingAuth")
    public SubDocListA1HelpIssuingAuth getSubDocListA1HelpIssuingAuth() {
        return subDocListA1HelpIssuingAuth;
    }

    @JsonProperty("subDocListA1HelpIssuingAuth")
    public void setSubDocListA1HelpIssuingAuth(SubDocListA1HelpIssuingAuth subDocListA1HelpIssuingAuth) {
        this.subDocListA1HelpIssuingAuth = subDocListA1HelpIssuingAuth;
    }

    @JsonProperty("subDocListA1HelpDocTitle")
    public SubDocListA1HelpDocTitle getSubDocListA1HelpDocTitle() {
        return subDocListA1HelpDocTitle;
    }

    @JsonProperty("subDocListA1HelpDocTitle")
    public void setSubDocListA1HelpDocTitle(SubDocListA1HelpDocTitle subDocListA1HelpDocTitle) {
        this.subDocListA1HelpDocTitle = subDocListA1HelpDocTitle;
    }

    @JsonProperty("subDocListA2HelpExp")
    public SubDocListA2HelpExp getSubDocListA2HelpExp() {
        return subDocListA2HelpExp;
    }

    @JsonProperty("subDocListA2HelpExp")
    public void setSubDocListA2HelpExp(SubDocListA2HelpExp subDocListA2HelpExp) {
        this.subDocListA2HelpExp = subDocListA2HelpExp;
    }

    @JsonProperty("subDocListA2HelpDocNum")
    public SubDocListA2HelpDocNum getSubDocListA2HelpDocNum() {
        return subDocListA2HelpDocNum;
    }

    @JsonProperty("subDocListA2HelpDocNum")
    public void setSubDocListA2HelpDocNum(SubDocListA2HelpDocNum subDocListA2HelpDocNum) {
        this.subDocListA2HelpDocNum = subDocListA2HelpDocNum;
    }

    @JsonProperty("subDocListA2HelpIssuingAuth")
    public SubDocListA2HelpIssuingAuth getSubDocListA2HelpIssuingAuth() {
        return subDocListA2HelpIssuingAuth;
    }

    @JsonProperty("subDocListA2HelpIssuingAuth")
    public void setSubDocListA2HelpIssuingAuth(SubDocListA2HelpIssuingAuth subDocListA2HelpIssuingAuth) {
        this.subDocListA2HelpIssuingAuth = subDocListA2HelpIssuingAuth;
    }

    @JsonProperty("subDocListA2HelpDocTitle")
    public SubDocListA2HelpDocTitle getSubDocListA2HelpDocTitle() {
        return subDocListA2HelpDocTitle;
    }

    @JsonProperty("subDocListA2HelpDocTitle")
    public void setSubDocListA2HelpDocTitle(SubDocListA2HelpDocTitle subDocListA2HelpDocTitle) {
        this.subDocListA2HelpDocTitle = subDocListA2HelpDocTitle;
    }

    @JsonProperty("subDocListA3HelpExp")
    public SubDocListA3HelpExp getSubDocListA3HelpExp() {
        return subDocListA3HelpExp;
    }

    @JsonProperty("subDocListA3HelpExp")
    public void setSubDocListA3HelpExp(SubDocListA3HelpExp subDocListA3HelpExp) {
        this.subDocListA3HelpExp = subDocListA3HelpExp;
    }

    @JsonProperty("subDocListA3HelpDocNum")
    public SubDocListA3HelpDocNum getSubDocListA3HelpDocNum() {
        return subDocListA3HelpDocNum;
    }

    @JsonProperty("subDocListA3HelpDocNum")
    public void setSubDocListA3HelpDocNum(SubDocListA3HelpDocNum subDocListA3HelpDocNum) {
        this.subDocListA3HelpDocNum = subDocListA3HelpDocNum;
    }

    @JsonProperty("subDocListA3HelpIssuingAuth")
    public SubDocListA3HelpIssuingAuth getSubDocListA3HelpIssuingAuth() {
        return subDocListA3HelpIssuingAuth;
    }

    @JsonProperty("subDocListA3HelpIssuingAuth")
    public void setSubDocListA3HelpIssuingAuth(SubDocListA3HelpIssuingAuth subDocListA3HelpIssuingAuth) {
        this.subDocListA3HelpIssuingAuth = subDocListA3HelpIssuingAuth;
    }

    @JsonProperty("subDocListA3HelpDocTitle")
    public SubDocListA3HelpDocTitle getSubDocListA3HelpDocTitle() {
        return subDocListA3HelpDocTitle;
    }

    @JsonProperty("subDocListA3HelpDocTitle")
    public void setSubDocListA3HelpDocTitle(SubDocListA3HelpDocTitle subDocListA3HelpDocTitle) {
        this.subDocListA3HelpDocTitle = subDocListA3HelpDocTitle;
    }

    @JsonProperty("subDocListBHelpExp")
    public SubDocListBHelpExp getSubDocListBHelpExp() {
        return subDocListBHelpExp;
    }

    @JsonProperty("subDocListBHelpExp")
    public void setSubDocListBHelpExp(SubDocListBHelpExp subDocListBHelpExp) {
        this.subDocListBHelpExp = subDocListBHelpExp;
    }

    @JsonProperty("subDocListBHelpDocNum")
    public SubDocListBHelpDocNum getSubDocListBHelpDocNum() {
        return subDocListBHelpDocNum;
    }

    @JsonProperty("subDocListBHelpDocNum")
    public void setSubDocListBHelpDocNum(SubDocListBHelpDocNum subDocListBHelpDocNum) {
        this.subDocListBHelpDocNum = subDocListBHelpDocNum;
    }

    @JsonProperty("subDocListBHelpIssuingAuth")
    public SubDocListBHelpIssuingAuth getSubDocListBHelpIssuingAuth() {
        return subDocListBHelpIssuingAuth;
    }

    @JsonProperty("subDocListBHelpIssuingAuth")
    public void setSubDocListBHelpIssuingAuth(SubDocListBHelpIssuingAuth subDocListBHelpIssuingAuth) {
        this.subDocListBHelpIssuingAuth = subDocListBHelpIssuingAuth;
    }

    @JsonProperty("subDocListBHelpDocTitle")
    public SubDocListBHelpDocTitle getSubDocListBHelpDocTitle() {
        return subDocListBHelpDocTitle;
    }

    @JsonProperty("subDocListBHelpDocTitle")
    public void setSubDocListBHelpDocTitle(SubDocListBHelpDocTitle subDocListBHelpDocTitle) {
        this.subDocListBHelpDocTitle = subDocListBHelpDocTitle;
    }

    @JsonProperty("subDocListCHelpExp")
    public SubDocListCHelpExp getSubDocListCHelpExp() {
        return subDocListCHelpExp;
    }

    @JsonProperty("subDocListCHelpExp")
    public void setSubDocListCHelpExp(SubDocListCHelpExp subDocListCHelpExp) {
        this.subDocListCHelpExp = subDocListCHelpExp;
    }

    @JsonProperty("subDocListCHelpDocNum")
    public SubDocListCHelpDocNum getSubDocListCHelpDocNum() {
        return subDocListCHelpDocNum;
    }

    @JsonProperty("subDocListCHelpDocNum")
    public void setSubDocListCHelpDocNum(SubDocListCHelpDocNum subDocListCHelpDocNum) {
        this.subDocListCHelpDocNum = subDocListCHelpDocNum;
    }

    @JsonProperty("subDocListCHelpIssuingAuth")
    public SubDocListCHelpIssuingAuth getSubDocListCHelpIssuingAuth() {
        return subDocListCHelpIssuingAuth;
    }

    @JsonProperty("subDocListCHelpIssuingAuth")
    public void setSubDocListCHelpIssuingAuth(SubDocListCHelpIssuingAuth subDocListCHelpIssuingAuth) {
        this.subDocListCHelpIssuingAuth = subDocListCHelpIssuingAuth;
    }

    @JsonProperty("subDocListCHelpDocTitle")
    public SubDocListCHelpDocTitle getSubDocListCHelpDocTitle() {
        return subDocListCHelpDocTitle;
    }

    @JsonProperty("subDocListCHelpDocTitle")
    public void setSubDocListCHelpDocTitle(SubDocListCHelpDocTitle subDocListCHelpDocTitle) {
        this.subDocListCHelpDocTitle = subDocListCHelpDocTitle;
    }

    @JsonProperty("subDocDummyHelp")
    public SubDocDummyHelp getSubDocDummyHelp() {
        return subDocDummyHelp;
    }

    @JsonProperty("subDocDummyHelp")
    public void setSubDocDummyHelp(SubDocDummyHelp subDocDummyHelp) {
        this.subDocDummyHelp = subDocDummyHelp;
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
