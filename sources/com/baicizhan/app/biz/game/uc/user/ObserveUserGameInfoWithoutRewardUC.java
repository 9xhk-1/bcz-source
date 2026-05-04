package com.baicizhan.app.biz.game.uc.user;

import com.baicizhan.app.biz.game.repo.userresource.LanguageType;
import g10.u;
import h5.f0;
import h5.w0;
import h5.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m6.o;
import m80.k;
import m80.l;
import oa0.r;
import org.junit.jupiter.api.j2;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nObserveUserGameInfoWithoutRewardUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveUserGameInfoWithoutRewardUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserGameInfoWithoutRewardUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,50:1\n49#2:51\n51#2:55\n46#3:52\n51#3:54\n105#4:53\n*S KotlinDebug\n*F\n+ 1 ObserveUserGameInfoWithoutRewardUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserGameInfoWithoutRewardUC\n*L\n24#1:51\n24#1:55\n24#1:52\n24#1:54\n24#1:53\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveUserGameInfoWithoutRewardUC {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w5.a f15408a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ObserveUserGameInfoUC f15409b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f15410c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC", f = "ObserveUserGameInfoWithoutRewardUC.kt", i = {0, 1}, l = {23, 24}, m = "invoke", n = {"languageType", "languageType"}, s = {"L$0", "L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15415a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15416b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15417c;

        /* renamed from: e, reason: collision with root package name */
        public int f15419e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f15417c = obj;
            this.f15419e |= Integer.MIN_VALUE;
            return ObserveUserGameInfoWithoutRewardUC.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$invoke$3", f = "ObserveUserGameInfoWithoutRewardUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements q<w0, f0, j00.c<? super w0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15420a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15421b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15422c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LanguageType f15423d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15424a;

            static {
                int[] iArr = new int[LanguageType.values().length];
                try {
                    iArr[LanguageType.En.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LanguageType.Jp.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f15424a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LanguageType languageType, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f15423d = languageType;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w0 w0Var, f0 f0Var, j00.c<? super w0> cVar) {
            b bVar = new b(this.f15423d, cVar);
            bVar.f15421b = w0Var;
            bVar.f15422c = f0Var;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long k11;
            w0 w0Var = (w0) this.f15421b;
            f0 f0Var = (f0) this.f15422c;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15420a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            h5.g h11 = w0Var.h();
            int i11 = a.f15424a[this.f15423d.ordinal()];
            if (i11 == 1) {
                k11 = f0Var.k();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                k11 = f0Var.l();
            }
            w0 f11 = w0.f(w0Var, null, null, h5.g.e(h11, 0, x.g(h11.h(), u.v(h11.h().h() - k11, 0L), 0L, 0L, 0, 0L, 30, null), null, 5, null), w0Var.g() - f0Var.j(), 3, null);
            z6.b.j(z6.b.f101032b, "ObserveUserGameInfoUC", w0Var + " ," + f11 + j2.O + f0Var, null, 4, null);
            return f11;
        }
    }

    public ObserveUserGameInfoWithoutRewardUC(@k w5.a rewardRepoUC, @k ObserveUserGameInfoUC observeUserGameInfoUC, @k o extractRewardSummaryUC) {
        g0.p(rewardRepoUC, "rewardRepoUC");
        g0.p(observeUserGameInfoUC, "observeUserGameInfoUC");
        g0.p(extractRewardSummaryUC, "extractRewardSummaryUC");
        this.f15408a = rewardRepoUC;
        this.f15409b = observeUserGameInfoUC;
        this.f15410c = extractRewardSummaryUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k com.baicizhan.app.biz.game.repo.userresource.LanguageType r7, @m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.w0>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC.a
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$a r0 = (com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC.a) r0
            int r1 = r0.f15419e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15419e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$a r0 = new com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15417c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15419e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f15416b
            kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.i) r7
            java.lang.Object r0 = r0.f15415a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r0 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r0
            kotlin.e.n(r8)
            goto L69
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f15415a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r7 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r7
            kotlin.e.n(r8)
            goto L54
        L44:
            kotlin.e.n(r8)
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC r8 = r6.f15409b
            r0.f15415a = r7
            r0.f15419e = r4
            java.lang.Object r8 = r8.h(r7, r0)
            if (r8 != r1) goto L54
            goto L64
        L54:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            w5.a r2 = r6.f15408a
            r0.f15415a = r7
            r0.f15416b = r8
            r0.f15419e = r3
            java.lang.Object r0 = r2.c(r0)
            if (r0 != r1) goto L65
        L64:
            return r1
        L65:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L69:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$invoke$$inlined$map$1 r1 = new com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$invoke$$inlined$map$1
            r1.<init>()
            com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$b r8 = new com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC$b
            r2 = 0
            r8.<init>(r0, r2)
            kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.k.I(r7, r1, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC.b(com.baicizhan.app.biz.game.repo.userresource.LanguageType, j00.c):java.lang.Object");
    }
}
