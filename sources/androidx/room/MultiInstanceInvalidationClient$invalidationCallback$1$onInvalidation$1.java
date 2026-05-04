package androidx.room;

import a00.w1;
import c40.r0;
import java.util.Arrays;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"invalidatedTablesSet"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ String[] $tables;
    Object L$0;
    int label;
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, j00.c<? super MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1> cVar) {
        super(2, cVar);
        this.$tables = strArr;
        this.this$0 = multiInstanceInvalidationClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(this.$tables, this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.x xVar;
        Set<String> set;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            String[] strArr = this.$tables;
            Set<String> u11 = w1.u(Arrays.copyOf(strArr, strArr.length));
            xVar = this.this$0.invalidatedTables;
            this.L$0 = u11;
            this.label = 1;
            if (xVar.emit(u11, this) == l11) {
                return l11;
            }
            set = u11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) this.L$0;
            kotlin.e.n(obj);
        }
        this.this$0.getInvalidationTracker().notifyObserversByTableNames$room_runtime_release(set);
        return g2.f100423a;
    }
}
