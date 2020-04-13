
package com.example.docureader.model.I9;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "section1Page1",
    "section2and3Page2",
    "appendixPrint",
    "AcceptableDocuments",
    "textFieldLastNameMultiPrep1",
    "textFieldFirstNameMultiPrep1",
    "textFieldAddressMultiPrep1",
    "textFieldCityOrTownMultiPrep1",
    "StateMultiPrep1",
    "textFieldZipCodeMultiPrep1",
    "textFieldLastNameMultiPrep2",
    "textFieldFirstNameMultiPrep2",
    "textFieldAddressMultiPrep2",
    "textFieldCityOrTownMultiPrep2",
    "StateMultiPrep2",
    "textFieldZipCodeMultiPrep2",
    "textFieldLastNameMultiPrep3",
    "textFieldFirstNameMultiPrep3",
    "textFieldAddressMultiPrep3",
    "textFieldCityOrTownMultiPrep3",
    "StateMultiPrep3",
    "textFieldZipCodeMultiPrep3",
    "textFieldLastNameMultiPrep4",
    "textFieldFirstNameMultiPrep4",
    "textFieldAddressMultiPrep4",
    "textFieldCityOrTownMultiPrep4",
    "StateMultiPrep4",
    "textFieldZipCodeMultiPrep4",
    "textFieldEmployerTitle",
    "textBusinessOrgName",
    "textFieldDocumentTitle",
    "textFieldDocumentNum",
    "textFieldEmployerName"
})
public class I9Form {

    @JsonProperty("section1Page1")
    private Section1Page1 section1Page1;
    @JsonProperty("section2and3Page2")
    private Section2and3Page2 section2and3Page2;
    @JsonProperty("appendixPrint")
    private AppendixPrint appendixPrint;
    @JsonProperty("AcceptableDocuments")
    private AcceptableDocuments acceptableDocuments;
    @JsonProperty("textFieldLastNameMultiPrep1")
    private Object textFieldLastNameMultiPrep1;
    @JsonProperty("textFieldFirstNameMultiPrep1")
    private Object textFieldFirstNameMultiPrep1;
    @JsonProperty("textFieldAddressMultiPrep1")
    private Object textFieldAddressMultiPrep1;
    @JsonProperty("textFieldCityOrTownMultiPrep1")
    private Object textFieldCityOrTownMultiPrep1;
    @JsonProperty("StateMultiPrep1")
    private Object stateMultiPrep1;
    @JsonProperty("textFieldZipCodeMultiPrep1")
    private Object textFieldZipCodeMultiPrep1;
    @JsonProperty("textFieldLastNameMultiPrep2")
    private Object textFieldLastNameMultiPrep2;
    @JsonProperty("textFieldFirstNameMultiPrep2")
    private Object textFieldFirstNameMultiPrep2;
    @JsonProperty("textFieldAddressMultiPrep2")
    private Object textFieldAddressMultiPrep2;
    @JsonProperty("textFieldCityOrTownMultiPrep2")
    private Object textFieldCityOrTownMultiPrep2;
    @JsonProperty("StateMultiPrep2")
    private Object stateMultiPrep2;
    @JsonProperty("textFieldZipCodeMultiPrep2")
    private Object textFieldZipCodeMultiPrep2;
    @JsonProperty("textFieldLastNameMultiPrep3")
    private Object textFieldLastNameMultiPrep3;
    @JsonProperty("textFieldFirstNameMultiPrep3")
    private Object textFieldFirstNameMultiPrep3;
    @JsonProperty("textFieldAddressMultiPrep3")
    private Object textFieldAddressMultiPrep3;
    @JsonProperty("textFieldCityOrTownMultiPrep3")
    private Object textFieldCityOrTownMultiPrep3;
    @JsonProperty("StateMultiPrep3")
    private Object stateMultiPrep3;
    @JsonProperty("textFieldZipCodeMultiPrep3")
    private Object textFieldZipCodeMultiPrep3;
    @JsonProperty("textFieldLastNameMultiPrep4")
    private Object textFieldLastNameMultiPrep4;
    @JsonProperty("textFieldFirstNameMultiPrep4")
    private Object textFieldFirstNameMultiPrep4;
    @JsonProperty("textFieldAddressMultiPrep4")
    private Object textFieldAddressMultiPrep4;
    @JsonProperty("textFieldCityOrTownMultiPrep4")
    private Object textFieldCityOrTownMultiPrep4;
    @JsonProperty("StateMultiPrep4")
    private Object stateMultiPrep4;
    @JsonProperty("textFieldZipCodeMultiPrep4")
    private Object textFieldZipCodeMultiPrep4;
    @JsonProperty("textFieldEmployerTitle")
    private String textFieldEmployerTitle;
    @JsonProperty("textBusinessOrgName")
    private String textBusinessOrgName;
    @JsonProperty("textFieldDocumentTitle")
    private Object textFieldDocumentTitle;
    @JsonProperty("textFieldDocumentNum")
    private Object textFieldDocumentNum;
    @JsonProperty("textFieldEmployerName")
    private Object textFieldEmployerName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("section1Page1")
    public Section1Page1 getSection1Page1() {
        return section1Page1;
    }

