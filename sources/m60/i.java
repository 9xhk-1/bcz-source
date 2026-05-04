package m60;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.c1;
import okio.ByteString;
import okio.SegmentedByteString;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-SegmentedByteString")
@u0({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* loaded from: classes8.dex */
public final class i {
    public static final int a(@m80.k int[] iArr, int i11, int i12, int i13) {
        g0.p(iArr, "<this>");
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            int i16 = iArr[i15];
            if (i16 < i11) {
                i12 = i15 + 1;
            } else {
                if (i16 <= i11) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return (-i12) - 1;
    }

    public static final void b(@m80.k SegmentedByteString segmentedByteString, int i11, @m80.k byte[] target, int i12, int i13) {
        g0.p(segmentedByteString, "<this>");
        g0.p(target, "target");
        long j11 = i13;
        l60.h.e(segmentedByteString.size(), i11, j11);
        l60.h.e(target.length, i12, j11);
        int i14 = i13 + i11;
        int n11 = n(segmentedByteString, i11);
        while (i11 < i14) {
            int i15 = n11 == 0 ? 0 : segmentedByteString.getDirectory$okio()[n11 - 1];
            int i16 = segmentedByteString.getDirectory$okio()[n11] - i15;
            int i17 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + n11];
            int min = Math.min(i14, i16 + i15) - i11;
            int i18 = i17 + (i11 - i15);
            a00.q.v0(segmentedByteString.getSegments$okio()[n11], target, i12, i18, i18 + min);
            i12 += min;
            i11 += min;
            n11++;
        }
    }

    public static final boolean c(@m80.k SegmentedByteString segmentedByteString, @m80.l Object obj) {
        g0.p(segmentedByteString, "<this>");
        if (obj == segmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == segmentedByteString.size() && segmentedByteString.rangeEquals(0, byteString, 0, segmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@m80.k SegmentedByteString segmentedByteString) {
        g0.p(segmentedByteString, "<this>");
        return segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1];
    }

    public static final int e(@m80.k SegmentedByteString segmentedByteString) {
        g0.p(segmentedByteString, "<this>");
        int hashCode$okio = segmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = segmentedByteString.getSegments$okio().length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int i14 = segmentedByteString.getDirectory$okio()[length + i11];
            int i15 = segmentedByteString.getDirectory$okio()[i11];
            byte[] bArr = segmentedByteString.getSegments$okio()[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        segmentedByteString.setHashCode$okio(i12);
        return i12;
    }

    public static final byte f(@m80.k SegmentedByteString segmentedByteString, int i11) {
        g0.p(segmentedByteString, "<this>");
        l60.h.e(segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1], i11, 1L);
        int n11 = n(segmentedByteString, i11);
        return segmentedByteString.getSegments$okio()[n11][(i11 - (n11 == 0 ? 0 : segmentedByteString.getDirectory$okio()[n11 - 1])) + segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + n11]];
    }

    public static final boolean g(@m80.k SegmentedByteString segmentedByteString, int i11, @m80.k ByteString other, int i12, int i13) {
        g0.p(segmentedByteString, "<this>");
        g0.p(other, "other");
        if (i11 < 0 || i11 > segmentedByteString.size() - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int n11 = n(segmentedByteString, i11);
        while (i11 < i14) {
            int i15 = n11 == 0 ? 0 : segmentedByteString.getDirectory$okio()[n11 - 1];
            int i16 = segmentedByteString.getDirectory$okio()[n11] - i15;
            int i17 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + n11];
            int min = Math.min(i14, i16 + i15) - i11;
            if (!other.rangeEquals(i12, segmentedByteString.getSegments$okio()[n11], i17 + (i11 - i15), min)) {
                return false;
            }
            i12 += min;
            i11 += min;
            n11++;
        }
        return true;
    }

    public static final boolean h(@m80.k SegmentedByteString segmentedByteString, int i11, @m80.k byte[] other, int i12, int i13) {
        g0.p(segmentedByteString, "<this>");
        g0.p(other, "other");
        if (i11 < 0 || i11 > segmentedByteString.size() - i13 || i12 < 0 || i12 > other.length - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int n11 = n(segmentedByteString, i11);
        while (i11 < i14) {
            int i15 = n11 == 0 ? 0 : segmentedByteString.getDirectory$okio()[n11 - 1];
            int i16 = segmentedByteString.getDirectory$okio()[n11] - i15;
            int i17 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + n11];
            int min = Math.min(i14, i16 + i15) - i11;
            if (!l60.h.d(segmentedByteString.getSegments$okio()[n11], i17 + (i11 - i15), other, i12, min)) {
                return false;
            }
            i12 += min;
            i11 += min;
            n11++;
        }
        return true;
    }

    @m80.k
    public static final ByteString i(@m80.k SegmentedByteString segmentedByteString, int i11, int i12) {
        g0.p(segmentedByteString, "<this>");
        int k11 = l60.h.k(segmentedByteString, i12);
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i11 + " < 0").toString());
        }
        if (k11 > segmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + k11 + " > length(" + segmentedByteString.size() + ')').toString());
        }
        int i13 = k11 - i11;
        if (i13 < 0) {
            throw new IllegalArgumentException(("endIndex=" + k11 + " < beginIndex=" + i11).toString());
        }
        if (i11 == 0 && k11 == segmentedByteString.size()) {
            return segmentedByteString;
        }
        if (i11 == k11) {
            return ByteString.EMPTY;
        }
        int n11 = n(segmentedByteString, i11);
        int n12 = n(segmentedByteString, k11 - 1);
        byte[][] bArr = (byte[][]) a00.q.l1(segmentedByteString.getSegments$okio(), n11, n12 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (n11 <= n12) {
            int i14 = n11;
            int i15 = 0;
            while (true) {
                iArr[i15] = Math.min(segmentedByteString.getDirectory$okio()[i14] - i11, i13);
                int i16 = i15 + 1;
                iArr[i15 + bArr.length] = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + i14];
                if (i14 == n12) {
                    break;
                }
                i14++;
                i15 = i16;
            }
        }
        int i17 = n11 != 0 ? segmentedByteString.getDirectory$okio()[n11 - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i11 - i17);
        return new SegmentedByteString(bArr, iArr);
    }

    @m80.k
    public static final byte[] j(@m80.k SegmentedByteString segmentedByteString) {
        g0.p(segmentedByteString, "<this>");
        byte[] bArr = new byte[segmentedByteString.size()];
        int length = segmentedByteString.getSegments$okio().length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int i14 = segmentedByteString.getDirectory$okio()[length + i11];
            int i15 = segmentedByteString.getDirectory$okio()[i11];
            int i16 = i15 - i12;
            a00.q.v0(segmentedByteString.getSegments$okio()[i11], bArr, i13, i14, i14 + i16);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    public static final void k(@m80.k SegmentedByteString segmentedByteString, @m80.k l60.k buffer, int i11, int i12) {
        g0.p(segmentedByteString, "<this>");
        g0.p(buffer, "buffer");
        int i13 = i11 + i12;
        int n11 = n(segmentedByteString, i11);
        while (i11 < i13) {
            int i14 = n11 == 0 ? 0 : segmentedByteString.getDirectory$okio()[n11 - 1];
            int i15 = segmentedByteString.getDirectory$okio()[n11] - i14;
            int i16 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + n11];
            int min = Math.min(i13, i15 + i14) - i11;
            int i17 = i16 + (i11 - i14);
            c1 c1Var = new c1(segmentedByteString.getSegments$okio()[n11], i17, i17 + min, true, false);
            c1 c1Var2 = buffer.f70446a;
            if (c1Var2 == null) {
                c1Var.f70389g = c1Var;
                c1Var.f70388f = c1Var;
                buffer.f70446a = c1Var;
            } else {
                g0.m(c1Var2);
                c1 c1Var3 = c1Var2.f70389g;
                g0.m(c1Var3);
                c1Var3.c(c1Var);
            }
            i11 += min;
            n11++;
        }
        buffer.g1(buffer.size() + i12);
    }

    public static final void l(SegmentedByteString segmentedByteString, int i11, int i12, x00.q<? super byte[], ? super Integer, ? super Integer, g2> qVar) {
        int n11 = n(segmentedByteString, i11);
        while (i11 < i12) {
            int i13 = n11 == 0 ? 0 : segmentedByteString.getDirectory$okio()[n11 - 1];
            int i14 = segmentedByteString.getDirectory$okio()[n11] - i13;
            int i15 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + n11];
            int min = Math.min(i12, i14 + i13) - i11;
            qVar.invoke(segmentedByteString.getSegments$okio()[n11], Integer.valueOf(i15 + (i11 - i13)), Integer.valueOf(min));
            i11 += min;
            n11++;
        }
    }

    public static final void m(@m80.k SegmentedByteString segmentedByteString, @m80.k x00.q<? super byte[], ? super Integer, ? super Integer, g2> action) {
        g0.p(segmentedByteString, "<this>");
        g0.p(action, "action");
        int length = segmentedByteString.getSegments$okio().length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = segmentedByteString.getDirectory$okio()[length + i11];
            int i14 = segmentedByteString.getDirectory$okio()[i11];
            action.invoke(segmentedByteString.getSegments$okio()[i11], Integer.valueOf(i13), Integer.valueOf(i14 - i12));
            i11++;
            i12 = i14;
        }
    }

    public static final int n(@m80.k SegmentedByteString segmentedByteString, int i11) {
        g0.p(segmentedByteString, "<this>");
        int a11 = a(segmentedByteString.getDirectory$okio(), i11 + 1, 0, segmentedByteString.getSegments$okio().length);
        return a11 >= 0 ? a11 : ~a11;
    }
}
