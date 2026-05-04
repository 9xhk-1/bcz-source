package androidx.compose.ui.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import j00.c;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface BringIntoViewModifierNode extends DelegatableNode {
    @l
    Object bringIntoView(@k LayoutCoordinates layoutCoordinates, @k a<Rect> aVar, @k c<? super g2> cVar);
}
