package a3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n extends DataInputStream {

    /* renamed from: a, reason: collision with root package name */
    public char[] f1595a;

    public n(InputStream inputStream) {
        super(inputStream);
        this.f1595a = new char[32];
    }

    public int a(boolean z11) throws IOException {
        byte readByte = readByte();
        int i11 = readByte & Byte.MAX_VALUE;
        if ((readByte & 128) != 0) {
            byte readByte2 = readByte();
            i11 |= (readByte2 & Byte.MAX_VALUE) << 7;
            if ((readByte2 & 128) != 0) {
                byte readByte3 = readByte();
                i11 |= (readByte3 & Byte.MAX_VALUE) << 14;
                if ((readByte3 & 128) != 0) {
                    byte readByte4 = readByte();
                    i11 |= (readByte4 & Byte.MAX_VALUE) << 21;
                    if ((readByte4 & 128) != 0) {
                        i11 |= (readByte() & Byte.MAX_VALUE) << 28;
                    }
                }
            }
        }
        return z11 ? i11 : (i11 >>> 1) ^ (-(i11 & 1));
    }

    public final void c(int i11, int i12, int i13) throws IOException {
        char[] cArr = this.f1595a;
        while (true) {
            switch (i13 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i12] = (char) i13;
                    break;
                case 12:
                case 13:
                    cArr[i12] = (char) (((i13 & 31) << 6) | (readByte() & 63));
                    break;
                case 14:
                    cArr[i12] = (char) (((i13 & 15) << 12) | ((readByte() & 63) << 6) | (readByte() & 63));
                    break;
            }
            i12++;
            if (i12 >= i11) {
                return;
            } else {
                i13 = readByte() & 255;
            }
        }
    }

    @d0
    public String readString() throws IOException {
        int a11 = a(true);
        if (a11 == 0) {
            return null;
        }
        if (a11 == 1) {
            return "";
        }
        int i11 = a11 - 1;
        if (this.f1595a.length < i11) {
            this.f1595a = new char[i11];
        }
        char[] cArr = this.f1595a;
        int i12 = 0;
        byte b11 = 0;
        while (i12 < i11) {
            b11 = readByte();
            if (b11 < 0) {
                break;
            }
            cArr[i12] = (char) b11;
            i12++;
        }
        if (i12 < i11) {
            c(i11, i12, b11 & 255);
        }
        return new String(cArr, 0, i11);
    }
}
