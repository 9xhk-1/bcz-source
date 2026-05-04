package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,434:1\n102#2:435\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n74#1:435\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class Dp implements Comparable<Dp> {

    @k
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m5115constructorimpl(0.0f);
    private static final float Infinity = m5115constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m5115constructorimpl(Float.NaN);
    private final float value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m5133getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m5134getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m5135getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5130getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5131getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5132getUnspecifiedD9Ej5fM$annotations() {
        }
    }

    private /* synthetic */ Dp(float f11) {
        this.value = f11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m5113boximpl(float f11) {
        return new Dp(f11);
    }

    @Stable
    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m5116div0680j_4(float f11, float f12) {
        return f11 / f12;
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m5117divu2uoSUM(float f11, float f12) {
        return m5115constructorimpl(f11 / f12);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5119equalsimpl(float f11, Object obj) {
        return (obj instanceof Dp) && Float.compare(f11, ((Dp) obj).m5129unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5120equalsimpl0(float f11, float f12) {
        return Float.compare(f11, f12) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5121hashCodeimpl(float f11) {
        return Float.hashCode(f11);
    }

    @Stable
    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m5122minus5rwHm24(float f11, float f12) {
        return m5115constructorimpl(f11 - f12);
    }

    @Stable
    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m5123plus5rwHm24(float f11, float f12) {
        return m5115constructorimpl(f11 + f12);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m5124timesu2uoSUM(float f11, float f12) {
        return m5115constructorimpl(f11 * f12);
    }

    @Stable
    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5126toStringimpl(float f11) {
        if (Float.isNaN(f11)) {
            return "Dp.Unspecified";
        }
        return f11 + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m5127unaryMinusD9Ej5fM(float f11) {
        return m5115constructorimpl(-f11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp2) {
        return m5128compareTo0680j_4(dp2.m5129unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m5128compareTo0680j_4(float f11) {
        return m5114compareTo0680j_4(this.value, f11);
    }

    public boolean equals(Object obj) {
        return m5119equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5121hashCodeimpl(this.value);
    }

    @Stable
    @k
    public String toString() {
        return m5126toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m5129unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m5114compareTo0680j_4(float f11, float f12) {
        return Float.compare(f11, f12);
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m5118divu2uoSUM(float f11, int i11) {
        return m5115constructorimpl(f11 / i11);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m5125timesu2uoSUM(float f11, int i11) {
        return m5115constructorimpl(f11 * i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m5115constructorimpl(float f11) {
        return f11;
    }
}
