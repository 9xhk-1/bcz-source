package com.baicizhan.app.biz.game.impl.home.words;

import a00.a0;
import a00.i0;
import com.baicizhan.app.api.service.BuddyInHomeState;
import com.baicizhan.app.api.service.GameType;
import com.baicizhan.app.biz.game.model.IpAvatarState;
import com.baicizhan.app.biz.game.model.RoundType;
import com.baicizhan.app.biz.game.model.SentenceLanguageType;
import h5.a1;
import h5.h0;
import h5.j;
import h5.o0;
import h5.p0;
import h5.s;
import h5.t0;
import h5.w0;
import h5.z;
import h8.e;
import h8.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k3.a3;
import k3.d3;
import k3.h;
import k3.j1;
import k3.j2;
import k3.l3;
import k3.m3;
import k3.q;
import k3.t2;
import k3.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.d0;
import l3.g2;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWordsConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordsConvert.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsConvertKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n360#2,7:258\n1563#2:265\n1634#2,3:266\n1761#2,3:269\n*S KotlinDebug\n*F\n+ 1 WordsConvert.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsConvertKt\n*L\n103#1:258,7\n111#1:265\n111#1:266,3\n176#1:269,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14149a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14150b;

        static {
            int[] iArr = new int[SentenceLanguageType.values().length];
            try {
                iArr[SentenceLanguageType.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SentenceLanguageType.Jp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SentenceLanguageType.En.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SentenceLanguageType.Kr.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SentenceLanguageType.Fr.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SentenceLanguageType.Es.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f14149a = iArr;
            int[] iArr2 = new int[IpAvatarState.values().length];
            try {
                iArr2[IpAvatarState.Traveling.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IpAvatarState.RewardPending.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f14150b = iArr2;
        }
    }

    @k
    public static final h a(@k p0 p0Var) {
        boolean z11;
        g0.p(p0Var, "<this>");
        List<RoundType> s11 = p0Var.s();
        if (!(s11 instanceof Collection) || !s11.isEmpty()) {
            Iterator<T> it = s11.iterator();
            while (it.hasNext()) {
                if (a0.B8(new RoundType[]{RoundType.AI_LEADS_U, RoundType.AI_LEADS_U_R}, (RoundType) it.next())) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return (!p0Var.A() || p0Var.B()) ? new h.c(0, 1, null) : (!p0Var.C() || p0Var.D() || z11) ? new h.a(z11) : new h.b(0, 1, null);
    }

    @k
    public static final q b(@k p0 p0Var) {
        g0.p(p0Var, "<this>");
        return p0Var.B() ? new q.a(p0Var.y(), p0Var.v(), p0Var.u(), p0Var.q()) : new q.b(p0Var.y(), p0Var.v(), p0Var.u(), p0Var.q());
    }

    @k
    public static final j1 c(@k p0 p0Var) {
        g0.p(p0Var, "<this>");
        return p0Var.s().contains(RoundType.LEARNING) ? new j1.b(GameType.Learning, true, p0Var.x().n(), p0Var.x().o()) : p0Var.s().contains(RoundType.SPELLING) ? new j1.b(GameType.Spelling, true, p0Var.x().n(), p0Var.x().o()) : (p0Var.B() || p0Var.C()) ? new j1.a(p0Var.t()) : p0Var.w() ? new j1.b(GameType.Spelling, false, p0Var.x().n(), p0Var.x().o()) : new j1.b(GameType.Learning, false, p0Var.x().n(), p0Var.x().o());
    }

    @k
    public static final j2 d(@k p0 p0Var) {
        g0.p(p0Var, "<this>");
        return p0Var.B() ? new j2.a(0, 1, null) : !p0Var.D() ? new j2.b(0, 1, null) : new j2.c(p0Var.x().q(), p0Var.x().r(), p0Var.s().contains(RoundType.REVIEW));
    }

    @k
    public static final t2 e(@k h0 h0Var) {
        String str;
        g0.p(h0Var, "<this>");
        if (h0Var.f() == -1) {
            return t2.b.f65620a;
        }
        int f11 = h0Var.f();
        switch (a.f14149a[h0Var.e().ordinal()]) {
            case 1:
                str = "学多语言";
                break;
            case 2:
                str = "学日语";
                break;
            case 3:
                str = "学英语";
                break;
            case 4:
                str = "学韩语";
                break;
            case 5:
                str = "学法语";
                break;
            case 6:
                str = "学西语";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new t2.a(f11, str);
    }

    @k
    public static final a3 f(@k s sVar) {
        String str;
        g0.p(sVar, "<this>");
        v vVar = new v(sVar.b().i(), sVar.a().f(), sVar.b().j());
        if (sVar instanceof s.b) {
            s.b bVar = (s.b) sVar;
            return bVar.l() ? new a3.b.C0754b(vVar) : new a3.b.a(bVar.j(), bVar.k(), vVar);
        }
        if (!(sVar instanceof s.a)) {
            throw new NoWhenBranchMatchedException();
        }
        s.a aVar = (s.a) sVar;
        l n11 = aVar.n();
        int i11 = a.f14150b[aVar.k().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return new a3.a.C0753a(n11.f58977c, n11.f58978d, vVar, aVar.m() ? BuddyInHomeState.Tired : n11.f58977c >= n11.f58978d ? BuddyInHomeState.Ready : BuddyInHomeState.Idle);
            }
            return new a3.a.b(vVar);
        }
        int i12 = n11.f58979e;
        Long l11 = n11.f58980f;
        long longValue = l11 != null ? l11.longValue() : 0L;
        e l12 = aVar.l();
        if (l12 == null || (str = l12.f58889c) == null) {
            str = "";
        }
        return new a3.a.c(i12, str, longValue, vVar);
    }

    @k
    public static final d0 g(@m80.l g8.q qVar, @k g2 close) {
        g0.p(close, "close");
        if (qVar == null) {
            return new d0.b(0, 1, null);
        }
        String str = qVar.f53356d;
        if (str == null) {
            str = qVar.f53355c;
        }
        return new d0.a(str, qVar.f53354b, qVar.f53355c, close);
    }

    @k
    public static final d3 h(@k p0 p0Var, boolean z11) {
        g0.p(p0Var, "<this>");
        return new d3(z11, b(p0Var), c(p0Var), d(p0Var), j(p0Var), a(p0Var));
    }

    @k
    public static final l3 i(@k t0 t0Var) {
        g0.p(t0Var, "<this>");
        return new l3(t0Var.f(), t0Var.e());
    }

    @k
    public static final m3 j(@k p0 p0Var) {
        g0.p(p0Var, "<this>");
        Iterator<t0> it = p0Var.z().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().f() == p0Var.r()) {
                break;
            }
            i11++;
        }
        if (i11 == -1 || p0Var.z().isEmpty() || p0Var.C() || p0Var.B() || p0Var.w() || p0Var.s().contains(RoundType.SPELLING)) {
            return m3.a.f65446a;
        }
        List<t0> z11 = p0Var.z();
        ArrayList arrayList = new ArrayList(i0.d0(z11, 10));
        Iterator<T> it2 = z11.iterator();
        while (it2.hasNext()) {
            arrayList.add(i((t0) it2.next()));
        }
        return new m3.b(arrayList, i11);
    }

    @k
    public static final y4.b k(@k s ipAvatarJourney, @k p0 studySummary, @k w0 userGameInfoSnapshot, @k j gameBook, @k Pair<Integer, Integer> progress, @k a1 winnerTask, @k o0 studyScoreRank, @k g2 clickRank, @k g2 clickTask, @k z notificationModel, @k g2 onAvatarClick, long j11, @m80.l u8.e eVar) {
        g0.p(ipAvatarJourney, "ipAvatarJourney");
        g0.p(studySummary, "studySummary");
        g0.p(userGameInfoSnapshot, "userGameInfoSnapshot");
        g0.p(gameBook, "gameBook");
        g0.p(progress, "progress");
        g0.p(winnerTask, "winnerTask");
        g0.p(studyScoreRank, "studyScoreRank");
        g0.p(clickRank, "clickRank");
        g0.p(clickTask, "clickTask");
        g0.p(notificationModel, "notificationModel");
        g0.p(onAvatarClick, "onAvatarClick");
        return new y4.b(ipAvatarJourney, studySummary, userGameInfoSnapshot, gameBook, progress, winnerTask, studyScoreRank, clickRank, clickTask, notificationModel, onAvatarClick, j11, eVar);
    }
}
