package ru.fella.learn.patterns.behavioral.snapshot;

import java.time.Instant;

import lombok.Data;
import lombok.SneakyThrows;
import lombok.Value;

/**
 * @author fellaru
 */
@Data
public class TextEditor {
    private String text;
    private String name;
    private Long cursor;
    private final Instant creationDay;

    public TextEditor(String text, String name, Long cursor) {
        this.text = text;
        this.name = name;
        this.cursor = cursor;
        this.creationDay = Instant.now();
    }

    public Snapshot makeSnapshot() {
        return new Snapshot();
    }

    public void restore(Snapshot snapshot) {
        text = snapshot.text;
        name = snapshot.name;
        cursor = snapshot.cursor;
    }

    public class Snapshot {
        private final String text;
        private final String name;
        private final Long cursor;

        @SneakyThrows
        private Snapshot() {
            this.text = TextEditor.this.text;
            this.name = TextEditor.this.name;
            this.cursor = TextEditor.this.cursor;
        }
    }
}
