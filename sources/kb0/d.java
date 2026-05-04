package kb0;

import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.UintMap;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: l, reason: collision with root package name */
    public static final int f66282l = 256;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f66283m = 7;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f66284n = 9;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f66285o = 10;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f66286p = 11;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f66287q = 8;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f66288r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f66289s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f66290t = 5;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f66291u = 6;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f66292v = 12;

    /* renamed from: w, reason: collision with root package name */
    public static final byte f66293w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f66294x = 65535;

    /* renamed from: a, reason: collision with root package name */
    public ClassFileWriter f66295a;

    /* renamed from: b, reason: collision with root package name */
    public UintMap f66296b = new UintMap();

    /* renamed from: c, reason: collision with root package name */
    public ObjToIntMap f66297c = new ObjToIntMap();

    /* renamed from: d, reason: collision with root package name */
    public ObjToIntMap f66298d = new ObjToIntMap();

    /* renamed from: e, reason: collision with root package name */
    public ObjToIntMap f66299e = new ObjToIntMap();

    /* renamed from: f, reason: collision with root package name */
    public ObjToIntMap f66300f = new ObjToIntMap();

    /* renamed from: i, reason: collision with root package name */
    public UintMap f66303i = new UintMap();

    /* renamed from: j, reason: collision with root package name */
    public UintMap f66304j = new UintMap();

    /* renamed from: h, reason: collision with root package name */
    public int f66302h = 1;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f66305k = new byte[256];

    /* renamed from: g, reason: collision with root package name */
    public int f66301g = 0;

    public d(ClassFileWriter classFileWriter) {
        this.f66295a = classFileWriter;
    }

    public short a(String str) {
        String str2;
        int i11 = this.f66300f.get(str, -1);
        if (i11 == -1) {
            if (str.indexOf(46) > 0) {
                String u02 = ClassFileWriter.u0(str);
                int i12 = this.f66300f.get(u02, -1);
                if (i12 != -1) {
                    this.f66300f.put(str, i12);
                }
                str2 = u02;
                i11 = i12;
            } else {
                str2 = str;
            }
            if (i11 == -1) {
                short k11 = k(str2);
                l(3);
                byte[] bArr = this.f66305k;
                int i13 = this.f66301g;
                int i14 = i13 + 1;
                this.f66301g = i14;
                bArr[i13] = 7;
                this.f66301g = ClassFileWriter.G0(k11, bArr, i14);
                i11 = this.f66302h;
                this.f66302h = i11 + 1;
                this.f66300f.put(str2, i11);
                if (str != str2) {
                    this.f66300f.put(str, i11);
                }
            }
        }
        r(i11, str);
        this.f66304j.put(i11, 7);
        return (short) i11;
    }

    public int b(double d11) {
        l(9);
        byte[] bArr = this.f66305k;
        int i11 = this.f66301g;
        this.f66301g = i11 + 1;
        bArr[i11] = 6;
        this.f66301g = ClassFileWriter.I0(Double.doubleToLongBits(d11), this.f66305k, this.f66301g);
        int i12 = this.f66302h;
        this.f66302h = i12 + 2;
        this.f66304j.put(i12, 6);
        return i12;
    }

    public int c(float f11) {
        l(5);
        byte[] bArr = this.f66305k;
        int i11 = this.f66301g;
        this.f66301g = i11 + 1;
        bArr[i11] = 4;
        this.f66301g = ClassFileWriter.H0(Float.floatToIntBits(f11), this.f66305k, this.f66301g);
        this.f66304j.put(this.f66302h, 4);
        int i12 = this.f66302h;
        this.f66302h = i12 + 1;
        return i12;
    }

    public int d(int i11) {
        l(5);
        byte[] bArr = this.f66305k;
        int i12 = this.f66301g;
        int i13 = i12 + 1;
        this.f66301g = i13;
        bArr[i12] = 3;
        this.f66301g = ClassFileWriter.H0(i11, bArr, i13);
        this.f66304j.put(this.f66302h, 3);
        int i14 = this.f66302h;
        this.f66302h = i14 + 1;
        return (short) i14;
    }

    public int e(long j11) {
        l(9);
        byte[] bArr = this.f66305k;
        int i11 = this.f66301g;
        int i12 = i11 + 1;
        this.f66301g = i12;
        bArr[i11] = 5;
        this.f66301g = ClassFileWriter.I0(j11, bArr, i12);
        int i13 = this.f66302h;
        this.f66302h = i13 + 2;
        this.f66304j.put(i13, 5);
        return i13;
    }

    public int f(String str) {
        int k11 = k(str) & c2.f100412d;
        int i11 = this.f66296b.getInt(k11, -1);
        if (i11 == -1) {
            i11 = this.f66302h;
            this.f66302h = i11 + 1;
            l(3);
            byte[] bArr = this.f66305k;
            int i12 = this.f66301g;
            int i13 = i12 + 1;
            this.f66301g = i13;
            bArr[i12] = 8;
            this.f66301g = ClassFileWriter.G0(k11, bArr, i13);
            this.f66296b.put(k11, i11);
        }
        this.f66304j.put(i11, 8);
        return i11;
    }

    public short g(String str, String str2, String str3) {
        f fVar = new f(str, str2, str3);
        int i11 = this.f66298d.get(fVar, -1);
        if (i11 == -1) {
            short j11 = j(str2, str3);
            short a11 = a(str);
            l(5);
            byte[] bArr = this.f66305k;
            int i12 = this.f66301g;
            int i13 = i12 + 1;
            this.f66301g = i13;
            bArr[i12] = 9;
            int G0 = ClassFileWriter.G0(a11, bArr, i13);
            this.f66301g = G0;
            this.f66301g = ClassFileWriter.G0(j11, this.f66305k, G0);
            i11 = this.f66302h;
            this.f66302h = i11 + 1;
            this.f66298d.put(fVar, i11);
        }
        r(i11, fVar);
        this.f66304j.put(i11, 9);
        return (short) i11;
    }

    public short h(String str, String str2, String str3) {
        short j11 = j(str2, str3);
        short a11 = a(str);
        l(5);
        byte[] bArr = this.f66305k;
        int i11 = this.f66301g;
        int i12 = i11 + 1;
        this.f66301g = i12;
        bArr[i11] = 11;
        int G0 = ClassFileWriter.G0(a11, bArr, i12);
        this.f66301g = G0;
        this.f66301g = ClassFileWriter.G0(j11, this.f66305k, G0);
        r(this.f66302h, new f(str, str2, str3));
        this.f66304j.put(this.f66302h, 11);
        int i13 = this.f66302h;
        this.f66302h = i13 + 1;
        return (short) i13;
    }

    public short i(String str, String str2, String str3) {
        f fVar = new f(str, str2, str3);
        int i11 = this.f66299e.get(fVar, -1);
        if (i11 == -1) {
            short j11 = j(str2, str3);
            short a11 = a(str);
            l(5);
            byte[] bArr = this.f66305k;
            int i12 = this.f66301g;
            int i13 = i12 + 1;
            this.f66301g = i13;
            bArr[i12] = 10;
            int G0 = ClassFileWriter.G0(a11, bArr, i13);
            this.f66301g = G0;
            this.f66301g = ClassFileWriter.G0(j11, this.f66305k, G0);
            i11 = this.f66302h;
            this.f66302h = i11 + 1;
            this.f66299e.put(fVar, i11);
        }
        r(i11, fVar);
        this.f66304j.put(i11, 10);
        return (short) i11;
    }

    public final short j(String str, String str2) {
        short k11 = k(str);
        short k12 = k(str2);
        l(5);
        byte[] bArr = this.f66305k;
        int i11 = this.f66301g;
        int i12 = i11 + 1;
        this.f66301g = i12;
        bArr[i11] = 12;
        int G0 = ClassFileWriter.G0(k11, bArr, i12);
        this.f66301g = G0;
        this.f66301g = ClassFileWriter.G0(k12, this.f66305k, G0);
        this.f66304j.put(this.f66302h, 12);
        int i13 = this.f66302h;
        this.f66302h = i13 + 1;
        return (short) i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public short k(java.lang.String r14) {
        /*
            r13 = this;
            org.mozilla.javascript.ObjToIntMap r0 = r13.f66297c
            r1 = -1
            int r0 = r0.get(r14, r1)
            r2 = 1
            if (r0 != r1) goto Lad
            int r1 = r14.length()
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r1 <= r3) goto L16
        L13:
            r6 = r2
            goto La2
        L16:
            int r4 = r1 * 3
            int r4 = r4 + 3
            r13.l(r4)
            int r4 = r13.f66301g
            byte[] r5 = r13.f66305k
            r5[r4] = r2
            int r4 = r4 + 3
            org.mozilla.classfile.ClassFileWriter r5 = r13.f66295a
            char[] r5 = r5.q0(r1)
            r6 = 0
            r14.getChars(r6, r1, r5, r6)
            r7 = r6
        L30:
            if (r7 == r1) goto L7e
            char r8 = r5[r7]
            if (r8 == 0) goto L43
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 > r9) goto L43
            byte[] r9 = r13.f66305k
            int r10 = r4 + 1
            byte r8 = (byte) r8
            r9[r4] = r8
            r4 = r10
            goto L7b
        L43:
            r9 = 2047(0x7ff, float:2.868E-42)
            if (r8 <= r9) goto L67
            byte[] r9 = r13.f66305k
            int r10 = r4 + 1
            int r11 = r8 >> 12
            r11 = r11 | 224(0xe0, float:3.14E-43)
            byte r11 = (byte) r11
            r9[r4] = r11
            int r11 = r4 + 2
            int r12 = r8 >> 6
            r12 = r12 & 63
            r12 = r12 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            r9[r10] = r12
            int r4 = r4 + 3
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r9[r11] = r8
            goto L7b
        L67:
            byte[] r9 = r13.f66305k
            int r10 = r4 + 1
            int r11 = r8 >> 6
            r11 = r11 | 192(0xc0, float:2.69E-43)
            byte r11 = (byte) r11
            r9[r4] = r11
            int r4 = r4 + 2
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r9[r10] = r8
        L7b:
            int r7 = r7 + 1
            goto L30
        L7e:
            int r1 = r13.f66301g
            int r5 = r1 + 3
            int r5 = r4 - r5
            if (r5 <= r3) goto L87
            goto L13
        L87:
            byte[] r0 = r13.f66305k
            int r3 = r1 + 1
            int r7 = r5 >>> 8
            byte r7 = (byte) r7
            r0[r3] = r7
            int r1 = r1 + 2
            byte r3 = (byte) r5
            r0[r1] = r3
            r13.f66301g = r4
            int r0 = r13.f66302h
            int r1 = r0 + 1
            r13.f66302h = r1
            org.mozilla.javascript.ObjToIntMap r1 = r13.f66297c
            r1.put(r14, r0)
        La2:
            if (r6 != 0) goto La5
            goto Lad
        La5:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Too big string"
            r14.<init>(r0)
            throw r14
        Lad:
            r13.r(r0, r14)
            org.mozilla.javascript.UintMap r14 = r13.f66304j
            r14.put(r0, r2)
            short r14 = (short) r0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kb0.d.k(java.lang.String):short");
    }

    public void l(int i11) {
        int i12 = this.f66301g;
        int i13 = i12 + i11;
        byte[] bArr = this.f66305k;
        if (i13 > bArr.length) {
            int length = bArr.length * 2;
            if (i12 + i11 > length) {
                length = i12 + i11;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            this.f66305k = bArr2;
        }
    }

    public Object m(int i11) {
        return this.f66303i.getObject(i11);
    }

    public byte n(int i11) {
        return (byte) this.f66304j.getInt(i11, 0);
    }

    public int o(String str, int i11, int i12) {
        int i13 = 65535;
        if ((i12 - i11) * 3 > 65535) {
            while (i11 != i12) {
                char charAt = str.charAt(i11);
                i13 = (charAt == 0 || charAt > 127) ? charAt < 2047 ? i13 - 2 : i13 - 3 : i13 - 1;
                if (i13 < 0) {
                    return i11;
                }
                i11++;
            }
        }
        return i12;
    }

    public int p() {
        return this.f66301g + 2;
    }

    public boolean q(String str) {
        int length = str.length();
        if (length * 3 <= 65535) {
            return true;
        }
        return length <= 65535 && length == o(str, 0, length);
    }

    public void r(int i11, Object obj) {
        this.f66303i.put(i11, obj);
    }

    public int s(byte[] bArr, int i11) {
        int G0 = ClassFileWriter.G0((short) this.f66302h, bArr, i11);
        System.arraycopy(this.f66305k, 0, bArr, G0, this.f66301g);
        return G0 + this.f66301g;
    }
}
