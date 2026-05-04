package com.baicizhan.app.biz.game.repo.gameround;

import c4.o;
import c40.i;
import c40.r0;
import c40.x2;
import com.baicizhan.app.biz.game.model.RoundType;
import f4.o0;
import f4.v;
import h5.m;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import p8.h0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {com.baicizhan.app.biz.game.repo.gameround.e.class})
/* loaded from: classes3.dex */
public final class GameRoundRepoImpl implements com.baicizhan.app.biz.game.repo.gameround.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h4.c f14250a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final k50.a f14251b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$addGameRoundInfo$2", f = "GameRoundRepo.kt", i = {1, 1, 2, 2, 2}, l = {135, 139, 141}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-GameRoundRepoImpl$addGameRoundInfo$2$1", "$this$invokeSuspend_u24lambda_u240", "gameRound", "$i$a$-apply-GameRoundRepoImpl$addGameRoundInfo$2$1"}, s = {"L$2", "I$0", "L$1", "L$2", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14256a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14257b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14258c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14259d;

        /* renamed from: e, reason: collision with root package name */
        public long f14260e;

        /* renamed from: f, reason: collision with root package name */
        public long f14261f;

        /* renamed from: g, reason: collision with root package name */
        public long f14262g;

        /* renamed from: h, reason: collision with root package name */
        public long f14263h;

        /* renamed from: i, reason: collision with root package name */
        public long f14264i;

        /* renamed from: j, reason: collision with root package name */
        public long f14265j;

        /* renamed from: k, reason: collision with root package name */
        public int f14266k;

        /* renamed from: l, reason: collision with root package name */
        public int f14267l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ h0 f14269n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f14270o;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$addGameRoundInfo$2$1$1", f = "GameRoundRepo.kt", i = {1, 2}, l = {142, 145, 147}, m = "invokeSuspend", n = {"old", "old"}, s = {"L$0", "L$0"}, v = 1)
        /* renamed from: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$a$a, reason: collision with other inner class name */
        public static final class C0204a extends SuspendLambda implements p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14271a;

