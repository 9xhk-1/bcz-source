package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class PathOperation {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m2795constructorimpl(0);
    private static final int Intersect = m2795constructorimpl(1);
    private static final int Union = m2795constructorimpl(2);
    private static final int Xor = m2795constructorimpl(3);
    private static final int ReverseDifference = m2795constructorimpl(4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m2801getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m2802getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m2803getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m2804getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m2805getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathOperation(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m2794boximpl(int i11) {
        return new PathOperation(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2796equalsimpl(int i11, Object obj) {
        return (obj instanceof PathOperation) && i11 == ((PathOperation) obj).m2800unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2797equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2798hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2799toStringimpl(int i11) {
        return m2797equalsimpl0(i11, Difference) ? "Difference" : m2797equalsimpl0(i11, Intersect) ? "Intersect" : m2797equalsimpl0(i11, Union) ? "Union" : m2797equalsimpl0(i11, Xor) ? "Xor" : m2797equalsimpl0(i11, ReverseDifference) ? "ReverseDifference" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2796equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2798hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2799toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2800unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2795constructorimpl(int i11) {
        return i11;
    }
}
