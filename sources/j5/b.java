package j5;

import c4.j;
import c4.o;
import c40.r0;
import com.microsoft.thrifty.service.a;
import f4.v;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import p8.h1;
import p8.s;
import p8.y0;
import ws.i;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {j5.e.class})
@u0({"SMAP\nAbilityScoreRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n6#2:207\n64#3,2:208\n66#3:211\n67#3,2:217\n6#4:210\n124#5,4:212\n142#6:216\n1563#7:219\n1634#7,3:220\n1563#7:223\n1634#7,3:224\n*S KotlinDebug\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl\n*L\n47#1:207\n47#1:208,2\n47#1:211\n47#1:217,2\n47#1:210\n47#1:212,4\n47#1:216\n50#1:219\n50#1:220,3\n179#1:223\n179#1:224,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements j5.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h4.c f63233a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f63234b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl", f = "AbilityScoreRepo.kt", i = {0, 0, 1, 1}, l = {49, 51}, m = "getAbilityScore", n = {"topicId", "bookId", "topicId", "bookId"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f63235a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63236b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f63237c;

        /* renamed from: e, reason: collision with root package name */
        public int f63239e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63237c = obj;
            this.f63239e |= Integer.MIN_VALUE;
            return b.this.d(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl", f = "AbilityScoreRepo.kt", i = {0, 0, 1, 1}, l = {58, 60}, m = "getAbilityScore", n = {"bookId", "topicId", "bookId", "topicId"}, s = {"J$0", "J$1", "J$0", "J$1"}, v = 1)
    /* renamed from: j5.b$b, reason: collision with other inner class name */
    public static final class C0733b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f63240a;

        /* renamed from: b, reason: collision with root package name */
        public long f63241b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f63242c;

        /* renamed from: e, reason: collision with root package name */
        public int f63244e;

        public C0733b(j00.c<? super C0733b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63242c = obj;
            this.f63244e |= Integer.MIN_VALUE;
            return b.this.f(0L, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl$mergeAbilityScore$2", f = "AbilityScoreRepo.kt", i = {1, 1, 1, 1}, l = {123, 127}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "it", "$i$a$-apply-AbilityScoreRepoImpl$mergeAbilityScore$2$1", "$i$a$-also-AbilityScoreRepoImpl$mergeAbilityScore$2$1$2"}, s = {"L$1", "L$3", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nAbilityScoreRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$mergeAbilityScore$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1563#2:207\n1634#2,3:208\n*S KotlinDebug\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$mergeAbilityScore$2\n*L\n124#1:207\n124#1:208,3\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f63245a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63246b;

        /* renamed from: c, reason: collision with root package name */
        public Object f63247c;

        /* renamed from: d, reason: collision with root package name */
        public Object f63248d;

        /* renamed from: e, reason: collision with root package name */
        public int f63249e;

        /* renamed from: f, reason: collision with root package name */
        public int f63250f;

        /* renamed from: g, reason: collision with root package name */
        public int f63251g;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<h1> f63253i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f63254j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl$mergeAbilityScore$2$1$2$1", f = "AbilityScoreRepo.kt", i = {0, 0, 0, 0, 0}, l = {129}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "record", "$i$f$forEach", "$i$a$-forEach-AbilityScoreRepoImpl$mergeAbilityScore$2$1$2$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nAbilityScoreRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$mergeAbilityScore$2$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1869#2,2:207\n*S KotlinDebug\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$mergeAbilityScore$2$1$2$1\n*L\n128#1:207,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f63255a;

            /* renamed from: b, reason: collision with root package name */
            public Object f63256b;

            /* renamed from: c, reason: collision with root package name */
            public Object f63257c;

            /* renamed from: d, reason: collision with root package name */
            public Object f63258d;

            /* renamed from: e, reason: collision with root package name */
            public Object f63259e;

            /* renamed from: f, reason: collision with root package name */
            public int f63260f;

            /* renamed from: g, reason: collision with root package name */
            public int f63261g;

            /* renamed from: h, reason: collision with root package name */
            public int f63262h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ List<f4.a> f63263i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ v f63264j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<f4.a> list, v vVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f63263i = list;
                this.f63264j = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f63263i, this.f63264j, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Iterable iterable;
                v vVar;
                int i11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f63262h;
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    List<f4.a> list = this.f63263i;
                    v vVar2 = this.f63264j;
                    it = list.iterator();
                    iterable = list;
                    vVar = vVar2;
                    i11 = 0;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f63260f;
                    it = (Iterator) this.f63257c;
                    vVar = (v) this.f63256b;
                    iterable = (Iterable) this.f63255a;
                    kotlin.e.n(obj);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    f4.a aVar = (f4.a) next;
                    f4.k b11 = vVar.b();
                    this.f63255a = l00.k.a(iterable);
                    this.f63256b = vVar;
                    this.f63257c = it;
                    this.f63258d = l00.k.a(next);
                    this.f63259e = l00.k.a(aVar);
                    this.f63260f = i11;
                    this.f63261g = 0;
                    this.f63262h = 1;
                    if (j5.a.d(b11, aVar, this) == l11) {
                        return l11;
                    }
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<h1> list, long j11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f63253i = list;
            this.f63254j = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new c(this.f63253i, this.f63254j, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        
            if (r12 == r0) goto L20;
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
                int r1 = r11.f63251g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r0 = r11.f63248d
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r11.f63247c
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r11.f63246b
                f4.v r0 = (f4.v) r0
                java.lang.Object r0 = r11.f63245a
                kotlin.e.n(r12)
                return r0
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                kotlin.e.n(r12)
                goto L3e
            L2c:
                kotlin.e.n(r12)
                j5.b r12 = j5.b.this
                h4.c r12 = j5.b.g(r12)
                r11.f63251g = r3
                java.lang.Object r12 = r12.a(r11)
                if (r12 != r0) goto L3e
                goto L93
            L3e:
                java.util.List<p8.h1> r1 = r11.f63253i
                long r3 = r11.f63254j
                r5 = r12
                f4.v r5 = (f4.v) r5
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = a00.i0.d0(r1, r7)
                r6.<init>(r7)
                java.util.Iterator r1 = r1.iterator()
            L56:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L6c
                java.lang.Object r7 = r1.next()
                p8.h1 r7 = (p8.h1) r7
                r8 = 0
                f4.a r7 = j5.d.b(r7, r8, r3)
                r6.add(r7)
                goto L56
            L6c:
                j5.b$c$a r7 = new j5.b$c$a
                r1 = 0
                r7.<init>(r6, r5, r1)
                r11.f63245a = r12
                java.lang.Object r1 = l00.k.a(r5)
                r11.f63246b = r1
                r11.f63247c = r6
                java.lang.Object r1 = l00.k.a(r6)
                r11.f63248d = r1
                r1 = 0
                r11.f63249e = r1
                r11.f63250f = r1
                r11.f63251g = r2
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r1 = j.o.a.a(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L94
            L93:
                return r0
            L94:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class d implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f63265a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f63266b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f63267c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f63268a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f63269b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f63270c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f63268a = eVar;
                this.f63269b = cVar;
                this.f63270c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f63268a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f63268a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f63269b.b(this.f63270c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f63265a = dVar;
            this.f63266b = eVar;
            this.f63267c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f63266b, this.f63267c, this.f63265a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f63265a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl$syncAbility$2", f = "AbilityScoreRepo.kt", i = {1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {139, 146, 151}, m = "invokeSuspend", n = {"synList", "synList", "scoresMap", "$this$forEach$iv", "element$iv", "gameRoundId", "synRecords", "$i$f$forEach", "$i$a$-forEach-AbilityScoreRepoImpl$syncAbility$2$2"}, s = {"L$0", "L$0", "L$1", "L$2", "L$5", "L$6", "L$7", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nAbilityScoreRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$syncAbility$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,206:1\n1491#2:207\n1516#2,3:208\n1519#2,3:218\n382#3,7:211\n216#4,2:221\n*S KotlinDebug\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$syncAbility$2\n*L\n149#1:207\n149#1:208,3\n149#1:218,3\n149#1:211,7\n150#1:221,2\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f63271a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63272b;

        /* renamed from: c, reason: collision with root package name */
        public Object f63273c;

        /* renamed from: d, reason: collision with root package name */
        public Object f63274d;

        /* renamed from: e, reason: collision with root package name */
        public Object f63275e;

        /* renamed from: f, reason: collision with root package name */
        public Object f63276f;

        /* renamed from: g, reason: collision with root package name */
        public Object f63277g;

        /* renamed from: h, reason: collision with root package name */
        public Object f63278h;

        /* renamed from: i, reason: collision with root package name */
        public int f63279i;

        /* renamed from: j, reason: collision with root package name */
        public int f63280j;

        /* renamed from: k, reason: collision with root package name */
        public int f63281k;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new e(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        
            if (r13 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x005c, code lost:
        
            if (r13 == r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00d8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl", f = "AbilityScoreRepo.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {176, 179}, m = "syncGameRound", n = {"gameRoundId", "synRecords", "scoresMap", "wordAbilityItems", "$this$syncGameRound_u24lambda_u241", "bookId", "$i$a$-runCatching-AbilityScoreRepoImpl$syncGameRound$2", "gameRoundId", "synRecords", "scoresMap", "wordAbilityItems", "$this$syncGameRound_u24lambda_u241", "bookId", "$i$a$-runCatching-AbilityScoreRepoImpl$syncGameRound$2"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f63283a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63284b;

        /* renamed from: c, reason: collision with root package name */
        public Object f63285c;

        /* renamed from: d, reason: collision with root package name */
        public Object f63286d;

        /* renamed from: e, reason: collision with root package name */
        public Object f63287e;

        /* renamed from: f, reason: collision with root package name */
        public int f63288f;

        /* renamed from: g, reason: collision with root package name */
        public int f63289g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f63290h;

        /* renamed from: j, reason: collision with root package name */
        public int f63292j;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63290h = obj;
            this.f63292j |= Integer.MIN_VALUE;
            return b.this.l(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl$updateAbilityScore$2", f = "AbilityScoreRepo.kt", i = {1, 1}, l = {92, 93}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-AbilityScoreRepoImpl$updateAbilityScore$2$1"}, s = {"L$3", "I$0"}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f63293a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63294b;

        /* renamed from: c, reason: collision with root package name */
        public Object f63295c;

        /* renamed from: d, reason: collision with root package name */
        public Object f63296d;

        /* renamed from: e, reason: collision with root package name */
        public int f63297e;

        /* renamed from: f, reason: collision with root package name */
        public int f63298f;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f63300h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f4.a f63301i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl$updateAbilityScore$2$1$1", f = "AbilityScoreRepo.kt", i = {2}, l = {94, 100, 101}, m = "invokeSuspend", n = {"dbScore"}, s = {"L$0"}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f63302a;

            /* renamed from: b, reason: collision with root package name */
            public int f63303b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f63304c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f4.a f63305d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f63306e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v vVar, f4.a aVar, String str, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f63304c = vVar;
                this.f63305d = aVar;
                this.f63306e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f63304c, this.f63305d, this.f63306e, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
            
                if (r1.T(r3, r9) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
            
                if (r10 == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
            
                if (j5.a.d(r10, r1, r9) == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r9.f63303b
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r4) goto L25
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L19
                    java.lang.Object r0 = r9.f63302a
                    f4.a r0 = (f4.a) r0
                    kotlin.e.n(r10)
                    goto L80
                L19:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L21:
                    kotlin.e.n(r10)
                    goto L5c
                L25:
                    kotlin.e.n(r10)
                    goto L3d
                L29:
                    kotlin.e.n(r10)
                    f4.v r10 = r9.f63304c
                    f4.k r10 = r10.b()
                    f4.a r1 = r9.f63305d
                    r9.f63303b = r4
                    java.lang.Object r10 = j5.a.d(r10, r1, r9)
                    if (r10 != r0) goto L3d
                    goto L7f
                L3d:
                    f4.v r10 = r9.f63304c
                    f4.k r10 = r10.b()
                    f4.a r1 = r9.f63305d
                    long r4 = r1.B()
                    f4.a r1 = r9.f63305d
                    long r6 = r1.Y()
                    j.j r10 = r10.Y(r4, r6)
                    r9.f63303b = r3
                    java.lang.Object r10 = k.e.e(r10, r9)
                    if (r10 != r0) goto L5c
                    goto L7f
                L5c:
                    f4.a r10 = (f4.a) r10
                    f4.v r1 = r9.f63304c
                    f4.u r1 = r1.u()
                    f4.o r3 = new f4.o
                    long r4 = r10.W()
                    java.lang.String r6 = r9.f63306e
                    r7 = 0
                    r3.<init>(r4, r6, r7)
                    java.lang.Object r10 = l00.k.a(r10)
                    r9.f63302a = r10
                    r9.f63303b = r2
                    java.lang.Object r10 = r1.T(r3, r9)
                    if (r10 != r0) goto L80
                L7f:
                    return r0
                L80:
                    yz.g2 r10 = yz.g2.f100423a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: j5.b.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, f4.a aVar, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f63300h = str;
            this.f63301i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new g(this.f63300h, this.f63301i, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f63298f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r0 = r10.f63296d
                f4.v r0 = (f4.v) r0
                java.lang.Object r0 = r10.f63295c
                f4.a r0 = (f4.a) r0
                java.lang.Object r1 = r10.f63294b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r2 = r10.f63293a
                kotlin.e.n(r11)
                goto L68
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                kotlin.e.n(r11)
                goto L3e
            L2c:
                kotlin.e.n(r11)
                j5.b r11 = j5.b.this
                h4.c r11 = j5.b.g(r11)
                r10.f63298f = r3
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L3e
                goto L65
            L3e:
                java.lang.String r1 = r10.f63300h
                f4.a r3 = r10.f63301i
                r4 = r11
                f4.v r4 = (f4.v) r4
                j5.b$g$a r6 = new j5.b$g$a
                r5 = 0
                r6.<init>(r4, r3, r1, r5)
                r10.f63293a = r11
                r10.f63294b = r1
                r10.f63295c = r3
                java.lang.Object r5 = l00.k.a(r4)
                r10.f63296d = r5
                r5 = 0
                r10.f63297e = r5
                r10.f63298f = r2
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r2 = j.o.a.a(r4, r5, r6, r7, r8, r9)
                if (r2 != r0) goto L66
            L65:
                return r0
            L66:
                r2 = r11
                r0 = r3
            L68:
                z6.b r3 = z6.b.f101032b
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r4 = "update ability score "
                r11.append(r4)
                r11.append(r1)
                java.lang.String r1 = " bookId "
                r11.append(r1)
                long r4 = r0.B()
                r11.append(r4)
                java.lang.String r1 = "  topicId "
                r11.append(r1)
                long r0 = r0.Y()
                r11.append(r0)
                r0 = 32
                r11.append(r0)
                java.lang.String r5 = r11.toString()
                r7 = 4
                r8 = 0
                java.lang.String r4 = "IAbilityScoreRepo"
                r6 = 0
                z6.b.j(r3, r4, r5, r6, r7, r8)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl$updateAbilityScores$2", f = "AbilityScoreRepo.kt", i = {1, 1}, l = {68, 69}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-AbilityScoreRepoImpl$updateAbilityScores$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f63307a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63308b;

        /* renamed from: c, reason: collision with root package name */
        public int f63309c;

        /* renamed from: d, reason: collision with root package name */
        public int f63310d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<f4.a> f63312f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f63313g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreRepoImpl$updateAbilityScores$2$1$1", f = "AbilityScoreRepo.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {71, 80}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "ability", "$i$f$forEach", "$i$a$-forEach-AbilityScoreRepoImpl$updateAbilityScores$2$1$1$1", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-AbilityScoreRepoImpl$updateAbilityScores$2$1$1$3"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1", "L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nAbilityScoreRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$updateAbilityScores$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1869#2,2:207\n1563#2:209\n1634#2,3:210\n1869#2,2:213\n*S KotlinDebug\n*F\n+ 1 AbilityScoreRepo.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreRepoImpl$updateAbilityScores$2$1$1\n*L\n70#1:207,2\n73#1:209\n73#1:210,3\n79#1:213,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f63314a;

            /* renamed from: b, reason: collision with root package name */
            public Object f63315b;

            /* renamed from: c, reason: collision with root package name */
            public Object f63316c;

            /* renamed from: d, reason: collision with root package name */
            public Object f63317d;

            /* renamed from: e, reason: collision with root package name */
            public Object f63318e;

            /* renamed from: f, reason: collision with root package name */
            public int f63319f;

            /* renamed from: g, reason: collision with root package name */
            public int f63320g;

            /* renamed from: h, reason: collision with root package name */
            public int f63321h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ List<f4.a> f63322i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ v f63323j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ String f63324k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<f4.a> list, v vVar, String str, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f63322i = list;
                this.f63323j = vVar;
                this.f63324k = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f63322i, this.f63323j, this.f63324k, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x00c7  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: j5.b.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<f4.a> list, String str, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f63312f = list;
            this.f63313g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new h(this.f63312f, this.f63313g, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
            if (r11 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f63310d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r10.f63308b
                f4.v r0 = (f4.v) r0
                java.lang.Object r0 = r10.f63307a
                kotlin.e.n(r11)
                return r0
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.e.n(r11)
                goto L36
            L24:
                kotlin.e.n(r11)
                j5.b r11 = j5.b.this
                h4.c r11 = j5.b.g(r11)
                r10.f63310d = r3
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L36
                goto L5a
            L36:
                java.util.List<f4.a> r1 = r10.f63312f
                java.lang.String r3 = r10.f63313g
                r4 = r11
                f4.v r4 = (f4.v) r4
                j5.b$h$a r6 = new j5.b$h$a
                r5 = 0
                r6.<init>(r1, r4, r3, r5)
                r10.f63307a = r11
                java.lang.Object r1 = l00.k.a(r4)
                r10.f63308b = r1
                r1 = 0
                r10.f63309c = r1
                r10.f63310d = r2
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r1 = j.o.a.a(r4, r5, r6, r7, r8, r9)
                if (r1 != r0) goto L5b
            L5a:
                return r0
            L5b:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(@k h4.c bczDb, @k p thriftService) {
        g0.p(bczDb, "bczDb");
        g0.p(thriftService, "thriftService");
        this.f63233a = bczDb;
        this.f63234b = thriftService;
    }

    @Override // j5.e
    @l
    public Object a(long j11, @k List<h1> list, @k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new c(list, j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // j5.e
    @l
    public Object b(@k String str, @k List<f4.a> list, @k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new h(list, str, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // j5.e
    @l
    public Object c(@k String str, @k f4.a aVar, @k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new g(str, aVar, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[LOOP:0: B:17:0x006c->B:19:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // j5.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r8, @m80.k java.util.List<java.lang.Long> r10, @m80.k j00.c<? super java.util.List<f4.a>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof j5.b.a
            if (r0 == 0) goto L13
            r0 = r11
            j5.b$a r0 = (j5.b.a) r0
            int r1 = r0.f63239e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63239e = r1
            goto L18
        L13:
            j5.b$a r0 = new j5.b$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f63237c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f63239e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f63236b
            java.util.List r8 = (java.util.List) r8
            kotlin.e.n(r11)
            return r11
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            long r8 = r0.f63235a
            java.lang.Object r10 = r0.f63236b
            java.util.List r10 = (java.util.List) r10
            kotlin.e.n(r11)
            goto L54
        L42:
            kotlin.e.n(r11)
            h4.c r11 = r7.f63233a
            r0.f63236b = r10
            r0.f63235a = r8
            r0.f63239e = r4
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L54
            goto L98
        L54:
            f4.v r11 = (f4.v) r11
            f4.k r11 = r11.b()
            r2 = r10
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = a00.i0.d0(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L6c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r2.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.Long r5 = l00.a.g(r5)
            r4.add(r5)
            goto L6c
        L84:
            j.j r11 = r11.b0(r8, r4)
            java.lang.Object r10 = l00.k.a(r10)
            r0.f63236b = r10
            r0.f63235a = r8
            r0.f63239e = r3
            java.lang.Object r8 = k.e.c(r11, r0)
            if (r8 != r1) goto L99
        L98:
            return r1
        L99:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b.d(long, java.util.List, j00.c):java.lang.Object");
    }

    @Override // j5.e
    @l
    public Object e(@k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new e(null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // j5.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(long r6, long r8, @m80.k j00.c<? super f4.a> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof j5.b.C0733b
            if (r0 == 0) goto L13
            r0 = r10
            j5.b$b r0 = (j5.b.C0733b) r0
            int r1 = r0.f63244e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63244e = r1
            goto L18
        L13:
            j5.b$b r0 = new j5.b$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f63242c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f63244e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r8 = r0.f63241b
            long r6 = r0.f63240a
            kotlin.e.n(r10)
            goto L4e
        L3c:
            kotlin.e.n(r10)
            h4.c r10 = r5.f63233a
            r0.f63240a = r6
            r0.f63241b = r8
            r0.f63244e = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L4e
            goto L64
        L4e:
            f4.v r10 = (f4.v) r10
            f4.k r10 = r10.b()
            j.j r10 = r10.Y(r6, r8)
            r0.f63240a = r6
            r0.f63241b = r8
            r0.f63244e = r3
            java.lang.Object r6 = k.e.f(r10, r0)
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b.f(long, long, j00.c):java.lang.Object");
    }

    public final s j() {
        return (s) w7.f.b(new d(o0.d(s.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public final Object k(int i11, String str, List<h1> list, j00.c<? super g2> cVar) {
        Object B4 = j().B4(new y0.a().a(i11).c(str).d(list).build(), cVar);
        return B4 == kotlin.coroutines.intrinsics.b.l() ? B4 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        if (j5.a.a(r10, r13, r3) != r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb A[Catch: all -> 0x0073, LOOP:0: B:35:0x00e5->B:37:0x00eb, LOOP_END, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x0120, B:32:0x006c, B:34:0x00d1, B:35:0x00e5, B:37:0x00eb, B:39:0x00fd), top: B:31:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r17, java.util.List<f4.o> r18, java.util.Map<java.lang.Long, f4.a> r19, j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b.l(java.lang.String, java.util.List, java.util.Map, j00.c):java.lang.Object");
    }
}
