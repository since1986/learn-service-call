package com.github.since1986.learn.cloud.service.a;

import java.io.Serializable;

public class Echo implements Serializable {

    private long id;

    private String content;

    private long timestamp;

    public Echo() {
    }

    private Echo(Builder builder) {
        setId(builder.id);
        setContent(builder.content);
        setTimestamp(builder.timestamp);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static final class Builder {
        private long id;
        private String content;
        private long timestamp;

        private Builder() {
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Echo build() {
            return new Echo(this);
        }
    }
}
