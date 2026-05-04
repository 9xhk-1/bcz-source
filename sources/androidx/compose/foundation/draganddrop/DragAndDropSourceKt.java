package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import j00.c;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* loaded from: classes.dex */
public final class DragAndDropSourceKt {
    @k
    public static final Modifier dragAndDropSource(@k Modifier modifier, @k l<? super Offset, DragAndDropTransferData> lVar) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, lVar);
    }

    @k
    public static final Modifier dragAndDropSource(@k Modifier modifier, @k l<? super DrawScope, g2> lVar, @k l<? super Offset, DragAndDropTransferData> lVar2) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, lVar, lVar2);
    }

    @ExperimentalFoundationApi
    @n(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @w0(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    @k
    public static final Modifier dragAndDropSource(@k Modifier modifier, @k l<? super DrawScope, g2> lVar, @k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        return DragAndDropSourceKt__LegacyDragAndDropSource_androidKt.dragAndDropSource(modifier, lVar, pVar);
    }
}
