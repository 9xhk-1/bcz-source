package kotlinx.coroutines.flow;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x00.q<j<? super R>, T, j00.c<? super g2>, Object> f67843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j<R> f67844b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$unsafeTransform$1$1(x00.q<? super j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar, j<? super R> jVar) {
        this.f67843a = qVar;
        this.f67844b = jVar;
    }

    public final Object a(T t11, j00.c<? super g2> cVar) {
        kotlin.jvm.internal.d0.e(4);
        new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
        kotlin.jvm.internal.d0.e(5);
        this.f67843a.invoke(this.f67844b, t11, cVar);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            x00.q<kotlinx.coroutines.flow.j<? super R>, T, j00.c<? super yz.g2>, java.lang.Object> r6 = r4.f67843a
            kotlinx.coroutines.flow.j<R> r2 = r4.f67844b
            r0.label = r3
            java.lang.Object r5 = r6.invoke(r2, r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1.emit(java.lang.Object, j00.c):java.lang.Object");
    }
}
