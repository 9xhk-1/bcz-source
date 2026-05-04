package ya;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {
    public static int a(InputStream is2) throws IOException {
        int read = is2.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static int b(InputStream is2) throws IOException {
        return (a(is2) << 24) | a(is2) | (a(is2) << 8) | (a(is2) << 16);
    }

    public static long c(InputStream is2) throws IOException {
        return (a(is2) & 255) | ((a(is2) & 255) << 8) | ((a(is2) & 255) << 16) | ((a(is2) & 255) << 24) | ((a(is2) & 255) << 32) | ((a(is2) & 255) << 40) | ((a(is2) & 255) << 48) | ((255 & a(is2)) << 56);
    }

    public static String d(InputStream is2) throws IOException {
        return new String(e(is2, (int) c(is2)), "UTF-8");
    }

    public static byte[] e(InputStream in2, int length) throws IOException {
        byte[] bArr = new byte[length];
        int i11 = 0;
        while (i11 < length) {
            int read = in2.read(bArr, i11, length - i11);
            if (read == -1) {
                break;
            }
            i11 += read;
        }
        if (i11 == length) {
            return bArr;
        }
        throw new IOException("Expected " + length + " bytes, read " + i11 + " bytes");
    }

    public static void f(OutputStream os2, int n11) throws IOException {
        os2.write(n11 & 255);
        os2.write((n11 >> 8) & 255);
        os2.write((n11 >> 16) & 255);
        os2.write((n11 >> 24) & 255);
    }

    public static void g(OutputStream os2, long n11) throws IOException {
        os2.write((byte) n11);
        os2.write((byte) (n11 >>> 8));
        os2.write((byte) (n11 >>> 16));
        os2.write((byte) (n11 >>> 24));
        os2.write((byte) (n11 >>> 32));
        os2.write((byte) (n11 >>> 40));
        os2.write((byte) (n11 >>> 48));
        os2.write((byte) (n11 >>> 56));
    }

    public static void h(OutputStream os2, String s11) throws IOException {
        byte[] bytes = s11.getBytes("UTF-8");
        g(os2, bytes.length);
        os2.write(bytes, 0, bytes.length);
    }
}
