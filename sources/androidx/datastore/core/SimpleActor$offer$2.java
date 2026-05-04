package androidx.datastore.core;

import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, c<? super SimpleActor$offer$2> cVar) {
        super(2, cVar);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        return new SimpleActor$offer$2(this.this$0, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l c<? super g2> cVar) {
        return ((SimpleActor$offer$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (r6 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            x00.p r1 = (x00.p) r1
            kotlin.e.n(r6)
            goto L51
        L22:
            kotlin.e.n(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
            int r6 = r6.get()
            if (r6 <= 0) goto L6c
        L31:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            c40.r0 r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
            c40.s0.j(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            x00.p r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            e40.o r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.H(r5)
            if (r6 != r0) goto L51
            goto L5c
        L51:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L5d
        L5c:
            return r0
        L5d:
            androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
            androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L31
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L6c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
