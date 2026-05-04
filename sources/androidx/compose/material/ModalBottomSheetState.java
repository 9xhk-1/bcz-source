package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
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
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ModalBottomSheetState {

    @k
    private final AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState;

    @k
    private final AnimationSpec<Float> animationSpec;
    private final boolean isSkipHalfExpanded;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<ModalBottomSheetState, ?> Saver(@k final AnimationSpec<Float> animationSpec, @k final l<? super ModalBottomSheetValue, Boolean> lVar, final boolean z11, @k final Density density) {
            return SaverKt.Saver(new p<SaverScope, ModalBottomSheetState, ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$1
                @Override // x00.p
                public final ModalBottomSheetValue invoke(SaverScope saverScope, ModalBottomSheetState modalBottomSheetState) {
                    return modalBottomSheetState.getCurrentValue();
                }
            }, new l<ModalBottomSheetValue, ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final ModalBottomSheetState invoke(ModalBottomSheetValue modalBottomSheetValue) {
                    return new ModalBottomSheetState(modalBottomSheetValue, Density.this, lVar, animationSpec, z11);
                }
            });
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModalBottomSheetState(@k ModalBottomSheetValue modalBottomSheetValue, @k final Density density, @k l<? super ModalBottomSheetValue, Boolean> lVar, @k AnimationSpec<Float> animationSpec, boolean z11) {
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z11;
        this.anchoredDraggableState = new AnchoredDraggableState<>(modalBottomSheetValue, new l<Float, Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                float f12;
                Density density2 = Density.this;
                f12 = ModalBottomSheetKt.ModalBottomSheetPositionalThreshold;
                return Float.valueOf(density2.mo377toPx0680j_4(f12));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        }, new a<Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                float f11;
                Density density2 = Density.this;
                f11 = ModalBottomSheetKt.ModalBottomSheetVelocityThreshold;
                return Float.valueOf(density2.mo377toPx0680j_4(f11));
            }
        }, animationSpec, lVar);
        if (z11 && modalBottomSheetValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f11, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = modalBottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f11, cVar);
    }

    @m80.l
    public final Object animateTo$material_release(@k ModalBottomSheetValue modalBottomSheetValue, float f11, @k c<? super g2> cVar) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, modalBottomSheetValue, f11, cVar);
        return animateTo == b.l() ? animateTo : g2.f100423a;
    }

    @m80.l
    public final Object expand$material_release(@k c<? super g2> cVar) {
        DraggableAnchors<ModalBottomSheetValue> anchors = this.anchoredDraggableState.getAnchors();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!anchors.hasAnchorFor(modalBottomSheetValue)) {
            return g2.f100423a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, cVar, 2, null);
        return animateTo$material_release$default == b.l() ? animateTo$material_release$default : g2.f100423a;
    }

    @k
    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @k
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @k
    public final ModalBottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.HalfExpanded);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @k
    public final ModalBottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @m80.l
    public final Object halfExpand$material_release(@k c<? super g2> cVar) {
        if (!getHasHalfExpandedState$material_release()) {
            return g2.f100423a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, cVar, 2, null);
        return animateTo$material_release$default == b.l() ? animateTo$material_release$default : g2.f100423a;
    }

    @m80.l
    public final Object hide(@k c<? super g2> cVar) {
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, cVar, 2, null);
        return animateTo$material_release$default == b.l() ? animateTo$material_release$default : g2.f100423a;
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float progress(@k ModalBottomSheetValue modalBottomSheetValue, @k ModalBottomSheetValue modalBottomSheetValue2) {
        float positionOf = this.anchoredDraggableState.getAnchors().positionOf(modalBottomSheetValue);
        float positionOf2 = this.anchoredDraggableState.getAnchors().positionOf(modalBottomSheetValue2);
        float H = (u.H(this.anchoredDraggableState.getOffset(), Math.min(positionOf, positionOf2), Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (Float.isNaN(H)) {
            return 1.0f;
        }
        return Math.abs(H);
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    @m80.l
    public final Object show(@k c<? super g2> cVar) {
        DraggableAnchors<ModalBottomSheetValue> anchors = this.anchoredDraggableState.getAnchors();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        boolean hasAnchorFor = anchors.hasAnchorFor(modalBottomSheetValue);
        if (WhenMappings.$EnumSwitchMapping$0[getCurrentValue().ordinal()] == 1) {
            if (getHasHalfExpandedState$material_release()) {
                modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
            }
        } else if (!hasAnchorFor) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, cVar, 2, null);
        return animateTo$material_release$default == b.l() ? animateTo$material_release$default : g2.f100423a;
    }

    @m80.l
    public final Object snapTo$material_release(@k ModalBottomSheetValue modalBottomSheetValue, @k c<? super g2> cVar) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, modalBottomSheetValue, cVar);
        return snapTo == b.l() ? snapTo : g2.f100423a;
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Density density, l lVar, AnimationSpec animationSpec, boolean z11, int i11, v vVar) {
        this(modalBottomSheetValue, density, (i11 & 4) != 0 ? new l<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetState.1
            @Override // x00.l
            public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue2) {
                return Boolean.TRUE;
            }
        } : lVar, (i11 & 8) != 0 ? ModalBottomSheetDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i11 & 16) != 0 ? false : z11);
    }

    @n(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @w0(expression = "progress(from = , to = )", imports = {}))
    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }
}
