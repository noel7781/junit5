package noel7781.junit5.chap05.domain;

import java.time.Instant;

public interface Persistable {
    Integer getId();

    void setId(Integer id);

    Instant getCreateTimestamp();

    void setCreateTimestamp(Instant instant);
}