package org.mozilla.javascript.tools.shell;

import java.io.OutputStream;
import javax.swing.SwingUtilities;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class ConsoleWriter extends OutputStream {
    private StringBuffer buffer = new StringBuffer();
    private ConsoleTextArea textArea;

    public ConsoleWriter(ConsoleTextArea consoleTextArea) {
        this.textArea = consoleTextArea;
    }

    private void flushBuffer() {
        String stringBuffer = this.buffer.toString();
        this.buffer.setLength(0);
        SwingUtilities.invokeLater(new ConsoleWrite(this.textArea, stringBuffer));
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        if (this.buffer.length() > 0) {
            flushBuffer();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i11) {
        this.buffer.append((char) i11);
        if (i11 == 10) {
            flushBuffer();
        }
    }

    public synchronized void write(char[] cArr, int i11, int i12) {
        while (i11 < i12) {
            try {
                this.buffer.append(cArr[i11]);
                if (cArr[i11] == '\n') {
                    flushBuffer();
                }
                i11++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