    @JsonProperty("section1Page1")
    public void setSection1Page1(Section1Page1 section1Page1) {
        this.section1Page1 = section1Page1;
    }

    @JsonProperty("section2and3Page2")
    public Section2and3Page2 getSection2and3Page2() {
        return section2and3Page2;
    }

    @JsonProperty("section2and3Page2")
    public void setSection2and3Page2(Section2and3Page2 section2and3Page2) {
        this.section2and3Page2 = section2and3Page2;
    }

    @JsonProperty("appendixPrint")
    public AppendixPrint getAppendixPrint() {
        return appendixPrint;
    }

    @JsonProperty("appendixPrint")
    public void setAppendixPrint(AppendixPrint appendixPrint) {
        this.appendixPrint = appendixPrint;
    }

    @JsonProperty("AcceptableDocuments")
    public AcceptableDocuments getAcceptableDocuments() {
        return acceptableDocuments;
    }

    @JsonProperty("AcceptableDocuments")
    public void setAcceptableDocuments(AcceptableDocuments acceptableDocuments) {
        this.acceptableDocuments = acceptableDocuments;
    }

    @JsonProperty("textFieldLastNameMultiPrep1")
    public Object getTextFieldLastNameMultiPrep1() {
        return textFieldLastNameMultiPrep1;
    }

    @JsonProperty("textFieldLastNameMultiPrep1")
    public void setTextFieldLastNameMultiPrep1(Object textFieldLastNameMultiPrep1) {
        this.textFieldLastNameMultiPrep1 = textFieldLastNameMultiPrep1;
    }

    @JsonProperty("textFieldFirstNameMultiPrep1")
    public Object getTextFieldFirstNameMultiPrep1() {
        return textFieldFirstNameMultiPrep1;
    }

    @JsonProperty("textFieldFirstNameMultiPrep1")
    public void setTextFieldFirstNameMultiPrep1(Object textFieldFirstNameMultiPrep1) {
        this.textFieldFirstNameMultiPrep1 = textFieldFirstNameMultiPrep1;
    }

    @JsonProperty("textFieldAddressMultiPrep1")
    public Object getTextFieldAddressMultiPrep1() {
        return textFieldAddressMultiPrep1;
    }

