package androidx.compose.ui.platform.accessibility;

import a00.h0;
import a00.r0;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCollectionInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,158:1\n34#2,6:159\n34#2,6:165\n367#2,8:171\n375#2,3:189\n398#2,7:192\n65#3:179\n69#3:182\n71#3:199\n65#3:200\n73#3:203\n69#3:204\n60#4:180\n70#4:183\n53#4,3:186\n60#4:201\n70#4:205\n22#5:181\n22#5:184\n22#5:202\n22#5:206\n30#6:185\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n*L\n43#1:159,6\n87#1:165,6\n124#1:171,8\n124#1:189,3\n133#1:192,7\n126#1:179\n127#1:182\n131#1:199\n131#1:200\n130#1:203\n130#1:204\n126#1:180\n127#1:183\n125#1:186,3\n131#1:201\n130#1:205\n126#1:181\n127#1:184\n131#1:202\n130#1:206\n125#1:185\n*E\n"})
/* loaded from: classes2.dex */
public final class CollectionInfo_androidKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List list2;
        long m2278unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = h0.J();
        } else {
            ArrayList arrayList = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int L = h0.L(list);
            int i11 = 0;
            while (i11 < L) {
                i11++;
                SemanticsNode semanticsNode2 = list.get(i11);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                arrayList.add(Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m2298getCenterF1C5BW0() >> 32)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m2298getCenterF1C5BW0() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m2298getCenterF1C5BW0() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m2298getCenterF1C5BW0() & 4294967295L)))) & 4294967295L))));
                semanticsNode = semanticsNode2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            m2278unboximpl = ((Offset) r0.G2(list2)).m2278unboximpl();
        } else {
            if (list2.isEmpty()) {
                ListUtilsKt.throwUnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object G2 = r0.G2(list2);
            int L2 = h0.L(list2);
            if (1 <= L2) {
                int i12 = 1;
                while (true) {
                    G2 = Offset.m2257boximpl(Offset.m2273plusMKHz9U(((Offset) G2).m2278unboximpl(), ((Offset) list2.get(i12)).m2278unboximpl()));
                    if (i12 == L2) {
                        break;
                    }
                    i12++;
                }
            }
            m2278unboximpl = ((Offset) G2).m2278unboximpl();
        }
        return Float.intBitsToFloat((int) (4294967295L & m2278unboximpl)) < Float.intBitsToFloat((int) (m2278unboximpl >> 32));
    }

    public static final boolean hasCollectionInfo(@k SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(@k SemanticsNode semanticsNode, @k AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(calculateIfHorizontallyStacked ? 1 : arrayList.size(), calculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(@k SemanticsNode semanticsNode, @k AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i12);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        i11++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(calculateIfHorizontallyStacked ? 0 : i11, 1, calculateIfHorizontallyStacked ? i11 : 0, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new a<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue());
            if (obtain != null) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(obtain);
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new a<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }
}
