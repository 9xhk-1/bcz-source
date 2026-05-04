package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
final class CenteredArray {

    @k
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m3965boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3967equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && g0.g(iArr, ((CenteredArray) obj).m3974unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3968equalsimpl0(int[] iArr, int[] iArr2) {
        return g0.g(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m3969getimpl(int[] iArr, int i11) {
        return iArr[i11 + m3970getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m3970getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3971hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m3972setimpl(int[] iArr, int i11, int i12) {
        iArr[i11 + m3970getMidimpl(iArr)] = i12;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3973toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m3967equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m3971hashCodeimpl(this.data);
    }

    public String toString() {
        return m3973toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m3974unboximpl() {
        return this.data;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m3966constructorimpl(@k int[] iArr) {
        return iArr;
    }
}
