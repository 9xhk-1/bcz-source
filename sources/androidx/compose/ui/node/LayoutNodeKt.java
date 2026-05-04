package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1533:1\n76#2,7:1534\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n*L\n1522#1:1534,7\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;

    @k
    private static final Density DefaultDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final void add(@k LayoutNode layoutNode, @k LayoutNode layoutNode2) {
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), layoutNode2);
    }

    @k
    public static final Owner requireOwner(@k LayoutNode layoutNode) {
        Owner owner$ui_release = layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
