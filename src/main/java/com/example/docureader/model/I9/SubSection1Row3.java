
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
    "dateFieldBirthDate",
    "SSN",
    "fieldEmail",
    "fieldPhoneNum"
})
public class SubSection1Row3 {

    @JsonProperty("dateFieldBirthDate")
    private String dateFieldBirthDate;
    @JsonProperty("SSN")
    private String sSN;
    @JsonProperty("fieldEmail")
    private String fieldEmail;
    @JsonProperty("fieldPhoneNum")
    private String fieldPhoneNum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dateFieldBirthDate")
    public String getDateFieldBirthDate() {
        return dateFieldBirthDate;
    }

    @JsonProperty("dateFieldBirthDate")
    public void setDateFieldBirthDate(String dateFieldBirthDate) {
        this.dateFieldBirthDate = dateFieldBirthDate;
    }

    @JsonProperty("SSN")
    public String getSSN() {
        return sSN;
    }

    @JsonProperty("SSN")
    public void setSSN(String sSN) {
        this.sSN = sSN;
    }

    @JsonProperty("fieldEmail")
    public String getFieldEmail() {
        return fieldEmail;
    }

    @JsonProperty("fieldEmail")
    public void setFieldEmail(String fieldEmail) {
        this.fieldEmail = fieldEmail;
    }

    @JsonProperty("fieldPhoneNum")
    public String getFieldPhoneNum() {
        return fieldPhoneNum;
    }

    @JsonProperty("fieldPhoneNum")
    public void setFieldPhoneNum(String fieldPhoneNum) {
        this.fieldPhoneNum = fieldPhoneNum;
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
