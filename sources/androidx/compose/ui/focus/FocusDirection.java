package androidx.compose.ui.focus;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Next = m2150constructorimpl(1);
    private static final int Previous = m2150constructorimpl(2);
    private static final int Left = m2150constructorimpl(3);
    private static final int Right = m2150constructorimpl(4);
    private static final int Up = m2150constructorimpl(5);
    private static final int Down = m2150constructorimpl(6);
    private static final int Enter = m2150constructorimpl(7);
    private static final int Exit = m2150constructorimpl(8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m2156getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m2157getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m2158getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m2159getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m2160getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m2161getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m2162getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m2163getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FocusDirection(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m2149boximpl(int i11) {
        return new FocusDirection(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2151equalsimpl(int i11, Object obj) {
        return (obj instanceof FocusDirection) && i11 == ((FocusDirection) obj).m2155unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2152equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2153hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2154toStringimpl(int i11) {
        return m2152equalsimpl0(i11, Next) ? "Next" : m2152equalsimpl0(i11, Previous) ? "Previous" : m2152equalsimpl0(i11, Left) ? "Left" : m2152equalsimpl0(i11, Right) ? "Right" : m2152equalsimpl0(i11, Up) ? "Up" : m2152equalsimpl0(i11, Down) ? "Down" : m2152equalsimpl0(i11, Enter) ? "Enter" : m2152equalsimpl0(i11, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m2151equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2153hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m2154toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2155unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2150constructorimpl(int i11) {
        return i11;
    }
}
