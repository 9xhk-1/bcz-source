package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 11 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 12 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1533:1\n1296#1,7:1540\n1296#1,7:1629\n1149#1,2:1645\n1151#1,2:1657\n207#1:1661\n1286#1,7:1893\n207#1:2029\n207#1:2039\n207#1:2049\n1296#1,7:2065\n1101#2:1534\n1083#2,2:1535\n1101#2:1537\n1083#2,2:1538\n1101#2:1548\n1083#2,2:1549\n1101#2:1715\n1083#2,2:1716\n1101#2:1777\n1083#2,2:1778\n1101#2:1863\n1083#2,2:1864\n1101#2:1932\n1083#2,2:1933\n1101#2:1998\n1083#2,2:1999\n48#3:1547\n46#3:1552\n50#3:1591\n30#3:1593\n50#3:1594\n46#3:1596\n46#3:1619\n46#3:1647\n1#4:1551\n423#5,6:1553\n144#5:1559\n429#5,3:1560\n423#5,9:1563\n435#5,9:1572\n472#5:1592\n472#5:1595\n423#5,9:1597\n423#5,9:1620\n423#5,9:1648\n144#5:1660\n423#5,9:1662\n423#5,9:1962\n423#5,9:2030\n423#5,9:2040\n423#5,9:2050\n56#6,5:1581\n102#6,5:1586\n56#6,5:1607\n56#6,5:1612\n76#6,7:1637\n76#6,7:1807\n102#6,5:1814\n102#6,5:1819\n56#6,5:1825\n102#6,5:2059\n91#7:1606\n91#7:1617\n115#7:1618\n91#7:1636\n91#7:1644\n91#7:1659\n95#7:1683\n139#7:1745\n115#7:1824\n111#7:1830\n111#7:1847\n83#7:1900\n107#7:1971\n91#7:2064\n683#8,6:1671\n683#8,6:1677\n662#8,6:1684\n683#8,3:1690\n668#8,2:1693\n671#8,2:1738\n686#8,3:1740\n673#8:1743\n663#8:1744\n662#8,6:1746\n683#8,3:1752\n668#8,2:1755\n671#8,2:1800\n686#8,3:1802\n673#8:1805\n663#8:1806\n662#8,6:1831\n683#8,3:1837\n668#8,2:1840\n671#8,2:1886\n686#8,3:1888\n673#8:1891\n663#8:1892\n662#8,6:1901\n683#8,3:1907\n668#8,2:1910\n671#8,2:1955\n686#8,3:1957\n673#8:1960\n663#8:1961\n437#9,6:1695\n447#9,2:1702\n449#9,8:1707\n457#9,9:1718\n466#9,8:1730\n437#9,6:1757\n447#9,2:1764\n449#9,8:1769\n457#9,9:1780\n466#9,8:1792\n437#9,5:1842\n442#9:1848\n447#9,2:1850\n449#9,8:1855\n457#9,9:1866\n466#9,8:1878\n437#9,6:1912\n447#9,2:1919\n449#9,8:1924\n457#9,9:1935\n466#9,8:1947\n437#9,6:1978\n447#9,2:1985\n449#9,8:1990\n457#9,9:2001\n466#9,8:2013\n246#10:1701\n246#10:1763\n246#10:1849\n246#10:1918\n246#10:1984\n240#11,3:1704\n243#11,3:1727\n240#11,3:1766\n243#11,3:1789\n240#11,3:1852\n243#11,3:1875\n240#11,3:1921\n243#11,3:1944\n240#11,3:1987\n243#11,3:2010\n116#12:1972\n105#12,5:1973\n110#12,8:2021\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n120#1:1540,7\n553#1:1629,7\n592#1:1645,2\n592#1:1657,2\n670#1:1661\n1188#1:1893,7\n1318#1:2029\n1339#1:2039\n1351#1:2049\n1430#1:2065,7\n139#1:1534\n139#1:1535,2\n619#1:1537\n619#1:1538,2\n153#1:1548\n153#1:1549,2\n772#1:1715\n772#1:1716,2\n782#1:1777\n782#1:1778,2\n1175#1:1863\n1175#1:1864,2\n1257#1:1932\n1257#1:1933,2\n1281#1:1998\n1281#1:1999,2\n143#1:1547\n155#1:1552\n339#1:1591\n349#1:1593\n350#1:1594\n371#1:1596\n545#1:1619\n592#1:1647\n155#1:1553,6\n157#1:1559\n155#1:1560,3\n207#1:1563,9\n210#1:1572,9\n339#1:1592\n350#1:1595\n371#1:1597,9\n545#1:1620,9\n592#1:1648,9\n634#1:1660\n670#1:1662,9\n1259#1:1962,9\n1318#1:2030,9\n1339#1:2040,9\n1351#1:2050,9\n291#1:1581,5\n335#1:1586,5\n496#1:1607,5\n499#1:1612,5\n574#1:1637,7\n905#1:1807,7\n934#1:1814,5\n937#1:1819,5\n1111#1:1825,5\n1369#1:2059,5\n457#1:1606\n524#1:1617\n537#1:1618\n559#1:1636\n588#1:1644\n607#1:1659\n772#1:1683\n782#1:1745\n952#1:1824\n1175#1:1830\n1176#1:1847\n1257#1:1900\n1281#1:1971\n1395#1:2064\n752#1:1671,6\n763#1:1677,6\n772#1:1684,6\n772#1:1690,3\n772#1:1693,2\n772#1:1738,2\n772#1:1740,3\n772#1:1743\n772#1:1744\n782#1:1746,6\n782#1:1752,3\n782#1:1755,2\n782#1:1800,2\n782#1:1802,3\n782#1:1805\n782#1:1806\n1175#1:1831,6\n1175#1:1837,3\n1175#1:1840,2\n1175#1:1886,2\n1175#1:1888,3\n1175#1:1891\n1175#1:1892\n1257#1:1901,6\n1257#1:1907,3\n1257#1:1910,2\n1257#1:1955,2\n1257#1:1957,3\n1257#1:1960\n1257#1:1961\n772#1:1695,6\n772#1:1702,2\n772#1:1707,8\n772#1:1718,9\n772#1:1730,8\n782#1:1757,6\n782#1:1764,2\n782#1:1769,8\n782#1:1780,9\n782#1:1792,8\n1175#1:1842,5\n1175#1:1848\n1175#1:1850,2\n1175#1:1855,8\n1175#1:1866,9\n1175#1:1878,8\n1257#1:1912,6\n1257#1:1919,2\n1257#1:1924,8\n1257#1:1935,9\n1257#1:1947,8\n1281#1:1978,6\n1281#1:1985,2\n1281#1:1990,8\n1281#1:2001,9\n1281#1:2013,8\n772#1:1701\n782#1:1763\n1175#1:1849\n1257#1:1918\n1281#1:1984\n772#1:1704,3\n772#1:1727,3\n782#1:1766,3\n782#1:1789,3\n1175#1:1852,3\n1175#1:1875,3\n1257#1:1921,3\n1257#1:1944,3\n1281#1:1987,3\n1281#1:2010,3\n1281#1:1972\n1281#1:1973,5\n1281#1:2021,8\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    @k
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;

    @l
    private LayoutNode _foldedParent;

    @l
    private NodeCoordinator _innerLayerCoordinator;

    @k
    private Modifier _modifier;

    @l
    private SemanticsConfiguration _semanticsConfiguration;

    @l
    private MutableVector<LayoutNode> _unfoldedChildren;

    @k
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;

    @k
    private CompositionLocalMap compositionLocalMap;

    @k
    private Density density;
    private int depth;
    private boolean forceUseOldLayers;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;

    @l
    private AndroidViewHolder interopViewFactoryHolder;

    @l
    private IntrinsicsPolicy intrinsicsPolicy;

    @k
    private UsageByParent intrinsicsUsageByParent;
    private boolean isCurrentlyCalculatingSemanticsConfiguration;
    private boolean isDeactivated;
    private boolean isSemanticsInvalidated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private long lastSize;

    @k
    private final LayoutNodeLayoutDelegate layoutDelegate;

    @k
    private LayoutDirection layoutDirection;

    @l
    private LayoutNode lookaheadRoot;

    @k
    private MeasurePolicy measurePolicy;
    private boolean needsOnPositionedDispatch;

    @k
    private final NodeChain nodes;
    private long offsetFromRoot;

    @l
    private x00.l<? super Owner, g2> onAttach;

    @l
    private x00.l<? super Owner, g2> onDetach;
    private long outerToInnerOffset;
    private boolean outerToInnerOffsetDirty;

    @l
    private Owner owner;

    @l
    private Modifier pendingModifier;

    @k
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;

    @l
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;

    @k
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List list, long j11) {
            return (MeasureResult) m4042measure3p2s80s(measureScope, (List<? extends Measurable>) list, j11);
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m4042measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    };

    @k
    private static final x00.a<LayoutNode> Constructor = new x00.a<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.a
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };

    @k
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo4041getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m5223getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    @k
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int ZComparator$lambda$37;
            ZComparator$lambda$37 = LayoutNode.ZComparator$lambda$37((LayoutNode) obj, (LayoutNode) obj2);
            return ZComparator$lambda$37;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final x00.a<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        @k
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        @k
        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }

        private Companion() {
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui_release$annotations() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LayoutState {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Measuring = new LayoutState("Measuring", 0);
        public static final LayoutState LookaheadMeasuring = new LayoutState("LookaheadMeasuring", 1);
        public static final LayoutState LayingOut = new LayoutState("LayingOut", 2);
        public static final LayoutState LookaheadLayingOut = new LayoutState("LookaheadLayingOut", 3);
        public static final LayoutState Idle = new LayoutState("Idle", 4);

        private static final /* synthetic */ LayoutState[] $values() {
            return new LayoutState[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
        }

        static {
            LayoutState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private LayoutState(String str, int i11) {
        }

        @k
        public static m00.a<LayoutState> getEntries() {
            return $ENTRIES;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;

        @k
        private final String error;

        public NoIntrinsicsMeasurePolicy(@k String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
            return ((Number) m4043maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i11)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
            return ((Number) m4044maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i11)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
            return ((Number) m4045minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i11)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
            return ((Number) m4046minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i11)).intValue();
        }

        @k
        /* renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m4043maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }

        @k
        /* renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m4044maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }

        @k
        /* renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m4045minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }

        @k
        /* renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m4046minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k List<? extends IntrinsicMeasurable> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UsageByParent {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InMeasureBlock = new UsageByParent("InMeasureBlock", 0);
        public static final UsageByParent InLayoutBlock = new UsageByParent("InLayoutBlock", 1);
        public static final UsageByParent NotUsed = new UsageByParent("NotUsed", 2);

        private static final /* synthetic */ UsageByParent[] $values() {
            return new UsageByParent[]{InMeasureBlock, InLayoutBlock, NotUsed};
        }

        static {
            UsageByParent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private UsageByParent(String str, int i11) {
        }

        @k
        public static m00.a<UsageByParent> getEntries() {
            return $ENTRIES;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$37(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.getZIndex() == layoutNode2.getZIndex() ? g0.t(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release()) : Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    private final void applyModifier(Modifier modifier) {
        this._modifier = modifier;
        this.nodes.updateFrom$ui_release(modifier);
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && this.nodes.m4079hasH91voCI$ui_release(NodeKind.m4118constructorimpl(512))) {
            setLookaheadRoot(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration calculateSemanticsConfiguration() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new x00.a<g2>() { // from class: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
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
            /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NodeChain nodes$ui_release = LayoutNode.this.getNodes$ui_release();
                int m4118constructorimpl = NodeKind.m4118constructorimpl(8);
                Ref.ObjectRef<SemanticsConfiguration> objectRef2 = objectRef;
                if ((nodes$ui_release.getAggregateChildKindSet() & m4118constructorimpl) != 0) {
                    for (Modifier.Node tail$ui_release = nodes$ui_release.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                        if ((tail$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            DelegatingNode delegatingNode = tail$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
                                    if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                        ?? semanticsConfiguration = new SemanticsConfiguration();
                                        objectRef2.element = semanticsConfiguration;
                                        semanticsConfiguration.setClearingSemantics(true);
                                    }
                                    if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                        objectRef2.element.setMergingSemanticsOfDescendants(true);
                                    }
                                    semanticsModifierNode.applySemantics(objectRef2.element);
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
                        }
                    }
                }
            }
        });
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) objectRef.element;
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.clearSubtreePlacementIntrinsicsUsage();
            }
        }
    }

    private final String debugTreeToString(int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(GlideException.a.f28776d);
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i13 = 0; i13 < size; i13++) {
            sb2.append(layoutNodeArr[i13].debugTreeToString(i11 + 1));
        }
        String sb3 = sb2.toString();
        if (i11 != 0) {
            return sb3;
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        g0.o(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return layoutNode.debugTreeToString(i11);
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode layoutNode) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot insert ");
        sb2.append(layoutNode);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(debugTreeToString$default(this, 0, 1, null));
        sb2.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode._foldedParent;
        sb2.append(layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null);
        return sb2.toString();
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    /* renamed from: hitTest-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m4027hitTest6fMxITs$ui_release$default(LayoutNode layoutNode, long j11, HitTestResult hitTestResult, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = PointerType.Companion.m3811getUnknownT8wyACA();
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        layoutNode.m4034hitTest6fMxITs$ui_release(j11, hitTestResult, i13, z11);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m4028hitTestSemantics6fMxITs$ui_release$default(LayoutNode layoutNode, long j11, HitTestResult hitTestResult, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = PointerType.Companion.m3810getTouchT8wyACA();
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        layoutNode.m4035hitTestSemantics6fMxITs$ui_release(j11, hitTestResult, i13, z11);
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        layoutNode.invalidateSubtree(z11);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m4029lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m4050getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m4036lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                layoutNodeArr[i11].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i11 = 0; i11 < size; i11++) {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.isVirtual) {
                    mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                } else {
                    mutableVector.add(layoutNode);
                }
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m4030remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m4049getLastConstraintsDWUhwKw();
        }
        return layoutNode.m4037remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z11);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z11, z12, z13);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        layoutNode.requestRelayout$ui_release(z11);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        layoutNode.requestRemeasure$ui_release(z11, z12, z13);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (g0.g(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !g0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        } else {
            this.layoutDelegate.clearLookaheadDelegate();
        }
        invalidateMeasurements$ui_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a A[LOOP:0: B:50:0x0118->B:51:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attach$ui_release(@m80.k androidx.compose.ui.node.Owner r7) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb2.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb2.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        x00.l<? super Owner, g2> lVar = this.onDetach;
        if (lVar != null) {
            lVar.invoke(owner);
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m4079hasH91voCI$ui_release(NodeKind.m4118constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        LayoutNode[] layoutNodeArr = vector.content;
        int size = vector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            layoutNodeArr[i11].detach$ui_release();
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m4079hasH91voCI$ui_release(NodeKind.m4118constructorimpl(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            owner.onSemanticsChange();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
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
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || isDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & m4118constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNode;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m3979requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m4118constructorimpl(256)));
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
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(@k Canvas canvas, @l GraphicsLayer graphicsLayer) {
        getOuterCoordinator$ui_release().draw(canvas, graphicsLayer);
    }

    public final void forEachChild(@k x00.l<? super LayoutNode, g2> lVar) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(layoutNodeArr[i11]);
        }
    }

    public final void forEachChildIndexed(@k p<? super Integer, ? super LayoutNode, g2> pVar) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(i11), layoutNodeArr[i11]);
        }
    }

    public final void forEachCoordinator$ui_release(@k x00.l<? super LayoutModifierNodeCoordinator, g2> lVar) {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            g0.n(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            lVar.invoke((LayoutModifierNodeCoordinator) outerCoordinator$ui_release);
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@k x00.l<? super NodeCoordinator, g2> lVar) {
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !g0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            lVar.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        LayoutNode layoutNode;
        if (this.lookaheadRoot != null) {
            layoutNode = this;
            requestLookaheadRemeasure$ui_release$default(layoutNode, false, false, false, 5, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 5, null);
            layoutNode = this;
        }
        Constraints m4049getLastConstraintsDWUhwKw = layoutNode.layoutDelegate.m4049getLastConstraintsDWUhwKw();
        if (m4049getLastConstraintsDWUhwKw != null) {
            Owner owner = layoutNode.owner;
            if (owner != null) {
                owner.mo4179measureAndLayout0kLqBqw(this, m4049getLastConstraintsDWUhwKw.m5074unboximpl());
                return;
            }
            return;
        }
        Owner owner2 = layoutNode.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release() || !((lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        return this.pendingModifier != null;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    @k
    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        g0.m(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    @k
    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @k
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    @k
    public List<SemanticsInfo> getChildrenInfo() {
        return getChildren$ui_release();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @k
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @k
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @k
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    @k
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.getVector().asMutableList();
    }

    public final boolean getForceUseOldLayers() {
        return this.forceUseOldLayers;
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long m4102getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m4102getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m5066getHasFixedWidthimpl(m4102getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m5065getHasFixedHeightimpl(m4102getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    @k
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    @l
    public final NodeCoordinator getInnerLayerCoordinator$ui_release() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this._innerLayerCoordinator = null;
            while (true) {
                if (g0.g(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy$ui_release() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("layer was not set");
        throw new KotlinNothingValueException();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    @l
    @InternalComposeUiApi
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @l
    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    @k
    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    /* renamed from: getLastSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m4031getLastSizeYbymL2g$ui_release() {
        return this.lastSize;
    }

    @k
    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @k
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    @k
    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    @l
    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    @l
    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.lookaheadRoot;
    }

    @k
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @k
    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @k
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @k
    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    @k
    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @k
    public Modifier getModifier() {
        return this._modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @k
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    @k
    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    /* renamed from: getOffsetFromRoot-nOcc-ac$ui_release, reason: not valid java name */
    public final long m4032getOffsetFromRootnOccac$ui_release() {
        return this.offsetFromRoot;
    }

    @l
    public final x00.l<Owner, g2> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @l
    public final x00.l<Owner, g2> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @k
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    /* renamed from: getOuterToInnerOffset-nOcc-ac$ui_release, reason: not valid java name */
    public final long m4033getOuterToInnerOffsetnOccac$ui_release() {
        return this.outerToInnerOffset;
    }

    public final boolean getOuterToInnerOffsetDirty$ui_release() {
        return this.outerToInnerOffsetDirty;
    }

    @l
    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    @l
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    @l
    public SemanticsConfiguration getSemanticsConfiguration() {
        if (!isAttached() || isDeactivated() || !this.nodes.m4079hasH91voCI$ui_release(NodeKind.m4118constructorimpl(8))) {
            return null;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this._semanticsConfiguration == null) {
            this._semanticsConfiguration = calculateSemanticsConfiguration();
        }
        return this._semanticsConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    @l
    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @k
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @k
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @k
    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        g0.m(mutableVector);
        return mutableVector;
    }

    /* renamed from: hitTest-6fMxITs$ui_release, reason: not valid java name */
    public final void m4034hitTest6fMxITs$ui_release(long j11, @k HitTestResult hitTestResult, int i11, boolean z11) {
        getOuterCoordinator$ui_release().m4105hitTestqzLsGqo(NodeCoordinator.Companion.getPointerInputSource(), NodeCoordinator.m4087fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j11, false, 2, null), hitTestResult, i11, z11);
    }

    /* renamed from: hitTestSemantics-6fMxITs$ui_release, reason: not valid java name */
    public final void m4035hitTestSemantics6fMxITs$ui_release(long j11, @k HitTestResult hitTestResult, int i11, boolean z11) {
        getOuterCoordinator$ui_release().m4105hitTestqzLsGqo(NodeCoordinator.Companion.getSemanticsSource(), NodeCoordinator.m4087fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j11, false, 2, null), hitTestResult, PointerType.Companion.m3810getTouchT8wyACA(), z11);
    }

    public final void ignoreRemeasureRequests$ui_release(@k x00.a<g2> aVar) {
        this.ignoreRemeasureRequests = true;
        aVar.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int i11, @k LayoutNode layoutNode) {
        if (!(layoutNode._foldedParent == null || layoutNode.owner == null)) {
            InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(layoutNode));
        }
        layoutNode._foldedParent = this;
        this._foldedChildren.add(i11, layoutNode);
        onZSortedChildrenInvalidated$ui_release();
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            layoutNode.attach$ui_release(owner);
        }
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator$ui_release = getInnerLayerCoordinator$ui_release();
        if (innerLayerCoordinator$ui_release != null) {
            innerLayerCoordinator$ui_release.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            g0.n(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer layer = ((LayoutModifierNodeCoordinator) outerCoordinator$ui_release).getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        this.outerToInnerOffsetDirty = true;
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 7, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui_release() {
        if (getLayoutPending$ui_release() || getMeasurePending$ui_release() || this.needsOnPositionedDispatch) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled) {
            this._semanticsConfiguration = null;
            LayoutNodeKt.requireOwner(this).onSemanticsChange();
        } else {
            if (this.nodes.isUpdating$ui_release() || getApplyingModifierOnAttach$ui_release()) {
                this.isSemanticsInvalidated = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = calculateSemanticsConfiguration();
            this.isSemanticsInvalidated = false;
            Owner requireOwner = LayoutNodeKt.requireOwner(this);
            requireOwner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            requireOwner.onSemanticsChange();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void invalidateSubtree(boolean z11) {
        LayoutNode parent$ui_release;
        if (z11 && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        NodeChain nodeChain = this.nodes;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & m4118constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m3979requireCoordinator64DMado((LayoutModifierNode) delegatingNode, NodeKind.m4118constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
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
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i12 = 0; i12 < size; i12++) {
            layoutNodeArr[i12].invalidateSubtree(false);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    @l
    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    public final boolean isSemanticsInvalidated$ui_release() {
        return this.isSemanticsInvalidated;
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public boolean isTransparent() {
        return getOuterCoordinator$ui_release().isTransparent();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.isVirtualLookaheadRoot;
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m4036lookaheadRemeasure_Sx5XlM$ui_release(@l Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        g0.m(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m4064remeasureBRTryo0(constraints.m5074unboximpl());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        g0.m(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final int maxIntrinsicHeight(int i11) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(i11);
    }

    public final int maxIntrinsicWidth(int i11) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(i11);
    }

    public final int maxLookaheadIntrinsicHeight(int i11) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(i11);
    }

    public final int maxLookaheadIntrinsicWidth(int i11) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(i11);
    }

    public final int minIntrinsicHeight(int i11) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(i11);
    }

    public final int minIntrinsicWidth(int i11) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(i11);
    }

    public final int minLookaheadIntrinsicHeight(int i11) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(i11);
    }

    public final int minLookaheadIntrinsicWidth(int i11) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(i11);
    }

    public final void move$ui_release(int i11, int i12, int i13) {
        if (i11 == i12) {
            return;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            this._foldedChildren.add(i11 > i12 ? i12 + i14 : (i12 + i13) - 2, this._foldedChildren.removeAt(i11 > i12 ? i11 + i14 : i11));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onDeactivate();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onDeactivate();
            }
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled) {
                this._semanticsConfiguration = null;
                this.isSemanticsInvalidated = false;
            } else {
                invalidateSemantics$ui_release();
            }
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.onLayoutNodeDeactivated(this);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onDeactivate();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onDeactivate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
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
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int m4118constructorimpl = NodeKind.m4118constructorimpl(128);
        boolean m4127getIncludeSelfInTraversalH91voCI = NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(m4118constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (!m4127getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = innerCoordinator$ui_release.headNode(m4127getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                DelegatingNode delegatingNode = headNode;
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).onPlaced(getInnerCoordinator$ui_release());
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
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onRelease();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onRelease();
            }
        }
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !g0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            outerCoordinator$ui_release.onRelease();
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onRelease();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onRelease();
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        if (!ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onReuse();
            }
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (isDeactivated()) {
            this.isDeactivated = false;
            if (!ComposeUiFlags.isSemanticAutofillEnabled) {
                invalidateSemantics$ui_release();
            }
        } else {
            resetModifierState();
        }
        int semanticsId = getSemanticsId();
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        Owner owner = this.owner;
        if (owner != null) {
            owner.onPreLayoutNodeReused(this, semanticsId);
        }
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.subcompositionsState;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.onReuse();
            }
        }
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m4079hasH91voCI$ui_release(NodeKind.m4118constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        rescheduleRemeasureOrRelayout$ui_release(this);
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.onPostLayoutNodeReused(this, semanticsId);
        }
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated$ui_release();
        }
    }

    public final void place$ui_release(int i11, int i12) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), i11, i12, 0.0f, 4, null);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m4037remeasure_Sx5XlM$ui_release(@l Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m4074remeasureBRTryo0(constraints.m5074unboximpl());
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getVector().getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this._foldedChildren.clear();
                return;
            }
            onChildRemoved(this._foldedChildren.getVector().content[size]);
        }
    }

    public final void removeAt$ui_release(int i11, int i12) {
        if (!(i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("count (" + i12 + ") must be greater than 0");
        }
        int i13 = (i12 + i11) - 1;
        if (i11 > i13) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.getVector().content[i13]);
            this._foldedChildren.removeAt(i13);
            if (i13 == i11) {
                return;
            } else {
                i13--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestAutofill$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestAutofill(this);
    }

    public final void requestLookaheadRelayout$ui_release(boolean z11) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, z11);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z11, boolean z12, boolean z13) {
        if (!(this.lookaheadRoot != null)) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, z11, z12);
        if (z13) {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            g0.m(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(z11);
        }
    }

    public final void requestRelayout$ui_release(boolean z11) {
        Owner owner;
        this.outerToInnerOffsetDirty = true;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, z11, 2, null);
    }

    public final void requestRemeasure$ui_release(boolean z11, boolean z12, boolean z13) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, z11, z12, 2, null);
        if (z13) {
            getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z11);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@k LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.getLayoutState$ui_release());
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
            return;
        }
        if (layoutNode.getLookaheadLayoutPending$ui_release()) {
            layoutNode.requestLookaheadRelayout$ui_release(true);
        }
        if (layoutNode.getMeasurePending$ui_release()) {
            requestRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
        } else if (layoutNode.getLayoutPending$ui_release()) {
            layoutNode.requestRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z11) {
        this.canMultiMeasure = z11;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositeKeyHash(int i11) {
        this.compositeKeyHash = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(@k CompositionLocalMap compositionLocalMap) {
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(32768);
        if ((nodeChain.getAggregateChildKindSet() & m4118constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) delegatingNode).getNode();
                            if (node.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
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
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@k Density density) {
        if (g0.g(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
        for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.onDensityChange();
        }
    }

    public final void setDepth$ui_release(int i11) {
        this.depth = i11;
    }

    public final void setForceUseOldLayers(boolean z11) {
        this.forceUseOldLayers = z11;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z11) {
        this.innerLayerCoordinatorIsDirty = z11;
    }

    public final void setInteropViewFactoryHolder$ui_release(@l AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@k UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    /* renamed from: setLastSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m4038setLastSizeozmzZPI$ui_release(long j11) {
        this.lastSize = j11;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@k LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                head$ui_release.onLayoutDirectionChange();
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@k MeasurePolicy measurePolicy) {
        if (g0.g(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@k Modifier modifier) {
        if (!(!this.isVirtual || getModifier() == Modifier.Companion)) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.pendingModifier = modifier;
            return;
        }
        applyModifier(modifier);
        if (this.isSemanticsInvalidated) {
            invalidateSemantics$ui_release();
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z11) {
        this.needsOnPositionedDispatch = z11;
    }

    /* renamed from: setOffsetFromRoot--gyyYBs$ui_release, reason: not valid java name */
    public final void m4039setOffsetFromRootgyyYBs$ui_release(long j11) {
        this.offsetFromRoot = j11;
    }

    public final void setOnAttach$ui_release(@l x00.l<? super Owner, g2> lVar) {
        this.onAttach = lVar;
    }

    public final void setOnDetach$ui_release(@l x00.l<? super Owner, g2> lVar) {
        this.onDetach = lVar;
    }

    /* renamed from: setOuterToInnerOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m4040setOuterToInnerOffsetgyyYBs$ui_release(long j11) {
        this.outerToInnerOffset = j11;
    }

    public final void setOuterToInnerOffsetDirty$ui_release(boolean z11) {
        this.outerToInnerOffsetDirty = z11;
    }

    public void setSemanticsId(int i11) {
        this.semanticsId = i11;
    }

    public final void setSemanticsInvalidated$ui_release(boolean z11) {
        this.isSemanticsInvalidated = z11;
    }

    public final void setSubcompositionsState$ui_release(@l LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@k ViewConfiguration viewConfiguration) {
        if (g0.g(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & m4118constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNode).onViewConfigurationChange();
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
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z11) {
        this.isVirtualLookaheadRoot = z11;
    }

    @k
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public LayoutNode(boolean z11, int i11) {
        Density density;
        this.isVirtual = z11;
        this.semanticsId = i11;
        IntOffset.Companion companion = IntOffset.Companion;
        this.offsetFromRoot = companion.m5253getMaxnOccac();
        this.lastSize = IntSize.Companion.m5291getZeroYbymL2g();
        this.outerToInnerOffset = companion.m5253getMaxnOccac();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new x00.a<g2>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LayoutNode.this.getLayoutDelegate$ui_release().markChildrenDirty();
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        density = LayoutNodeKt.DefaultDensity;
        this.density = density;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.Companion.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.Companion;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @l
    public SemanticsInfo getParentInfo() {
        return getParent$ui_release();
    }

    @n(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @v0
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public /* synthetic */ LayoutNode(boolean z11, int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i11);
    }
}
