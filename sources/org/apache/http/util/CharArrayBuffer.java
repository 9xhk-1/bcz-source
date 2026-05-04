package org.apache.http.util;

import c80.f;
import e80.a;
import java.io.Serializable;
import java.nio.CharBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class CharArrayBuffer implements CharSequence, Serializable {
    private static final long serialVersionUID = -6208952725094867135L;
    private char[] buffer;
    private int len;

    public CharArrayBuffer(int i11) {
        a.h(i11, "Buffer capacity");
        this.buffer = new char[i11];
    }

    private void expand(int i11) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i11)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
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
        int i14 = this.len + i12;
        if (i14 > this.buffer.length) {
            expand(i14);
        }
        System.arraycopy(cArr, i11, this.buffer, this.len, i12);
        this.len = i14;
    }

    public char[] buffer() {
        return this.buffer;
    }

    public int capacity() {
        return this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.buffer[i11];
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

    public int indexOf(int i11, int i12, int i13) {
        if (i12 < 0) {
            i12 = 0;
        }
        int i14 = this.len;
        if (i13 > i14) {
            i13 = i14;
        }
        if (i12 > i13) {
            return -1;
        }
        while (i12 < i13) {
            if (this.buffer[i12] == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

    @Override // java.lang.CharSequence
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

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i11);
        }
        if (i12 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i12 + " > length: " + this.len);
        }
        if (i11 <= i12) {
            return CharBuffer.wrap(this.buffer, i11, i12);
        }
        throw new IndexOutOfBoundsException("beginIndex: " + i11 + " > endIndex: " + i12);
    }

    public String substring(int i11, int i12) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i11);
        }
        if (i12 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i12 + " > length: " + this.len);
        }
        if (i11 <= i12) {
            return new String(this.buffer, i11, i12 - i11);
        }
        throw new IndexOutOfBoundsException("beginIndex: " + i11 + " > endIndex: " + i12);
    }

    public String substringTrimmed(int i11, int i12) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i11);
        }
        if (i12 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i12 + " > length: " + this.len);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("beginIndex: " + i11 + " > endIndex: " + i12);
        }
        while (i11 < i12 && f.a(this.buffer[i11])) {
            i11++;
        }
        while (i12 > i11 && f.a(this.buffer[i12 - 1])) {
            i12--;
        }
        return new String(this.buffer, i11, i12 - i11);
    }

    public char[] toCharArray() {
        int i11 = this.len;
        char[] cArr = new char[i11];
        if (i11 > 0) {
            System.arraycopy(this.buffer, 0, cArr, 0, i11);
        }
        return cArr;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.len);
    }

    public int indexOf(int i11) {
        return indexOf(i11, 0, this.len);
    }

    public void append(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i11 = this.len + length;
        if (i11 > this.buffer.length) {
            expand(i11);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i11;
    }

    public void append(CharArrayBuffer charArrayBuffer, int i11, int i12) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, i11, i12);
    }

    public void append(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, 0, charArrayBuffer.len);
    }

    public void append(char c11) {
        int i11 = this.len + 1;
        if (i11 > this.buffer.length) {
            expand(i11);
        }
        this.buffer[this.len] = c11;
        this.len = i11;
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
        int i14 = this.len;
        int i15 = i12 + i14;
        if (i15 > this.buffer.length) {
            expand(i15);
        }
        while (i14 < i15) {
            this.buffer[i14] = (char) (bArr[i11] & 255);
            i11++;
            i14++;
        }
        this.len = i15;
    }

    public void append(ByteArrayBuffer byteArrayBuffer, int i11, int i12) {
        if (byteArrayBuffer == null) {
            return;
        }
        append(byteArrayBuffer.buffer(), i11, i12);
    }

    public void append(Object obj) {
        append(String.valueOf(obj));
    }
}
