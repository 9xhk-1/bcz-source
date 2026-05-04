package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22093a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f22094d = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final p1 f22095b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22096c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k p1 bookBookModel, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            this.f22095b = bookBookModel;
            this.f22096c = z11;
        }

        public static /* synthetic */ a d(a aVar, p1 p1Var, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                p1Var = aVar.f22095b;
            }
            if ((i11 & 2) != 0) {
                z11 = aVar.f22096c;
            }
            return aVar.c(p1Var, z11);
        }

        @m80.k
        public final p1 a() {
            return this.f22095b;
        }

        public final boolean b() {
            return this.f22096c;
        }

        @m80.k
        public final a c(@m80.k p1 bookBookModel, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            return new a(bookBookModel, z11);
        }

        @m80.k
        public final p1 e() {
            return this.f22095b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f22095b, aVar.f22095b) && this.f22096c == aVar.f22096c;
        }

        public final boolean f() {
            return this.f22096c;
        }

        public int hashCode() {
            return (this.f22095b.hashCode() * 31) + Boolean.hashCode(this.f22096c);
        }

        @m80.k
        public String toString() {
            return "AllDone(bookBookModel=" + this.f22095b + ", finishToday=" + this.f22096c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: com.baicizhan.main.home.plan.allinone.b$b, reason: collision with other inner class name */
    public static final class C0310b extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22097c = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0310b(@m80.k String msg) {
            super(null);
            kotlin.jvm.internal.g0.p(msg, "msg");
            this.f22098b = msg;
        }

        public static /* synthetic */ C0310b c(C0310b c0310b, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = c0310b.f22098b;
            }
            return c0310b.b(str);
        }

        @m80.k
        public final String a() {
            return this.f22098b;
        }

        @m80.k
        public final C0310b b(@m80.k String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            return new C0310b(msg);
        }

        @m80.k
        public final String d() {
            return this.f22098b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0310b) && kotlin.jvm.internal.g0.g(this.f22098b, ((C0310b) obj).f22098b);
        }

        public int hashCode() {
            return this.f22098b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(msg=" + this.f22098b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends b {

        /* renamed from: f, reason: collision with root package name */
        public static final int f22099f = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final p1 f22100b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final m1 f22101c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final th.a f22102d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f22103e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k p1 bookBookModel, @m80.k m1 reviewModel, @m80.l th.a aVar, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            this.f22100b = bookBookModel;
            this.f22101c = reviewModel;
            this.f22102d = aVar;
            this.f22103e = z11;
        }

        public static /* synthetic */ c f(c cVar, p1 p1Var, m1 m1Var, th.a aVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                p1Var = cVar.f22100b;
            }
            if ((i11 & 2) != 0) {
                m1Var = cVar.f22101c;
            }
            if ((i11 & 4) != 0) {
                aVar = cVar.f22102d;
            }
            if ((i11 & 8) != 0) {
                z11 = cVar.f22103e;
            }
            return cVar.e(p1Var, m1Var, aVar, z11);
        }

        @m80.k
        public final p1 a() {
            return this.f22100b;
        }

        @m80.k
        public final m1 b() {
            return this.f22101c;
        }

        @m80.l
        public final th.a c() {
            return this.f22102d;
        }

        public final boolean d() {
            return this.f22103e;
        }

        @m80.k
        public final c e(@m80.k p1 bookBookModel, @m80.k m1 reviewModel, @m80.l th.a aVar, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            return new c(bookBookModel, reviewModel, aVar, z11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f22100b, cVar.f22100b) && kotlin.jvm.internal.g0.g(this.f22101c, cVar.f22101c) && kotlin.jvm.internal.g0.g(this.f22102d, cVar.f22102d) && this.f22103e == cVar.f22103e;
        }

        @m80.l
        public final th.a g() {
            return this.f22102d;
        }

        @m80.k
        public final p1 h() {
            return this.f22100b;
        }

        public int hashCode() {
            int hashCode = ((this.f22100b.hashCode() * 31) + this.f22101c.hashCode()) * 31;
            th.a aVar = this.f22102d;
            return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f22103e);
        }

        public final boolean i() {
            return this.f22103e;
        }

        @m80.k
        public final m1 j() {
            return this.f22101c;
        }

        @m80.k
        public String toString() {
            return "FinishLearningToday(bookBookModel=" + this.f22100b + ", reviewModel=" + this.f22101c + ", adModel=" + this.f22102d + ", finishToday=" + this.f22103e + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class d extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22104c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Object f22105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k Object nothing) {
            super(null);
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            this.f22105b = nothing;
        }

        public static /* synthetic */ d c(d dVar, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = dVar.f22105b;
            }
            return dVar.b(obj);
        }

        public final Object a() {
            return this.f22105b;
        }

        @m80.k
        public final d b(@m80.k Object nothing) {
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            return new d(nothing);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.g0.g(this.f22105b, ((d) obj).f22105b);
        }

        public int hashCode() {
            return this.f22105b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Init(nothing=" + this.f22105b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class e extends b {

        /* renamed from: g, reason: collision with root package name */
        public static final int f22106g = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final p1 f22107b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final m1 f22108c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final m1 f22109d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final th.a f22110e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f22111f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k p1 bookBookModel, @m80.k m1 learnModel, @m80.k m1 reviewModel, @m80.l th.a aVar, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(learnModel, "learnModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            this.f22107b = bookBookModel;
            this.f22108c = learnModel;
            this.f22109d = reviewModel;
            this.f22110e = aVar;
            this.f22111f = z11;
        }

        public static /* synthetic */ e g(e eVar, p1 p1Var, m1 m1Var, m1 m1Var2, th.a aVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                p1Var = eVar.f22107b;
            }
            if ((i11 & 2) != 0) {
                m1Var = eVar.f22108c;
            }
            if ((i11 & 4) != 0) {
                m1Var2 = eVar.f22109d;
            }
            if ((i11 & 8) != 0) {
                aVar = eVar.f22110e;
            }
            if ((i11 & 16) != 0) {
                z11 = eVar.f22111f;
            }
            boolean z12 = z11;
            m1 m1Var3 = m1Var2;
            return eVar.f(p1Var, m1Var, m1Var3, aVar, z12);
        }

        @m80.k
        public final p1 a() {
            return this.f22107b;
        }

        @m80.k
        public final m1 b() {
            return this.f22108c;
        }

        @m80.k
        public final m1 c() {
            return this.f22109d;
        }

        @m80.l
        public final th.a d() {
            return this.f22110e;
        }

        public final boolean e() {
            return this.f22111f;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.g0.g(this.f22107b, eVar.f22107b) && kotlin.jvm.internal.g0.g(this.f22108c, eVar.f22108c) && kotlin.jvm.internal.g0.g(this.f22109d, eVar.f22109d) && kotlin.jvm.internal.g0.g(this.f22110e, eVar.f22110e) && this.f22111f == eVar.f22111f;
        }

        @m80.k
        public final e f(@m80.k p1 bookBookModel, @m80.k m1 learnModel, @m80.k m1 reviewModel, @m80.l th.a aVar, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(learnModel, "learnModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            return new e(bookBookModel, learnModel, reviewModel, aVar, z11);
        }

        @m80.l
        public final th.a h() {
            return this.f22110e;
        }

        public int hashCode() {
            int hashCode = ((((this.f22107b.hashCode() * 31) + this.f22108c.hashCode()) * 31) + this.f22109d.hashCode()) * 31;
            th.a aVar = this.f22110e;
            return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f22111f);
        }

        @m80.k
        public final p1 i() {
            return this.f22107b;
        }

        public final boolean j() {
            return this.f22111f;
        }

        @m80.k
        public final m1 k() {
            return this.f22108c;
        }

        @m80.k
        public final m1 l() {
            return this.f22109d;
        }

        @m80.k
        public String toString() {
            return "LearningModel(bookBookModel=" + this.f22107b + ", learnModel=" + this.f22108c + ", reviewModel=" + this.f22109d + ", adModel=" + this.f22110e + ", finishToday=" + this.f22111f + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class f extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22112c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Object f22113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k Object nothing) {
            super(null);
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            this.f22113b = nothing;
        }

        private final Object a() {
            return this.f22113b;
        }

        public static /* synthetic */ f c(f fVar, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = fVar.f22113b;
            }
            return fVar.b(obj);
        }

        @m80.k
        public final f b(@m80.k Object nothing) {
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            return new f(nothing);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.g0.g(this.f22113b, ((f) obj).f22113b);
        }

        public int hashCode() {
            return this.f22113b.hashCode();
        }

        @m80.k
        public String toString() {
            return "NeedUpgrade(nothing=" + this.f22113b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class g extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22114c = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k String msg) {
            super(null);
            kotlin.jvm.internal.g0.p(msg, "msg");
            this.f22115b = msg;
        }

        public static /* synthetic */ g c(g gVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gVar.f22115b;
            }
            return gVar.b(str);
        }

        @m80.k
        public final String a() {
            return this.f22115b;
        }

        @m80.k
        public final g b(@m80.k String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            return new g(msg);
        }

        @m80.k
        public final String d() {
            return this.f22115b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.g0.g(this.f22115b, ((g) obj).f22115b);
        }

        public int hashCode() {
            return this.f22115b.hashCode();
        }

        @m80.k
        public String toString() {
            return "NotSupport(msg=" + this.f22115b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class h extends b {

        /* renamed from: f, reason: collision with root package name */
        public static final int f22116f = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final p1 f22117b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final m1 f22118c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final th.a f22119d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f22120e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k p1 bookBookModel, @m80.k m1 reviewModel, @m80.l th.a aVar, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            this.f22117b = bookBookModel;
            this.f22118c = reviewModel;
            this.f22119d = aVar;
            this.f22120e = z11;
        }

        public static /* synthetic */ h f(h hVar, p1 p1Var, m1 m1Var, th.a aVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                p1Var = hVar.f22117b;
            }
            if ((i11 & 2) != 0) {
                m1Var = hVar.f22118c;
            }
            if ((i11 & 4) != 0) {
                aVar = hVar.f22119d;
            }
            if ((i11 & 8) != 0) {
                z11 = hVar.f22120e;
            }
            return hVar.e(p1Var, m1Var, aVar, z11);
        }

        @m80.k
        public final p1 a() {
            return this.f22117b;
        }

        @m80.k
        public final m1 b() {
            return this.f22118c;
        }

        @m80.l
        public final th.a c() {
            return this.f22119d;
        }

        public final boolean d() {
            return this.f22120e;
        }

        @m80.k
        public final h e(@m80.k p1 bookBookModel, @m80.k m1 reviewModel, @m80.l th.a aVar, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            return new h(bookBookModel, reviewModel, aVar, z11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.g0.g(this.f22117b, hVar.f22117b) && kotlin.jvm.internal.g0.g(this.f22118c, hVar.f22118c) && kotlin.jvm.internal.g0.g(this.f22119d, hVar.f22119d) && this.f22120e == hVar.f22120e;
        }

        @m80.l
        public final th.a g() {
            return this.f22119d;
        }

        @m80.k
        public final p1 h() {
            return this.f22117b;
        }

        public int hashCode() {
            int hashCode = ((this.f22117b.hashCode() * 31) + this.f22118c.hashCode()) * 31;
            th.a aVar = this.f22119d;
            return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f22120e);
        }

        public final boolean i() {
            return this.f22120e;
        }

        @m80.k
        public final m1 j() {
            return this.f22118c;
        }

        @m80.k
        public String toString() {
            return "ReviewModel(bookBookModel=" + this.f22117b + ", reviewModel=" + this.f22118c + ", adModel=" + this.f22119d + ", finishToday=" + this.f22120e + pn.j.f81007d;
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
        this();
    }

    public b() {
    }
}
