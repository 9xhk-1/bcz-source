package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DragAndDropManager {
    @k
    Modifier getModifier();

    boolean isInterestedTarget(@k DragAndDropTarget dragAndDropTarget);

    boolean isRequestDragAndDropTransferRequired();

    void registerTargetInterest(@k DragAndDropTarget dragAndDropTarget);

    /* renamed from: requestDragAndDropTransfer-Uv8p0NA */
    void mo2104requestDragAndDropTransferUv8p0NA(@k DragAndDropNode dragAndDropNode, long j11);
}
