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
public class c implements n60.b, n60.a, g, n60.f {

    /* renamed from: b, reason: collision with root package name */
    public static final BitSet f88052b = new BitSet(256);

    /* renamed from: c, reason: collision with root package name */
    public static final byte f88053c = 61;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f88054d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f88055e = 32;

    /* renamed from: a, reason: collision with root package name */
    public final String f88056a;

    static {
        for (int i11 = 33; i11 <= 60; i11++) {
            f88052b.set(i11);
        }
        for (int i12 = 62; i12 <= 126; i12++) {
            f88052b.set(i12);
        }
        BitSet bitSet = f88052b;
        bitSet.set(9);
        bitSet.set(32);
    }

    public c() {
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
            if (b11 == 61) {
                try {
                    int a11 = f.a(bArr[i11 + 1]);
                    i11 += 2;
                    byteArrayOutputStream.write((char) ((a11 << 4) + f.a(bArr[i11])));
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new DecoderException("Invalid quoted-printable encoding", e11);
                }
            } else {
                byteArrayOutputStream.write(b11);
            }
            i11++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final void f(int i11, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        char upperCase = Character.toUpperCase(Character.forDigit((i11 >> 4) & 15, 16));
        char upperCase2 = Character.toUpperCase(Character.forDigit(i11 & 15, 16));
        byteArrayOutputStream.write(upperCase);
        byteArrayOutputStream.write(upperCase2);
    }

    public static final byte[] g(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = f88052b;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = bArr[i11];
            if (i12 < 0) {
                i12 += 256;
            }
            if (bitSet.get(i12)) {
                byteArrayOutputStream.write(i12);
            } else {
                f(i12, byteArrayOutputStream);
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
            return e(str, h());
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
            return c(str, h());
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
        return g(f88052b, bArr);
    }

    public String h() {
        return this.f88056a;
    }

    public c(String str) {
        this.f88056a = str;
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
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded");
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
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded");
    }
}
