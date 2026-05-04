package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,269:1\n85#2:270\n113#2,2:271\n30#3:273\n30#3:281\n80#4:274\n85#4:277\n90#4:280\n80#4:282\n61#5:275\n54#5:276\n63#5:278\n59#5:279\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n168#1:270\n168#1:271,2\n196#1:273\n238#1:281\n196#1:274\n198#1:277\n197#1:280\n238#1:282\n198#1:275\n198#1:276\n197#1:278\n197#1:279\n*E\n"})
/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    @k
    private Alignment alignment;

    @k
    private final MutableState animData$delegate;

    @k
    private AnimationSpec<IntSize> animationSpec;

    @l
    private p<? super IntSize, ? super IntSize, g2> listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class AnimData {
        public static final int $stable = 8;

        @k
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j11, v vVar) {
            this(animatable, j11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m117copyO0kMr_c$default(AnimData animData, Animatable animatable, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i11 & 2) != 0) {
                j11 = animData.startSize;
            }
            return animData.m119copyO0kMr_c(animatable, j11);
        }

        @k
        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m118component2YbymL2g() {
            return this.startSize;
        }

        @k
        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m119copyO0kMr_c(@k Animatable<IntSize, AnimationVector2D> animatable, long j11) {
            return new AnimData(animatable, j11, null);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return g0.g(this.anim, animData.anim) && IntSize.m5284equalsimpl0(this.startSize, animData.startSize);
        }

        @k
        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m120getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m5287hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m121setStartSizeozmzZPI(long j11) {
            this.startSize = j11;
        }

        @k
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m5289toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j11) {
            this.anim = animatable;
            this.startSize = j11;
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, p pVar, int i11, v vVar) {
        this(animationSpec, (i11 & 2) != 0 ? Alignment.Companion.getTopStart() : alignment, (i11 & 4) != 0 ? null : pVar);
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m114setLookaheadConstraintsBRTryo0(long j11) {
        this.lookaheadConstraints = j11;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m115targetConstraintsZezNO4M(long j11) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j11;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m116animateTomzRDjE0(long j11) {
        AnimData animData = getAnimData();
        if (animData != null) {
            boolean z11 = (IntSize.m5284equalsimpl0(j11, animData.getAnim().getValue().m5290unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!IntSize.m5284equalsimpl0(j11, animData.getAnim().getTargetValue().m5290unboximpl()) || z11) {
                animData.m121setStartSizeozmzZPI(animData.getAnim().getValue().m5290unboximpl());
                c40.k.f(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j11, this, null), 3, null);
            }
        } else {
            long j12 = 1;
            animData = new AnimData(new Animatable(IntSize.m5278boximpl(j11), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m5278boximpl(IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32))), null, 8, null), j11, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m5290unboximpl();
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    @k
    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    @l
    public final p<IntSize, IntSize, g2> getListener() {
        return this.listener;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k final MeasureScope measureScope, @k Measurable measurable, long j11) {
        Placeable mo3857measureBRTryo0;
        long m5082constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m114setLookaheadConstraintsBRTryo0(j11);
            mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        } else {
            mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(m115targetConstraintsZezNO4M(j11));
        }
        final Placeable placeable = mo3857measureBRTryo0;
        final long m5281constructorimpl = IntSize.m5281constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L));
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = m5281constructorimpl;
            m5082constrain4WqzIAM = m5281constructorimpl;
        } else {
            m5082constrain4WqzIAM = ConstraintsKt.m5082constrain4WqzIAM(j11, m116animateTomzRDjE0(AnimationModifierKt.m65isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : m5281constructorimpl));
        }
        final int i11 = (int) (m5082constrain4WqzIAM >> 32);
        final int i12 = (int) (m5082constrain4WqzIAM & 4294967295L);
        return MeasureScope.layout$default(measureScope, i11, i12, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m3921place70tqf50$default(placementScope, placeable, SizeAnimationModifierNode.this.getAlignment().mo2085alignKFBX0sM(m5281constructorimpl, IntSize.m5281constructorimpl((i11 << 32) | (i12 & 4294967295L)), measureScope.getLayoutDirection()), 0.0f, 2, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        setAnimData(null);
    }

    public final void setAlignment(@k Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAnimData(@l AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    public final void setAnimationSpec(@k AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setListener(@l p<? super IntSize, ? super IntSize, g2> pVar) {
        this.listener = pVar;
    }

    public SizeAnimationModifierNode(@k AnimationSpec<IntSize> animationSpec, @k Alignment alignment, @l p<? super IntSize, ? super IntSize, g2> pVar) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = pVar;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }
}
