package Homework6;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Night {
    private String IconPhrase;

    public Night() {
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
        return ". Ночью: " + IconPhrase;
    }
}
