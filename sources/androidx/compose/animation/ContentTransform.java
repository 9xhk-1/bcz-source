package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,958:1\n79#2:959\n112#2,2:960\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n197#1:959\n197#1:960,2\n*E\n"})
/* loaded from: classes.dex */
public final class ContentTransform {
    public static final int $stable = 8;

    @k
    private final ExitTransition initialContentExit;

    @l
    private SizeTransform sizeTransform;

    @k
    private final EnterTransition targetContentEnter;

    @k
    private final MutableFloatState targetContentZIndex$delegate;

    public ContentTransform(@k EnterTransition enterTransition, @k ExitTransition exitTransition, float f11, @l SizeTransform sizeTransform) {
        this.targetContentEnter = enterTransition;
        this.initialContentExit = exitTransition;
        this.targetContentZIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
        this.sizeTransform = sizeTransform;
    }

    @k
    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    @l
    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    @k
    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float getTargetContentZIndex() {
        return this.targetContentZIndex$delegate.getFloatValue();
    }

    public final void setSizeTransform$animation(@l SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }

    public final void setTargetContentZIndex(float f11) {
        this.targetContentZIndex$delegate.setFloatValue(f11);
    }

    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f11, SizeTransform sizeTransform, int i11, v vVar) {
        this(enterTransition, exitTransition, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? AnimatedContentKt.SizeTransform$default(false, null, 3, null) : sizeTransform);
    }
}
