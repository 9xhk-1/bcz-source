package y4;

import h5.a1;
import h5.o0;
import h5.p0;
import h5.s;
import h5.w0;
import h5.z;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import l3.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s f99250a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p0 f99251b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final w0 f99252c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final h5.j f99253d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Pair<Integer, Integer> f99254e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final a1 f99255f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o0 f99256g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final g2 f99257h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final g2 f99258i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final z f99259j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final g2 f99260k;

    /* renamed from: l, reason: collision with root package name */
    public final long f99261l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public final u8.e f99262m;

    public b(@m80.k s ipAvatarJourney, @m80.k p0 studySummary, @m80.k w0 userGameInfoSnapshot, @m80.k h5.j gameBook, @m80.k Pair<Integer, Integer> progress, @m80.k a1 winnerTask, @m80.k o0 studyScoreRank, @m80.k g2 clickRank, @m80.k g2 clickTask, @m80.k z notificationModel, @m80.k g2 onAvatarClick, long j11, @m80.l u8.e eVar) {
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
        this.f99250a = ipAvatarJourney;
        this.f99251b = studySummary;
        this.f99252c = userGameInfoSnapshot;
        this.f99253d = gameBook;
        this.f99254e = progress;
        this.f99255f = winnerTask;
        this.f99256g = studyScoreRank;
        this.f99257h = clickRank;
        this.f99258i = clickTask;
        this.f99259j = notificationModel;
        this.f99260k = onAvatarClick;
        this.f99261l = j11;
        this.f99262m = eVar;
    }

    @m80.k
    public final w0 A() {
        return this.f99252c;
    }

    @m80.k
    public final a1 B() {
        return this.f99255f;
    }

    @m80.k
    public final s a() {
        return this.f99250a;
    }

    @m80.k
    public final z b() {
        return this.f99259j;
    }

    @m80.k
    public final g2 c() {
        return this.f99260k;
    }

    public final long d() {
        return this.f99261l;
    }

    @m80.l
    public final u8.e e() {
        return this.f99262m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f99250a, bVar.f99250a) && g0.g(this.f99251b, bVar.f99251b) && g0.g(this.f99252c, bVar.f99252c) && g0.g(this.f99253d, bVar.f99253d) && g0.g(this.f99254e, bVar.f99254e) && g0.g(this.f99255f, bVar.f99255f) && g0.g(this.f99256g, bVar.f99256g) && g0.g(this.f99257h, bVar.f99257h) && g0.g(this.f99258i, bVar.f99258i) && g0.g(this.f99259j, bVar.f99259j) && g0.g(this.f99260k, bVar.f99260k) && this.f99261l == bVar.f99261l && g0.g(this.f99262m, bVar.f99262m);
    }

    @m80.k
    public final p0 f() {
        return this.f99251b;
    }

    @m80.k
    public final w0 g() {
        return this.f99252c;
    }

    @m80.k
    public final h5.j h() {
        return this.f99253d;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.f99250a.hashCode() * 31) + this.f99251b.hashCode()) * 31) + this.f99252c.hashCode()) * 31) + this.f99253d.hashCode()) * 31) + this.f99254e.hashCode()) * 31) + this.f99255f.hashCode()) * 31) + this.f99256g.hashCode()) * 31) + this.f99257h.hashCode()) * 31) + this.f99258i.hashCode()) * 31) + this.f99259j.hashCode()) * 31) + this.f99260k.hashCode()) * 31) + Long.hashCode(this.f99261l)) * 31;
        u8.e eVar = this.f99262m;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    @m80.k
    public final Pair<Integer, Integer> i() {
        return this.f99254e;
    }

    @m80.k
    public final a1 j() {
        return this.f99255f;
    }

    @m80.k
    public final o0 k() {
        return this.f99256g;
    }

    @m80.k
    public final g2 l() {
        return this.f99257h;
    }

    @m80.k
    public final g2 m() {
        return this.f99258i;
    }

    @m80.k
    public final b n(@m80.k s ipAvatarJourney, @m80.k p0 studySummary, @m80.k w0 userGameInfoSnapshot, @m80.k h5.j gameBook, @m80.k Pair<Integer, Integer> progress, @m80.k a1 winnerTask, @m80.k o0 studyScoreRank, @m80.k g2 clickRank, @m80.k g2 clickTask, @m80.k z notificationModel, @m80.k g2 onAvatarClick, long j11, @m80.l u8.e eVar) {
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
        return new b(ipAvatarJourney, studySummary, userGameInfoSnapshot, gameBook, progress, winnerTask, studyScoreRank, clickRank, clickTask, notificationModel, onAvatarClick, j11, eVar);
    }

    @m80.k
    public final g2 p() {
        return this.f99257h;
    }

    @m80.k
    public final g2 q() {
        return this.f99258i;
    }

    @m80.k
    public final h5.j r() {
        return this.f99253d;
    }

    @m80.k
    public final s s() {
        return this.f99250a;
    }

    @m80.l
    public final u8.e t() {
        return this.f99262m;
    }

    @m80.k
    public String toString() {
        return "WordsHomeInitialData(ipAvatarJourney=" + this.f99250a + ", studySummary=" + this.f99251b + ", userGameInfoSnapshot=" + this.f99252c + ", gameBook=" + this.f99253d + ", progress=" + this.f99254e + ", winnerTask=" + this.f99255f + ", studyScoreRank=" + this.f99256g + ", clickRank=" + this.f99257h + ", clickTask=" + this.f99258i + ", notificationModel=" + this.f99259j + ", onAvatarClick=" + this.f99260k + ", now=" + this.f99261l + ", memberPopupSaleInfo=" + this.f99262m + ')';
    }

    @m80.k
    public final z u() {
        return this.f99259j;
    }

    public final long v() {
        return this.f99261l;
    }

    @m80.k
    public final g2 w() {
        return this.f99260k;
    }

    @m80.k
    public final Pair<Integer, Integer> x() {
        return this.f99254e;
    }

    @m80.k
    public final o0 y() {
        return this.f99256g;
    }

    @m80.k
    public final p0 z() {
        return this.f99251b;
    }
}
