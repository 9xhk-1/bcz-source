package org.mozilla.javascript.tools.shell;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class ConsoleWrite implements Runnable {
    private String str;
    private ConsoleTextArea textArea;

    public ConsoleWrite(ConsoleTextArea consoleTextArea, String str) {
        this.textArea = consoleTextArea;
        this.str = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.textArea.write(this.str);
    }
}
