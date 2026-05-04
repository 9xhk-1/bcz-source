package androidx.compose.ui.node;

import a00.w1;
import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 15 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 16 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 17 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 18 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 19 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 20 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 21 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1619:1\n105#1,5:1620\n110#1,4:1668\n105#1,9:1672\n116#1:1688\n105#1,5:1689\n110#1,8:1737\n116#1:1817\n105#1,5:1818\n110#1,8:1866\n116#1:1877\n105#1,5:1878\n110#1,8:1926\n116#1:1941\n105#1,5:1942\n110#1,8:1990\n437#2,6:1625\n447#2,2:1632\n449#2,8:1637\n457#2,9:1648\n466#2,8:1660\n437#2,6:1694\n447#2,2:1701\n449#2,8:1706\n457#2,9:1717\n466#2,8:1729\n437#2,5:1752\n442#2:1758\n447#2,2:1760\n449#2,8:1765\n457#2,9:1776\n466#2,8:1788\n437#2,6:1823\n447#2,2:1830\n449#2,8:1835\n457#2,9:1846\n466#2,8:1858\n437#2,6:1883\n447#2,2:1890\n449#2,8:1895\n457#2,9:1906\n466#2,8:1918\n437#2,6:1947\n447#2,2:1954\n449#2,8:1959\n457#2,9:1970\n466#2,8:1982\n437#2,5:2051\n442#2:2068\n447#2,2:2070\n449#2,8:2075\n457#2,9:2086\n466#2,8:2098\n222#2:2191\n223#2,8:2197\n235#2:2207\n209#2:2208\n210#2,6:2214\n437#2,6:2220\n447#2,2:2227\n449#2,8:2232\n457#2,9:2243\n466#2,8:2255\n217#2,3:2263\n246#3:1631\n246#3:1700\n246#3:1750\n246#3:1759\n246#3:1829\n246#3:1889\n246#3:1953\n246#3:2069\n246#3:2226\n240#4,3:1634\n243#4,3:1657\n240#4,3:1703\n243#4,3:1726\n240#4,3:1762\n243#4,3:1785\n240#4,3:1832\n243#4,3:1855\n240#4,3:1892\n243#4,3:1915\n240#4,3:1956\n243#4,3:1979\n240#4,3:2072\n243#4,3:2095\n240#4,3:2229\n243#4,3:2252\n1101#5:1645\n1083#5,2:1646\n1101#5:1714\n1083#5,2:1715\n1101#5:1773\n1083#5,2:1774\n1101#5:1843\n1083#5,2:1844\n1101#5:1903\n1083#5,2:1904\n1101#5:1967\n1083#5,2:1968\n1101#5:2083\n1083#5,2:2084\n1101#5:2240\n1083#5,2:2241\n215#6,2:1681\n30#7:1683\n30#7:1685\n80#8:1684\n80#8:1686\n60#8:2057\n60#8:2060\n70#8:2063\n70#8:2066\n60#8:2107\n70#8:2110\n60#8:2113\n70#8:2116\n60#8:2137\n70#8:2140\n85#8:2152\n90#8:2154\n85#8:2161\n90#8:2163\n60#8:2165\n70#8:2168\n85#8:2171\n90#8:2173\n85#8:2175\n90#8:2177\n85#8:2179\n90#8:2181\n60#8:2185\n70#8:2188\n60#8:2267\n70#8:2270\n53#8,3:2273\n60#8:2277\n70#8:2280\n53#8,3:2283\n60#8:2287\n70#8:2290\n60#8:2294\n70#8:2298\n60#8:2300\n70#8:2303\n87#9:1687\n103#9:1745\n103#9:1749\n103#9:1751\n107#9:1809\n107#9:1816\n155#9:1875\n155#9:1876\n87#9:1939\n107#9:1940\n83#9:2034\n83#9:2046\n83#9:2049\n95#9:2050\n83#9:2190\n95#9:2205\n95#9:2206\n712#10,3:1746\n715#10,3:1796\n1#11:1757\n56#12,5:1799\n56#12,5:1804\n102#12,5:1934\n102#12,5:1998\n76#12,7:2003\n56#12,5:2010\n56#12,5:2118\n56#12,5:2123\n56#12,5:2128\n56#12,5:2141\n56#12,5:2146\n56#12,5:2155\n56#12,5:2192\n56#12,5:2209\n602#13,6:1810\n609#13:1874\n139#14:2015\n139#14:2016\n92#15,9:2017\n113#15,8:2026\n121#15,2:2035\n100#15:2037\n113#15,8:2038\n121#15,2:2047\n65#16:2056\n65#16:2059\n69#16:2062\n69#16:2065\n150#16:2133\n150#16:2134\n65#16:2136\n69#16:2139\n65#16:2184\n69#16:2187\n65#16:2266\n69#16:2269\n65#16:2299\n69#16:2302\n22#17:2058\n22#17:2061\n22#17:2064\n22#17:2067\n22#17:2108\n22#17:2111\n22#17:2114\n22#17:2117\n22#17:2138\n22#17:2166\n22#17:2169\n22#17:2186\n22#17:2189\n22#17:2268\n22#17:2271\n22#17:2278\n22#17:2281\n22#17:2288\n22#17:2291\n22#17:2295\n22#17:2301\n57#18:2106\n61#18:2109\n57#18:2112\n61#18:2115\n57#18:2164\n61#18:2167\n57#18:2276\n61#18:2279\n57#18:2286\n61#18:2289\n63#18:2292\n57#18:2293\n65#18:2296\n61#18:2297\n273#19:2135\n266#19,2:2182\n30#19:2272\n54#20:2151\n59#20:2153\n54#20:2160\n59#20:2162\n54#20:2170\n59#20:2172\n54#20:2174\n59#20:2176\n54#20:2178\n59#20:2180\n33#21:2282\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n116#1:1620,5\n116#1:1668,4\n124#1:1672,9\n243#1:1688\n243#1:1689,5\n243#1:1737,8\n318#1:1817\n318#1:1818,5\n318#1:1866,8\n325#1:1877\n325#1:1878,5\n325#1:1926,8\n460#1:1941\n460#1:1942,5\n460#1:1990,8\n116#1:1625,6\n116#1:1632,2\n116#1:1637,8\n116#1:1648,9\n116#1:1660,8\n243#1:1694,6\n243#1:1701,2\n243#1:1706,8\n243#1:1717,9\n243#1:1729,8\n265#1:1752,5\n265#1:1758\n265#1:1760,2\n265#1:1765,8\n265#1:1776,9\n265#1:1788,8\n318#1:1823,6\n318#1:1830,2\n318#1:1835,8\n318#1:1846,9\n318#1:1858,8\n325#1:1883,6\n325#1:1890,2\n325#1:1895,8\n325#1:1906,9\n325#1:1918,8\n460#1:1947,6\n460#1:1954,2\n460#1:1959,8\n460#1:1970,9\n460#1:1982,8\n884#1:2051,5\n884#1:2068\n884#1:2070,2\n884#1:2075,8\n884#1:2086,9\n884#1:2098,8\n1328#1:2191\n1328#1:2197,8\n1364#1:2207\n1364#1:2208\n1364#1:2214,6\n1364#1:2220,6\n1364#1:2227,2\n1364#1:2232,8\n1364#1:2243,9\n1364#1:2255,8\n1364#1:2263,3\n116#1:1631\n243#1:1700\n264#1:1750\n265#1:1759\n318#1:1829\n325#1:1889\n460#1:1953\n884#1:2069\n1364#1:2226\n116#1:1634,3\n116#1:1657,3\n243#1:1703,3\n243#1:1726,3\n265#1:1762,3\n265#1:1785,3\n318#1:1832,3\n318#1:1855,3\n325#1:1892,3\n325#1:1915,3\n460#1:1956,3\n460#1:1979,3\n884#1:2072,3\n884#1:2095,3\n1364#1:2229,3\n1364#1:2252,3\n116#1:1645\n116#1:1646,2\n243#1:1714\n243#1:1715,2\n265#1:1773\n265#1:1774,2\n318#1:1843\n318#1:1844,2\n325#1:1903\n325#1:1904,2\n460#1:1967\n460#1:1968,2\n884#1:2083\n884#1:2084,2\n1364#1:2240\n1364#1:2241,2\n196#1:1681,2\n232#1:1683\n239#1:1685\n232#1:1684\n239#1:1686\n887#1:2057\n888#1:2060\n889#1:2063\n890#1:2066\n922#1:2107\n923#1:2110\n924#1:2113\n925#1:2116\n1038#1:2137\n1038#1:2140\n1084#1:2152\n1085#1:2154\n1186#1:2161\n1187#1:2163\n1234#1:2165\n1235#1:2168\n1239#1:2171\n1240#1:2173\n1243#1:2175\n1243#1:2177\n1278#1:2179\n1278#1:2181\n1299#1:2185\n1300#1:2188\n1373#1:2267\n1375#1:2270\n1378#1:2273,3\n1387#1:2277\n1388#1:2280\n1389#1:2283,3\n1402#1:2287\n1403#1:2290\n1409#1:2294\n1409#1:2298\n1413#1:2300\n1413#1:2303\n243#1:1687\n257#1:1745\n264#1:1749\n265#1:1751\n316#1:1809\n318#1:1816\n324#1:1875\n325#1:1876\n446#1:1939\n460#1:1940\n724#1:2034\n811#1:2046\n855#1:2049\n884#1:2050\n1328#1:2190\n1358#1:2205\n1364#1:2206\n263#1:1746,3\n263#1:1796,3\n282#1:1799,5\n289#1:1804,5\n358#1:1934,5\n503#1:1998,5\n566#1:2003,7\n595#1:2010,5\n944#1:2118,5\n952#1:2123,5\n959#1:2128,5\n1073#1:2141,5\n1074#1:2146,5\n1128#1:2155,5\n1328#1:2192,5\n1364#1:2209,5\n317#1:1810,6\n317#1:1874\n670#1:2015\n695#1:2016\n723#1:2017,9\n723#1:2026,8\n723#1:2035,2\n810#1:2037\n810#1:2038,8\n810#1:2047,2\n887#1:2056\n888#1:2059\n889#1:2062\n890#1:2065\n995#1:2133\n993#1:2134\n1038#1:2136\n1038#1:2139\n1299#1:2184\n1300#1:2187\n1373#1:2266\n1375#1:2269\n1413#1:2299\n1413#1:2302\n887#1:2058\n888#1:2061\n889#1:2064\n890#1:2067\n922#1:2108\n923#1:2111\n924#1:2114\n925#1:2117\n1038#1:2138\n1234#1:2166\n1235#1:2169\n1299#1:2186\n1300#1:2189\n1373#1:2268\n1375#1:2271\n1387#1:2278\n1388#1:2281\n1402#1:2288\n1403#1:2291\n1409#1:2295\n1413#1:2301\n922#1:2106\n923#1:2109\n924#1:2112\n925#1:2115\n1234#1:2164\n1235#1:2167\n1387#1:2276\n1388#1:2279\n1402#1:2286\n1403#1:2289\n1409#1:2292\n1409#1:2293\n1409#1:2296\n1409#1:2297\n1037#1:2135\n1287#1:2182,2\n1378#1:2272\n1084#1:2151\n1085#1:2153\n1186#1:2160\n1187#1:2162\n1239#1:2170\n1240#1:2172\n1243#1:2174\n1243#1:2176\n1278#1:2178\n1278#1:2180\n1389#1:2282\n*E\n"})
/* loaded from: classes2.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;

    @k
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @k
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";

    @l
    private p<? super Canvas, ? super GraphicsLayer, g2> _drawBlock;

    @l
    private MeasureResult _measureResult;

    @l
    private MutableRect _rectCache;

    @l
    private Canvas drawBlockCanvas;

    @l
    private GraphicsLayer drawBlockParentLayer;

    @l
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;

    @l
    private OwnedLayer layer;

    @l
    private x00.l<? super GraphicsLayerScope, g2> layerBlock;

    @l
    private LayerPositionalProperties layerPositionalProperties;

    @k
    private final LayoutNode layoutNode;

    @l
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private boolean released;

    @l
    private NodeCoordinator wrapped;

    @l
    private NodeCoordinator wrappedBy;
    private float zIndex;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final x00.l<NodeCoordinator, g2> onCommitAffectingLayerParams = new x00.l<NodeCoordinator, g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.isValidOwnerScope() && NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null)) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode);
                requireOwner.getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
                requireOwner.requestOnPositionedCallback(layoutNode);
            }
        }
    };

    @k
    private static final x00.l<NodeCoordinator, g2> onCommitAffectingLayer = new x00.l<NodeCoordinator, g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };

    @k
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @k
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();

    @k
    private static final float[] tmpMatrix = Matrix.m2739constructorimpl$default(null, 1, null);

    @k
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo4113childHitTestqzLsGqo(LayoutNode layoutNode, long j11, HitTestResult hitTestResult, int i11, boolean z11) {
            layoutNode.m4034hitTest6fMxITs$ui_release(j11, hitTestResult, i11, z11);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo4114entityTypeOLwlOKw() {
            return NodeKind.m4118constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                    int i11 = 0;
                    node = node;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            i11++;
                            if (i11 == 1) {
                                node = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        node = node;
                    }
                    if (i11 == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }
    };

    @k
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo */
        public void mo4113childHitTestqzLsGqo(LayoutNode layoutNode, long j11, HitTestResult hitTestResult, int i11, boolean z11) {
            layoutNode.m4035hitTestSemantics6fMxITs$ui_release(j11, hitTestResult, i11, z11);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo4114entityTypeOLwlOKw() {
            return NodeKind.m4118constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
            boolean z11 = false;
            if (semanticsConfiguration != null && semanticsConfiguration.isClearingSemantics()) {
                z11 = true;
            }
            return !z11;
        }
    };

    @k
    private Density layerDensity = getLayoutNode().getDensity();

    @k
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m5254getZeronOccac();

    @k
    private final x00.a<g2> invalidateParentLayer = new x00.a<g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
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
            NodeCoordinator wrappedBy$ui_release = NodeCoordinator.this.getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null) {
                wrappedBy$ui_release.invalidateLayer();
            }
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        @k
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface HitTestSource {
        /* renamed from: childHitTest-qzLsGqo */
        void mo4113childHitTestqzLsGqo(@k LayoutNode layoutNode, long j11, @k HitTestResult hitTestResult, int i11, boolean z11);

        /* renamed from: entityType-OLwlOKw */
        int mo4114entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@k Modifier.Node node);

        boolean shouldHitTestChildren(@k LayoutNode layoutNode);
    }

    public NodeCoordinator(@k LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z11) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z11);
        }
        fromParentRect(mutableRect, z11);
    }

    /* renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m4086ancestorToLocalS_NoaFU(NodeCoordinator nodeCoordinator, long j11, boolean z11) {
        if (nodeCoordinator == this) {
            return j11;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        return (nodeCoordinator2 == null || g0.g(nodeCoordinator, nodeCoordinator2)) ? m4101fromParentPosition8S9VItk(j11, z11) : m4101fromParentPosition8S9VItk(nodeCoordinator2.m4086ancestorToLocalS_NoaFU(nodeCoordinator, j11, z11), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node m4104headH91voCI = m4104headH91voCI(NodeKind.m4118constructorimpl(4));
        if (m4104headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m4047draweZhPAX0$ui_release(canvas, IntSizeKt.m5298toSizeozmzZPI(mo3865getSizeYbymL2g()), this, m4104headH91voCI, graphicsLayer);
        }
    }

    /* renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m4087fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return nodeCoordinator.m4101fromParentPosition8S9VItk(j11, z11);
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z11) {
        float m5243getXimpl = IntOffset.m5243getXimpl(mo4052getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m5243getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m5243getXimpl);
        float m5244getYimpl = IntOffset.m5244getYimpl(mo4052getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m5244getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m5244getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z11) {
                mutableRect.intersect(0.0f, 0.0f, (int) (mo3865getSizeYbymL2g() >> 32), (int) (mo3865getSizeYbymL2g() & 4294967295L));
                mutableRect.isEmpty();
            }
        }
    }

    private final p<Canvas, GraphicsLayer, g2> getDrawBlock() {
        p pVar = this._drawBlock;
        if (pVar != null) {
            return pVar;
        }
        final x00.a<g2> aVar = new x00.a<g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
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
                Canvas canvas;
                GraphicsLayer graphicsLayer;
                NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                canvas = nodeCoordinator.drawBlockCanvas;
                g0.m(canvas);
                graphicsLayer = NodeCoordinator.this.drawBlockParentLayer;
                nodeCoordinator.drawContainedDrawModifiers(canvas, graphicsLayer);
            }
        };
        p<Canvas, GraphicsLayer, g2> pVar2 = new p<Canvas, GraphicsLayer, g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                invoke2(canvas, graphicsLayer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Canvas canvas, GraphicsLayer graphicsLayer) {
                OwnerSnapshotObserver snapshotObserver;
                x00.l lVar;
                if (!NodeCoordinator.this.getLayoutNode().isPlaced()) {
                    NodeCoordinator.this.lastLayerDrawingWasSkipped = true;
                    return;
                }
                NodeCoordinator.this.drawBlockCanvas = canvas;
                NodeCoordinator.this.drawBlockParentLayer = graphicsLayer;
                snapshotObserver = NodeCoordinator.this.getSnapshotObserver();
                NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                lVar = NodeCoordinator.onCommitAffectingLayer;
                snapshotObserver.observeReads$ui_release(nodeCoordinator, lVar, aVar);
                NodeCoordinator.this.lastLayerDrawingWasSkipped = false;
            }
        };
        this._drawBlock = pVar2;
        return pVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m4088hasNodeH91voCI(int i11) {
        Modifier.Node headNode = headNode(NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(i11));
        return headNode != null && DelegatableNodeKt.m3977has64DMado(headNode, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z11) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (!z11) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (tail = nodeCoordinator2.getTail()) == null) {
            return null;
        }
        return tail.getChild$ui_release();
    }

    /* renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m4089hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j11, HitTestResult hitTestResult, int i11, boolean z11) {
        long DistanceAndFlags;
        Modifier.Node m4116nextUntilhw7D004;
        if (node == null) {
            mo4023hitTestChildqzLsGqo(hitTestSource, j11, hitTestResult, i11, z11);
            return;
        }
        int i12 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(-1.0f, z11, false);
        mutableLongList.add(DistanceAndFlags);
        m4116nextUntilhw7D004 = NodeCoordinatorKt.m4116nextUntilhw7D004(node, hitTestSource.mo4114entityTypeOLwlOKw(), NodeKind.m4118constructorimpl(2));
        m4089hit5ShdDok(m4116nextUntilhw7D004, hitTestSource, j11, hitTestResult, i11, z11);
        hitTestResult.hitDepth = i12;
    }

    /* renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m4090hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j11, HitTestResult hitTestResult, int i11, boolean z11, float f11) {
        long DistanceAndFlags;
        Modifier.Node m4116nextUntilhw7D004;
        if (node == null) {
            mo4023hitTestChildqzLsGqo(hitTestSource, j11, hitTestResult, i11, z11);
            return;
        }
        int i12 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
        DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f11, z11, false);
        mutableLongList.add(DistanceAndFlags);
        m4116nextUntilhw7D004 = NodeCoordinatorKt.m4116nextUntilhw7D004(node, hitTestSource.mo4114entityTypeOLwlOKw(), NodeKind.m4118constructorimpl(2));
        m4093outOfBoundsHit8NAm7pk(m4116nextUntilhw7D004, hitTestSource, j11, hitTestResult, i11, z11, f11, true);
        hitTestResult.hitDepth = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m4091isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j11, int i11) {
        if (node == 0) {
            return false;
        }
        PointerType.Companion companion = PointerType.Companion;
        if (!PointerType.m3803equalsimpl0(i11, companion.m3809getStylusT8wyACA()) && !PointerType.m3803equalsimpl0(i11, companion.m3807getEraserT8wyACA())) {
            return false;
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long mo1175getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo1175getTouchBoundsExpansionRZrCHBk();
                int i12 = (int) (j11 >> 32);
                if (Float.intBitsToFloat(i12) >= (-TouchBoundsExpansion.m4198computeLeftimpl$ui_release(mo1175getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) && Float.intBitsToFloat(i12) < getMeasuredWidth() + TouchBoundsExpansion.m4199computeRightimpl$ui_release(mo1175getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) {
                    int i13 = (int) (j11 & 4294967295L);
                    if (Float.intBitsToFloat(i13) >= (-TouchBoundsExpansion.m4206getTopimpl(mo1175getTouchBoundsExpansionRZrCHBk)) && Float.intBitsToFloat(i13) < getMeasuredHeight() + TouchBoundsExpansion.m4203getBottomimpl(mo1175getTouchBoundsExpansionRZrCHBk)) {
                        return true;
                    }
                }
                return false;
            }
            if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                int i14 = 0;
                node = node;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        i14++;
                        if (i14 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    node = node;
                }
                if (i14 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        return false;
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m4092offsetFromEdgeMKHz9U(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float max = Math.max(0.0f, intBitsToFloat < 0.0f ? -intBitsToFloat : intBitsToFloat - getMeasuredWidth());
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j11 & 4294967295L)) < 0.0f ? -r6 : r6 - getMeasuredHeight())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m4093outOfBoundsHit8NAm7pk(final Modifier.Node node, final HitTestSource hitTestSource, final long j11, final HitTestResult hitTestResult, final int i11, final boolean z11, final float f11, final boolean z12) {
        if (node == null) {
            mo4023hitTestChildqzLsGqo(hitTestSource, j11, hitTestResult, i11, z11);
            return;
        }
        if (m4091isInExpandedTouchBoundsThDn1k(node, j11, i11)) {
            hitTestResult.hitExpandedTouchBounds(node, z11, new x00.a<g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    Modifier.Node m4116nextUntilhw7D004;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    m4116nextUntilhw7D004 = NodeCoordinatorKt.m4116nextUntilhw7D004(node, hitTestSource.mo4114entityTypeOLwlOKw(), NodeKind.m4118constructorimpl(2));
                    nodeCoordinator.m4093outOfBoundsHit8NAm7pk(m4116nextUntilhw7D004, hitTestSource, j11, hitTestResult, i11, z11, f11, z12);
                }
            });
        } else if (z12) {
            m4090hitNearFh5PU_I(node, hitTestSource, j11, hitTestResult, i11, z11, f11);
        } else {
            m4095speculativeHitFh5PU_I(node, hitTestSource, j11, hitTestResult, i11, z11, f11);
        }
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m4094placeSelfMLgxB_4(long j11, float f11, x00.l<? super GraphicsLayerScope, g2> lVar, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            if (!(lVar == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != graphicsLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = graphicsLayer;
            }
            if (this.layer == null) {
                OwnedLayer createLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, graphicsLayer, false, 8, null);
                createLayer$default.mo4174resizeozmzZPI(m3916getMeasuredSizeYbymL2g());
                createLayer$default.mo4173movegyyYBs(j11);
                this.layer = createLayer$default;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, lVar, false, 2, null);
        }
        if (!IntOffset.m5242equalsimpl0(mo4052getPositionnOccac(), j11)) {
            m4109setPositiongyyYBs(j11);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4173movegyyYBs(j11);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f11;
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z11, z12);
    }

    /* renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m4095speculativeHitFh5PU_I(final Modifier.Node node, final HitTestSource hitTestSource, final long j11, final HitTestResult hitTestResult, final int i11, final boolean z11, final float f11) {
        Modifier.Node m4116nextUntilhw7D004;
        if (node == null) {
            mo4023hitTestChildqzLsGqo(hitTestSource, j11, hitTestResult, i11, z11);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f11, z11, new x00.a<g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    Modifier.Node m4116nextUntilhw7D0042;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    m4116nextUntilhw7D0042 = NodeCoordinatorKt.m4116nextUntilhw7D004(node, hitTestSource.mo4114entityTypeOLwlOKw(), NodeKind.m4118constructorimpl(2));
                    nodeCoordinator.m4093outOfBoundsHit8NAm7pk(m4116nextUntilhw7D0042, hitTestSource, j11, hitTestResult, i11, z11, f11, false);
                }
            });
        } else {
            m4116nextUntilhw7D004 = NodeCoordinatorKt.m4116nextUntilhw7D004(node, hitTestSource.mo4114entityTypeOLwlOKw(), NodeKind.m4118constructorimpl(2));
            m4093outOfBoundsHit8NAm7pk(m4116nextUntilhw7D004, hitTestSource, j11, hitTestResult, i11, z11, f11, false);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        g0.n(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m4096toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return nodeCoordinator.m4110toParentPosition8S9VItk(j11, z11);
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m4097transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (g0.g(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        g0.m(nodeCoordinator2);
        nodeCoordinator2.m4097transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m5242equalsimpl0(mo4052getPositionnOccac(), IntOffset.Companion.m5254getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m2748resetimpl(fArr2);
            Matrix.m2761translateimpl$default(fArr2, -IntOffset.m5243getXimpl(mo4052getPositionnOccac()), -IntOffset.m5244getYimpl(mo4052getPositionnOccac()), 0.0f, 4, null);
            Matrix.m2758timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo4170inverseTransform58bKbWc(fArr);
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m4098transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!g0.g(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4175transform58bKbWc(fArr);
            }
            if (!IntOffset.m5242equalsimpl0(nodeCoordinator2.mo4052getPositionnOccac(), IntOffset.Companion.m5254getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m2748resetimpl(fArr2);
                Matrix.m2761translateimpl$default(fArr2, IntOffset.m5243getXimpl(r1), IntOffset.m5244getYimpl(r1), 0.0f, 4, null);
                Matrix.m2758timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            g0.m(nodeCoordinator2);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, x00.l lVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        nodeCoordinator.updateLayerBlock(lVar, z11);
    }

    private final boolean updateLayerParameters(boolean z11) {
        Owner owner$ui_release;
        if (this.explicitLayer != null) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (!(this.layerBlock == null)) {
                InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
            }
            return false;
        }
        final x00.l<? super GraphicsLayerScope, g2> lVar = this.layerBlock;
        if (lVar == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.setLayoutDirection$ui_release(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.m2821setSizeuvyYCjk(IntSizeKt.m5298toSizeozmzZPI(mo3865getSizeYbymL2g()));
        getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new x00.a<g2>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3;
                x00.l<GraphicsLayerScope, g2> lVar2 = lVar;
                reusableGraphicsLayerScope2 = NodeCoordinator.graphicsLayerScope;
                lVar2.invoke(reusableGraphicsLayerScope2);
                reusableGraphicsLayerScope3 = NodeCoordinator.graphicsLayerScope;
                reusableGraphicsLayerScope3.updateOutline$ui_release();
            }
        });
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.copyFrom(layerPositionalProperties);
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
        boolean z12 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean hasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
        boolean z13 = !hasSameValuesAs;
        if (z11 && ((!hasSameValuesAs || z12 != this.isClipping) && (owner$ui_release = getLayoutNode().getOwner$ui_release()) != null)) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
        return z13;
    }

    public static /* synthetic */ boolean updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return nodeCoordinator.updateLayerParameters(z11);
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m4099calculateMinimumTouchTargetPaddingE7KxVPU(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - getMeasuredWidth();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - getMeasuredHeight();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return Size.m2328constructorimpl((Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m4100distanceInMinimumTouchTargettz77jQw(long j11, long j12) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (j12 >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (j12 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long m4099calculateMinimumTouchTargetPaddingE7KxVPU = m4099calculateMinimumTouchTargetPaddingE7KxVPU(j12);
        float intBitsToFloat = Float.intBitsToFloat((int) (m4099calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m4099calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L));
        long m4092offsetFromEdgeMKHz9U = m4092offsetFromEdgeMKHz9U(j11);
        if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (m4092offsetFromEdgeMKHz9U >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (m4092offsetFromEdgeMKHz9U & 4294967295L)) <= intBitsToFloat2) {
            return Offset.m2267getDistanceSquaredimpl(m4092offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@k Canvas canvas, @l GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float m5243getXimpl = IntOffset.m5243getXimpl(mo4052getPositionnOccac());
        float m5244getYimpl = IntOffset.m5244getYimpl(mo4052getPositionnOccac());
        canvas.translate(m5243getXimpl, m5244getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-m5243getXimpl, -m5244getYimpl);
    }

    public final void drawBorder(@k Canvas canvas, @k Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (m3916getMeasuredSizeYbymL2g() >> 32)) - 0.5f, ((int) (m3916getMeasuredSizeYbymL2g() & 4294967295L)) - 0.5f, paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    @k
    public final NodeCoordinator findCommonAncestor$ui_release(@k NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int m4118constructorimpl = NodeKind.m4118constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0 && parent$ui_release == tail) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            g0.m(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            g0.m(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != nodeCoordinator.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui_release();
            }
            return nodeCoordinator;
        }
        return this;
    }

    /* renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m4101fromParentPosition8S9VItk(long j11, boolean z11) {
        if (z11 || !isPlacedUnderMotionFrameOfReference()) {
            j11 = IntOffsetKt.m5256minusNvtHpc(j11, mo4052getPositionnOccac());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo4172mapOffset8S9VItk(j11, true) : j11;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @k
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui_release() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui_release() {
        return this.forcePlaceWithLookaheadOffset;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m4102getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m3917getMeasurementConstraintsmsEJaDk();
    }

    @l
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @l
    public final x00.l<GraphicsLayerScope, g2> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @k
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @k
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @l
    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @k
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError);
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m4103getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo378toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo4041getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @l
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui_release().m4079hasH91voCI$ui_release(NodeKind.m4118constructorimpl(64))) {
            return null;
        }
        getTail();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((NodeKind.m4118constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                int m4118constructorimpl = NodeKind.m4118constructorimpl(64);
                MutableVector mutableVector = null;
                DelegatingNode delegatingNode = tail$ui_release;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof ParentDataModifierNode) {
                        objectRef.element = ((ParentDataModifierNode) delegatingNode).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
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
        return objectRef.element;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo4052getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @k
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? w1.k() : linkedHashSet;
    }

    @k
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo3865getSizeYbymL2g() {
        return m3916getMeasuredSizeYbymL2g();
    }

    @k
    public abstract Modifier.Node getTail();

    @l
    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    @l
    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @l
    /* renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m4104headH91voCI(int i11) {
        boolean m4127getIncludeSelfInTraversalH91voCI = NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(i11);
        Modifier.Node tail = getTail();
        if (!m4127getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return null;
        }
        for (Modifier.Node headNode = headNode(m4127getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i11) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i11) != 0) {
                return headNode;
            }
            if (headNode == tail) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m4105hitTestqzLsGqo(@k HitTestSource hitTestSource, long j11, @k HitTestResult hitTestResult, int i11, boolean z11) {
        boolean z12;
        Modifier.Node m4104headH91voCI = m4104headH91voCI(hitTestSource.mo4114entityTypeOLwlOKw());
        boolean z13 = false;
        if (!m4112withinLayerBoundsk4lQ0M(j11)) {
            if (PointerType.m3803equalsimpl0(i11, PointerType.Companion.m3810getTouchT8wyACA())) {
                float m4100distanceInMinimumTouchTargettz77jQw = m4100distanceInMinimumTouchTargettz77jQw(j11, m4103getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(m4100distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(m4100distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m4090hitNearFh5PU_I(m4104headH91voCI, hitTestSource, j11, hitTestResult, i11, false, m4100distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (m4104headH91voCI == null) {
            mo4023hitTestChildqzLsGqo(hitTestSource, j11, hitTestResult, i11, z11);
            return;
        }
        if (m4106isPointerInBoundsk4lQ0M(j11)) {
            m4089hit5ShdDok(m4104headH91voCI, hitTestSource, j11, hitTestResult, i11, z11);
            return;
        }
        float m4100distanceInMinimumTouchTargettz77jQw2 = !PointerType.m3803equalsimpl0(i11, PointerType.Companion.m3810getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m4100distanceInMinimumTouchTargettz77jQw(j11, m4103getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(m4100distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            z12 = z11;
            if (hitTestResult.isHitInMinimumTouchTargetBetter(m4100distanceInMinimumTouchTargettz77jQw2, z12)) {
                z13 = true;
            }
        } else {
            z12 = z11;
        }
        m4093outOfBoundsHit8NAm7pk(m4104headH91voCI, hitTestSource, j11, hitTestResult, i11, z12, m4100distanceInMinimumTouchTargettz77jQw2, z13);
    }

    /* renamed from: hitTestChild-qzLsGqo */
    public void mo4023hitTestChildqzLsGqo(@k HitTestSource hitTestSource, long j11, @k HitTestResult hitTestResult, int i11, boolean z11) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m4105hitTestqzLsGqo(hitTestSource, m4087fromParentPosition8S9VItk$default(nodeCoordinator, j11, false, 2, null), hitTestResult, i11, z11);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m4106isPointerInBoundsk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < ((float) getMeasuredWidth()) && intBitsToFloat2 < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @k
    public Rect localBoundingBoxOf(@k LayoutCoordinates layoutCoordinates, boolean z11) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (layoutCoordinates.mo3865getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (layoutCoordinates.mo3865getSizeYbymL2g() & 4294967295L));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != findCommonAncestor$ui_release) {
            boolean z12 = z11;
            rectInParent$ui_release$default(nodeCoordinator, rectCache, z12, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            g0.m(nodeCoordinator);
            z11 = z12;
        }
        ancestorToLocal(findCommonAncestor$ui_release, rectCache, z11);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo3866localPositionOfR5De75A(@k LayoutCoordinates layoutCoordinates, long j11) {
        return mo3867localPositionOfS_NoaFU(layoutCoordinates, j11, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo3867localPositionOfS_NoaFU(@k LayoutCoordinates layoutCoordinates, long j11, boolean z11) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates) layoutCoordinates).getCoordinator().onCoordinatesUsed$ui_release();
            return Offset.m2260constructorimpl(layoutCoordinates.mo3867localPositionOfS_NoaFU(this, Offset.m2260constructorimpl(j11 ^ (-9223372034707292160L)), z11) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != findCommonAncestor$ui_release) {
            j11 = coordinator.m4110toParentPosition8S9VItk(j11, z11);
            coordinator = coordinator.wrappedBy;
            g0.m(coordinator);
        }
        return m4086ancestorToLocalS_NoaFU(findCommonAncestor$ui_release, j11, z11);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo3868localToRootMKHz9U(long j11) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        long j12 = j11;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            j12 = m4096toParentPosition8S9VItk$default(nodeCoordinator, j12, false, 2, null);
        }
        return j12;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo3869localToScreenMKHz9U(long j11) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo3812localToScreenMKHz9U(mo3868localToRootMKHz9U(j11));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo3870localToWindowMKHz9U(long j11) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo4177calculatePositionInWindowMKHz9U(mo3868localToRootMKHz9U(j11));
    }

    public final void onAttach() {
        if (this.layer != null || this.layerBlock == null) {
            return;
        }
        OwnedLayer createLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, this.explicitLayer, false, 8, null);
        createLayer$default.mo4174resizeozmzZPI(m3916getMeasuredSizeYbymL2g());
        createLayer$default.mo4173movegyyYBs(mo4052getPositionnOccac());
        createLayer$default.invalidate();
        this.layer = createLayer$default;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    public final void onDetach() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
        }
        this.layer = null;
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public void onMeasureResultChanged(int i11, int i12) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo4174resizeozmzZPI(IntSize.m5281constructorimpl((i11 << 32) | (i12 & 4294967295L)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m3919setMeasuredSizeozmzZPI(IntSize.m5281constructorimpl((i12 & 4294967295L) | (i11 << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(4);
        boolean m4127getIncludeSelfInTraversalH91voCI = NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(m4118constructorimpl);
        Modifier.Node tail = getTail();
        if (m4127getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m4127getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof DrawModifierNode) {
                            ((DrawModifierNode) delegatingNode).onMeasureResultChanged();
                        } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i13 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                    i13++;
                                    if (i13 == 1) {
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
                            if (i13 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m4088hasNodeH91voCI(NodeKind.m4118constructorimpl(128))) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int m4118constructorimpl = NodeKind.m4118constructorimpl(128);
                boolean m4127getIncludeSelfInTraversalH91voCI = NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(m4118constructorimpl);
                if (m4127getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail();
                } else {
                    parent$ui_release = getTail().getParent$ui_release();
                    if (parent$ui_release == null) {
                        g2 g2Var = g2.f100423a;
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    }
                }
                for (Modifier.Node headNode = headNode(m4127getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                    if ((headNode.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNode = headNode;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) delegatingNode).mo365onRemeasuredozmzZPI(m3916getMeasuredSizeYbymL2g());
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
                    if (headNode == parent$ui_release) {
                        break;
                    }
                }
                g2 g2Var2 = g2.f100423a;
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            } catch (Throwable th2) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th2;
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
    public final void onPlaced() {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(128);
        boolean m4127getIncludeSelfInTraversalH91voCI = NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(m4118constructorimpl);
        Modifier.Node tail = getTail();
        if (!m4127getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m4127getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                DelegatingNode delegatingNode = headNode;
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).onPlaced(this);
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

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
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
    public final void onUnplaced() {
        if (m4088hasNodeH91voCI(NodeKind.m4118constructorimpl(1048576))) {
            int m4118constructorimpl = NodeKind.m4118constructorimpl(1048576);
            boolean m4127getIncludeSelfInTraversalH91voCI = NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(m4118constructorimpl);
            Modifier.Node tail = getTail();
            if (!m4127getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
                return;
            }
            for (Modifier.Node headNode = headNode(m4127getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof OnUnplacedModifierNode) {
                            ((OnUnplacedModifierNode) delegatingNode).onUnplaced();
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
    }

    public void performDraw(@k Canvas canvas, @l GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    @k
    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m4107performingMeasureK40F9xA(long j11, @k x00.a<? extends Placeable> aVar) {
        m3920setMeasurementConstraintsBRTryo0(j11);
        return aVar.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
        if (!this.forcePlaceWithLookaheadOffset) {
            m4094placeSelfMLgxB_4(j11, f11, lVar, null);
            return;
        }
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        m4094placeSelfMLgxB_4(lookaheadDelegate.mo4052getPositionnOccac(), f11, lVar, null);
    }

    /* renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m4108placeSelfApparentToRealOffsetMLgxB_4(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar, @l GraphicsLayer graphicsLayer) {
        m4094placeSelfMLgxB_4(IntOffset.m5247plusqkQi6aY(j11, m3915getApparentToRealOffsetnOccac()), f11, lVar, graphicsLayer);
    }

    public final void rectInParent$ui_release(@k MutableRect mutableRect, boolean z11, boolean z12) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z12) {
                    long m4103getMinimumTouchTargetSizeNHjbRc = m4103getMinimumTouchTargetSizeNHjbRc();
                    float intBitsToFloat = Float.intBitsToFloat((int) (m4103getMinimumTouchTargetSizeNHjbRc >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (m4103getMinimumTouchTargetSizeNHjbRc & 4294967295L)) / 2.0f;
                    mutableRect.intersect(-intBitsToFloat, -intBitsToFloat2, ((int) (mo3865getSizeYbymL2g() >> 32)) + intBitsToFloat, ((int) (4294967295L & mo3865getSizeYbymL2g())) + intBitsToFloat2);
                } else if (z11) {
                    mutableRect.intersect(0.0f, 0.0f, (int) (mo3865getSizeYbymL2g() >> 32), (int) (4294967295L & mo3865getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float m5243getXimpl = IntOffset.m5243getXimpl(mo4052getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + m5243getXimpl);
        mutableRect.setRight(mutableRect.getRight() + m5243getXimpl);
        float m5244getYimpl = IntOffset.m5244getYimpl(mo4052getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + m5244getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + m5244getYimpl);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo3918placeAtf8xVGno(mo4052getPositionnOccac(), this.zIndex, graphicsLayer);
        } else {
            mo3858placeAtf8xVGno(mo4052getPositionnOccac(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo3871screenToLocalMKHz9U(long j11) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo3866localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo3813screenToLocalMKHz9U(j11));
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean z11) {
        this.forceMeasureWithLookaheadConstraints = z11;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean z11) {
        this.forcePlaceWithLookaheadOffset = z11;
    }

    public abstract void setLookaheadDelegate(@l LookaheadDelegate lookaheadDelegate);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.isNotEmpty() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setMeasureResult$ui_release(@m80.k androidx.compose.ui.layout.MeasureResult r4) {
        /*
            r3 = this;
            androidx.compose.ui.layout.MeasureResult r0 = r3._measureResult
            if (r4 == r0) goto L8c
            r3._measureResult = r4
            if (r0 == 0) goto L1c
            int r1 = r4.getWidth()
            int r2 = r0.getWidth()
            if (r1 != r2) goto L1c
            int r1 = r4.getHeight()
            int r0 = r0.getHeight()
            if (r1 == r0) goto L27
        L1c:
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r3.onMeasureResultChanged(r0, r1)
        L27:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 == 0) goto L34
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r0.isNotEmpty()
            if (r0 != 0) goto L3e
        L34:
            java.util.Map r0 = r4.getAlignmentLines()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
        L3e:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            java.util.Map r1 = r4.getAlignmentLines()
            boolean r0 = androidx.compose.ui.node.NodeCoordinatorKt.access$compareEquals(r0, r1)
            if (r0 != 0) goto L8c
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r3.getAlignmentLinesOwner()
            androidx.compose.ui.node.AlignmentLines r0 = r0.getAlignmentLines()
            r0.onAlignmentsChanged()
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 != 0) goto L5f
            androidx.collection.MutableObjectIntMap r0 = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf()
            r3.oldAlignmentLines = r0
        L5f:
            r0.clear()
            java.util.Map r4 = r4.getAlignmentLines()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.set(r2, r1)
            goto L6e
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.setMeasureResult$ui_release(androidx.compose.ui.layout.MeasureResult):void");
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m4109setPositiongyyYBs(long j11) {
        this.position = j11;
    }

    public final void setWrapped$ui_release(@l NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(@l NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f11) {
        this.zIndex = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node headNode = headNode(NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(NodeKind.m4118constructorimpl(16)));
        if (headNode != null && headNode.isAttached()) {
            int m4118constructorimpl = NodeKind.m4118constructorimpl(16);
            if (!headNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = headNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = node;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) delegatingNode).sharePointerInputWithSiblings()) {
                                    return true;
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
                    node = node.getChild$ui_release();
                }
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m4110toParentPosition8S9VItk(long j11, boolean z11) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j11 = ownedLayer.mo4172mapOffset8S9VItk(j11, false);
        }
        return (z11 || !isPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m5258plusNvtHpc(j11, mo4052getPositionnOccac()) : j11;
    }

    @k
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m4099calculateMinimumTouchTargetPaddingE7KxVPU = m4099calculateMinimumTouchTargetPaddingE7KxVPU(m4103getMinimumTouchTargetSizeNHjbRc());
        int i11 = (int) (m4099calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i11));
        int i12 = (int) (m4099calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L);
        rectCache.setTop(-Float.intBitsToFloat(i12));
        rectCache.setRight(getMeasuredWidth() + Float.intBitsToFloat(i11));
        rectCache.setBottom(getMeasuredHeight() + Float.intBitsToFloat(i12));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            g0.m(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo3872transformFromEL8BTi8(@k LayoutCoordinates layoutCoordinates, @k float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m2748resetimpl(fArr);
        coordinator.m4098transformToAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
        m4097transformFromAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo3873transformToScreen58bKbWc(@k float[] fArr) {
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m4098transformToAncestorEL8BTi8(coordinator, fArr);
        if (requireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) requireOwner).mo3661localToScreen58bKbWc(fArr);
            return;
        }
        long positionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((9223372034707292159L & positionOnScreen) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m2760translateimpl(fArr, Float.intBitsToFloat((int) (positionOnScreen >> 32)), Float.intBitsToFloat((int) (positionOnScreen & 4294967295L)), 0.0f);
        }
    }

    public final void updateLayerBlock(@l x00.l<? super GraphicsLayerScope, g2> lVar, boolean z11) {
        Owner owner$ui_release;
        if (!(lVar == null || this.explicitLayer == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z12 = (!z11 && this.layerBlock == lVar && g0.g(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.isAttached() || lVar == null) {
            this.layerBlock = null;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && layoutNode.isPlaced() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = lVar;
        if (this.layer != null) {
            if (z12 && updateLayerParameters$default(this, false, 1, null)) {
                LayoutNodeKt.requireOwner(layoutNode).getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
                return;
            }
            return;
        }
        OwnedLayer createLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, layoutNode.getForceUseOldLayers(), 4, null);
        createLayer$default.mo4174resizeozmzZPI(m3916getMeasuredSizeYbymL2g());
        createLayer$default.mo4173movegyyYBs(mo4052getPositionnOccac());
        this.layer = createLayer$default;
        updateLayerParameters$default(this, false, 1, null);
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public final void visitNodes(int i11, boolean z11, @k x00.l<? super Modifier.Node, g2> lVar) {
        Modifier.Node tail = getTail();
        if (!z11 && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(z11); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i11) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i11) != 0) {
                lVar.invoke(headNode);
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m4111visitNodesaLcG6gQ(int i11, x00.l<? super T, g2> lVar) {
        boolean m4127getIncludeSelfInTraversalH91voCI = NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(i11);
        Modifier.Node tail = getTail();
        if (!m4127getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m4127getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i11) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i11) != 0) {
                for (Modifier.Node node = headNode; node != null; node = DelegatableNodeKt.pop(null)) {
                    g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                    lVar.invoke(node);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo3874windowToLocalMKHz9U(long j11) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo3866localPositionOfR5De75A(findRootCoordinates, Offset.m2272minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo4176calculateLocalPositionMKHz9U(j11), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
    }

    public final void withPositionTranslation(@k Canvas canvas, @k x00.l<? super Canvas, g2> lVar) {
        float m5243getXimpl = IntOffset.m5243getXimpl(mo4052getPositionnOccac());
        float m5244getYimpl = IntOffset.m5244getYimpl(mo4052getPositionnOccac());
        canvas.translate(m5243getXimpl, m5244getYimpl);
        lVar.invoke(canvas);
        canvas.translate(-m5243getXimpl, -m5244getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m4112withinLayerBoundsk4lQ0M(long j11) {
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j11 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo4171isInLayerk4lQ0M(j11);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo3918placeAtf8xVGno(long j11, float f11, @k GraphicsLayer graphicsLayer) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            g0.m(lookaheadDelegate);
            m4094placeSelfMLgxB_4(lookaheadDelegate.mo4052getPositionnOccac(), f11, null, graphicsLayer);
            return;
        }
        m4094placeSelfMLgxB_4(j11, f11, null, graphicsLayer);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @k
    public LayoutCoordinates getCoordinates() {
        return this;
    }
}
