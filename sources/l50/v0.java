package l50;

import java.io.OutputStream;
import java.util.Arrays;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJvmJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n130#1:269\n117#1:271\n130#1:272\n118#1,3:273\n125#1,2:276\n130#1:278\n125#1,2:279\n117#1:281\n130#1:282\n118#1,3:283\n125#1,2:286\n125#1,2:288\n117#1:290\n130#1:291\n118#1,3:292\n125#1,2:295\n125#1,2:297\n125#1,2:299\n117#1:301\n130#1:302\n118#1,3:303\n125#1,2:306\n117#1:308\n130#1:309\n118#1,3:310\n125#1,2:313\n125#1,2:315\n125#1,2:317\n125#1,2:319\n117#1:321\n130#1:322\n118#1,3:323\n125#1,2:326\n117#1:328\n130#1:329\n118#1,3:330\n125#1,2:333\n125#1,2:335\n117#1:337\n130#1:338\n118#1,3:339\n125#1,2:342\n117#1:344\n130#1:345\n118#1,3:346\n125#1,2:349\n125#1,2:351\n125#1,2:353\n117#1:355\n130#1:356\n118#1,3:357\n125#1,2:360\n125#1,2:362\n125#1,2:364\n125#1,2:366\n1#2:270\n*S KotlinDebug\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n*L\n117#1:269\n148#1:271\n148#1:272\n148#1:273,3\n149#1:276,2\n151#1:278\n158#1:279,2\n165#1:281\n165#1:282\n165#1:283,3\n166#1:286,2\n167#1:288,2\n173#1:290\n173#1:291\n173#1:292,3\n174#1:295,2\n175#1:297,2\n176#1:299,2\n186#1:301\n186#1:302\n186#1:303,3\n187#1:306,2\n196#1:308\n196#1:309\n196#1:310,3\n197#1:313,2\n198#1:315,2\n199#1:317,2\n200#1:319,2\n215#1:321\n215#1:322\n215#1:323,3\n216#1:326,2\n221#1:328\n221#1:329\n221#1:330,3\n222#1:333,2\n223#1:335,2\n228#1:337\n228#1:338\n228#1:339,3\n229#1:342,2\n234#1:344\n234#1:345\n234#1:346,3\n235#1:349,2\n236#1:351,2\n237#1:353,2\n242#1:355\n242#1:356\n242#1:357,3\n243#1:360,2\n244#1:362,2\n245#1:364,2\n246#1:366,2\n*E\n"})
/* loaded from: classes8.dex */
public final class v0 implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final OutputStream f70077b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final byte[] f70078c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public char[] f70079d;

    /* renamed from: e, reason: collision with root package name */
    public int f70080e;

    public v0(@m80.k OutputStream stream) {
        kotlin.jvm.internal.g0.p(stream, "stream");
        this.f70077b = stream;
        this.f70078c = l.f70018c.d();
        this.f70079d = n.f70036c.d();
    }

    @Override // l50.e0
    public void a(char c11) {
        k(c11);
    }

    @Override // l50.e0
    public void b(@m80.k String text) {
        kotlin.jvm.internal.g0.p(text, "text");
        f(0, text.length() + 2);
        char[] cArr = this.f70079d;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i11 = length + 1;
        for (int i12 = 1; i12 < i11; i12++) {
            char c11 = cArr[i12];
            if (c11 < q1.a().length && q1.a()[c11] != 0) {
                d(i12, text);
                return;
            }
        }
        cArr[i11] = '\"';
        j(cArr, length + 2);
        g();
    }

    @Override // l50.e0
    public void c(@m80.k String text) {
        kotlin.jvm.internal.g0.p(text, "text");
        int length = text.length();
        f(0, length);
        text.getChars(0, length, this.f70079d, 0);
        j(this.f70079d, length);
    }

    public final void d(int i11, String str) {
        int i12;
        int length = str.length();
        for (int i13 = i11 - 1; i13 < length; i13++) {
            int f11 = f(i11, 2);
            char charAt = str.charAt(i13);
            if (charAt < q1.a().length) {
                byte b11 = q1.a()[charAt];
                if (b11 == 0) {
                    i12 = f11 + 1;
                    this.f70079d[f11] = charAt;
                } else {
                    if (b11 == 1) {
                        String str2 = q1.b()[charAt];
                        kotlin.jvm.internal.g0.m(str2);
                        int f12 = f(f11, str2.length());
                        str2.getChars(0, str2.length(), this.f70079d, f12);
                        i11 = f12 + str2.length();
                    } else {
                        char[] cArr = this.f70079d;
                        cArr[f11] = '\\';
                        cArr[f11 + 1] = (char) b11;
                        i11 = f11 + 2;
                    }
                }
            } else {
                i12 = f11 + 1;
                this.f70079d[f11] = charAt;
            }
            i11 = i12;
        }
        f(i11, 1);
        char[] cArr2 = this.f70079d;
        cArr2[i11] = '\"';
        j(cArr2, i11 + 1);
        g();
    }

    public final void e(int i11) {
        if (this.f70078c.length - this.f70080e < i11) {
            g();
        }
    }

    public final int f(int i11, int i12) {
        int i13 = i12 + i11;
        char[] cArr = this.f70079d;
        if (cArr.length <= i13) {
            char[] copyOf = Arrays.copyOf(cArr, g10.u.u(i13, i11 * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f70079d = copyOf;
        }
        return i11;
    }

    public final void g() {
        this.f70077b.write(this.f70078c, 0, this.f70080e);
        this.f70080e = 0;
    }

    public final int h() {
        return this.f70078c.length - this.f70080e;
    }

    public final void i(int i11) {
        byte[] bArr = this.f70078c;
        int i12 = this.f70080e;
        this.f70080e = i12 + 1;
        bArr[i12] = (byte) i11;
    }

    public final void j(char[] cArr, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i11 > cArr.length) {
            throw new IllegalArgumentException(("count > string.length: " + i11 + " > " + cArr.length).toString());
        }
        int i12 = 0;
        while (i12 < i11) {
            char c11 = cArr[i12];
            if (c11 < 128) {
                if (this.f70078c.length - this.f70080e < 1) {
                    g();
                }
                byte[] bArr = this.f70078c;
                int i13 = this.f70080e;
                int i14 = i13 + 1;
                this.f70080e = i14;
                bArr[i13] = (byte) c11;
                i12++;
                int min = Math.min(i11, (bArr.length - i14) + i12);
                while (i12 < min) {
                    char c12 = cArr[i12];
                    if (c12 < 128) {
                        byte[] bArr2 = this.f70078c;
                        int i15 = this.f70080e;
                        this.f70080e = i15 + 1;
                        bArr2[i15] = (byte) c12;
                        i12++;
                    }
                }
            } else {
                if (c11 < 2048) {
                    if (this.f70078c.length - this.f70080e < 2) {
                        g();
                    }
                    byte[] bArr3 = this.f70078c;
                    int i16 = this.f70080e;
                    int i17 = i16 + 1;
                    this.f70080e = i17;
                    bArr3[i16] = (byte) ((c11 >> 6) | 192);
                    int i18 = (c11 & s60.d.f88057a) | 128;
                    this.f70080e = i16 + 2;
                    bArr3[i17] = (byte) i18;
                } else if (c11 < 55296 || c11 > 57343) {
                    if (this.f70078c.length - this.f70080e < 3) {
                        g();
                    }
                    byte[] bArr4 = this.f70078c;
                    int i19 = this.f70080e;
                    int i21 = i19 + 1;
                    this.f70080e = i21;
                    bArr4[i19] = (byte) ((c11 >> '\f') | 224);
                    int i22 = i19 + 2;
                    this.f70080e = i22;
                    bArr4[i21] = (byte) (((c11 >> 6) & 63) | 128);
                    int i23 = (c11 & s60.d.f88057a) | 128;
                    this.f70080e = i19 + 3;
                    bArr4[i22] = (byte) i23;
                } else {
                    int i24 = i12 + 1;
                    char c13 = i24 < i11 ? cArr[i24] : (char) 0;
                    if (c11 > 56319 || 56320 > c13 || c13 >= 57344) {
                        if (this.f70078c.length - this.f70080e < 1) {
                            g();
                        }
                        byte[] bArr5 = this.f70078c;
                        int i25 = this.f70080e;
                        this.f70080e = i25 + 1;
                        bArr5[i25] = (byte) 63;
                        i12 = i24;
                    } else {
                        int i26 = (((c11 & 1023) << 10) | (c13 & 1023)) + 65536;
                        if (this.f70078c.length - this.f70080e < 4) {
                            g();
                        }
                        byte[] bArr6 = this.f70078c;
                        int i27 = this.f70080e;
                        int i28 = i27 + 1;
                        this.f70080e = i28;
                        bArr6[i27] = (byte) ((i26 >> 18) | 240);
                        int i29 = i27 + 2;
                        this.f70080e = i29;
                        bArr6[i28] = (byte) (((i26 >> 12) & 63) | 128);
                        int i31 = i27 + 3;
                        this.f70080e = i31;
                        bArr6[i29] = (byte) (((i26 >> 6) & 63) | 128);
                        this.f70080e = i27 + 4;
                        bArr6[i31] = (byte) ((i26 & 63) | 128);
                        i12 += 2;
                    }
                }
                i12++;
            }
        }
    }

    public final void k(int i11) {
        if (i11 < 128) {
            if (this.f70078c.length - this.f70080e < 1) {
                g();
            }
            byte[] bArr = this.f70078c;
            int i12 = this.f70080e;
            this.f70080e = i12 + 1;
            bArr[i12] = (byte) i11;
            return;
        }
        if (i11 < 2048) {
            if (this.f70078c.length - this.f70080e < 2) {
                g();
            }
            byte[] bArr2 = this.f70078c;
            int i13 = this.f70080e;
            int i14 = i13 + 1;
            this.f70080e = i14;
            bArr2[i13] = (byte) ((i11 >> 6) | 192);
            this.f70080e = i13 + 2;
            bArr2[i14] = (byte) ((i11 & 63) | 128);
            return;
        }
        if (55296 <= i11 && i11 < 57344) {
            if (this.f70078c.length - this.f70080e < 1) {
                g();
            }
            byte[] bArr3 = this.f70078c;
            int i15 = this.f70080e;
            this.f70080e = i15 + 1;
            bArr3[i15] = (byte) 63;
            return;
        }
        if (i11 < 65536) {
            if (this.f70078c.length - this.f70080e < 3) {
                g();
            }
            byte[] bArr4 = this.f70078c;
            int i16 = this.f70080e;
            int i17 = i16 + 1;
            this.f70080e = i17;
            bArr4[i16] = (byte) ((i11 >> 12) | 224);
            int i18 = i16 + 2;
            this.f70080e = i18;
            bArr4[i17] = (byte) (((i11 >> 6) & 63) | 128);
            this.f70080e = i16 + 3;
            bArr4[i18] = (byte) ((i11 & 63) | 128);
            return;
        }
        if (i11 > 1114111) {
            throw new JsonEncodingException("Unexpected code point: " + i11);
        }
        if (this.f70078c.length - this.f70080e < 4) {
            g();
        }
        byte[] bArr5 = this.f70078c;
        int i19 = this.f70080e;
        int i21 = i19 + 1;
        this.f70080e = i21;
        bArr5[i19] = (byte) ((i11 >> 18) | 240);
        int i22 = i19 + 2;
        this.f70080e = i22;
        bArr5[i21] = (byte) (((i11 >> 12) & 63) | 128);
        int i23 = i19 + 3;
        this.f70080e = i23;
        bArr5[i22] = (byte) (((i11 >> 6) & 63) | 128);
        this.f70080e = i19 + 4;
        bArr5[i23] = (byte) ((i11 & 63) | 128);
    }

    @Override // l50.e0
    public void release() {
        g();
        n.f70036c.c(this.f70079d);
        l.f70018c.c(this.f70078c);
    }

    @Override // l50.e0
    public void writeLong(long j11) {
        c(String.valueOf(j11));
    }
}
