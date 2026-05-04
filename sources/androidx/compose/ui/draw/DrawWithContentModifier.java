package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {

    @k
    private l<? super ContentDrawScope, g2> onDraw;

    public DrawWithContentModifier(@k l<? super ContentDrawScope, g2> lVar) {
        this.onDraw = lVar;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        this.onDraw.invoke(contentDrawScope);
    }

    @k
    public final l<ContentDrawScope, g2> getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(@k l<? super ContentDrawScope, g2> lVar) {
        this.onDraw = lVar;
    }
}
