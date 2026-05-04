package androidx.compose.ui.platform;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,256:1\n34#2,4:257\n39#2:262\n425#3:261\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n*L\n55#1:257,4\n55#1:262\n56#1:261\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsNodeCopy {
    public static final int $stable = 8;

    @m80.k
    private final MutableIntSet children;

    @m80.k
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNodeCopy(@m80.k SemanticsNode semanticsNode, @m80.k IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig$ui_release();
        this.children = new MutableIntSet(semanticsNode.getReplacedChildren$ui_release().size());
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
            if (intObjectMap.containsKey(semanticsNode2.getId())) {
                this.children.add(semanticsNode2.getId());
            }
        }
    }

    @m80.k
    public final MutableIntSet getChildren() {
        return this.children;
    }

    @m80.k
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
