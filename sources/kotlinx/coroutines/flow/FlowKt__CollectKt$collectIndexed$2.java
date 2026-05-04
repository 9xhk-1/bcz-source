package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,114:1\n29#2,4:115\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__CollectKt$collectIndexed$2<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f67823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x00.q<Integer, T, j00.c<? super g2>, Object> f67824b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(x00.q<? super Integer, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar) {
        this.f67824b = qVar;
    }

    public Object a(T t11, final j00.c<? super g2> cVar) {
        kotlin.jvm.internal.d0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collectIndexed$2.this.emit(null, this);
            }
        };
        kotlin.jvm.internal.d0.e(5);
        x00.q<Integer, T, j00.c<? super g2>, Object> qVar = this.f67824b;
        int i11 = this.f67823a;
        this.f67823a = i11 + 1;
        if (i11 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        qVar.invoke(Integer.valueOf(i11), t11, cVar);
        return g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.j
    public Object emit(T t11, j00.c<? super g2> cVar) {
        x00.q<Integer, T, j00.c<? super g2>, Object> qVar = this.f67824b;
        int i11 = this.f67823a;
        this.f67823a = i11 + 1;
        if (i11 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        Object invoke = qVar.invoke(l00.a.f(i11), t11, cVar);
        return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
    }
}
