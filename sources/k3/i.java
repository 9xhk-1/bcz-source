package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final k3 f65346a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k k3 bookBookModel, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            this.f65346a = bookBookModel;
            this.f65347b = z11;
        }

        public static /* synthetic */ a d(a aVar, k3 k3Var, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                k3Var = aVar.f65346a;
            }
            if ((i11 & 2) != 0) {
                z11 = aVar.f65347b;
            }
            return aVar.c(k3Var, z11);
        }

        @m80.k
        public final k3 a() {
            return this.f65346a;
        }

        public final boolean b() {
            return this.f65347b;
        }

        @m80.k
        public final a c(@m80.k k3 bookBookModel, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            return new a(bookBookModel, z11);
        }

        @m80.k
        public final k3 e() {
            return this.f65346a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f65346a, aVar.f65346a) && this.f65347b == aVar.f65347b;
        }

        public final boolean f() {
            return this.f65347b;
        }

        public int hashCode() {
            return (this.f65346a.hashCode() * 31) + Boolean.hashCode(this.f65347b);
        }

        @m80.k
        public String toString() {
            return "AllDone(bookBookModel=" + this.f65346a + ", finishToday=" + this.f65347b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f65348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String msg) {
            super(null);
            kotlin.jvm.internal.g0.p(msg, "msg");
            this.f65348a = msg;
        }

        public static /* synthetic */ b c(b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f65348a;
            }
            return bVar.b(str);
        }

        @m80.k
        public final String a() {
            return this.f65348a;
        }

        @m80.k
        public final b b(@m80.k String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            return new b(msg);
        }

        @m80.k
        public final String d() {
            return this.f65348a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f65348a, ((b) obj).f65348a);
        }

        public int hashCode() {
            return this.f65348a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(msg=" + this.f65348a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final k3 f65349a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final b3 f65350b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final k3.d f65351c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f65352d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k k3 bookBookModel, @m80.k b3 reviewModel, @m80.l k3.d dVar, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            this.f65349a = bookBookModel;
            this.f65350b = reviewModel;
            this.f65351c = dVar;
            this.f65352d = z11;
        }

        public static /* synthetic */ c f(c cVar, k3 k3Var, b3 b3Var, k3.d dVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                k3Var = cVar.f65349a;
            }
            if ((i11 & 2) != 0) {
                b3Var = cVar.f65350b;
            }
            if ((i11 & 4) != 0) {
                dVar = cVar.f65351c;
            }
            if ((i11 & 8) != 0) {
                z11 = cVar.f65352d;
            }
            return cVar.e(k3Var, b3Var, dVar, z11);
        }

        @m80.k
        public final k3 a() {
            return this.f65349a;
        }

        @m80.k
        public final b3 b() {
            return this.f65350b;
        }

        @m80.l
        public final k3.d c() {
            return this.f65351c;
        }

        public final boolean d() {
            return this.f65352d;
        }

        @m80.k
        public final c e(@m80.k k3 bookBookModel, @m80.k b3 reviewModel, @m80.l k3.d dVar, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            return new c(bookBookModel, reviewModel, dVar, z11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f65349a, cVar.f65349a) && kotlin.jvm.internal.g0.g(this.f65350b, cVar.f65350b) && kotlin.jvm.internal.g0.g(this.f65351c, cVar.f65351c) && this.f65352d == cVar.f65352d;
        }

        @m80.l
        public final k3.d g() {
            return this.f65351c;
        }

        @m80.k
        public final k3 h() {
            return this.f65349a;
        }

        public int hashCode() {
            int hashCode = ((this.f65349a.hashCode() * 31) + this.f65350b.hashCode()) * 31;
            k3.d dVar = this.f65351c;
            return ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.f65352d);
        }

        public final boolean i() {
            return this.f65352d;
        }

        @m80.k
        public final b3 j() {
            return this.f65350b;
        }

        @m80.k
        public String toString() {
            return "FinishLearningToday(bookBookModel=" + this.f65349a + ", reviewModel=" + this.f65350b + ", adModel=" + this.f65351c + ", finishToday=" + this.f65352d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Object f65353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k Object nothing) {
            super(null);
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            this.f65353a = nothing;
        }

        public static /* synthetic */ d c(d dVar, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = dVar.f65353a;
            }
            return dVar.b(obj);
        }

        public final Object a() {
            return this.f65353a;
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
            return (obj instanceof d) && kotlin.jvm.internal.g0.g(this.f65353a, ((d) obj).f65353a);
        }

        public int hashCode() {
            return this.f65353a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Init(nothing=" + this.f65353a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final k3 f65354a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final b3 f65355b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final b3 f65356c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final k3.d f65357d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f65358e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k k3 bookBookModel, @m80.k b3 learnModel, @m80.k b3 reviewModel, @m80.l k3.d dVar, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(learnModel, "learnModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            this.f65354a = bookBookModel;
            this.f65355b = learnModel;
            this.f65356c = reviewModel;
            this.f65357d = dVar;
            this.f65358e = z11;
        }

        public static /* synthetic */ e g(e eVar, k3 k3Var, b3 b3Var, b3 b3Var2, k3.d dVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                k3Var = eVar.f65354a;
            }
            if ((i11 & 2) != 0) {
                b3Var = eVar.f65355b;
            }
            if ((i11 & 4) != 0) {
                b3Var2 = eVar.f65356c;
            }
            if ((i11 & 8) != 0) {
                dVar = eVar.f65357d;
            }
            if ((i11 & 16) != 0) {
                z11 = eVar.f65358e;
            }
            boolean z12 = z11;
            b3 b3Var3 = b3Var2;
            return eVar.f(k3Var, b3Var, b3Var3, dVar, z12);
        }

        @m80.k
        public final k3 a() {
            return this.f65354a;
        }

        @m80.k
        public final b3 b() {
            return this.f65355b;
        }

        @m80.k
        public final b3 c() {
            return this.f65356c;
        }

        @m80.l
        public final k3.d d() {
            return this.f65357d;
        }

        public final boolean e() {
            return this.f65358e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.g0.g(this.f65354a, eVar.f65354a) && kotlin.jvm.internal.g0.g(this.f65355b, eVar.f65355b) && kotlin.jvm.internal.g0.g(this.f65356c, eVar.f65356c) && kotlin.jvm.internal.g0.g(this.f65357d, eVar.f65357d) && this.f65358e == eVar.f65358e;
        }

        @m80.k
        public final e f(@m80.k k3 bookBookModel, @m80.k b3 learnModel, @m80.k b3 reviewModel, @m80.l k3.d dVar, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(learnModel, "learnModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            return new e(bookBookModel, learnModel, reviewModel, dVar, z11);
        }

        @m80.l
        public final k3.d h() {
            return this.f65357d;
        }

        public int hashCode() {
            int hashCode = ((((this.f65354a.hashCode() * 31) + this.f65355b.hashCode()) * 31) + this.f65356c.hashCode()) * 31;
            k3.d dVar = this.f65357d;
            return ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.f65358e);
        }

        @m80.k
        public final k3 i() {
            return this.f65354a;
        }

        public final boolean j() {
            return this.f65358e;
        }

        @m80.k
        public final b3 k() {
            return this.f65355b;
        }

        @m80.k
        public final b3 l() {
            return this.f65356c;
        }

        @m80.k
        public String toString() {
            return "LearningModel(bookBookModel=" + this.f65354a + ", learnModel=" + this.f65355b + ", reviewModel=" + this.f65356c + ", adModel=" + this.f65357d + ", finishToday=" + this.f65358e + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Object f65359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k Object nothing) {
            super(null);
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            this.f65359a = nothing;
        }

        private final Object a() {
            return this.f65359a;
        }

        public static /* synthetic */ f c(f fVar, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = fVar.f65359a;
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
            return (obj instanceof f) && kotlin.jvm.internal.g0.g(this.f65359a, ((f) obj).f65359a);
        }

        public int hashCode() {
            return this.f65359a.hashCode();
        }

        @m80.k
        public String toString() {
            return "NeedUpgrade(nothing=" + this.f65359a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f65360a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k String msg) {
            super(null);
            kotlin.jvm.internal.g0.p(msg, "msg");
            this.f65360a = msg;
        }

        public static /* synthetic */ g c(g gVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gVar.f65360a;
            }
            return gVar.b(str);
        }

        @m80.k
        public final String a() {
            return this.f65360a;
        }

        @m80.k
        public final g b(@m80.k String msg) {
            kotlin.jvm.internal.g0.p(msg, "msg");
            return new g(msg);
        }

        @m80.k
        public final String d() {
            return this.f65360a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.g0.g(this.f65360a, ((g) obj).f65360a);
        }

        public int hashCode() {
            return this.f65360a.hashCode();
        }

        @m80.k
        public String toString() {
            return "NotSupport(msg=" + this.f65360a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Object f65361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k Object nothing) {
            super(null);
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            this.f65361a = nothing;
        }

        private final Object a() {
            return this.f65361a;
        }

        public static /* synthetic */ h c(h hVar, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = hVar.f65361a;
            }
            return hVar.b(obj);
        }

        @m80.k
        public final h b(@m80.k Object nothing) {
            kotlin.jvm.internal.g0.p(nothing, "nothing");
            return new h(nothing);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.g0.g(this.f65361a, ((h) obj).f65361a);
        }

        public int hashCode() {
            return this.f65361a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Refreshing(nothing=" + this.f65361a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k3.i$i, reason: collision with other inner class name */
    public static final class C0755i extends i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final k3 f65362a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final b3 f65363b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final k3.d f65364c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f65365d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0755i(@m80.k k3 bookBookModel, @m80.k b3 reviewModel, @m80.l k3.d dVar, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            this.f65362a = bookBookModel;
            this.f65363b = reviewModel;
            this.f65364c = dVar;
            this.f65365d = z11;
        }

        public static /* synthetic */ C0755i f(C0755i c0755i, k3 k3Var, b3 b3Var, k3.d dVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                k3Var = c0755i.f65362a;
            }
            if ((i11 & 2) != 0) {
                b3Var = c0755i.f65363b;
            }
            if ((i11 & 4) != 0) {
                dVar = c0755i.f65364c;
            }
            if ((i11 & 8) != 0) {
                z11 = c0755i.f65365d;
            }
            return c0755i.e(k3Var, b3Var, dVar, z11);
        }

        @m80.k
        public final k3 a() {
            return this.f65362a;
        }

        @m80.k
        public final b3 b() {
            return this.f65363b;
        }

        @m80.l
        public final k3.d c() {
            return this.f65364c;
        }

        public final boolean d() {
            return this.f65365d;
        }

        @m80.k
        public final C0755i e(@m80.k k3 bookBookModel, @m80.k b3 reviewModel, @m80.l k3.d dVar, boolean z11) {
            kotlin.jvm.internal.g0.p(bookBookModel, "bookBookModel");
            kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
            return new C0755i(bookBookModel, reviewModel, dVar, z11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0755i)) {
                return false;
            }
            C0755i c0755i = (C0755i) obj;
            return kotlin.jvm.internal.g0.g(this.f65362a, c0755i.f65362a) && kotlin.jvm.internal.g0.g(this.f65363b, c0755i.f65363b) && kotlin.jvm.internal.g0.g(this.f65364c, c0755i.f65364c) && this.f65365d == c0755i.f65365d;
        }

        @m80.l
        public final k3.d g() {
            return this.f65364c;
        }

        @m80.k
        public final k3 h() {
            return this.f65362a;
        }

        public int hashCode() {
            int hashCode = ((this.f65362a.hashCode() * 31) + this.f65363b.hashCode()) * 31;
            k3.d dVar = this.f65364c;
            return ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.f65365d);
        }

        public final boolean i() {
            return this.f65365d;
        }

        @m80.k
        public final b3 j() {
            return this.f65363b;
        }

        @m80.k
        public String toString() {
            return "ReviewModel(bookBookModel=" + this.f65362a + ", reviewModel=" + this.f65363b + ", adModel=" + this.f65364c + ", finishToday=" + this.f65365d + ')';
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.v vVar) {
        this();
    }

    public i() {
    }
}
