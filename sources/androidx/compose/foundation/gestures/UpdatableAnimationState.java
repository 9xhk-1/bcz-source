package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.z;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,176:1\n50#2,5:177\n*S KotlinDebug\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n*L\n92#1:177,5\n*E\n"})
/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;

    @k
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;

    @k
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f11) {
            return Math.abs(f11) < 0.01f;
        }

        private Companion() {
        }
    }

    public UpdatableAnimationState(@k AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(z.f67060a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r12 != 0.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r2) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a4 -> B:24:0x00a7). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToZero(@m80.k x00.l<? super java.lang.Float, yz.g2> r12, @m80.k x00.a<yz.g2> r13, @m80.k j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(x00.l, x00.a, j00.c):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f11) {
        this.value = f11;
    }
}
