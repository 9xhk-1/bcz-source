package l3;

import com.baicizhan.app.api.service.model.RankListType;
import com.baicizhan.app.api.service.model.StreakAwardType;
import com.baicizhan.app.api.service.model.SwitchType;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69589a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69589a = consume;
            this.f69590b = doContinue;
        }

        public static /* synthetic */ a f(a aVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = aVar.f69589a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = aVar.f69590b;
            }
            return aVar.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69589a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69590b;
        }

        @m80.k
        public final g2 c() {
            return this.f69589a;
        }

        @m80.k
        public final g2 d() {
            return this.f69590b;
        }

        @m80.k
        public final a e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new a(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f69589a, aVar.f69589a) && kotlin.jvm.internal.g0.g(this.f69590b, aVar.f69590b);
        }

        public int hashCode() {
            return (this.f69589a.hashCode() * 31) + this.f69590b.hashCode();
        }

        @m80.k
        public String toString() {
            return "ForgettingCurveGuide(consume=" + this.f69589a + ", doContinue=" + this.f69590b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0 extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69591a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69591a = consume;
            this.f69592b = doContinue;
        }

        public static /* synthetic */ a0 f(a0 a0Var, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = a0Var.f69591a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = a0Var.f69592b;
            }
            return a0Var.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69591a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69592b;
        }

        @m80.k
        public final g2 c() {
            return this.f69591a;
        }

        @m80.k
        public final g2 d() {
            return this.f69592b;
        }

        @m80.k
        public final a0 e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new a0(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return kotlin.jvm.internal.g0.g(this.f69591a, a0Var.f69591a) && kotlin.jvm.internal.g0.g(this.f69592b, a0Var.f69592b);
        }

        public int hashCode() {
            return (this.f69591a.hashCode() * 31) + this.f69592b.hashCode();
        }

        @m80.k
        public String toString() {
            return "WordsSwitchToSentence(consume=" + this.f69591a + ", doContinue=" + this.f69592b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69593a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69594b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69595c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String url, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(url, "url");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69593a = url;
            this.f69594b = consume;
            this.f69595c = doContinue;
        }

        public static /* synthetic */ b g(b bVar, String str, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f69593a;
            }
            if ((i11 & 2) != 0) {
                g2Var = bVar.f69594b;
            }
            if ((i11 & 4) != 0) {
                g2Var2 = bVar.f69595c;
            }
            return bVar.f(str, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69594b;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69595c;
        }

        @m80.k
        public final String c() {
            return this.f69593a;
        }

        @m80.k
        public final g2 d() {
            return this.f69594b;
        }

        @m80.k
        public final g2 e() {
            return this.f69595c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f69593a, bVar.f69593a) && kotlin.jvm.internal.g0.g(this.f69594b, bVar.f69594b) && kotlin.jvm.internal.g0.g(this.f69595c, bVar.f69595c);
        }

        @m80.k
        public final b f(@m80.k String url, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(url, "url");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new b(url, consume, doContinue);
        }

        @m80.k
        public final String h() {
            return this.f69593a;
        }

        public int hashCode() {
            return (((this.f69593a.hashCode() * 31) + this.f69594b.hashCode()) * 31) + this.f69595c.hashCode();
        }

        @m80.k
        public String toString() {
            return "FreeAdEffect(url=" + this.f69593a + ", consume=" + this.f69594b + ", doContinue=" + this.f69595c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends o {

        /* renamed from: a, reason: collision with root package name */
        public final int f69596a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69597b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69598c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69596a = i11;
            this.f69597b = consume;
            this.f69598c = doContinue;
        }

        public static /* synthetic */ c g(c cVar, int i11, g2 g2Var, g2 g2Var2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cVar.f69596a;
            }
            if ((i12 & 2) != 0) {
                g2Var = cVar.f69597b;
            }
            if ((i12 & 4) != 0) {
                g2Var2 = cVar.f69598c;
            }
            return cVar.f(i11, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69597b;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69598c;
        }

        public final int c() {
            return this.f69596a;
        }

        @m80.k
        public final g2 d() {
            return this.f69597b;
        }

        @m80.k
        public final g2 e() {
            return this.f69598c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f69596a == cVar.f69596a && kotlin.jvm.internal.g0.g(this.f69597b, cVar.f69597b) && kotlin.jvm.internal.g0.g(this.f69598c, cVar.f69598c);
        }

        @m80.k
        public final c f(int i11, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new c(i11, consume, doContinue);
        }

        public final int h() {
            return this.f69596a;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f69596a) * 31) + this.f69597b.hashCode()) * 31) + this.f69598c.hashCode();
        }

        @m80.k
        public String toString() {
            return "FreeMembershipClaim(saleType=" + this.f69596a + ", consume=" + this.f69597b + ", doContinue=" + this.f69598c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69599a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69599a = consume;
            this.f69600b = doContinue;
        }

        public static /* synthetic */ d f(d dVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = dVar.f69599a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = dVar.f69600b;
            }
            return dVar.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69599a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69600b;
        }

        @m80.k
        public final g2 c() {
            return this.f69599a;
        }

        @m80.k
        public final g2 d() {
            return this.f69600b;
        }

        @m80.k
        public final d e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new d(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.g0.g(this.f69599a, dVar.f69599a) && kotlin.jvm.internal.g0.g(this.f69600b, dVar.f69600b);
        }

        public int hashCode() {
            return (this.f69599a.hashCode() * 31) + this.f69600b.hashCode();
        }

        @m80.k
        public String toString() {
            return "GetStudyBuddyGuide(consume=" + this.f69599a + ", doContinue=" + this.f69600b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69601a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69602b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k g2 consume, @m80.k g2 doContinue, @m80.k String dialogImg) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            kotlin.jvm.internal.g0.p(dialogImg, "dialogImg");
            this.f69601a = consume;
            this.f69602b = doContinue;
            this.f69603c = dialogImg;
        }

        public static /* synthetic */ e g(e eVar, g2 g2Var, g2 g2Var2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = eVar.f69601a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = eVar.f69602b;
            }
            if ((i11 & 4) != 0) {
                str = eVar.f69603c;
            }
            return eVar.f(g2Var, g2Var2, str);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69601a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69602b;
        }

        @m80.k
        public final g2 c() {
            return this.f69601a;
        }

        @m80.k
        public final g2 d() {
            return this.f69602b;
        }

        @m80.k
        public final String e() {
            return this.f69603c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.g0.g(this.f69601a, eVar.f69601a) && kotlin.jvm.internal.g0.g(this.f69602b, eVar.f69602b) && kotlin.jvm.internal.g0.g(this.f69603c, eVar.f69603c);
        }

        @m80.k
        public final e f(@m80.k g2 consume, @m80.k g2 doContinue, @m80.k String dialogImg) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            kotlin.jvm.internal.g0.p(dialogImg, "dialogImg");
            return new e(consume, doContinue, dialogImg);
        }

        @m80.k
        public final String h() {
            return this.f69603c;
        }

        public int hashCode() {
            return (((this.f69601a.hashCode() * 31) + this.f69602b.hashCode()) * 31) + this.f69603c.hashCode();
        }

        @m80.k
        public String toString() {
            return "LavaQuest(consume=" + this.f69601a + ", doContinue=" + this.f69602b + ", dialogImg=" + this.f69603c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l3.v f69604a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f69605b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69606c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final g2 f69607d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k l3.v saleInfo, boolean z11, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(saleInfo, "saleInfo");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69604a = saleInfo;
            this.f69605b = z11;
            this.f69606c = consume;
            this.f69607d = doContinue;
        }

        public static /* synthetic */ f h(f fVar, l3.v vVar, boolean z11, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                vVar = fVar.f69604a;
            }
            if ((i11 & 2) != 0) {
                z11 = fVar.f69605b;
            }
            if ((i11 & 4) != 0) {
                g2Var = fVar.f69606c;
            }
            if ((i11 & 8) != 0) {
                g2Var2 = fVar.f69607d;
            }
            return fVar.g(vVar, z11, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69606c;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69607d;
        }

        @m80.k
        public final l3.v c() {
            return this.f69604a;
        }

        public final boolean d() {
            return this.f69605b;
        }

        @m80.k
        public final g2 e() {
            return this.f69606c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.g0.g(this.f69604a, fVar.f69604a) && this.f69605b == fVar.f69605b && kotlin.jvm.internal.g0.g(this.f69606c, fVar.f69606c) && kotlin.jvm.internal.g0.g(this.f69607d, fVar.f69607d);
        }

        @m80.k
        public final g2 f() {
            return this.f69607d;
        }

        @m80.k
        public final f g(@m80.k l3.v saleInfo, boolean z11, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(saleInfo, "saleInfo");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new f(saleInfo, z11, consume, doContinue);
        }

        public int hashCode() {
            return (((((this.f69604a.hashCode() * 31) + Boolean.hashCode(this.f69605b)) * 31) + this.f69606c.hashCode()) * 31) + this.f69607d.hashCode();
        }

        @m80.k
        public final l3.v i() {
            return this.f69604a;
        }

        public final boolean j() {
            return this.f69605b;
        }

        @m80.k
        public String toString() {
            return "MembershipPromotion(saleInfo=" + this.f69604a + ", isVip=" + this.f69605b + ", consume=" + this.f69606c + ", doContinue=" + this.f69607d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69608a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69608a = consume;
            this.f69609b = doContinue;
        }

        public static /* synthetic */ g f(g gVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = gVar.f69608a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = gVar.f69609b;
            }
            return gVar.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69608a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69609b;
        }

        @m80.k
        public final g2 c() {
            return this.f69608a;
        }

        @m80.k
        public final g2 d() {
            return this.f69609b;
        }

        @m80.k
        public final g e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new g(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.g0.g(this.f69608a, gVar.f69608a) && kotlin.jvm.internal.g0.g(this.f69609b, gVar.f69609b);
        }

        public int hashCode() {
            return (this.f69608a.hashCode() * 31) + this.f69609b.hashCode();
        }

        @m80.k
        public String toString() {
            return "NewUserCheckBadgeGuide(consume=" + this.f69608a + ", doContinue=" + this.f69609b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69610a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69611b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69612c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k g2 enter, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(enter, "enter");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69610a = enter;
            this.f69611b = consume;
            this.f69612c = doContinue;
        }

        public static /* synthetic */ h g(h hVar, g2 g2Var, g2 g2Var2, g2 g2Var3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = hVar.f69610a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = hVar.f69611b;
            }
            if ((i11 & 4) != 0) {
                g2Var3 = hVar.f69612c;
            }
            return hVar.f(g2Var, g2Var2, g2Var3);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69611b;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69612c;
        }

        @m80.k
        public final g2 c() {
            return this.f69610a;
        }

        @m80.k
        public final g2 d() {
            return this.f69611b;
        }

        @m80.k
        public final g2 e() {
            return this.f69612c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.g0.g(this.f69610a, hVar.f69610a) && kotlin.jvm.internal.g0.g(this.f69611b, hVar.f69611b) && kotlin.jvm.internal.g0.g(this.f69612c, hVar.f69612c);
        }

        @m80.k
        public final h f(@m80.k g2 enter, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(enter, "enter");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new h(enter, consume, doContinue);
        }

        @m80.k
        public final g2 h() {
            return this.f69610a;
        }

        public int hashCode() {
            return (((this.f69610a.hashCode() * 31) + this.f69611b.hashCode()) * 31) + this.f69612c.hashCode();
        }

        @m80.k
        public String toString() {
            return "NewUserRankGuide(enter=" + this.f69610a + ", consume=" + this.f69611b + ", doContinue=" + this.f69612c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69613a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69613a = consume;
            this.f69614b = doContinue;
        }

        public static /* synthetic */ i f(i iVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = iVar.f69613a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = iVar.f69614b;
            }
            return iVar.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69613a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69614b;
        }

        @m80.k
        public final g2 c() {
            return this.f69613a;
        }

        @m80.k
        public final g2 d() {
            return this.f69614b;
        }

        @m80.k
        public final i e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new i(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.g0.g(this.f69613a, iVar.f69613a) && kotlin.jvm.internal.g0.g(this.f69614b, iVar.f69614b);
        }

        public int hashCode() {
            return (this.f69613a.hashCode() * 31) + this.f69614b.hashCode();
        }

        @m80.k
        public String toString() {
            return "NewUserScheduleGuide(consume=" + this.f69613a + ", doContinue=" + this.f69614b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69615a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69616b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k g2 enter, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(enter, "enter");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69615a = enter;
            this.f69616b = consume;
            this.f69617c = doContinue;
        }

        public static /* synthetic */ j g(j jVar, g2 g2Var, g2 g2Var2, g2 g2Var3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = jVar.f69615a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = jVar.f69616b;
            }
            if ((i11 & 4) != 0) {
                g2Var3 = jVar.f69617c;
            }
            return jVar.f(g2Var, g2Var2, g2Var3);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69616b;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69617c;
        }

        @m80.k
        public final g2 c() {
            return this.f69615a;
        }

        @m80.k
        public final g2 d() {
            return this.f69616b;
        }

        @m80.k
        public final g2 e() {
            return this.f69617c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.g0.g(this.f69615a, jVar.f69615a) && kotlin.jvm.internal.g0.g(this.f69616b, jVar.f69616b) && kotlin.jvm.internal.g0.g(this.f69617c, jVar.f69617c);
        }

        @m80.k
        public final j f(@m80.k g2 enter, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(enter, "enter");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new j(enter, consume, doContinue);
        }

        @m80.k
        public final g2 h() {
            return this.f69615a;
        }

        public int hashCode() {
            return (((this.f69615a.hashCode() * 31) + this.f69616b.hashCode()) * 31) + this.f69617c.hashCode();
        }

        @m80.k
        public String toString() {
            return "NewUserTasksGuide(enter=" + this.f69615a + ", consume=" + this.f69616b + ", doContinue=" + this.f69617c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69618a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69618a = consume;
            this.f69619b = doContinue;
        }

        public static /* synthetic */ k f(k kVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = kVar.f69618a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = kVar.f69619b;
            }
            return kVar.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69618a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69619b;
        }

        @m80.k
        public final g2 c() {
            return this.f69618a;
        }

        @m80.k
        public final g2 d() {
            return this.f69619b;
        }

        @m80.k
        public final k e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new k(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.g0.g(this.f69618a, kVar.f69618a) && kotlin.jvm.internal.g0.g(this.f69619b, kVar.f69619b);
        }

        public int hashCode() {
            return (this.f69618a.hashCode() * 31) + this.f69619b.hashCode();
        }

        @m80.k
        public String toString() {
            return "NewUserWordsReviewGuide(consume=" + this.f69618a + ", doContinue=" + this.f69619b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final l f69620a = new l();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements g2 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f69621a = new a();

            @Override // l3.g2
            public final Object a(j00.c<? super yz.g2> cVar) {
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b implements g2 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f69622a = new b();

            @Override // l3.g2
            public final Object a(j00.c<? super yz.g2> cVar) {
                return yz.g2.f100423a;
            }
        }

        public l() {
            super(null);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return a.f69621a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return b.f69622a;
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return -1272617325;
        }

        @m80.k
        public String toString() {
            return "None";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69623a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69624b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69625c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final g2 f69626d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final g2 f69627e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k String aId, @m80.k String displayTitle, @m80.k String url, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(aId, "aId");
            kotlin.jvm.internal.g0.p(displayTitle, "displayTitle");
            kotlin.jvm.internal.g0.p(url, "url");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69623a = aId;
            this.f69624b = displayTitle;
            this.f69625c = url;
            this.f69626d = consume;
            this.f69627e = doContinue;
        }

        public static /* synthetic */ m i(m mVar, String str, String str2, String str3, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = mVar.f69623a;
            }
            if ((i11 & 2) != 0) {
                str2 = mVar.f69624b;
            }
            if ((i11 & 4) != 0) {
                str3 = mVar.f69625c;
            }
            if ((i11 & 8) != 0) {
                g2Var = mVar.f69626d;
            }
            if ((i11 & 16) != 0) {
                g2Var2 = mVar.f69627e;
            }
            g2 g2Var3 = g2Var2;
            String str4 = str3;
            return mVar.h(str, str2, str4, g2Var, g2Var3);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69626d;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69627e;
        }

        @m80.k
        public final String c() {
            return this.f69623a;
        }

        @m80.k
        public final String d() {
            return this.f69624b;
        }

        @m80.k
        public final String e() {
            return this.f69625c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.g0.g(this.f69623a, mVar.f69623a) && kotlin.jvm.internal.g0.g(this.f69624b, mVar.f69624b) && kotlin.jvm.internal.g0.g(this.f69625c, mVar.f69625c) && kotlin.jvm.internal.g0.g(this.f69626d, mVar.f69626d) && kotlin.jvm.internal.g0.g(this.f69627e, mVar.f69627e);
        }

        @m80.k
        public final g2 f() {
            return this.f69626d;
        }

        @m80.k
        public final g2 g() {
            return this.f69627e;
        }

        @m80.k
        public final m h(@m80.k String aId, @m80.k String displayTitle, @m80.k String url, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(aId, "aId");
            kotlin.jvm.internal.g0.p(displayTitle, "displayTitle");
            kotlin.jvm.internal.g0.p(url, "url");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new m(aId, displayTitle, url, consume, doContinue);
        }

        public int hashCode() {
            return (((((((this.f69623a.hashCode() * 31) + this.f69624b.hashCode()) * 31) + this.f69625c.hashCode()) * 31) + this.f69626d.hashCode()) * 31) + this.f69627e.hashCode();
        }

        @m80.k
        public final String j() {
            return this.f69623a;
        }

        @m80.k
        public final String k() {
            return this.f69624b;
        }

        @m80.k
        public final String l() {
            return this.f69625c;
        }

        @m80.k
        public String toString() {
            return "NotifyEffect(aId=" + this.f69623a + ", displayTitle=" + this.f69624b + ", url=" + this.f69625c + ", consume=" + this.f69626d + ", doContinue=" + this.f69627e + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69628a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69629b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69628a = consume;
            this.f69629b = doContinue;
        }

        public static /* synthetic */ n f(n nVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = nVar.f69628a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = nVar.f69629b;
            }
            return nVar.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69628a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69629b;
        }

        @m80.k
        public final g2 c() {
            return this.f69628a;
        }

        @m80.k
        public final g2 d() {
            return this.f69629b;
        }

        @m80.k
        public final n e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new n(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.g0.g(this.f69628a, nVar.f69628a) && kotlin.jvm.internal.g0.g(this.f69629b, nVar.f69629b);
        }

        public int hashCode() {
            return (this.f69628a.hashCode() * 31) + this.f69629b.hashCode();
        }

        @m80.k
        public String toString() {
            return "OldUserUpgradeGuide(consume=" + this.f69628a + ", doContinue=" + this.f69629b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l3.o$o, reason: collision with other inner class name */
    public static final class C0837o extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69630a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0837o(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69630a = consume;
            this.f69631b = doContinue;
        }

        public static /* synthetic */ C0837o f(C0837o c0837o, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = c0837o.f69630a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = c0837o.f69631b;
            }
            return c0837o.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69630a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69631b;
        }

        @m80.k
        public final g2 c() {
            return this.f69630a;
        }

        @m80.k
        public final g2 d() {
            return this.f69631b;
        }

        @m80.k
        public final C0837o e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new C0837o(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0837o)) {
                return false;
            }
            C0837o c0837o = (C0837o) obj;
            return kotlin.jvm.internal.g0.g(this.f69630a, c0837o.f69630a) && kotlin.jvm.internal.g0.g(this.f69631b, c0837o.f69631b);
        }

        public int hashCode() {
            return (this.f69630a.hashCode() * 31) + this.f69631b.hashCode();
        }

        @m80.k
        public String toString() {
            return "PetCookieEarningGuide(consume=" + this.f69630a + ", doContinue=" + this.f69631b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final m3.j0 f69632a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69633b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69634c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final g2 f69635d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@m80.k m3.j0 rawData, @m80.k g2 close, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(rawData, "rawData");
            kotlin.jvm.internal.g0.p(close, "close");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69632a = rawData;
            this.f69633b = close;
            this.f69634c = consume;
            this.f69635d = doContinue;
        }

        public static /* synthetic */ p h(p pVar, m3.j0 j0Var, g2 g2Var, g2 g2Var2, g2 g2Var3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j0Var = pVar.f69632a;
            }
            if ((i11 & 2) != 0) {
                g2Var = pVar.f69633b;
            }
            if ((i11 & 4) != 0) {
                g2Var2 = pVar.f69634c;
            }
            if ((i11 & 8) != 0) {
                g2Var3 = pVar.f69635d;
            }
            return pVar.g(j0Var, g2Var, g2Var2, g2Var3);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69634c;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69635d;
        }

        @m80.k
        public final m3.j0 c() {
            return this.f69632a;
        }

        @m80.k
        public final g2 d() {
            return this.f69633b;
        }

        @m80.k
        public final g2 e() {
            return this.f69634c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return kotlin.jvm.internal.g0.g(this.f69632a, pVar.f69632a) && kotlin.jvm.internal.g0.g(this.f69633b, pVar.f69633b) && kotlin.jvm.internal.g0.g(this.f69634c, pVar.f69634c) && kotlin.jvm.internal.g0.g(this.f69635d, pVar.f69635d);
        }

        @m80.k
        public final g2 f() {
            return this.f69635d;
        }

        @m80.k
        public final p g(@m80.k m3.j0 rawData, @m80.k g2 close, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(rawData, "rawData");
            kotlin.jvm.internal.g0.p(close, "close");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new p(rawData, close, consume, doContinue);
        }

        public int hashCode() {
            return (((((this.f69632a.hashCode() * 31) + this.f69633b.hashCode()) * 31) + this.f69634c.hashCode()) * 31) + this.f69635d.hashCode();
        }

        @m80.k
        public final g2 i() {
            return this.f69633b;
        }

        @m80.k
        public final m3.j0 j() {
            return this.f69632a;
        }

        @m80.k
        public String toString() {
            return "PopupAdEffect(rawData=" + this.f69632a + ", close=" + this.f69633b + ", consume=" + this.f69634c + ", doContinue=" + this.f69635d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<l3.t> f69636a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final l3.t f69637b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69638c;

        /* renamed from: d, reason: collision with root package name */
        public final int f69639d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final RankListType f69640e;

        /* renamed from: f, reason: collision with root package name */
        public final long f69641f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final g2 f69642g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final g2 f69643h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@m80.k List<l3.t> rankMembers, @m80.k l3.t currentUser, int i11, int i12, @m80.k RankListType rankType, long j11, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(rankMembers, "rankMembers");
            kotlin.jvm.internal.g0.p(currentUser, "currentUser");
            kotlin.jvm.internal.g0.p(rankType, "rankType");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69636a = rankMembers;
            this.f69637b = currentUser;
            this.f69638c = i11;
            this.f69639d = i12;
            this.f69640e = rankType;
            this.f69641f = j11;
            this.f69642g = consume;
            this.f69643h = doContinue;
        }

        public static /* synthetic */ q l(q qVar, List list, l3.t tVar, int i11, int i12, RankListType rankListType, long j11, g2 g2Var, g2 g2Var2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = qVar.f69636a;
            }
            if ((i13 & 2) != 0) {
                tVar = qVar.f69637b;
            }
            if ((i13 & 4) != 0) {
                i11 = qVar.f69638c;
            }
            if ((i13 & 8) != 0) {
                i12 = qVar.f69639d;
            }
            if ((i13 & 16) != 0) {
                rankListType = qVar.f69640e;
            }
            if ((i13 & 32) != 0) {
                j11 = qVar.f69641f;
            }
            if ((i13 & 64) != 0) {
                g2Var = qVar.f69642g;
            }
            if ((i13 & 128) != 0) {
                g2Var2 = qVar.f69643h;
            }
            long j12 = j11;
            int i14 = i12;
            RankListType rankListType2 = rankListType;
            int i15 = i11;
            return qVar.k(list, tVar, i15, i14, rankListType2, j12, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69642g;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69643h;
        }

        @m80.k
        public final List<l3.t> c() {
            return this.f69636a;
        }

        @m80.k
        public final l3.t d() {
            return this.f69637b;
        }

        public final int e() {
            return this.f69638c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return kotlin.jvm.internal.g0.g(this.f69636a, qVar.f69636a) && kotlin.jvm.internal.g0.g(this.f69637b, qVar.f69637b) && this.f69638c == qVar.f69638c && this.f69639d == qVar.f69639d && this.f69640e == qVar.f69640e && this.f69641f == qVar.f69641f && kotlin.jvm.internal.g0.g(this.f69642g, qVar.f69642g) && kotlin.jvm.internal.g0.g(this.f69643h, qVar.f69643h);
        }

        public final int f() {
            return this.f69639d;
        }

        @m80.k
        public final RankListType g() {
            return this.f69640e;
        }

        public final long h() {
            return this.f69641f;
        }

        public int hashCode() {
            return (((((((((((((this.f69636a.hashCode() * 31) + this.f69637b.hashCode()) * 31) + Integer.hashCode(this.f69638c)) * 31) + Integer.hashCode(this.f69639d)) * 31) + this.f69640e.hashCode()) * 31) + Long.hashCode(this.f69641f)) * 31) + this.f69642g.hashCode()) * 31) + this.f69643h.hashCode();
        }

        @m80.k
        public final g2 i() {
            return this.f69642g;
        }

        @m80.k
        public final g2 j() {
            return this.f69643h;
        }

        @m80.k
        public final q k(@m80.k List<l3.t> rankMembers, @m80.k l3.t currentUser, int i11, int i12, @m80.k RankListType rankType, long j11, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(rankMembers, "rankMembers");
            kotlin.jvm.internal.g0.p(currentUser, "currentUser");
            kotlin.jvm.internal.g0.p(rankType, "rankType");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new q(rankMembers, currentUser, i11, i12, rankType, j11, consume, doContinue);
        }

        public final int m() {
            return this.f69639d;
        }

        @m80.k
        public final l3.t n() {
            return this.f69637b;
        }

        public final int o() {
            return this.f69638c;
        }

        public final long p() {
            return this.f69641f;
        }

        @m80.k
        public final List<l3.t> q() {
            return this.f69636a;
        }

        @m80.k
        public final RankListType r() {
            return this.f69640e;
        }

        @m80.k
        public String toString() {
            return "RankList(rankMembers=" + this.f69636a + ", currentUser=" + this.f69637b + ", previousRank=" + this.f69638c + ", currentRank=" + this.f69639d + ", rankType=" + this.f69640e + ", previousStudyScore=" + this.f69641f + ", consume=" + this.f69642g + ", doContinue=" + this.f69643h + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final g2 f69644a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(@m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69644a = consume;
            this.f69645b = doContinue;
        }

        public static /* synthetic */ r f(r rVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                g2Var = rVar.f69644a;
            }
            if ((i11 & 2) != 0) {
                g2Var2 = rVar.f69645b;
            }
            return rVar.e(g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69644a;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69645b;
        }

        @m80.k
        public final g2 c() {
            return this.f69644a;
        }

        @m80.k
        public final g2 d() {
            return this.f69645b;
        }

        @m80.k
        public final r e(@m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new r(consume, doContinue);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return kotlin.jvm.internal.g0.g(this.f69644a, rVar.f69644a) && kotlin.jvm.internal.g0.g(this.f69645b, rVar.f69645b);
        }

        public int hashCode() {
            return (this.f69644a.hashCode() * 31) + this.f69645b.hashCode();
        }

        @m80.k
        public String toString() {
            return "SendBuddyTravelGuide(consume=" + this.f69644a + ", doContinue=" + this.f69645b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l3.w f69650a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final SwitchType f69651b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69652c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final g2 f69653d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(@m80.k l3.w state, @m80.k SwitchType switchType, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(state, "state");
            kotlin.jvm.internal.g0.p(switchType, "switchType");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69650a = state;
            this.f69651b = switchType;
            this.f69652c = consume;
            this.f69653d = doContinue;
        }

        public static /* synthetic */ t h(t tVar, l3.w wVar, SwitchType switchType, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                wVar = tVar.f69650a;
            }
            if ((i11 & 2) != 0) {
                switchType = tVar.f69651b;
            }
            if ((i11 & 4) != 0) {
                g2Var = tVar.f69652c;
            }
            if ((i11 & 8) != 0) {
                g2Var2 = tVar.f69653d;
            }
            return tVar.g(wVar, switchType, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69652c;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69653d;
        }

        @m80.k
        public final l3.w c() {
            return this.f69650a;
        }

        @m80.k
        public final SwitchType d() {
            return this.f69651b;
        }

        @m80.k
        public final g2 e() {
            return this.f69652c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return kotlin.jvm.internal.g0.g(this.f69650a, tVar.f69650a) && this.f69651b == tVar.f69651b && kotlin.jvm.internal.g0.g(this.f69652c, tVar.f69652c) && kotlin.jvm.internal.g0.g(this.f69653d, tVar.f69653d);
        }

        @m80.k
        public final g2 f() {
            return this.f69653d;
        }

        @m80.k
        public final t g(@m80.k l3.w state, @m80.k SwitchType switchType, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(state, "state");
            kotlin.jvm.internal.g0.p(switchType, "switchType");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new t(state, switchType, consume, doContinue);
        }

        public int hashCode() {
            return (((((this.f69650a.hashCode() * 31) + this.f69651b.hashCode()) * 31) + this.f69652c.hashCode()) * 31) + this.f69653d.hashCode();
        }

        @m80.k
        public final l3.w i() {
            return this.f69650a;
        }

        @m80.k
        public final SwitchType j() {
            return this.f69651b;
        }

        @m80.k
        public String toString() {
            return "SentenceSwitch(state=" + this.f69650a + ", switchType=" + this.f69651b + ", consume=" + this.f69652c + ", doContinue=" + this.f69653d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u extends o {

        /* renamed from: a, reason: collision with root package name */
        public final int f69654a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69655b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69656c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i11, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69654a = i11;
            this.f69655b = consume;
            this.f69656c = doContinue;
        }

        public static /* synthetic */ u g(u uVar, int i11, g2 g2Var, g2 g2Var2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = uVar.f69654a;
            }
            if ((i12 & 2) != 0) {
                g2Var = uVar.f69655b;
            }
            if ((i12 & 4) != 0) {
                g2Var2 = uVar.f69656c;
            }
            return uVar.f(i11, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69655b;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69656c;
        }

        public final int c() {
            return this.f69654a;
        }

        @m80.k
        public final g2 d() {
            return this.f69655b;
        }

        @m80.k
        public final g2 e() {
            return this.f69656c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.f69654a == uVar.f69654a && kotlin.jvm.internal.g0.g(this.f69655b, uVar.f69655b) && kotlin.jvm.internal.g0.g(this.f69656c, uVar.f69656c);
        }

        @m80.k
        public final u f(int i11, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new u(i11, consume, doContinue);
        }

        public final int h() {
            return this.f69654a;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f69654a) * 31) + this.f69655b.hashCode()) * 31) + this.f69656c.hashCode();
        }

        @m80.k
        public String toString() {
            return "Story(chapter=" + this.f69654a + ", consume=" + this.f69655b + ", doContinue=" + this.f69656c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v extends o {

        /* renamed from: a, reason: collision with root package name */
        public final int f69657a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69658b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final StreakAwardType f69659c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f69660d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f69661e;

        /* renamed from: f, reason: collision with root package name */
        public final int f69662f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final g2 f69663g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final g2 f69664h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i11, int i12, @m80.k StreakAwardType award, @m80.k String awardDesc, @m80.k String awardCount, int i13, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(award, "award");
            kotlin.jvm.internal.g0.p(awardDesc, "awardDesc");
            kotlin.jvm.internal.g0.p(awardCount, "awardCount");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69657a = i11;
            this.f69658b = i12;
            this.f69659c = award;
            this.f69660d = awardDesc;
            this.f69661e = awardCount;
            this.f69662f = i13;
            this.f69663g = consume;
            this.f69664h = doContinue;
        }

        public static /* synthetic */ v l(v vVar, int i11, int i12, StreakAwardType streakAwardType, String str, String str2, int i13, g2 g2Var, g2 g2Var2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = vVar.f69657a;
            }
            if ((i14 & 2) != 0) {
                i12 = vVar.f69658b;
            }
            if ((i14 & 4) != 0) {
                streakAwardType = vVar.f69659c;
            }
            if ((i14 & 8) != 0) {
                str = vVar.f69660d;
            }
            if ((i14 & 16) != 0) {
                str2 = vVar.f69661e;
            }
            if ((i14 & 32) != 0) {
                i13 = vVar.f69662f;
            }
            if ((i14 & 64) != 0) {
                g2Var = vVar.f69663g;
            }
            if ((i14 & 128) != 0) {
                g2Var2 = vVar.f69664h;
            }
            g2 g2Var3 = g2Var;
            g2 g2Var4 = g2Var2;
            String str3 = str2;
            int i15 = i13;
            return vVar.k(i11, i12, streakAwardType, str, str3, i15, g2Var3, g2Var4);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69663g;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69664h;
        }

        public final int c() {
            return this.f69657a;
        }

        public final int d() {
            return this.f69658b;
        }

        @m80.k
        public final StreakAwardType e() {
            return this.f69659c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.f69657a == vVar.f69657a && this.f69658b == vVar.f69658b && this.f69659c == vVar.f69659c && kotlin.jvm.internal.g0.g(this.f69660d, vVar.f69660d) && kotlin.jvm.internal.g0.g(this.f69661e, vVar.f69661e) && this.f69662f == vVar.f69662f && kotlin.jvm.internal.g0.g(this.f69663g, vVar.f69663g) && kotlin.jvm.internal.g0.g(this.f69664h, vVar.f69664h);
        }

        @m80.k
        public final String f() {
            return this.f69660d;
        }

        @m80.k
        public final String g() {
            return this.f69661e;
        }

        public final int h() {
            return this.f69662f;
        }

        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.f69657a) * 31) + Integer.hashCode(this.f69658b)) * 31) + this.f69659c.hashCode()) * 31) + this.f69660d.hashCode()) * 31) + this.f69661e.hashCode()) * 31) + Integer.hashCode(this.f69662f)) * 31) + this.f69663g.hashCode()) * 31) + this.f69664h.hashCode();
        }

        @m80.k
        public final g2 i() {
            return this.f69663g;
        }

        @m80.k
        public final g2 j() {
            return this.f69664h;
        }

        @m80.k
        public final v k(int i11, int i12, @m80.k StreakAwardType award, @m80.k String awardDesc, @m80.k String awardCount, int i13, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(award, "award");
            kotlin.jvm.internal.g0.p(awardDesc, "awardDesc");
            kotlin.jvm.internal.g0.p(awardCount, "awardCount");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new v(i11, i12, award, awardDesc, awardCount, i13, consume, doContinue);
        }

        @m80.k
        public final StreakAwardType m() {
            return this.f69659c;
        }

        @m80.k
        public final String n() {
            return this.f69661e;
        }

        @m80.k
        public final String o() {
            return this.f69660d;
        }

        public final int p() {
            return this.f69657a;
        }

        public final int q() {
            return this.f69662f;
        }

        public final int r() {
            return this.f69658b;
        }

        @m80.k
        public String toString() {
            return "Streak(currentDay=" + this.f69657a + ", targetDay=" + this.f69658b + ", award=" + this.f69659c + ", awardDesc=" + this.f69660d + ", awardCount=" + this.f69661e + ", nextTarget=" + this.f69662f + ", consume=" + this.f69663g + ", doContinue=" + this.f69664h + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l3.f f69665a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69666b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69667c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(@m80.k l3.f buddyBasic, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(buddyBasic, "buddyBasic");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69665a = buddyBasic;
            this.f69666b = consume;
            this.f69667c = doContinue;
        }

        public static /* synthetic */ w g(w wVar, l3.f fVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fVar = wVar.f69665a;
            }
            if ((i11 & 2) != 0) {
                g2Var = wVar.f69666b;
            }
            if ((i11 & 4) != 0) {
                g2Var2 = wVar.f69667c;
            }
            return wVar.f(fVar, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69666b;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69667c;
        }

        @m80.k
        public final l3.f c() {
            return this.f69665a;
        }

        @m80.k
        public final g2 d() {
            return this.f69666b;
        }

        @m80.k
        public final g2 e() {
            return this.f69667c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return kotlin.jvm.internal.g0.g(this.f69665a, wVar.f69665a) && kotlin.jvm.internal.g0.g(this.f69666b, wVar.f69666b) && kotlin.jvm.internal.g0.g(this.f69667c, wVar.f69667c);
        }

        @m80.k
        public final w f(@m80.k l3.f buddyBasic, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(buddyBasic, "buddyBasic");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new w(buddyBasic, consume, doContinue);
        }

        @m80.k
        public final l3.f h() {
            return this.f69665a;
        }

        public int hashCode() {
            return (((this.f69665a.hashCode() * 31) + this.f69666b.hashCode()) * 31) + this.f69667c.hashCode();
        }

        @m80.k
        public String toString() {
            return "StudyBuddyUnlocked(buddyBasic=" + this.f69665a + ", consume=" + this.f69666b + ", doContinue=" + this.f69667c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<c0> f69668a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69669b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69670c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final g2 f69671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(@m80.k List<c0> tasks, @m80.k g2 enter, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(tasks, "tasks");
            kotlin.jvm.internal.g0.p(enter, "enter");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69668a = tasks;
            this.f69669b = enter;
            this.f69670c = consume;
            this.f69671d = doContinue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ x h(x xVar, List list, g2 g2Var, g2 g2Var2, g2 g2Var3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = xVar.f69668a;
            }
            if ((i11 & 2) != 0) {
                g2Var = xVar.f69669b;
            }
            if ((i11 & 4) != 0) {
                g2Var2 = xVar.f69670c;
            }
            if ((i11 & 8) != 0) {
                g2Var3 = xVar.f69671d;
            }
            return xVar.g(list, g2Var, g2Var2, g2Var3);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69670c;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69671d;
        }

        @m80.k
        public final List<c0> c() {
            return this.f69668a;
        }

        @m80.k
        public final g2 d() {
            return this.f69669b;
        }

        @m80.k
        public final g2 e() {
            return this.f69670c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return kotlin.jvm.internal.g0.g(this.f69668a, xVar.f69668a) && kotlin.jvm.internal.g0.g(this.f69669b, xVar.f69669b) && kotlin.jvm.internal.g0.g(this.f69670c, xVar.f69670c) && kotlin.jvm.internal.g0.g(this.f69671d, xVar.f69671d);
        }

        @m80.k
        public final g2 f() {
            return this.f69671d;
        }

        @m80.k
        public final x g(@m80.k List<c0> tasks, @m80.k g2 enter, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(tasks, "tasks");
            kotlin.jvm.internal.g0.p(enter, "enter");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new x(tasks, enter, consume, doContinue);
        }

        public int hashCode() {
            return (((((this.f69668a.hashCode() * 31) + this.f69669b.hashCode()) * 31) + this.f69670c.hashCode()) * 31) + this.f69671d.hashCode();
        }

        @m80.k
        public final g2 i() {
            return this.f69669b;
        }

        @m80.k
        public final List<c0> j() {
            return this.f69668a;
        }

        @m80.k
        public String toString() {
            return "TaskEffect(tasks=" + this.f69668a + ", enter=" + this.f69669b + ", consume=" + this.f69670c + ", doContinue=" + this.f69671d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l3.u f69672a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69673b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69674c;

        /* renamed from: d, reason: collision with root package name */
        public final int f69675d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final g2 f69676e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final g2 f69677f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(@m80.k l3.u rewardData, @m80.k String bookName, int i11, int i12, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(rewardData, "rewardData");
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69672a = rewardData;
            this.f69673b = bookName;
            this.f69674c = i11;
            this.f69675d = i12;
            this.f69676e = consume;
            this.f69677f = doContinue;
        }

        public static /* synthetic */ y j(y yVar, l3.u uVar, String str, int i11, int i12, g2 g2Var, g2 g2Var2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                uVar = yVar.f69672a;
            }
            if ((i13 & 2) != 0) {
                str = yVar.f69673b;
            }
            if ((i13 & 4) != 0) {
                i11 = yVar.f69674c;
            }
            if ((i13 & 8) != 0) {
                i12 = yVar.f69675d;
            }
            if ((i13 & 16) != 0) {
                g2Var = yVar.f69676e;
            }
            if ((i13 & 32) != 0) {
                g2Var2 = yVar.f69677f;
            }
            g2 g2Var3 = g2Var;
            g2 g2Var4 = g2Var2;
            return yVar.i(uVar, str, i11, i12, g2Var3, g2Var4);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69676e;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69677f;
        }

        @m80.k
        public final l3.u c() {
            return this.f69672a;
        }

        @m80.k
        public final String d() {
            return this.f69673b;
        }

        public final int e() {
            return this.f69674c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return kotlin.jvm.internal.g0.g(this.f69672a, yVar.f69672a) && kotlin.jvm.internal.g0.g(this.f69673b, yVar.f69673b) && this.f69674c == yVar.f69674c && this.f69675d == yVar.f69675d && kotlin.jvm.internal.g0.g(this.f69676e, yVar.f69676e) && kotlin.jvm.internal.g0.g(this.f69677f, yVar.f69677f);
        }

        public final int f() {
            return this.f69675d;
        }

        @m80.k
        public final g2 g() {
            return this.f69676e;
        }

        @m80.k
        public final g2 h() {
            return this.f69677f;
        }

        public int hashCode() {
            return (((((((((this.f69672a.hashCode() * 31) + this.f69673b.hashCode()) * 31) + Integer.hashCode(this.f69674c)) * 31) + Integer.hashCode(this.f69675d)) * 31) + this.f69676e.hashCode()) * 31) + this.f69677f.hashCode();
        }

        @m80.k
        public final y i(@m80.k l3.u rewardData, @m80.k String bookName, int i11, int i12, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(rewardData, "rewardData");
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new y(rewardData, bookName, i11, i12, consume, doContinue);
        }

        @m80.k
        public final String k() {
            return this.f69673b;
        }

        public final int l() {
            return this.f69674c;
        }

        public final int m() {
            return this.f69675d;
        }

        @m80.k
        public final l3.u n() {
            return this.f69672a;
        }

        @m80.k
        public String toString() {
            return "WordsMileStoneReward(rewardData=" + this.f69672a + ", bookName=" + this.f69673b + ", learnWords=" + this.f69674c + ", progress=" + this.f69675d + ", consume=" + this.f69676e + ", doContinue=" + this.f69677f + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l3.u f69678a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69679b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(@m80.k l3.u rewardData, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(rewardData, "rewardData");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69678a = rewardData;
            this.f69679b = consume;
            this.f69680c = doContinue;
        }

        public static /* synthetic */ z g(z zVar, l3.u uVar, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uVar = zVar.f69678a;
            }
            if ((i11 & 2) != 0) {
                g2Var = zVar.f69679b;
            }
            if ((i11 & 4) != 0) {
                g2Var2 = zVar.f69680c;
            }
            return zVar.f(uVar, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69679b;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69680c;
        }

        @m80.k
        public final l3.u c() {
            return this.f69678a;
        }

        @m80.k
        public final g2 d() {
            return this.f69679b;
        }

        @m80.k
        public final g2 e() {
            return this.f69680c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return kotlin.jvm.internal.g0.g(this.f69678a, zVar.f69678a) && kotlin.jvm.internal.g0.g(this.f69679b, zVar.f69679b) && kotlin.jvm.internal.g0.g(this.f69680c, zVar.f69680c);
        }

        @m80.k
        public final z f(@m80.k l3.u rewardData, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(rewardData, "rewardData");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new z(rewardData, consume, doContinue);
        }

        @m80.k
        public final l3.u h() {
            return this.f69678a;
        }

        public int hashCode() {
            return (((this.f69678a.hashCode() * 31) + this.f69679b.hashCode()) * 31) + this.f69680c.hashCode();
        }

        @m80.k
        public String toString() {
            return "WordsRoundReward(rewardData=" + this.f69678a + ", consume=" + this.f69679b + ", doContinue=" + this.f69680c + ')';
        }
    }

    public /* synthetic */ o(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public abstract g2 a();

    @m80.k
    public abstract g2 b();

    public o() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s extends o {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final l3.u f69646a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69647b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final g2 f69648c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final g2 f69649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(@m80.k l3.u rewardData, @m80.k String journalBadge, @m80.k g2 consume, @m80.k g2 doContinue) {
            super(null);
            kotlin.jvm.internal.g0.p(rewardData, "rewardData");
            kotlin.jvm.internal.g0.p(journalBadge, "journalBadge");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            this.f69646a = rewardData;
            this.f69647b = journalBadge;
            this.f69648c = consume;
            this.f69649d = doContinue;
        }

        public static /* synthetic */ s h(s sVar, l3.u uVar, String str, g2 g2Var, g2 g2Var2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uVar = sVar.f69646a;
            }
            if ((i11 & 2) != 0) {
                str = sVar.f69647b;
            }
            if ((i11 & 4) != 0) {
                g2Var = sVar.f69648c;
            }
            if ((i11 & 8) != 0) {
                g2Var2 = sVar.f69649d;
            }
            return sVar.g(uVar, str, g2Var, g2Var2);
        }

        @Override // l3.o
        @m80.k
        public g2 a() {
            return this.f69648c;
        }

        @Override // l3.o
        @m80.k
        public g2 b() {
            return this.f69649d;
        }

        @m80.k
        public final l3.u c() {
            return this.f69646a;
        }

        @m80.k
        public final String d() {
            return this.f69647b;
        }

        @m80.k
        public final g2 e() {
            return this.f69648c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return kotlin.jvm.internal.g0.g(this.f69646a, sVar.f69646a) && kotlin.jvm.internal.g0.g(this.f69647b, sVar.f69647b) && kotlin.jvm.internal.g0.g(this.f69648c, sVar.f69648c) && kotlin.jvm.internal.g0.g(this.f69649d, sVar.f69649d);
        }

        @m80.k
        public final g2 f() {
            return this.f69649d;
        }

        @m80.k
        public final s g(@m80.k l3.u rewardData, @m80.k String journalBadge, @m80.k g2 consume, @m80.k g2 doContinue) {
            kotlin.jvm.internal.g0.p(rewardData, "rewardData");
            kotlin.jvm.internal.g0.p(journalBadge, "journalBadge");
            kotlin.jvm.internal.g0.p(consume, "consume");
            kotlin.jvm.internal.g0.p(doContinue, "doContinue");
            return new s(rewardData, journalBadge, consume, doContinue);
        }

        public int hashCode() {
            return (((((this.f69646a.hashCode() * 31) + this.f69647b.hashCode()) * 31) + this.f69648c.hashCode()) * 31) + this.f69649d.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69647b;
        }

        @m80.k
        public final l3.u j() {
            return this.f69646a;
        }

        @m80.k
        public String toString() {
            return "SentenceRoundReward(rewardData=" + this.f69646a + ", journalBadge=" + this.f69647b + ", consume=" + this.f69648c + ", doContinue=" + this.f69649d + ')';
        }

        public /* synthetic */ s(l3.u uVar, String str, g2 g2Var, g2 g2Var2, int i11, kotlin.jvm.internal.v vVar) {
            this(uVar, (i11 & 2) != 0 ? "" : str, g2Var, g2Var2);
        }
    }
}
