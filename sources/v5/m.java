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
@r(binds = {v5.g.class})
@u0({"SMAP\nWordResourceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/WordResourceRepo\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n6#2:130\n64#3,2:131\n66#3:134\n67#3,2:140\n6#4:133\n124#5,4:135\n142#6:139\n1563#7:142\n1634#7,3:143\n1563#7:146\n1634#7,3:147\n1563#7:150\n1634#7,3:151\n1193#7,2:154\n1267#7,4:156\n1193#7,2:160\n1267#7,4:162\n*S KotlinDebug\n*F\n+ 1 WordResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/WordResourceRepo\n*L\n59#1:130\n59#1:131,2\n59#1:134\n59#1:140,2\n59#1:133\n59#1:135,4\n59#1:139\n66#1:142\n66#1:143,3\n98#1:146\n98#1:147,3\n100#1:150\n100#1:151,3\n117#1:154,2\n117#1:156,4\n122#1:160,2\n122#1:162,4\n*E\n"})
/* loaded from: classes3.dex */
public final class m implements v5.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f93055a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h4.a f93056b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k50.a f93057c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.WordResourceRepo", f = "WordResourceRepo.kt", i = {}, l = {108, 108}, m = "clean", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f93058a;

        /* renamed from: c, reason: collision with root package name */
        public int f93060c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93058a = obj;
            this.f93060c |= Integer.MIN_VALUE;
            return m.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.WordResourceRepo", f = "WordResourceRepo.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {65, 70, 71}, m = "fetchResource", n = {"topicIds", "bookId", "now", "topicIds", "wordList", "bookId", "now", "topicIds", "wordList", "db", "bookId", "now"}, s = {"L$0", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f93061a;

        /* renamed from: b, reason: collision with root package name */
        public long f93062b;

        /* renamed from: c, reason: collision with root package name */
        public Object f93063c;

        /* renamed from: d, reason: collision with root package name */
        public Object f93064d;

        /* renamed from: e, reason: collision with root package name */
        public Object f93065e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f93066f;

        /* renamed from: h, reason: collision with root package name */
        public int f93068h;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93066f = obj;
            this.f93068h |= Integer.MIN_VALUE;
            return m.this.d(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.WordResourceRepo$fetchResource$2", f = "WordResourceRepo.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {74, 76}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "item", "$i$f$forEach", "$i$a$-forEach-WordResourceRepo$fetchResource$2$1", "$this$forEach$iv", "element$iv", "item", "pack", "$i$f$forEach", "$i$a$-forEach-WordResourceRepo$fetchResource$2$1", "$i$a$-let-WordResourceRepo$fetchResource$2$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1", "L$0", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 1)
    @u0({"SMAP\nWordResourceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/WordResourceRepo$fetchResource$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1869#2,2:130\n*S KotlinDebug\n*F\n+ 1 WordResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/WordResourceRepo$fetchResource$2\n*L\n72#1:130,2\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f93069a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93070b;

        /* renamed from: c, reason: collision with root package name */
        public Object f93071c;

        /* renamed from: d, reason: collision with root package name */
        public Object f93072d;

        /* renamed from: e, reason: collision with root package name */
        public Object f93073e;

        /* renamed from: f, reason: collision with root package name */
        public Object f93074f;

        /* renamed from: g, reason: collision with root package name */
        public long f93075g;

        /* renamed from: h, reason: collision with root package name */
        public long f93076h;

        /* renamed from: i, reason: collision with root package name */
        public int f93077i;

        /* renamed from: j, reason: collision with root package name */
        public int f93078j;

        /* renamed from: k, reason: collision with root package name */
        public int f93079k;

        /* renamed from: l, reason: collision with root package name */
        public int f93080l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<t8.c> f93081m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f93082n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f93083o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f93084p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<t8.c> list, v vVar, long j11, long j12, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f93081m = list;
            this.f93082n = vVar;
            this.f93083o = j11;
            this.f93084p = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f93081m, this.f93082n, this.f93083o, this.f93084p, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((c) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0121  */
        /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x010a -> B:6:0x010d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0112 -> B:7:0x0119). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.WordResourceRepo", f = "WordResourceRepo.kt", i = {0, 0, 1, 1}, l = {114, 116}, m = "getLocalVersions", n = {"topicIds", "bookId", "topicIds", "bookId"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f93085a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93086b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f93087c;

        /* renamed from: e, reason: collision with root package name */
        public int f93089e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93087c = obj;
            this.f93089e |= Integer.MIN_VALUE;
            return m.this.c(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.WordResourceRepo", f = "WordResourceRepo.kt", i = {0, 1}, l = {121, 121}, m = "loadWordPacks", n = {"topicIds", "topicIds"}, s = {"L$0", "L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f93090a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93091b;

        /* renamed from: d, reason: collision with root package name */
        public int f93093d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93091b = obj;
            this.f93093d |= Integer.MIN_VALUE;
            return m.this.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.WordResourceRepo", f = "WordResourceRepo.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {92, 94, 98}, m = "loadWordResource", n = {"topicIds", "bookId", "topicIds", "bookId", "topicIds", "records", "bookId"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "L$1", "J$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f93094a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93095b;

        /* renamed from: c, reason: collision with root package name */
        public Object f93096c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f93097d;

        /* renamed from: f, reason: collision with root package name */
        public int f93099f;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93097d = obj;
            this.f93099f |= Integer.MIN_VALUE;
            return m.this.b(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class g implements x00.l<w7.d<t8.g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f93100a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f93101b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f93102c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f93103a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f93104b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f93105c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f93103a = eVar;
                this.f93104b = cVar;
                this.f93105c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f93103a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f93103a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f93104b.b(this.f93105c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public g(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f93100a = dVar;
            this.f93101b = eVar;
            this.f93102c = cVar;
        }

        public final void a(w7.d<t8.g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f93101b, this.f93102c, this.f93100a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f93100a);
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

    public m(@m80.k p thrift, @m80.k h4.a bczDb, @m80.k k50.a json) {
        g0.p(thrift, "thrift");
        g0.p(bczDb, "bczDb");
        g0.p(json, "json");
        this.f93055a = thrift;
        this.f93056b = bczDb;
        this.f93057c = json;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r6.U(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // v5.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof v5.m.a
            if (r0 == 0) goto L13
            r0 = r6
            v5.m$a r0 = (v5.m.a) r0
            int r1 = r0.f93060c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93060c = r1
            goto L18
        L13:
            v5.m$a r0 = new v5.m$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f93058a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f93060c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L55
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L46
        L38:
            kotlin.e.n(r6)
            h4.a r6 = r5.f93056b
            r0.f93060c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L46
            goto L54
        L46:
            f4.v r6 = (f4.v) r6
            f4.e2 r6 = r6.p()
            r0.f93060c = r3
            java.lang.Object r6 = r6.U(r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.m.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f1 A[LOOP:0: B:13:0x00eb->B:15:0x00f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // v5.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r21, @m80.k java.util.List<java.lang.Long> r23, @m80.k j00.c<? super java.util.List<l3.i0>> r24) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.m.b(long, java.util.List, j00.c):java.lang.Object");
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
    @Override // v5.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r6, @m80.k java.util.List<java.lang.Long> r8, @m80.k j00.c<? super java.util.Map<java.lang.Long, java.lang.Long>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof v5.m.d
            if (r0 == 0) goto L13
            r0 = r9
            v5.m$d r0 = (v5.m.d) r0
            int r1 = r0.f93089e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93089e = r1
            goto L18
        L13:
            v5.m$d r0 = new v5.m$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f93087c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f93089e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f93086b
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r9)
            goto L7d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            long r6 = r0.f93085a
            java.lang.Object r8 = r0.f93086b
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
            h4.a r9 = r5.f93056b
            r0.f93086b = r8
            r0.f93085a = r6
            r0.f93089e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L5f
            goto L7c
        L5f:
            f4.v r9 = (f4.v) r9
            f4.e2 r9 = r9.p()
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            j.j r9 = r9.Z(r6, r2)
            java.lang.Object r8 = l00.k.a(r8)
            r0.f93086b = r8
            r0.f93085a = r6
            r0.f93089e = r3
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
            f4.p2 r8 = (f4.p2) r8
            long r0 = r8.e()
            java.lang.Long r9 = l00.a.g(r0)
            long r0 = r8.f()
            java.lang.Long r8 = l00.a.g(r0)
            kotlin.Pair r8 = yz.h1.a(r9, r8)
            java.lang.Object r9 = r8.getFirst()
            java.lang.Object r8 = r8.getSecond()
            r7.put(r9, r8)
            goto L98
        Lc4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.m.c(long, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (r4 == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // v5.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r24, @m80.k java.util.List<java.lang.Long> r26, @m80.k j00.c<? super yz.g2> r27) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.m.d(long, java.util.List, j00.c):java.lang.Object");
    }

    public final t8.g f() {
        return (t8.g) w7.f.b(new g(o0.d(t8.g.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List<java.lang.Long> r6, j00.c<? super java.util.Map<java.lang.Long, l3.y2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v5.m.e
            if (r0 == 0) goto L13
            r0 = r7
            v5.m$e r0 = (v5.m.e) r0
            int r1 = r0.f93093d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93093d = r1
            goto L18
        L13:
            v5.m$e r0 = new v5.m$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f93091b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f93093d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f93090a
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r7)
            goto L6c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f93090a
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r7)
            goto L50
        L40:
            kotlin.e.n(r7)
            h4.a r7 = r5.f93056b
            r0.f93090a = r6
            r0.f93093d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L50
            goto L6b
        L50:
            f4.v r7 = (f4.v) r7
            f4.y3 r7 = r7.d()
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            j.j r7 = r7.f0(r2)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f93090a = r6
            r0.f93093d = r3
            java.lang.Object r7 = k.e.c(r7, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r6 = 10
            int r6 = a00.i0.d0(r7, r6)
            int r6 = a00.k1.j(r6)
            r0 = 16
            int r6 = g10.u.u(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L87:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lbd
            java.lang.Object r7 = r6.next()
            f4.a4 r7 = (f4.a4) r7
            long r1 = r7.f()
            java.lang.Long r1 = l00.a.g(r1)
            k50.a r2 = r5.f93057c
            l3.y2$b r3 = l3.y2.Companion
            f50.i r3 = r3.serializer()
            f50.e r3 = (f50.e) r3
            java.lang.String r7 = r7.h()
            java.lang.Object r7 = r2.c(r3, r7)
            kotlin.Pair r7 = yz.h1.a(r1, r7)
            java.lang.Object r1 = r7.getFirst()
            java.lang.Object r7 = r7.getSecond()
            r0.put(r1, r7)
            goto L87
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.m.g(java.util.List, j00.c):java.lang.Object");
    }
}
