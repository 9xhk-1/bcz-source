package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements p<DragAndDropStartDetectorScope, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public DragAndDropSourceDefaults$DefaultStartDetector$1(c<? super DragAndDropSourceDefaults$DefaultStartDetector$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(cVar);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // x00.p
    public final Object invoke(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, c<? super g2> cVar) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(dragAndDropStartDetectorScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.L$0;
            l<Offset, g2> lVar = new l<Offset, g2>() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m364invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m364invokek4lQ0M(long j11) {
                    DragAndDropStartDetectorScope.this.mo369requestDragAndDropTransferk4lQ0M(j11);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(dragAndDropStartDetectorScope, null, lVar, null, null, this, 13, null) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
