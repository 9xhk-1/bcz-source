package v4;

import h5.a1;
import h5.j0;
import h5.o0;
import h5.s;
import h5.w0;
import h5.z;
import kotlin.jvm.internal.g0;
import l3.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j0 f92935a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final w0 f92936b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final s f92937c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a1 f92938d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final o0 f92939e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final g2 f92940f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final g2 f92941g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final z f92942h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final g2 f92943i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final u8.e f92944j;

    /* renamed from: k, reason: collision with root package name */
    public final long f92945k;

    public b(@m80.k j0 sentenceLearningJourney, @m80.k w0 userGameInfoSnapshot, @m80.k s ipAvatarJourney, @m80.k a1 winnerTask, @m80.k o0 studyScoreRank, @m80.k g2 clickRank, @m80.k g2 clickTask, @m80.k z notificationModel, @m80.k g2 onAvatarClick, @m80.l u8.e eVar, long j11) {
        g0.p(sentenceLearningJourney, "sentenceLearningJourney");
        g0.p(userGameInfoSnapshot, "userGameInfoSnapshot");
        g0.p(ipAvatarJourney, "ipAvatarJourney");
        g0.p(winnerTask, "winnerTask");
        g0.p(studyScoreRank, "studyScoreRank");
        g0.p(clickRank, "clickRank");
        g0.p(clickTask, "clickTask");
        g0.p(notificationModel, "notificationModel");
        g0.p(onAvatarClick, "onAvatarClick");
        this.f92935a = sentenceLearningJourney;
        this.f92936b = userGameInfoSnapshot;
        this.f92937c = ipAvatarJourney;
        this.f92938d = winnerTask;
        this.f92939e = studyScoreRank;
        this.f92940f = clickRank;
        this.f92941g = clickTask;
        this.f92942h = notificationModel;
        this.f92943i = onAvatarClick;
        this.f92944j = eVar;
        this.f92945k = j11;
    }

    public static /* synthetic */ b m(b bVar, j0 j0Var, w0 w0Var, s sVar, a1 a1Var, o0 o0Var, g2 g2Var, g2 g2Var2, z zVar, g2 g2Var3, u8.e eVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j0Var = bVar.f92935a;
        }
        if ((i11 & 2) != 0) {
            w0Var = bVar.f92936b;
        }
        if ((i11 & 4) != 0) {
            sVar = bVar.f92937c;
        }
        if ((i11 & 8) != 0) {
            a1Var = bVar.f92938d;
        }
        if ((i11 & 16) != 0) {
            o0Var = bVar.f92939e;
        }
        if ((i11 & 32) != 0) {
            g2Var = bVar.f92940f;
        }
        if ((i11 & 64) != 0) {
            g2Var2 = bVar.f92941g;
        }
        if ((i11 & 128) != 0) {
            zVar = bVar.f92942h;
        }
        if ((i11 & 256) != 0) {
            g2Var3 = bVar.f92943i;
        }
        if ((i11 & 512) != 0) {
            eVar = bVar.f92944j;
        }
        if ((i11 & 1024) != 0) {
            j11 = bVar.f92945k;
        }
        long j12 = j11;
        g2 g2Var4 = g2Var3;
        u8.e eVar2 = eVar;
        g2 g2Var5 = g2Var2;
        z zVar2 = zVar;
        o0 o0Var2 = o0Var;
        g2 g2Var6 = g2Var;
        return bVar.l(j0Var, w0Var, sVar, a1Var, o0Var2, g2Var6, g2Var5, zVar2, g2Var4, eVar2, j12);
    }

    @m80.k
    public final j0 a() {
        return this.f92935a;
    }

    @m80.l
    public final u8.e b() {
        return this.f92944j;
    }

    public final long c() {
        return this.f92945k;
    }

    @m80.k
    public final w0 d() {
        return this.f92936b;
    }

    @m80.k
    public final s e() {
        return this.f92937c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f92935a, bVar.f92935a) && g0.g(this.f92936b, bVar.f92936b) && g0.g(this.f92937c, bVar.f92937c) && g0.g(this.f92938d, bVar.f92938d) && g0.g(this.f92939e, bVar.f92939e) && g0.g(this.f92940f, bVar.f92940f) && g0.g(this.f92941g, bVar.f92941g) && g0.g(this.f92942h, bVar.f92942h) && g0.g(this.f92943i, bVar.f92943i) && g0.g(this.f92944j, bVar.f92944j) && this.f92945k == bVar.f92945k;
    }

    @m80.k
    public final a1 f() {
        return this.f92938d;
    }

    @m80.k
    public final o0 g() {
        return this.f92939e;
    }

    @m80.k
    public final g2 h() {
        return this.f92940f;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f92935a.hashCode() * 31) + this.f92936b.hashCode()) * 31) + this.f92937c.hashCode()) * 31) + this.f92938d.hashCode()) * 31) + this.f92939e.hashCode()) * 31) + this.f92940f.hashCode()) * 31) + this.f92941g.hashCode()) * 31) + this.f92942h.hashCode()) * 31) + this.f92943i.hashCode()) * 31;
        u8.e eVar = this.f92944j;
        return ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + Long.hashCode(this.f92945k);
    }

    @m80.k
    public final g2 i() {
        return this.f92941g;
    }

    @m80.k
    public final z j() {
        return this.f92942h;
    }

    @m80.k
    public final g2 k() {
        return this.f92943i;
    }

    @m80.k
    public final b l(@m80.k j0 sentenceLearningJourney, @m80.k w0 userGameInfoSnapshot, @m80.k s ipAvatarJourney, @m80.k a1 winnerTask, @m80.k o0 studyScoreRank, @m80.k g2 clickRank, @m80.k g2 clickTask, @m80.k z notificationModel, @m80.k g2 onAvatarClick, @m80.l u8.e eVar, long j11) {
        g0.p(sentenceLearningJourney, "sentenceLearningJourney");
        g0.p(userGameInfoSnapshot, "userGameInfoSnapshot");
        g0.p(ipAvatarJourney, "ipAvatarJourney");
        g0.p(winnerTask, "winnerTask");
        g0.p(studyScoreRank, "studyScoreRank");
        g0.p(clickRank, "clickRank");
        g0.p(clickTask, "clickTask");
        g0.p(notificationModel, "notificationModel");
        g0.p(onAvatarClick, "onAvatarClick");
        return new b(sentenceLearningJourney, userGameInfoSnapshot, ipAvatarJourney, winnerTask, studyScoreRank, clickRank, clickTask, notificationModel, onAvatarClick, eVar, j11);
    }

    @m80.k
    public final g2 n() {
        return this.f92940f;
    }

    @m80.k
    public final g2 o() {
        return this.f92941g;
    }

    @m80.k
    public final s p() {
        return this.f92937c;
    }

    @m80.k
    public final z q() {
        return this.f92942h;
    }

    public final long r() {
        return this.f92945k;
    }

    @m80.k
    public final g2 s() {
        return this.f92943i;
    }

    @m80.l
    public final u8.e t() {
        return this.f92944j;
    }

    @m80.k
    public String toString() {
        return "SentenceHomeInitialData(sentenceLearningJourney=" + this.f92935a + ", userGameInfoSnapshot=" + this.f92936b + ", ipAvatarJourney=" + this.f92937c + ", winnerTask=" + this.f92938d + ", studyScoreRank=" + this.f92939e + ", clickRank=" + this.f92940f + ", clickTask=" + this.f92941g + ", notificationModel=" + this.f92942h + ", onAvatarClick=" + this.f92943i + ", popupSaleInfo=" + this.f92944j + ", now=" + this.f92945k + ')';
    }

    @m80.k
    public final j0 u() {
        return this.f92935a;
    }

    @m80.k
    public final o0 v() {
        return this.f92939e;
    }

    @m80.k
    public final w0 w() {
        return this.f92936b;
    }

    @m80.k
    public final a1 x() {
        return this.f92938d;
    }
}
