package s60;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import n60.g;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends d implements g, n60.f {

    /* renamed from: f, reason: collision with root package name */
    public static final BitSet f88047f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f88048g = 32;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f88049h = 95;

    /* renamed from: d, reason: collision with root package name */
    public final String f88050d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f88051e;

    static {
        BitSet bitSet = new BitSet(256);
        f88047f = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i11 = 48; i11 <= 57; i11++) {
            f88047f.set(i11);
        }
        BitSet bitSet2 = f88047f;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i12 = 65; i12 <= 90; i12++) {
            f88047f.set(i12);
        }
        BitSet bitSet3 = f88047f;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i13 = 97; i13 <= 122; i13++) {
            f88047f.set(i13);
        }
        BitSet bitSet4 = f88047f;
        bitSet4.set(123);
        bitSet4.set(124);
        bitSet4.set(125);
        bitSet4.set(126);
    }

    public b() {
        this("UTF-8");
    }

    @Override // n60.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return h(str, i());
    }

    @Override // n60.f
    public String b(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return c(str);
        } catch (UnsupportedEncodingException e11) {
            throw new DecoderException(e11.getMessage(), e11);
        }
    }

    @Override // s60.d
    public byte[] d(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        for (byte b11 : bArr) {
            if (b11 == 95) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b12 = bArr[i11];
                    if (b12 != 95) {
                        bArr2[i11] = b12;
                    } else {
                        bArr2[i11] = 32;
                    }
                }
                return c.d(bArr2);
            }
        }
        return c.d(bArr);
    }

    @Override // n60.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return b((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using Q codec");
    }

    @Override // s60.d
    public byte[] e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] g11 = c.g(f88047f, bArr);
        if (this.f88051e) {
            for (int i11 = 0; i11 < g11.length; i11++) {
                if (g11[i11] == 32) {
                    g11[i11] = f88049h;
                }
            }
        }
        return g11;
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using Q codec");
    }

    @Override // s60.d
    public String g() {
        return "Q";
    }

    public String h(String str, String str2) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return f(str, str2);
        } catch (UnsupportedEncodingException e11) {
            throw new EncoderException(e11.getMessage(), e11);
        }
    }

    public String i() {
        return this.f88050d;
    }

    public boolean j() {
        return this.f88051e;
    }

    public void k(boolean z11) {
        this.f88051e = z11;
    }

    public b(String str) {
        this.f88051e = false;
        this.f88050d = str;
    }
}
