package u3;

import c40.r0;
import c40.x0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import n40.g;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSingleTaskExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleTaskExecutor.kt\ncom/baicizhan/app/biz/base/concurrent/SingleTaskExecutor\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,69:1\n116#2,11:70\n116#2,11:81\n116#2,11:92\n*S KotlinDebug\n*F\n+ 1 SingleTaskExecutor.kt\ncom/baicizhan/app/biz/base/concurrent/SingleTaskExecutor\n*L\n35#1:70,11\n55#1:81,11\n65#1:92,11\n*E\n"})
/* loaded from: classes3.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r0 f91572a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n40.a f91573b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public x0<? extends T> f91574c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.concurrent.SingleTaskExecutor", f = "SingleTaskExecutor.kt", i = {0, 0}, l = {75}, m = "cancel", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    /* renamed from: u3.a$a, reason: collision with other inner class name */
    public static final class C1220a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91575a;

        /* renamed from: b, reason: collision with root package name */
        public int f91576b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f91577c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<T> f91578d;

        /* renamed from: e, reason: collision with root package name */
        public int f91579e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1220a(a<T> aVar, j00.c<? super C1220a> cVar) {
            super(cVar);
            this.f91578d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91577c = obj;
            this.f91579e |= Integer.MIN_VALUE;
            return this.f91578d.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.concurrent.SingleTaskExecutor", f = "SingleTaskExecutor.kt", i = {0, 0, 0, 1, 1}, l = {75, 48}, m = "execute", n = {"block", "$this$withLock_u24default$iv", "$i$f$withLock", "block", "task"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91580a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91581b;

        /* renamed from: c, reason: collision with root package name */
        public int f91582c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f91583d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a<T> f91584e;

        /* renamed from: f, reason: collision with root package name */
        public int f91585f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar, j00.c<? super b> cVar) {
            super(cVar);
            this.f91584e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91583d = obj;
            this.f91585f |= Integer.MIN_VALUE;
            return this.f91584e.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.concurrent.SingleTaskExecutor$execute$task$1$1", f = "SingleTaskExecutor.kt", i = {1, 1, 2, 2}, l = {38, 75, 75}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$1", "I$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nSingleTaskExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleTaskExecutor.kt\ncom/baicizhan/app/biz/base/concurrent/SingleTaskExecutor$execute$task$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,69:1\n116#2,11:70\n*S KotlinDebug\n*F\n+ 1 SingleTaskExecutor.kt\ncom/baicizhan/app/biz/base/concurrent/SingleTaskExecutor$execute$task$1$1\n*L\n40#1:70,11\n*E\n"})
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f91586a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91587b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91588c;

        /* renamed from: d, reason: collision with root package name */
        public int f91589d;

        /* renamed from: e, reason: collision with root package name */
        public int f91590e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super T>, Object> f91591f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a<T> f91592g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.l<? super j00.c<? super T>, ? extends Object> lVar, a<T> aVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f91591f = lVar;
            this.f91592g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f91591f, this.f91592g, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
        
            if (r8 == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, u3.a<T>] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f91590e
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L3f
                if (r1 == r5) goto L39
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1b
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r0 = r7.f91588c
                u3.a r0 = (u3.a) r0
                java.lang.Object r1 = r7.f91587b
                n40.a r1 = (n40.a) r1
                java.lang.Object r2 = r7.f91586a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.e.n(r8)
                goto L91
            L2b:
                java.lang.Object r0 = r7.f91588c
                u3.a r0 = (u3.a) r0
                java.lang.Object r1 = r7.f91587b
                n40.a r1 = (n40.a) r1
                java.lang.Object r2 = r7.f91586a
                kotlin.e.n(r8)
                goto L68
            L39:
                kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L3d
                goto L4d
            L3d:
                r8 = move-exception
                goto L76
            L3f:
                kotlin.e.n(r8)
                x00.l<j00.c<? super T>, java.lang.Object> r8 = r7.f91591f     // Catch: java.lang.Throwable -> L3d
                r7.f91590e = r5     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L3d
                if (r8 != r0) goto L4d
                goto L8e
            L4d:
                u3.a<T> r1 = r7.f91592g
                n40.a r1 = u3.a.a(r1)
                u3.a<T> r3 = r7.f91592g
                r7.f91586a = r8
                r7.f91587b = r1
                r7.f91588c = r3
                r7.f91589d = r2
                r7.f91590e = r4
                java.lang.Object r2 = r1.lock(r6, r7)
                if (r2 != r0) goto L66
                goto L8e
            L66:
                r2 = r8
                r0 = r3
            L68:
                u3.a.b(r0, r6)     // Catch: java.lang.Throwable -> L71
                yz.g2 r8 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L71
                r1.unlock(r6)
                return r2
            L71:
                r8 = move-exception
                r1.unlock(r6)
                throw r8
            L76:
                u3.a<T> r1 = r7.f91592g
                n40.a r1 = u3.a.a(r1)
                u3.a<T> r4 = r7.f91592g
                r7.f91586a = r8
                r7.f91587b = r1
                r7.f91588c = r4
                r7.f91589d = r2
                r7.f91590e = r3
                java.lang.Object r2 = r1.lock(r6, r7)
                if (r2 != r0) goto L8f
            L8e:
                return r0
            L8f:
                r2 = r8
                r0 = r4
            L91:
                u3.a.b(r0, r6)     // Catch: java.lang.Throwable -> L9a
                yz.g2 r8 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L9a
                r1.unlock(r6)
                throw r2
            L9a:
                r8 = move-exception
                r1.unlock(r6)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: u3.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.concurrent.SingleTaskExecutor", f = "SingleTaskExecutor.kt", i = {0, 0}, l = {75}, m = "isRunning", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91593a;

        /* renamed from: b, reason: collision with root package name */
        public int f91594b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f91595c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<T> f91596d;

        /* renamed from: e, reason: collision with root package name */
        public int f91597e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<T> aVar, j00.c<? super d> cVar) {
            super(cVar);
            this.f91596d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91595c = obj;
            this.f91597e |= Integer.MIN_VALUE;
            return this.f91596d.e(this);
        }
    }

    public a(@k r0 scope) {
        g0.p(scope, "scope");
        this.f91572a = scope;
        this.f91573b = g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:11:0x004a, B:13:0x004e, B:14:0x0054), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof u3.a.C1220a
            if (r0 == 0) goto L13
            r0 = r6
            u3.a$a r0 = (u3.a.C1220a) r0
            int r1 = r0.f91579e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91579e = r1
            goto L18
        L13:
            u3.a$a r0 = new u3.a$a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f91577c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91579e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f91575a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e.n(r6)
            n40.a r6 = r5.f91573b
            r0.f91575a = r6
            r2 = 0
            r0.f91576b = r2
            r0.f91579e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            c40.x0<? extends T> r6 = r5.f91574c     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L54
            c40.l2.a.b(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r6 = move-exception
            goto L5c
        L54:
            r5.f91574c = r4     // Catch: java.lang.Throwable -> L52
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L52
            r0.unlock(r4)
            return r6
        L5c:
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a.c(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r14.lock(null, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:17:0x0060, B:19:0x0064), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k x00.l<? super j00.c<? super T>, ? extends java.lang.Object> r13, @m80.k j00.c<? super T> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof u3.a.b
            if (r0 == 0) goto L13
            r0 = r14
            u3.a$b r0 = (u3.a.b) r0
            int r1 = r0.f91585f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91585f = r1
            goto L18
        L13:
            u3.a$b r0 = new u3.a$b
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f91583d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91585f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r13 = r0.f91581b
            c40.x0 r13 = (c40.x0) r13
            java.lang.Object r13 = r0.f91580a
            x00.l r13 = (x00.l) r13
            kotlin.e.n(r14)
            return r14
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3d:
            java.lang.Object r13 = r0.f91581b
            n40.a r13 = (n40.a) r13
            java.lang.Object r2 = r0.f91580a
            x00.l r2 = (x00.l) r2
            kotlin.e.n(r14)
            r14 = r13
            r13 = r2
            goto L60
        L4b:
            kotlin.e.n(r14)
            n40.a r14 = r12.f91573b
            r0.f91580a = r13
            r0.f91581b = r14
            r2 = 0
            r0.f91582c = r2
            r0.f91585f = r4
            java.lang.Object r2 = r14.lock(r5, r0)
            if (r2 != r1) goto L60
            goto L90
        L60:
            c40.x0<? extends T> r2 = r12.f91574c     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L79
            c40.r0 r6 = r12.f91572a     // Catch: java.lang.Throwable -> L76
            u3.a$c r9 = new u3.a$c     // Catch: java.lang.Throwable -> L76
            r9.<init>(r13, r12, r5)     // Catch: java.lang.Throwable -> L76
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            c40.x0 r2 = c40.i.b(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L76
            r12.f91574c = r2     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            r0 = move-exception
            r13 = r0
            goto L92
        L79:
            r14.unlock(r5)
            java.lang.Object r13 = l00.k.a(r13)
            r0.f91580a = r13
            java.lang.Object r13 = l00.k.a(r2)
            r0.f91581b = r13
            r0.f91585f = r3
            java.lang.Object r13 = r2.i(r0)
            if (r13 != r1) goto L91
        L90:
            return r1
        L91:
            return r13
        L92:
            r14.unlock(r5)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a.d(x00.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k j00.c<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof u3.a.d
            if (r0 == 0) goto L13
            r0 = r7
            u3.a$d r0 = (u3.a.d) r0
            int r1 = r0.f91597e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91597e = r1
            goto L18
        L13:
            u3.a$d r0 = new u3.a$d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f91595c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91597e
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f91593a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r7)
            goto L4a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.e.n(r7)
            n40.a r7 = r6.f91573b
            r0.f91593a = r7
            r0.f91594b = r3
            r0.f91597e = r4
            java.lang.Object r0 = r7.lock(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r7
        L4a:
            c40.x0<? extends T> r7 = r6.f91574c     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L58
            boolean r7 = r7.isActive()     // Catch: java.lang.Throwable -> L56
            if (r7 != r4) goto L58
            r3 = r4
            goto L58
        L56:
            r7 = move-exception
            goto L60
        L58:
            java.lang.Boolean r7 = l00.a.a(r3)     // Catch: java.lang.Throwable -> L56
            r0.unlock(r5)
            return r7
        L60:
            r0.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a.e(j00.c):java.lang.Object");
    }
}
