package androidx.compose.ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 9 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,521:1\n372#2,3:522\n329#2,6:525\n339#2,3:532\n342#2,2:536\n345#2,6:567\n375#2:573\n329#2,6:575\n339#2,3:582\n342#2,2:586\n345#2,6:592\n372#2,3:610\n329#2,6:613\n339#2,3:620\n342#2,9:624\n375#2:633\n372#2,3:634\n329#2,6:637\n339#2,3:644\n342#2,9:648\n375#2:657\n1399#3:531\n1270#3:535\n1399#3:581\n1270#3:585\n1399#3:619\n1270#3:623\n1399#3:643\n1270#3:647\n1399#3:669\n1270#3:673\n1399#3:693\n1270#3:697\n1399#3:718\n1270#3:722\n809#4,2:538\n812#4,4:556\n816#4:566\n200#5,16:540\n217#5,6:560\n231#5,3:708\n200#5,7:711\n211#5,3:719\n214#5,9:723\n234#5:732\n842#6:574\n844#6,4:588\n848#6:598\n683#6:599\n1#7:600\n1#7:658\n438#8:601\n395#8,4:659\n367#8,6:663\n377#8,3:670\n380#8,9:674\n399#8:683\n403#8,3:684\n367#8,6:687\n377#8,3:694\n380#8,2:698\n438#8:700\n383#8,6:701\n406#8:707\n361#9:602\n362#9,2:606\n365#9:609\n56#10,3:603\n60#10:608\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n185#1:522,3\n185#1:525,6\n185#1:532,3\n185#1:536,2\n185#1:567,6\n185#1:573\n186#1:575,6\n186#1:582,3\n186#1:586,2\n186#1:592,6\n254#1:610,3\n254#1:613,6\n254#1:620,3\n254#1:624,9\n254#1:633\n269#1:634,3\n269#1:637,6\n269#1:644,3\n269#1:648,9\n269#1:657\n185#1:531\n185#1:535\n186#1:581\n186#1:585\n254#1:619\n254#1:623\n269#1:643\n269#1:647\n288#1:669\n288#1:673\n301#1:693\n301#1:697\n311#1:718\n311#1:722\n185#1:538,2\n185#1:556,4\n185#1:566\n185#1:540,16\n185#1:560,6\n311#1:708,3\n311#1:711,7\n311#1:719,3\n311#1:723,9\n311#1:732\n186#1:574\n186#1:588,4\n186#1:598\n192#1:599\n192#1:600\n199#1:601\n288#1:659,4\n288#1:663,6\n288#1:670,3\n288#1:674,9\n288#1:683\n301#1:684,3\n301#1:687,6\n301#1:694,3\n301#1:698,2\n302#1:700\n301#1:701,6\n301#1:707\n230#1:602\n230#1:606,2\n230#1:609\n230#1:603,3\n230#1:608\n*E\n"})
/* loaded from: classes2.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final l<PlaceableResult, g2> onCommitAffectingRuler = new l<PlaceableResult, g2>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(PlaceableResult placeableResult) {
            invoke2(placeableResult);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PlaceableResult placeableResult) {
            if (placeableResult.isValidOwnerScope()) {
                placeableResult.getPlaceable().captureRulers(placeableResult);
            }
        }
    };

    @m80.l
    private RulerScope _rulerScope;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;

    @k
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);

    @m80.l
    private MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> rulerReaders;

    @m80.l
    private MutableObjectFloatMap<Ruler> rulerValues;

    @m80.l
    private MutableObjectFloatMap<Ruler> rulerValuesCache;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addRulerReader(androidx.compose.ui.node.LayoutNode r32, androidx.compose.ui.layout.Ruler r33) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.addRulerReader(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.Ruler):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void captureRulers(final androidx.compose.ui.node.PlaceableResult r28) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.captureRulers(androidx.compose.ui.node.PlaceableResult):void");
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap<Ruler> mutableObjectFloatMap = lookaheadCapablePlaceable.rulerValues;
            if (mutableObjectFloatMap != null && mutableObjectFloatMap.containsKey(ruler)) {
                return lookaheadCapablePlaceable;
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    private final void invalidateChildrenOfDefiningRuler(Ruler ruler) {
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = findAncestorRulerDefiner(ruler).rulerReaders;
        MutableScatterSet<WeakReference<LayoutNode>> remove = mutableScatterMap != null ? mutableScatterMap.remove(ruler) : null;
        if (remove != null) {
            notifyRulerValueChange(remove);
        }
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            return isLayoutNodeAncestor(parent$ui_release, layoutNode2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyRulerValueChange(MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet) {
        LayoutNode layoutNode;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i11 << 3) + i13]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui_release(false);
                        } else {
                            layoutNode.requestRelayout$ui_release(false);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public abstract int calculateAlignmentLine(@k AlignmentLine alignmentLine);

    public final void captureRulers$ui_release(@m80.l MeasureResult measureResult) {
        if (measureResult != null) {
            captureRulers(new PlaceableResult(measureResult, this));
            return;
        }
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = this.rulerReaders;
        if (mutableScatterMap != null) {
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
                                notifyRulerValueChange((MutableScatterSet) objArr[(i11 << 3) + i13]);
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
        }
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap2 = this.rulerReaders;
        if (mutableScatterMap2 != null) {
            mutableScatterMap2.clear();
        }
        MutableObjectFloatMap<Ruler> mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap != null) {
            mutableObjectFloatMap.clear();
        }
    }

    public final float findRulerValue(@k Ruler ruler, float f11) {
        if (this.isPlacingForAlignment) {
            return f11;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap<Ruler> mutableObjectFloatMap = lookaheadCapablePlaceable.rulerValues;
            float orDefault = mutableObjectFloatMap != null ? mutableObjectFloatMap.getOrDefault(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(orDefault)) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return ruler.calculateCoordinate$ui_release(orDefault, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return f11;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(@k AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        if (getHasMeasureResult() && (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return calculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m5243getXimpl(m3915getApparentToRealOffsetnOccac()) : IntOffset.m5244getYimpl(m3915getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    @k
    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    @m80.l
    public abstract LookaheadCapablePlaceable getChild();

    @k
    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @k
    public abstract LayoutNode getLayoutNode();

    @k
    public abstract MeasureResult getMeasureResult$ui_release();

    @m80.l
    public abstract LookaheadCapablePlaceable getParent();

    @k
    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo4052getPositionnOccac();

    @k
    public final RulerScope getRulerScope() {
        RulerScope rulerScope = this._rulerScope;
        return rulerScope == null ? new RulerScope() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$rulerScope$1
            @Override // androidx.compose.ui.layout.RulerScope
            public LayoutCoordinates getCoordinates() {
                LookaheadCapablePlaceable.this.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
                return LookaheadCapablePlaceable.this.getCoordinates();
            }

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return LookaheadCapablePlaceable.this.getDensity();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return LookaheadCapablePlaceable.this.getFontScale();
            }

            @Override // androidx.compose.ui.layout.RulerScope
            public void provides(Ruler ruler, float f11) {
                LookaheadCapablePlaceable.this.provideRulerValue(ruler, f11);
            }

            @Override // androidx.compose.ui.layout.RulerScope
            public void providesRelative(VerticalRuler verticalRuler, float f11) {
                LookaheadCapablePlaceable.this.provideRelativeRulerValue(verticalRuler, f11);
            }
        } : rulerScope;
    }

    public final void invalidateAlignmentLinesFromPositionChange(@k NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui_release = nodeCoordinator.getWrapped$ui_release();
        if (!g0.g(wrapped$ui_release != null ? wrapped$ui_release.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @k
    public MeasureResult layout(final int i11, final int i12, @k final Map<AlignmentLine, Integer> map, @m80.l final l<? super RulerScope, g2> lVar, @k final l<? super Placeable.PlacementScope, g2> lVar2) {
        if (!((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return i12;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public l<RulerScope, g2> getRulers() {
                return lVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return i11;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                lVar2.invoke(this.getPlacementScope());
            }
        };
    }

    public final void provideRelativeRulerValue(@k Ruler ruler, float f11) {
        MutableObjectFloatMap<Ruler> mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap == null) {
            mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
            this.rulerValues = mutableObjectFloatMap;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            f11 = getWidth() - f11;
        }
        mutableObjectFloatMap.set(ruler, f11);
    }

    public final void provideRulerValue(@k Ruler ruler, float f11) {
        MutableObjectFloatMap<Ruler> mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap == null) {
            mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
            this.rulerValues = mutableObjectFloatMap;
        }
        mutableObjectFloatMap.set(ruler, f11);
    }

    public abstract void replace$ui_release();

    public void setPlacedUnderMotionFrameOfReference(boolean z11) {
        this.isPlacedUnderMotionFrameOfReference = z11;
    }

    public final void setPlacingForAlignment$ui_release(boolean z11) {
        this.isPlacingForAlignment = z11;
    }

    public final void setShallowPlacing$ui_release(boolean z11) {
        this.isShallowPlacing = z11;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z11) {
        LookaheadCapablePlaceable parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (g0.g(layoutNode, getLayoutNode())) {
            setPlacedUnderMotionFrameOfReference(z11);
            return;
        }
        if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        setPlacedUnderMotionFrameOfReference(z11);
    }
}
