package androidx.compose.ui.tooling.animation.states;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class AnimatedVisibilityState implements ComposeAnimationState {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final String Enter = m5047constructorimpl("Enter");

    @k
    private static final String Exit = m5047constructorimpl("Exit");

    @k
    private final String value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        /* renamed from: getEnter-jXw82LU, reason: not valid java name */
        public final String m5053getEnterjXw82LU() {
            return AnimatedVisibilityState.Enter;
        }

        @k
        /* renamed from: getExit-jXw82LU, reason: not valid java name */
        public final String m5054getExitjXw82LU() {
            return AnimatedVisibilityState.Exit;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AnimatedVisibilityState(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AnimatedVisibilityState m5046boximpl(String str) {
        return new AnimatedVisibilityState(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5048equalsimpl(String str, Object obj) {
        return (obj instanceof AnimatedVisibilityState) && g0.g(str, ((AnimatedVisibilityState) obj).m5052unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5049equalsimpl0(String str, String str2) {
        return g0.g(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5050hashCodeimpl(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return m5048equalsimpl(this.value, obj);
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5050hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m5051toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m5052unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m5047constructorimpl(String str) {
        return str;
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5051toStringimpl(String str) {
        return str;
    }
}
