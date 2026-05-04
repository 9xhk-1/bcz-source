package com.getui.gtc.base.util.io;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class Base64OutputStream extends OutputStream {
    private int buffer;
    private int bytecounter;
    private int linecounter;
    private int linelength;
    private OutputStream outputStream;

    public Base64OutputStream(OutputStream outputStream) {
        this(outputStream, 76);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        commit();
        this.outputStream.close();
    }

    public void commit() throws IOException {
        if (this.bytecounter > 0) {
            int i11 = this.linelength;
            if (i11 > 0 && this.linecounter == i11) {
                this.outputStream.write("\r\n".getBytes());
                this.linecounter = 0;
            }
            char charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.buffer << 8) >>> 26);
            char charAt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.buffer << 14) >>> 26);
            char charAt3 = this.bytecounter < 2 ? '=' : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.buffer << 20) >>> 26);
            char charAt4 = this.bytecounter >= 3 ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.buffer << 26) >>> 26) : '=';
            this.outputStream.write(charAt);
            this.outputStream.write(charAt2);
            this.outputStream.write(charAt3);
            this.outputStream.write(charAt4);
            this.linecounter += 4;
            this.bytecounter = 0;
            this.buffer = 0;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        int i12 = this.bytecounter;
        this.buffer = ((i11 & 255) << (16 - (i12 * 8))) | this.buffer;
        int i13 = i12 + 1;
        this.bytecounter = i13;
        if (i13 == 3) {
            commit();
        }
    }

    public Base64OutputStream(OutputStream outputStream, int i11) {
        this.buffer = 0;
        this.bytecounter = 0;
        this.linecounter = 0;
        this.outputStream = outputStream;
        this.linelength = i11;
    }
}
