package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import j00.c;
import kotlin.DeprecationLevel;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;

    @l
    private Density density;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<DrawerState, DrawerValue> Saver(@k final x00.l<? super DrawerValue, Boolean> lVar) {
            return SaverKt.Saver(new p<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // x00.p
                public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new x00.l<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final DrawerState invoke(DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, lVar);
                }
            });
        }

        private Companion() {
        }
    }

    public DrawerState(@k DrawerValue drawerValue, @k x00.l<? super DrawerValue, Boolean> lVar) {
        TweenSpec tweenSpec;
        tweenSpec = DrawerKt.AnimationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new x00.l<Float, Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                Density requireDensity;
                float f12;
                requireDensity = DrawerState.this.requireDensity();
                f12 = DrawerKt.DrawerPositionalThreshold;
                return Float.valueOf(requireDensity.mo377toPx0680j_4(f12));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        }, new a<Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                Density requireDensity;
                float f11;
                requireDensity = DrawerState.this.requireDensity();
                f11 = DrawerKt.DrawerVelocityThreshold;
                return Float.valueOf(requireDensity.mo377toPx0680j_4(f11));
            }
        }, tweenSpec, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    @l
    @n(level = DeprecationLevel.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @ExperimentalMaterialApi
    public final Object animateTo(@k DrawerValue drawerValue, @k AnimationSpec<Float> animationSpec, @k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, drawerValue, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @l
    public final Object close(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Closed, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @k
    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @k
    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @l
    public final Density getDensity$material_release() {
        return this.density;
    }

    @ExperimentalMaterialApi
    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @ExperimentalMaterialApi
    @k
    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    @l
    public final Object open(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Open, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@l Density density) {
        this.density = density;
    }

    @l
    public final Object snapTo(@k DrawerValue drawerValue, @k c<? super g2> cVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, cVar);
        return snapTo == b.l() ? snapTo : g2.f100423a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, x00.l lVar, int i11, v vVar) {
        this(drawerValue, (i11 & 2) != 0 ? new x00.l<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerState.1
            @Override // x00.l
            public final Boolean invoke(DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }
}
