package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Region;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,256:1\n288#2,2:257\n26#3:259\n26#3:260\n26#3:261\n26#3:262\n26#3:263\n26#3:264\n26#3:265\n26#3:266\n26#3:267\n26#3:268\n26#3:269\n26#3:270\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n*L\n154#1:257,2\n173#1:259\n174#1:260\n175#1:261\n176#1:262\n190#1:263\n191#1:264\n192#1:265\n193#1:266\n236#1:267\n237#1:268\n238#1:269\n239#1:270\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsUtils_androidKt {

    @m80.k
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    @m80.l
    public static final ScrollObservationScope findById(@m80.k List<ScrollObservationScope> list, int i11) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (list.get(i12).getSemanticsNodeId() == i11) {
                return list.get(i12);
            }
        }
        return null;
    }

    @m80.k
    public static final IntObjectMap<SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToIntObjectMap(@m80.k SemanticsOwner semanticsOwner) {
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        if (!unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() || !unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            return IntObjectMapKt.emptyIntObjectMap();
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(48);
        Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
        getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(new Region(Math.round(boundsInRoot.getLeft()), Math.round(boundsInRoot.getTop()), Math.round(boundsInRoot.getRight()), Math.round(boundsInRoot.getBottom())), unmergedRootSemanticsNode, mutableIntObjectMap, unmergedRootSemanticsNode, new Region());
        return mutableIntObjectMap;
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, MutableIntObjectMap<SemanticsNodeWithAdjustedBounds> mutableIntObjectMap, SemanticsNode semanticsNode2, Region region2) {
        LayoutInfo layoutInfo;
        boolean z11 = (semanticsNode2.getLayoutNode$ui_release().isPlaced() && semanticsNode2.getLayoutNode$ui_release().isAttached()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z11 || semanticsNode2.isFake$ui_release()) {
                Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
                int round = Math.round(touchBoundsInRoot.getLeft());
                int round2 = Math.round(touchBoundsInRoot.getTop());
                int round3 = Math.round(touchBoundsInRoot.getRight());
                int round4 = Math.round(touchBoundsInRoot.getBottom());
                region2.set(round, round2, round3, round4);
                int id2 = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (semanticsNode2.isFake$ui_release()) {
                        SemanticsNode parent = semanticsNode2.getParent();
                        Rect boundsInRoot = (parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot();
                        mutableIntObjectMap.set(id2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(Math.round(boundsInRoot.getLeft()), Math.round(boundsInRoot.getTop()), Math.round(boundsInRoot.getRight()), Math.round(boundsInRoot.getBottom()))));
                        return;
                    } else {
                        if (id2 == -1) {
                            mutableIntObjectMap.set(id2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                mutableIntObjectMap.set(id2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    if (!replacedChildren$ui_release.get(size).getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker())) {
                        getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(region, semanticsNode, mutableIntObjectMap, replacedChildren$ui_release.get(size), region2);
                    }
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    @m80.k
    public static final Rect getDefaultFakeNodeBounds() {
        return DefaultFakeNodeBounds;
    }

    @m80.l
    @SuppressLint({"PrimitiveInCollection"})
    public static final Float getScrollViewportLength(@m80.k SemanticsConfiguration semanticsConfiguration) {
        x00.l lVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetScrollViewportLength());
        if (accessibilityAction == null || (lVar = (x00.l) accessibilityAction.getAction()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    @m80.l
    public static final TextLayoutResult getTextLayoutResult(@m80.k SemanticsConfiguration semanticsConfiguration) {
        x00.l lVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (lVar = (x00.l) accessibilityAction.getAction()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final boolean isHidden(@m80.k SemanticsNode semanticsNode) {
        if (semanticsNode.isTransparent$ui_release()) {
            return true;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return unmergedConfig$ui_release.contains(semanticsProperties.getHideFromAccessibility()) || semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getInvisibleToUser());
    }

    public static final boolean isImportantForAccessibility(@m80.k SemanticsNode semanticsNode) {
        if (isHidden(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release();
    }

    @m80.l
    public static final View semanticsIdToView(@m80.k AndroidViewsHandler androidViewsHandler, int i11) {
        Object obj;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).getSemanticsId() == i11) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    @m80.l
    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m4299toLegacyClassNameV4PA4sw(int i11) {
        Role.Companion companion = Role.Companion;
        if (Role.m4319equalsimpl0(i11, companion.m4323getButtono7Vup1c())) {
            return Chip.C;
        }
        if (Role.m4319equalsimpl0(i11, companion.m4325getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m4319equalsimpl0(i11, companion.m4328getRadioButtono7Vup1c())) {
            return Chip.D;
        }
        if (Role.m4319equalsimpl0(i11, companion.m4327getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m4319equalsimpl0(i11, companion.m4326getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        if (Role.m4319equalsimpl0(i11, companion.m4331getValuePickero7Vup1c())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static /* synthetic */ void isHidden$annotations(SemanticsNode semanticsNode) {
    }
}
