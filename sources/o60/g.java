package o60;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g implements n60.b, n60.a {

    /* renamed from: l, reason: collision with root package name */
    public static final int f76295l = 76;

    /* renamed from: m, reason: collision with root package name */
    public static final int f76296m = 64;

    /* renamed from: n, reason: collision with root package name */
    public static final int f76297n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f76298o = 8192;

    /* renamed from: p, reason: collision with root package name */
    public static final int f76299p = 255;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f76300q = 61;

    /* renamed from: a, reason: collision with root package name */
    public final byte f76301a = 61;

    /* renamed from: b, reason: collision with root package name */
    public final int f76302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76304d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76305e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f76306f;

    /* renamed from: g, reason: collision with root package name */
    public int f76307g;

    /* renamed from: h, reason: collision with root package name */
    public int f76308h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f76309i;

    /* renamed from: j, reason: collision with root package name */
    public int f76310j;

    /* renamed from: k, reason: collision with root package name */
    public int f76311k;

    public g(int i11, int i12, int i13, int i14) {
        this.f76302b = i11;
        this.f76303c = i12;
        this.f76304d = (i13 <= 0 || i14 <= 0) ? 0 : (i13 / i12) * i12;
        this.f76305e = i14;
    }

    public static boolean q(byte b11) {
        return b11 == 9 || b11 == 10 || b11 == 13 || b11 == 32;
    }

    public int c() {
        if (this.f76306f != null) {
            return this.f76307g - this.f76308h;
        }
        return 0;
    }

    public boolean d(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b11 : bArr) {
            if (61 == b11 || n(b11)) {
                return true;
            }
        }
        return false;
    }

    @Override // n60.d
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void e(byte[] bArr, int i11, int i12);

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public byte[] f(String str) {
        return decode(l.g(str));
    }

    public abstract void g(byte[] bArr, int i11, int i12);

    public String h(byte[] bArr) {
        return l.o(encode(bArr));
    }

    public String i(byte[] bArr) {
        return l.o(encode(bArr));
    }

    public void j(int i11) {
        byte[] bArr = this.f76306f;
        if (bArr == null || bArr.length < this.f76307g + i11) {
            t();
        }
    }

    public int k() {
        return 8192;
    }

    public long l(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.f76302b;
        long j11 = (((length + i11) - 1) / i11) * this.f76303c;
        int i12 = this.f76304d;
        return i12 > 0 ? j11 + ((((i12 + j11) - 1) / i12) * this.f76305e) : j11;
    }

    public boolean m() {
        return this.f76306f != null;
    }

    public abstract boolean n(byte b11);

    public boolean o(String str) {
        return p(l.g(str), true);
    }

    public boolean p(byte[] bArr, boolean z11) {
        byte b11;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (!n(bArr[i11]) && (!z11 || ((b11 = bArr[i11]) != 61 && !q(b11)))) {
                return false;
            }
        }
        return true;
    }

    public int r(byte[] bArr, int i11, int i12) {
        if (this.f76306f == null) {
            return this.f76309i ? -1 : 0;
        }
        int min = Math.min(c(), i12);
        System.arraycopy(this.f76306f, this.f76308h, bArr, i11, min);
        int i13 = this.f76308h + min;
        this.f76308h = i13;
        if (i13 >= this.f76307g) {
            this.f76306f = null;
        }
        return min;
    }

    public final void s() {
        this.f76306f = null;
        this.f76307g = 0;
        this.f76308h = 0;
        this.f76310j = 0;
        this.f76311k = 0;
        this.f76309i = false;
    }

    public final void t() {
        byte[] bArr = this.f76306f;
        if (bArr == null) {
            this.f76306f = new byte[k()];
            this.f76307g = 0;
            this.f76308h = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f76306f = bArr2;
        }
    }

    @Override // n60.b
    public byte[] encode(byte[] bArr) {
        s();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        g(bArr, 0, bArr.length);
        g(bArr, 0, -1);
        int i11 = this.f76307g - this.f76308h;
        byte[] bArr2 = new byte[i11];
        r(bArr2, 0, i11);
        return bArr2;
    }

    @Override // n60.a
    public byte[] decode(byte[] bArr) {
        s();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        e(bArr, 0, bArr.length);
        e(bArr, 0, -1);
        int i11 = this.f76307g;
        byte[] bArr2 = new byte[i11];
        r(bArr2, 0, i11);
        return bArr2;
    }
}
