package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class SafeCollector_commonKt$unsafeFlow$1<T> implements kotlinx.coroutines.flow.i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x00.p<kotlinx.coroutines.flow.j<? super T>, j00.c<? super g2>, Object> f68152a;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector_commonKt$unsafeFlow$1(x00.p<? super kotlinx.coroutines.flow.j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        this.f68152a = pVar;
    }

    @Override // kotlinx.coroutines.flow.i
    public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, j00.c<? super g2> cVar) {
        Object invoke = this.f68152a.invoke(jVar, cVar);
        return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
    }

    public Object g(kotlinx.coroutines.flow.j<? super T> jVar, final j00.c<? super g2> cVar) {
        d0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return SafeCollector_commonKt$unsafeFlow$1.this.collect(null, this);
            }
        };
        d0.e(5);
        this.f68152a.invoke(jVar, cVar);
        return g2.f100423a;
    }
}
