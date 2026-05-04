package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import g10.u;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class BottomSheetState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final AnchoredDraggableState<BottomSheetValue> anchoredDraggableState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<BottomSheetState, ?> Saver(@k final AnimationSpec<Float> animationSpec, @k final l<? super BottomSheetValue, Boolean> lVar, @k final Density density) {
            return SaverKt.Saver(new p<SaverScope, BottomSheetState, BottomSheetValue>() { // from class: androidx.compose.material.BottomSheetState$Companion$Saver$1
                @Override // x00.p
                public final BottomSheetValue invoke(SaverScope saverScope, BottomSheetState bottomSheetState) {
                    return bottomSheetState.getAnchoredDraggableState$material_release().getCurrentValue();
                }
            }, new l<BottomSheetValue, BottomSheetState>() { // from class: androidx.compose.material.BottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final BottomSheetState invoke(BottomSheetValue bottomSheetValue) {
                    return new BottomSheetState(bottomSheetValue, Density.this, animationSpec, lVar);
                }
            });
        }

        private Companion() {
        }
    }

    public BottomSheetState(@k BottomSheetValue bottomSheetValue, @k final Density density, @k AnimationSpec<Float> animationSpec, @k l<? super BottomSheetValue, Boolean> lVar) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(bottomSheetValue, new l<Float, Float>() { // from class: androidx.compose.material.BottomSheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }

            public final Float invoke(float f11) {
                float f12;
                Density density2 = Density.this;
                f12 = BottomSheetScaffoldKt.BottomSheetScaffoldPositionalThreshold;
                return Float.valueOf(density2.mo377toPx0680j_4(f12));
            }
        }, new a<Float>() { // from class: androidx.compose.material.BottomSheetState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                float f11;
                Density density2 = Density.this;
                f11 = BottomSheetScaffoldKt.BottomSheetScaffoldVelocityThreshold;
                return Float.valueOf(density2.mo377toPx0680j_4(f11));
            }
        }, animationSpec, lVar);
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f11, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = bottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return bottomSheetState.animateTo$material_release(bottomSheetValue, f11, cVar);
    }

    @m80.l
    public final Object animateTo$material_release(@k BottomSheetValue bottomSheetValue, float f11, @k c<? super g2> cVar) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomSheetValue, f11, cVar);
        return animateTo == b.l() ? animateTo : g2.f100423a;
    }

    @m80.l
    public final Object collapse(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomSheetValue.Collapsed, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @m80.l
    public final Object expand(@k c<? super g2> cVar) {
        DraggableAnchors<BottomSheetValue> anchors = this.anchoredDraggableState.getAnchors();
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!anchors.hasAnchorFor(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, bottomSheetValue, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @k
    public final AnchoredDraggableState<BottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @k
    public final BottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @k
    public final BottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isCollapsed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Collapsed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Expanded;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float progress(@k BottomSheetValue bottomSheetValue, @k BottomSheetValue bottomSheetValue2) {
        float positionOf = this.anchoredDraggableState.getAnchors().positionOf(bottomSheetValue);
        float positionOf2 = this.anchoredDraggableState.getAnchors().positionOf(bottomSheetValue2);
        float H = (u.H(this.anchoredDraggableState.getOffset(), Math.min(positionOf, positionOf2), Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (Float.isNaN(H)) {
            return 1.0f;
        }
        return Math.abs(H);
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    @m80.l
    public final Object snapTo$material_release(@k BottomSheetValue bottomSheetValue, @k c<? super g2> cVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomSheetValue, cVar);
        return snapTo == b.l() ? snapTo : g2.f100423a;
    }

    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, l lVar, int i11, v vVar) {
        this(bottomSheetValue, density, (i11 & 4) != 0 ? BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i11 & 8) != 0 ? new l<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetState.1
            @Override // x00.l
            public final Boolean invoke(BottomSheetValue bottomSheetValue2) {
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @n(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @w0(expression = "progress(from = , to = )", imports = {}))
    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }
}
