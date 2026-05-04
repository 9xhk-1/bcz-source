package androidx.compose.ui.input.nestedscroll;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class NestedScrollSource {

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Drag;
    private static final int Fling;
    private static final int Relocate;
    private static final int SideEffect;
    private static final int UserInput;
    private static final int Wheel;
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m3621getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m3622getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m3623getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m3624getSideEffectWNlRxjI() {
            return NestedScrollSource.SideEffect;
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m3625getUserInputWNlRxjI() {
            return NestedScrollSource.UserInput;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m3626getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        private Companion() {
        }

        @n(message = "This has been replaced by UserInput.", replaceWith = @w0(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        /* renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m3617getDragWNlRxjI$annotations() {
        }

        @n(message = "This has been replaced by SideEffect.", replaceWith = @w0(expression = "NestedScrollSource.SideEffect", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.SideEffect"}))
        /* renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m3618getFlingWNlRxjI$annotations() {
        }

        @n(message = "Do not use. Will be removed in the future.")
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m3619getRelocateWNlRxjI$annotations() {
        }

        @n(message = "This has been replaced by UserInput.", replaceWith = @w0(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        /* renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m3620getWheelWNlRxjI$annotations() {
        }
    }

    static {
        int m3611constructorimpl = m3611constructorimpl(1);
        UserInput = m3611constructorimpl;
        int m3611constructorimpl2 = m3611constructorimpl(2);
        SideEffect = m3611constructorimpl2;
        Drag = m3611constructorimpl;
        Fling = m3611constructorimpl2;
        Relocate = m3611constructorimpl(3);
        Wheel = m3611constructorimpl;
    }

    private /* synthetic */ NestedScrollSource(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m3610boximpl(int i11) {
        return new NestedScrollSource(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3612equalsimpl(int i11, Object obj) {
        return (obj instanceof NestedScrollSource) && i11 == ((NestedScrollSource) obj).m3616unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3613equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3614hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3615toStringimpl(int i11) {
        return m3613equalsimpl0(i11, UserInput) ? "UserInput" : m3613equalsimpl0(i11, SideEffect) ? "SideEffect" : m3613equalsimpl0(i11, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3612equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3614hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m3615toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3616unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3611constructorimpl(int i11) {
        return i11;
    }
}
