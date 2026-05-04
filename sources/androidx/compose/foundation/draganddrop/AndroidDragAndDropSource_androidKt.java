package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import j00.c;
import m80.k;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidDragAndDropSource_androidKt {
    @ExperimentalFoundationApi
    @n(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @w0(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    @k
    public static final Modifier dragAndDropSource(@k Modifier modifier, @k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        return AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt.dragAndDropSource(modifier, pVar);
    }
}
