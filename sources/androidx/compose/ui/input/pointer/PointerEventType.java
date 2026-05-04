package androidx.compose.ui.input.pointer;

import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class PointerEventType {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3679constructorimpl(0);
    private static final int Press = m3679constructorimpl(1);
    private static final int Release = m3679constructorimpl(2);
    private static final int Move = m3679constructorimpl(3);
    private static final int Enter = m3679constructorimpl(4);
    private static final int Exit = m3679constructorimpl(5);
    private static final int Scroll = m3679constructorimpl(6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m3685getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m3686getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m3687getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m3688getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m3689getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m3690getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m3691getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerEventType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m3678boximpl(int i11) {
        return new PointerEventType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3680equalsimpl(int i11, Object obj) {
        return (obj instanceof PointerEventType) && i11 == ((PointerEventType) obj).m3684unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3681equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3682hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3683toStringimpl(int i11) {
        return m3681equalsimpl0(i11, Press) ? "Press" : m3681equalsimpl0(i11, Release) ? "Release" : m3681equalsimpl0(i11, Move) ? "Move" : m3681equalsimpl0(i11, Enter) ? "Enter" : m3681equalsimpl0(i11, Exit) ? "Exit" : m3681equalsimpl0(i11, Scroll) ? "Scroll" : PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m3680equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3682hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m3683toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3684unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3679constructorimpl(int i11) {
        return i11;
    }
}
