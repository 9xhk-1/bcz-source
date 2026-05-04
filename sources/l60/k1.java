package l60;

import ix.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "Utf8")
@kotlin.jvm.internal.u0({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n73#3:561\n67#3:562\n73#3:573\n67#3:594\n73#3:600\n67#3:642\n73#3:648\n67#3:703\n73#3:714\n67#3:735\n73#3:741\n67#3:783\n73#3:789\n73#3:845\n73#3:847\n73#3:849\n73#3:851\n73#3:853\n73#3:855\n73#3:857\n73#3:859\n73#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
/* loaded from: classes8.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f70457a = 63;

    /* renamed from: b, reason: collision with root package name */
    public static final char f70458b = 65533;

    /* renamed from: c, reason: collision with root package name */
    public static final int f70459c = 65533;

    /* renamed from: d, reason: collision with root package name */
    public static final int f70460d = 55232;

    /* renamed from: e, reason: collision with root package name */
    public static final int f70461e = 56320;

    /* renamed from: f, reason: collision with root package name */
    public static final int f70462f = 3968;

    /* renamed from: g, reason: collision with root package name */
    public static final int f70463g = -123008;

    /* renamed from: h, reason: collision with root package name */
    public static final int f70464h = 3678080;

    public static final boolean a(int i11) {
        if (i11 < 0 || i11 >= 32) {
            return 127 <= i11 && i11 < 160;
        }
        return true;
    }

    public static final boolean b(byte b11) {
        return (b11 & com.baicizhan.main.vld.bonding.j.f25378c) == 128;
    }

    public static final int c(@m80.k byte[] bArr, int i11, int i12, @m80.k x00.l<? super Integer, g2> yield) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(yield, "yield");
        int i13 = i11 + 1;
        if (i12 <= i13) {
            yield.invoke(65533);
            return 1;
        }
        byte b11 = bArr[i11];
        byte b12 = bArr[i13];
        if ((b12 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
            yield.invoke(65533);
            return 1;
        }
        int i14 = (b12 ^ 3968) ^ (b11 << 6);
        if (i14 < 128) {
            yield.invoke(65533);
            return 2;
        }
        yield.invoke(Integer.valueOf(i14));
        return 2;
    }

    public static final int d(@m80.k byte[] bArr, int i11, int i12, @m80.k x00.l<? super Integer, g2> yield) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(yield, "yield");
        int i13 = i11 + 2;
        if (i12 <= i13) {
            yield.invoke(65533);
            int i14 = i11 + 1;
            return (i12 <= i14 || (bArr[i14] & com.baicizhan.main.vld.bonding.j.f25378c) != 128) ? 1 : 2;
        }
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        if ((b12 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b13 = bArr[i13];
        if ((b13 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
            yield.invoke(65533);
            return 2;
        }
        int i15 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b11 << 12);
        if (i15 < 2048) {
            yield.invoke(65533);
            return 3;
        }
        if (55296 > i15 || i15 >= 57344) {
            yield.invoke(Integer.valueOf(i15));
            return 3;
        }
        yield.invoke(65533);
        return 3;
    }

    public static final int e(@m80.k byte[] bArr, int i11, int i12, @m80.k x00.l<? super Integer, g2> yield) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(yield, "yield");
        int i13 = i11 + 3;
        if (i12 <= i13) {
            yield.invoke(65533);
            int i14 = i11 + 1;
            if (i12 <= i14 || (bArr[i14] & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
                return 1;
            }
            int i15 = i11 + 2;
            return (i12 <= i15 || (bArr[i15] & com.baicizhan.main.vld.bonding.j.f25378c) != 128) ? 2 : 3;
        }
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        if ((b12 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b13 = bArr[i11 + 2];
        if ((b13 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
            yield.invoke(65533);
            return 2;
        }
        byte b14 = bArr[i13];
        if ((b14 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
            yield.invoke(65533);
            return 3;
        }
        int i16 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << ho.c.f59556u);
        if (i16 > 1114111) {
            yield.invoke(65533);
            return 4;
        }
        if (55296 <= i16 && i16 < 57344) {
            yield.invoke(65533);
            return 4;
        }
        if (i16 < 65536) {
            yield.invoke(65533);
            return 4;
        }
        yield.invoke(Integer.valueOf(i16));
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        if ((r12[r2] & com.baicizhan.main.vld.bonding.j.f25378c) == 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0088, code lost:
    
        if ((r12[r2] & com.baicizhan.main.vld.bonding.j.f25378c) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@m80.k byte[] r12, int r13, int r14, @m80.k x00.l<? super java.lang.Character, yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.k1.f(byte[], int, int, x00.l):void");
    }

    public static final void g(@m80.k String str, int i11, int i12, @m80.k x00.l<? super Byte, g2> yield) {
        int i13;
        char charAt;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(yield, "yield");
        while (i11 < i12) {
            char charAt2 = str.charAt(i11);
            if (kotlin.jvm.internal.g0.t(charAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) charAt2));
                i11++;
                while (i11 < i12 && kotlin.jvm.internal.g0.t(str.charAt(i11), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i11)));
                    i11++;
                }
            } else {
                if (kotlin.jvm.internal.g0.t(charAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((charAt2 & s60.d.f88057a) | 128)));
                } else if (55296 > charAt2 || charAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((charAt2 & s60.d.f88057a) | 128)));
                } else if (kotlin.jvm.internal.g0.t(charAt2, 56319) > 0 || i12 <= (i13 = i11 + 1) || 56320 > (charAt = str.charAt(i13)) || charAt >= 57344) {
                    yield.invoke((byte) 63);
                } else {
                    int charAt3 = ((charAt2 << '\n') + str.charAt(i13)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i11 += 2;
                }
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        if ((r11[r1] & com.baicizhan.main.vld.bonding.j.f25378c) == 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007d, code lost:
    
        if ((r11[r1] & com.baicizhan.main.vld.bonding.j.f25378c) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@m80.k byte[] r11, int r12, int r13, @m80.k x00.l<? super java.lang.Integer, yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.k1.h(byte[], int, int, x00.l):void");
    }

    @w00.j(name = g.b.f62794h)
    @w00.k
    public static final long i(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return l(str, 0, 0, 3, null);
    }

    @w00.j(name = g.b.f62794h)
    @w00.k
    public static final long j(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return l(str, i11, 0, 2, null);
    }

    @w00.j(name = g.b.f62794h)
    @w00.k
    public static final long k(@m80.k String str, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
        }
        if (i12 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + str.length()).toString());
        }
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

    public static /* synthetic */ long l(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return k(str, i11, i12);
    }
}
