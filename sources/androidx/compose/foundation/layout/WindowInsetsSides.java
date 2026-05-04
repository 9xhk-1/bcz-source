package androidx.compose.foundation.layout;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m815getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m816getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m817getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m818getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m819getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m820getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m821getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m822getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m823getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m824getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m825getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m826getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        private Companion() {
        }
    }

    static {
        int m806constructorimpl = m806constructorimpl(8);
        AllowLeftInLtr = m806constructorimpl;
        int m806constructorimpl2 = m806constructorimpl(4);
        AllowRightInLtr = m806constructorimpl2;
        int m806constructorimpl3 = m806constructorimpl(2);
        AllowLeftInRtl = m806constructorimpl3;
        int m806constructorimpl4 = m806constructorimpl(1);
        AllowRightInRtl = m806constructorimpl4;
        Start = m811plusgK_yJZ4(m806constructorimpl, m806constructorimpl4);
        End = m811plusgK_yJZ4(m806constructorimpl2, m806constructorimpl3);
        int m806constructorimpl5 = m806constructorimpl(16);
        Top = m806constructorimpl5;
        int m806constructorimpl6 = m806constructorimpl(32);
        Bottom = m806constructorimpl6;
        int m811plusgK_yJZ4 = m811plusgK_yJZ4(m806constructorimpl, m806constructorimpl3);
        Left = m811plusgK_yJZ4;
        int m811plusgK_yJZ42 = m811plusgK_yJZ4(m806constructorimpl2, m806constructorimpl4);
        Right = m811plusgK_yJZ42;
        Horizontal = m811plusgK_yJZ4(m811plusgK_yJZ4, m811plusgK_yJZ42);
        Vertical = m811plusgK_yJZ4(m806constructorimpl5, m806constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m805boximpl(int i11) {
        return new WindowInsetsSides(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m807equalsimpl(int i11, Object obj) {
        return (obj instanceof WindowInsetsSides) && i11 == ((WindowInsetsSides) obj).m814unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m808equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m809hasAnybkgdKaI$foundation_layout_release(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m810hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m811plusgK_yJZ4(int i11, int i12) {
        return m806constructorimpl(i11 | i12);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m812toStringimpl(int i11) {
        return "WindowInsetsSides(" + m813valueToStringimpl(i11) + ')';
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m813valueToStringimpl(int i11) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = Start;
        if ((i11 & i12) == i12) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Start");
        }
        int i13 = Left;
        if ((i11 & i13) == i13) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Left");
        }
        int i14 = Top;
        if ((i11 & i14) == i14) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Top");
        }
        int i15 = End;
        if ((i11 & i15) == i15) {
            valueToString_impl$lambda$0$appendPlus(sb2, "End");
        }
        int i16 = Right;
        if ((i11 & i16) == i16) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Right");
        }
        int i17 = Bottom;
        if ((i11 & i17) == i17) {
            valueToString_impl$lambda$0$appendPlus(sb2, "Bottom");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public boolean equals(Object obj) {
        return m807equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m810hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m812toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m814unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m806constructorimpl(int i11) {
        return i11;
    }
}
