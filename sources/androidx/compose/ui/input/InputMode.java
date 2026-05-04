package androidx.compose.ui.input;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class InputMode {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m3264constructorimpl(1);
    private static final int Keyboard = m3264constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m3270getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m3271getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InputMode(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m3263boximpl(int i11) {
        return new InputMode(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3265equalsimpl(int i11, Object obj) {
        return (obj instanceof InputMode) && i11 == ((InputMode) obj).m3269unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3266equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3267hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3268toStringimpl(int i11) {
        return m3266equalsimpl0(i11, Touch) ? "Touch" : m3266equalsimpl0(i11, Keyboard) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m3265equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3267hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m3268toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3269unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3264constructorimpl(int i11) {
        return i11;
    }
}