            /* renamed from: b, reason: collision with root package name */
            public int f14272b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f14273c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f14274d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h0 f14275e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ o0 f14276f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0204a(v vVar, long j11, h0 h0Var, o0 o0Var, j00.c<? super C0204a> cVar) {
                super(2, cVar);
                this.f14273c = vVar;
                this.f14274d = j11;
                this.f14275e = h0Var;
                this.f14276f = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0204a(this.f14273c, this.f14274d, this.f14275e, this.f14276f, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((C0204a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x00a2, code lost:
            
                if (r11.j0(r3, r10) != r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
            
                if (r11.d0(r4, r10) == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
            
                if (r11 == r0) goto L22;
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
                    int r1 = r10.f14272b
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2e
                    if (r1 == r4) goto L2a
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r10.f14271a
                    f4.o0 r0 = (f4.o0) r0
                    kotlin.e.n(r11)
                    goto La5
                L1a:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L22:
                    java.lang.Object r1 = r10.f14271a
                    f4.o0 r1 = (f4.o0) r1
                    kotlin.e.n(r11)
                    goto L8e
                L2a:
                    kotlin.e.n(r11)
                    goto L4b
                L2e:
                    kotlin.e.n(r11)
                    f4.v r11 = r10.f14273c
                    f4.e1 r11 = r11.h()
                    long r5 = r10.f14274d
                    p8.h0 r1 = r10.f14275e
                    int r1 = r1.f79850e
                    long r7 = (long) r1
                    j.j r11 = r11.p0(r5, r7)
                    r10.f14272b = r4
                    java.lang.Object r11 = k.e.f(r11, r10)
                    if (r11 != r0) goto L4b
                    goto La4
                L4b:
                    r1 = r11
                    f4.o0 r1 = (f4.o0) r1
                    if (r1 == 0) goto L8e
                    z6.b r4 = z6.b.f101032b
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r5 = "round conflict old "
                    r11.append(r5)
                    r11.append(r1)
                    java.lang.String r5 = ", new "
                    r11.append(r5)
                    p8.h0 r5 = r10.f14275e
                    r11.append(r5)
                    java.lang.String r6 = r11.toString()
                    r8 = 4
                    r9 = 0
                    java.lang.String r5 = "IGameRoundRepo"
                    r7 = 0
                    z6.b.j(r4, r5, r6, r7, r8, r9)
                    f4.v r11 = r10.f14273c
                    f4.e1 r11 = r11.h()
                    java.lang.String r4 = r1.n()
                    java.lang.Object r5 = l00.k.a(r1)
                    r10.f14271a = r5
                    r10.f14272b = r3
                    java.lang.Object r11 = r11.d0(r4, r10)
                    if (r11 != r0) goto L8e
                    goto La4
                L8e:
                    f4.v r11 = r10.f14273c
                    f4.e1 r11 = r11.h()
                    f4.o0 r3 = r10.f14276f
                    java.lang.Object r1 = l00.k.a(r1)
                    r10.f14271a = r1
                    r10.f14272b = r2
                    java.lang.Object r11 = r11.j0(r3, r10)
                    if (r11 != r0) goto La5
                La4:
                    return r0
                La5:
                    yz.g2 r11 = yz.g2.f100423a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.a.C0204a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, long j11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f14269n = h0Var;
            this.f14270o = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return GameRoundRepoImpl.this.new a(this.f14269n, this.f14270o, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        
            if (r0 == r6) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0103 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$deleteGameRound$2", f = "GameRoundRepo.kt", i = {}, l = {105, 106}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14277a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14279c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f14279c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return GameRoundRepoImpl.this.new b(this.f14279c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (r5 == r0) goto L16;
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
                int r1 = r4.f14277a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                return r5
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L2c
            L1e:
                kotlin.e.n(r5)
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r5 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                r4.f14277a = r3
                java.lang.Object r5 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.i(r5, r4)
                if (r5 != r0) goto L2c
                goto L3c
            L2c:
                f4.v r5 = (f4.v) r5
                f4.e1 r5 = r5.h()
                java.lang.String r1 = r4.f14279c
                r4.f14277a = r2
                java.lang.Object r5 = r5.d0(r1, r4)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$getGameRound$2", f = "GameRoundRepo.kt", i = {}, l = {44, 45}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nGameRoundRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$getGameRound$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1563#2:156\n1634#2,3:157\n*S KotlinDebug\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$getGameRound$2\n*L\n45#1:156\n45#1:157,3\n*E\n"})
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super List<? extends m>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14280a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f14282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f14282c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return GameRoundRepoImpl.this.new c(this.f14282c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<m>> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        
            if (r6 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        
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
                int r1 = r5.f14280a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L41
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L2c
            L1e:
                kotlin.e.n(r6)
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r6 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                r5.f14280a = r3
                java.lang.Object r6 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.i(r6, r5)
                if (r6 != r0) goto L2c
                goto L40
            L2c:
                f4.v r6 = (f4.v) r6
                f4.e1 r6 = r6.h()
                long r3 = r5.f14282c
                j.j r6 = r6.m0(r3)
                r5.f14280a = r2
                java.lang.Object r6 = k.e.c(r6, r5)
                if (r6 != r0) goto L41
            L40:
                return r0
            L41:
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r0 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = a00.i0.d0(r6, r2)
                r1.<init>(r2)
                java.util.Iterator r6 = r6.iterator()
            L54:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L6c
                java.lang.Object r2 = r6.next()
                f4.o0 r2 = (f4.o0) r2
                k50.a r3 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.j(r0)
                h5.m r2 = com.baicizhan.app.biz.game.repo.gameround.b.e(r2, r3)
                r1.add(r2)
                goto L54
            L6c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends m>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<m>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$getGameRound$4", f = "GameRoundRepo.kt", i = {}, l = {81, 83}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super m>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14283a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f14285c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RoundType f14286d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j11, RoundType roundType, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f14285c = j11;
            this.f14286d = roundType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return GameRoundRepoImpl.this.new d(this.f14285c, this.f14286d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super m> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r8 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f14283a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r8)
                goto L47
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.e.n(r8)
                goto L2c
            L1e:
                kotlin.e.n(r8)
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r8 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                r7.f14283a = r3
                java.lang.Object r8 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.i(r8, r7)
                if (r8 != r0) goto L2c
                goto L46
            L2c:
                f4.v r8 = (f4.v) r8
                f4.e1 r8 = r8.h()
                long r3 = r7.f14285c
                com.baicizhan.app.biz.game.model.RoundType r1 = r7.f14286d
                long r5 = r1.getValue()
                j.j r8 = r8.p0(r3, r5)
                r7.f14283a = r2
                java.lang.Object r8 = k.e.f(r8, r7)
                if (r8 != r0) goto L47
            L46:
                return r0
            L47:
                f4.o0 r8 = (f4.o0) r8
                if (r8 == 0) goto L56
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r0 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                k50.a r0 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.j(r0)
                h5.m r8 = com.baicizhan.app.biz.game.repo.gameround.b.e(r8, r0)
                return r8
            L56:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$getGameRound$6", f = "GameRoundRepo.kt", i = {}, l = {90, 92}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements p<r0, j00.c<? super m>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14287a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f14289c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return GameRoundRepoImpl.this.new e(this.f14289c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super m> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r5 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
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
                int r1 = r4.f14287a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L41
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L2c
            L1e:
                kotlin.e.n(r5)
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r5 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                r4.f14287a = r3
                java.lang.Object r5 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.i(r5, r4)
                if (r5 != r0) goto L2c
                goto L40
            L2c:
                f4.v r5 = (f4.v) r5
                f4.e1 r5 = r5.h()
                java.lang.String r1 = r4.f14289c
                j.j r5 = r5.s0(r1)
                r4.f14287a = r2
                java.lang.Object r5 = k.e.e(r5, r4)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                f4.o0 r5 = (f4.o0) r5
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r0 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                k50.a r0 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.j(r0)
                h5.m r5 = com.baicizhan.app.biz.game.repo.gameround.b.e(r5, r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$updateGameRoundInfo$2", f = "GameRoundRepo.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2}, l = {112, 117, 120}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$a$-apply-GameRoundRepoImpl$updateGameRoundInfo$2$1", "$i$f$map", "$i$f$mapTo", "$i$a$-map-GameRoundRepoImpl$updateGameRoundInfo$2$1$gameRounds$1", "$this$invokeSuspend_u24lambda_u240", "gameRounds", "$i$a$-apply-GameRoundRepoImpl$updateGameRoundInfo$2$1"}, s = {"L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "L$1", "L$2", "I$0"}, v = 1)
    @u0({"SMAP\nGameRoundRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$updateGameRoundInfo$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1563#2:156\n1634#2,3:157\n*S KotlinDebug\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$updateGameRoundInfo$2\n*L\n113#1:156\n113#1:157,3\n*E\n"})
    public static final class f extends SuspendLambda implements p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14290a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14291b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14292c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14293d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14294e;

        /* renamed from: f, reason: collision with root package name */
        public Object f14295f;

        /* renamed from: g, reason: collision with root package name */
        public Object f14296g;

        /* renamed from: h, reason: collision with root package name */
        public Object f14297h;

        /* renamed from: i, reason: collision with root package name */
        public Object f14298i;

        /* renamed from: j, reason: collision with root package name */
        public Object f14299j;

        /* renamed from: k, reason: collision with root package name */
        public Object f14300k;

        /* renamed from: l, reason: collision with root package name */
        public long f14301l;

        /* renamed from: m, reason: collision with root package name */
        public long f14302m;

        /* renamed from: n, reason: collision with root package name */
        public long f14303n;

        /* renamed from: o, reason: collision with root package name */
        public long f14304o;

        /* renamed from: p, reason: collision with root package name */
        public long f14305p;

        /* renamed from: q, reason: collision with root package name */
        public long f14306q;

        /* renamed from: r, reason: collision with root package name */
        public int f14307r;

        /* renamed from: s, reason: collision with root package name */
        public int f14308s;

        /* renamed from: t, reason: collision with root package name */
        public int f14309t;

        /* renamed from: u, reason: collision with root package name */
        public int f14310u;

        /* renamed from: v, reason: collision with root package name */
        public int f14311v;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ List<h0> f14313x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ long f14314y;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$updateGameRoundInfo$2$1$1", f = "GameRoundRepo.kt", i = {1, 1, 1, 1, 1}, l = {121, 123}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-GameRoundRepoImpl$updateGameRoundInfo$2$1$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nGameRoundRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$updateGameRoundInfo$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1869#2,2:156\n*S KotlinDebug\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$updateGameRoundInfo$2$1$1\n*L\n122#1:156,2\n*E\n"})
        public static final class a extends SuspendLambda implements p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14315a;

            /* renamed from: b, reason: collision with root package name */
            public Object f14316b;

            /* renamed from: c, reason: collision with root package name */
            public Object f14317c;

            /* renamed from: d, reason: collision with root package name */
            public Object f14318d;

            /* renamed from: e, reason: collision with root package name */
            public Object f14319e;

            /* renamed from: f, reason: collision with root package name */
            public int f14320f;

            /* renamed from: g, reason: collision with root package name */
            public int f14321g;

            /* renamed from: h, reason: collision with root package name */
            public int f14322h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ v f14323i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f14324j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ List<o0> f14325k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v vVar, long j11, List<o0> list, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f14323i = vVar;
                this.f14324j = j11;
                this.f14325k = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f14323i, this.f14324j, this.f14325k, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
            
                if (r11.a0(r5, r10) == r0) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r10.f14322h
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r4) goto L2d
                    if (r1 != r3) goto L25
                    int r1 = r10.f14320f
                    java.lang.Object r4 = r10.f14319e
                    f4.o0 r4 = (f4.o0) r4
                    java.lang.Object r4 = r10.f14317c
                    java.util.Iterator r4 = (java.util.Iterator) r4
                    java.lang.Object r5 = r10.f14316b
                    f4.v r5 = (f4.v) r5
                    java.lang.Object r6 = r10.f14315a
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    kotlin.e.n(r11)
                    goto L52
                L25:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L2d:
                    kotlin.e.n(r11)
                    goto L45
                L31:
                    kotlin.e.n(r11)
                    f4.v r11 = r10.f14323i
                    f4.e1 r11 = r11.h()
                    long r5 = r10.f14324j
                    r10.f14322h = r4
                    java.lang.Object r11 = r11.a0(r5, r10)
                    if (r11 != r0) goto L45
                    goto L85
                L45:
                    java.util.List<f4.o0> r11 = r10.f14325k
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    f4.v r1 = r10.f14323i
                    java.util.Iterator r4 = r11.iterator()
                    r6 = r11
                    r5 = r1
                    r1 = r2
                L52:
                    boolean r11 = r4.hasNext()
                    if (r11 == 0) goto L86
                    java.lang.Object r11 = r4.next()
                    r7 = r11
                    f4.o0 r7 = (f4.o0) r7
                    f4.e1 r8 = r5.h()
                    java.lang.Object r9 = l00.k.a(r6)
                    r10.f14315a = r9
                    r10.f14316b = r5
                    r10.f14317c = r4
                    java.lang.Object r11 = l00.k.a(r11)
                    r10.f14318d = r11
                    java.lang.Object r11 = l00.k.a(r7)
                    r10.f14319e = r11
                    r10.f14320f = r1
                    r10.f14321g = r2
                    r10.f14322h = r3
                    java.lang.Object r11 = r8.j0(r7, r10)
                    if (r11 != r0) goto L52
                L85:
                    return r0
                L86:
                    yz.g2 r11 = yz.g2.f100423a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<h0> list, long j11, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f14313x = list;
            this.f14314y = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return GameRoundRepoImpl.this.new f(this.f14313x, this.f14314y, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
        
            if (r0 == r6) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0150 -> B:12:0x016b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) {
            /*
                Method dump skipped, instructions count: 461
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$updateGameRoundState$2", f = "GameRoundRepo.kt", i = {}, l = {98, 99}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14326a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14328c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f14329d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f14328c = str;
            this.f14329d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return GameRoundRepoImpl.this.new g(this.f14328c, this.f14329d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (r5 == r0) goto L16;
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
                int r1 = r4.f14326a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                return r5
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L2c
            L1e:
                kotlin.e.n(r5)
                com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r5 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.this
                r4.f14326a = r3
                java.lang.Object r5 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.i(r5, r4)
                if (r5 != r0) goto L2c
                goto L3e
            L2c:
                f4.v r5 = (f4.v) r5
                f4.e1 r5 = r5.h()
                java.lang.String r1 = r4.f14328c
                java.lang.String r3 = r4.f14329d
                r4.f14326a = r2
                java.lang.Object r5 = r5.x0(r1, r3, r4)
                if (r5 != r0) goto L3f
            L3e:
                return r0
            L3f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public GameRoundRepoImpl(@k h4.c bczDb, @k k50.a json) {
        g0.p(bczDb, "bczDb");
        g0.p(json, "json");
        this.f14250a = bczDb;
        this.f14251b = json;
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object a(@k String str, @k String str2, @k j00.c<? super g2> cVar) {
        Object h11 = i.h(o.b().plus(x2.f8011a), new g(str2, str, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object b(long j11, @k j00.c<? super List<m>> cVar) {
        return i.h(o.b(), new c(j11, null), cVar);
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object c(long j11, @k j00.c<? super kotlinx.coroutines.flow.i<? extends List<m>>> cVar) {
        return i.h(o.b(), new GameRoundRepoImpl$observeGameRound$2(this, j11, null), cVar);
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object d(long j11, @k List<h0> list, @k j00.c<? super g2> cVar) {
        Object h11 = i.h(o.b().plus(x2.f8011a), new f(list, j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object e(@k String str, @k j00.c<? super m> cVar) {
        return i.h(o.b().plus(x2.f8011a), new e(str, null), cVar);
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object f(@k String str, @k j00.c<? super g2> cVar) {
        Object h11 = i.h(o.b().plus(x2.f8011a), new b(str, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object g(long j11, @k h0 h0Var, @k j00.c<? super g2> cVar) {
        Object h11 = i.h(o.b().plus(x2.f8011a), new a(h0Var, j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // com.baicizhan.app.biz.game.repo.gameround.e
    @l
    public Object h(long j11, @k RoundType roundType, @k j00.c<? super m> cVar) {
        return i.h(o.b().plus(x2.f8011a), new d(j11, roundType, null), cVar);
    }

    public final Object k(j00.c<? super v> cVar) {
        return this.f14250a.a(cVar);
    }
}
