package e40;

import c40.r0;
import c40.s0;
import h40.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n11#2:364\n11#2:365\n11#2:369\n11#2:372\n11#2:378\n11#2:379\n11#2:385\n11#2:388\n11#2:389\n11#2:390\n774#3:366\n865#3,2:367\n1863#3,2:370\n1755#3,3:373\n1863#3,2:376\n1863#3,2:380\n774#3:382\n865#3,2:383\n1863#3,2:386\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n115#1:364\n137#1:365\n162#1:369\n186#1:372\n228#1:378\n280#1:379\n292#1:385\n304#1:388\n331#1:389\n343#1:390\n138#1:366\n138#1:367,2\n175#1:370,2\n191#1:373,3\n200#1:376,2\n282#1:380,2\n287#1:382\n287#1:383,2\n295#1:386,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e<E> extends m<E> implements e40.d<E> {

    /* renamed from: m, reason: collision with root package name */
    public final int f49023m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final ReentrantLock f49024n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public List<? extends m<E>> f49025o;

    /* renamed from: p, reason: collision with root package name */
    @m80.l
    public Object f49026p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final HashMap<k40.n<?>, Object> f49027q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,363:1\n11#2:364\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n311#1:364\n*E\n"})
    public final class a extends m<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(e.this.B2(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // e40.m
        /* renamed from: y2, reason: merged with bridge method [inline-methods] */
        public boolean b0(@m80.l Throwable th2) {
            ReentrantLock reentrantLock = e.this.f49024n;
            e<E> eVar = e.this;
            reentrantLock.lock();
            try {
                eVar.G2(this);
                return super.b0(th2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends c0<E> {
        public b() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // e40.m
        /* renamed from: C2, reason: merged with bridge method [inline-methods] */
        public boolean b0(@m80.l Throwable th2) {
            e.this.G2(this);
            return super.b0(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n11#2:364\n1#3:365\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n253#1:364\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f49030a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e<E> f49031b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f49032c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k40.n<?> f49033d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e<E> eVar, Object obj, k40.n<?> nVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f49031b = eVar;
            this.f49032c = obj;
            this.f49033d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f49031b, this.f49032c, this.f49033d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f49030a;
            boolean z11 = true;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    e<E> eVar = this.f49031b;
                    Object obj2 = this.f49032c;
                    this.f49030a = 1;
                    if (eVar.b(obj2, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
            } catch (Throwable th2) {
                if (!this.f49031b.o() || (!(th2 instanceof ClosedSendChannelException) && this.f49031b.K0() != th2)) {
                    throw th2;
                }
                z11 = false;
            }
            ReentrantLock reentrantLock = this.f49031b.f49024n;
            e<E> eVar2 = this.f49031b;
            k40.n<?> nVar = this.f49033d;
            reentrantLock.lock();
            try {
                eVar2.f49027q.put(nVar, z11 ? g2.f100423a : n.z());
                kotlin.jvm.internal.g0.n(nVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                g2 g2Var = g2.f100423a;
                if (((k40.m) nVar).L(eVar2, g2Var) != TrySelectDetailedResult.REREGISTER) {
                    eVar2.f49027q.remove(nVar);
                }
                reentrantLock.unlock();
                return g2Var;
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {179}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49034a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49035b;

        /* renamed from: c, reason: collision with root package name */
        public Object f49036c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49037d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e<E> f49038e;

        /* renamed from: f, reason: collision with root package name */
        public int f49039f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e<E> eVar, j00.c<? super d> cVar) {
            super(cVar);
            this.f49038e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49037d = obj;
            this.f49039f |= Integer.MIN_VALUE;
            return this.f49038e.b(null, this);
        }
    }

    public e(int i11) {
        super(0, null);
        x0 x0Var;
        this.f49023m = i11;
        if (i11 < 1 && i11 != -1) {
            throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i11 + " was specified").toString());
        }
        this.f49024n = new ReentrantLock();
        this.f49025o = a00.h0.J();
        x0Var = f.f49041a;
        this.f49026p = x0Var;
        this.f49027q = new HashMap<>();
    }

    public final int B2() {
        return this.f49023m;
    }

    public final E C2() {
        x0 x0Var;
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            if (o()) {
                Throwable u02 = u0();
                if (u02 == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw u02;
            }
            Object obj = this.f49026p;
            x0Var = f.f49041a;
            if (obj == x0Var) {
                throw new IllegalStateException("No value");
            }
            E e11 = (E) this.f49026p;
            reentrantLock.unlock();
            return e11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @m80.l
    public final E E2() {
        x0 x0Var;
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            E e11 = null;
            if (!P()) {
                Object obj = this.f49026p;
                x0Var = f.f49041a;
                if (obj != x0Var) {
                    e11 = (E) this.f49026p;
                }
            }
            return e11;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G2(k0<? extends E> k0Var) {
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            List<? extends m<E>> list = this.f49025o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((m) obj) != k0Var) {
                    arrayList.add(obj);
                }
            }
            this.f49025o = arrayList;
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // e40.m
    public void N1(@m80.k k40.n<?> nVar, @m80.l Object obj) {
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            Object remove = this.f49027q.remove(nVar);
            if (remove != null) {
                nVar.e(remove);
                reentrantLock.unlock();
            } else {
                g2 g2Var = g2.f100423a;
                reentrantLock.unlock();
                c40.k.f(s0.a(nVar.getContext()), null, CoroutineStart.UNDISPATCHED, new c(this, obj, nVar, null), 1, null);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:10:0x0080). Please report as a decompilation issue!!! */
    @Override // e40.m, e40.l0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(E r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof e40.e.d
            if (r0 == 0) goto L13
            r0 = r8
            e40.e$d r0 = (e40.e.d) r0
            int r1 = r0.f49039f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49039f = r1
            goto L18
        L13:
            e40.e$d r0 = new e40.e$d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f49037d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49039f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f49036c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f49035b
            java.lang.Object r4 = r0.f49034a
            e40.e r4 = (e40.e) r4
            kotlin.e.n(r8)
            goto L80
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.e.n(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f49024n
            r8.lock()
            boolean r2 = r6.o()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto L99
            int r2 = r6.f49023m     // Catch: java.lang.Throwable -> L51
            r4 = -1
            if (r2 != r4) goto L53
            r6.f49026p = r7     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r7 = move-exception
            goto L9e
        L53:
            java.util.List<? extends e40.m<E>> r2 = r6.f49025o     // Catch: java.lang.Throwable -> L51
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r8
            r8 = r7
            r7 = r4
            r4 = r6
        L62:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            e40.m r2 = (e40.m) r2
            r0.f49034a = r4
            r0.f49035b = r8
            r0.f49036c = r7
            r0.f49039f = r3
            java.lang.Object r2 = r2.T1(r8, r0)
            if (r2 != r1) goto L7d
            return r1
        L7d:
            r5 = r2
            r2 = r8
            r8 = r5
        L80:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L94
            boolean r8 = r4.o()
            if (r8 != 0) goto L8f
            goto L94
        L8f:
            java.lang.Throwable r7 = r4.K0()
            throw r7
        L94:
            r8 = r2
            goto L62
        L96:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L99:
            java.lang.Throwable r7 = r6.K0()     // Catch: java.lang.Throwable -> L51
            throw r7     // Catch: java.lang.Throwable -> L51
        L9e:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.e.b(java.lang.Object, j00.c):java.lang.Object");
    }

    @Override // e40.m
    public boolean b0(@m80.l Throwable th2) {
        x0 x0Var;
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f49025o.iterator();
            while (it.hasNext()) {
                ((m) it.next()).b0(th2);
            }
            x0Var = f.f49041a;
            this.f49026p = x0Var;
            boolean b02 = super.b0(th2);
            reentrantLock.unlock();
            return b02;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // e40.d
    @m80.k
    public k0<E> h() {
        x0 x0Var;
        x0 x0Var2;
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            a bVar = this.f49023m == -1 ? new b() : new a();
            if (o()) {
                Object obj = this.f49026p;
                x0Var2 = f.f49041a;
                if (obj == x0Var2) {
                    ((m) bVar).z(u0());
                    reentrantLock.unlock();
                    return bVar;
                }
            }
            Object obj2 = this.f49026p;
            x0Var = f.f49041a;
            if (obj2 != x0Var) {
                ((m) bVar).m(C2());
            }
            this.f49025o = a00.r0.J4(this.f49025o, bVar);
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // e40.m, e40.l0
    @m80.k
    public Object m(E e11) {
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            if (o()) {
                return super.m(e11);
            }
            List<? extends m<E>> list = this.f49025o;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((m) it.next()).j2()) {
                        return s.f49161b.b();
                    }
                }
            }
            if (this.f49023m == -1) {
                this.f49026p = e11;
            }
            Iterator<T> it2 = this.f49025o.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).m(e11);
            }
            return s.f49161b.c(g2.f100423a);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // e40.m, e40.l0
    public boolean o() {
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            return super.o();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // e40.m
    @m80.k
    public String toString() {
        x0 x0Var;
        String str;
        StringBuilder sb2 = new StringBuilder();
        Object obj = this.f49026p;
        x0Var = f.f49041a;
        if (obj != x0Var) {
            str = "CONFLATED_ELEMENT=" + this.f49026p + "; ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("BROADCAST=<");
        sb2.append(super.toString());
        sb2.append(">; SUBSCRIBERS=");
        sb2.append(a00.r0.r3(this.f49025o, com.alipay.sdk.m.u.i.f11097b, "<", ">", 0, null, null, 56, null));
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e40.m, e40.l0
    public boolean z(@m80.l Throwable th2) {
        ReentrantLock reentrantLock = this.f49024n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f49025o.iterator();
            while (it.hasNext()) {
                ((m) it.next()).z(th2);
            }
            List<? extends m<E>> list = this.f49025o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((m) obj).S0()) {
                    arrayList.add(obj);
                }
            }
            this.f49025o = arrayList;
            boolean z11 = super.z(th2);
            reentrantLock.unlock();
            return z11;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public static /* synthetic */ void D2() {
    }

    public static /* synthetic */ void F2() {
    }
}
