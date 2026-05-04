package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import g10.u;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BottomDrawerState {

    @k
    private final AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState;

    @l
    private Density density;

    @k
    private final NestedScrollConnection nestedScrollConnection;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@k final Density density, @k final x00.l<? super BottomDrawerValue, Boolean> lVar, @k final AnimationSpec<Float> animationSpec) {
            return SaverKt.Saver(new p<SaverScope, BottomDrawerState, BottomDrawerValue>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$1
                @Override // x00.p
                public final BottomDrawerValue invoke(SaverScope saverScope, BottomDrawerState bottomDrawerState) {
                    return bottomDrawerState.getAnchoredDraggableState$material_release().getCurrentValue();
                }
            }, new x00.l<BottomDrawerValue, BottomDrawerState>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final BottomDrawerState invoke(BottomDrawerValue bottomDrawerValue) {
                    return new BottomDrawerState(bottomDrawerValue, Density.this, lVar, animationSpec);
                }
            });
        }

        private Companion() {
        }
    }

    public BottomDrawerState(@k BottomDrawerValue bottomDrawerValue, @k final Density density, @k x00.l<? super BottomDrawerValue, Boolean> lVar, @k AnimationSpec<Float> animationSpec) {
        NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection;
        AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState = new AnchoredDraggableState<>(bottomDrawerValue, new x00.l<Float, Float>() { // from class: androidx.compose.material.BottomDrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                float f12;
                Density density2 = Density.this;
                f12 = DrawerKt.DrawerPositionalThreshold;
                return Float.valueOf(density2.mo377toPx0680j_4(f12));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        }, new a<Float>() { // from class: androidx.compose.material.BottomDrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                float f11;
                Density density2 = Density.this;
                f11 = DrawerKt.DrawerVelocityThreshold;
                return Float.valueOf(density2.mo377toPx0680j_4(f11));
            }
        }, animationSpec, lVar);
        this.anchoredDraggableState = anchoredDraggableState;
        ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection = DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(anchoredDraggableState);
        this.nestedScrollConnection = ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection;
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, float f11, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = bottomDrawerState.anchoredDraggableState.getLastVelocity();
        }
        return bottomDrawerState.animateTo$material_release(bottomDrawerValue, f11, cVar);
    }

    private final boolean isOpenEnabled() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(BottomDrawerValue.Open);
    }

    @l
    public final Object animateTo$material_release(@k BottomDrawerValue bottomDrawerValue, float f11, @k c<? super g2> cVar) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomDrawerValue, f11, cVar);
        return animateTo == b.l() ? animateTo : g2.f100423a;
    }

    @l
    public final Object close(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Closed, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    public final boolean confirmStateChange$material_release(@k BottomDrawerValue bottomDrawerValue) {
        return this.anchoredDraggableState.getConfirmValueChange$material_release().invoke(bottomDrawerValue).booleanValue();
    }

    @l
    public final Object expand(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Expanded, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @k
    public final AnchoredDraggableState<BottomDrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @k
    public final BottomDrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @l
    public final Density getDensity$material_release() {
        return this.density;
    }

    @k
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @k
    public final BottomDrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isClosed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Expanded;
    }

    public final boolean isOpen() {
        return this.anchoredDraggableState.getCurrentValue() != BottomDrawerValue.Closed;
    }

    @l
    public final Object open(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, isOpenEnabled() ? BottomDrawerValue.Open : BottomDrawerValue.Expanded, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float progress(@k BottomDrawerValue bottomDrawerValue, @k BottomDrawerValue bottomDrawerValue2) {
        float positionOf = this.anchoredDraggableState.getAnchors().positionOf(bottomDrawerValue);
        float positionOf2 = this.anchoredDraggableState.getAnchors().positionOf(bottomDrawerValue2);
        float H = (u.H(this.anchoredDraggableState.getOffset(), Math.min(positionOf, positionOf2), Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (Float.isNaN(H)) {
            return 1.0f;
        }
        return Math.abs(H);
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material_release(@l Density density) {
        this.density = density;
    }

    @l
    public final Object snapTo$material_release(@k BottomDrawerValue bottomDrawerValue, @k c<? super g2> cVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomDrawerValue, cVar);
        return snapTo == b.l() ? snapTo : g2.f100423a;
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Density density, x00.l lVar, AnimationSpec animationSpec, int i11, v vVar) {
        this(bottomDrawerValue, density, (i11 & 4) != 0 ? new x00.l<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.BottomDrawerState.1
            @Override // x00.l
            public final Boolean invoke(BottomDrawerValue bottomDrawerValue2) {
                return Boolean.TRUE;
            }
        } : lVar, (i11 & 8) != 0 ? DrawerDefaults.INSTANCE.getAnimationSpec() : animationSpec);
    }

    @n(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @w0(expression = "progress(from = , to = )", imports = {}))
    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }
}
