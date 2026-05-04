package m60;

import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n67#3:77\n73#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {
    @m80.k
    public static final byte[] a(@m80.k String str) {
        int i11;
        char charAt;
        g0.p(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            char charAt2 = str.charAt(i12);
            if (g0.t(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i13 = i12;
                while (i12 < length2) {
                    char charAt3 = str.charAt(i12);
                    if (g0.t(charAt3, 128) < 0) {
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) charAt3;
                        i12++;
                        while (true) {
                            i13 = i14;
                            if (i12 < length2 && g0.t(str.charAt(i12), 128) < 0) {
                                i14 = i13 + 1;
                                bArr[i13] = (byte) str.charAt(i12);
                                i12++;
                            }
                        }
                    } else {
                        if (g0.t(charAt3, 2048) < 0) {
                            bArr[i13] = (byte) ((charAt3 >> 6) | 192);
                            i13 += 2;
                            bArr[i13 + 1] = (byte) ((charAt3 & s60.d.f88057a) | 128);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i13] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i13 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i13 += 3;
                            bArr[i13 + 2] = (byte) ((charAt3 & s60.d.f88057a) | 128);
                        } else if (g0.t(charAt3, 56319) > 0 || length2 <= (i11 = i12 + 1) || 56320 > (charAt = str.charAt(i11)) || charAt >= 57344) {
                            bArr[i13] = 63;
                            i12++;
                            i13++;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + str.charAt(i11)) - 56613888;
                            bArr[i13] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i13 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i13 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i13 + 3] = (byte) ((charAt4 & 63) | 128);
                            i12 += 2;
                        }
                        i12++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i13);
                g0.o(copyOf, "copyOf(...)");
                return copyOf;
            }
            bArr[i12] = (byte) charAt2;
            i12++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        g0.o(copyOf2, "copyOf(...)");
        return copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if ((r16[r5] & com.baicizhan.main.vld.bonding.j.f25378c) == 128) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0095, code lost:
    
        if ((r16[r5] & com.baicizhan.main.vld.bonding.j.f25378c) == 128) goto L42;
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(@m80.k byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.a0.b(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String c(byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        return b(bArr, i11, i12);
    }
}
