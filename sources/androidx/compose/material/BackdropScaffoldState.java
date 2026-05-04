package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Stable;
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
import x00.a;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class BackdropScaffoldState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final AnchoredDraggableState<BackdropValue> anchoredDraggableState;

    @k
    private final l<BackdropValue, Boolean> confirmValueChange;

    @m80.l
    private Density density;

    @k
    private final NestedScrollConnection nestedScrollConnection;

    @k
    private final SnackbarHostState snackbarHostState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<BackdropScaffoldState, ?> Saver(@k final AnimationSpec<Float> animationSpec, @k final l<? super BackdropValue, Boolean> lVar, @k final SnackbarHostState snackbarHostState, @k final Density density) {
            return SaverKt.Saver(new p<SaverScope, BackdropScaffoldState, BackdropValue>() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$Saver$1
                @Override // x00.p
                public final BackdropValue invoke(SaverScope saverScope, BackdropScaffoldState backdropScaffoldState) {
                    return backdropScaffoldState.getAnchoredDraggableState$material_release().getCurrentValue();
                }
            }, new l<BackdropValue, BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public final BackdropScaffoldState invoke(BackdropValue backdropValue) {
                    return BackdropScaffoldKt.BackdropScaffoldState(backdropValue, Density.this, animationSpec, lVar, snackbarHostState);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @w0(expression = "\n            BackdropScaffoldState(\n                initialValue = initialValue,\n                density = LocalDensity.current,\n                animationSpec = animationSpec,\n                confirmValueChange = confirmValueChange\n            )\n            ", imports = {}))
    public BackdropScaffoldState(@k BackdropValue backdropValue, @k AnimationSpec<Float> animationSpec, @k l<? super BackdropValue, Boolean> lVar, @k SnackbarHostState snackbarHostState) {
        this.confirmValueChange = lVar;
        this.snackbarHostState = snackbarHostState;
        AnchoredDraggableState<BackdropValue> anchoredDraggableState = new AnchoredDraggableState<>(backdropValue, new l<Float, Float>() { // from class: androidx.compose.material.BackdropScaffoldState$anchoredDraggableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                Density requireDensity;
                float f12;
                requireDensity = BackdropScaffoldState.this.requireDensity();
                f12 = BackdropScaffoldKt.PositionalThreshold;
                return Float.valueOf(requireDensity.mo377toPx0680j_4(f12));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        }, new a<Float>() { // from class: androidx.compose.material.BackdropScaffoldState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                Density requireDensity;
                float f11;
                requireDensity = BackdropScaffoldState.this.requireDensity();
                f11 = BackdropScaffoldKt.VelocityThreshold;
                return Float.valueOf(requireDensity.mo377toPx0680j_4(f11));
            }
        }, animationSpec, lVar);
        this.anchoredDraggableState = anchoredDraggableState;
        this.nestedScrollConnection = BackdropScaffoldKt.ConsumeSwipeNestedScrollConnection(anchoredDraggableState, Orientation.Vertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + this + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }

    @m80.l
    public final Object conceal(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BackdropValue.Concealed, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    @k
    public final AnchoredDraggableState<BackdropValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @k
    public final l<BackdropValue, Boolean> getConfirmValueChange() {
        return this.confirmValueChange;
    }

    @k
    public final BackdropValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @m80.l
    public final Density getDensity$material_release() {
        return this.density;
    }

    @k
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.nestedScrollConnection;
    }

    @k
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    @k
    public final BackdropValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isConcealed() {
        return this.anchoredDraggableState.getCurrentValue() == BackdropValue.Concealed;
    }

    public final boolean isRevealed() {
        return this.anchoredDraggableState.getCurrentValue() == BackdropValue.Revealed;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float progress(@k BackdropValue backdropValue, @k BackdropValue backdropValue2) {
        float positionOf = this.anchoredDraggableState.getAnchors().positionOf(backdropValue);
        float positionOf2 = this.anchoredDraggableState.getAnchors().positionOf(backdropValue2);
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
    public final Object reveal(@k c<? super g2> cVar) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BackdropValue.Revealed, 0.0f, cVar, 2, null);
        return animateTo$default == b.l() ? animateTo$default : g2.f100423a;
    }

    public final void setDensity$material_release(@m80.l Density density) {
        this.density = density;
    }

    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, l lVar, SnackbarHostState snackbarHostState, int i11, v vVar) {
        this(backdropValue, (i11 & 2) != 0 ? BackdropScaffoldDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i11 & 4) != 0 ? new l<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldState.1
            @Override // x00.l
            public final Boolean invoke(BackdropValue backdropValue2) {
                return Boolean.TRUE;
            }
        } : lVar, (i11 & 8) != 0 ? new SnackbarHostState() : snackbarHostState);
    }
}
