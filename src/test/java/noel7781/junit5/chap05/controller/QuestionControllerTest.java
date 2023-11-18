package noel7781.junit5.chap05.controller;

import org.junit.jupiter.api.Test;

class QuestionControllerTest {

    QuestionController questionController = new QuestionController();

    @Test
    void questionAnswersDateAdded() {
//        Instant now = new Date().toInstant();
//        questionController.setClock(Clock.fixed(now, ZoneId.of("America/Denver")));
//        int id = questionController.addBooleanQuestion("text");
//
//        Question question = questionController.find(id);
//        assertThat(question.getCreateTimestamp()).isEqualTo(now);
    }

}