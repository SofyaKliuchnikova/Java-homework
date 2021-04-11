package Homework6;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Maximum {
    private float Value;
    private String Unit;

    public Maximum() {
    }

    @JsonGetter("Value")
    public float getValue() {
        return Value;
    }

    @JsonGetter("Unit")
    public String getUnit() {
        return Unit;
    }


    public void setValue(float Value) {
        this.Value = Value;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    @Override
    public String toString() {
        return " максимальная " + Value + " °" + Unit;
    }
}
