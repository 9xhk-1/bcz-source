package v4;

import h5.a1;
import h5.j0;
import h5.o0;
import h5.s;
import h5.w0;
import h5.z;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l3.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v4.a$a, reason: collision with other inner class name */
    public static final class C1250a extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Throwable f92921a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f92922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1250a(@m80.k Throwable error, @m80.k g2 retry) {
            super(null);
            g0.p(error, "error");
            g0.p(retry, "retry");
            this.f92921a = error;
            this.f92922b = retry;
        }

        public static /* synthetic */ C1250a d(C1250a c1250a, Throwable th2, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = c1250a.f92921a;
            }
            if ((i11 & 2) != 0) {
                g2Var = c1250a.f92922b;
            }
            return c1250a.c(th2, g2Var);
        }

        @m80.k
        public final Throwable a() {
            return this.f92921a;
        }

        @m80.k
        public final g2 b() {
            return this.f92922b;
        }

        @m80.k
        public final C1250a c(@m80.k Throwable error, @m80.k g2 retry) {
            g0.p(error, "error");
            g0.p(retry, "retry");
            return new C1250a(error, retry);
        }

        @m80.k
        public final Throwable e() {
            return this.f92921a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1250a)) {
                return false;
            }
            C1250a c1250a = (C1250a) obj;
            return g0.g(this.f92921a, c1250a.f92921a) && g0.g(this.f92922b, c1250a.f92922b);
        }

        @m80.k
        public final g2 f() {
            return this.f92922b;
        }

        public int hashCode() {
            return (this.f92921a.hashCode() * 31) + this.f92922b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(error=" + this.f92921a + ", retry=" + this.f92922b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final v4.b f92923a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k v4.b homeData) {
            super(null);
            g0.p(homeData, "homeData");
            this.f92923a = homeData;
        }

        public static /* synthetic */ b c(b bVar, v4.b bVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar2 = bVar.f92923a;
            }
            return bVar.b(bVar2);
        }

        @m80.k
        public final v4.b a() {
            return this.f92923a;
        }

        @m80.k
        public final b b(@m80.k v4.b homeData) {
            g0.p(homeData, "homeData");
            return new b(homeData);
        }

        @m80.k
        public final v4.b d() {
            return this.f92923a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f92923a, ((b) obj).f92923a);
        }

        public int hashCode() {
            return this.f92923a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Initialize(homeData=" + this.f92923a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f92924a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1523948612;
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
        public final s f92925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k s ipAvatarJourney) {
            super(null);
            g0.p(ipAvatarJourney, "ipAvatarJourney");
            this.f92925a = ipAvatarJourney;
        }

        public static /* synthetic */ d c(d dVar, s sVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sVar = dVar.f92925a;
            }
            return dVar.b(sVar);
        }

        @m80.k
        public final s a() {
            return this.f92925a;
        }

        @m80.k
        public final d b(@m80.k s ipAvatarJourney) {
            g0.p(ipAvatarJourney, "ipAvatarJourney");
            return new d(ipAvatarJourney);
        }

        @m80.k
        public final s d() {
            return this.f92925a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && g0.g(this.f92925a, ((d) obj).f92925a);
        }

        public int hashCode() {
            return this.f92925a.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateIpAvatarState(ipAvatarJourney=" + this.f92925a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final u8.e f92926a;

        public e(@m80.l u8.e eVar) {
            super(null);
            this.f92926a = eVar;
        }

        public static /* synthetic */ e c(e eVar, u8.e eVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar2 = eVar.f92926a;
            }
            return eVar.b(eVar2);
        }

        @m80.l
        public final u8.e a() {
            return this.f92926a;
        }

        @m80.k
        public final e b(@m80.l u8.e eVar) {
            return new e(eVar);
        }

        @m80.l
        public final u8.e d() {
            return this.f92926a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && g0.g(this.f92926a, ((e) obj).f92926a);
        }

        public int hashCode() {
            u8.e eVar = this.f92926a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateMemberShipSale(popupSaleInfo=" + this.f92926a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final z f92927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k z notificationModel) {
            super(null);
            g0.p(notificationModel, "notificationModel");
            this.f92927a = notificationModel;
        }

        public static /* synthetic */ f c(f fVar, z zVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                zVar = fVar.f92927a;
            }
            return fVar.b(zVar);
        }

        @m80.k
        public final z a() {
            return this.f92927a;
        }

        @m80.k
        public final f b(@m80.k z notificationModel) {
            g0.p(notificationModel, "notificationModel");
            return new f(notificationModel);
        }

        @m80.k
        public final z d() {
            return this.f92927a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && g0.g(this.f92927a, ((f) obj).f92927a);
        }

        public int hashCode() {
            return this.f92927a.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateNotification(notificationModel=" + this.f92927a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final o0 f92928a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f92929b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k o0 studyScoreRank, @m80.k g2 click) {
            super(null);
            g0.p(studyScoreRank, "studyScoreRank");
            g0.p(click, "click");
            this.f92928a = studyScoreRank;
            this.f92929b = click;
        }

        public static /* synthetic */ g d(g gVar, o0 o0Var, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                o0Var = gVar.f92928a;
            }
            if ((i11 & 2) != 0) {
                g2Var = gVar.f92929b;
            }
            return gVar.c(o0Var, g2Var);
        }

        @m80.k
        public final o0 a() {
            return this.f92928a;
        }

        @m80.k
        public final g2 b() {
            return this.f92929b;
        }

        @m80.k
        public final g c(@m80.k o0 studyScoreRank, @m80.k g2 click) {
            g0.p(studyScoreRank, "studyScoreRank");
            g0.p(click, "click");
            return new g(studyScoreRank, click);
        }

        @m80.k
        public final g2 e() {
            return this.f92929b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return g0.g(this.f92928a, gVar.f92928a) && g0.g(this.f92929b, gVar.f92929b);
        }

        @m80.k
        public final o0 f() {
            return this.f92928a;
        }

        public int hashCode() {
            return (this.f92928a.hashCode() * 31) + this.f92929b.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateRank(studyScoreRank=" + this.f92928a + ", click=" + this.f92929b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j0 f92930a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k j0 sentenceLearningJourney) {
            super(null);
            g0.p(sentenceLearningJourney, "sentenceLearningJourney");
            this.f92930a = sentenceLearningJourney;
        }

        public static /* synthetic */ h c(h hVar, j0 j0Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j0Var = hVar.f92930a;
            }
            return hVar.b(j0Var);
        }

        @m80.k
        public final j0 a() {
            return this.f92930a;
        }

        @m80.k
        public final h b(@m80.k j0 sentenceLearningJourney) {
            g0.p(sentenceLearningJourney, "sentenceLearningJourney");
            return new h(sentenceLearningJourney);
        }

        @m80.k
        public final j0 d() {
            return this.f92930a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && g0.g(this.f92930a, ((h) obj).f92930a);
        }

        public int hashCode() {
            return this.f92930a.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateSentenceJournal(sentenceLearningJourney=" + this.f92930a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final w0 f92931a;

        /* renamed from: b, reason: collision with root package name */
        public final long f92932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k w0 userGameInfoSnapshot, long j11) {
            super(null);
            g0.p(userGameInfoSnapshot, "userGameInfoSnapshot");
            this.f92931a = userGameInfoSnapshot;
            this.f92932b = j11;
        }

        public static /* synthetic */ i d(i iVar, w0 w0Var, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                w0Var = iVar.f92931a;
            }
            if ((i11 & 2) != 0) {
                j11 = iVar.f92932b;
            }
            return iVar.c(w0Var, j11);
        }

        @m80.k
        public final w0 a() {
            return this.f92931a;
        }

        public final long b() {
            return this.f92932b;
        }

        @m80.k
        public final i c(@m80.k w0 userGameInfoSnapshot, long j11) {
            g0.p(userGameInfoSnapshot, "userGameInfoSnapshot");
            return new i(userGameInfoSnapshot, j11);
        }

        public final long e() {
            return this.f92932b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return g0.g(this.f92931a, iVar.f92931a) && this.f92932b == iVar.f92932b;
        }

        @m80.k
        public final w0 f() {
            return this.f92931a;
        }

        public int hashCode() {
            return (this.f92931a.hashCode() * 31) + Long.hashCode(this.f92932b);
        }

        @m80.k
        public String toString() {
            return "UpdateUserData(userGameInfoSnapshot=" + this.f92931a + ", now=" + this.f92932b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final a1 f92933a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f92934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k a1 winnerTask, @m80.k g2 taskClick) {
            super(null);
            g0.p(winnerTask, "winnerTask");
            g0.p(taskClick, "taskClick");
            this.f92933a = winnerTask;
            this.f92934b = taskClick;
        }

        public static /* synthetic */ j d(j jVar, a1 a1Var, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                a1Var = jVar.f92933a;
            }
            if ((i11 & 2) != 0) {
                g2Var = jVar.f92934b;
            }
            return jVar.c(a1Var, g2Var);
        }

        @m80.k
        public final a1 a() {
            return this.f92933a;
        }

        @m80.k
        public final g2 b() {
            return this.f92934b;
        }

        @m80.k
        public final j c(@m80.k a1 winnerTask, @m80.k g2 taskClick) {
            g0.p(winnerTask, "winnerTask");
            g0.p(taskClick, "taskClick");
            return new j(winnerTask, taskClick);
        }

        @m80.k
        public final g2 e() {
            return this.f92934b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return g0.g(this.f92933a, jVar.f92933a) && g0.g(this.f92934b, jVar.f92934b);
        }

        @m80.k
        public final a1 f() {
            return this.f92933a;
        }

        public int hashCode() {
            return (this.f92933a.hashCode() * 31) + this.f92934b.hashCode();
        }

        @m80.k
        public String toString() {
            return "UpdateWinnerTask(winnerTask=" + this.f92933a + ", taskClick=" + this.f92934b + ')';
        }
    }

    public /* synthetic */ a(v vVar) {
        this();
    }

    public a() {
    }
}
