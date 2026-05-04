package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes.dex */
final class OpArray {

    @m80.k
    private final int[] values;

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m1264boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m1266constructorimpl(int[] iArr) {
        return iArr;
    }

    @m80.k
    /* renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m1267copyOfpSmdads(int[] iArr, int i11) {
        int[] copyOf = Arrays.copyOf(iArr, i11 * 3);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return m1266constructorimpl(copyOf);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1268equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && kotlin.jvm.internal.g0.g(iArr, ((OpArray) obj).m1276unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1269equalsimpl0(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.g0.g(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m1270forEachimpl(int[] iArr, int i11, boolean z11, @m80.k x00.q<? super Integer, ? super Integer, ? super Integer, g2> qVar) {
        if (i11 < 0) {
            return;
        }
        if (!z11) {
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i12 * 3;
                qVar.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
            }
            return;
        }
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            }
            int i14 = i11 * 3;
            qVar.invoke(Integer.valueOf(iArr[i14]), Integer.valueOf(iArr[i14 + 1]), Integer.valueOf(iArr[i14 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1271forEachimpl$default(int[] iArr, int i11, boolean z11, x00.q qVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (i11 < 0) {
            return;
        }
        if (!z11) {
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i13 * 3;
                qVar.invoke(Integer.valueOf(iArr[i14]), Integer.valueOf(iArr[i14 + 1]), Integer.valueOf(iArr[i14 + 2]));
            }
            return;
        }
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            }
            int i15 = i11 * 3;
            qVar.invoke(Integer.valueOf(iArr[i15]), Integer.valueOf(iArr[i15 + 1]), Integer.valueOf(iArr[i15 + 2]));
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1272getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1273hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m1274setimpl(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i11 * 3;
        iArr[i15] = i12;
        iArr[i15 + 1] = i13;
        iArr[i15 + 2] = i14;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1275toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1268equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1273hashCodeimpl(this.values);
    }

    public String toString() {
        return m1275toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m1276unboximpl() {
        return this.values;
    }

    @m80.k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1265constructorimpl(int i11) {
        return m1266constructorimpl(new int[i11 * 3]);
    }
}