    @JsonProperty("textFieldAddressMultiPrep1")
    public void setTextFieldAddressMultiPrep1(Object textFieldAddressMultiPrep1) {
        this.textFieldAddressMultiPrep1 = textFieldAddressMultiPrep1;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep1")
    public Object getTextFieldCityOrTownMultiPrep1() {
        return textFieldCityOrTownMultiPrep1;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep1")
    public void setTextFieldCityOrTownMultiPrep1(Object textFieldCityOrTownMultiPrep1) {
        this.textFieldCityOrTownMultiPrep1 = textFieldCityOrTownMultiPrep1;
    }

    @JsonProperty("StateMultiPrep1")
    public Object getStateMultiPrep1() {
        return stateMultiPrep1;
    }

    @JsonProperty("StateMultiPrep1")
    public void setStateMultiPrep1(Object stateMultiPrep1) {
        this.stateMultiPrep1 = stateMultiPrep1;
    }

    @JsonProperty("textFieldZipCodeMultiPrep1")
    public Object getTextFieldZipCodeMultiPrep1() {
        return textFieldZipCodeMultiPrep1;
    }

    @JsonProperty("textFieldZipCodeMultiPrep1")
    public void setTextFieldZipCodeMultiPrep1(Object textFieldZipCodeMultiPrep1) {
        this.textFieldZipCodeMultiPrep1 = textFieldZipCodeMultiPrep1;
    }

    @JsonProperty("textFieldLastNameMultiPrep2")
    public Object getTextFieldLastNameMultiPrep2() {
        return textFieldLastNameMultiPrep2;
    }

    @JsonProperty("textFieldLastNameMultiPrep2")
    public void setTextFieldLastNameMultiPrep2(Object textFieldLastNameMultiPrep2) {
        this.textFieldLastNameMultiPrep2 = textFieldLastNameMultiPrep2;
    }

    @JsonProperty("textFieldFirstNameMultiPrep2")
    public Object getTextFieldFirstNameMultiPrep2() {
        return textFieldFirstNameMultiPrep2;
    }

    @JsonProperty("textFieldFirstNameMultiPrep2")
    public void setTextFieldFirstNameMultiPrep2(Object textFieldFirstNameMultiPrep2) {
        this.textFieldFirstNameMultiPrep2 = textFieldFirstNameMultiPrep2;
    }

    @JsonProperty("textFieldAddressMultiPrep2")
    public Object getTextFieldAddressMultiPrep2() {
        return textFieldAddressMultiPrep2;
    }

    @JsonProperty("textFieldAddressMultiPrep2")
    public void setTextFieldAddressMultiPrep2(Object textFieldAddressMultiPrep2) {
        this.textFieldAddressMultiPrep2 = textFieldAddressMultiPrep2;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep2")
    public Object getTextFieldCityOrTownMultiPrep2() {
        return textFieldCityOrTownMultiPrep2;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep2")
    public void setTextFieldCityOrTownMultiPrep2(Object textFieldCityOrTownMultiPrep2) {
        this.textFieldCityOrTownMultiPrep2 = textFieldCityOrTownMultiPrep2;
    }

    @JsonProperty("StateMultiPrep2")
    public Object getStateMultiPrep2() {
        return stateMultiPrep2;
    }

    @JsonProperty("StateMultiPrep2")
    public void setStateMultiPrep2(Object stateMultiPrep2) {
        this.stateMultiPrep2 = stateMultiPrep2;
    }

    @JsonProperty("textFieldZipCodeMultiPrep2")
    public Object getTextFieldZipCodeMultiPrep2() {
        return textFieldZipCodeMultiPrep2;
    }

    @JsonProperty("textFieldZipCodeMultiPrep2")
    public void setTextFieldZipCodeMultiPrep2(Object textFieldZipCodeMultiPrep2) {
        this.textFieldZipCodeMultiPrep2 = textFieldZipCodeMultiPrep2;
    }

    @JsonProperty("textFieldLastNameMultiPrep3")
    public Object getTextFieldLastNameMultiPrep3() {
        return textFieldLastNameMultiPrep3;
    }

    @JsonProperty("textFieldLastNameMultiPrep3")
    public void setTextFieldLastNameMultiPrep3(Object textFieldLastNameMultiPrep3) {
        this.textFieldLastNameMultiPrep3 = textFieldLastNameMultiPrep3;
    }

    @JsonProperty("textFieldFirstNameMultiPrep3")
    public Object getTextFieldFirstNameMultiPrep3() {
        return textFieldFirstNameMultiPrep3;
    }

    @JsonProperty("textFieldFirstNameMultiPrep3")
    public void setTextFieldFirstNameMultiPrep3(Object textFieldFirstNameMultiPrep3) {
        this.textFieldFirstNameMultiPrep3 = textFieldFirstNameMultiPrep3;
    }

    @JsonProperty("textFieldAddressMultiPrep3")
    public Object getTextFieldAddressMultiPrep3() {
        return textFieldAddressMultiPrep3;
    }

    @JsonProperty("textFieldAddressMultiPrep3")
    public void setTextFieldAddressMultiPrep3(Object textFieldAddressMultiPrep3) {
        this.textFieldAddressMultiPrep3 = textFieldAddressMultiPrep3;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep3")
    public Object getTextFieldCityOrTownMultiPrep3() {
        return textFieldCityOrTownMultiPrep3;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep3")
    public void setTextFieldCityOrTownMultiPrep3(Object textFieldCityOrTownMultiPrep3) {
        this.textFieldCityOrTownMultiPrep3 = textFieldCityOrTownMultiPrep3;
    }

    @JsonProperty("StateMultiPrep3")
    public Object getStateMultiPrep3() {
        return stateMultiPrep3;
    }

    @JsonProperty("StateMultiPrep3")
    public void setStateMultiPrep3(Object stateMultiPrep3) {
        this.stateMultiPrep3 = stateMultiPrep3;
    }

    @JsonProperty("textFieldZipCodeMultiPrep3")
    public Object getTextFieldZipCodeMultiPrep3() {
        return textFieldZipCodeMultiPrep3;
    }

    @JsonProperty("textFieldZipCodeMultiPrep3")
    public void setTextFieldZipCodeMultiPrep3(Object textFieldZipCodeMultiPrep3) {
        this.textFieldZipCodeMultiPrep3 = textFieldZipCodeMultiPrep3;
    }

    @JsonProperty("textFieldLastNameMultiPrep4")
    public Object getTextFieldLastNameMultiPrep4() {
        return textFieldLastNameMultiPrep4;
    }

    @JsonProperty("textFieldLastNameMultiPrep4")
    public void setTextFieldLastNameMultiPrep4(Object textFieldLastNameMultiPrep4) {
        this.textFieldLastNameMultiPrep4 = textFieldLastNameMultiPrep4;
    }

    @JsonProperty("textFieldFirstNameMultiPrep4")
    public Object getTextFieldFirstNameMultiPrep4() {
        return textFieldFirstNameMultiPrep4;
    }

    @JsonProperty("textFieldFirstNameMultiPrep4")
    public void setTextFieldFirstNameMultiPrep4(Object textFieldFirstNameMultiPrep4) {
        this.textFieldFirstNameMultiPrep4 = textFieldFirstNameMultiPrep4;
    }

    @JsonProperty("textFieldAddressMultiPrep4")
    public Object getTextFieldAddressMultiPrep4() {
        return textFieldAddressMultiPrep4;
    }

    @JsonProperty("textFieldAddressMultiPrep4")
    public void setTextFieldAddressMultiPrep4(Object textFieldAddressMultiPrep4) {
        this.textFieldAddressMultiPrep4 = textFieldAddressMultiPrep4;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep4")
    public Object getTextFieldCityOrTownMultiPrep4() {
        return textFieldCityOrTownMultiPrep4;
    }

    @JsonProperty("textFieldCityOrTownMultiPrep4")
    public void setTextFieldCityOrTownMultiPrep4(Object textFieldCityOrTownMultiPrep4) {
        this.textFieldCityOrTownMultiPrep4 = textFieldCityOrTownMultiPrep4;
    }

    @JsonProperty("StateMultiPrep4")
    public Object getStateMultiPrep4() {
        return stateMultiPrep4;
    }

    @JsonProperty("StateMultiPrep4")
    public void setStateMultiPrep4(Object stateMultiPrep4) {
        this.stateMultiPrep4 = stateMultiPrep4;
    }

    @JsonProperty("textFieldZipCodeMultiPrep4")
    public Object getTextFieldZipCodeMultiPrep4() {
        return textFieldZipCodeMultiPrep4;
    }

    @JsonProperty("textFieldZipCodeMultiPrep4")
    public void setTextFieldZipCodeMultiPrep4(Object textFieldZipCodeMultiPrep4) {
        this.textFieldZipCodeMultiPrep4 = textFieldZipCodeMultiPrep4;
    }

    @JsonProperty("textFieldEmployerTitle")
    public String getTextFieldEmployerTitle() {
        return textFieldEmployerTitle;
    }

    @JsonProperty("textFieldEmployerTitle")
    public void setTextFieldEmployerTitle(String textFieldEmployerTitle) {
        this.textFieldEmployerTitle = textFieldEmployerTitle;
    }

    @JsonProperty("textBusinessOrgName")
    public String getTextBusinessOrgName() {
        return textBusinessOrgName;
    }

    @JsonProperty("textBusinessOrgName")
    public void setTextBusinessOrgName(String textBusinessOrgName) {
        this.textBusinessOrgName = textBusinessOrgName;
    }

    @JsonProperty("textFieldDocumentTitle")
    public Object getTextFieldDocumentTitle() {
        return textFieldDocumentTitle;
    }

    @JsonProperty("textFieldDocumentTitle")
    public void setTextFieldDocumentTitle(Object textFieldDocumentTitle) {
        this.textFieldDocumentTitle = textFieldDocumentTitle;
    }

    @JsonProperty("textFieldDocumentNum")
    public Object getTextFieldDocumentNum() {
        return textFieldDocumentNum;
    }

    @JsonProperty("textFieldDocumentNum")
    public void setTextFieldDocumentNum(Object textFieldDocumentNum) {
        this.textFieldDocumentNum = textFieldDocumentNum;
    }

    @JsonProperty("textFieldEmployerName")
    public Object getTextFieldEmployerName() {
        return textFieldEmployerName;
    }

    @JsonProperty("textFieldEmployerName")
    public void setTextFieldEmployerName(Object textFieldEmployerName) {
        this.textFieldEmployerName = textFieldEmployerName;
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
