package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 11 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 12 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 13 ObjectList.kt\nandroidx/collection/ObjectList\n+ 14 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,534:1\n451#1:638\n452#1:659\n454#1:705\n440#1:780\n441#1:856\n442#1:863\n443#1,2:910\n445#1:958\n446#1:965\n451#1:967\n452#1:988\n454#1:1034\n440#1:1036\n441#1:1112\n442#1:1119\n443#1,2:1166\n445#1:1214\n446#1:1221\n451#1:1223\n452#1:1244\n454#1:1290\n440#1:1292\n441#1:1368\n442#1:1375\n443#1,2:1422\n445#1:1470\n446#1:1477\n68#2,5:535\n73#2,8:543\n52#2,4:551\n56#2,4:558\n1#3:540\n1#3:555\n1#3:1754\n641#4,2:541\n641#4,2:556\n119#5:562\n131#5:637\n131#5:706\n131#5:779\n143#5:966\n143#5:1035\n135#5:1222\n135#5:1291\n119#5:1727\n131#5:1728\n119#5:1749\n247#6,5:563\n90#6:568\n91#6,8:574\n437#6,6:582\n447#6,2:589\n449#6,8:594\n457#6,9:605\n466#6,8:617\n100#6,7:625\n251#6:639\n90#6:640\n91#6,8:646\n437#6,5:654\n442#6:660\n447#6,2:662\n449#6,8:667\n457#6,9:678\n466#6,8:690\n100#6,7:698\n277#6:707\n247#6,5:708\n90#6:713\n91#6,8:719\n437#6,5:727\n278#6:732\n442#6:733\n447#6,2:735\n449#6,8:740\n457#6,9:751\n466#6,8:763\n100#6,7:771\n280#6:778\n268#6,2:781\n247#6,5:783\n90#6:788\n91#6,8:794\n437#6,5:802\n270#6,3:807\n442#6:810\n447#6,2:812\n449#6,8:817\n457#6,9:828\n466#6,8:840\n100#6,7:848\n273#6:855\n437#6,12:864\n449#6,8:879\n457#6,9:890\n466#6,8:902\n437#6,12:912\n449#6,8:927\n457#6,9:938\n466#6,8:950\n251#6:968\n90#6:969\n91#6,8:975\n437#6,5:983\n442#6:989\n447#6,2:991\n449#6,8:996\n457#6,9:1007\n466#6,8:1019\n100#6,7:1027\n268#6,2:1037\n247#6,5:1039\n90#6:1044\n91#6,8:1050\n437#6,5:1058\n270#6,3:1063\n442#6:1066\n447#6,2:1068\n449#6,8:1073\n457#6,9:1084\n466#6,8:1096\n100#6,7:1104\n273#6:1111\n437#6,12:1120\n449#6,8:1135\n457#6,9:1146\n466#6,8:1158\n437#6,12:1168\n449#6,8:1183\n457#6,9:1194\n466#6,8:1206\n251#6:1224\n90#6:1225\n91#6,8:1231\n437#6,5:1239\n442#6:1245\n447#6,2:1247\n449#6,8:1252\n457#6,9:1263\n466#6,8:1275\n100#6,7:1283\n268#6,2:1293\n247#6,5:1295\n90#6:1300\n91#6,8:1306\n437#6,5:1314\n270#6,3:1319\n442#6:1322\n447#6,2:1324\n449#6,8:1329\n457#6,9:1340\n466#6,8:1352\n100#6,7:1360\n273#6:1367\n437#6,12:1376\n449#6,8:1391\n457#6,9:1402\n466#6,8:1414\n437#6,12:1424\n449#6,8:1439\n457#6,9:1450\n466#6,8:1462\n268#6,2:1478\n247#6,5:1480\n90#6:1485\n91#6,8:1491\n437#6,5:1499\n270#6,3:1504\n442#6:1507\n447#6,2:1509\n449#6,8:1514\n457#6,9:1525\n466#6,8:1537\n100#6,7:1545\n273#6:1552\n437#6,6:1559\n447#6,2:1566\n449#6,8:1571\n457#6,9:1582\n466#6,8:1594\n437#6,6:1602\n447#6,2:1609\n449#6,8:1614\n457#6,9:1625\n466#6,8:1637\n251#6:1651\n90#6:1652\n91#6,8:1658\n437#6,6:1666\n447#6,2:1673\n449#6,8:1678\n457#6,9:1689\n466#6,8:1701\n100#6,7:1709\n202#6,8:1730\n210#6,6:1743\n217#6,3:1751\n56#7,5:569\n56#7,5:641\n56#7,5:714\n56#7,5:789\n56#7,5:970\n56#7,5:1045\n56#7,5:1226\n56#7,5:1301\n56#7,5:1486\n56#7,5:1653\n102#7,5:1722\n56#7,5:1738\n246#8:588\n246#8:661\n246#8:734\n246#8:811\n246#8:990\n246#8:1067\n246#8:1246\n246#8:1323\n246#8:1508\n246#8:1565\n246#8:1608\n246#8:1672\n246#8:1750\n240#9,3:591\n243#9,3:614\n240#9,3:664\n243#9,3:687\n240#9,3:737\n243#9,3:760\n240#9,3:814\n243#9,3:837\n240#9,3:876\n243#9,3:899\n240#9,3:924\n243#9,3:947\n240#9,3:993\n243#9,3:1016\n240#9,3:1070\n243#9,3:1093\n240#9,3:1132\n243#9,3:1155\n240#9,3:1180\n243#9,3:1203\n240#9,3:1249\n243#9,3:1272\n240#9,3:1326\n243#9,3:1349\n240#9,3:1388\n243#9,3:1411\n240#9,3:1436\n243#9,3:1459\n240#9,3:1511\n243#9,3:1534\n240#9,3:1568\n243#9,3:1591\n240#9,3:1611\n243#9,3:1634\n240#9,3:1675\n243#9,3:1698\n1101#10:602\n1083#10,2:603\n1101#10:675\n1083#10,2:676\n1101#10:748\n1083#10,2:749\n1101#10:825\n1083#10,2:826\n1101#10:887\n1083#10,2:888\n1101#10:935\n1083#10,2:936\n1101#10:1004\n1083#10,2:1005\n1101#10:1081\n1083#10,2:1082\n1101#10:1143\n1083#10,2:1144\n1101#10:1191\n1083#10,2:1192\n1101#10:1260\n1083#10,2:1261\n1101#10:1337\n1083#10,2:1338\n1101#10:1399\n1083#10,2:1400\n1101#10:1447\n1083#10,2:1448\n1101#10:1522\n1083#10,2:1523\n1101#10:1579\n1083#10,2:1580\n1101#10:1622\n1083#10,2:1623\n1101#10:1686\n1083#10,2:1687\n26#11,5:632\n52#12,6:857\n34#12,6:959\n52#12,6:1113\n34#12,6:1215\n52#12,6:1369\n34#12,6:1471\n52#12,6:1553\n34#12,6:1645\n287#13,6:1716\n55#14:1729\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n342#1:638\n342#1:659\n342#1:705\n345#1:780\n345#1:856\n345#1:863\n345#1:910,2\n345#1:958\n345#1:965\n368#1:967\n368#1:988\n368#1:1034\n370#1:1036\n370#1:1112\n370#1:1119\n370#1:1166,2\n370#1:1214\n370#1:1221\n391#1:1223\n391#1:1244\n391#1:1290\n393#1:1292\n393#1:1368\n393#1:1375\n393#1:1422,2\n393#1:1470\n393#1:1477\n161#1:535,5\n161#1:543,8\n200#1:551,4\n200#1:558,4\n161#1:540\n200#1:555\n161#1:541,2\n200#1:556,2\n239#1:562\n342#1:637\n343#1:706\n346#1:779\n368#1:966\n371#1:1035\n391#1:1222\n394#1:1291\n491#1:1727\n491#1:1728\n492#1:1749\n239#1:563,5\n239#1:568\n239#1:574,8\n239#1:582,6\n239#1:589,2\n239#1:594,8\n239#1:605,9\n239#1:617,8\n239#1:625,7\n342#1:639\n342#1:640\n342#1:646,8\n342#1:654,5\n342#1:660\n342#1:662,2\n342#1:667,8\n342#1:678,9\n342#1:690,8\n342#1:698,7\n343#1:707\n343#1:708,5\n343#1:713\n343#1:719,8\n343#1:727,5\n343#1:732\n343#1:733\n343#1:735,2\n343#1:740,8\n343#1:751,9\n343#1:763,8\n343#1:771,7\n343#1:778\n345#1:781,2\n345#1:783,5\n345#1:788\n345#1:794,8\n345#1:802,5\n345#1:807,3\n345#1:810\n345#1:812,2\n345#1:817,8\n345#1:828,9\n345#1:840,8\n345#1:848,7\n345#1:855\n345#1:864,12\n345#1:879,8\n345#1:890,9\n345#1:902,8\n345#1:912,12\n345#1:927,8\n345#1:938,9\n345#1:950,8\n368#1:968\n368#1:969\n368#1:975,8\n368#1:983,5\n368#1:989\n368#1:991,2\n368#1:996,8\n368#1:1007,9\n368#1:1019,8\n368#1:1027,7\n370#1:1037,2\n370#1:1039,5\n370#1:1044\n370#1:1050,8\n370#1:1058,5\n370#1:1063,3\n370#1:1066\n370#1:1068,2\n370#1:1073,8\n370#1:1084,9\n370#1:1096,8\n370#1:1104,7\n370#1:1111\n370#1:1120,12\n370#1:1135,8\n370#1:1146,9\n370#1:1158,8\n370#1:1168,12\n370#1:1183,8\n370#1:1194,9\n370#1:1206,8\n391#1:1224\n391#1:1225\n391#1:1231,8\n391#1:1239,5\n391#1:1245\n391#1:1247,2\n391#1:1252,8\n391#1:1263,9\n391#1:1275,8\n391#1:1283,7\n393#1:1293,2\n393#1:1295,5\n393#1:1300\n393#1:1306,8\n393#1:1314,5\n393#1:1319,3\n393#1:1322\n393#1:1324,2\n393#1:1329,8\n393#1:1340,9\n393#1:1352,8\n393#1:1360,7\n393#1:1367\n393#1:1376,12\n393#1:1391,8\n393#1:1402,9\n393#1:1414,8\n393#1:1424,12\n393#1:1439,8\n393#1:1450,9\n393#1:1462,8\n440#1:1478,2\n440#1:1480,5\n440#1:1485\n440#1:1491,8\n440#1:1499,5\n440#1:1504,3\n440#1:1507\n440#1:1509,2\n440#1:1514,8\n440#1:1525,9\n440#1:1537,8\n440#1:1545,7\n440#1:1552\n442#1:1559,6\n442#1:1566,2\n442#1:1571,8\n442#1:1582,9\n442#1:1594,8\n444#1:1602,6\n444#1:1609,2\n444#1:1614,8\n444#1:1625,9\n444#1:1637,8\n451#1:1651\n451#1:1652\n451#1:1658,8\n451#1:1666,6\n451#1:1673,2\n451#1:1678,8\n451#1:1689,9\n451#1:1701,8\n451#1:1709,7\n491#1:1730,8\n491#1:1743,6\n491#1:1751,3\n239#1:569,5\n342#1:641,5\n343#1:714,5\n345#1:789,5\n368#1:970,5\n370#1:1045,5\n391#1:1226,5\n393#1:1301,5\n440#1:1486,5\n451#1:1653,5\n483#1:1722,5\n491#1:1738,5\n239#1:588\n342#1:661\n343#1:734\n345#1:811\n368#1:990\n370#1:1067\n391#1:1246\n393#1:1323\n440#1:1508\n442#1:1565\n444#1:1608\n451#1:1672\n492#1:1750\n239#1:591,3\n239#1:614,3\n342#1:664,3\n342#1:687,3\n343#1:737,3\n343#1:760,3\n345#1:814,3\n345#1:837,3\n345#1:876,3\n345#1:899,3\n345#1:924,3\n345#1:947,3\n368#1:993,3\n368#1:1016,3\n370#1:1070,3\n370#1:1093,3\n370#1:1132,3\n370#1:1155,3\n370#1:1180,3\n370#1:1203,3\n391#1:1249,3\n391#1:1272,3\n393#1:1326,3\n393#1:1349,3\n393#1:1388,3\n393#1:1411,3\n393#1:1436,3\n393#1:1459,3\n440#1:1511,3\n440#1:1534,3\n442#1:1568,3\n442#1:1591,3\n444#1:1611,3\n444#1:1634,3\n451#1:1675,3\n451#1:1698,3\n239#1:602\n239#1:603,2\n342#1:675\n342#1:676,2\n343#1:748\n343#1:749,2\n345#1:825\n345#1:826,2\n345#1:887\n345#1:888,2\n345#1:935\n345#1:936,2\n368#1:1004\n368#1:1005,2\n370#1:1081\n370#1:1082,2\n370#1:1143\n370#1:1144,2\n370#1:1191\n370#1:1192,2\n391#1:1260\n391#1:1261,2\n393#1:1337\n393#1:1338,2\n393#1:1399\n393#1:1400,2\n393#1:1447\n393#1:1448,2\n440#1:1522\n440#1:1523,2\n442#1:1579\n442#1:1580,2\n444#1:1622\n444#1:1623,2\n451#1:1686\n451#1:1687,2\n331#1:632,5\n345#1:857,6\n345#1:959,6\n370#1:1113,6\n370#1:1215,6\n393#1:1369,6\n393#1:1471,6\n441#1:1553,6\n445#1:1645,6\n477#1:1716,6\n491#1:1729\n*E\n"})
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;

    @l
    private FocusTargetNode activeFocusTargetNode;

    @k
    private final FocusInvalidationManager focusInvalidationManager;
    private boolean isFocusCaptured;

    @l
    private MutableLongSet keysCurrentlyDown;

    @k
    private final a<g2> onClearFocusForOwner;

    @k
    private final a<Rect> onFocusRectInterop;

    @k
    private final a<LayoutDirection> onLayoutDirection;

    @k
    private final x00.l<FocusDirection, Boolean> onMoveFocusInterop;

    @k
    private final p<FocusDirection, Rect, Boolean> onRequestFocusForOwner;

    @k
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.Companion.m2205getNeverLCbbffg(), null, null, 6, null);

    @k
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();

    @k
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return FocusOwnerImpl.this.getRootFocusNode$ui_release().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return FocusOwnerImpl.this.getRootFocusNode$ui_release();
        }
    };

    @k
    private final MutableObjectList<FocusListener> listeners = new MutableObjectList<>(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(@k x00.l<? super a<g2>, g2> lVar, @k p<? super FocusDirection, ? super Rect, Boolean> pVar, @k x00.l<? super FocusDirection, Boolean> lVar2, @k a<g2> aVar, @k a<Rect> aVar2, @k a<? extends LayoutDirection> aVar3) {
        this.onRequestFocusForOwner = pVar;
        this.onMoveFocusInterop = lVar2;
        this.onClearFocusForOwner = aVar;
        this.onFocusRectInterop = aVar2;
        this.onLayoutDirection = aVar3;
        this.focusInvalidationManager = new FocusInvalidationManager(lVar, new FocusOwnerImpl$focusInvalidationManager$1(this), new PropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, h10.o
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getRootState();
            }
        }, new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$3
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getActiveFocusTargetNode();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((FocusOwnerImpl) this.receiver).setActiveFocusTargetNode((FocusTargetNode) obj);
            }
        });
    }

    public static /* synthetic */ boolean clearFocus$default(FocusOwnerImpl focusOwnerImpl, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return focusOwnerImpl.clearFocus(z11, z12);
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOwnerFocusState() {
        if ((ComposeUiFlags.isTrackFocusEnabled && getActiveFocusTargetNode() == null) || this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024) | NodeKind.m4118constructorimpl(8192);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    if ((NodeKind.m4118constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                        return node2;
                    }
                    node2 = child$ui_release;
                }
            }
        }
        return node2;
    }

    /* renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m2173nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i11) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Object node = delegatableNode.getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node != null) {
                    if ((((Modifier.Node) node).getKindSet$ui_release() & i11) != 0) {
                        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                        return (T) node;
                    }
                    node = (T) ((Modifier.Node) node).getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? (T) null : (T) nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m2174traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i11, x00.l<? super T, g2> lVar, a<g2> aVar, x00.l<? super T, g2> lVar2) {
        int size;
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node = parent$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(node);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i12 = size - 1;
                lVar.invoke((Object) arrayList.get(size));
                if (i12 < 0) {
                    break;
                } else {
                    size = i12;
                }
            }
        }
        for (Modifier.Node node2 = delegatableNode.getNode(); node2 != null; node2 = DelegatableNodeKt.pop(null)) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            lVar.invoke(node2);
        }
        aVar.invoke();
        for (Modifier.Node node3 = delegatableNode.getNode(); node3 != null; node3 = DelegatableNodeKt.pop(null)) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            lVar2.invoke(node3);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                lVar2.invoke((Object) arrayList.get(i13));
            }
        }
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m2175validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        int m3589getTypeZmokQxo = KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m3581equalsimpl0(m3589getTypeZmokQxo, companion.m3585getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(m3588getKeyZmokQxo);
        } else if (KeyEventType.m3581equalsimpl0(m3589getTypeZmokQxo, companion.m3586getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(m3588getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(m3588getKeyZmokQxo);
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z11) {
        mo2167clearFocusI7lrPNg(z11, true, true, FocusDirection.Companion.m2158getExitdhqQ8s());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r11 != 3) goto L29;
     */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2167clearFocusI7lrPNg(boolean r8, boolean r9, boolean r10, int r11) {
        /*
            r7 = this;
            boolean r0 = androidx.compose.ui.ComposeUiFlags.isTrackFocusEnabled
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L31
            if (r8 != 0) goto L2c
            androidx.compose.ui.focus.FocusTargetNode r0 = r7.rootFocusNode
            androidx.compose.ui.focus.CustomDestinationResult r11 = androidx.compose.ui.focus.FocusTransactionsKt.m2190performCustomClearFocusMxy_nc0(r0, r11)
            int[] r0 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r0[r11]
            if (r11 == r4) goto L6e
            if (r11 == r3) goto L6e
            if (r11 == r2) goto L6e
            r0 = 4
            if (r11 != r0) goto L26
            boolean r1 = r7.clearFocus(r8, r9)
            goto L6e
        L26:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L2c:
            boolean r1 = r7.clearFocus(r8, r9)
            goto L6e
        L31:
            androidx.compose.ui.focus.FocusTransactionManager r0 = r7.getFocusTransactionManager()
            androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r5 = new x00.a<yz.g2>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                static {
                    /*
                        androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r0 = new androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1) androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.INSTANCE androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.<init>():void");
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.invoke2():void");
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ yz.g2 invoke() {
                    /*
                        r1 = this;
                        r1.invoke2()
                        yz.g2 r0 = yz.g2.f100423a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.invoke():java.lang.Object");
                }
            }
            boolean r6 = r0.getOngoingTransaction()     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L43
            androidx.compose.ui.focus.FocusTransactionManager.access$cancelTransaction(r0)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r8 = move-exception
            goto L78
        L43:
            androidx.compose.ui.focus.FocusTransactionManager.access$beginTransaction(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L4f
            androidx.compose.runtime.collection.MutableVector r6 = androidx.compose.ui.focus.FocusTransactionManager.access$getCancellationListener$p(r0)     // Catch: java.lang.Throwable -> L41
            r6.add(r5)     // Catch: java.lang.Throwable -> L41
        L4f:
            if (r8 != 0) goto L65
            androidx.compose.ui.focus.FocusTargetNode r5 = r7.rootFocusNode     // Catch: java.lang.Throwable -> L41
            androidx.compose.ui.focus.CustomDestinationResult r11 = androidx.compose.ui.focus.FocusTransactionsKt.m2190performCustomClearFocusMxy_nc0(r5, r11)     // Catch: java.lang.Throwable -> L41
            int[] r5 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L41
            int r11 = r11.ordinal()     // Catch: java.lang.Throwable -> L41
            r11 = r5[r11]     // Catch: java.lang.Throwable -> L41
            if (r11 == r4) goto L6b
            if (r11 == r3) goto L6b
            if (r11 == r2) goto L6b
        L65:
            androidx.compose.ui.focus.FocusTargetNode r11 = r7.rootFocusNode     // Catch: java.lang.Throwable -> L41
            boolean r1 = androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(r11, r8, r9)     // Catch: java.lang.Throwable -> L41
        L6b:
            androidx.compose.ui.focus.FocusTransactionManager.access$commitTransaction(r0)
        L6e:
            if (r1 == 0) goto L77
            if (r10 == 0) goto L77
            x00.a<yz.g2> r8 = r7.onClearFocusForOwner
            r8.invoke()
        L77:
            return r1
        L78:
            androidx.compose.ui.focus.FocusTransactionManager.access$commitTransaction(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo2167clearFocusI7lrPNg(boolean, boolean, boolean, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo2168dispatchInterceptedSoftKeyboardEventZmokQxo(@k KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes$ui_release;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            int m4118constructorimpl = NodeKind.m4118constructorimpl(131072);
            if (!findActiveFocusNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = findActiveFocusNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findActiveFocusNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
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
                        node = node.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                node = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNode;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            int m4118constructorimpl2 = NodeKind.m4118constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui_release = softKeyboardInterceptionModifierNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui_release;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i12 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                node2 = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector2.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector2.add(delegate$ui_release2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent$ui_release = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i13 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo3276onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
            }
            DelegatingNode node3 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).mo3276onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release3 = node3.getDelegate$ui_release();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate$ui_release3 != null) {
                        if ((delegate$ui_release3.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate$ui_release3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector3.add(node3);
                                    node3 = 0;
                                }
                                mutableVector3.add(delegate$ui_release3);
                            }
                        }
                        delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node4 = softKeyboardInterceptionModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node4).mo3275onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node4.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release4 = node4.getDelegate$ui_release();
                    int i15 = 0;
                    node4 = node4;
                    while (delegate$ui_release4 != null) {
                        if ((delegate$ui_release4.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            i15++;
                            if (i15 == 1) {
                                node4 = delegate$ui_release4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node4 != 0) {
                                    mutableVector4.add(node4);
                                    node4 = 0;
                                }
                                mutableVector4.add(delegate$ui_release4);
                            }
                        }
                        delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                        node4 = node4;
                    }
                    if (i15 == 1) {
                    }
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i16)).mo3275onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20, types: [T, androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v25, types: [T, androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r4v18, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v25, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v38, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    public boolean mo2169dispatchKeyEventYhN2O0w(@k KeyEvent keyEvent, @k a<Boolean> aVar) {
        Object obj;
        Modifier.Node node;
        NodeChain nodes$ui_release;
        Object obj2;
        NodeChain nodes$ui_release2;
        NodeChain nodes$ui_release3;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.focusInvalidationManager.hasPendingInvalidation()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m2175validateKeyEventZmokQxo(keyEvent)) {
                return false;
            }
            FocusTargetNode findFocusTargetNode = findFocusTargetNode();
            if (findFocusTargetNode == null || (node = lastLocalKeyInputNode(findFocusTargetNode)) == null) {
                if (findFocusTargetNode != null) {
                    int m4118constructorimpl = NodeKind.m4118constructorimpl(8192);
                    if (!findFocusTargetNode.getNode().isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    Modifier.Node node2 = findFocusTargetNode.getNode();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findFocusTargetNode);
                    loop10: while (true) {
                        if (requireLayoutNode == null) {
                            obj2 = null;
                            break;
                        }
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                            while (node2 != null) {
                                if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    Modifier.Node node3 = node2;
                                    while (node3 != null) {
                                        if (node3 instanceof KeyInputModifierNode) {
                                            obj2 = node3;
                                            break loop10;
                                        }
                                        if ((node3.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release();
                                            int i11 = 0;
                                            node3 = node3;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        node3 = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node3 != null) {
                                                            mutableVector.add(node3);
                                                            node3 = null;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                node3 = node3;
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        node3 = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                node2 = node2.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        node2 = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
                    }
                    KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) obj2;
                    if (keyInputModifierNode != null) {
                        node = keyInputModifierNode.getNode();
                    }
                }
                FocusTargetNode focusTargetNode = this.rootFocusNode;
                int m4118constructorimpl2 = NodeKind.m4118constructorimpl(8192);
                if (!focusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop14: while (true) {
                    if (requireLayoutNode2 == null) {
                        obj = null;
                        break;
                    }
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl2) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                MutableVector mutableVector2 = null;
                                Modifier.Node node4 = parent$ui_release;
                                while (node4 != null) {
                                    if (node4 instanceof KeyInputModifierNode) {
                                        obj = node4;
                                        break loop14;
                                    }
                                    if ((node4.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui_release2 = ((DelegatingNode) node4).getDelegate$ui_release();
                                        int i12 = 0;
                                        node4 = node4;
                                        while (delegate$ui_release2 != null) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    node4 = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node4 != null) {
                                                        mutableVector2.add(node4);
                                                        node4 = null;
                                                    }
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                            delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                            node4 = node4;
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    node4 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    parent$ui_release = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
                }
                KeyInputModifierNode keyInputModifierNode2 = (KeyInputModifierNode) obj;
                node = keyInputModifierNode2 != null ? keyInputModifierNode2.getNode() : null;
            }
            if (node != null) {
                int m4118constructorimpl3 = NodeKind.m4118constructorimpl(8192);
                if (!node.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui_release2 = node.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode3 = DelegatableNodeKt.requireLayoutNode(node);
                ArrayList arrayList = null;
                while (requireLayoutNode3 != null) {
                    if ((requireLayoutNode3.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl3) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m4118constructorimpl3) != 0) {
                                Modifier.Node node5 = parent$ui_release2;
                                MutableVector mutableVector3 = null;
                                while (node5 != null) {
                                    if (node5 instanceof KeyInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(node5);
                                    } else if ((node5.getKindSet$ui_release() & m4118constructorimpl3) != 0 && (node5 instanceof DelegatingNode)) {
                                        int i13 = 0;
                                        for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node5).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                                            if ((delegate$ui_release3.getKindSet$ui_release() & m4118constructorimpl3) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    node5 = delegate$ui_release3;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node5 != null) {
                                                        mutableVector3.add(node5);
                                                        node5 = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release3);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    node5 = DelegatableNodeKt.pop(mutableVector3);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode3 = requireLayoutNode3.getParent$ui_release();
                    parent$ui_release2 = (requireLayoutNode3 == null || (nodes$ui_release3 = requireLayoutNode3.getNodes$ui_release()) == null) ? null : nodes$ui_release3.getTail$ui_release();
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i14 = size - 1;
                            if (((KeyInputModifierNode) arrayList.get(size)).mo206onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                            if (i14 < 0) {
                                break;
                            }
                            size = i14;
                        }
                    }
                    g2 g2Var = g2.f100423a;
                }
                ?? node6 = node.getNode();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = node6;
                while (true) {
                    T t11 = objectRef2.element;
                    if (t11 != 0) {
                        if (t11 instanceof KeyInputModifierNode) {
                            if (((KeyInputModifierNode) t11).mo206onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                        } else if ((((Modifier.Node) t11).getKindSet$ui_release() & m4118constructorimpl3) != 0) {
                            T t12 = objectRef2.element;
                            if (t12 instanceof DelegatingNode) {
                                int i15 = 0;
                                for (?? r42 = ((DelegatingNode) t12).getDelegate$ui_release(); r42 != 0; r42 = r42.getChild$ui_release()) {
                                    if ((r42.getKindSet$ui_release() & m4118constructorimpl3) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            objectRef2.element = r42;
                                        } else {
                                            MutableVector mutableVector4 = (MutableVector) objectRef.element;
                                            ?? r13 = mutableVector4;
                                            if (mutableVector4 == null) {
                                                r13 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            objectRef.element = r13;
                                            Modifier.Node node7 = (Modifier.Node) objectRef2.element;
                                            if (node7 != null) {
                                                r13.add(node7);
                                                objectRef2.element = null;
                                            }
                                            MutableVector mutableVector5 = (MutableVector) objectRef.element;
                                            if (mutableVector5 != null) {
                                                mutableVector5.add(r42);
                                            }
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                        }
                        objectRef2.element = DelegatableNodeKt.pop((MutableVector) objectRef.element);
                    } else {
                        if (aVar.invoke().booleanValue()) {
                            return true;
                        }
                        ?? node8 = node.getNode();
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                        objectRef4.element = node8;
                        while (true) {
                            T t13 = objectRef4.element;
                            if (t13 != 0) {
                                if (t13 instanceof KeyInputModifierNode) {
                                    if (((KeyInputModifierNode) t13).mo204onKeyEventZmokQxo(keyEvent)) {
                                        return true;
                                    }
                                } else if ((((Modifier.Node) t13).getKindSet$ui_release() & m4118constructorimpl3) != 0) {
                                    T t14 = objectRef4.element;
                                    if (t14 instanceof DelegatingNode) {
                                        int i16 = 0;
                                        for (?? r43 = ((DelegatingNode) t14).getDelegate$ui_release(); r43 != 0; r43 = r43.getChild$ui_release()) {
                                            if ((r43.getKindSet$ui_release() & m4118constructorimpl3) != 0) {
                                                i16++;
                                                if (i16 == 1) {
                                                    objectRef4.element = r43;
                                                } else {
                                                    MutableVector mutableVector6 = (MutableVector) objectRef3.element;
                                                    ?? r12 = mutableVector6;
                                                    if (mutableVector6 == null) {
                                                        r12 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    objectRef3.element = r12;
                                                    Modifier.Node node9 = (Modifier.Node) objectRef4.element;
                                                    if (node9 != null) {
                                                        r12.add(node9);
                                                        objectRef4.element = null;
                                                    }
                                                    MutableVector mutableVector7 = (MutableVector) objectRef3.element;
                                                    if (mutableVector7 != null) {
                                                        mutableVector7.add(r43);
                                                    }
                                                }
                                            }
                                        }
                                        if (i16 == 1) {
                                        }
                                    }
                                }
                                objectRef4.element = DelegatableNodeKt.pop((MutableVector) objectRef3.element);
                            } else {
                                if (arrayList != null) {
                                    int size2 = arrayList.size();
                                    for (int i17 = 0; i17 < size2; i17++) {
                                        if (((KeyInputModifierNode) arrayList.get(i17)).mo204onKeyEventZmokQxo(keyEvent)) {
                                            return true;
                                        }
                                    }
                                    g2 g2Var2 = g2.f100423a;
                                }
                                g2 g2Var3 = g2.f100423a;
                            }
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(@k RotaryScrollEvent rotaryScrollEvent, @k a<Boolean> aVar) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes$ui_release;
        DelegatingNode delegatingNode;
        NodeChain nodes$ui_release2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode findFocusTargetNode = findFocusTargetNode();
        if (findFocusTargetNode != null) {
            int m4118constructorimpl = NodeKind.m4118constructorimpl(16384);
            if (!findFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = findFocusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(findFocusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
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
                        node = node.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                node = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNode;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            int m4118constructorimpl2 = NodeKind.m4118constructorimpl(16384);
            if (!rotaryInputModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui_release = rotaryInputModifierNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            Modifier.Node node2 = parent$ui_release;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i12 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                node2 = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector2.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector2.add(delegate$ui_release2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent$ui_release = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i13 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
            }
            DelegatingNode node3 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node3).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release3 = node3.getDelegate$ui_release();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate$ui_release3 != null) {
                        if ((delegate$ui_release3.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate$ui_release3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    mutableVector3.add(node3);
                                    node3 = 0;
                                }
                                mutableVector3.add(delegate$ui_release3);
                            }
                        }
                        delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            if (aVar.invoke().booleanValue()) {
                return true;
            }
            DelegatingNode node4 = rotaryInputModifierNode.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node4).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((node4.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release4 = node4.getDelegate$ui_release();
                    int i15 = 0;
                    node4 = node4;
                    while (delegate$ui_release4 != null) {
                        if ((delegate$ui_release4.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            i15++;
                            if (i15 == 1) {
                                node4 = delegate$ui_release4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node4 != 0) {
                                    mutableVector4.add(node4);
                                    node4 = 0;
                                }
                                mutableVector4.add(delegate$ui_release4);
                            }
                        }
                        delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                        node4 = node4;
                    }
                    if (i15 == 1) {
                    }
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    if (((RotaryInputModifierNode) arrayList.get(i16)).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @l
    /* renamed from: focusSearch-ULY8qGw */
    public Boolean mo2170focusSearchULY8qGw(int i11, @l Rect rect, @k final x00.l<? super FocusTargetNode, Boolean> lVar) {
        final FocusTargetNode findFocusTargetNode = findFocusTargetNode();
        if (findFocusTargetNode != null) {
            FocusRequester m2194customFocusSearchOMvw8 = FocusTraversalKt.m2194customFocusSearchOMvw8(findFocusTargetNode, i11, this.onLayoutDirection.invoke());
            FocusRequester.Companion companion = FocusRequester.Companion;
            if (g0.g(m2194customFocusSearchOMvw8, companion.getCancel())) {
                return null;
            }
            if (g0.g(m2194customFocusSearchOMvw8, companion.getRedirect$ui_release())) {
                FocusTargetNode findFocusTargetNode2 = findFocusTargetNode();
                if (findFocusTargetNode2 != null) {
                    return lVar.invoke(findFocusTargetNode2);
                }
                return null;
            }
            if (!g0.g(m2194customFocusSearchOMvw8, companion.getDefault())) {
                return Boolean.valueOf(m2194customFocusSearchOMvw8.findFocusTargetNode$ui_release(lVar));
            }
        } else {
            findFocusTargetNode = null;
        }
        return FocusTraversalKt.m2195focusSearch0X8WOeE(this.rootFocusNode, i11, this.onLayoutDirection.invoke(), rect, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean booleanValue;
                if (g0.g(focusTargetNode, FocusTargetNode.this)) {
                    booleanValue = false;
                } else {
                    if (g0.g(focusTargetNode, this.getRootFocusNode$ui_release())) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = lVar.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            }
        });
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @l
    public FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @l
    public Rect getFocusRect() {
        FocusTargetNode findFocusTargetNode = findFocusTargetNode();
        if (findFocusTargetNode != null) {
            return FocusTraversalKt.focusRect(findFocusTargetNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @k
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @k
    public MutableObjectList<FocusListener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @k
    public Modifier getModifier() {
        return this.modifier;
    }

    @k
    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    @k
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean isFocusCaptured() {
        return this.isFocusCaptured;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo2165moveFocus3ESFkO8(final int i11) {
        if (ComposeUiFlags.isViewFocusFixEnabled && this.onMoveFocusInterop.invoke(FocusDirection.m2149boximpl(i11)).booleanValue()) {
            return true;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Boolean.FALSE;
        int generation = getFocusTransactionManager().getGeneration();
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        Boolean mo2170focusSearchULY8qGw = mo2170focusSearchULY8qGw(i11, this.onFocusRectInterop.invoke(), new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
            @Override // x00.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(i11));
                Boolean bool = objectRef.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        int generation2 = getFocusTransactionManager().getGeneration();
        Boolean bool = Boolean.TRUE;
        if (g0.g(mo2170focusSearchULY8qGw, bool) && (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != getActiveFocusTargetNode()))) {
            return true;
        }
        if (mo2170focusSearchULY8qGw != null && objectRef.element != 0) {
            if (g0.g(mo2170focusSearchULY8qGw, bool) && g0.g(objectRef.element, bool)) {
                return true;
            }
            if (FocusOwnerImplKt.m2176is1dFocusSearch3ESFkO8(i11)) {
                return mo2167clearFocusI7lrPNg(false, true, false, i11) && mo2172takeFocusaToIllA(i11, null);
            }
            if (!ComposeUiFlags.isViewFocusFixEnabled && this.onMoveFocusInterop.invoke(FocusDirection.m2149boximpl(i11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
            return;
        }
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.getOngoingTransaction()) {
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.beginTransaction();
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: requestFocusForOwner-7o62pno */
    public boolean mo2171requestFocusForOwner7o62pno(@l FocusDirection focusDirection, @l Rect rect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, rect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@k FocusTargetNode focusTargetNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidationForOwner();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setActiveFocusTargetNode(@l FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            setFocusCaptured(false);
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled) {
            MutableObjectList<FocusListener> listeners = getListeners();
            Object[] objArr = listeners.content;
            int i11 = listeners._size;
            for (int i12 = 0; i12 < i11; i12++) {
                ((FocusListener) objArr[i12]).onFocusChanged(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setFocusCaptured(boolean z11) {
        if (!((z11 && getActiveFocusTargetNode() == null) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z11;
    }

    public final void setRootFocusNode$ui_release(@k FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: takeFocus-aToIllA */
    public boolean mo2172takeFocusaToIllA(final int i11, @l Rect rect) {
        Boolean mo2170focusSearchULY8qGw = mo2170focusSearchULY8qGw(i11, rect, new x00.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(i11));
            }
        });
        if (mo2170focusSearchULY8qGw != null) {
            return mo2170focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    private final boolean clearFocus(boolean z11, boolean z12) {
        NodeChain nodes$ui_release;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (isFocusCaptured() && !z11) {
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (z12 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui_release(isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
            int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui_release = activeFocusTargetNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node node = parent$ui_release;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    ((FocusTargetNode) node).dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    int i11 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector.add(node);
                                                    node = null;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@k FocusEventModifierNode focusEventModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@k FocusPropertiesModifierNode focusPropertiesModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }
}
