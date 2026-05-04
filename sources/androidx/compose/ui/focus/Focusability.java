package androidx.compose.ui.focus;

import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nFocusability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusability.kt\nandroidx/compose/ui/focus/Focusability\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes.dex */
public final class Focusability {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Always = m2198constructorimpl(1);
    private static final int SystemDefined = m2198constructorimpl(0);
    private static final int Never = m2198constructorimpl(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m2204getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m2205getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m2206getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Focusability(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m2196boximpl(int i11) {
        return new Focusability(i11);
    }

    /* renamed from: canFocus-impl$ui_release, reason: not valid java name */
    public static final boolean m2197canFocusimpl$ui_release(int i11, @k CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m2200equalsimpl0(i11, Always)) {
            return true;
        }
        if (m2200equalsimpl0(i11, SystemDefined)) {
            return !InputMode.m3266equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo3272getInputModeaOaMEAU(), InputMode.Companion.m3271getTouchaOaMEAU());
        }
        if (m2200equalsimpl0(i11, Never)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2199equalsimpl(int i11, Object obj) {
        return (obj instanceof Focusability) && i11 == ((Focusability) obj).m2203unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2200equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2201hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2202toStringimpl(int i11) {
        if (m2200equalsimpl0(i11, Always)) {
            return "Always";
        }
        if (m2200equalsimpl0(i11, SystemDefined)) {
            return "SystemDefined";
        }
        if (m2200equalsimpl0(i11, Never)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return m2199equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2201hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m2202toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2203unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2198constructorimpl(int i11) {
        return i11;
    }
}
