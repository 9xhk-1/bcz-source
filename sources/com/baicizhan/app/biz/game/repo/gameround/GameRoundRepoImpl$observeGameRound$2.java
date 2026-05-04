package com.baicizhan.app.biz.game.repo.gameround;

import app.cash.sqldelight.coroutines.FlowQuery;
import c4.o;
import c40.r0;
import f4.o0;
import f4.v;
import h5.m;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2", f = "GameRoundRepo.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@u0({"SMAP\nGameRoundRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$observeGameRound$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n49#2:156\n51#2:160\n46#3:157\n51#3:159\n105#4:158\n1740#5,3:161\n*S KotlinDebug\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$observeGameRound$2\n*L\n71#1:156\n71#1:160\n71#1:157\n71#1:159\n71#1:158\n60#1:161,3\n*E\n"})
/* loaded from: classes3.dex */
public final class GameRoundRepoImpl$observeGameRound$2 extends SuspendLambda implements p<r0, j00.c<? super i<? extends List<? extends m>>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameRoundRepoImpl f14331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameRoundRepoImpl$observeGameRound$2(GameRoundRepoImpl gameRoundRepoImpl, long j11, j00.c<? super GameRoundRepoImpl$observeGameRound$2> cVar) {
        super(2, cVar);
        this.f14331b = gameRoundRepoImpl;
        this.f14332c = j11;
    }

    public static final boolean j(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        List<Pair> o62 = a00.r0.o6(list, list2);
        if ((o62 instanceof Collection) && o62.isEmpty()) {
            return true;
        }
        for (Pair pair : o62) {
            o0 o0Var = (o0) pair.component1();
            o0 o0Var2 = (o0) pair.component2();
            if (!g0.g(o0Var.n(), o0Var2.n()) || o0Var.k() != o0Var2.k() || !g0.g(o0Var.r(), o0Var2.r()) || o0Var.m() != o0Var2.m() || o0Var.l() != o0Var2.l() || o0Var.q() != o0Var2.q() || o0Var.p() != o0Var2.p()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new GameRoundRepoImpl$observeGameRound$2(this.f14331b, this.f14332c, cVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(r0 r0Var, j00.c<? super i<? extends List<m>>> cVar) {
        return ((GameRoundRepoImpl$observeGameRound$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f14330a;
        if (i11 == 0) {
            kotlin.e.n(obj);
            GameRoundRepoImpl gameRoundRepoImpl = this.f14331b;
            this.f14330a = 1;
            obj = gameRoundRepoImpl.k(this);
            if (obj == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        final i j02 = k.j0(FlowQuery.a(FlowQuery.f(((v) obj).h().m0(this.f14332c)), o.b()), new p() { // from class: com.baicizhan.app.biz.game.repo.gameround.c
            @Override // x00.p
            public final Object invoke(Object obj2, Object obj3) {
                boolean j11;
                j11 = GameRoundRepoImpl$observeGameRound$2.j((List) obj2, (List) obj3);
                return Boolean.valueOf(j11);
            }
        });
        final GameRoundRepoImpl gameRoundRepoImpl2 = this.f14331b;
        return new i<List<? extends m>>() { // from class: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$observeGameRound$2\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n72#3:51\n73#3:55\n74#3:57\n1563#4:52\n1634#4,2:53\n1636#4:56\n*S KotlinDebug\n*F\n+ 1 GameRoundRepo.kt\ncom/baicizhan/app/biz/game/repo/gameround/GameRoundRepoImpl$observeGameRound$2\n*L\n72#1:52\n72#1:53,2\n72#1:56\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f14254a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GameRoundRepoImpl f14255b;

                @l00.d(c = "com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1$2", f = "GameRoundRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, GameRoundRepoImpl gameRoundRepoImpl) {
                    this.f14254a = jVar;
                    this.f14255b = gameRoundRepoImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, j00.c r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r8 = r0.L$3
                        kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                        java.lang.Object r8 = r0.L$1
                        com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1$2$1 r8 = (com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r8
                        kotlin.e.n(r9)
                        goto L90
                    L31:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L39:
                        kotlin.e.n(r9)
                        kotlinx.coroutines.flow.j r9 = r7.f14254a
                        r2 = r8
                        java.util.List r2 = (java.util.List) r2
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = a00.i0.d0(r2, r5)
                        r4.<init>(r5)
                        java.util.Iterator r2 = r2.iterator()
                    L52:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L6c
                        java.lang.Object r5 = r2.next()
                        f4.o0 r5 = (f4.o0) r5
                        com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl r6 = r7.f14255b
                        k50.a r6 = com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl.j(r6)
                        h5.m r5 = com.baicizhan.app.biz.game.repo.gameround.b.e(r5, r6)
                        r4.add(r5)
                        goto L52
                    L6c:
                        java.lang.Object r2 = l00.k.a(r8)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r8 = l00.k.a(r8)
                        r0.L$2 = r8
                        java.lang.Object r8 = l00.k.a(r9)
                        r0.L$3 = r8
                        r8 = 0
                        r0.I$0 = r8
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r4, r0)
                        if (r8 != r1) goto L90
                        return r1
                    L90:
                        yz.g2 r8 = yz.g2.f100423a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl$observeGameRound$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super List<? extends m>> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, gameRoundRepoImpl2), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super i<? extends List<? extends m>>> cVar) {
        return invoke2(r0Var, (j00.c<? super i<? extends List<m>>>) cVar);
    }
}
