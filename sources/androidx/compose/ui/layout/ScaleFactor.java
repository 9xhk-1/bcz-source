package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n1#1,150:1\n41#1:155\n46#1:158\n41#1:165\n46#1:168\n41#1:170\n46#1:173\n41#1:179\n46#1:182\n41#1:188\n46#1:191\n60#2:151\n70#2:153\n60#2:156\n70#2:159\n53#2,3:162\n60#2:166\n70#2:169\n60#2:171\n70#2:174\n53#2,3:176\n60#2:180\n70#2:183\n53#2,3:185\n60#2:189\n70#2:192\n53#2,3:194\n22#3:152\n22#3:154\n22#3:157\n22#3:160\n22#3:167\n22#3:172\n22#3:181\n22#3:190\n31#4:161\n31#4:175\n31#4:184\n31#4:193\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n48#1:155\n50#1:158\n56#1:165\n56#1:168\n63#1:170\n63#1:173\n70#1:179\n70#1:182\n72#1:188\n72#1:191\n41#1:151\n46#1:153\n48#1:156\n50#1:159\n56#1:162,3\n56#1:166\n56#1:169\n63#1:171\n63#1:174\n63#1:176,3\n70#1:180\n70#1:183\n70#1:185,3\n72#1:189\n72#1:192\n80#1:194,3\n41#1:152\n46#1:154\n48#1:157\n50#1:160\n56#1:167\n63#1:172\n70#1:181\n72#1:190\n56#1:161\n63#1:175\n70#1:184\n80#1:193\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class ScaleFactor {

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m3940constructorimpl((Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L));
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m3953getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m3952getUnspecified_hLwfpc$annotations() {
        }
    }

    private /* synthetic */ ScaleFactor(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m3937boximpl(long j11) {
        return new ScaleFactor(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m3938component1impl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m3939component2impl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m3941copy8GGzs04(long j11, float f11, float f12) {
        return m3940constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m3942copy8GGzs04$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (4294967295L & j11));
        }
        return m3941copy8GGzs04(j11, f11, f12);
    }

    @Stable
    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m3943div44nBxM0(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f11;
        return m3940constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3944equalsimpl(long j11, Object obj) {
        return (obj instanceof ScaleFactor) && j11 == ((ScaleFactor) obj).m3951unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3945equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m3946getScaleXimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m3947getScaleYimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3948hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m3949times44nBxM0(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return m3940constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3950toStringimpl(long j11) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j11 >> 32)) + j2.O + Float.intBitsToFloat((int) (j11 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m3944equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m3948hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m3950toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3951unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3940constructorimpl(long j11) {
        return j11;
    }
}
