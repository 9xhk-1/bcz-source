package o60;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j implements n60.a, n60.b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f76320c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f76321d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f76322e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f76323f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f76324g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f76325h = 32;

    /* renamed from: i, reason: collision with root package name */
    public static final int f76326i = 64;

    /* renamed from: j, reason: collision with root package name */
    public static final int f76327j = 128;

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f76318a = new char[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f76319b = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f76328k = {1, 2, 4, 8, 16, 32, 64, 128};

    public static byte[] c(byte[] bArr) {
        if (e(bArr)) {
            return f76319b;
        }
        int length = bArr.length >> 3;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length - 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = 0;
            while (true) {
                int[] iArr = f76328k;
                if (i12 < iArr.length) {
                    if (bArr[length2 - i12] == 49) {
                        bArr2[i11] = (byte) (iArr[i12] | bArr2[i11]);
                    }
                    i12++;
                }
            }
            i11++;
            length2 -= 8;
        }
        return bArr2;
    }

    public static byte[] d(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return f76319b;
        }
        int length = cArr.length >> 3;
        byte[] bArr = new byte[length];
        int length2 = cArr.length - 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = 0;
            while (true) {
                int[] iArr = f76328k;
                if (i12 < iArr.length) {
                    if (cArr[length2 - i12] == '1') {
                        bArr[i11] = (byte) (iArr[i12] | bArr[i11]);
                    }
                    i12++;
                }
            }
            i11++;
            length2 -= 8;
        }
        return bArr;
    }

    public static boolean e(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static byte[] f(byte[] bArr) {
        if (e(bArr)) {
            return f76319b;
        }
        int length = bArr.length << 3;
        byte[] bArr2 = new byte[length];
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            int i13 = 0;
            while (true) {
                int[] iArr = f76328k;
                if (i13 < iArr.length) {
                    if ((iArr[i13] & bArr[i12]) == 0) {
                        bArr2[i11 - i13] = 48;
                    } else {
                        bArr2[i11 - i13] = 49;
                    }
                    i13++;
                }
            }
            i12++;
            i11 -= 8;
        }
        return bArr2;
    }

    public static char[] g(byte[] bArr) {
        if (e(bArr)) {
            return f76318a;
        }
        int length = bArr.length << 3;
        char[] cArr = new char[length];
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            int i13 = 0;
            while (true) {
                int[] iArr = f76328k;
                if (i13 < iArr.length) {
                    if ((iArr[i13] & bArr[i12]) == 0) {
                        cArr[i11 - i13] = '0';
                    } else {
                        cArr[i11 - i13] = '1';
                    }
                    i13++;
                }
            }
            i12++;
            i11 -= 8;
        }
        return cArr;
    }

    public static String h(byte[] bArr) {
        return new String(g(bArr));
    }

    @Override // n60.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return f76319b;
        }
        if (obj instanceof byte[]) {
            return c((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return d((char[]) obj);
        }
        if (obj instanceof String) {
            return d(((String) obj).toCharArray());
        }
        throw new DecoderException("argument not a byte array");
    }

    @Override // n60.b
    public byte[] encode(byte[] bArr) {
        return f(bArr);
    }

    public byte[] i(String str) {
        return str == null ? f76319b : d(str.toCharArray());
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return g((byte[]) obj);
        }
        throw new EncoderException("argument not a byte array");
    }

    @Override // n60.a
    public byte[] decode(byte[] bArr) {
        return c(bArr);
    }
}
