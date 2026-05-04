package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,643:1\n588#1,5:653\n595#1:755\n588#1,5:756\n595#1:814\n423#2,9:644\n423#2,9:702\n423#2,9:805\n423#2,9:878\n95#3:658\n95#3:711\n95#3:761\n95#3:815\n95#3:887\n437#4,6:659\n447#4,2:666\n449#4,8:671\n457#4,9:682\n466#4,8:694\n437#4,6:712\n447#4,2:719\n449#4,8:724\n457#4,9:735\n466#4,8:747\n437#4,6:762\n447#4,2:769\n449#4,8:774\n457#4,9:785\n466#4,8:797\n437#4,6:816\n447#4,2:823\n449#4,8:828\n457#4,9:839\n466#4,8:851\n437#4,6:888\n447#4,2:895\n449#4,8:900\n457#4,9:911\n466#4,8:923\n246#5:665\n246#5:718\n246#5:768\n246#5:822\n246#5:894\n240#6,3:668\n243#6,3:691\n240#6,3:721\n243#6,3:744\n240#6,3:771\n243#6,3:794\n240#6,3:825\n243#6,3:848\n240#6,3:897\n243#6,3:920\n1101#7:679\n1083#7,2:680\n1101#7:732\n1083#7,2:733\n1101#7:782\n1083#7,2:783\n1101#7:836\n1083#7,2:837\n1101#7:908\n1083#7,2:909\n111#8,2:859\n111#8,2:865\n34#9,4:861\n39#9:867\n117#9,2:869\n34#9,6:871\n119#9:877\n34#9,4:931\n39#9:936\n40#10:868\n67#10:935\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n365#1:653,5\n365#1:755\n404#1:756,5\n404#1:814\n350#1:644,9\n376#1:702,9\n414#1:805,9\n605#1:878,9\n370#1:658\n390#1:711\n408#1:761\n442#1:815\n606#1:887\n370#1:659,6\n370#1:666,2\n370#1:671,8\n370#1:682,9\n370#1:694,8\n390#1:712,6\n390#1:719,2\n390#1:724,8\n390#1:735,9\n390#1:747,8\n408#1:762,6\n408#1:769,2\n408#1:774,8\n408#1:785,9\n408#1:797,8\n442#1:816,6\n442#1:823,2\n442#1:828,8\n442#1:839,9\n442#1:851,8\n606#1:888,6\n606#1:895,2\n606#1:900,8\n606#1:911,9\n606#1:923,8\n370#1:665\n390#1:718\n408#1:768\n442#1:822\n606#1:894\n370#1:668,3\n370#1:691,3\n390#1:721,3\n390#1:744,3\n408#1:771,3\n408#1:794,3\n442#1:825,3\n442#1:848,3\n606#1:897,3\n606#1:920,3\n370#1:679\n370#1:680,2\n390#1:732\n390#1:733,2\n408#1:782\n408#1:783,2\n442#1:836\n442#1:837,2\n606#1:908\n606#1:909,2\n459#1:859,2\n469#1:865,2\n464#1:861,4\n464#1:867\n518#1:869,2\n518#1:871,6\n518#1:877\n620#1:931,4\n620#1:936\n504#1:868\n631#1:935\n*E\n"})
/* loaded from: classes.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;

    @l
    private LayoutCoordinates coordinates;

    @k
    private final Modifier.Node modifierNode;

    @l
    private PointerEvent pointerEvent;
    private boolean wasIn;

    @k
    private final PointerIdArray pointerIds = new PointerIdArray();

    @k
    private final LongSparseArray<PointerInputChange> relevantChanges = new LongSparseArray<>(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public Node(@k Modifier.Node node) {
        this.modifierNode = node;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(x00.a<g2> aVar) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!Offset.m2265equalsimpl0(pointerEvent.getChanges().get(i11).m3732getPositionF1C5BW0(), pointerEvent2.getChanges().get(i11).m3732getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(@k LongSparseArray<PointerInputChange> longSparseArray, @k LayoutCoordinates layoutCoordinates, @k InternalPointerEvent internalPointerEvent, boolean z11) {
        PointerInputChange pointerInputChange;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        int i12;
        int i13;
        boolean buildCache = super.buildCache(longSparseArray, layoutCoordinates, internalPointerEvent, z11);
        boolean z15 = true;
        if (!this.modifierNode.isAttached()) {
            return true;
        }
        DelegatingNode delegatingNode = this.modifierNode;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) delegatingNode);
            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                int i14 = 0;
                delegatingNode = delegatingNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        i14++;
                        if (i14 == 1) {
                            delegatingNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                mutableVector.add(delegatingNode);
                                delegatingNode = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    delegatingNode = delegatingNode;
                }
                if (i14 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
        if (this.coordinates == null) {
            return true;
        }
        int size = longSparseArray.size();
        int i15 = 0;
        while (i15 < size) {
            long keyAt = longSparseArray.keyAt(i15);
            PointerInputChange valueAt = longSparseArray.valueAt(i15);
            if (this.pointerIds.contains(keyAt)) {
                boolean z16 = z15;
                int i16 = i15;
                long m3733getPreviousPositionF1C5BW0 = valueAt.m3733getPreviousPositionF1C5BW0();
                z14 = z16;
                long m3732getPositionF1C5BW0 = valueAt.m3732getPositionF1C5BW0();
                if ((((m3733getPreviousPositionF1C5BW0 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0 && (((m3732getPositionF1C5BW0 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                    ArrayList arrayList = new ArrayList(valueAt.getHistorical().size());
                    List<HistoricalChange> historical = valueAt.getHistorical();
                    z13 = buildCache;
                    int size2 = historical.size();
                    i11 = size;
                    int i17 = 0;
                    while (i17 < size2) {
                        HistoricalChange historicalChange = historical.get(i17);
                        int i18 = size2;
                        int i19 = i17;
                        long m3656getPositionF1C5BW0 = historicalChange.m3656getPositionF1C5BW0();
                        if ((((m3656getPositionF1C5BW0 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                            long uptimeMillis = historicalChange.getUptimeMillis();
                            i13 = i16;
                            LayoutCoordinates layoutCoordinates2 = this.coordinates;
                            g0.m(layoutCoordinates2);
                            arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates2.mo3866localPositionOfR5De75A(layoutCoordinates, m3656getPositionF1C5BW0), historicalChange.m3655getOriginalEventPositionF1C5BW0$ui_release(), null));
                        } else {
                            i13 = i16;
                        }
                        i17 = i19 + 1;
                        size2 = i18;
                        i16 = i13;
                    }
                    i12 = i16;
                    LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                    LayoutCoordinates layoutCoordinates3 = this.coordinates;
                    g0.m(layoutCoordinates3);
                    long mo3866localPositionOfR5De75A = layoutCoordinates3.mo3866localPositionOfR5De75A(layoutCoordinates, m3733getPreviousPositionF1C5BW0);
                    LayoutCoordinates layoutCoordinates4 = this.coordinates;
                    g0.m(layoutCoordinates4);
                    longSparseArray2.put(keyAt, PointerInputChange.m3721copyOHpmEuE$default(valueAt, 0L, 0L, layoutCoordinates4.mo3866localPositionOfR5De75A(layoutCoordinates, m3732getPositionF1C5BW0), false, 0L, mo3866localPositionOfR5De75A, false, 0, arrayList, 0L, 731, null));
                } else {
                    z13 = buildCache;
                    i11 = size;
                    i12 = i16;
                }
            } else {
                z13 = buildCache;
                i11 = size;
                z14 = z15;
                i12 = i15;
            }
            i15 = i12 + 1;
            z15 = z14;
            buildCache = z13;
            size = i11;
        }
        boolean z17 = buildCache;
        boolean z18 = z15;
        if (this.relevantChanges.isEmpty()) {
            this.pointerIds.clear();
            getChildren().clear();
            return z18;
        }
        int size3 = this.pointerIds.getSize();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            if (!longSparseArray.containsKey(this.pointerIds.m3825get_I2yYro(size3))) {
                this.pointerIds.removeAt(size3);
            }
        }
        ArrayList arrayList2 = new ArrayList(this.relevantChanges.size());
        int size4 = this.relevantChanges.size();
        for (int i21 = 0; i21 < size4; i21++) {
            arrayList2.add(this.relevantChanges.valueAt(i21));
        }
        PointerEvent pointerEvent = new PointerEvent(arrayList2, internalPointerEvent);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size5 = changes.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size5) {
                pointerInputChange = null;
                break;
            }
            PointerInputChange pointerInputChange2 = changes.get(i22);
            if (internalPointerEvent.m3660activeHoverEvent0FcD4WY(pointerInputChange2.m3730getIdJ3iCeTQ())) {
                pointerInputChange = pointerInputChange2;
                break;
            }
            i22++;
        }
        PointerInputChange pointerInputChange3 = pointerInputChange;
        if (pointerInputChange3 != null) {
            if (z11) {
                z12 = false;
                if (!this.isIn && (pointerInputChange3.getPressed() || pointerInputChange3.getPreviousPressed())) {
                    g0.m(this.coordinates);
                    this.isIn = !PointerEventKt.m3676isOutOfBoundsO0kMr_c(pointerInputChange3, r3.mo3865getSizeYbymL2g());
                }
            } else {
                z12 = false;
                this.isIn = false;
            }
            if (this.isIn != this.wasIn) {
                int m3674getType7fucELk = pointerEvent.m3674getType7fucELk();
                PointerEventType.Companion companion = PointerEventType.Companion;
                if (PointerEventType.m3681equalsimpl0(m3674getType7fucELk, companion.m3687getMove7fucELk()) || PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), companion.m3685getEnter7fucELk()) || PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), companion.m3686getExit7fucELk())) {
                    pointerEvent.m3675setTypeEhbLWgg$ui_release(this.isIn ? companion.m3685getEnter7fucELk() : companion.m3686getExit7fucELk());
                }
            }
            int m3674getType7fucELk2 = pointerEvent.m3674getType7fucELk();
            PointerEventType.Companion companion2 = PointerEventType.Companion;
            if (PointerEventType.m3681equalsimpl0(m3674getType7fucELk2, companion2.m3685getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                pointerEvent.m3675setTypeEhbLWgg$ui_release(companion2.m3687getMove7fucELk());
            } else if (PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), companion2.m3686getExit7fucELk()) && this.isIn && pointerInputChange3.getPressed()) {
                pointerEvent.m3675setTypeEhbLWgg$ui_release(companion2.m3687getMove7fucELk());
            }
        } else {
            z12 = false;
        }
        boolean z19 = (z17 || !PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), PointerEventType.Companion.m3687getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent)) ? z18 : z12;
        this.pointerEvent = pointerEvent;
        return z19;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(@k InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            boolean pressed = pointerInputChange.getPressed();
            boolean m3660activeHoverEvent0FcD4WY = internalPointerEvent.m3660activeHoverEvent0FcD4WY(pointerInputChange.m3730getIdJ3iCeTQ());
            boolean z11 = this.isIn;
            if ((!pressed && !m3660activeHoverEvent0FcD4WY) || (!pressed && !z11)) {
                this.pointerIds.remove(pointerInputChange.m3730getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), PointerEventType.Companion.m3686getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            nodeArr[i11].dispatchCancel();
        }
        DelegatingNode delegatingNode = this.modifierNode;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).onCancelPointerInput();
            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                int i12 = 0;
                delegatingNode = delegatingNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        i12++;
                        if (i12 == 1) {
                            delegatingNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                mutableVector.add(delegatingNode);
                                delegatingNode = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    delegatingNode = delegatingNode;
                }
                if (i12 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@k InternalPointerEvent internalPointerEvent) {
        boolean z11 = false;
        z11 = false;
        if (!this.relevantChanges.isEmpty() && this.modifierNode.isAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            g0.m(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            g0.m(layoutCoordinates);
            long mo3865getSizeYbymL2g = layoutCoordinates.mo3865getSizeYbymL2g();
            DelegatingNode delegatingNode = this.modifierNode;
            int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
            MutableVector mutableVector = null;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNode).mo205onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, mo3865getSizeYbymL2g);
                } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                    int i11 = 0;
                    delegatingNode = delegatingNode;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            i11++;
                            if (i11 == 1) {
                                delegatingNode = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNode != 0) {
                                    mutableVector.add(delegatingNode);
                                    delegatingNode = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        delegatingNode = delegatingNode;
                    }
                    if (i11 == 1) {
                    }
                }
                delegatingNode = DelegatableNodeKt.pop(mutableVector);
            }
            if (this.modifierNode.isAttached()) {
                MutableVector<Node> children = getChildren();
                Node[] nodeArr = children.content;
                int size = children.getSize();
                for (int i12 = 0; i12 < size; i12++) {
                    nodeArr[i12].dispatchFinalEventPass(internalPointerEvent);
                }
            }
            z11 = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@k LongSparseArray<PointerInputChange> longSparseArray, @k LayoutCoordinates layoutCoordinates, @k InternalPointerEvent internalPointerEvent, boolean z11) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.isAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        g0.m(pointerEvent);
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        g0.m(layoutCoordinates2);
        long mo3865getSizeYbymL2g = layoutCoordinates2.mo3865getSizeYbymL2g();
        DelegatingNode delegatingNode = this.modifierNode;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).mo205onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, mo3865getSizeYbymL2g);
            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                int i11 = 0;
                delegatingNode = delegatingNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        i11++;
                        if (i11 == 1) {
                            delegatingNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                mutableVector.add(delegatingNode);
                                delegatingNode = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    delegatingNode = delegatingNode;
                }
                if (i11 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
        if (this.modifierNode.isAttached()) {
            MutableVector<Node> children = getChildren();
            Node[] nodeArr = children.content;
            int size = children.getSize();
            for (int i12 = 0; i12 < size; i12++) {
                Node node = nodeArr[i12];
                LongSparseArray<PointerInputChange> longSparseArray2 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                g0.m(layoutCoordinates3);
                node.dispatchMainEventPass(longSparseArray2, layoutCoordinates3, internalPointerEvent, z11);
            }
        }
        if (this.modifierNode.isAttached()) {
            DelegatingNode delegatingNode2 = this.modifierNode;
            int m4118constructorimpl2 = NodeKind.m4118constructorimpl(16);
            MutableVector mutableVector2 = null;
            while (delegatingNode2 != 0) {
                if (delegatingNode2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNode2).mo205onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, mo3865getSizeYbymL2g);
                } else if ((delegatingNode2.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (delegatingNode2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release2 = delegatingNode2.getDelegate$ui_release();
                    int i13 = 0;
                    delegatingNode2 = delegatingNode2;
                    while (delegate$ui_release2 != null) {
                        if ((delegate$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                delegatingNode2 = delegate$ui_release2;
                            } else {
                                if (mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (delegatingNode2 != 0) {
                                    mutableVector2.add(delegatingNode2);
                                    delegatingNode2 = 0;
                                }
                                mutableVector2.add(delegate$ui_release2);
                            }
                        }
                        delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                        delegatingNode2 = delegatingNode2;
                    }
                    if (i13 == 1) {
                    }
                }
                delegatingNode2 = DelegatableNodeKt.pop(mutableVector2);
            }
        }
        return true;
    }

    @k
    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    @k
    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long j11, @k MutableObjectList<Node> mutableObjectList) {
        if (this.pointerIds.contains(j11) && !mutableObjectList.contains(this)) {
            this.pointerIds.remove(j11);
            this.relevantChanges.remove(j11);
        }
        MutableVector<Node> children = getChildren();
        Node[] nodeArr = children.content;
        int size = children.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            nodeArr[i11].removeInvalidPointerIdsAndChanges(j11, mutableObjectList);
        }
    }

    @k
    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
