package u9;

import a00.w0;
import a00.y0;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import com.baicizhan.client.business.managers.experience.TaskAction;
import com.baicizhan.client.business.managers.experience.data.db.TaskRecord;
import com.baicizhan.online.user_study_api.TaskUploadReq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import m80.k;
import q30.k0;
import q30.o;
import q30.q;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nITaskRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ITaskRepo.kt\ncom/baicizhan/client/business/managers/experience/TaskRepoImpl\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n47#2,4:82\n47#2,4:92\n1550#3:86\n126#4:87\n153#4,3:88\n1#5:91\n*S KotlinDebug\n*F\n+ 1 ITaskRepo.kt\ncom/baicizhan/client/business/managers/experience/TaskRepoImpl\n*L\n37#1:82,4\n71#1:92,4\n59#1:86\n59#1:87\n59#1:88,3\n*E\n"})
/* loaded from: classes4.dex */
public final class h implements u9.f {

    /* renamed from: d, reason: collision with root package name */
    public static final int f92053d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final wc.a f92054a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.client.business.managers.experience.data.remote.c f92055b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r0 f92056c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ITaskRepo.kt\ncom/baicizhan/client/business/managers/experience/TaskRepoImpl\n*L\n1#1,49:1\n72#2,2:50\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements n0 {
        public a(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            qb.c.c(u9.g.f92052a, "", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.TaskRepoImpl$clean$2", f = "ITaskRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92057a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f92057a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.i(u9.g.f92052a, "clean " + h.this.f92054a.a(), new Object[0]);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.TaskRepoImpl$doSync$1$4$1", f = "ITaskRepo.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92059a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<TaskUploadReq> f92061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends TaskUploadReq> list, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f92061c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new c(this.f92061c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92059a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.i<Boolean> a11 = h.this.f92055b.a(this.f92061c);
                this.f92059a = 1;
                if (kotlinx.coroutines.flow.k.z(a11, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 ITaskRepo.kt\ncom/baicizhan/client/business/managers/experience/TaskRepoImpl\n*L\n1#1,3794:1\n59#2:3795\n*E\n"})
    public static final class d implements w0<TaskRecord, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f92062a;

        public d(Iterable iterable) {
            this.f92062a = iterable;
        }

        @Override // a00.w0
        public String a(TaskRecord taskRecord) {
            return taskRecord.getAction();
        }

        @Override // a00.w0
        public Iterator<TaskRecord> b() {
            return this.f92062a.iterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ITaskRepo.kt\ncom/baicizhan/client/business/managers/experience/TaskRepoImpl\n*L\n1#1,49:1\n38#2,2:50\n*E\n"})
    public static final class e extends kotlin.coroutines.a implements n0 {
        public e(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            qb.c.c(u9.g.f92052a, "", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.TaskRepoImpl$doTask$2", f = "ITaskRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92063a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f92065c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f92066d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TaskAction f92067e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.client.business.managers.experience.TaskRepoImpl$doTask$2$1", f = "ITaskRepo.kt", i = {0, 0, 0}, l = {42}, m = "invokeSuspend", n = {"$this$sequence", "it", "$i$a$-repeat-TaskRepoImpl$doTask$2$1$1"}, s = {"L$0", "I$2", "I$3"}, v = 1)
        public static final class a extends RestrictedSuspendLambda implements p<o<? super TaskRecord>, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f92068a;

            /* renamed from: b, reason: collision with root package name */
            public int f92069b;

            /* renamed from: c, reason: collision with root package name */
            public int f92070c;

            /* renamed from: d, reason: collision with root package name */
            public int f92071d;

            /* renamed from: e, reason: collision with root package name */
            public int f92072e;

            /* renamed from: f, reason: collision with root package name */
            public int f92073f;

            /* renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f92074g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ int f92075h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ TaskAction f92076i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i11, TaskAction taskAction, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f92075h = i11;
                this.f92076i = taskAction;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f92075h, this.f92076i, cVar);
                aVar.f92074g = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0053 -> B:5:0x0056). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r16
                    java.lang.Object r1 = r0.f92074g
                    q30.o r1 = (q30.o) r1
                    java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
                    int r3 = r0.f92073f
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L26
                    if (r3 != r5) goto L1e
                    int r3 = r0.f92070c
                    int r6 = r0.f92069b
                    java.lang.Object r7 = r0.f92068a
                    com.baicizhan.client.business.managers.experience.TaskAction r7 = (com.baicizhan.client.business.managers.experience.TaskAction) r7
                    kotlin.e.n(r17)
                    goto L56
                L1e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L26:
                    kotlin.e.n(r17)
                    int r3 = r0.f92075h
                    com.baicizhan.client.business.managers.experience.TaskAction r6 = r0.f92076i
                    r7 = r6
                    r6 = r3
                    r3 = r4
                L30:
                    if (r3 >= r6) goto L58
                    com.baicizhan.client.business.managers.experience.data.db.TaskRecord r8 = new com.baicizhan.client.business.managers.experience.data.db.TaskRecord
                    java.lang.String r11 = u9.a.a(r7)
                    r14 = 5
                    r15 = 0
                    r9 = 0
                    r12 = 0
                    r8.<init>(r9, r11, r12, r14, r15)
                    r0.f92074g = r1
                    r0.f92068a = r7
                    r0.f92069b = r6
                    r0.f92070c = r3
                    r0.f92071d = r3
                    r0.f92072e = r4
                    r0.f92073f = r5
                    java.lang.Object r8 = r1.b(r8, r0)
                    if (r8 != r2) goto L56
                    return r2
                L56:
                    int r3 = r3 + r5
                    goto L30
                L58:
                    yz.g2 r1 = yz.g2.f100423a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: u9.h.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // x00.p
            public final Object invoke(o<? super TaskRecord> oVar, j00.c<? super g2> cVar) {
                return ((a) create(oVar, cVar)).invokeSuspend(g2.f100423a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z11, int i11, TaskAction taskAction, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f92065c = z11;
            this.f92066d = i11;
            this.f92067e = taskAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new f(this.f92065c, this.f92066d, this.f92067e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f92063a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            h.this.f92054a.e(k0.I3(q.b(new a(this.f92066d, this.f92067e, null))));
            if (this.f92065c) {
                h.this.h();
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.TaskRepoImpl$sync$1", f = "ITaskRepo.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"}, v = 1)
    public static final class g extends SuspendLambda implements p<j<? super Boolean>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92077a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92078b;

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = h.this.new g(cVar);
            gVar.f92078b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f92078b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92077a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                h.this.h();
                Boolean a11 = l00.a.a(true);
                this.f92078b = l00.k.a(jVar);
                this.f92077a = 1;
                if (jVar.emit(a11, this) == l11) {
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

        @Override // x00.p
        public final Object invoke(j<? super Boolean> jVar, j00.c<? super g2> cVar) {
            return ((g) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @Inject
    public h(@k wc.a taskDao, @k com.baicizhan.client.business.managers.experience.data.remote.c taskRemote) {
        g0.p(taskDao, "taskDao");
        g0.p(taskRemote, "taskRemote");
        this.f92054a = taskDao;
        this.f92055b = taskRemote;
        this.f92056c = s0.a(h1.c().plus(l3.c(null, 1, null)));
    }

    @Override // u9.f
    @k
    public kotlinx.coroutines.flow.i<Boolean> a() {
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.K0(new g(null)), h1.c());
    }

    @Override // u9.f
    public void b() {
        c40.k.f(this.f92056c, new a(n0.f7891d0), null, new b(null), 2, null);
    }

    @Override // u9.f
    public void c(@k TaskAction taskAction, boolean z11, int i11) {
        g0.p(taskAction, "taskAction");
        qb.c.b("tjy", "taskAction:" + taskAction, new Object[0]);
        c40.k.f(this.f92056c, new e(n0.f7891d0), null, new f(z11, i11, taskAction, null), 2, null);
    }

    public final void h() {
        synchronized (this) {
            try {
                List<TaskRecord> b11 = this.f92054a.b();
                Map a11 = y0.a(new d(b11));
                ArrayList arrayList = new ArrayList(a11.size());
                for (Map.Entry entry : a11.entrySet()) {
                    qb.c.i(u9.g.f92052a, entry.getKey() + " count " + entry.getValue(), new Object[0]);
                    arrayList.add(new TaskUploadReq((String) entry.getKey(), ((Number) entry.getValue()).intValue()));
                }
                List a62 = a00.r0.a6(arrayList);
                if (a62.isEmpty()) {
                    a62 = null;
                }
                if (a62 != null) {
                    c40.j.b(null, new c(a62, null), 1, null);
                    qb.c.i(u9.g.f92052a, String.valueOf(a62.size()), new Object[0]);
                }
                this.f92054a.d(b11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
