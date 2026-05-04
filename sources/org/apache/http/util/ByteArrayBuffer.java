package org.apache.http.util;

import e80.a;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class ByteArrayBuffer implements Serializable {
    private static final long serialVersionUID = 4359112959524048036L;
    private byte[] buffer;
    private int len;

    public ByteArrayBuffer(int i11) {
        a.h(i11, "Buffer capacity");
        this.buffer = new byte[i11];
    }

    private void expand(int i11) {
        byte[] bArr = new byte[Math.max(this.buffer.length << 1, i11)];
        System.arraycopy(this.buffer, 0, bArr, 0, this.len);
        this.buffer = bArr;
    }

    public void append(byte[] bArr, int i11, int i12) {
        int i13;
        if (bArr == null) {
            return;
        }
        if (i11 < 0 || i11 > bArr.length || i12 < 0 || (i13 = i11 + i12) < 0 || i13 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i11 + " len: " + i12 + " b.length: " + bArr.length);
        }
        if (i12 == 0) {
            return;
        }
        int i14 = this.len + i12;
        if (i14 > this.buffer.length) {
            expand(i14);
        }
        System.arraycopy(bArr, i11, this.buffer, this.len, i12);
        this.len = i14;
    }

    public byte[] buffer() {
        return this.buffer;
    }

    public int byteAt(int i11) {
        return this.buffer[i11];
    }

    public int capacity() {
        return this.buffer.length;
    }

    public void clear() {
        this.len = 0;
    }

    public void ensureCapacity(int i11) {
        if (i11 <= 0) {
            return;
        }
        int length = this.buffer.length;
        int i12 = this.len;
        if (i11 > length - i12) {
            expand(i12 + i11);
        }
    }

    public int indexOf(byte b11, int i11, int i12) {
        if (i11 < 0) {
            i11 = 0;
        }
        int i13 = this.len;
        if (i12 > i13) {
            i12 = i13;
        }
        if (i11 > i12) {
            return -1;
        }
        while (i11 < i12) {
            if (this.buffer[i11] == b11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

    public int length() {
        return this.len;
    }

    public void setLength(int i11) {
        if (i11 >= 0 && i11 <= this.buffer.length) {
            this.len = i11;
            return;
        }
        throw new IndexOutOfBoundsException("len: " + i11 + " < 0 or > buffer len: " + this.buffer.length);
    }

    public byte[] toByteArray() {
        int i11 = this.len;
        byte[] bArr = new byte[i11];
        if (i11 > 0) {
            System.arraycopy(this.buffer, 0, bArr, 0, i11);
        }
        return bArr;
    }

    public int indexOf(byte b11) {
        return indexOf(b11, 0, this.len);
    }

    public void append(int i11) {
        int i12 = this.len + 1;
        if (i12 > this.buffer.length) {
            expand(i12);
        }
        this.buffer[this.len] = (byte) i11;
        this.len = i12;
    }

    public void append(char[] cArr, int i11, int i12) {
        int i13;
        if (cArr == null) {
            return;
        }
        if (i11 < 0 || i11 > cArr.length || i12 < 0 || (i13 = i11 + i12) < 0 || i13 > cArr.length) {
            throw new IndexOutOfBoundsException("off: " + i11 + " len: " + i12 + " b.length: " + cArr.length);
        }
        if (i12 == 0) {
            return;
        }
        int i14 = this.len;
        int i15 = i12 + i14;
        if (i15 > this.buffer.length) {
            expand(i15);
        }
        while (i14 < i15) {
            char c11 = cArr[i11];
            if ((c11 >= ' ' && c11 <= '~') || ((c11 >= 160 && c11 <= 255) || c11 == '\t')) {
                this.buffer[i14] = (byte) c11;
            } else {
                this.buffer[i14] = 63;
            }
            i11++;
            i14++;
        }
        this.len = i15;
    }

    public void append(CharArrayBuffer charArrayBuffer, int i11, int i12) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer(), i11, i12);
    }
}
