package androidx.compose.ui.layout;

import a00.h0;
import a00.r0;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.SubcompositionKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1037:1\n898#1:1066\n898#1:1078\n898#1:1188\n898#1:1193\n1101#2:1038\n1083#2,2:1039\n56#3,5:1041\n65#3,5:1047\n102#3,5:1053\n102#3,5:1120\n102#3,5:1125\n102#3,5:1130\n102#3,5:1202\n683#4:1046\n683#4:1058\n842#4:1136\n844#4,4:1150\n848#4:1160\n683#4:1161\n1#5:1052\n1#5:1059\n1#5:1135\n1#5:1162\n1#5:1187\n602#6,6:1060\n609#6:1071\n602#6,6:1072\n609#6:1083\n602#6,8:1084\n1149#7,4:1067\n1149#7,4:1079\n1149#7,2:1092\n1151#7,2:1118\n1149#7,4:1189\n1149#7,4:1194\n1149#7,4:1198\n372#8,3:1094\n329#8,6:1097\n339#8,3:1104\n342#8,9:1108\n375#8:1117\n329#8,6:1137\n339#8,3:1144\n342#8,2:1148\n345#8,6:1154\n372#8,3:1163\n329#8,6:1166\n339#8,3:1173\n342#8,9:1177\n375#8:1186\n1399#9:1103\n1270#9:1107\n1399#9:1143\n1270#9:1147\n1399#9:1172\n1270#9:1176\n34#10,6:1207\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n511#1:1066\n585#1:1078\n891#1:1188\n894#1:1193\n427#1:1038\n427#1:1039,2\n456#1:1041,5\n469#1:1047,5\n480#1:1053,5\n653#1:1120,5\n659#1:1125,5\n663#1:1130,5\n985#1:1202,5\n466#1:1046\n500#1:1058\n767#1:1136\n767#1:1150,4\n767#1:1160\n811#1:1161\n466#1:1052\n500#1:1059\n811#1:1162\n510#1:1060,6\n510#1:1071\n572#1:1072,6\n572#1:1083\n613#1:1084,8\n511#1:1067,4\n585#1:1079,4\n637#1:1092,2\n637#1:1118,2\n891#1:1189,4\n894#1:1194,4\n898#1:1198,4\n638#1:1094,3\n638#1:1097,6\n638#1:1104,3\n638#1:1108,9\n638#1:1117\n767#1:1137,6\n767#1:1144,3\n767#1:1148,2\n767#1:1154,6\n879#1:1163,3\n879#1:1166,6\n879#1:1173,3\n879#1:1177,9\n879#1:1186\n638#1:1103\n638#1:1107\n767#1:1143\n767#1:1147\n879#1:1172\n879#1:1176\n1007#1:1207,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;

    @l
    private CompositionContext compositionContext;
    private int currentApproachIndex;
    private int currentIndex;
    private int precomposedCount;
    private int reusableCount;

    @k
    private final LayoutNode root;

    @k
    private SubcomposeSlotReusePolicy slotReusePolicy;

    @k
    private final MutableScatterMap<LayoutNode, NodeState> nodeToNodeState = ScatterMapKt.mutableScatterMapOf();

    @k
    private final MutableScatterMap<Object, LayoutNode> slotIdToNode = ScatterMapKt.mutableScatterMapOf();

    @k
    private final Scope scope = new Scope();

    @k
    private final ApproachMeasureScopeImpl approachMeasureScope = new ApproachMeasureScopeImpl();

    @k
    private final MutableScatterMap<Object, LayoutNode> precomposeMap = ScatterMapKt.mutableScatterMapOf();

    @k
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);

    @k
    private final MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> approachPrecomposeSlotHandleMap = ScatterMapKt.mutableScatterMapOf();

    @k
    private final MutableVector<Object> approachComposedSlotIds = new MutableVector<>(new Object[16], 0);

    @k
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public ApproachMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @k
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @k
        public MeasureResult layout(int i11, int i12, @k Map<AlignmentLine, Integer> map, @k x00.l<? super Placeable.PlacementScope, g2> lVar) {
            return this.$$delegate_0.layout(i11, i12, map, lVar);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo370roundToPxR2X_6o(long j11) {
            return this.$$delegate_0.mo370roundToPxR2X_6o(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo371roundToPx0680j_4(float f11) {
            return this.$$delegate_0.mo371roundToPx0680j_4(f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @k
        public List<Measurable> subcompose(@l Object obj, @k p<? super Composer, ? super Integer, g2> pVar) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(obj);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.approachSubcompose(obj, pVar) : layoutNode.getChildMeasurables$ui_release();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo372toDpGaN1DYA(long j11) {
            return this.$$delegate_0.mo372toDpGaN1DYA(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo373toDpu2uoSUM(float f11) {
            return this.$$delegate_0.mo373toDpu2uoSUM(f11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo375toDpSizekrfVVM(long j11) {
            return this.$$delegate_0.mo375toDpSizekrfVVM(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo376toPxR2X_6o(long j11) {
            return this.$$delegate_0.mo376toPxR2X_6o(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo377toPx0680j_4(float f11) {
            return this.$$delegate_0.mo377toPx0680j_4(f11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @k
        public Rect toRect(@k DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo378toSizeXkaWNTQ(long j11) {
            return this.$$delegate_0.mo378toSizeXkaWNTQ(j11);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo379toSp0xMU5do(float f11) {
            return this.$$delegate_0.mo379toSp0xMU5do(f11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo380toSpkPz2Gy4(float f11) {
            return this.$$delegate_0.mo380toSpkPz2Gy4(f11);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @k
        public MeasureResult layout(int i11, int i12, @k Map<AlignmentLine, Integer> map, @l x00.l<? super RulerScope, g2> lVar, @k x00.l<? super Placeable.PlacementScope, g2> lVar2) {
            return this.$$delegate_0.layout(i11, i12, map, lVar, lVar2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo374toDpu2uoSUM(int i11) {
            return this.$$delegate_0.mo374toDpu2uoSUM(i11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo381toSpkPz2Gy4(int i11) {
            return this.$$delegate_0.mo381toSpkPz2Gy4(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1037:1\n361#2:1038\n362#2,2:1042\n365#2:1045\n56#3,3:1039\n60#3:1044\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n*L\n935#1:1038\n935#1:1042,2\n935#1:1045\n935#1:1039,3\n935#1:1044\n*E\n"})
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;

        @k
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @k
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @k
        public MeasureResult layout(final int i11, final int i12, @k final Map<AlignmentLine, Integer> map, @l final x00.l<? super RulerScope, g2> lVar, @k final x00.l<? super Placeable.PlacementScope, g2> lVar2) {
            if (!((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0)) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return i12;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public x00.l<RulerScope, g2> getRulers() {
                    return lVar;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return i11;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadDelegate lookaheadDelegate;
                    if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) == null) {
                        lVar2.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                    } else {
                        lVar2.invoke(lookaheadDelegate.getPlacementScope());
                    }
                }
            };
        }

        public void setDensity(float f11) {
            this.density = f11;
        }

        public void setFontScale(float f11) {
            this.fontScale = f11;
        }

        public void setLayoutDirection(@k LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @k
        public List<Measurable> subcompose(@l Object obj, @k p<? super Composer, ? super Integer, g2> pVar) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, pVar);
        }
    }

    public LayoutNodeSubcompositionsState(@k LayoutNode layoutNode, @k SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> approachSubcompose(Object obj, p<? super Composer, ? super Integer, g2> pVar) {
        if (!(this.approachComposedSlotIds.getSize() >= this.currentApproachIndex)) {
            InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int size = this.approachComposedSlotIds.getSize();
        int i11 = this.currentApproachIndex;
        if (size == i11) {
            this.approachComposedSlotIds.add(obj);
        } else {
            this.approachComposedSlotIds.set(i11, obj);
        }
        this.currentApproachIndex++;
        if (!this.precomposeMap.contains(obj)) {
            this.approachPrecomposeSlotHandleMap.set(obj, precompose(obj, pVar));
            if (this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                this.root.requestLookaheadRelayout$ui_release(true);
            } else {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, false, 6, null);
            }
        }
        LayoutNode layoutNode = this.precomposeMap.get(obj);
        if (layoutNode != null) {
            List<MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
            int size2 = childDelegates$ui_release.size();
            for (int i12 = 0; i12 < size2; i12++) {
                childDelegates$ui_release.get(i12).markDetachedFromParentLookaheadPass$ui_release();
            }
            if (childDelegates$ui_release != null) {
                return childDelegates$ui_release;
            }
        }
        return h0.J();
    }

    private final MeasureResult createMeasureResult(final MeasureResult measureResult, final a<g2> aVar) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasureResult$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public x00.l<RulerScope, g2> getRulers() {
                return measureResult.getRulers();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                aVar.invoke();
            }
        };
    }

    private final LayoutNode createNodeAt(int i11) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(i11, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    private final void disposeCurrentNodes() {
        ReusableComposition composition;
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        MutableScatterMap<LayoutNode, NodeState> mutableScatterMap = this.nodeToNodeState;
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
                        if ((255 & j11) < 128 && (composition = ((NodeState) objArr[(i11 << 3) + i13]).getComposition()) != null) {
                            composition.dispose();
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
        this.root.removeAll$ui_release();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInApproach() {
        MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> mutableScatterMap = this.approachPrecomposeSlotHandleMap;
        long[] jArr = mutableScatterMap.metadata;
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
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = mutableScatterMap.keys[i14];
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i14];
                        int indexOf = this.approachComposedSlotIds.indexOf(obj);
                        if (indexOf < 0 || indexOf >= this.currentApproachIndex) {
                            precomposedSlotHandle.dispose();
                            mutableScatterMap.removeValueAt(i14);
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

    private final Object getSlotIdAtIndex(List<LayoutNode> list, int i11) {
        NodeState nodeState = this.nodeToNodeState.get(list.get(i11));
        g0.m(nodeState);
        return nodeState.getSlotId();
    }

    private final void ignoreRemeasureRequests(a<g2> aVar) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        aVar.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    private final void markActiveNodesAsReused(boolean z11) {
        SubcomposeLayoutKt$ReusedSlotId$1 subcomposeLayoutKt$ReusedSlotId$1;
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = foldedChildren$ui_release.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui_release.get(i11);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        if (z11) {
                            ReusableComposition composition = nodeState.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            nodeState.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null));
                        } else {
                            nodeState.setActive(false);
                        }
                        subcomposeLayoutKt$ReusedSlotId$1 = SubcomposeLayoutKt.ReusedSlotId;
                        nodeState.setSlotId(subcomposeLayoutKt$ReusedSlotId$1);
                    }
                } catch (Throwable th2) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th2;
                }
            }
            g2 g2Var = g2.f100423a;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.slotIdToNode.clear();
        }
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int i11, int i12, int i13) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(i11, i12, i13);
        layoutNode.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 1;
        }
        layoutNodeSubcompositionsState.move(i11, i12, i13);
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final ReusableComposition subcomposeInto(ReusableComposition reusableComposition, LayoutNode layoutNode, boolean z11, CompositionContext compositionContext, p<? super Composer, ? super Integer, g2> pVar) {
        if (reusableComposition == null || reusableComposition.isDisposed()) {
            reusableComposition = SubcompositionKt.createSubcomposition(layoutNode, compositionContext);
        }
        if (z11) {
            reusableComposition.setContentWithReuse(pVar);
            return reusableComposition;
        }
        reusableComposition.setContent(pVar);
        return reusableComposition;
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i11;
        SubcomposeLayoutKt$ReusedSlotId$1 subcomposeLayoutKt$ReusedSlotId$1;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = foldedChildren$ui_release.size() - this.precomposedCount;
        int i12 = size - this.reusableCount;
        int i13 = size - 1;
        int i14 = i13;
        while (true) {
            if (i14 < i12) {
                i11 = -1;
                break;
            }
            if (g0.g(getSlotIdAtIndex(foldedChildren$ui_release, i14), obj)) {
                i11 = i14;
                break;
            }
            i14--;
        }
        if (i11 == -1) {
            while (i13 >= i12) {
                NodeState nodeState = this.nodeToNodeState.get(foldedChildren$ui_release.get(i13));
                g0.m(nodeState);
                NodeState nodeState2 = nodeState;
                Object slotId = nodeState2.getSlotId();
                subcomposeLayoutKt$ReusedSlotId$1 = SubcomposeLayoutKt.ReusedSlotId;
                if (slotId == subcomposeLayoutKt$ReusedSlotId$1 || this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(obj);
                    i14 = i13;
                    i11 = i14;
                    break;
                }
                i13--;
            }
            i14 = i13;
        }
        if (i11 == -1) {
            return null;
        }
        if (i14 != i12) {
            move(i14, i12, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = foldedChildren$ui_release.get(i12);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        g0.m(nodeState3);
        NodeState nodeState4 = nodeState3;
        nodeState4.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null));
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    @k
    public final MeasurePolicy createMeasurePolicy(@k final p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                LayoutNodeSubcompositionsState.ApproachMeasureScopeImpl approachMeasureScopeImpl;
                final int i11;
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui_release() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult invoke = pVar.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m5055boximpl(j11));
                    final int i12 = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return invoke.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return invoke.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public x00.l<RulerScope, g2> getRulers() {
                            return invoke.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return invoke.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentIndex = i12;
                            invoke.placeChildren();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentApproachIndex = 0;
                p<SubcomposeMeasureScope, Constraints, MeasureResult> pVar2 = pVar;
                approachMeasureScopeImpl = LayoutNodeSubcompositionsState.this.approachMeasureScope;
                final MeasureResult invoke2 = pVar2.invoke(approachMeasureScopeImpl, Constraints.m5055boximpl(j11));
                i11 = LayoutNodeSubcompositionsState.this.currentApproachIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return invoke2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return invoke2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public x00.l<RulerScope, g2> getRulers() {
                        return invoke2.getRulers();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return invoke2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentApproachIndex = i11;
                        invoke2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInApproach();
                    }
                };
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int i11) {
        boolean z11 = false;
        this.reusableCount = 0;
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = (foldedChildren$ui_release.size() - this.precomposedCount) - 1;
        if (i11 <= size) {
            this.reusableSlotIdsSet.clear();
            if (i11 <= size) {
                int i12 = i11;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(foldedChildren$ui_release, i12));
                    if (i12 == size) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            boolean z12 = false;
            while (size >= i11) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui_release.get(size);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    g0.m(nodeState);
                    NodeState nodeState2 = nodeState;
                    Object slotId = nodeState2.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState2.getActive()) {
                            resetLayoutState(layoutNode);
                            nodeState2.setActive(false);
                            z12 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        ReusableComposition composition = nodeState2.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui_release(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                } catch (Throwable th2) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th2;
                }
            }
            g2 g2Var = g2.f100423a;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            z11 = z12;
        }
        if (z11) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui_release().size()) {
            MutableScatterMap<LayoutNode, NodeState> mutableScatterMap = this.nodeToNodeState;
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
                                ((NodeState) objArr[(i11 << 3) + i13]).setForceRecompose(true);
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
            if (this.root.getMeasurePending$ui_release()) {
                return;
            }
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        }
    }

    @l
    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    @k
    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui_release().size();
        if (!(this.nodeToNodeState.getSize() == size)) {
            InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.getSize() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
        }
        if (this.precomposeMap.getSize() == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.getSize());
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    @k
    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(@l final Object obj, @k p<? super Composer, ? super Integer, g2> pVar) {
        if (!this.root.isAttached()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            this.approachPrecomposeSlotHandleMap.remove(obj);
            MutableScatterMap<Object, LayoutNode> mutableScatterMap = this.precomposeMap;
            LayoutNode layoutNode = mutableScatterMap.get(obj);
            if (layoutNode == null) {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNode), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNode = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                mutableScatterMap.set(obj, layoutNode);
            }
            subcompose(layoutNode, obj, pVar);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                MutableScatterMap mutableScatterMap2;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                mutableScatterMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) mutableScatterMap2.remove(obj);
                if (layoutNode2 != null) {
                    i11 = LayoutNodeSubcompositionsState.this.precomposedCount;
                    if (!(i11 > 0)) {
                        InlineClassHelperKt.throwIllegalStateException("No pre-composed items to dispose");
                    }
                    int indexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
                    int size = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                    i12 = LayoutNodeSubcompositionsState.this.precomposedCount;
                    if (!(indexOf >= size - i12)) {
                        InlineClassHelperKt.throwIllegalStateException("Item is not in pre-composed item range");
                    }
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    i13 = layoutNodeSubcompositionsState.reusableCount;
                    layoutNodeSubcompositionsState.reusableCount = i13 + 1;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                    i14 = layoutNodeSubcompositionsState2.precomposedCount;
                    layoutNodeSubcompositionsState2.precomposedCount = i14 - 1;
                    int size2 = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                    i15 = LayoutNodeSubcompositionsState.this.precomposedCount;
                    int i17 = size2 - i15;
                    i16 = LayoutNodeSubcompositionsState.this.reusableCount;
                    int i18 = i17 - i16;
                    LayoutNodeSubcompositionsState.this.move(indexOf, i18, 1);
                    LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(i18);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                MutableScatterMap mutableScatterMap2;
                List<LayoutNode> children$ui_release;
                mutableScatterMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) mutableScatterMap2.get(obj);
                if (layoutNode2 == null || (children$ui_release = layoutNode2.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo3883premeasure0kLqBqw(int i11, long j11) {
                MutableScatterMap mutableScatterMap2;
                mutableScatterMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) mutableScatterMap2.get(obj);
                if (layoutNode2 == null || !layoutNode2.isAttached()) {
                    return;
                }
                int size = layoutNode2.getChildren$ui_release().size();
                if (i11 < 0 || i11 >= size) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i11 + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode2.isPlaced()) {
                    InlineClassHelperKt.throwIllegalArgumentException("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode3 = LayoutNodeSubcompositionsState.this.root;
                layoutNode3.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode2).mo4179measureAndLayout0kLqBqw(layoutNode2.getChildren$ui_release().get(i11), j11);
                layoutNode3.ignoreRemeasureRequests = false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void traverseDescendants(Object obj2, x00.l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
                MutableScatterMap mutableScatterMap2;
                NodeChain nodes$ui_release;
                Modifier.Node head$ui_release;
                mutableScatterMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) mutableScatterMap2.get(obj);
                if (layoutNode2 == null || (nodes$ui_release = layoutNode2.getNodes$ui_release()) == null || (head$ui_release = nodes$ui_release.getHead$ui_release()) == null) {
                    return;
                }
                TraversableNodeKt.traverseDescendants(head$ui_release, obj2, lVar);
            }
        };
    }

    public final void setCompositionContext(@l CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(@k SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        }
    }

    @k
    public final List<Measurable> subcompose(@l Object obj, @k p<? super Composer, ? super Integer, g2> pVar) {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState;
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (!(layoutState$ui_release == layoutState || layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut)) {
            InlineClassHelperKt.throwIllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        MutableScatterMap<Object, LayoutNode> mutableScatterMap = this.slotIdToNode;
        LayoutNode layoutNode = mutableScatterMap.get(obj);
        if (layoutNode == null) {
            layoutNode = this.precomposeMap.remove(obj);
            if (layoutNode != null) {
                if (!(this.precomposedCount > 0)) {
                    InlineClassHelperKt.throwIllegalStateException("Check failed.");
                }
                this.precomposedCount--;
            } else {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode == null) {
                    layoutNode = createNodeAt(this.currentIndex);
                }
            }
            mutableScatterMap.set(obj, layoutNode);
        }
        LayoutNode layoutNode2 = layoutNode;
        if (r0.b3(this.root.getFoldedChildren$ui_release(), this.currentIndex) != layoutNode2) {
            int indexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
            if (!(indexOf >= this.currentIndex)) {
                InlineClassHelperKt.throwIllegalArgumentException("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i11 = this.currentIndex;
            if (i11 != indexOf) {
                layoutNodeSubcompositionsState = this;
                move$default(layoutNodeSubcompositionsState, indexOf, i11, 0, 4, null);
                layoutNodeSubcompositionsState.currentIndex++;
                subcompose(layoutNode2, obj, pVar);
                return (layoutState$ui_release != layoutState || layoutState$ui_release == LayoutNode.LayoutState.LayingOut) ? layoutNode2.getChildMeasurables$ui_release() : layoutNode2.getChildLookaheadMeasurables$ui_release();
            }
        }
        layoutNodeSubcompositionsState = this;
        layoutNodeSubcompositionsState.currentIndex++;
        subcompose(layoutNode2, obj, pVar);
        if (layoutState$ui_release != layoutState) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NodeState {

        @k
        private MutableState<Boolean> activeState;

        @l
        private ReusableComposition composition;

        @k
        private p<? super Composer, ? super Integer, g2> content;
        private boolean forceRecompose;
        private boolean forceReuse;

        @l
        private Object slotId;

        public NodeState(@l Object obj, @k p<? super Composer, ? super Integer, g2> pVar, @l ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = pVar;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        @k
        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        @l
        public final ReusableComposition getComposition() {
            return this.composition;
        }

        @k
        public final p<Composer, Integer, g2> getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        @l
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActive(boolean z11) {
            this.activeState.setValue(Boolean.valueOf(z11));
        }

        public final void setActiveState(@k MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposition(@l ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(@k p<? super Composer, ? super Integer, g2> pVar) {
            this.content = pVar;
        }

        public final void setForceRecompose(boolean z11) {
            this.forceRecompose = z11;
        }

        public final void setForceReuse(boolean z11) {
            this.forceReuse = z11;
        }

        public final void setSlotId(@l Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, p pVar, ReusableComposition reusableComposition, int i11, v vVar) {
            this(obj, pVar, (i11 & 4) != 0 ? null : reusableComposition);
        }
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, p<? super Composer, ? super Integer, g2> pVar) {
        MutableScatterMap<LayoutNode, NodeState> mutableScatterMap = this.nodeToNodeState;
        NodeState nodeState = mutableScatterMap.get(layoutNode);
        if (nodeState == null) {
            NodeState nodeState2 = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m3849getLambda1$ui_release(), null, 4, null);
            mutableScatterMap.set(layoutNode, nodeState2);
            nodeState = nodeState2;
        }
        NodeState nodeState3 = nodeState;
        ReusableComposition composition = nodeState3.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState3.getContent() != pVar || hasInvalidations || nodeState3.getForceRecompose()) {
            nodeState3.setContent(pVar);
            subcompose(layoutNode, nodeState3);
            nodeState3.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode layoutNode, final NodeState nodeState) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            final p<Composer, Integer, g2> content = nodeState.getContent();
            ReusableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext != null) {
                nodeState.setComposition(subcomposeInto(composition, layoutNode, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return g2.f100423a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i11) {
                        if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1750409193, i11, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:522)");
                        }
                        boolean active = LayoutNodeSubcompositionsState.NodeState.this.getActive();
                        p<Composer, Integer, g2> pVar = content;
                        composer.startReusableGroup(207, Boolean.valueOf(active));
                        boolean changed = composer.changed(active);
                        if (active) {
                            pVar.invoke(composer, 0);
                        } else {
                            composer.deactivateToEndGroup(changed);
                        }
                        composer.endReusableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                })));
                nodeState.setForceReuse(false);
                layoutNode2.ignoreRemeasureRequests = false;
                g2 g2Var = g2.f100423a;
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }
}
