package androidx.datastore.core;

import e40.i0;
import j00.c;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements p<i0<? super g2>, c<? super g2>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, c<? super MulticastFileObserver$Companion$observe$1> cVar) {
        super(2, cVar);
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, cVar);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k i0<? super g2> i0Var, @l c<? super g2> cVar) {
        return ((MulticastFileObserver$Companion$observe$1) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (e40.g0.b(r3, r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r7)
            goto L66
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$1
            c40.k1 r1 = (c40.k1) r1
            java.lang.Object r3 = r6.L$0
            e40.i0 r3 = (e40.i0) r3
            kotlin.e.n(r7)
            goto L53
        L26:
            kotlin.e.n(r7)
            java.lang.Object r7 = r6.L$0
            e40.i0 r7 = (e40.i0) r7
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1 r1 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
            java.io.File r4 = r6.$file
            r1.<init>()
            androidx.datastore.core.MulticastFileObserver$Companion r4 = androidx.datastore.core.MulticastFileObserver.Companion
            java.io.File r5 = r6.$file
            java.io.File r5 = r5.getParentFile()
            kotlin.jvm.internal.g0.m(r5)
            c40.k1 r1 = androidx.datastore.core.MulticastFileObserver.Companion.access$observe(r4, r5, r1)
            yz.g2 r4 = yz.g2.f100423a
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r7.b(r4, r6)
            if (r3 != r0) goto L52
            goto L65
        L52:
            r3 = r7
        L53:
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 r7 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1
            r7.<init>()
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = e40.g0.b(r3, r7, r6)
            if (r7 != r0) goto L66
        L65:
            return r0
        L66:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
