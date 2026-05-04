package com.baicizhan.app.biz.game.repo.experiment;

import a00.l1;
import a40.j;
import c4.o;
import c40.r0;
import c40.x2;
import com.baicizhan.client.business.dataset.provider.a;
import com.microsoft.thrifty.service.a;
import f4.e0;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.e;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import p8.s;
import ws.i;
import y7.d;
import y7.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {com.baicizhan.app.biz.game.repo.experiment.b.class})
@u0({"SMAP\nExperimentRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,108:1\n6#2:109\n64#3,2:110\n66#3:113\n67#3,2:119\n6#4:112\n124#5,4:114\n142#6:118\n*S KotlinDebug\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl\n*L\n41#1:109\n41#1:110,2\n41#1:113\n41#1:119,2\n41#1:112\n41#1:114,4\n41#1:118\n*E\n"})
/* loaded from: classes3.dex */
public final class ExperimentRepoImpl implements com.baicizhan.app.biz.game.repo.experiment.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h4.c f14208a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f14209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f14210c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j<Map<String, String>> f14211d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j<Long> f14212e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl", f = "ExperimentRepo.kt", i = {1}, l = {47, 48}, m = "fetch", n = {"config"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14217a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14218b;

        /* renamed from: d, reason: collision with root package name */
        public int f14220d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f14218b = obj;
            this.f14220d |= Integer.MIN_VALUE;
            return ExperimentRepoImpl.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$getExperiments$2", f = "ExperimentRepo.kt", i = {}, l = {58, 58}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nExperimentRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$getExperiments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1193#2,2:109\n1267#2,4:111\n*S KotlinDebug\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$getExperiments$2\n*L\n58#1:109,2\n58#1:111,4\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super Map<String, ? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14221a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f14223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f14223c = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return ExperimentRepoImpl.this.new b(this.f14223c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Map<String, String>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        
            if (r5 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f14221a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L30
            L1e:
                kotlin.e.n(r5)
                com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl r5 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.this
                h4.c r5 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.a(r5)
                r4.f14221a = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L42
            L30:
                f4.v r5 = (f4.v) r5
                f4.e0 r5 = r5.i()
                j.j r5 = r5.b0()
                r4.f14221a = r2
                java.lang.Object r5 = k.e.c(r5, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                r0 = 10
                int r0 = a00.i0.d0(r5, r0)
                int r0 = a00.k1.j(r0)
                r1 = 16
                int r0 = g10.u.u(r0, r1)
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>(r0)
                java.util.Iterator r5 = r5.iterator()
            L5e:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L82
                java.lang.Object r0 = r5.next()
                f4.f0 r0 = (f4.f0) r0
                java.lang.String r2 = r0.e()
                java.lang.String r0 = r0.f()
                kotlin.Pair r0 = yz.h1.a(r2, r0)
                java.lang.Object r2 = r0.getFirst()
                java.lang.Object r0 = r0.getSecond()
                r1.put(r2, r0)
                goto L5e
            L82:
                com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl r5 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.this
                java.lang.Long r0 = r4.f14223c
                a40.j r2 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.g(r5)
                r2.g(r1)
                a40.j r5 = com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.h(r5)
                r5.g(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Map<String, ? extends String>> cVar) {
            return invoke2(r0Var, (j00.c<? super Map<String, String>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14224a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f14225b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14226c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f14227a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14228b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14229c;

            public a(e eVar, l7.c cVar, h10.d dVar) {
                this.f14227a = eVar;
                this.f14228b = cVar;
                this.f14229c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14227a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14227a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14228b.b(this.f14229c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, e eVar, l7.c cVar) {
            this.f14224a = dVar;
            this.f14225b = eVar;
            this.f14226c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            f.a(thriftBuilder, new a(this.f14225b, this.f14226c, this.f14224a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14224a);
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
    @l00.d(c = "com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$updateExperiments$2", f = "ExperimentRepo.kt", i = {1, 1}, l = {74, 75, 83, 83}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-ExperimentRepoImpl$updateExperiments$2$1"}, s = {"L$1", "I$0"}, v = 1)
    @u0({"SMAP\nExperimentRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$updateExperiments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1193#2,2:109\n1267#2,4:111\n*S KotlinDebug\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$updateExperiments$2\n*L\n83#1:109,2\n83#1:111,4\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14230a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14231b;

        /* renamed from: c, reason: collision with root package name */
        public int f14232c;

        /* renamed from: d, reason: collision with root package name */
        public int f14233d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f14235f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$updateExperiments$2$1$1", f = "ExperimentRepo.kt", i = {1, 1, 1, 1, 1, 1}, l = {76, 78}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", a.d.C0245a.f16161a, "value", "$i$f$forEach", "$i$a$-forEach-ExperimentRepoImpl$updateExperiments$2$1$1$1"}, s = {"L$0", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nExperimentRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$updateExperiments$2$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,108:1\n216#2,2:109\n*S KotlinDebug\n*F\n+ 1 ExperimentRepo.kt\ncom/baicizhan/app/biz/game/repo/experiment/ExperimentRepoImpl$updateExperiments$2$1$1\n*L\n77#1:109,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14236a;

            /* renamed from: b, reason: collision with root package name */
            public Object f14237b;

            /* renamed from: c, reason: collision with root package name */
            public Object f14238c;

            /* renamed from: d, reason: collision with root package name */
            public Object f14239d;

            /* renamed from: e, reason: collision with root package name */
            public Object f14240e;

            /* renamed from: f, reason: collision with root package name */
            public Object f14241f;

            /* renamed from: g, reason: collision with root package name */
            public int f14242g;

            /* renamed from: h, reason: collision with root package name */
            public int f14243h;

            /* renamed from: i, reason: collision with root package name */
            public int f14244i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ e0 f14245j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Map<String, String> f14246k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e0 e0Var, Map<String, String> map, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f14245j = e0Var;
                this.f14246k = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f14245j, this.f14246k, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
            
                if (r12.T(r11) == r0) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r11.f14244i
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L39
                    if (r1 == r4) goto L35
                    if (r1 != r3) goto L2d
                    int r1 = r11.f14242g
                    java.lang.Object r4 = r11.f14241f
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r4 = r11.f14240e
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r4 = r11.f14239d
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                    java.lang.Object r4 = r11.f14238c
                    java.util.Iterator r4 = (java.util.Iterator) r4
                    java.lang.Object r5 = r11.f14237b
                    f4.e0 r5 = (f4.e0) r5
                    java.lang.Object r6 = r11.f14236a
                    java.util.Map r6 = (java.util.Map) r6
                    kotlin.e.n(r12)
                    goto L56
                L2d:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L35:
                    kotlin.e.n(r12)
                    goto L47
                L39:
                    kotlin.e.n(r12)
                    f4.e0 r12 = r11.f14245j
                    r11.f14244i = r4
                    java.lang.Object r12 = r12.T(r11)
                    if (r12 != r0) goto L47
                    goto L9b
                L47:
                    java.util.Map<java.lang.String, java.lang.String> r12 = r11.f14246k
                    f4.e0 r1 = r11.f14245j
                    java.util.Set r4 = r12.entrySet()
                    java.util.Iterator r4 = r4.iterator()
                    r6 = r12
                    r5 = r1
                    r1 = r2
                L56:
                    boolean r12 = r4.hasNext()
                    if (r12 == 0) goto L9c
                    java.lang.Object r12 = r4.next()
                    java.util.Map$Entry r12 = (java.util.Map.Entry) r12
                    java.lang.Object r7 = r12.getKey()
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object r8 = r12.getValue()
                    java.lang.String r8 = (java.lang.String) r8
                    f4.f0 r9 = new f4.f0
                    r9.<init>(r7, r8)
                    java.lang.Object r10 = l00.k.a(r6)
                    r11.f14236a = r10
                    r11.f14237b = r5
                    r11.f14238c = r4
                    java.lang.Object r12 = l00.k.a(r12)
                    r11.f14239d = r12
                    java.lang.Object r12 = l00.k.a(r7)
                    r11.f14240e = r12
                    java.lang.Object r12 = l00.k.a(r8)
                    r11.f14241f = r12
                    r11.f14242g = r1
                    r11.f14243h = r2
                    r11.f14244i = r3
                    java.lang.Object r12 = r5.Y(r9, r11)
                    if (r12 != r0) goto L56
                L9b:
                    return r0
                L9c:
                    yz.g2 r12 = yz.g2.f100423a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<String, String> map, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f14235f = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return ExperimentRepoImpl.this.new d(this.f14235f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
        
            if (r14 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r14 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (j.o.a.a(r7, false, r9, r10, 1, null) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ExperimentRepoImpl(@k h4.c bczDb, @k p thriftService, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(bczDb, "bczDb");
        g0.p(thriftService, "thriftService");
        g0.p(tokenProvider, "tokenProvider");
        this.f14208a = bczDb;
        this.f14209b = thriftService;
        this.f14210c = tokenProvider;
        this.f14211d = a40.d.g(l1.z());
        this.f14212e = a40.d.g(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (e(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.biz.game.repo.experiment.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.a
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$a r0 = (com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.a) r0
            int r1 = r0.f14220d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14220d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$a r0 = new com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14218b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14220d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f14217a
            java.util.Map r0 = (java.util.Map) r0
            kotlin.e.n(r9)
            goto L5d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            kotlin.e.n(r9)
            goto L4c
        L3c:
            kotlin.e.n(r9)
            p8.s r9 = r8.j()
            r0.f14220d = r4
            java.lang.Object r9 = r9.o1(r0)
            if (r9 != r1) goto L4c
            goto L5c
        L4c:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = l00.k.a(r9)
            r0.f14217a = r2
            r0.f14220d = r3
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r1) goto L5d
        L5c:
            return r1
        L5d:
            z6.b r2 = z6.b.f101032b
            r6 = 4
            r7 = 0
            java.lang.String r3 = "ExperimentRepo"
            java.lang.String r4 = "fetch() - implementation left for user"
            r5 = 0
            z6.b.j(r2, r3, r4, r5, r6, r7)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl.b(j00.c):java.lang.Object");
    }

    @Override // com.baicizhan.app.biz.game.repo.experiment.b
    @l
    public Object c(@k j00.c<? super Map<String, String>> cVar) {
        Long b11 = this.f14210c.b();
        return g0.g(this.f14212e.d(), b11) ? this.f14211d.d() : c40.i.h(o.b(), new b(b11, null), cVar);
    }

    @Override // com.baicizhan.app.biz.game.repo.experiment.b
    @k
    public Map<String, String> d() {
        return this.f14211d.d();
    }

    @Override // com.baicizhan.app.biz.game.repo.experiment.b
    @l
    public Object e(@k Map<String, String> map, @k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, com.baicizhan.app.biz.game.repo.experiment.a.f14249a, "updateExperiments: " + map.size() + " items", null, 4, null);
        Object h11 = c40.i.h(o.b().plus(x2.f8011a), new d(map, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // com.baicizhan.app.biz.game.repo.experiment.b
    @l
    public Object f(@k j00.c<? super kotlinx.coroutines.flow.i<? extends Map<String, String>>> cVar) {
        return c40.i.h(o.b(), new ExperimentRepoImpl$observeExperiments$2(this, null), cVar);
    }

    public final s j() {
        return (s) w7.f.b(new c(o0.d(s.class), new e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
