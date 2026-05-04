package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class CursorAnchorInfoController$startOrStopMonitoring$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ CursorAnchorInfoController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoController$startOrStopMonitoring$1(CursorAnchorInfoController cursorAnchorInfoController, j00.c<? super CursorAnchorInfoController$startOrStopMonitoring$1> cVar) {
        super(2, cVar);
        this.this$0 = cursorAnchorInfoController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new CursorAnchorInfoController$startOrStopMonitoring$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((CursorAnchorInfoController$startOrStopMonitoring$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final CursorAnchorInfoController cursorAnchorInfoController = this.this$0;
            kotlinx.coroutines.flow.i v02 = kotlinx.coroutines.flow.k.v0(kotlinx.coroutines.flow.k.l0(SnapshotStateKt.snapshotFlow(new x00.a<CursorAnchorInfo>() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final CursorAnchorInfo invoke() {
                    CursorAnchorInfo calculateCursorAnchorInfo;
                    calculateCursorAnchorInfo = CursorAnchorInfoController.this.calculateCursorAnchorInfo();
                    return calculateCursorAnchorInfo;
                }
            }), 1));
            final CursorAnchorInfoController cursorAnchorInfoController2 = this.this$0;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1.2
                public final Object emit(CursorAnchorInfo cursorAnchorInfo, j00.c<? super g2> cVar) {
                    ComposeInputMethodManager composeInputMethodManager;
                    composeInputMethodManager = CursorAnchorInfoController.this.composeImm;
                    composeInputMethodManager.updateCursorAnchorInfo(cursorAnchorInfo);
                    return g2.f100423a;
                }

                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, j00.c cVar) {
                    return emit((CursorAnchorInfo) obj2, (j00.c<? super g2>) cVar);
                }
            };
            this.label = 1;
            if (v02.collect(jVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
