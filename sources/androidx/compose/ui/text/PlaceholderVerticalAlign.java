package androidx.compose.ui.text;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class PlaceholderVerticalAlign {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m4464constructorimpl(1);
    private static final int Top = m4464constructorimpl(2);
    private static final int Bottom = m4464constructorimpl(3);
    private static final int Center = m4464constructorimpl(4);
    private static final int TextTop = m4464constructorimpl(5);
    private static final int TextBottom = m4464constructorimpl(6);
    private static final int TextCenter = m4464constructorimpl(7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m4470getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m4471getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m4472getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m4473getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m4474getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m4475getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m4476getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m4463boximpl(int i11) {
        return new PlaceholderVerticalAlign(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4465equalsimpl(int i11, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i11 == ((PlaceholderVerticalAlign) obj).m4469unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4466equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4467hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4468toStringimpl(int i11) {
        return m4466equalsimpl0(i11, AboveBaseline) ? "AboveBaseline" : m4466equalsimpl0(i11, Top) ? "Top" : m4466equalsimpl0(i11, Bottom) ? "Bottom" : m4466equalsimpl0(i11, Center) ? "Center" : m4466equalsimpl0(i11, TextTop) ? "TextTop" : m4466equalsimpl0(i11, TextBottom) ? "TextBottom" : m4466equalsimpl0(i11, TextCenter) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4465equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4467hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4468toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4469unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4464constructorimpl(int i11) {
        return i11;
    }
}
