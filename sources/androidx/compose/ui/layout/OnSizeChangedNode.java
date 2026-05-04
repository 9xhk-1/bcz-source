package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOnRemeasuredModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnSizeChangedNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,108:1\n30#2:109\n30#2:111\n80#3:110\n80#3:112\n*S KotlinDebug\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnSizeChangedNode\n*L\n78#1:109\n84#1:111\n78#1:110\n84#1:112\n*E\n"})
/* loaded from: classes.dex */
final class OnSizeChangedNode extends Modifier.Node implements LayoutAwareModifierNode {

    @k
    private l<? super IntSize, g2> onSizeChanged;
    private long previousSize;
    private final boolean shouldAutoInvalidate = true;

    public OnSizeChangedNode(@k l<? super IntSize, g2> lVar) {
        this.onSizeChanged = lVar;
        long j11 = Integer.MIN_VALUE;
        this.previousSize = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo365onRemeasuredozmzZPI(long j11) {
        if (IntSize.m5284equalsimpl0(this.previousSize, j11)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m5278boximpl(j11));
        this.previousSize = j11;
    }

    public final void update(@k l<? super IntSize, g2> lVar) {
        this.onSizeChanged = lVar;
        long j11 = Integer.MIN_VALUE;
        this.previousSize = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }
}
