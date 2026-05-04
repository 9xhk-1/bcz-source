package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import j00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface BringIntoViewRequester {
    static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i11 & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, cVar);
    }

    @l
    Object bringIntoView(@l Rect rect, @k c<? super g2> cVar);
}
