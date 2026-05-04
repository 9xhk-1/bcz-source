package org.fusesource.jansi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum AnsiMode {
    Strip("Strip all ansi sequences"),
    Default("Print ansi sequences if the stream is a terminal"),
    Force("Always print ansi sequences, even if the stream is redirected");

    private final String description;

    AnsiMode(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
