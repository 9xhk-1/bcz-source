package androidx.compose.ui.input.pointer;

import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class PointerType {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3801constructorimpl(0);
    private static final int Touch = m3801constructorimpl(1);
    private static final int Mouse = m3801constructorimpl(2);
    private static final int Stylus = m3801constructorimpl(3);
    private static final int Eraser = m3801constructorimpl(4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m3807getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m3808getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m3809getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m3810getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m3811getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m3800boximpl(int i11) {
        return new PointerType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3802equalsimpl(int i11, Object obj) {
        return (obj instanceof PointerType) && i11 == ((PointerType) obj).m3806unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3803equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3804hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3805toStringimpl(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m3802equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3804hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m3805toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3806unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3801constructorimpl(int i11) {
        return i11;
    }
}
