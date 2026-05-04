package androidx.datastore.core;

import c40.x;
import c40.z;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import n40.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n495#1:539,10\n*E\n"})
/* loaded from: classes2.dex */
public abstract class RunOnce {

    @k
    private final n40.a runMutex = g.b(false, 1, null);

    @k
    private final x<g2> didRun = z.c(null, 1, null);

    @l
    public final Object awaitComplete(@k c<? super g2> cVar) {
        Object i11 = this.didRun.i(cVar);
        return i11 == b.l() ? i11 : g2.f100423a;
    }

    @l
    public abstract Object doRun(@k c<? super g2> cVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runIfNeeded(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.RunOnce$runIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce$runIfNeeded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.L$1
            n40.a r1 = (n40.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.L$1
            n40.a r2 = (n40.a) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.RunOnce r4 = (androidx.datastore.core.RunOnce) r4
            kotlin.e.n(r7)
            r7 = r2
            goto L6a
        L4c:
            kotlin.e.n(r7)
            c40.x<yz.g2> r7 = r6.didRun
            boolean r7 = r7.e()
            if (r7 == 0) goto L5a
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L5a:
            n40.a r7 = r6.runMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.lock(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            c40.x<yz.g2> r2 = r4.didRun     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.e()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            yz.g2 r0 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L78
            r7.unlock(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L78
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L78
            r0.label = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.doRun(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            c40.x<yz.g2> r7 = r0.didRun     // Catch: java.lang.Throwable -> L35
            yz.g2 r0 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L35
            r7.c0(r0)     // Catch: java.lang.Throwable -> L35
            r1.unlock(r5)
            return r0
        L96:
            r1.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(j00.c):java.lang.Object");
    }
}
