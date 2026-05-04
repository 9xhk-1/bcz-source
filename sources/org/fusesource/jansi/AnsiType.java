package org.fusesource.jansi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum AnsiType {
    Native("Supports ansi sequences natively"),
    Unsupported("Ansi sequences are stripped out"),
    VirtualTerminal("Supported through windows virtual terminal"),
    Emulation("Emulated through using windows API console commands"),
    Redirected("The stream is redirected to a file or a pipe");

    private final String description;

    AnsiType(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
