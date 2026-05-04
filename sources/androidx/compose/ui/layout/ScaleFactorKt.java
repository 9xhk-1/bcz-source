package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,150:1\n87#1:154\n31#1:183\n53#2,3:151\n60#2:156\n70#2:160\n53#2,3:163\n60#2:167\n70#2:171\n53#2,3:174\n60#2:178\n70#2:181\n53#2,3:184\n57#3:155\n61#3:159\n57#3:166\n61#3:170\n22#4:157\n22#4:168\n22#4:179\n22#4:182\n41#5:158\n46#5:161\n41#5:169\n46#5:172\n41#5:177\n46#5:180\n33#6:162\n33#6:173\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n99#1:154\n145#1:183\n31#1:151,3\n109#1:156\n109#1:160\n109#1:163,3\n128#1:167\n128#1:171\n128#1:174,3\n146#1:178\n147#1:181\n145#1:184,3\n109#1:155\n109#1:159\n128#1:166\n128#1:170\n109#1:157\n128#1:168\n146#1:179\n147#1:182\n109#1:158\n109#1:161\n128#1:169\n128#1:172\n146#1:177\n147#1:180\n109#1:162\n128#1:173\n*E\n"})
/* loaded from: classes.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f11, float f12) {
        return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m3954divUQTWf7w(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j12 & 4294967295L));
        return Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3955isSpecifiedFK8aYYs(long j11) {
        return j11 != ScaleFactor.Companion.m3953getUnspecified_hLwfpc();
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3957isUnspecifiedFK8aYYs(long j11) {
        return j11 == ScaleFactor.Companion.m3953getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m3959lerpbDIf60(long j11, long j12, float f11) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 >> 32)), f11);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f11);
        return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m3960takeOrElseoyDd2qo(long j11, @k a<ScaleFactor> aVar) {
        return j11 != ScaleFactor.Companion.m3953getUnspecified_hLwfpc() ? j11 : aVar.invoke().m3951unboximpl();
    }

    @Stable
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m3961timesUQTWf7w(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * Float.intBitsToFloat((int) (j12 & 4294967295L));
        return Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m3962timesmw2e94(long j11, long j12) {
        return m3961timesUQTWf7w(j12, j11);
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3956isSpecifiedFK8aYYs$annotations(long j11) {
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3958isUnspecifiedFK8aYYs$annotations(long j11) {
    }
}
