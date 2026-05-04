package androidx.compose.ui.text.style;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class TextAlign {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Left = m4971constructorimpl(1);
    private static final int Right = m4971constructorimpl(2);
    private static final int Center = m4971constructorimpl(3);
    private static final int Justify = m4971constructorimpl(4);
    private static final int Start = m4971constructorimpl(5);
    private static final int End = m4971constructorimpl(6);
    private static final int Unspecified = m4971constructorimpl(Integer.MIN_VALUE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m4977getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m4978getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m4979getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m4980getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m4981getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m4982getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m4983getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        @k
        public final List<TextAlign> values() {
            return h0.Q(TextAlign.m4970boximpl(m4980getLefte0LSkKk()), TextAlign.m4970boximpl(m4981getRighte0LSkKk()), TextAlign.m4970boximpl(m4977getCentere0LSkKk()), TextAlign.m4970boximpl(m4979getJustifye0LSkKk()), TextAlign.m4970boximpl(m4982getStarte0LSkKk()), TextAlign.m4970boximpl(m4978getEnde0LSkKk()));
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextAlign(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m4970boximpl(int i11) {
        return new TextAlign(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4972equalsimpl(int i11, Object obj) {
        return (obj instanceof TextAlign) && i11 == ((TextAlign) obj).m4976unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4973equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4974hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4975toStringimpl(int i11) {
        return m4973equalsimpl0(i11, Left) ? "Left" : m4973equalsimpl0(i11, Right) ? "Right" : m4973equalsimpl0(i11, Center) ? "Center" : m4973equalsimpl0(i11, Justify) ? "Justify" : m4973equalsimpl0(i11, Start) ? "Start" : m4973equalsimpl0(i11, End) ? "End" : m4973equalsimpl0(i11, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4972equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4974hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4975toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4976unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4971constructorimpl(int i11) {
        return i11;
    }
}
