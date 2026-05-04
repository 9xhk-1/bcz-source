package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class PathFillType {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = m2785constructorimpl(0);
    private static final int EvenOdd = m2785constructorimpl(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m2791getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m2792getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathFillType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathFillType m2784boximpl(int i11) {
        return new PathFillType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2786equalsimpl(int i11, Object obj) {
        return (obj instanceof PathFillType) && i11 == ((PathFillType) obj).m2790unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2787equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2788hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2789toStringimpl(int i11) {
        return m2787equalsimpl0(i11, NonZero) ? "NonZero" : m2787equalsimpl0(i11, EvenOdd) ? "EvenOdd" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2786equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2788hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2789toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2790unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2785constructorimpl(int i11) {
        return i11;
    }
}
