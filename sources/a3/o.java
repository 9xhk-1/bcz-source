package a3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o extends DataOutputStream {
    public o(OutputStream outputStream) {
        super(outputStream);
    }

    public int a(int i11, boolean z11) throws IOException {
        if (!z11) {
            i11 = (i11 >> 31) ^ (i11 << 1);
        }
        int i12 = i11 >>> 7;
        if (i12 == 0) {
            write((byte) i11);
            return 1;
        }
        write((byte) ((i11 & 127) | 128));
        int i13 = i11 >>> 14;
        if (i13 == 0) {
            write((byte) i12);
            return 2;
        }
        write((byte) (i12 | 128));
        int i14 = i11 >>> 21;
        if (i14 == 0) {
            write((byte) i13);
            return 3;
        }
        write((byte) (i13 | 128));
        int i15 = i11 >>> 28;
        if (i15 == 0) {
            write((byte) i14);
            return 4;
        }
        write((byte) (i14 | 128));
        write((byte) i15);
        return 5;
    }

    public final void c(String str, int i11, int i12) throws IOException {
        while (i12 < i11) {
            char charAt = str.charAt(i12);
            if (charAt <= 127) {
                write((byte) charAt);
            } else if (charAt > 2047) {
                write((byte) (((charAt >> '\f') & 15) | 224));
                write((byte) (((charAt >> 6) & 63) | 128));
                write((byte) ((charAt & s60.d.f88057a) | 128));
            } else {
                write((byte) (((charAt >> 6) & 31) | 192));
                write((byte) ((charAt & s60.d.f88057a) | 128));
            }
            i12++;
        }
    }

    public void p1(@d0 String str) throws IOException {
        int i11 = 0;
        if (str == null) {
            write(0);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(1);
            return;
        }
        a(length + 1, true);
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt > 127) {
                break;
            }
            write((byte) charAt);
            i11++;
        }
        if (i11 < length) {
            c(str, length, i11);
        }
    }
}
