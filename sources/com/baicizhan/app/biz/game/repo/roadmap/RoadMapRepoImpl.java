package com.baicizhan.app.biz.game.repo.roadmap;

import c4.o;
import c40.i;
import c40.r0;
import f4.v2;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;
import p8.e0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {com.baicizhan.app.biz.game.repo.roadmap.a.class})
/* loaded from: classes3.dex */
public final class RoadMapRepoImpl implements com.baicizhan.app.biz.game.repo.roadmap.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h4.c f14334e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$getRoadMap$2", f = "WordRoadMapRepo.kt", i = {}, l = {57, 57}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super List<? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14343a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f14345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f14345c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return RoadMapRepoImpl.this.new a(this.f14345c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<Integer>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r6 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f14343a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L30
            L1e:
                kotlin.e.n(r6)
                com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl r6 = com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.this
                h4.c r6 = com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.e(r6)
                r5.f14343a = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L30
                goto L44
            L30:
                f4.v r6 = (f4.v) r6
                f4.v2 r6 = r6.e()
                long r3 = r5.f14345c
                j.j r6 = r6.S(r3)
                r5.f14343a = r2
                java.lang.Object r6 = k.e.e(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                f4.q2 r6 = (f4.q2) r6
                byte[] r6 = r6.f()
                ts.a<p8.e0, p8.e0$a> r0 = p8.e0.f79771e
                java.lang.Object r6 = l7.d.c(r6, r0)
                kotlin.jvm.internal.g0.m(r6)
                p8.e0 r6 = (p8.e0) r6
                java.util.List<java.lang.Integer> r6 = r6.f79772a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends Integer>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<Integer>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$getRoadMapInfo$2", f = "WordRoadMapRepo.kt", i = {}, l = {65, 65}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super e0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14346a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f14348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f14348c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return RoadMapRepoImpl.this.new b(this.f14348c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super e0> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r6 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f14346a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L30
            L1e:
                kotlin.e.n(r6)
                com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl r6 = com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.this
                h4.c r6 = com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.e(r6)
                r5.f14346a = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L30
                goto L44
            L30:
                f4.v r6 = (f4.v) r6
                f4.v2 r6 = r6.e()
                long r3 = r5.f14348c
                j.j r6 = r6.S(r3)
                r5.f14346a = r2
                java.lang.Object r6 = k.e.e(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                f4.q2 r6 = (f4.q2) r6
                byte[] r6 = r6.f()
                ts.a<p8.e0, p8.e0$a> r0 = p8.e0.f79771e
                java.lang.Object r6 = l7.d.c(r6, r0)
                kotlin.jvm.internal.g0.m(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$updateRoadMap$2", f = "WordRoadMapRepo.kt", i = {1, 1, 1}, l = {73, 75}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "data", "$i$a$-apply-RoadMapRepoImpl$updateRoadMap$2$1"}, s = {"L$1", "L$2", "I$0"}, v = 1)
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super v2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14349a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14350b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14351c;

        /* renamed from: d, reason: collision with root package name */
        public int f14352d;

        /* renamed from: e, reason: collision with root package name */
        public int f14353e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f14354f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e0 f14355g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ RoadMapRepoImpl f14356h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$updateRoadMap$2$1$1", f = "WordRoadMapRepo.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14357a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v2 f14358b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f14359c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ byte[] f14360d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v2 v2Var, long j11, byte[] bArr, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f14358b = v2Var;
                this.f14359c = j11;
                this.f14360d = bArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f14358b, this.f14359c, this.f14360d, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f14357a;
                if (i11 == 0) {
                    e.n(obj);
                    v2 v2Var = this.f14358b;
                    Long g11 = l00.a.g(this.f14359c);
                    byte[] bArr = this.f14360d;
                    this.f14357a = 1;
                    if (v2Var.P(g11, bArr, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j11, e0 e0Var, RoadMapRepoImpl roadMapRepoImpl, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f14354f = j11;
            this.f14355g = e0Var;
            this.f14356h = roadMapRepoImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f14354f, this.f14355g, this.f14356h, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        
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
                int r1 = r10.f14353e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r10.f14351c
                byte[] r0 = (byte[]) r0
                java.lang.Object r0 = r10.f14350b
                f4.v2 r0 = (f4.v2) r0
                java.lang.Object r0 = r10.f14349a
                f4.v2 r0 = (f4.v2) r0
                kotlin.e.n(r11)
                return r0
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                kotlin.e.n(r11)
                goto L69
            L2a:
                kotlin.e.n(r11)
                z6.b r4 = z6.b.f101032b
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = "updateRoadMap: bookId="
                r11.append(r1)
                long r5 = r10.f14354f
                r11.append(r5)
                java.lang.String r1 = ", roadInfo="
                r11.append(r1)
                p8.e0 r1 = r10.f14355g
                java.util.List<java.lang.Integer> r1 = r1.f79772a
                int r1 = r1.size()
                r11.append(r1)
                java.lang.String r6 = r11.toString()
                r8 = 4
                r9 = 0
                java.lang.String r5 = "RoadMapRepo"
                r7 = 0
                z6.b.j(r4, r5, r6, r7, r8, r9)
                com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl r11 = r10.f14356h
                h4.c r11 = com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.e(r11)
                r10.f14353e = r3
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L69
                goto L9f
            L69:
                f4.v r11 = (f4.v) r11
                f4.v2 r3 = r11.e()
                p8.e0 r11 = r10.f14355g
                long r5 = r10.f14354f
                ts.a<p8.e0, p8.e0$a> r1 = p8.e0.f79771e
                byte[] r7 = l7.d.a(r11, r1)
                r4 = r3
                com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$c$a r3 = new com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl$c$a
                r8 = 0
                r3.<init>(r4, r5, r7, r8)
                r10.f14349a = r4
                java.lang.Object r11 = l00.k.a(r4)
                r10.f14350b = r11
                java.lang.Object r11 = l00.k.a(r7)
                r10.f14351c = r11
                r11 = 0
                r10.f14352d = r11
                r10.f14353e = r2
                r5 = r3
                r3 = r4
                r4 = 0
                r7 = 1
                r6 = r10
                java.lang.Object r11 = j.o.a.a(r3, r4, r5, r6, r7, r8)
                r4 = r3
                if (r11 != r0) goto La0
            L9f:
                return r0
            La0:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public RoadMapRepoImpl(@k h4.c bczDb) {
        g0.p(bczDb, "bczDb");
        this.f14334e = bczDb;
    }

    @Override // com.baicizhan.app.biz.game.repo.roadmap.a
    @l
    public Object a(long j11, @k j00.c<? super List<Integer>> cVar) {
        return i.h(o.b(), new a(j11, null), cVar);
    }

    @Override // com.baicizhan.app.biz.game.repo.roadmap.a
    @l
    public Object b(long j11, @k j00.c<? super kotlinx.coroutines.flow.i<e0>> cVar) {
        z6.b.j(z6.b.f101032b, com.baicizhan.app.biz.game.repo.roadmap.b.f14372a, "observeRoadMap: bookId=" + j11, null, 4, null);
        return i.h(o.b(), new RoadMapRepoImpl$observeRoadMap$2(this, j11, null), cVar);
    }

    @Override // com.baicizhan.app.biz.game.repo.roadmap.a
    @l
    public Object c(long j11, @k j00.c<? super e0> cVar) {
        return i.h(o.b(), new b(j11, null), cVar);
    }

    @Override // com.baicizhan.app.biz.game.repo.roadmap.a
    @l
    public Object d(long j11, @k e0 e0Var, @k j00.c<? super g2> cVar) {
        Object h11 = i.h(o.b(), new c(j11, e0Var, this, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
