package androidx.compose.ui.text.font;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.v;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes2.dex */
public final class FontStyle {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m4668constructorimpl(0);
    private static final int Italic = m4668constructorimpl(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m4676getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m4677getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        @k
        public final List<FontStyle> values() {
            return h0.Q(FontStyle.m4667boximpl(m4677getNormal_LCdwA()), FontStyle.m4667boximpl(m4676getItalic_LCdwA()));
        }

        private Companion() {
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4674getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4675getNormal_LCdwA$annotations() {
        }
    }

    @n(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @w0(expression = "FontStyle.", imports = {}))
    private /* synthetic */ FontStyle(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m4667boximpl(int i11) {
        return new FontStyle(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4669equalsimpl(int i11, Object obj) {
        return (obj instanceof FontStyle) && i11 == ((FontStyle) obj).m4673unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4670equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4671hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4672toStringimpl(int i11) {
        return m4670equalsimpl0(i11, Normal) ? "Normal" : m4670equalsimpl0(i11, Italic) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4669equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4671hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4672toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4673unboximpl() {
        return this.value;
    }

    @n(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @w0(expression = "FontStyle.", imports = {}))
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4668constructorimpl(int i11) {
        return i11;
    }
}
