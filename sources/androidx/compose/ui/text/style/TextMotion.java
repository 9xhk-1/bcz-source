package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class TextMotion {
    public static final int $stable = 0;

    @k
    private static final TextMotion Animated;

    @k
    public static final Companion Companion;

    @k
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        @k
        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        private Companion() {
        }
    }

    static {
        v vVar = null;
        Companion = new Companion(vVar);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m5013getFontHinting4e0Vf04(), false, vVar);
        Animated = new TextMotion(companion.m5014getLinear4e0Vf04(), true, vVar);
    }

    public /* synthetic */ TextMotion(int i11, boolean z11, v vVar) {
        this(i11, z11);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m5003copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = textMotion.linearity;
        }
        if ((i12 & 2) != 0) {
            z11 = textMotion.subpixelTextPositioning;
        }
        return textMotion.m5004copyJdDtMQo$ui_text_release(i11, z11);
    }

    @k
    /* renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m5004copyJdDtMQo$ui_text_release(int i11, boolean z11) {
        return new TextMotion(i11, z11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.m5009equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m5005getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m5010hashCodeimpl(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    @k
    public String toString() {
        return g0.g(this, Static) ? "TextMotion.Static" : g0.g(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    private TextMotion(int i11, boolean z11) {
        this.linearity = i11;
        this.subpixelTextPositioning = z11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class Linearity {
        private final int value;

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m5007constructorimpl(1);
        private static final int FontHinting = m5007constructorimpl(2);
        private static final int None = m5007constructorimpl(3);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m5013getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m5014getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m5015getNone4e0Vf04() {
                return Linearity.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Linearity(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m5006boximpl(int i11) {
            return new Linearity(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5008equalsimpl(int i11, Object obj) {
            return (obj instanceof Linearity) && i11 == ((Linearity) obj).m5012unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5009equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5010hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5011toStringimpl(int i11) {
            return m5009equalsimpl0(i11, Linear) ? "Linearity.Linear" : m5009equalsimpl0(i11, FontHinting) ? "Linearity.FontHinting" : m5009equalsimpl0(i11, None) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m5008equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5010hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m5011toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5012unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m5007constructorimpl(int i11) {
            return i11;
        }
    }
}
