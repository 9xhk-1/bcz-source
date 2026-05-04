package com.baicizhan.app.biz.game.uc.monetization;

import com.baicizhan.app.biz.game.repo.userresource.LanguageType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final w5.a f14891a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.app.biz.game.uc.monetization.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0217a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14892a;

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
            f14892a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.BuyEnergyUC", f = "BuyEnergyUC.kt", i = {0, 0, 0}, l = {39}, m = "invoke", n = {"languageType", "rewardPackage", "count"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f14893a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14894b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14895c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14896d;

        /* renamed from: f, reason: collision with root package name */
        public int f14898f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14896d = obj;
            this.f14898f |= Integer.MIN_VALUE;
            return a.this.a(0, null, this);
        }
    }

    public a(@m80.k w5.a rewardRepo) {
        g0.p(rewardRepo, "rewardRepo");
        this.f14891a = rewardRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r19, @m80.k com.baicizhan.app.biz.game.repo.userresource.LanguageType r20, @m80.k j00.c<? super yz.g2> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.baicizhan.app.biz.game.uc.monetization.a.b
            if (r2 == 0) goto L17
            r2 = r1
            com.baicizhan.app.biz.game.uc.monetization.a$b r2 = (com.baicizhan.app.biz.game.uc.monetization.a.b) r2
            int r3 = r2.f14898f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f14898f = r3
            goto L1c
        L17:
            com.baicizhan.app.biz.game.uc.monetization.a$b r2 = new com.baicizhan.app.biz.game.uc.monetization.a$b
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f14896d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            int r4 = r2.f14898f
            r5 = 1
            if (r4 == 0) goto L40
            if (r4 != r5) goto L38
            int r3 = r2.f14893a
            java.lang.Object r4 = r2.f14895c
            h5.e0 r4 = (h5.e0) r4
            java.lang.Object r2 = r2.f14894b
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r2 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r2
            kotlin.e.n(r1)
            r14 = r3
            goto La1
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            kotlin.e.n(r1)
            int[] r1 = com.baicizhan.app.biz.game.uc.monetization.a.C0217a.f14892a
            int r4 = r20.ordinal()
            r1 = r1[r4]
            if (r1 == r5) goto L6e
            r4 = 2
            if (r1 != r4) goto L68
            h5.e0 r1 = new h5.e0
            com.baicizhan.app.biz.game.model.RewardPackageType r4 = com.baicizhan.app.biz.game.model.RewardPackageType.SentenceRound
            com.baicizhan.app.api.service.model.game.RewardType r7 = com.baicizhan.app.api.service.model.game.RewardType.EnergyJp
            m3.v0 r6 = new m3.v0
            r10 = 4
            r11 = 0
            r9 = 0
            r8 = r19
            r6.<init>(r7, r8, r9, r10, r11)
            java.util.List r6 = a00.g0.l(r6)
            r1.<init>(r4, r6)
            goto L87
        L68:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L6e:
            h5.e0 r1 = new h5.e0
            com.baicizhan.app.biz.game.model.RewardPackageType r4 = com.baicizhan.app.biz.game.model.RewardPackageType.WordsRound
            com.baicizhan.app.api.service.model.game.RewardType r13 = com.baicizhan.app.api.service.model.game.RewardType.EnergyEn
            m3.v0 r12 = new m3.v0
            r16 = 4
            r17 = 0
            r15 = 0
            r14 = r19
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.List r6 = a00.g0.l(r12)
            r1.<init>(r4, r6)
        L87:
            w5.a r4 = r0.f14891a
            r6 = r20
            r2.f14894b = r6
            java.lang.Object r7 = l00.k.a(r1)
            r2.f14895c = r7
            r14 = r19
            r2.f14893a = r14
            r2.f14898f = r5
            java.lang.Object r1 = r4.b(r1, r2)
            if (r1 != r3) goto La0
            return r3
        La0:
            r2 = r6
        La1:
            z6.b r3 = z6.b.f101032b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r4 = 32
            r1.append(r4)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            r7 = 4
            r8 = 0
            java.lang.String r4 = "BuyEnergyUC"
            r6 = 0
            z6.b.d(r3, r4, r5, r6, r7, r8)
            yz.g2 r1 = yz.g2.f100423a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.a.a(int, com.baicizhan.app.biz.game.repo.userresource.LanguageType, j00.c):java.lang.Object");
    }
}
