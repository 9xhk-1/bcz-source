package j7;

import c4.o;
import c40.l3;
import c40.r0;
import c40.s0;
import c40.x0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.j;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c(binds = {i7.a.class})
@j(i7.c.f60215c)
@u0({"SMAP\nIOnceSyncTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOnceSyncTask.kt\ncom/baicizhan/app/biz/synservice/task/SyncOnceTask\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n195#2:57\n387#3:58\n1869#4:59\n1870#4:61\n1#5:60\n*S KotlinDebug\n*F\n+ 1 IOnceSyncTask.kt\ncom/baicizhan/app/biz/synservice/task/SyncOnceTask\n*L\n35#1:57\n35#1:58\n51#1:59\n51#1:61\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements i7.a, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i7.a f63673b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r0 f63674c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.synservice.task.SyncOnceTask", f = "IOnceSyncTask.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {52, 54}, m = "sync", n = {"list", "child", "$this$forEach$iv", "element$iv", "it", "$this$sync_u24lambda_u242_u240", "$i$f$forEach", "$i$a$-forEach-SyncOnceTask$sync$4", "$i$a$-runCatching-SyncOnceTask$sync$4$1", "list", "child"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "L$0", "L$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f63675a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63676b;

        /* renamed from: c, reason: collision with root package name */
        public Object f63677c;

        /* renamed from: d, reason: collision with root package name */
        public Object f63678d;

        /* renamed from: e, reason: collision with root package name */
        public Object f63679e;

        /* renamed from: f, reason: collision with root package name */
        public Object f63680f;

        /* renamed from: g, reason: collision with root package name */
        public Object f63681g;

        /* renamed from: h, reason: collision with root package name */
        public int f63682h;

        /* renamed from: i, reason: collision with root package name */
        public int f63683i;

        /* renamed from: j, reason: collision with root package name */
        public int f63684j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f63685k;

        /* renamed from: m, reason: collision with root package name */
        public int f63687m;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63685k = obj;
            this.f63687m |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.synservice.task.SyncOnceTask$sync$3$1", f = "IOnceSyncTask.kt", i = {1, 1}, l = {44, 62}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    @u0({"SMAP\nIOnceSyncTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOnceSyncTask.kt\ncom/baicizhan/app/biz/synservice/task/SyncOnceTask$sync$3$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,56:1\n116#2,11:57\n*S KotlinDebug\n*F\n+ 1 IOnceSyncTask.kt\ncom/baicizhan/app/biz/synservice/task/SyncOnceTask$sync$3$1\n*L\n45#1:57,11\n*E\n"})
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f63688a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63689b;

        /* renamed from: c, reason: collision with root package name */
        public int f63690c;

        /* renamed from: d, reason: collision with root package name */
        public int f63691d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j7.a f63692e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j7.a aVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f63692e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f63692e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        
            if (r12.a(r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f63691d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r11.f63689b
                j7.a r0 = (j7.a) r0
                java.lang.Object r1 = r11.f63688a
                n40.a r1 = (n40.a) r1
                kotlin.e.n(r12)
                goto L6d
            L1b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L23:
                kotlin.e.n(r12)
                goto L56
            L27:
                kotlin.e.n(r12)
                z6.b r5 = z6.b.f101032b
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r1 = "SYNC "
                r12.append(r1)
                j7.a r1 = r11.f63692e
                java.lang.String r1 = r1.getKey()
                r12.append(r1)
                java.lang.String r7 = r12.toString()
                r9 = 4
                r10 = 0
                java.lang.String r6 = "SynService"
                r8 = 0
                z6.b.j(r5, r6, r7, r8, r9, r10)
                j7.a r12 = r11.f63692e
                r11.f63691d = r3
                java.lang.Object r12 = r12.a(r11)
                if (r12 != r0) goto L56
                goto L6b
            L56:
                n40.a r1 = j7.b.a()
                j7.a r12 = r11.f63692e
                r11.f63688a = r1
                r11.f63689b = r12
                r3 = 0
                r11.f63690c = r3
                r11.f63691d = r2
                java.lang.Object r2 = r1.lock(r4, r11)
                if (r2 != r0) goto L6c
            L6b:
                return r0
            L6c:
                r0 = r12
            L6d:
                java.util.List r12 = j7.b.b()     // Catch: java.lang.Throwable -> L9f
                java.lang.String r0 = r0.getKey()     // Catch: java.lang.Throwable -> L9f
                r12.add(r0)     // Catch: java.lang.Throwable -> L9f
                r1.unlock(r4)
                z6.b r5 = z6.b.f101032b
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "SYNC success "
                r12.append(r0)
                j7.a r0 = r11.f63692e
                java.lang.String r0 = r0.getKey()
                r12.append(r0)
                java.lang.String r7 = r12.toString()
                r9 = 4
                r10 = 0
                java.lang.String r6 = "SynService"
                r8 = 0
                z6.b.j(r5, r6, r7, r8, r9, r10)
                yz.g2 r12 = yz.g2.f100423a
                return r12
            L9f:
                r0 = move-exception
                r12 = r0
                r1.unlock(r4)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: j7.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.synservice.task.SyncOnceTask$sync$child$1", f = "IOnceSyncTask.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f63693a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f63693a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i7.a aVar = e.this.f63673b;
                this.f63693a = 1;
                if (aVar.a(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public e(@oa0.d @k i7.a task) {
        g0.p(task, "task");
        this.f63673b = task;
        this.f63674c = s0.a(o.b().plus(l3.c(null, 1, null)));
    }

    public static final boolean e(j7.a it) {
        g0.p(it, "it");
        return !j7.b.b().contains(it.getKey());
    }

    public static final x0 f(e eVar, j7.a it) {
        x0 b11;
        g0.p(it, "it");
        b11 = c40.k.b(eVar.f63674c, null, null, new b(it, null), 3, null);
        return b11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0131, code lost:
    
        if (r11.i(r2) == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0102 -> B:19:0x0105). Please report as a decompilation issue!!! */
    @Override // i7.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.e.a(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
