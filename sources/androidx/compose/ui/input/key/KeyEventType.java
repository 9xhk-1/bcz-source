package androidx.compose.ui.input.key;

import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class KeyEventType {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3579constructorimpl(0);
    private static final int KeyUp = m3579constructorimpl(1);
    private static final int KeyDown = m3579constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m3585getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m3586getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m3587getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyEventType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m3578boximpl(int i11) {
        return new KeyEventType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3580equalsimpl(int i11, Object obj) {
        return (obj instanceof KeyEventType) && i11 == ((KeyEventType) obj).m3584unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3581equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3582hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3583toStringimpl(int i11) {
        return m3581equalsimpl0(i11, KeyUp) ? "KeyUp" : m3581equalsimpl0(i11, KeyDown) ? "KeyDown" : m3581equalsimpl0(i11, Unknown) ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3580equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3582hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m3583toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3584unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3579constructorimpl(int i11) {
        return i11;
    }
}
