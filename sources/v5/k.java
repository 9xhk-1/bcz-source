package v5;

import com.microsoft.thrifty.service.a;
import f4.v;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f.class})
@u0({"SMAP\nTopicVersionRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicVersionRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/TopicVersionRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n6#2:87\n64#3,2:88\n66#3:91\n67#3,2:97\n6#4:90\n124#5,4:92\n142#6:96\n1193#7,2:99\n1267#7,4:101\n*S KotlinDebug\n*F\n+ 1 TopicVersionRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/TopicVersionRepoImpl\n*L\n46#1:87\n46#1:88,2\n46#1:91\n46#1:97,2\n46#1:90\n46#1:92,4\n46#1:96\n76#1:99,2\n76#1:101,4\n*E\n"})
/* loaded from: classes3.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f93020a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h4.a f93021b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.TopicVersionRepoImpl", f = "TopicVersionRepo.kt", i = {}, l = {80, 80}, m = "clean", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f93022a;

        /* renamed from: c, reason: collision with root package name */
        public int f93024c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93022a = obj;
            this.f93024c |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.TopicVersionRepoImpl", f = "TopicVersionRepo.kt", i = {0, 1, 1, 2, 2, 2}, l = {50, 55, 56}, m = "fetchAndSaveRemoteVersions", n = {"bookId", "updateInfoList", "bookId", "updateInfoList", "db", "bookId"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f93025a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93026b;

        /* renamed from: c, reason: collision with root package name */
        public Object f93027c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f93028d;

        /* renamed from: f, reason: collision with root package name */
        public int f93030f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93028d = obj;
            this.f93030f |= Integer.MIN_VALUE;
            return k.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.TopicVersionRepoImpl$fetchAndSaveRemoteVersions$2", f = "TopicVersionRepo.kt", i = {0, 0, 0, 0, 0}, l = {58}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "info", "$i$f$forEach", "$i$a$-forEach-TopicVersionRepoImpl$fetchAndSaveRemoteVersions$2$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nTopicVersionRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicVersionRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/TopicVersionRepoImpl$fetchAndSaveRemoteVersions$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1869#2,2:87\n*S KotlinDebug\n*F\n+ 1 TopicVersionRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/TopicVersionRepoImpl$fetchAndSaveRemoteVersions$2\n*L\n57#1:87,2\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f93031a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93032b;

        /* renamed from: c, reason: collision with root package name */
        public Object f93033c;

        /* renamed from: d, reason: collision with root package name */
        public Object f93034d;

        /* renamed from: e, reason: collision with root package name */
        public Object f93035e;

        /* renamed from: f, reason: collision with root package name */
        public long f93036f;

        /* renamed from: g, reason: collision with root package name */
        public int f93037g;

        /* renamed from: h, reason: collision with root package name */
        public int f93038h;

        /* renamed from: i, reason: collision with root package name */
        public int f93039i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<t8.d> f93040j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ v f93041k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f93042l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<t8.d> list, v vVar, long j11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f93040j = list;
            this.f93041k = vVar;
            this.f93042l = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f93040j, this.f93041k, this.f93042l, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((c) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0088 -> B:5:0x008b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r7 = r17
                java.lang.Object r8 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r7.f93039i
                r10 = 1
                if (r0 == 0) goto L34
                if (r0 != r10) goto L2c
                int r0 = r7.f93037g
                long r1 = r7.f93036f
                java.lang.Object r3 = r7.f93035e
                t8.d r3 = (t8.d) r3
                java.lang.Object r3 = r7.f93033c
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.f93032b
                f4.v r4 = (f4.v) r4
                java.lang.Object r5 = r7.f93031a
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                kotlin.e.n(r18)
                r11 = r0
                r12 = r3
                r13 = r4
                r14 = r5
                r16 = r10
                r15 = 0
                goto L8b
            L2c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L34:
                kotlin.e.n(r18)
                java.util.List<t8.d> r0 = r7.f93040j
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                f4.v r1 = r7.f93041k
                long r2 = r7.f93042l
                java.util.Iterator r4 = r0.iterator()
                r14 = r0
                r13 = r1
                r1 = r2
                r12 = r4
                r11 = 0
            L48:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L90
                java.lang.Object r0 = r12.next()
                r3 = r0
                t8.d r3 = (t8.d) r3
                r4 = r0
                f4.u1 r0 = r13.c()
                int r5 = r3.f90005a
                long r5 = (long) r5
                int r15 = r3.f90006b
                long r9 = (long) r15
                java.lang.Object r15 = l00.k.a(r14)
                r7.f93031a = r15
                r7.f93032b = r13
                r7.f93033c = r12
                java.lang.Object r4 = l00.k.a(r4)
                r7.f93034d = r4
                java.lang.Object r3 = l00.k.a(r3)
                r7.f93035e = r3
                r7.f93036f = r1
                r7.f93037g = r11
                r15 = 0
                r7.f93038h = r15
                r3 = 1
                r7.f93039i = r3
                r16 = r3
                r3 = r5
                r5 = r9
                java.lang.Object r0 = r0.T(r1, r3, r5, r7)
                if (r0 != r8) goto L8b
                return r8
            L8b:
                r7 = r17
                r10 = r16
                goto L48
            L90:
                yz.g2 r0 = yz.g2.f100423a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.TopicVersionRepoImpl", f = "TopicVersionRepo.kt", i = {0, 0, 1, 1}, l = {73, 75}, m = "getRemoteVersions", n = {"topicIds", "bookId", "topicIds", "bookId"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f93043a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93044b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f93045c;

        /* renamed from: e, reason: collision with root package name */
        public int f93047e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93045c = obj;
            this.f93047e |= Integer.MIN_VALUE;
            return k.this.c(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<t8.g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f93048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f93049b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f93050c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f93051a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f93052b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f93053c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f93051a = eVar;
                this.f93052b = cVar;
                this.f93053c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f93051a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f93051a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f93052b.b(this.f93053c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f93048a = dVar;
            this.f93049b = eVar;
            this.f93050c = cVar;
        }

        public final void a(w7.d<t8.g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f93049b, this.f93050c, this.f93048a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f93048a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<t8.g> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public k(@m80.k p thrift, @m80.k h4.a bczDb) {
        g0.p(thrift, "thrift");
        g0.p(bczDb, "bczDb");
        this.f93020a = thrift;
        this.f93021b = bczDb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r9.R(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // v5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof v5.k.a
            if (r0 == 0) goto L13
            r0 = r9
            v5.k$a r0 = (v5.k.a) r0
            int r1 = r0.f93024c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93024c = r1
            goto L18
        L13:
            v5.k$a r0 = new v5.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f93022a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f93024c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r9)
            goto L55
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            kotlin.e.n(r9)
            goto L46
        L38:
            kotlin.e.n(r9)
            h4.a r9 = r8.f93021b
            r0.f93024c = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L46
            goto L54
        L46:
            f4.v r9 = (f4.v) r9
            f4.u1 r9 = r9.c()
            r0.f93024c = r3
            java.lang.Object r9 = r9.R(r0)
            if (r9 != r1) goto L55
        L54:
            return r1
        L55:
            z6.b r2 = z6.b.f101032b
            r6 = 4
            r7 = 0
            java.lang.String r3 = "TopicVersionRepo"
            java.lang.String r4 = "Remote version data cleaned"
            r5 = 0
            z6.b.j(r2, r3, r4, r5, r6, r7)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.k.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
    
        if (j.o.a.a(r1, false, r3, r4, 1, null) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r15 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r15 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // v5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r13, @m80.k j00.c<? super java.util.List<t8.d>> r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.k.b(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // v5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r6, @m80.k java.util.List<java.lang.Long> r8, @m80.k j00.c<? super java.util.Map<java.lang.Long, java.lang.Long>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof v5.k.d
            if (r0 == 0) goto L13
            r0 = r9
            v5.k$d r0 = (v5.k.d) r0
            int r1 = r0.f93047e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93047e = r1
            goto L18
        L13:
            v5.k$d r0 = new v5.k$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f93045c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f93047e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f93044b
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r9)
            goto L7d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            long r6 = r0.f93043a
            java.lang.Object r8 = r0.f93044b
            java.util.List r8 = (java.util.List) r8
            kotlin.e.n(r9)
            goto L5f
        L42:
            kotlin.e.n(r9)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L50
            java.util.Map r6 = a00.l1.z()
            return r6
        L50:
            h4.a r9 = r5.f93021b
            r0.f93044b = r8
            r0.f93043a = r6
            r0.f93047e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L5f
            goto L7c
        L5f:
            f4.v r9 = (f4.v) r9
            f4.u1 r9 = r9.c()
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            j.j r9 = r9.W(r6, r2)
            java.lang.Object r8 = l00.k.a(r8)
            r0.f93044b = r8
            r0.f93043a = r6
            r0.f93047e = r3
            java.lang.Object r9 = k.e.c(r9, r0)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r6 = 10
            int r6 = a00.i0.d0(r9, r6)
            int r6 = a00.k1.j(r6)
            r7 = 16
            int r6 = g10.u.u(r6, r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r6)
            java.util.Iterator r6 = r9.iterator()
        L98:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lc4
            java.lang.Object r8 = r6.next()
            f4.v1 r8 = (f4.v1) r8
            long r0 = r8.h()
            java.lang.Long r9 = l00.a.g(r0)
            long r0 = r8.g()
            java.lang.Long r8 = l00.a.g(r0)
            kotlin.Pair r8 = yz.h1.a(r9, r8)
            java.lang.Object r9 = r8.getFirst()
            java.lang.Object r8 = r8.getSecond()
            r7.put(r9, r8)
            goto L98
        Lc4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.k.c(long, java.util.List, j00.c):java.lang.Object");
    }

    public final t8.g d() {
        return (t8.g) w7.f.b(new e(o0.d(t8.g.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
