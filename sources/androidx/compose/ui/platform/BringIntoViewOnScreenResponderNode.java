package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {

    @m80.k
    private ViewGroup view;

    public BringIntoViewOnScreenResponderNode(@m80.k ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    @m80.l
    public Object bringIntoView(@m80.k LayoutCoordinates layoutCoordinates, @m80.k x00.a<Rect> aVar, @m80.k j00.c<? super g2> cVar) {
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
        Rect invoke = aVar.invoke();
        Rect m2305translatek4lQ0M = invoke != null ? invoke.m2305translatek4lQ0M(positionInRoot) : null;
        if (m2305translatek4lQ0M != null) {
            this.view.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(m2305translatek4lQ0M), false);
        }
        return g2.f100423a;
    }

    @m80.k
    public final ViewGroup getView() {
        return this.view;
    }

    public final void setView(@m80.k ViewGroup viewGroup) {
        this.view = viewGroup;
    }
}
