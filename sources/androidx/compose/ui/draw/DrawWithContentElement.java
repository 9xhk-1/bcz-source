package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {

    @k
    private final l<ContentDrawScope, g2> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(@k l<? super ContentDrawScope, g2> lVar) {
        this.onDraw = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawWithContentElement copy$default(DrawWithContentElement drawWithContentElement, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = drawWithContentElement.onDraw;
        }
        return drawWithContentElement.copy(lVar);
    }

    @k
    public final l<ContentDrawScope, g2> component1() {
        return this.onDraw;
    }

    @k
    public final DrawWithContentElement copy(@k l<? super ContentDrawScope, g2> lVar) {
        return new DrawWithContentElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && g0.g(this.onDraw, ((DrawWithContentElement) obj).onDraw);
    }

    @k
    public final l<ContentDrawScope, g2> getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithContent");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    @k
    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public DrawWithContentModifier create() {
        return new DrawWithContentModifier(this.onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k DrawWithContentModifier drawWithContentModifier) {
        drawWithContentModifier.setOnDraw(this.onDraw);
    }
}
