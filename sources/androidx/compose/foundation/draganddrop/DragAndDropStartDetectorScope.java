package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DragAndDropStartDetectorScope extends PointerInputScope {
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M$default, reason: not valid java name */
    static /* synthetic */ void m382requestDragAndDropTransferk4lQ0M$default(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDragAndDropTransfer-k-4lQ0M");
        }
        if ((i11 & 1) != 0) {
            j11 = Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        dragAndDropStartDetectorScope.mo369requestDragAndDropTransferk4lQ0M(j11);
    }

    /* renamed from: requestDragAndDropTransfer-k-4lQ0M */
    void mo369requestDragAndDropTransferk4lQ0M(long j11);
}
