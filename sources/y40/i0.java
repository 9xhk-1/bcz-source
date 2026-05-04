package y40;

import java.io.EOFException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nkotlinx/io/Utf8Kt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 Sinks.kt\nkotlinx/io/SinksKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsKt\n*L\n1#1,624:1\n471#1,7:631\n478#1,15:640\n496#1,57:674\n471#1,7:735\n478#1,15:744\n496#1,57:778\n38#2:625\n38#2:629\n38#2:733\n95#2:838\n95#2:839\n95#2:840\n95#2:841\n95#2:842\n95#2:843\n95#2:844\n95#2:845\n95#2:846\n95#2:847\n374#3,3:626\n374#3:630\n375#3,2:731\n374#3:734\n375#3,2:835\n262#4,2:638\n266#4,19:655\n262#4,2:742\n266#4,19:759\n262#4,23:848\n262#4,23:871\n262#4,23:894\n262#4,23:917\n262#4,23:940\n262#4,23:963\n262#4,23:986\n378#4,3:1009\n381#4,3:1013\n1#5:837\n434#6:1012\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nkotlinx/io/Utf8Kt\n*L\n173#1:631,7\n173#1:640,15\n173#1:674,57\n194#1:735,7\n194#1:744,15\n194#1:778,57\n89#1:625\n171#1:629\n192#1:733\n395#1:838\n397#1:839\n402#1:840\n404#1:841\n409#1:842\n411#1:843\n416#1:844\n418#1:845\n439#1:846\n442#1:847\n153#1:626,3\n173#1:630\n173#1:731,2\n194#1:734\n194#1:835,2\n173#1:638,2\n173#1:655,19\n194#1:742,2\n194#1:759,19\n477#1:848,23\n498#1:871,23\n511#1:894,23\n538#1:917,23\n570#1:940,23\n584#1:963,23\n594#1:986,23\n610#1:1009,3\n610#1:1013,3\n613#1:1012\n*E\n"})
/* loaded from: classes8.dex */
public final class i0 {
    public static final String a(b bVar, long j11) {
        if (j11 == 0) {
            return "";
        }
        d50.d dVar = d50.d.f47268a;
        t k11 = bVar.k();
        if (k11 == null) {
            throw new IllegalStateException("Unreacheable");
        }
        d50.b unused = d50.f.f47269a;
        if (k11.n() < j11) {
            return c50.a.b(g0.d(bVar, (int) j11), 0, 0, 3, null);
        }
        byte[] b11 = k11.b(true);
        int h11 = k11.h();
        String a11 = c50.a.a(b11, h11, Math.min(k11.d(), ((int) j11) + h11));
        bVar.skip(j11);
        return a11;
    }

