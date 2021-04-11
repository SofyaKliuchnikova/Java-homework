package Homework6;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {
    Minimum MinimumObject;
    Maximum MaximumObject;

    public Temperature() {
    }

    @JsonGetter("Minimum")
    public Minimum getMinimum() {
        return MinimumObject;
    }

    @JsonGetter ("Maximum")
    public Maximum getMaximum() {
        return MaximumObject;
    }

    public void setMinimum(Minimum MinimumObject) {
        this.MinimumObject = MinimumObject;
    }

    public void setMaximum(Maximum MaximumObject) {
        this.MaximumObject = MaximumObject;
    }

    @Override
    public String toString() {
        return ". Температура воздуха: " + MinimumObject + MaximumObject;
    }
}
