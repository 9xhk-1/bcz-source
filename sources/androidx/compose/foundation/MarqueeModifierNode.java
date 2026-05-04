package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import c40.l2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,535:1\n78#2:536\n107#2,2:537\n78#2:539\n107#2,2:540\n85#3:542\n113#3,2:543\n85#3:545\n113#3,2:546\n85#3:548\n113#3,2:549\n85#3:551\n61#4:552\n61#4:562\n70#5:553\n80#5:556\n70#5:563\n22#6:554\n22#6:564\n30#7:555\n202#8,5:557\n207#8,3:565\n249#8,9:568\n119#8,8:577\n119#8,8:585\n259#8,4:593\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n*L\n211#1:536\n211#1:537,2\n212#1:539\n212#1:540,2\n213#1:542\n213#1:543,2\n216#1:545\n216#1:546,2\n217#1:548\n217#1:549,2\n228#1:551\n343#1:552\n349#1:562\n343#1:553\n345#1:556\n349#1:563\n343#1:554\n349#1:564\n345#1:555\n349#1:557,5\n349#1:565,3\n349#1:568,9\n359#1:577,8\n366#1:585,8\n349#1:593,4\n*E\n"})
/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {

    @l
    private l2 animationJob;

    @m80.k
    private final MutableState animationMode$delegate;

    @m80.k
    private final MutableIntState containerWidth$delegate;

    @m80.k
    private final MutableIntState contentWidth$delegate;
    private int delayMillis;

    @m80.k
    private final MutableState hasFocus$delegate;
    private int initialDelayMillis;
    private int iterations;

    @l
    private GraphicsLayer marqueeLayer;

    @m80.k
    private final Animatable<Float, AnimationVector1D> offset;

    @m80.k
    private final MutableState spacing$delegate;

    @m80.k
    private final State spacingPx$delegate;
    private float velocity;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i11, int i12, int i13, int i14, MarqueeSpacing marqueeSpacing, float f11, v vVar) {
        this(i11, i12, i13, i14, marqueeSpacing, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDirection() {
        float signum = Math.signum(this.velocity);
        int i11 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = -1;
        }
        return signum * i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx$delegate.getValue()).intValue();
    }

    private final void restartAnimation() {
        l2 f11;
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        if (isAttached()) {
            f11 = c40.k.f(getCoroutineScope(), null, null, new MarqueeModifierNode$restartAnimation$1(l2Var, this, null), 3, null);
            this.animationJob = f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(j00.c<? super g2> cVar) {
        if (this.iterations <= 0) {
            return g2.f100423a;
        }
        Object h11 = c40.i.h(FixedMotionDurationScale.INSTANCE, new MarqueeModifierNode$runAnimation$2(this, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    private final void setContainerWidth(int i11) {
        this.containerWidth$delegate.setIntValue(i11);
    }

    private final void setContentWidth(int i11) {
        this.contentWidth$delegate.setIntValue(i11);
    }

    private final void setHasFocus(boolean z11) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z11));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k final ContentDrawScope contentDrawScope) {
        float floatValue = this.offset.getValue().floatValue() * getDirection();
        boolean z11 = getDirection() != 1.0f ? this.offset.getValue().floatValue() < ((float) getContainerWidth()) : this.offset.getValue().floatValue() < ((float) getContentWidth());
        boolean z12 = getDirection() != 1.0f ? this.offset.getValue().floatValue() > ((float) getSpacingPx()) : this.offset.getValue().floatValue() > ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()));
        float contentWidth = getDirection() == 1.0f ? getContentWidth() + getSpacingPx() : (-getContentWidth()) - getSpacingPx();
        float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() & 4294967295L));
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            contentDrawScope.mo3061recordJVtK1S4(graphicsLayer, IntSize.m5281constructorimpl((getContentWidth() << 32) | (c10.d.L0(intBitsToFloat) & 4294967295L)), new x00.l<DrawScope, g2>() { // from class: androidx.compose.foundation.MarqueeModifierNode$draw$1$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    ContentDrawScope.this.drawContent();
                }
            });
        }
        float containerWidth = floatValue + getContainerWidth();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & contentDrawScope.mo3060getSizeNHjbRc()));
        int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2984clipRectN_I0leg(floatValue, 0.0f, containerWidth, intBitsToFloat2, m2498getIntersectrtfAjoo);
            GraphicsLayer graphicsLayer2 = this.marqueeLayer;
            if (graphicsLayer2 != null) {
                if (z11) {
                    GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                }
                if (z12) {
                    contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                        contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                    } finally {
                    }
                }
                drawContext.getCanvas().restore();
                drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            }
            if (z11) {
                contentDrawScope.drawContent();
            }
            if (z12) {
                contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
                try {
                    contentDrawScope.drawContent();
                    contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                } finally {
                }
            }
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        } catch (Throwable th2) {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m321getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode$delegate.getValue()).m313unboximpl();
    }

    @m80.k
    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m5085constrainWidthK40F9xA(j11, mo3857measureBRTryo0.getWidth()));
        setContentWidth(mo3857measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, getContainerWidth(), mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.MarqueeModifierNode$measure$1
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
                Animatable animatable;
                float direction;
                Placeable placeable = Placeable.this;
                animatable = this.offset;
                float f11 = -((Number) animatable.getValue()).floatValue();
                direction = this.getDirection();
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, c10.d.L0(f11 * direction), 0, 0.0f, (x00.l) null, 12, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        GraphicsContext requireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        if (graphicsLayer != null) {
            requireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.marqueeLayer = requireGraphicsContext.createGraphicsLayer();
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.animationJob = null;
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
            this.marqueeLayer = null;
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@m80.k FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m322setAnimationMode97h66l8(int i11) {
        this.animationMode$delegate.setValue(MarqueeAnimationMode.m307boximpl(i11));
    }

    public final void setSpacing(@m80.k MarqueeSpacing marqueeSpacing) {
        this.spacing$delegate.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m323updatelWfNwf4(int i11, int i12, int i13, int i14, @m80.k MarqueeSpacing marqueeSpacing, float f11) {
        setSpacing(marqueeSpacing);
        m322setAnimationMode97h66l8(i12);
        if (this.iterations == i11 && this.delayMillis == i13 && this.initialDelayMillis == i14 && Dp.m5120equalsimpl0(this.velocity, f11)) {
            return;
        }
        this.iterations = i11;
        this.delayMillis = i13;
        this.initialDelayMillis = i14;
        this.velocity = f11;
        restartAnimation();
    }

    private MarqueeModifierNode(int i11, int i12, int i13, int i14, final MarqueeSpacing marqueeSpacing, float f11) {
        this.iterations = i11;
        this.delayMillis = i13;
        this.initialDelayMillis = i14;
        this.velocity = f11;
        this.contentWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.animationMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m307boximpl(i12), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new x00.a<Integer>() { // from class: androidx.compose.foundation.MarqueeModifierNode$spacingPx$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Integer invoke() {
                int contentWidth;
                int containerWidth;
                MarqueeSpacing marqueeSpacing2 = MarqueeSpacing.this;
                MarqueeModifierNode marqueeModifierNode = this;
                Density requireDensity = DelegatableNodeKt.requireDensity(marqueeModifierNode);
                contentWidth = marqueeModifierNode.getContentWidth();
                containerWidth = marqueeModifierNode.getContainerWidth();
                return Integer.valueOf(marqueeSpacing2.calculateSpacing(requireDensity, contentWidth, containerWidth));
            }
        });
    }
}
