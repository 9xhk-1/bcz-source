package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class VertexMode {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = m2902constructorimpl(0);
    private static final int TriangleStrip = m2902constructorimpl(1);
    private static final int TriangleFan = m2902constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m2908getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m2909getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m2910getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }

        private Companion() {
        }
    }

    private /* synthetic */ VertexMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VertexMode m2901boximpl(int i11) {
        return new VertexMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2903equalsimpl(int i11, Object obj) {
        return (obj instanceof VertexMode) && i11 == ((VertexMode) obj).m2907unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2904equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2905hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2906toStringimpl(int i11) {
        return m2904equalsimpl0(i11, Triangles) ? "Triangles" : m2904equalsimpl0(i11, TriangleStrip) ? "TriangleStrip" : m2904equalsimpl0(i11, TriangleFan) ? "TriangleFan" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2903equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2905hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2906toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2907unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2902constructorimpl(int i11) {
        return i11;
    }
}
