package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import j00.c;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Use BringIntoViewModifierNode instead")
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    @l
    Object bringChildIntoView(@k a<Rect> aVar, @k c<? super g2> cVar);

    @k
    Rect calculateRectForParent(@k Rect rect);
}
