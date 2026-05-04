package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,74:1\n60#2:75\n70#2:77\n22#3:76\n22#3:78\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n42#1:75\n50#1:77\n42#1:76\n50#1:78\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class TransformOrigin {
    private final long packedValue;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m2900getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TransformOrigin(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m2887boximpl(long j11) {
        return new TransformOrigin(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2888component1impl(long j11) {
        return m2895getPivotFractionXimpl(j11);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2889component2impl(long j11) {
        return m2896getPivotFractionYimpl(j11);
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m2891copyzey9I6w(long j11, float f11, float f12) {
        return TransformOriginKt.TransformOrigin(f11, f12);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m2892copyzey9I6w$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = m2895getPivotFractionXimpl(j11);
        }
        if ((i11 & 2) != 0) {
            f12 = m2896getPivotFractionYimpl(j11);
        }
        return m2891copyzey9I6w(j11, f11, f12);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2893equalsimpl(long j11, Object obj) {
        return (obj instanceof TransformOrigin) && j11 == ((TransformOrigin) obj).m2899unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2894equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m2895getPivotFractionXimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m2896getPivotFractionYimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2897hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2898toStringimpl(long j11) {
        return "TransformOrigin(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m2893equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2897hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2898toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2899unboximpl() {
        return this.packedValue;
    }

    @yz.v0
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2890constructorimpl(long j11) {
        return j11;
    }
}
