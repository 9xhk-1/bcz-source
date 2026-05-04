package androidx.compose.ui.text.style;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class TextDirection {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m4985constructorimpl(1);
    private static final int Rtl = m4985constructorimpl(2);
    private static final int Content = m4985constructorimpl(3);
    private static final int ContentOrLtr = m4985constructorimpl(4);
    private static final int ContentOrRtl = m4985constructorimpl(5);
    private static final int Unspecified = m4985constructorimpl(Integer.MIN_VALUE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m4991getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m4992getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m4993getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m4994getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m4995getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m4996getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextDirection(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m4984boximpl(int i11) {
        return new TextDirection(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4986equalsimpl(int i11, Object obj) {
        return (obj instanceof TextDirection) && i11 == ((TextDirection) obj).m4990unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4987equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4988hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4989toStringimpl(int i11) {
        return m4987equalsimpl0(i11, Ltr) ? "Ltr" : m4987equalsimpl0(i11, Rtl) ? "Rtl" : m4987equalsimpl0(i11, Content) ? "Content" : m4987equalsimpl0(i11, ContentOrLtr) ? "ContentOrLtr" : m4987equalsimpl0(i11, ContentOrRtl) ? "ContentOrRtl" : m4987equalsimpl0(i11, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4986equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4988hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4989toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4990unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4985constructorimpl(int i11) {
        return i11;
    }
}
