package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class TextOverflow {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m5017constructorimpl(1);
    private static final int Ellipsis = m5017constructorimpl(2);
    private static final int Visible = m5017constructorimpl(3);
    private static final int StartEllipsis = m5017constructorimpl(4);
    private static final int MiddleEllipsis = m5017constructorimpl(5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m5028getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m5029getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m5030getMiddleEllipsisgIe3tQ8() {
            return TextOverflow.MiddleEllipsis;
        }

        /* renamed from: getStartEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m5031getStartEllipsisgIe3tQ8() {
            return TextOverflow.StartEllipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m5032getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5023getClipgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5024getEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getMiddleEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5025getMiddleEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getStartEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5026getStartEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5027getVisiblegIe3tQ8$annotations() {
        }
    }

    private /* synthetic */ TextOverflow(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m5016boximpl(int i11) {
        return new TextOverflow(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5018equalsimpl(int i11, Object obj) {
        return (obj instanceof TextOverflow) && i11 == ((TextOverflow) obj).m5022unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5019equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5020hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5021toStringimpl(int i11) {
        return m5019equalsimpl0(i11, Clip) ? "Clip" : m5019equalsimpl0(i11, Ellipsis) ? "Ellipsis" : m5019equalsimpl0(i11, MiddleEllipsis) ? "MiddleEllipsis" : m5019equalsimpl0(i11, Visible) ? "Visible" : m5019equalsimpl0(i11, StartEllipsis) ? "StartEllipsis" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5018equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5020hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m5021toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5022unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5017constructorimpl(int i11) {
        return i11;
    }
}
