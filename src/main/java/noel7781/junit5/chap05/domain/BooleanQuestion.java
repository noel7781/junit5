package noel7781.junit5.chap05.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Arrays;
import java.util.List;

@Entity
@DiscriminatorValue(value = "boolean")
public class BooleanQuestion extends Question {
    private static final long serialVersionUID = 1L;

    public BooleanQuestion() {
    }

    public BooleanQuestion(String text) {
        super(text);
    }

    @Override
    public List<String> getAnswerChoices() {
        return Arrays.asList(new String[]{"No", "Yes"});
    }

    @Override
    public boolean match(int expected, int actual) {
        return expected == actual;
    }
}