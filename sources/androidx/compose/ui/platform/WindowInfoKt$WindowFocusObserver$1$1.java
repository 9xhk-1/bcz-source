package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ State<x00.l<Boolean, g2>> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends x00.l<? super Boolean, g2>> state, j00.c<? super WindowInfoKt$WindowFocusObserver$1$1> cVar) {
        super(2, cVar);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final WindowInfo windowInfo = this.$windowInfo;
            kotlinx.coroutines.flow.i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<Boolean>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    return Boolean.valueOf(WindowInfo.this.isWindowFocused());
                }
            });
            final State<x00.l<Boolean, g2>> state = this.$callback;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, j00.c cVar) {
                    return emit(((Boolean) obj2).booleanValue(), (j00.c<? super g2>) cVar);
                }

                public final Object emit(boolean z11, j00.c<? super g2> cVar) {
                    state.getValue().invoke(l00.a.a(z11));
                    return g2.f100423a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(jVar, this) == l11) {
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
