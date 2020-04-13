
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
    "dateEmployeesFirstDay"
})
public class SubAttest {

    @JsonProperty("dateEmployeesFirstDay")
    private String dateEmployeesFirstDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dateEmployeesFirstDay")
    public String getDateEmployeesFirstDay() {
        return dateEmployeesFirstDay;
    }

    @JsonProperty("dateEmployeesFirstDay")
    public void setDateEmployeesFirstDay(String dateEmployeesFirstDay) {
        this.dateEmployeesFirstDay = dateEmployeesFirstDay;
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
