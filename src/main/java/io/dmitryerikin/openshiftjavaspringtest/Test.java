package io.dmitryerikin.openshiftjavaspringtest;

import java.time.OffsetDateTime;

public class Test {
    private String title;
    private OffsetDateTime date;

    public Test(String title, OffsetDateTime date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }
}
