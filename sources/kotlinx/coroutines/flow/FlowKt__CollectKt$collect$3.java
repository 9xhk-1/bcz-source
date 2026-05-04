package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class FlowKt__CollectKt$collect$3<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x00.p<T, j00.c<? super g2>, Object> f67822a;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collect$3(x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar) {
        this.f67822a = pVar;
    }

    public Object a(T t11, final j00.c<? super g2> cVar) {
        kotlin.jvm.internal.d0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collect$3.this.emit(null, this);
            }
        };
        kotlin.jvm.internal.d0.e(5);
        this.f67822a.invoke(t11, cVar);
        return g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.j
    public Object emit(T t11, j00.c<? super g2> cVar) {
        Object invoke = this.f67822a.invoke(t11, cVar);
        return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
    }
}
