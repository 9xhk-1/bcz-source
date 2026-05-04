package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class ClipOp {

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m2491constructorimpl(0);
    private static final int Intersect = m2491constructorimpl(1);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m2497getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m2498getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ClipOp(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m2490boximpl(int i11) {
        return new ClipOp(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2492equalsimpl(int i11, Object obj) {
        return (obj instanceof ClipOp) && i11 == ((ClipOp) obj).m2496unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2493equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2494hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2495toStringimpl(int i11) {
        return m2493equalsimpl0(i11, Difference) ? "Difference" : m2493equalsimpl0(i11, Intersect) ? "Intersect" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2492equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2494hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2495toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2496unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2491constructorimpl(int i11) {
        return i11;
    }
}
