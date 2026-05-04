package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@w00.h
/* loaded from: classes.dex */
public final class PointMode {
    private final int value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int Points = m2808constructorimpl(0);
    private static final int Lines = m2808constructorimpl(1);
    private static final int Polygon = m2808constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m2814getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m2815getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m2816getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m2807boximpl(int i11) {
        return new PointMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2809equalsimpl(int i11, Object obj) {
        return (obj instanceof PointMode) && i11 == ((PointMode) obj).m2813unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2810equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2811hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2812toStringimpl(int i11) {
        return m2810equalsimpl0(i11, Points) ? "Points" : m2810equalsimpl0(i11, Lines) ? "Lines" : m2810equalsimpl0(i11, Polygon) ? "Polygon" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m2809equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2811hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2812toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2813unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2808constructorimpl(int i11) {
        return i11;
    }
}
