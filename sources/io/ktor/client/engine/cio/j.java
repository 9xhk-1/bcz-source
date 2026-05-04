package io.ktor.client.engine.cio;

import c40.l2;
import c40.p2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import kx.f0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f60887a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.g f60888b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.m f60889c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.h f60890d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final e40.o<n> f60891e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final l2 f60892f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final l2 f60893g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1", f = "ConnectionPipeline.kt", i = {1, 2}, l = {44, 49, 50, 56, 57}, m = "invokeSuspend", n = {"task", "task"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60894a;

        /* renamed from: b, reason: collision with root package name */
        public int f60895b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f60896c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f60897d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f60898e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e40.o<z> f60899f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1$task$1", f = "ConnectionPipeline.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.client.engine.cio.j$a$a, reason: collision with other inner class name */
        public static final class C0702a extends SuspendLambda implements x00.p<r0, j00.c<? super z>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f60900a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e40.o<z> f60901b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0702a(e40.o<z> oVar, j00.c<? super C0702a> cVar) {
                super(2, cVar);
                this.f60901b = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0702a(this.f60901b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super z> cVar) {
                return ((C0702a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f60900a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                e40.o<z> oVar = this.f60901b;
                this.f60900a = 1;
                Object H = oVar.H(this);
                return H == l11 ? l11 : H;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, j jVar, boolean z11, e40.o<z> oVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f60896c = j11;
            this.f60897d = jVar;
            this.f60898e = z11;
            this.f60899f = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f60896c, this.f60897d, this.f60898e, this.f60899f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
        
            if (r15.b(r8, r14) != r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
        
            if (r15.g(r14) != r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x005e, code lost:
        
            if (r15 == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c7 -> B:5:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.ConnectionPipeline$responseHandler$1", f = "ConnectionPipeline.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4}, l = {74, 77, 122, 132, 137, 142, 142}, m = "invokeSuspend", n = {"$this$launch", "shouldClose", "$this$launch", "requestTime", "task", "shouldClose", "$this$launch", "task", "skipTask", "$this$use$iv", "shouldClose", "$this$launch", "task", "shouldClose", "$this$launch", "shouldClose"}, s = {"L$0", "I$0", "L$0", "L$2", "L$3", "I$0", "L$0", "L$2", "L$3", "L$4", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    @u0({"SMAP\nConnectionPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPipeline.kt\nio/ktor/client/engine/cio/ConnectionPipeline$responseHandler$1\n+ 2 Readers.kt\nio/ktor/util/cio/ReadersKt\n*L\n1#1,181:1\n29#2,9:182\n*S KotlinDebug\n*F\n+ 1 ConnectionPipeline.kt\nio/ktor/client/engine/cio/ConnectionPipeline$responseHandler$1\n*L\n121#1:182,9\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60902a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60903b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60904c;

        /* renamed from: d, reason: collision with root package name */
        public Object f60905d;

        /* renamed from: e, reason: collision with root package name */
        public int f60906e;

        /* renamed from: f, reason: collision with root package name */
        public int f60907f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f60908g;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ tx.p f60910i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tx.p pVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f60910i = pVar;
        }

        public static final g2 k(f0 f0Var, ix.r0 r0Var) {
            r0Var.j(new kx.c(f0Var.a()));
            f0Var.a().p();
            return g2.f100423a;
        }

        public static final g2 m(io.ktor.utils.io.g gVar, Throwable th2) {
            io.ktor.utils.io.h.a(gVar);
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = j.this.new b(this.f60910i, cVar);
            bVar.f60908g = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(28:34|(1:35)|36|(3:160|161|(24:163|39|40|41|42|43|(2:151|152)|45|(12:150|48|(3:132|133|(3:135|136|(9:140|141|(5:121|122|123|124|125)(4:54|55|56|57)|58|59|60|61|62|(7:64|65|66|67|68|69|(8:71|72|73|74|(2:83|84)|76|77|(2:79|(3:81|16|(3:18|19|(0)(0))))(2:82|(0))))(5:109|(0)|76|77|(0)(0)))))|51|52|(0)(0)|58|59|60|61|62|(0)(0))|47|48|(0)|132|133|(0)|51|52|(0)(0)|58|59|60|61|62|(0)(0)))|38|39|40|41|42|43|(0)|45|(0)|47|48|(0)|132|133|(0)|51|52|(0)(0)|58|59|60|61|62|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(5:121|122|123|124|125) */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x02ab, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x02d8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x02d9, code lost:
        
            r19 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x021f, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0220, code lost:
        
            r1 = r10;
            r19 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x02e9, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x02ea, code lost:
        
            r19 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x01b3, code lost:
        
            if (kotlin.jvm.internal.g0.g(r5, r0.b()) == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:158:0x02f2, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x02f3, code lost:
        
            r19 = 1;
            r1 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:185:0x0382, code lost:
        
            if (r0.j(r25) == r8) goto L172;
         */
        /* JADX WARN: Code restructure failed: missing block: B:207:0x03a9, code lost:
        
            if (r1.j(r25) != r8) goto L173;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x02cd, code lost:
        
            if (r5.K0(r25) == r8) goto L172;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:109:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x030d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0365  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e6 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #16 {all -> 0x0036, blocks: (B:14:0x002d, B:19:0x00c4, B:24:0x00de, B:26:0x00e6, B:77:0x0334, B:79:0x0342, B:88:0x032c, B:200:0x00a9, B:203:0x00b9), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011f A[Catch: all -> 0x0305, TRY_LEAVE, TryCatch #3 {all -> 0x0305, blocks: (B:32:0x011b, B:34:0x011f), top: B:31:0x011b }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01cd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0253 A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #10 {all -> 0x02ab, blocks: (B:62:0x0247, B:64:0x0253), top: B:61:0x0247 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0342 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #16 {all -> 0x0036, blocks: (B:14:0x002d, B:19:0x00c4, B:24:0x00de, B:26:0x00e6, B:77:0x0334, B:79:0x0342, B:88:0x032c, B:200:0x00a9, B:203:0x00b9), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v64, types: [io.ktor.utils.io.g] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0359 -> B:16:0x035a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0360 -> B:17:0x0362). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 970
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(long j11, int i11, @m80.k tx.p connection, boolean z11, @m80.k e40.o<z> tasks, @m80.k kotlin.coroutines.d parentContext) {
        c40.a0 c11;
        l2 f11;
        l2 f12;
        g0.p(connection, "connection");
        g0.p(tasks, "tasks");
        g0.p(parentContext, "parentContext");
        c11 = p2.c(null, 1, null);
        this.f60887a = parentContext.plus(c11);
        this.f60888b = connection.a();
        this.f60889c = connection.b();
        this.f60890d = n40.l.b(i11, 0, 2, null);
        this.f60891e = e40.r.d(Integer.MAX_VALUE, null, null, 6, null);
        CoroutineStart coroutineStart = CoroutineStart.LAZY;
        f11 = c40.k.f(this, null, coroutineStart, new a(j11, this, z11, tasks, null), 1, null);
        this.f60892f = f11;
        f12 = c40.k.f(this, null, coroutineStart, new b(connection, null), 1, null);
        this.f60893g = f12;
        f11.start();
        f12.start();
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f60887a;
    }

    @m80.k
    public final l2 h() {
        return this.f60892f;
    }
}
