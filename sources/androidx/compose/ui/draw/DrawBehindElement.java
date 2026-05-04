package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {

    @k
    private final l<DrawScope, g2> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(@k l<? super DrawScope, g2> lVar) {
        this.onDraw = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawBehindElement copy$default(DrawBehindElement drawBehindElement, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = drawBehindElement.onDraw;
        }
        return drawBehindElement.copy(lVar);
    }

    @k
    public final l<DrawScope, g2> component1() {
        return this.onDraw;
    }

    @k
    public final DrawBehindElement copy(@k l<? super DrawScope, g2> lVar) {
        return new DrawBehindElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && g0.g(this.onDraw, ((DrawBehindElement) obj).onDraw);
    }

    @k
    public final l<DrawScope, g2> getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawBehind");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    @k
    public String toString() {
        return "DrawBehindElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public DrawBackgroundModifier create() {
        return new DrawBackgroundModifier(this.onDraw);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k DrawBackgroundModifier drawBackgroundModifier) {
        drawBackgroundModifier.setOnDraw(this.onDraw);
    }
}