    public static final int b(b bVar) {
        int i11;
        int i12;
        int i13;
        bVar.F(1L);
        byte j11 = bVar.j(0L);
        if ((j11 & 128) == 0) {
            i11 = j11 & Byte.MAX_VALUE;
            i13 = 0;
            i12 = 1;
        } else if ((j11 & ws.c.f96768m) == 192) {
            i11 = j11 & 31;
            i12 = 2;
            i13 = 128;
        } else if ((j11 & 240) == 224) {
            i11 = j11 & 15;
            i12 = 3;
            i13 = 2048;
        } else {
            if ((j11 & 248) != 240) {
                bVar.skip(1L);
                return 65533;
            }
            i11 = j11 & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j12 = i12;
        if (bVar.r() < j12) {
            throw new EOFException("size < " + i12 + ": " + bVar.r() + " (to read code point prefixed 0x" + k0.q(j11) + ')');
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j13 = i14;
            byte j14 = bVar.j(j13);
            if ((j14 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
                bVar.skip(j13);
                return 65533;
            }
            i11 = (i11 << 6) | (j14 & 63);
        }
        bVar.skip(j12);
        if (i11 > 1114111) {
            return 65533;
        }
        if ((55296 > i11 || i11 >= 57344) && i11 >= i13) {
            return i11;
        }
        return 65533;
    }

    public static final void c(b bVar, int i11, int i12, x00.l<? super Integer, Character> lVar) {
        d50.c cVar;
        char charValue;
        d50.c cVar2;
        d50.c cVar3;
        d50.c cVar4;
        while (i11 < i12) {
            char charValue2 = lVar.invoke(Integer.valueOf(i11)).charValue();
            if (charValue2 < 128) {
                d50.d dVar = d50.d.f47268a;
                t d02 = bVar.d0(1);
                cVar = d50.f.f47270b;
                int i13 = -i11;
                int min = Math.min(i12, d02.l() + i11);
                int i14 = i11 + 1;
                cVar.c(d02, i11 + i13, (byte) charValue2);
                while (true) {
                    i11 = i14;
                    if (i11 >= min || (charValue = lVar.invoke(Integer.valueOf(i11)).charValue()) >= 128) {
                        break;
                    }
                    i14 = i11 + 1;
                    cVar.c(d02, i11 + i13, (byte) charValue);
                }
                int i15 = i13 + i11;
                if (i15 == 1) {
                    d02.x(d02.d() + i15);
                    bVar.Z(bVar.w() + i15);
                } else {
                    if (i15 < 0 || i15 > d02.l()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i15 + ". Should be in 0.." + d02.l()).toString());
                    }
                    if (i15 != 0) {
                        d02.x(d02.d() + i15);
                        bVar.Z(bVar.w() + i15);
                    } else if (v.d(d02)) {
                        bVar.U();
                    }
                }
            } else {
                if (charValue2 < 2048) {
                    d50.d dVar2 = d50.d.f47268a;
                    t d03 = bVar.d0(2);
                    cVar2 = d50.f.f47270b;
                    cVar2.d(d03, 0, (byte) ((charValue2 >> 6) | 192), (byte) ((charValue2 & s60.d.f88057a) | 128));
                    d03.x(d03.d() + 2);
                    bVar.Z(bVar.w() + 2);
                } else if (charValue2 < 55296 || charValue2 > 57343) {
                    d50.d dVar3 = d50.d.f47268a;
                    t d04 = bVar.d0(3);
                    cVar3 = d50.f.f47270b;
                    cVar3.b(d04, 0, (byte) ((charValue2 >> '\f') | 224), (byte) (((charValue2 >> 6) & 63) | 128), (byte) ((charValue2 & s60.d.f88057a) | 128));
                    d04.x(d04.d() + 3);
                    bVar.Z(bVar.w() + 3);
                } else {
                    int i16 = i11 + 1;
                    char charValue3 = i16 < i12 ? lVar.invoke(Integer.valueOf(i16)).charValue() : (char) 0;
                    if (charValue2 > 56319 || 56320 > charValue3 || charValue3 >= 57344) {
                        bVar.u((byte) 63);
                        i11 = i16;
                    } else {
                        int i17 = (((charValue2 & 1023) << 10) | (charValue3 & 1023)) + 65536;
                        d50.d dVar4 = d50.d.f47268a;
                        t d05 = bVar.d0(4);
                        cVar4 = d50.f.f47270b;
                        cVar4.a(d05, 0, (byte) ((i17 >> 18) | 240), (byte) (((i17 >> 12) & 63) | 128), (byte) (((i17 >> 6) & 63) | 128), (byte) ((i17 & 63) | 128));
                        d05.x(d05.d() + 4);
                        bVar.Z(bVar.w() + 4);
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
    }

    public static final void d(b bVar, int i11) {
        d50.c cVar;
        d50.c cVar2;
        d50.c cVar3;
        if (i11 < 0 || i11 > 1114111) {
            throw new IllegalArgumentException("Code point value is out of Unicode codespace 0..0x10ffff: 0x" + k0.r(i11) + " (" + i11 + ')');
        }
        if (i11 < 128) {
            bVar.u((byte) i11);
            return;
        }
        if (i11 < 2048) {
            d50.d dVar = d50.d.f47268a;
            t d02 = bVar.d0(2);
            cVar3 = d50.f.f47270b;
            cVar3.c(d02, 0, (byte) ((i11 >> 6) | 192));
            cVar3.c(d02, 1, (byte) ((i11 & 63) | 128));
            d02.x(d02.d() + 2);
            bVar.Z(bVar.w() + 2);
            return;
        }
        if (55296 <= i11 && i11 < 57344) {
            bVar.u((byte) 63);
            return;
        }
        if (i11 < 65536) {
            d50.d dVar2 = d50.d.f47268a;
            t d03 = bVar.d0(3);
            cVar2 = d50.f.f47270b;
            cVar2.c(d03, 0, (byte) ((i11 >> 12) | 224));
            cVar2.c(d03, 1, (byte) (((i11 >> 6) & 63) | 128));
            cVar2.c(d03, 2, (byte) ((i11 & 63) | 128));
            d03.x(d03.d() + 3);
            bVar.Z(bVar.w() + 3);
            return;
        }
        d50.d dVar3 = d50.d.f47268a;
        t d04 = bVar.d0(4);
        cVar = d50.f.f47270b;
        cVar.c(d04, 0, (byte) ((i11 >> 18) | 240));
        cVar.c(d04, 1, (byte) (((i11 >> 12) & 63) | 128));
        cVar.c(d04, 2, (byte) (((i11 >> 6) & 63) | 128));
        cVar.c(d04, 3, (byte) ((i11 & 63) | 128));
        d04.x(d04.d() + 4);
        bVar.Z(bVar.w() + 4);
    }

    public static final int e(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        if (c0Var instanceof b) {
            return b((b) c0Var);
        }
        c0Var.F(1L);
        byte j11 = c0Var.getBuffer().j(0L);
        if ((j11 & ws.c.f96768m) == 192) {
            c0Var.F(2L);
        } else if ((j11 & 240) == 224) {
            c0Var.F(3L);
        } else if ((j11 & 248) == 240) {
            c0Var.F(4L);
        }
        return b(c0Var.getBuffer());
    }

    @m80.l
    public static final String f(@m80.k c0 c0Var) {
        int i11;
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        if (!c0Var.request(1L)) {
            return null;
        }
        long b11 = g0.b(c0Var, (byte) 10, 0L, 0L, 6, null);
        if (b11 == -1) {
            return j(c0Var);
        }
        if (b11 == 0) {
            c0Var.skip(1L);
            return "";
        }
        long j11 = b11 - 1;
        if (c0Var.getBuffer().j(j11) == 13) {
            i11 = 2;
            b11 = j11;
        } else {
            i11 = 1;
        }
        String k11 = k(c0Var, b11);
        c0Var.skip(i11);
        return k11;
    }

    @m80.k
    public static final String g(@m80.k c0 c0Var, long j11) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        if (j11 < 0) {
            throw new IllegalArgumentException(("limit (" + j11 + ") < 0").toString());
        }
        long j12 = 1;
        c0Var.F(1L);
        long a11 = g0.a(c0Var, (byte) 10, 0L, j11);
        if (a11 == 0) {
            c0Var.skip(1L);
            return "";
        }
        if (a11 > 0) {
            long j13 = a11 - 1;
            if (c0Var.getBuffer().j(j13) == 13) {
                j12 = 2;
                a11 = j13;
            }
            String k11 = k(c0Var, a11);
            c0Var.skip(j12);
            return k11;
        }
        if (c0Var.getBuffer().r() < j11) {
            throw new EOFException();
        }
        if (j11 == Long.MAX_VALUE) {
            throw new EOFException();
        }
        long j14 = j11 + 1;
        if (!c0Var.request(j14)) {
            throw new EOFException();
        }
        byte j15 = c0Var.getBuffer().j(j11);
        if (j15 == 10) {
            String k12 = k(c0Var, j11);
            c0Var.skip(1L);
            return k12;
        }
        if (j15 != 13 || !c0Var.request(2 + j11)) {
            throw new EOFException();
        }
        if (c0Var.getBuffer().j(j14) != 10) {
            throw new EOFException();
        }
        String k13 = k(c0Var, j11);
        c0Var.skip(2L);
        return k13;
    }

    public static /* synthetic */ String h(c0 c0Var, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return g(c0Var, j11);
    }

    @m80.k
    public static final String i(@m80.k b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return a(bVar, bVar.r());
    }

    @m80.k
    public static final String j(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        c0Var.request(Long.MAX_VALUE);
        return a(c0Var.getBuffer(), c0Var.getBuffer().r());
    }

    @m80.k
    public static final String k(@m80.k c0 c0Var, long j11) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        c0Var.F(j11);
        return a(c0Var.getBuffer(), j11);
    }

    public static final long l(@m80.k String str, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(str, "<this>");
        k0.e(str.length(), i11, i12);
        long j11 = 0;
        while (i11 < i12) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                j11++;
            } else {
                if (charAt < 2048) {
                    i13 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i13 = 3;
                } else {
                    int i14 = i11 + 1;
                    char charAt2 = i14 < i12 ? str.charAt(i14) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j11++;
                        i11 = i14;
                    } else {
                        j11 += 4;
                        i11 += 2;
                    }
                }
                j11 += i13;
            }
            i11++;
        }
        return j11;
    }

    public static /* synthetic */ long m(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return l(str, i11, i12);
    }

    public static final void n(@m80.k x xVar, int i11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        d(xVar.getBuffer(), i11);
        xVar.U0();
    }

    public static final void o(@m80.k x xVar, @m80.k CharSequence chars, int i11, int i12) {
        d50.c cVar;
        int i13;
        d50.c cVar2;
        d50.c cVar3;
        d50.c cVar4;
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        int i14 = i11;
        k0.e(chars.length(), i14, i12);
        b buffer = xVar.getBuffer();
        while (i14 < i12) {
            Ref.IntRef intRef = new Ref.IntRef();
            char charAt = chars.charAt(i14);
            intRef.element = charAt;
            if (charAt < 128) {
                d50.d dVar = d50.d.f47268a;
                t d02 = buffer.d0(1);
                cVar = d50.f.f47270b;
                int i15 = -i14;
                int min = Math.min(i12, d02.l() + i14);
                cVar.c(d02, i14 + i15, (byte) intRef.element);
                i14++;
                while (i14 < min) {
                    char charAt2 = chars.charAt(i14);
                    intRef.element = charAt2;
                    if (charAt2 >= 128) {
                        break;
                    }
                    cVar.c(d02, i14 + i15, (byte) charAt2);
                    i14++;
                }
                int i16 = i15 + i14;
                if (i16 == 1) {
                    d02.x(d02.d() + i16);
                    buffer.Z(buffer.w() + i16);
                } else {
                    if (i16 < 0 || i16 > d02.l()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i16 + ". Should be in 0.." + d02.l()).toString());
                    }
                    if (i16 != 0) {
                        d02.x(d02.d() + i16);
                        buffer.Z(buffer.w() + i16);
                    } else if (v.d(d02)) {
                        buffer.U();
                    }
                }
            } else {
                if (charAt < 2048) {
                    d50.d dVar2 = d50.d.f47268a;
                    i13 = 2;
                    t d03 = buffer.d0(2);
                    cVar2 = d50.f.f47270b;
                    int i17 = intRef.element;
                    cVar2.d(d03, 0, (byte) ((i17 >> 6) | 192), (byte) ((i17 & 63) | 128));
                    d03.x(d03.d() + 2);
                } else if (charAt < 55296 || charAt > 57343) {
                    d50.d dVar3 = d50.d.f47268a;
                    i13 = 3;
                    t d04 = buffer.d0(3);
                    cVar3 = d50.f.f47270b;
                    int i18 = intRef.element;
                    cVar3.b(d04, 0, (byte) ((i18 >> 12) | 224), (byte) (((i18 >> 6) & 63) | 128), (byte) ((i18 & 63) | 128));
                    d04.x(d04.d() + 3);
                } else {
                    int i19 = i14 + 1;
                    char charAt3 = i19 < i12 ? chars.charAt(i19) : (char) 0;
                    int i21 = intRef.element;
                    if (i21 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        buffer.u((byte) 63);
                        i14 = i19;
                    } else {
                        int i22 = (((i21 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        d50.d dVar4 = d50.d.f47268a;
                        t d05 = buffer.d0(4);
                        cVar4 = d50.f.f47270b;
                        cVar4.a(d05, 0, (byte) ((i22 >> 18) | 240), (byte) (((i22 >> 12) & 63) | 128), (byte) (((i22 >> 6) & 63) | 128), (byte) ((i22 & 63) | 128));
                        d05.x(d05.d() + 4);
                        buffer.Z(buffer.w() + 4);
                        i14 += 2;
                    }
                }
                buffer.Z(buffer.w() + i13);
                i14++;
            }
        }
        xVar.U0();
    }

    public static final void p(@m80.k x xVar, @m80.k String string, int i11, int i12) {
        d50.c cVar;
        int i13;
        d50.c cVar2;
        d50.c cVar3;
        d50.c cVar4;
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(string, "string");
        int i14 = i11;
        k0.e(string.length(), i14, i12);
        b buffer = xVar.getBuffer();
        while (i14 < i12) {
            Ref.IntRef intRef = new Ref.IntRef();
            char charAt = string.charAt(i14);
            intRef.element = charAt;
            if (charAt < 128) {
                d50.d dVar = d50.d.f47268a;
                t d02 = buffer.d0(1);
                cVar = d50.f.f47270b;
                int i15 = -i14;
                int min = Math.min(i12, d02.l() + i14);
                cVar.c(d02, i14 + i15, (byte) intRef.element);
                i14++;
                while (i14 < min) {
                    char charAt2 = string.charAt(i14);
                    intRef.element = charAt2;
                    if (charAt2 >= 128) {
                        break;
                    }
                    cVar.c(d02, i14 + i15, (byte) charAt2);
                    i14++;
                }
                int i16 = i15 + i14;
                if (i16 == 1) {
                    d02.x(d02.d() + i16);
                    buffer.Z(buffer.w() + i16);
                } else {
                    if (i16 < 0 || i16 > d02.l()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i16 + ". Should be in 0.." + d02.l()).toString());
                    }
                    if (i16 != 0) {
                        d02.x(d02.d() + i16);
                        buffer.Z(buffer.w() + i16);
                    } else if (v.d(d02)) {
                        buffer.U();
                    }
                }
            } else {
                if (charAt < 2048) {
                    d50.d dVar2 = d50.d.f47268a;
                    i13 = 2;
                    t d03 = buffer.d0(2);
                    cVar2 = d50.f.f47270b;
                    int i17 = intRef.element;
                    cVar2.d(d03, 0, (byte) ((i17 >> 6) | 192), (byte) ((i17 & 63) | 128));
                    d03.x(d03.d() + 2);
                } else if (charAt < 55296 || charAt > 57343) {
                    d50.d dVar3 = d50.d.f47268a;
                    i13 = 3;
                    t d04 = buffer.d0(3);
                    cVar3 = d50.f.f47270b;
                    int i18 = intRef.element;
                    cVar3.b(d04, 0, (byte) ((i18 >> 12) | 224), (byte) (((i18 >> 6) & 63) | 128), (byte) ((i18 & 63) | 128));
                    d04.x(d04.d() + 3);
                } else {
                    int i19 = i14 + 1;
                    char charAt3 = i19 < i12 ? string.charAt(i19) : (char) 0;
                    int i21 = intRef.element;
                    if (i21 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        buffer.u((byte) 63);
                        i14 = i19;
                    } else {
                        int i22 = (((i21 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        d50.d dVar4 = d50.d.f47268a;
                        t d05 = buffer.d0(4);
                        cVar4 = d50.f.f47270b;
                        cVar4.a(d05, 0, (byte) ((i22 >> 18) | 240), (byte) (((i22 >> 12) & 63) | 128), (byte) (((i22 >> 6) & 63) | 128), (byte) ((i22 & 63) | 128));
                        d05.x(d05.d() + 4);
                        buffer.Z(buffer.w() + 4);
                        i14 += 2;
                    }
                }
                buffer.Z(buffer.w() + i13);
                i14++;
            }
        }
        xVar.U0();
    }

    public static /* synthetic */ void q(x xVar, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        o(xVar, charSequence, i11, i12);
    }

    public static /* synthetic */ void r(x xVar, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        p(xVar, str, i11, i12);
    }
}
