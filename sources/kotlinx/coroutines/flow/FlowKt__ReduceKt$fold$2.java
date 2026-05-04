package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class FlowKt__ReduceKt$fold$2<T> implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<R> f67971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x00.q<R, T, j00.c<? super R>, Object> f67972b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2(Ref.ObjectRef<R> objectRef, x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar) {
        this.f67971a = objectRef;
        this.f67972b = qVar;
    }

    public final Object a(T t11, j00.c<? super g2> cVar) {
        kotlin.jvm.internal.d0.e(4);
        new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
        kotlin.jvm.internal.d0.e(5);
        Ref.ObjectRef<R> objectRef = this.f67971a;
        objectRef.element = (T) this.f67972b.invoke(objectRef.element, t11, cVar);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r7, j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.e.n(r8)
            goto L4c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
            kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.f67971a
            x00.q<R, T, j00.c<? super R>, java.lang.Object> r2 = r6.f67972b
            T r4 = r8.element
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r2.invoke(r4, r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r5 = r8
            r8 = r7
            r7 = r5
        L4c:
            r7.element = r8
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2.emit(java.lang.Object, j00.c):java.lang.Object");
    }
}
