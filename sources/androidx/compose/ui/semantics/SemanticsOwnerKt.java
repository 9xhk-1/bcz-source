package androidx.compose.ui.semantics;

import a00.r0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n34#2,6:122\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n109#1:122,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsOwnerKt {
    @k
    public static final List<SemanticsNode> getAllSemanticsNodes(@k SemanticsOwner semanticsOwner, boolean z11, boolean z12) {
        return r0.a6(getAllSemanticsNodesToMap(semanticsOwner, !z11, z12).values());
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z11, z12);
    }

    @k
    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(@k SemanticsOwner semanticsOwner, boolean z11, boolean z12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = z11 ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode();
        if (z12 && unmergedRootSemanticsNode.getLayoutNode$ui_release().isDeactivated()) {
            return linkedHashMap;
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, z12, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z11, z12);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> map, boolean z11, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List children$ui_release$default = SemanticsNode.getChildren$ui_release$default(semanticsNode, false, false, !z11, 3, null);
        int size = children$ui_release$default.size();
        for (int i11 = 0; i11 < size; i11++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, z11, (SemanticsNode) children$ui_release$default.get(i11));
        }
    }
}
