package androidx.datastore.core;

import j00.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import n40.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSingleProcessCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,60:1\n120#2,10:61\n32#3,10:71\n*S KotlinDebug\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n*L\n40#1:61,10\n49#1:71,10\n*E\n"})
/* loaded from: classes2.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {

    @k
    private final String filePath;

    @k
    private final n40.a mutex;

    @k
    private final i<g2> updateNotifications;

    @k
    private final AtomicInt version;

    public SingleProcessCoordinator(@k String filePath) {
        g0.p(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = g.b(false, 1, null);
        this.version = new AtomicInt(0);
        this.updateNotifications = kotlinx.coroutines.flow.k.K0(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @k
    public i<g2> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @l
    public Object getVersion(@k c<? super Integer> cVar) {
        return l00.a.f(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @l
    public Object incrementAndGetVersion(@k c<? super Integer> cVar) {
        return l00.a.f(this.version.incrementAndGet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r9.lock(null, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object lock(@m80.k x00.l<? super j00.c<? super T>, ? extends java.lang.Object> r8, @m80.k j00.c<? super T> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessCoordinator$lock$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$lock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.L$0
            n40.a r8 = (n40.a) r8
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.L$1
            n40.a r8 = (n40.a) r8
            java.lang.Object r2 = r0.L$0
            x00.l r2 = (x00.l) r2
            kotlin.e.n(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            kotlin.e.n(r9)
            n40.a r9 = r7.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L5b
            goto L67
        L5b:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L6f
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L6f
            r0.label = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.unlock(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.lock(x00.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object tryLock(@m80.k x00.p<? super java.lang.Boolean, ? super j00.c<? super T>, ? extends java.lang.Object> r7, @m80.k j00.c<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$tryLock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.e.n(r8)
            n40.a r8 = r6.mutex
            boolean r2 = r8.tryLock(r4)
            java.lang.Boolean r5 = l00.a.a(r2)     // Catch: java.lang.Throwable -> L5d
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L5d
            r0.Z$0 = r2     // Catch: java.lang.Throwable -> L5d
            r0.label = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.unlock(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.unlock(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.tryLock(x00.p, j00.c):java.lang.Object");
    }
}
