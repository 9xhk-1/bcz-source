package y4;

import g8.q;
import h5.a1;
import h5.h0;
import h5.o0;
import h5.p0;
import h5.s;
import h5.w;
import h5.w0;
import h5.z;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l3.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y4.a$a, reason: collision with other inner class name */
    public static final class C1343a extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Throwable f99231a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f99232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1343a(@m80.k Throwable error, @m80.k g2 retry) {
            super(null);
            g0.p(error, "error");
            g0.p(retry, "retry");
            this.f99231a = error;
            this.f99232b = retry;
        }

        public static /* synthetic */ C1343a d(C1343a c1343a, Throwable th2, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = c1343a.f99231a;
            }
            if ((i11 & 2) != 0) {
                g2Var = c1343a.f99232b;
            }
            return c1343a.c(th2, g2Var);
        }

        @m80.k
        public final Throwable a() {
            return this.f99231a;
        }

        @m80.k
        public final g2 b() {
            return this.f99232b;
        }

        @m80.k
        public final C1343a c(@m80.k Throwable error, @m80.k g2 retry) {
            g0.p(error, "error");
            g0.p(retry, "retry");
            return new C1343a(error, retry);
        }

        @m80.k
        public final Throwable e() {
            return this.f99231a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1343a)) {
                return false;
            }
            C1343a c1343a = (C1343a) obj;
            return g0.g(this.f99231a, c1343a.f99231a) && g0.g(this.f99232b, c1343a.f99232b);
        }

        @m80.k
        public final g2 f() {
            return this.f99232b;
        }

        public int hashCode() {
            return (this.f99231a.hashCode() * 31) + this.f99232b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(error=" + this.f99231a + ", retry=" + this.f99232b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final y4.b f99233a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k y4.b homeData) {
            super(null);
            g0.p(homeData, "homeData");
            this.f99233a = homeData;
        }

        public static /* synthetic */ b c(b bVar, y4.b bVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar2 = bVar.f99233a;
            }
            return bVar.b(bVar2);
        }

        @m80.k
        public final y4.b a() {
            return this.f99233a;
        }

        @m80.k
        public final b b(@m80.k y4.b homeData) {
            g0.p(homeData, "homeData");
            return new b(homeData);
        }

        @m80.k
        public final y4.b d() {
            return this.f99233a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f99233a, ((b) obj).f99233a);
        }

        public int hashCode() {
            return this.f99233a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Initialize(homeData=" + this.f99233a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f99234a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 509321464;
        }

        @m80.k
        public String toString() {
            return "Reset";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final s f99235a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k s ipAvatarJourney) {
            super(null);
            g0.p(ipAvatarJourney, "ipAvatarJourney");
            this.f99235a = ipAvatarJourney;
        }

        public static /* synthetic */ d c(d dVar, s sVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sVar = dVar.f99235a;
            }
            return dVar.b(sVar);
        }

        @m80.k
        public final s a() {
            return this.f99235a;
        }

        @m80.k
        public final d b(@m80.k s ipAvatarJourney) {
            g0.p(ipAvatarJourney, "ipAvatarJourney");
            return new d(ipAvatarJourney);
        }

        @m80.k
        public final s d() {
            return this.f99235a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && g0.g(this.f99235a, ((d) obj).f99235a);
        }

        public int hashCode() {
            return this.f99235a.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateIpAvatarState(ipAvatarJourney=" + this.f99235a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final w f99236a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f99237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k w lavaQuestModel, @m80.k g2 enter) {
            super(null);
            g0.p(lavaQuestModel, "lavaQuestModel");
            g0.p(enter, "enter");
            this.f99236a = lavaQuestModel;
            this.f99237b = enter;
        }

        public static /* synthetic */ e d(e eVar, w wVar, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                wVar = eVar.f99236a;
            }
            if ((i11 & 2) != 0) {
                g2Var = eVar.f99237b;
            }
            return eVar.c(wVar, g2Var);
        }

        @m80.k
        public final w a() {
            return this.f99236a;
        }

        @m80.k
        public final g2 b() {
            return this.f99237b;
        }

        @m80.k
        public final e c(@m80.k w lavaQuestModel, @m80.k g2 enter) {
            g0.p(lavaQuestModel, "lavaQuestModel");
            g0.p(enter, "enter");
            return new e(lavaQuestModel, enter);
        }

        @m80.k
        public final g2 e() {
            return this.f99237b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return g0.g(this.f99236a, eVar.f99236a) && g0.g(this.f99237b, eVar.f99237b);
        }

        @m80.k
        public final w f() {
            return this.f99236a;
        }

        public int hashCode() {
            return (this.f99236a.hashCode() * 31) + this.f99237b.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateLavaQuest(lavaQuestModel=" + this.f99236a + ", enter=" + this.f99237b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final u8.e f99238a;

        public f(@m80.l u8.e eVar) {
            super(null);
            this.f99238a = eVar;
        }

        public static /* synthetic */ f c(f fVar, u8.e eVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = fVar.f99238a;
            }
            return fVar.b(eVar);
        }

        @m80.l
        public final u8.e a() {
            return this.f99238a;
        }

        @m80.k
        public final f b(@m80.l u8.e eVar) {
            return new f(eVar);
        }

        @m80.l
        public final u8.e d() {
            return this.f99238a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && g0.g(this.f99238a, ((f) obj).f99238a);
        }

        public int hashCode() {
            u8.e eVar = this.f99238a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateMemberShipSale(popupSaleInfo=" + this.f99238a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z f99239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k z notificationModel) {
            super(null);
            g0.p(notificationModel, "notificationModel");
            this.f99239a = notificationModel;
        }

        public static /* synthetic */ g c(g gVar, z zVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                zVar = gVar.f99239a;
            }
            return gVar.b(zVar);
        }

        @m80.k
        public final z a() {
            return this.f99239a;
        }

        @m80.k
        public final g b(@m80.k z notificationModel) {
            g0.p(notificationModel, "notificationModel");
            return new g(notificationModel);
        }

        @m80.k
        public final z d() {
            return this.f99239a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && g0.g(this.f99239a, ((g) obj).f99239a);
        }

        public int hashCode() {
            return this.f99239a.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateNotification(notificationModel=" + this.f99239a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final o0 f99240a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f99241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k o0 studyScoreRank, @m80.k g2 click) {
            super(null);
            g0.p(studyScoreRank, "studyScoreRank");
            g0.p(click, "click");
            this.f99240a = studyScoreRank;
            this.f99241b = click;
        }

        public static /* synthetic */ h d(h hVar, o0 o0Var, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                o0Var = hVar.f99240a;
            }
            if ((i11 & 2) != 0) {
                g2Var = hVar.f99241b;
            }
            return hVar.c(o0Var, g2Var);
        }

        @m80.k
        public final o0 a() {
            return this.f99240a;
        }

        @m80.k
        public final g2 b() {
            return this.f99241b;
        }

        @m80.k
        public final h c(@m80.k o0 studyScoreRank, @m80.k g2 click) {
            g0.p(studyScoreRank, "studyScoreRank");
            g0.p(click, "click");
            return new h(studyScoreRank, click);
        }

        @m80.k
        public final g2 e() {
            return this.f99241b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return g0.g(this.f99240a, hVar.f99240a) && g0.g(this.f99241b, hVar.f99241b);
        }

        @m80.k
        public final o0 f() {
            return this.f99240a;
        }

        public int hashCode() {
            return (this.f99240a.hashCode() * 31) + this.f99241b.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateRank(studyScoreRank=" + this.f99240a + ", click=" + this.f99241b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final h0 f99242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k h0 sentenceEntranceModel) {
            super(null);
            g0.p(sentenceEntranceModel, "sentenceEntranceModel");
            this.f99242a = sentenceEntranceModel;
        }

        public static /* synthetic */ i c(i iVar, h0 h0Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                h0Var = iVar.f99242a;
            }
            return iVar.b(h0Var);
        }

        @m80.k
        public final h0 a() {
            return this.f99242a;
        }

        @m80.k
        public final i b(@m80.k h0 sentenceEntranceModel) {
            g0.p(sentenceEntranceModel, "sentenceEntranceModel");
            return new i(sentenceEntranceModel);
        }

        @m80.k
        public final h0 d() {
            return this.f99242a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && g0.g(this.f99242a, ((i) obj).f99242a);
        }

        public int hashCode() {
            return this.f99242a.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateSentenceEntrance(sentenceEntranceModel=" + this.f99242a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final p0 f99243a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k p0 studySummary) {
            super(null);
            g0.p(studySummary, "studySummary");
            this.f99243a = studySummary;
        }

        public static /* synthetic */ j c(j jVar, p0 p0Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                p0Var = jVar.f99243a;
            }
            return jVar.b(p0Var);
        }

        @m80.k
        public final p0 a() {
            return this.f99243a;
        }

        @m80.k
        public final j b(@m80.k p0 studySummary) {
            g0.p(studySummary, "studySummary");
            return new j(studySummary);
        }

        @m80.k
        public final p0 d() {
            return this.f99243a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && g0.g(this.f99243a, ((j) obj).f99243a);
        }

        public int hashCode() {
            return this.f99243a.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateStudySummary(studySummary=" + this.f99243a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final q f99244a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f99245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@m80.l q qVar, @m80.k g2 close) {
            super(null);
            g0.p(close, "close");
            this.f99244a = qVar;
            this.f99245b = close;
        }

        public static /* synthetic */ k d(k kVar, q qVar, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                qVar = kVar.f99244a;
            }
            if ((i11 & 2) != 0) {
                g2Var = kVar.f99245b;
            }
            return kVar.c(qVar, g2Var);
        }

        @m80.l
        public final q a() {
            return this.f99244a;
        }

        @m80.k
        public final g2 b() {
            return this.f99245b;
        }

        @m80.k
        public final k c(@m80.l q qVar, @m80.k g2 close) {
            g0.p(close, "close");
            return new k(qVar, close);
        }

        @m80.k
        public final g2 e() {
            return this.f99245b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return g0.g(this.f99244a, kVar.f99244a) && g0.g(this.f99245b, kVar.f99245b);
        }

        @m80.l
        public final q f() {
            return this.f99244a;
        }

        public int hashCode() {
            q qVar = this.f99244a;
            return ((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f99245b.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateTopAd(topAd=" + this.f99244a + ", close=" + this.f99245b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final w0 f99246a;

        /* renamed from: b, reason: collision with root package name */
        public final long f99247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@m80.k w0 userGameInfoSnapshot, long j11) {
            super(null);
            g0.p(userGameInfoSnapshot, "userGameInfoSnapshot");
            this.f99246a = userGameInfoSnapshot;
            this.f99247b = j11;
        }

        public static /* synthetic */ l d(l lVar, w0 w0Var, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                w0Var = lVar.f99246a;
            }
            if ((i11 & 2) != 0) {
                j11 = lVar.f99247b;
            }
            return lVar.c(w0Var, j11);
        }

        @m80.k
        public final w0 a() {
            return this.f99246a;
        }

        public final long b() {
            return this.f99247b;
        }

        @m80.k
        public final l c(@m80.k w0 userGameInfoSnapshot, long j11) {
            g0.p(userGameInfoSnapshot, "userGameInfoSnapshot");
            return new l(userGameInfoSnapshot, j11);
        }

        public final long e() {
            return this.f99247b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return g0.g(this.f99246a, lVar.f99246a) && this.f99247b == lVar.f99247b;
        }

        @m80.k
        public final w0 f() {
            return this.f99246a;
        }

        public int hashCode() {
            return (this.f99246a.hashCode() * 31) + Long.hashCode(this.f99247b);
        }

        @m80.k
        public String toString() {
            return "UpdateUserData(userGameInfoSnapshot=" + this.f99246a + ", now=" + this.f99247b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final a1 f99248a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f99249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k a1 winnerTask, @m80.k g2 taskClick) {
            super(null);
            g0.p(winnerTask, "winnerTask");
            g0.p(taskClick, "taskClick");
            this.f99248a = winnerTask;
            this.f99249b = taskClick;
        }

        public static /* synthetic */ m d(m mVar, a1 a1Var, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                a1Var = mVar.f99248a;
            }
            if ((i11 & 2) != 0) {
                g2Var = mVar.f99249b;
            }
            return mVar.c(a1Var, g2Var);
        }

        @m80.k
        public final a1 a() {
            return this.f99248a;
        }

        @m80.k
        public final g2 b() {
            return this.f99249b;
        }

        @m80.k
        public final m c(@m80.k a1 winnerTask, @m80.k g2 taskClick) {
            g0.p(winnerTask, "winnerTask");
            g0.p(taskClick, "taskClick");
            return new m(winnerTask, taskClick);
        }

        @m80.k
        public final g2 e() {
            return this.f99249b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return g0.g(this.f99248a, mVar.f99248a) && g0.g(this.f99249b, mVar.f99249b);
        }

        @m80.k
        public final a1 f() {
            return this.f99248a;
        }

        public int hashCode() {
            return (this.f99248a.hashCode() * 31) + this.f99249b.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateWinnerTask(winnerTask=" + this.f99248a + ", taskClick=" + this.f99249b + ')';
        }
    }

    public /* synthetic */ a(v vVar) {
        this();
    }

    public a() {
    }
}
