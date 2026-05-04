package s60;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import n60.g;
import o60.l;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements n60.b, n60.a, g, n60.f {

    /* renamed from: b, reason: collision with root package name */
    public static final int f88060b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f88061c = 37;

    /* renamed from: d, reason: collision with root package name */
    public static final BitSet f88062d = new BitSet(256);

    /* renamed from: a, reason: collision with root package name */
    public String f88063a;

    static {
        for (int i11 = 97; i11 <= 122; i11++) {
            f88062d.set(i11);
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            f88062d.set(i12);
        }
        for (int i13 = 48; i13 <= 57; i13++) {
            f88062d.set(i13);
        }
        BitSet bitSet = f88062d;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
    }

    public e() {
        this("UTF-8");
    }

    public static final byte[] d(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (i11 < bArr.length) {
            byte b11 = bArr[i11];
            if (b11 == 43) {
                byteArrayOutputStream.write(32);
            } else if (b11 == 37) {
                try {
                    int a11 = f.a(bArr[i11 + 1]);
                    i11 += 2;
                    byteArrayOutputStream.write((char) ((a11 << 4) + f.a(bArr[i11])));
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new DecoderException("Invalid URL encoding: ", e11);
                }
            } else {
                byteArrayOutputStream.write(b11);
            }
            i11++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] f(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = f88062d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = bArr[i11];
            if (i12 < 0) {
                i12 += 256;
            }
            if (bitSet.get(i12)) {
                if (i12 == 32) {
                    i12 = 43;
                }
                byteArrayOutputStream.write(i12);
            } else {
                byteArrayOutputStream.write(37);
                char upperCase = Character.toUpperCase(Character.forDigit((i12 >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(i12 & 15, 16));
                byteArrayOutputStream.write(upperCase);
                byteArrayOutputStream.write(upperCase2);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // n60.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return e(str, g());
        } catch (UnsupportedEncodingException e11) {
            throw new EncoderException(e11.getMessage(), e11);
        }
    }

    @Override // n60.f
    public String b(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return c(str, g());
        } catch (UnsupportedEncodingException e11) {
            throw new DecoderException(e11.getMessage(), e11);
        }
    }

    public String c(String str, String str2) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(decode(l.c(str)), str2);
    }

    @Override // n60.a
    public byte[] decode(byte[] bArr) throws DecoderException {
        return d(bArr);
    }

    public String e(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return l.k(encode(str.getBytes(str2)));
    }

    @Override // n60.b
    public byte[] encode(byte[] bArr) {
        return f(f88062d, bArr);
    }

    public String g() {
        return this.f88063a;
    }

    public String h() {
        return this.f88063a;
    }

    public e(String str) {
        this.f88063a = str;
    }

    @Override // n60.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return b((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be URL decoded");
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be URL encoded");
    }
}
