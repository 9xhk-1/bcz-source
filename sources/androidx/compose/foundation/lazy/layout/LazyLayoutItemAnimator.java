package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import c40.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,587:1\n102#2,2:588\n34#2,6:590\n104#2:596\n34#2,4:625\n39#2:636\n34#2,6:639\n34#2,6:647\n34#2,6:684\n34#2,6:692\n34#2,4:731\n39#2:741\n32#3:597\n32#3:599\n80#4:598\n80#4:600\n85#4:736\n90#4:738\n80#4:740\n365#5,3:601\n329#5,6:604\n339#5,3:611\n342#5,9:615\n368#5:624\n372#5,3:700\n329#5,6:703\n339#5,3:710\n342#5,2:714\n345#5,6:718\n375#5:724\n1399#6:610\n1270#6:614\n1399#6:663\n1270#6:667\n1399#6:709\n1270#6:713\n1#7:629\n13309#8,2:630\n13309#8,2:632\n13309#8,2:634\n13374#8,3:670\n12474#8,2:673\n13309#8,2:698\n13309#8,2:716\n13374#8,3:725\n13374#8,3:728\n1011#9,2:637\n1002#9,2:645\n1011#9,2:682\n1002#9,2:690\n231#10,3:653\n200#10,7:656\n211#10,3:664\n214#10,2:668\n217#10,6:675\n234#10:681\n54#11:735\n59#11:737\n30#12:739\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n89#1:588,2\n89#1:590,6\n89#1:596\n113#1:625,4\n113#1:636\n189#1:639,6\n199#1:647,6\n289#1:684,6\n314#1:692,6\n433#1:731,4\n433#1:741\n102#1:597\n104#1:599\n102#1:598\n104#1:600\n438#1:736\n439#1:738\n437#1:740\n111#1:601,3\n111#1:604,6\n111#1:611,3\n111#1:615,9\n111#1:624\n368#1:700,3\n368#1:703,6\n368#1:710,3\n368#1:714,2\n368#1:718,6\n368#1:724\n111#1:610\n111#1:614\n210#1:663\n210#1:667\n368#1:709\n368#1:713\n145#1:630,2\n157#1:632,2\n166#1:634,2\n226#1:670,3\n264#1:673,2\n353#1:698,2\n369#1:716,2\n390#1:725,3\n401#1:728,3\n188#1:637,2\n198#1:645,2\n288#1:682,2\n313#1:690,2\n210#1:653,3\n210#1:656,7\n210#1:664,3\n210#1:668,2\n210#1:675,6\n210#1:681\n438#1:735\n439#1:737\n437#1:739\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;

    @l
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;

    @l
    private LazyLayoutKeyIndexMap keyIndexMap;

    @k
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();

    @k
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();

    @k
    private final List<T> movingInFromStartBound = new ArrayList();

    @k
    private final List<T> movingInFromEndBound = new ArrayList();

    @k
    private final List<T> movingAwayToStartBound = new ArrayList();

    @k
    private final List<T> movingAwayToEndBound = new ArrayList();

    @k
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();

    @k
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {

        @k
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(@k LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        @k
        public final DisplayingDisappearingItemsElement copy(@k LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsElement(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && g0.g(this.animator, ((DisplayingDisappearingItemsElement) obj).animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@k InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        @k
        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        @k
        public DisplayingDisappearingItemsNode create() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(@k DisplayingDisappearingItemsNode displayingDisappearingItemsNode) {
            displayingDisappearingItemsNode.setAnimator(this.animator);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,587:1\n34#2,4:588\n39#2:599\n120#3,7:592\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode\n*L\n552#1:588,4\n552#1:599\n556#1:592,7\n*E\n"})
    public static final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {

        @k
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(@k LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        @k
        public final DisplayingDisappearingItemsNode copy(@k LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsNode(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(@k ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i11);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float m5243getXimpl = IntOffset.m5243getXimpl(lazyLayoutItemAnimation.m886getFinalOffsetnOccac());
                    float m5243getXimpl2 = m5243getXimpl - IntOffset.m5243getXimpl(layer.m3153getTopLeftnOccac());
                    float m5244getYimpl = IntOffset.m5244getYimpl(lazyLayoutItemAnimation.m886getFinalOffsetnOccac()) - IntOffset.m5244getYimpl(layer.m3153getTopLeftnOccac());
                    contentDrawScope.getDrawContext().getTransform().translate(m5243getXimpl2, m5244getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().translate(-m5243getXimpl2, -m5244getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && g0.g(this.animator, ((DisplayingDisappearingItemsNode) obj).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(@k LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            if (g0.g(this.animator, lazyLayoutItemAnimator) || !getNode().isAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode = this;
            this.animator = lazyLayoutItemAnimator;
        }

        @k
        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n12474#2,2:588\n1#3:590\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo\n*L\n479#1:588,2\n*E\n"})
    public final class ItemInfo {

        @k
        private LazyLayoutItemAnimation[] animations;

        @l
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private int span;

        public ItemInfo() {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
            lazyLayoutItemAnimationArr = LazyLayoutItemAnimatorKt.EmptyArray;
            this.animations = lazyLayoutItemAnimationArr;
            this.span = 1;
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.isRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, r0 r0Var, GraphicsContext graphicsContext, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 32) != 0) {
                i13 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, r0Var, graphicsContext, i11, i12, i13);
        }

        @k
        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        @l
        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m895getConstraintsDWUhwKw() {
            return this.constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final int getLane() {
            return this.lane;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getSpan() {
            return this.span;
        }

        /* renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m896setConstraints_Sx5XlM(@l Constraints constraints) {
            this.constraints = constraints;
        }

        public final void setCrossAxisOffset(int i11) {
            this.crossAxisOffset = i11;
        }

        public final void setLane(int i11) {
            this.lane = i11;
        }

        public final void setSpan(int i11) {
            this.span = i11;
        }

        public final void updateAnimation(@k T t11, @k r0 r0Var, @k GraphicsContext graphicsContext, int i11, int i12, int i13) {
            LazyLayoutAnimationSpecsNode specs;
            if (!isRunningPlacement()) {
                this.layoutMinOffset = i11;
                this.layoutMaxOffset = i12;
            }
            int length = this.animations.length;
            for (int placeablesCount = t11.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.animations.length != t11.getPlaceablesCount()) {
                Object[] copyOf = Arrays.copyOf(this.animations, t11.getPlaceablesCount());
                g0.o(copyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) copyOf;
            }
            this.constraints = Constraints.m5055boximpl(t11.mo839getConstraintsmsEJaDk());
            this.crossAxisOffset = i13;
            this.lane = t11.getLane();
            this.span = t11.getSpan();
            int placeablesCount2 = t11.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i14 = 0; i14 < placeablesCount2; i14++) {
                specs = LazyLayoutItemAnimatorKt.getSpecs(t11.getParentData(i14));
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i14];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i14] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i14];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(r0Var, graphicsContext, new x00.a<g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode;
                                drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // x00.a
                            public /* bridge */ /* synthetic */ g2 invoke() {
                                invoke2();
                                return g2.f100423a;
                            }
                        });
                        this.animations[i14] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo840getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo840getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.isVertical() ? IntOffset.m5244getYimpl(mo840getOffsetBjo55l4) : IntOffset.m5243getXimpl(mo840getOffsetBjo55l4);
    }

    private final boolean getHasAnimations(T t11) {
        LazyLayoutAnimationSpecsNode specs;
        int placeablesCount = t11.getPlaceablesCount();
        for (int i11 = 0; i11 < placeablesCount; i11++) {
            specs = LazyLayoutItemAnimatorKt.getSpecs(t11.getParentData(i11));
            if (specs != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo840getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo840getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m5244getYimpl(mo840getOffsetBjo55l4) : IntOffset.m5243getXimpl(mo840getOffsetBjo55l4);
    }

    private final void initializeAnimation(T t11, int i11, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        int i12 = 0;
        long mo840getOffsetBjo55l4 = t11.mo840getOffsetBjo55l4(0);
        long m5239copyiSbpLlY$default = t11.isVertical() ? IntOffset.m5239copyiSbpLlY$default(mo840getOffsetBjo55l4, 0, i11, 1, null) : IntOffset.m5239copyiSbpLlY$default(mo840getOffsetBjo55l4, i11, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i13 = 0;
        while (i12 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i12];
            int i14 = i13 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m892setRawOffsetgyyYBs(IntOffset.m5247plusqkQi6aY(m5239copyiSbpLlY$default, IntOffset.m5246minusqkQi6aY(t11.mo840getOffsetBjo55l4(i13), mo840getOffsetBjo55l4)));
            }
            i12++;
            i13 = i14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i11, ItemInfo itemInfo, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            g0.m(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i11, itemInfo);
    }

    private final void releaseAnimations() {
        if (this.keyToItemInfoMap.isNotEmpty()) {
            MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
            Object[] objArr = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i11 << 3) + i13]).getAnimations()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.release();
                                    }
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.keyToItemInfoMap.clear();
        }
    }

    private final void removeInfoForKey(Object obj) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo remove = this.keyToItemInfoMap.remove(obj);
        if (remove == null || (animations = remove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    private final void startPlacementAnimationsIfNeeded(T t11, boolean z11) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t11.getKey());
        g0.m(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i11];
            int i13 = i12 + 1;
            if (lazyLayoutItemAnimation != null) {
                long mo840getOffsetBjo55l4 = t11.mo840getOffsetBjo55l4(i12);
                long m889getRawOffsetnOccac = lazyLayoutItemAnimation.m889getRawOffsetnOccac();
                if (!IntOffset.m5242equalsimpl0(m889getRawOffsetnOccac, LazyLayoutItemAnimation.Companion.m893getNotInitializednOccac()) && !IntOffset.m5242equalsimpl0(m889getRawOffsetnOccac, mo840getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m885animatePlacementDeltaar5cAso(IntOffset.m5246minusqkQi6aY(mo840getOffsetBjo55l4, m889getRawOffsetnOccac), z11);
                }
                lazyLayoutItemAnimation.m892setRawOffsetgyyYBs(mo840getOffsetBjo55l4);
            }
            i11++;
            i12 = i13;
        }
    }

    public static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z11);
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t11) {
        int lane = t11.getLane();
        int span = t11.getSpan() + lane;
        int i11 = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = iArr[lane] + t11.getMainAxisSizeWithSpacings();
            iArr[lane] = mainAxisSizeWithSpacings;
            i11 = Math.max(i11, mainAxisSizeWithSpacings);
            lane++;
        }
        return i11;
    }

    @l
    public final LazyLayoutItemAnimation getAnimation(@k Object obj, int i11) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i11];
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m894getMinSizeToFitDisappearingItemsYbymL2g() {
        long m5291getZeroYbymL2g = IntSize.Companion.m5291getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i11);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                m5291getZeroYbymL2g = IntSize.m5281constructorimpl((Math.max((int) (m5291getZeroYbymL2g & 4294967295L), IntOffset.m5244getYimpl(lazyLayoutItemAnimation.m889getRawOffsetnOccac()) + ((int) (layer.m3151getSizeYbymL2g() & 4294967295L))) & 4294967295L) | (Math.max((int) (m5291getZeroYbymL2g >> 32), IntOffset.m5243getXimpl(lazyLayoutItemAnimation.m889getRawOffsetnOccac()) + ((int) (layer.m3151getSizeYbymL2g() >> 32))) << 32));
            }
        }
        return m5291getZeroYbymL2g;
    }

    @k
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
    
        startPlacementAnimationsIfNeeded$default(r42, r14, false, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0115, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x010e, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ff, code lost:
    
        r35 = r1;
        r36 = r2;
        removeInfoForKey(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0210, code lost:
    
        r6 = new int[r51];
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        r42.firstVisibleIndex = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0212, code lost:
    
        if (r24 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0214, code lost:
    
        if (r11 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021e, code lost:
    
        if (r42.movingInFromStartBound.isEmpty() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0220, code lost:
    
        r1 = r42.movingInFromStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0227, code lost:
    
        if (r1.size() <= 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0229, code lost:
    
        a00.l0.r0(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0231, code lost:
    
        r7 = r42.movingInFromStartBound;
        r12 = r7.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        if (r13 >= r12) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023d, code lost:
    
        r1 = r7.get(r13);
        initializeAnimation$default(r42, r1, r53 - updateAndReturnOffsetFor(r6, r1), null, 4, null);
        startPlacementAnimationsIfNeeded$default(r42, r1, false, 2, null);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r49 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0258, code lost:
    
        a00.q.T1(r6, 0, 0, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026f, code lost:
    
        if (r42.movingInFromEndBound.isEmpty() != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0271, code lost:
    
        r1 = r42.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0278, code lost:
    
        if (r1.size() <= 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027a, code lost:
    
        a00.l0.r0(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0282, code lost:
    
        r7 = r42.movingInFromEndBound;
        r12 = r7.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x028c, code lost:
    
        if (r13 >= r12) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028e, code lost:
    
        r1 = r7.get(r13);
        initializeAnimation$default(r42, r1, (r54 + updateAndReturnOffsetFor(r6, r1)) - r1.getMainAxisSizeWithSpacings(), null, 4, null);
        startPlacementAnimationsIfNeeded$default(r42, r1, false, 2, null);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r4 = androidx.compose.ui.unit.IntOffset.m5237constructorimpl((r43 & 4294967295L) | (0 << 32));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ae, code lost:
    
        a00.q.T1(r6, 0, 0, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bd, code lost:
    
        r1 = r42.movingAwayKeys;
        r2 = r1.elements;
        r1 = r1.metadata;
        r3 = r1.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:
    
        if (r3 < 0) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c8, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c9, code lost:
    
        r12 = r1[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d3, code lost:
    
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d5, code lost:
    
        r5 = 8 - ((~(r4 - r3)) >>> 31);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02df, code lost:
    
        if (r7 >= r5) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r50 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e5, code lost:
    
        if ((r12 & 255) >= 128) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e7, code lost:
    
        r14 = r2[(r4 << 3) + r7];
        r15 = r42.keyToItemInfoMap.get(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f4, code lost:
    
        if (r15 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f8, code lost:
    
        r31 = r1;
        r1 = r47.getIndex(r14);
        r32 = r2;
        r15.setSpan(java.lang.Math.min(r51, r15.getSpan()));
        r33 = r7;
        r15.setLane(java.lang.Math.min(r51 - r15.getSpan(), r15.getLane()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x031f, code lost:
    
        if (r1 != (-1)) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0321, code lost:
    
        r1 = r15.getAnimations();
        r7 = r1.length;
        r2 = 0;
        r25 = false;
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x032b, code lost:
    
        if (r2 >= r7) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x032d, code lost:
    
        r49 = r1;
        r1 = r49[r2];
        r27 = r26 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0333, code lost:
    
        if (r1 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r52 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0339, code lost:
    
        if (r1.isDisappearanceAnimationInProgress() == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x033b, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x033d, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0393, code lost:
    
        r2 = r28 + 1;
        r1 = r49;
        r26 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0346, code lost:
    
        if (r1.isDisappearanceAnimationFinished() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0348, code lost:
    
        r1.release();
        r15.getAnimations()[r26] = null;
        r28 = r2;
        r42.disappearingItems.remove(r1);
        r1 = r42.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x035c, code lost:
    
        if (r1 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x035e, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r1);
        r1 = yz.g2.f100423a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0364, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x036a, code lost:
    
        if (r1.getLayer() == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x036c, code lost:
    
        r1.animateDisappearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0373, code lost:
    
        if (r1.isDisappearanceAnimationInProgress() == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0375, code lost:
    
        r42.disappearingItems.add(r1);
        r1 = r42.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x037c, code lost:
    
        if (r1 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x037e, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r1);
        r1 = yz.g2.f100423a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0384, code lost:
    
        r1.release();
        r15.getAnimations()[r26] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r1 = r42.keyToItemInfoMap;
        r15 = r1.keys;
        r1 = r1.metadata;
        r13 = r1.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0390, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x039c, code lost:
    
        if (r25 != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x039e, code lost:
    
        removeInfoForKey(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0423, code lost:
    
        r12 = r12 >> 8;
        r7 = r33 + 1;
        r1 = r31;
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a3, code lost:
    
        r2 = r15.m895getConstraintsDWUhwKw();
        kotlin.jvm.internal.g0.m(r2);
        r1 = r48.mo842getAndMeasurehBUhpc(r1, r15.getLane(), r15.getSpan(), r2.m5074unboximpl());
        r1.setNonScrollableItem(true);
        r7 = r15.getAnimations();
        r1 = r7.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03d0, code lost:
    
        if (r7 >= r1) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (r13 < 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03d2, code lost:
    
        r25 = r7[r7];
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03d6, code lost:
    
        if (r25 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03d8, code lost:
    
        r1 = r25.isPlacementAnimationInProgress();
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03df, code lost:
    
        if (r1 != true) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03f5, code lost:
    
        r15.updateAnimation(r1, r55, r56, r53, r54, r15.getCrossAxisOffset());
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x040a, code lost:
    
        if (r1 >= r42.firstVisibleIndex) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x040c, code lost:
    
        r42.movingAwayToStartBound.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0412, code lost:
    
        r42.movingAwayToEndBound.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        r24 = r14;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03e4, code lost:
    
        r7 = r25 + 1;
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03e2, code lost:
    
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03e9, code lost:
    
        if (r11 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ef, code lost:
    
        if (r1 != r11.getIndex(r14)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03f1, code lost:
    
        removeInfoForKey(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x041a, code lost:
    
        r31 = r1;
        r32 = r2;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r14 = r1[r12];
        r27 = r1;
        r26 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x042c, code lost:
    
        r31 = r1;
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0434, code lost:
    
        if (r5 != 8) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x043f, code lost:
    
        if (r4 == r3) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0441, code lost:
    
        r4 = r4 + 1;
        r1 = r31;
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0437, code lost:
    
        r31 = r1;
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0451, code lost:
    
        if (r42.movingAwayToStartBound.isEmpty() != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0453, code lost:
    
        r1 = r42.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x045a, code lost:
    
        if (r1.size() <= 1) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x045c, code lost:
    
        a00.l0.r0(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2(r47));
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0464, code lost:
    
        r1 = r42.movingAwayToStartBound;
        r2 = r1.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x046e, code lost:
    
        if (r3 >= r2) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0470, code lost:
    
        r4 = r1.get(r3);
        r5 = r42.keyToItemInfoMap.get(r4.getKey());
        kotlin.jvm.internal.g0.m(r5);
        r5 = r5;
        r7 = updateAndReturnOffsetFor(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0489, code lost:
    
        if (r50 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x048b, code lost:
    
        r10 = getMainAxisOffset((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) a00.r0.G2(r46));
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x049a, code lost:
    
        r4.position(r10 - r7, r5.getCrossAxisOffset(), r44, r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04a6, code lost:
    
        if (r24 == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04a8, code lost:
    
        startPlacementAnimationsIfNeeded(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r1 = 8 - ((~(r12 - r13)) >>> 31);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04ac, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0496, code lost:
    
        r10 = r5.getLayoutMinOffset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04af, code lost:
    
        r7 = r44;
        r11 = r45;
        a00.q.T1(r6, 0, 0, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04cf, code lost:
    
        if (r42.movingAwayToEndBound.isEmpty() != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04d1, code lost:
    
        r1 = r42.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04d8, code lost:
    
        if (r1.size() <= 1) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (r2 >= r1) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04da, code lost:
    
        a00.l0.r0(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2(r47));
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04e2, code lost:
    
        r1 = r42.movingAwayToEndBound;
        r2 = r1.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04ec, code lost:
    
        if (r3 >= r2) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04ee, code lost:
    
        r4 = r1.get(r3);
        r5 = r42.keyToItemInfoMap.get(r4.getKey());
        kotlin.jvm.internal.g0.m(r5);
        r5 = r5;
        r9 = updateAndReturnOffsetFor(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0507, code lost:
    
        if (r50 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0509, code lost:
    
        r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) a00.r0.u3(r46);
        r12 = getMainAxisOffset(r10) + r10.getMainAxisSizeWithSpacings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x051d, code lost:
    
        r4.position((r12 - r4.getMainAxisSizeWithSpacings()) + r9, r5.getCrossAxisOffset(), r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x052b, code lost:
    
        if (r24 == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x052d, code lost:
    
        startPlacementAnimationsIfNeeded(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0530, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0519, code lost:
    
        r12 = r5.getLayoutMaxOffset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0533, code lost:
    
        r1 = r42.movingAwayToStartBound;
        a00.o0.t1(r1);
        r2 = yz.g2.f100423a;
        r46.addAll(0, r1);
        r46.addAll(r42.movingAwayToEndBound);
        r42.movingInFromStartBound.clear();
        r42.movingInFromEndBound.clear();
        r42.movingAwayToStartBound.clear();
        r42.movingAwayToEndBound.clear();
        r42.movingAwayKeys.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0560, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04c3, code lost:
    
        r7 = r44;
        r11 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00cb, code lost:
    
        if (r12 == r13) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00cd, code lost:
    
        r12 = r12 + 1;
        r2 = r26;
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if ((r14 & 255) >= 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x00d4, code lost:
    
        r26 = r2;
        r24 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0070, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x005b, code lost:
    
        r4 = androidx.compose.ui.unit.IntOffset.m5237constructorimpl((r43 << 32) | (0 & 4294967295L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0044, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r29 = r2;
        r30 = r14;
        r42.movingAwayKeys.add(r15[(r12 << 3) + r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        r14 = r30 >> 8;
        r2 = r29 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        r29 = r2;
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r1 != 8) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        r1 = r26.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        if (r2 >= r1) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        r14 = r46.get(r2);
        r42.movingAwayKeys.remove(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (getHasAnimations(r14) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        r25 = r42.keyToItemInfoMap.get(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        if (r11 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        r13 = r11.getIndex(r14.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        if (r13 != (-1)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0111, code lost:
    
        if (r11 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        if (r25 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        r12 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo(r42);
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.updateAnimation$default(r12, r14, r55, r56, r53, r54, 0, 32, null);
        r35 = r1;
        r36 = r2;
        r42.keyToItemInfoMap.set(r14.getKey(), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0143, code lost:
    
        if (r14.getIndex() == r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0146, code lost:
    
        if (r13 == (-1)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        if (r13 >= r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014a, code lost:
    
        r42.movingInFromStartBound.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x020a, code lost:
    
        r2 = r36 + 1;
        r1 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0151, code lost:
    
        r42.movingInFromEndBound.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
    
        r25 = r14.mo840getOffsetBjo55l4(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0161, code lost:
    
        if (r14.isVertical() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0163, code lost:
    
        r1 = androidx.compose.ui.unit.IntOffset.m5244getYimpl(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016c, code lost:
    
        initializeAnimation(r14, r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016f, code lost:
    
        if (r15 == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        r1 = r12.getAnimations();
        r2 = r1.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0177, code lost:
    
        if (r12 >= r2) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        r13 = r1[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        if (r13 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        r13.animateAppearance();
        r13 = yz.g2.f100423a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0168, code lost:
    
        r1 = androidx.compose.ui.unit.IntOffset.m5243getXimpl(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
    
        r35 = r1;
        r36 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0189, code lost:
    
        if (r24 == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018b, code lost:
    
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.updateAnimation$default(r25, r14, r55, r56, r53, r54, 0, 32, null);
        r1 = r25.getAnimations();
        r2 = r1.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a4, code lost:
    
        if (r12 >= r2) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
    
        r13 = r1[r12];
        r26 = r1;
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ac, code lost:
    
        if (r13 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bc, code lost:
    
        if (androidx.compose.ui.unit.IntOffset.m5242equalsimpl0(r13.m889getRawOffsetnOccac(), androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.Companion.m893getNotInitializednOccac()) != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r3 = r42.firstVisibleIndex;
        r4 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) a00.r0.L2(r46);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01be, code lost:
    
        r13.m892setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffset.m5247plusqkQi6aY(r13.m889getRawOffsetnOccac(), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c9, code lost:
    
        r12 = r12 + 1;
        r1 = r26;
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d0, code lost:
    
        if (r15 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d2, code lost:
    
        r1 = r25.getAnimations();
        r2 = r1.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d8, code lost:
    
        if (r6 >= r2) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01da, code lost:
    
        r7 = r1[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dc, code lost:
    
        if (r7 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
    
        if (r7.isDisappearanceAnimationInProgress() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
    
        r42.disappearingItems.remove(r7);
        r12 = r42.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01eb, code lost:
    
        if (r12 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ed, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r12);
        r12 = yz.g2.f100423a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f2, code lost:
    
        r7.animateAppearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f5, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        r4 = r4.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasured(int r43, int r44, int r45, @m80.k java.util.List<T> r46, @m80.k final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r47, @m80.k androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider<T> r48, boolean r49, boolean r50, int r51, boolean r52, int r53, int r54, @m80.k c40.r0 r55, @m80.k androidx.compose.ui.graphics.GraphicsContext r56) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, c40.r0, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    public final void reset() {
        releaseAnimations();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }
}
