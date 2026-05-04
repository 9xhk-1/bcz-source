package o60;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k implements n60.b, n60.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f76329b = "UTF-8";

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f76330c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f76331d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f76332a;

    public k() {
        this.f76332a = "UTF-8";
    }

    public static byte[] c(char[] cArr) throws DecoderException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new DecoderException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i11 + 1;
            int i14 = (i(cArr[i11], i11) << 4) | i(cArr[i13], i13);
            i11 += 2;
            bArr[i12] = (byte) (i14 & 255);
            i12++;
        }
        return bArr;
    }

    public static char[] d(byte[] bArr) {
        return e(bArr, true);
    }

    public static char[] e(byte[] bArr, boolean z11) {
        return f(bArr, z11 ? f76330c : f76331d);
    }

    public static char[] f(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            cArr2[i11] = cArr[(b11 & 240) >>> 4];
            i11 += 2;
            cArr2[i12] = cArr[b11 & 15];
        }
        return cArr2;
    }

    public static String g(byte[] bArr) {
        return new String(d(bArr));
    }

    public static int i(char c11, int i11) throws DecoderException {
        int digit = Character.digit(c11, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Illegal hexadecimal character " + c11 + " at index " + i11);
    }

    @Override // n60.a
    public byte[] decode(byte[] bArr) throws DecoderException {
        try {
            return c(new String(bArr, h()).toCharArray());
        } catch (UnsupportedEncodingException e11) {
            throw new DecoderException(e11.getMessage(), e11);
        }
    }

    @Override // n60.b
    public byte[] encode(byte[] bArr) {
        return l.b(g(bArr), h());
    }

    public String h() {
        return this.f76332a;
    }

    public String toString() {
        return super.toString() + "[charsetName=" + this.f76332a + "]";
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        try {
            return d(obj instanceof String ? ((String) obj).getBytes(h()) : (byte[]) obj);
        } catch (UnsupportedEncodingException e11) {
            throw new EncoderException(e11.getMessage(), e11);
        } catch (ClassCastException e12) {
            throw new EncoderException(e12.getMessage(), e12);
        }
    }

    public k(String str) {
        this.f76332a = str;
    }

    @Override // n60.d
    public Object decode(Object obj) throws DecoderException {
        try {
            return c(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e11) {
            throw new DecoderException(e11.getMessage(), e11);
        }
    }
}
