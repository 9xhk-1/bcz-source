package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;

    @k
    public static final Companion Companion;

    @k
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    @u0({"SMAP\nLineHeightStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,329:1\n77#2,8:330\n*S KotlinDebug\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n*L\n211#1:330,8\n*E\n"})
    public static final class Alignment {
        private final float topRatio;

        @k
        public static final Companion Companion = new Companion(null);
        private static final float Top = m4938constructorimpl(0.0f);
        private static final float Center = m4938constructorimpl(0.5f);
        private static final float Proportional = m4938constructorimpl(-1.0f);
        private static final float Bottom = m4938constructorimpl(1.0f);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m4944getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m4945getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m4946getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m4947getTopPIaL0Z0() {
                return Alignment.Top;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Alignment(float f11) {
            this.topRatio = f11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m4937boximpl(float f11) {
            return new Alignment(f11);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m4938constructorimpl(float f11) {
            if (!((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f)) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f11;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4939equalsimpl(float f11, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f11, ((Alignment) obj).m4943unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4940equalsimpl0(float f11, float f12) {
            return Float.compare(f11, f12) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4941hashCodeimpl(float f11) {
            return Float.hashCode(f11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4942toStringimpl(float f11) {
            if (f11 == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f11 == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f11 == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f11 == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f11 + ')';
        }

        public boolean equals(Object obj) {
            return m4939equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m4941hashCodeimpl(this.topRatio);
        }

        @k
        public String toString() {
            return m4942toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m4943unboximpl() {
            return this.topRatio;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        private Companion() {
        }
    }

    static {
        v vVar = null;
        Companion = new Companion(vVar);
        Default = new LineHeightStyle(Alignment.Companion.m4946getProportionalPIaL0Z0(), Trim.Companion.m4966getBothEVpEnUU(), Mode.Companion.m4955getFixedlzQqcRY(), vVar);
    }

    public /* synthetic */ LineHeightStyle(float f11, int i11, int i12, v vVar) {
        this(f11, i11, i12);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m4932copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f11 = lineHeightStyle.alignment;
        }
        if ((i13 & 2) != 0) {
            i11 = lineHeightStyle.trim;
        }
        if ((i13 & 4) != 0) {
            i12 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m4933copy38bxuX8(f11, i11, i12);
    }

    @k
    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m4933copy38bxuX8(float f11, int i11, int i12) {
        return new LineHeightStyle(f11, i11, i12, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.m4940equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m4960equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m4951equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m4934getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m4935getModelzQqcRY() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m4936getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (((Alignment.m4941hashCodeimpl(this.alignment) * 31) + Trim.m4961hashCodeimpl(this.trim)) * 31) + Mode.m4952hashCodeimpl(this.mode);
    }

    @k
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m4942toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m4964toStringimpl(this.trim)) + ",mode=" + ((Object) Mode.m4953toStringimpl(this.mode)) + ')';
    }

    public /* synthetic */ LineHeightStyle(float f11, int i11, v vVar) {
        this(f11, i11);
    }

    private LineHeightStyle(float f11, int i11, int i12) {
        this.alignment = f11;
        this.trim = i11;
        this.mode = i12;
    }

    private LineHeightStyle(float f11, int i11) {
        this(f11, i11, Mode.Companion.m4955getFixedlzQqcRY(), null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class Mode {

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Fixed = m4949constructorimpl(0);
        private static final int Minimum = m4949constructorimpl(1);
        private final int value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m4955getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m4956getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Mode(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m4948boximpl(int i11) {
            return new Mode(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4950equalsimpl(int i11, Object obj) {
            return (obj instanceof Mode) && i11 == ((Mode) obj).m4954unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4951equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4952hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4953toStringimpl(int i11) {
            return "Mode(value=" + i11 + ')';
        }

        public boolean equals(Object obj) {
            return m4950equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4952hashCodeimpl(this.value);
        }

        public String toString() {
            return m4953toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4954unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m4949constructorimpl(int i11) {
            return i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;

        @k
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m4958constructorimpl(1);
        private static final int LastLineBottom = m4958constructorimpl(16);
        private static final int Both = m4958constructorimpl(17);
        private static final int None = m4958constructorimpl(0);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m4966getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m4967getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m4968getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m4969getNoneEVpEnUU() {
                return Trim.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Trim(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m4957boximpl(int i11) {
            return new Trim(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4959equalsimpl(int i11, Object obj) {
            return (obj instanceof Trim) && i11 == ((Trim) obj).m4965unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4960equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4961hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m4962isTrimFirstLineTopimpl$ui_text_release(int i11) {
            return (i11 & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m4963isTrimLastLineBottomimpl$ui_text_release(int i11) {
            return (i11 & 16) > 0;
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4964toStringimpl(int i11) {
            return i11 == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i11 == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i11 == Both ? "LineHeightStyle.Trim.Both" : i11 == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4959equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4961hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m4964toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4965unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m4958constructorimpl(int i11) {
            return i11;
        }
    }
}
