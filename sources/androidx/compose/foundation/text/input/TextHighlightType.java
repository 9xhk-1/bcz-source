package androidx.compose.foundation.text.input;

import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class TextHighlightType {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int HandwritingSelectPreview = m1196constructorimpl(0);
    private static final int HandwritingDeletePreview = m1196constructorimpl(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getHandwritingDeletePreview-s-xJuwY, reason: not valid java name */
        public final int m1202getHandwritingDeletePreviewsxJuwY() {
            return TextHighlightType.HandwritingDeletePreview;
        }

        /* renamed from: getHandwritingSelectPreview-s-xJuwY, reason: not valid java name */
        public final int m1203getHandwritingSelectPreviewsxJuwY() {
            return TextHighlightType.HandwritingSelectPreview;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextHighlightType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextHighlightType m1195boximpl(int i11) {
        return new TextHighlightType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1197equalsimpl(int i11, Object obj) {
        return (obj instanceof TextHighlightType) && i11 == ((TextHighlightType) obj).m1201unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1198equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1199hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1200toStringimpl(int i11) {
        return "TextHighlightType(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m1197equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1199hashCodeimpl(this.value);
    }

    public String toString() {
        return m1200toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1201unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1196constructorimpl(int i11) {
        return i11;
    }
}
