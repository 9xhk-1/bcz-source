package androidx.compose.ui.text.font;

import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes2.dex */
public final class FontSynthesis {
    private final int value;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int None = m4679constructorimpl(0);
    private static final int Weight = m4679constructorimpl(1);
    private static final int Style = m4679constructorimpl(2);
    private static final int All = m4679constructorimpl(65535);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m4687getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m4688getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m4689getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m4690getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontSynthesis(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m4678boximpl(int i11) {
        return new FontSynthesis(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4680equalsimpl(int i11, Object obj) {
        return (obj instanceof FontSynthesis) && i11 == ((FontSynthesis) obj).m4686unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4681equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4682hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4683isStyleOnimpl$ui_text_release(int i11) {
        return (i11 & 2) != 0;
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4684isWeightOnimpl$ui_text_release(int i11) {
        return (i11 & 1) != 0;
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4685toStringimpl(int i11) {
        return m4681equalsimpl0(i11, None) ? "None" : m4681equalsimpl0(i11, Weight) ? "Weight" : m4681equalsimpl0(i11, Style) ? "Style" : m4681equalsimpl0(i11, All) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m4680equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4682hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m4685toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4686unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4679constructorimpl(int i11) {
        return i11;
    }
}
