package o40;

import c40.l2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.d;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n29#2:201\n29#2:205\n16#3:202\n16#3:206\n168#4,2:203\n1863#5,2:207\n*S KotlinDebug\n*F\n+ 1 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeImpl\n*L\n53#1:201\n83#1:205\n53#1:202\n83#1:206\n70#1:203,2\n89#1:207,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f75737a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75740d;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Object f75738b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<Throwable> f75739c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Set<l2> f75741e = h0.d(getCoroutineContext());

    public f0(@m80.k kotlin.coroutines.d dVar) {
        this.f75737a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (I().A0(false) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o40.d0
    @yz.n(message = "Please call `runTest`, which automatically performs the cleanup, instead of using this function.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F0() {
        /*
            r5 = this;
            kotlin.coroutines.d r0 = r5.getCoroutineContext()
            kotlin.coroutines.c$b r1 = kotlin.coroutines.c.f66933w0
            kotlin.coroutines.d$b r0 = r0.get(r1)
            kotlin.coroutines.c r0 = (kotlin.coroutines.c) r0
            boolean r1 = r0 instanceof o40.u
            r2 = 0
            if (r1 == 0) goto L14
            o40.u r0 = (o40.u) r0
            goto L15
        L14:
            r0 = r2
        L15:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L1d
            r0.U()     // Catch: kotlinx.coroutines.test.UncompletedCoroutinesError -> L2e
            goto L2f
        L1d:
            o40.b0 r0 = r5.I()
            r0.W0()
            o40.b0 r0 = r5.I()
            boolean r0 = r0.A0(r1)
            if (r0 != 0) goto L2f
        L2e:
            r1 = r3
        L2f:
            kotlin.coroutines.d r0 = r5.getCoroutineContext()
            c40.n0$b r4 = c40.n0.f7891d0
            kotlin.coroutines.d$b r0 = r0.get(r4)
            boolean r4 = r0 instanceof o40.w
            if (r4 == 0) goto L40
            r2 = r0
            o40.w r2 = (o40.w) r2
        L40:
            if (r2 == 0) goto L45
            r2.q()
        L45:
            java.lang.Object r0 = r5.f75738b
            monitor-enter(r0)
            boolean r2 = r5.f75740d     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto Lb6
            r5.f75740d = r3     // Catch: java.lang.Throwable -> Lb4
            yz.g2 r2 = yz.g2.f100423a     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)
            java.util.List<java.lang.Throwable> r0 = r5.f75739c
            java.lang.Object r0 = a00.r0.L2(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L7a
            java.util.List<java.lang.Throwable> r1 = r5.f75739c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = a00.r0.g2(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L69:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            yz.r.a(r0, r2)
            goto L69
        L79:
            throw r0
        L7a:
            if (r1 != 0) goto Lac
            kotlin.coroutines.d r0 = r5.getCoroutineContext()
            java.util.Set r0 = o40.h0.d(r0)
            java.util.Set<c40.l2> r1 = r5.f75741e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = a00.x1.x(r0, r1)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L95
            return
        L95:
            kotlinx.coroutines.test.UncompletedCoroutinesError r1 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Test finished with active jobs: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Lac:
            kotlinx.coroutines.test.UncompletedCoroutinesError r0 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.String r1 = "Unfinished coroutines during teardown. Ensure all coroutines are completed or cancelled by your test."
            r0.<init>(r1)
            throw r0
        Lb4:
            r1 = move-exception
            goto Lbe
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "Attempting to clean up a test coroutine scope more than once."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            throw r1     // Catch: java.lang.Throwable -> Lb4
        Lbe:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o40.f0.F0():void");
    }

    @Override // o40.d0
    @m80.k
    public b0 I() {
        d.b bVar = getCoroutineContext().get(b0.f75722g);
        kotlin.jvm.internal.g0.m(bVar);
        return (b0) bVar;
    }

    public final boolean a(@m80.k Throwable th2) {
        boolean z11;
        synchronized (this.f75738b) {
            if (this.f75740d) {
                z11 = false;
            } else {
                this.f75739c.add(th2);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f75737a;
    }
}
