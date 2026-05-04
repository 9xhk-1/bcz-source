package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class PaintingStyle {

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m2770constructorimpl(0);
    private static final int Stroke = m2770constructorimpl(1);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m2776getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m2777getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PaintingStyle(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m2769boximpl(int i11) {
        return new PaintingStyle(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2771equalsimpl(int i11, Object obj) {
        return (obj instanceof PaintingStyle) && i11 == ((PaintingStyle) obj).m2775unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2772equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2773hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2774toStringimpl(int i11) {
        return m2772equalsimpl0(i11, Fill) ? "Fill" : m2772equalsimpl0(i11, Stroke) ? "Stroke" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2771equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2773hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2774toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2775unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2770constructorimpl(int i11) {
        return i11;
    }
}
