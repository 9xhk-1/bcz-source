package com.getui.gtc.base.util.io;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class Base64InputStream extends InputStream {
    private int[] buffer;
    private int bufferCounter = 0;
    private boolean eof = false;
    private InputStream inputStream;

    public Base64InputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r1[2] == '=') goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void acquire() throws java.io.IOException {
        /*
            r11 = this;
            r0 = 4
            char[] r1 = new char[r0]
            r2 = 0
            r3 = r2
        L5:
            java.io.InputStream r4 = r11.inputStream
            int r4 = r4.read()
            r5 = -1
            java.lang.String r6 = "Bad base64 stream"
            r7 = 1
            if (r4 != r5) goto L20
            if (r3 != 0) goto L1a
            int[] r0 = new int[r2]
            r11.buffer = r0
            r11.eof = r7
            return
        L1a:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L20:
            char r4 = (char) r4
            java.lang.String r8 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            int r9 = r8.indexOf(r4)
            r10 = 61
            if (r9 != r5) goto L3d
            if (r4 != r10) goto L2e
            goto L3d
        L2e:
            r9 = 13
            if (r4 == r9) goto L42
            r9 = 10
            if (r4 != r9) goto L37
            goto L42
        L37:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L3d:
            int r9 = r3 + 1
            r1[r3] = r4
            r3 = r9
        L42:
            if (r3 < r0) goto L5
            r3 = r2
            r4 = r3
        L46:
            if (r3 >= r0) goto L5b
            char r9 = r1[r3]
            if (r9 == r10) goto L55
            if (r4 != 0) goto L4f
            goto L58
        L4f:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L55:
            if (r4 != 0) goto L58
            r4 = r7
        L58:
            int r3 = r3 + 1
            goto L46
        L5b:
            r3 = 3
            char r4 = r1[r3]
            if (r4 != r10) goto L70
            java.io.InputStream r3 = r11.inputStream
            int r3 = r3.read()
            if (r3 != r5) goto L72
            r11.eof = r7
            r3 = 2
            char r4 = r1[r3]
            if (r4 != r10) goto L70
            goto L78
        L70:
            r7 = r3
            goto L78
        L72:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L78:
            r3 = r2
            r4 = r3
        L7a:
            if (r3 >= r0) goto L8d
            char r5 = r1[r3]
            if (r5 == r10) goto L8a
            int r5 = r8.indexOf(r5)
            int r6 = 3 - r3
            int r6 = r6 * 6
            int r5 = r5 << r6
            r4 = r4 | r5
        L8a:
            int r3 = r3 + 1
            goto L7a
        L8d:
            int[] r0 = new int[r7]
            r11.buffer = r0
        L91:
            if (r2 >= r7) goto La2
            int[] r0 = r11.buffer
            int r1 = 2 - r2
            int r1 = r1 * 8
            int r1 = r4 >>> r1
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0[r2] = r1
            int r2 = r2 + 1
            goto L91
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.base.util.io.Base64InputStream.acquire():void");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int[] iArr = this.buffer;
        if (iArr == null || this.bufferCounter == iArr.length) {
            if (this.eof) {
                return -1;
            }
            acquire();
            if (this.buffer.length == 0) {
                this.buffer = null;
                return -1;
            }
            this.bufferCounter = 0;
        }
        int[] iArr2 = this.buffer;
        int i11 = this.bufferCounter;
        this.bufferCounter = i11 + 1;
        return iArr2[i11];
    }
}
