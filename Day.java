package Homework6;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    private String IconPhrase;

    public Day() {
    }

    @JsonGetter("IconPhrase")
    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String IconPhrase) {
        this.IconPhrase = IconPhrase;
    }

    @Override
    public String toString() {
        return ". Днём: " + IconPhrase;
    }
}
