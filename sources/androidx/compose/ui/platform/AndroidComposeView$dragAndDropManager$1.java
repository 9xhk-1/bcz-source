package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements x00.q<DragAndDropTransferData, Size, x00.l<? super DrawScope, ? extends g2>, Boolean> {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Boolean invoke(DragAndDropTransferData dragAndDropTransferData, Size size, x00.l<? super DrawScope, ? extends g2> lVar) {
        return m4229invoke12SF9DM(dragAndDropTransferData, size.m2342unboximpl(), lVar);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m4229invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j11, x00.l<? super DrawScope, g2> lVar) {
        boolean m4227startDrag12SF9DM;
        m4227startDrag12SF9DM = ((AndroidComposeView) this.receiver).m4227startDrag12SF9DM(dragAndDropTransferData, j11, lVar);
        return Boolean.valueOf(m4227startDrag12SF9DM);
    }
}
