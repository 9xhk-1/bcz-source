package u4;

import com.baicizhan.app.api.service.GameType;
import com.baicizhan.app.api.service.model.StreakAwardType;
import com.baicizhan.app.api.service.model.StreakState;
import com.baicizhan.app.api.service.model.game.RewardType;
import com.baicizhan.app.biz.game.model.LavaQuestState;
import com.baicizhan.app.biz.game.model.RankType;
import com.baicizhan.app.biz.game.model.RoundType;
import com.baicizhan.app.biz.resource.a;
import com.baicizhan.app.net.exception.NetworkException;
import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.online.playground_api.LavaquestGameInfo;
import h5.a1;
import h5.e0;
import h5.o0;
import h5.r0;
import h5.w;
import h5.w0;
import h5.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.b0;
import l3.c0;
import l3.g2;
import l3.h2;
import l3.n;
import l3.p;
import l3.r;
import l3.t;
import l3.z;
import m3.v0;
import m80.k;
import m80.l;
import z8.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/game/impl/home/base/ConvertKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1#2:282\n1869#3,2:283\n*S KotlinDebug\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/game/impl/home/base/ConvertKt\n*L\n92#1:283,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91733a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f91734b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f91735c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f91736d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f91737e;

        static {
            int[] iArr = new int[GameType.values().length];
            try {
                iArr[GameType.Learning.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameType.Spelling.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GameType.Review.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GameType.AiLeadU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f91733a = iArr;
            int[] iArr2 = new int[RoundType.values().length];
            try {
                iArr2[RoundType.LEARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RoundType.SPELLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RoundType.REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RoundType.AI_LEADS_U.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RoundType.AI_LEADS_U_R.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f91734b = iArr2;
            int[] iArr3 = new int[RewardType.values().length];
            try {
                iArr3[RewardType.Coin.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[RewardType.EnergyEn.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[RewardType.EnergyJp.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[RewardType.RankScore.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[RewardType.BuddyTravelSnacks.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f91735c = iArr3;
            int[] iArr4 = new int[RankType.values().length];
            try {
                iArr4[RankType.Up.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[RankType.Down.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[RankType.Hint.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            f91736d = iArr4;
            int[] iArr5 = new int[LavaQuestState.values().length];
            try {
                iArr5[LavaQuestState.Ready.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[LavaQuestState.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[LavaQuestState.SettledClaim.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[LavaQuestState.SettledNonClaim.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            f91737e = iArr5;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: u4.b$b, reason: collision with other inner class name */
    public static final class C1222b implements g2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1222b f91738a = new C1222b();

        @Override // l3.g2
        public final Object a(j00.c<? super yz.g2> cVar) {
            return yz.g2.f100423a;
        }
    }

    @k
    public static final n a(@k h5.g gVar) {
        g0.p(gVar, "<this>");
        if (w3.g.n() < gVar.j().d()) {
            return new n.b(h2.a.f69332a, gVar.j().d());
        }
        return new n.a((int) gVar.h().h(), (int) gVar.h().l(), gVar.h().j() + gVar.h().p(), gVar.h().n(), (int) gVar.h().p());
    }

    @l
    public static final n b(@k y yVar) {
        g0.p(yVar, "<this>");
        if ((com.baicizhan.app.biz.game.model.a.d(yVar) ? yVar : null) != null) {
            return new n.b(h2.b.f69333a, yVar.e());
        }
        return null;
    }

    @k
    public static final GameType c(@k RoundType roundType) {
        g0.p(roundType, "<this>");
        int i11 = a.f91734b[roundType.ordinal()];
        if (i11 == 1) {
            return GameType.Learning;
        }
        if (i11 == 2) {
            return GameType.Spelling;
        }
        if (i11 == 3) {
            return GameType.Review;
        }
        if (i11 == 4 || i11 == 5) {
            return GameType.AiLeadU;
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public static final String d(@k Throwable th2) {
        g0.p(th2, "<this>");
        if (!(th2 instanceof LogicException)) {
            return th2 instanceof NetworkException ? "网络状态差，请在稳定的网络环境下\n重新尝试" : "数据加载失败，请重新尝试";
        }
        String message = th2.getMessage();
        return message == null ? "数据加载失败，请重新尝试" : message;
    }

    @k
    public static final t e(@k u uVar) {
        g0.p(uVar, "<this>");
        return new t(uVar.f102074b, uVar.f102073a, uVar.f102075c);
    }

    @k
    public static final l3.u f(@k e0 e0Var) {
        g0.p(e0Var, "<this>");
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        int i11 = 0;
        for (v0 v0Var : e0Var.e()) {
            int i12 = a.f91735c[v0Var.j().ordinal()];
            if (i12 == 1) {
                j11 += v0Var.f();
            } else if (i12 == 2 || i12 == 3) {
                j12 += v0Var.f();
            } else if (i12 == 4) {
                j13 += v0Var.f();
            } else if (i12 == 5) {
                i11 += v0Var.f();
            }
        }
        return new l3.u(j11, j12, j13, i11);
    }

    @k
    public static final RoundType g(@k GameType gameType) {
        g0.p(gameType, "<this>");
        int i11 = a.f91733a[gameType.ordinal()];
        if (i11 == 1) {
            return RoundType.LEARNING;
        }
        if (i11 == 2) {
            return RoundType.SPELLING;
        }
        if (i11 == 3) {
            return RoundType.REVIEW;
        }
        if (i11 == 4) {
            return RoundType.AI_LEADS_U;
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static final z.a h(@k w wVar, @k g2 uiAction) {
        g0.p(wVar, "<this>");
        g0.p(uiAction, "uiAction");
        if (wVar.f()) {
            return null;
        }
        LavaquestGameInfo g11 = wVar.g();
        int i11 = a.f91737e[wVar.h().ordinal()];
        if (i11 == 1) {
            return new z.a.b(g11.icon_pic, g11.name, uiAction, g11.theme_pic);
        }
        if (i11 == 2) {
            return new z.a.C0838a(g11.icon_pic, g11.name, g11.end_time);
        }
        if (i11 == 3) {
            return new z.a.c(g11.icon_pic, g11.name, false, g11.cool_down_time);
        }
        if (i11 == 4) {
            return new z.a.c(g11.icon_pic, g11.name, true, g11.cool_down_time);
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static final z.b i(@k u8.e eVar) {
        g0.p(eVar, "<this>");
        int i11 = eVar.f91916a;
        return new z.b(i11, r(i11), eVar.f91917b);
    }

    @l
    public static final z.c j(@k o0 o0Var, @k g2 action) {
        g0.p(o0Var, "<this>");
        g0.p(action, "action");
        if (o0Var.e()) {
            return null;
        }
        int i11 = a.f91736d[o0Var.f().ordinal()];
        return new z.c(i11 != 1 ? i11 != 2 ? i11 != 3 ? p.b.f69682a : p.d.f69684a : p.c.f69683a : p.e.f69685a, action);
    }

    @l
    public static final z.d k(@k a1 a1Var, @k g2 taskClick) {
        g0.p(a1Var, "<this>");
        g0.p(taskClick, "taskClick");
        if (a1Var.l()) {
            return null;
        }
        return new z.d(a1Var.n() ? p.d.f69684a : p.b.f69682a, taskClick);
    }

    @k
    public static final b0 l(@k a1 a1Var) {
        g0.p(a1Var, "<this>");
        return new b0(a1Var.o(), a1Var.p() ? StreakState.Winning : a1Var.k() ? StreakState.Hint : StreakState.Default);
    }

    @k
    public static final StreakAwardType m(int i11) {
        if (i11 == 1) {
            return StreakAwardType.Coin;
        }
        if (i11 == 2) {
            return StreakAwardType.AvatarFrame;
        }
        if (i11 == 3) {
            return StreakAwardType.Skin;
        }
        if (i11 == 4) {
            return StreakAwardType.CardSlot;
        }
        throw new IllegalArgumentException("Unknown StreakAwardType value: " + i11);
    }

    @k
    public static final c0 n(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return new c0(r0Var.l(), r0Var.k(), r0Var.i(), r0Var.m(), r0Var.j());
    }

    @k
    public static final l3.e0 o(@k w0 w0Var, @k b0 streak, boolean z11, @k g2 onAvatarClick) {
        g0.p(w0Var, "<this>");
        g0.p(streak, "streak");
        g0.p(onAvatarClick, "onAvatarClick");
        return new l3.e0(w0Var.j().e(), com.baicizhan.app.biz.game.model.a.d(w0Var.i()) ? r.b.f69690a : r.a.f69689a, w0Var.g(), q(w0Var.h(), w0Var.i()), streak, z11, onAvatarClick);
    }

    public static /* synthetic */ l3.e0 p(w0 w0Var, b0 b0Var, boolean z11, g2 g2Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            g2Var = C1222b.f91738a;
        }
        return o(w0Var, b0Var, z11, g2Var);
    }

    @k
    public static final n q(@k h5.g energyModel, @k y membershipModel) {
        g0.p(energyModel, "energyModel");
        g0.p(membershipModel, "membershipModel");
        n b11 = b(membershipModel);
        return b11 == null ? a(energyModel) : b11;
    }

    public static final String r(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 5 ? i11 != 6 ? i11 != 8 ? i11 != 9 ? f7.b.b(a.C0228a.C0229a.b.f15524a.a()) : f7.b.b(a.C0228a.C0229a.b.f15524a.a()) : f7.b.b(a.C0228a.C0229a.b.f15524a.c()) : f7.b.b(a.C0228a.C0229a.b.f15524a.d()) : f7.b.b(a.C0228a.C0229a.b.f15524a.d()) : f7.b.b(a.C0228a.C0229a.b.f15524a.a()) : f7.b.b(a.C0228a.C0229a.b.f15524a.b()) : f7.b.b(a.C0228a.C0229a.b.f15524a.b());
    }
}
