package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class z {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a extends z {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: l3.z$a$a, reason: collision with other inner class name */
        public static final class C0838a extends a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final String f69742a;

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final String f69743b;

            /* renamed from: c, reason: collision with root package name */
            public final long f69744c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0838a(@m80.k String imgUrl, @m80.k String displayName, long j11) {
                super(null);
                kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
                kotlin.jvm.internal.g0.p(displayName, "displayName");
                this.f69742a = imgUrl;
                this.f69743b = displayName;
                this.f69744c = j11;
            }

            public static /* synthetic */ C0838a g(C0838a c0838a, String str, String str2, long j11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = c0838a.f69742a;
                }
                if ((i11 & 2) != 0) {
                    str2 = c0838a.f69743b;
                }
                if ((i11 & 4) != 0) {
                    j11 = c0838a.f69744c;
                }
                return c0838a.f(str, str2, j11);
            }

            @Override // l3.z.a
            @m80.k
            public String a() {
                return this.f69743b;
            }

            @Override // l3.z.a
            @m80.k
            public String b() {
                return this.f69742a;
            }

            @m80.k
            public final String c() {
                return this.f69742a;
            }

            @m80.k
            public final String d() {
                return this.f69743b;
            }

            public final long e() {
                return this.f69744c;
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0838a)) {
                    return false;
                }
                C0838a c0838a = (C0838a) obj;
                return kotlin.jvm.internal.g0.g(this.f69742a, c0838a.f69742a) && kotlin.jvm.internal.g0.g(this.f69743b, c0838a.f69743b) && this.f69744c == c0838a.f69744c;
            }

            @m80.k
            public final C0838a f(@m80.k String imgUrl, @m80.k String displayName, long j11) {
                kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
                kotlin.jvm.internal.g0.p(displayName, "displayName");
                return new C0838a(imgUrl, displayName, j11);
            }

            public final long h() {
                return this.f69744c;
            }

            public int hashCode() {
                return (((this.f69742a.hashCode() * 31) + this.f69743b.hashCode()) * 31) + Long.hashCode(this.f69744c);
            }

            @m80.k
            public String toString() {
                return "Active(imgUrl=" + this.f69742a + ", displayName=" + this.f69743b + ", endTime=" + this.f69744c + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final String f69745a;

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final String f69746b;

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public final g2 f69747c;

            /* renamed from: d, reason: collision with root package name */
            @m80.k
            public final String f69748d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@m80.k String imgUrl, @m80.k String displayName, @m80.k g2 enter, @m80.k String dialogImg) {
                super(null);
                kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
                kotlin.jvm.internal.g0.p(displayName, "displayName");
                kotlin.jvm.internal.g0.p(enter, "enter");
                kotlin.jvm.internal.g0.p(dialogImg, "dialogImg");
                this.f69745a = imgUrl;
                this.f69746b = displayName;
                this.f69747c = enter;
                this.f69748d = dialogImg;
            }

            public static /* synthetic */ b h(b bVar, String str, String str2, g2 g2Var, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bVar.f69745a;
                }
                if ((i11 & 2) != 0) {
                    str2 = bVar.f69746b;
                }
                if ((i11 & 4) != 0) {
                    g2Var = bVar.f69747c;
                }
                if ((i11 & 8) != 0) {
                    str3 = bVar.f69748d;
                }
                return bVar.g(str, str2, g2Var, str3);
            }

            @Override // l3.z.a
            @m80.k
            public String a() {
                return this.f69746b;
            }

            @Override // l3.z.a
            @m80.k
            public String b() {
                return this.f69745a;
            }

            @m80.k
            public final String c() {
                return this.f69745a;
            }

            @m80.k
            public final String d() {
                return this.f69746b;
            }

            @m80.k
            public final g2 e() {
                return this.f69747c;
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.g0.g(this.f69745a, bVar.f69745a) && kotlin.jvm.internal.g0.g(this.f69746b, bVar.f69746b) && kotlin.jvm.internal.g0.g(this.f69747c, bVar.f69747c) && kotlin.jvm.internal.g0.g(this.f69748d, bVar.f69748d);
            }

            @m80.k
            public final String f() {
                return this.f69748d;
            }

            @m80.k
            public final b g(@m80.k String imgUrl, @m80.k String displayName, @m80.k g2 enter, @m80.k String dialogImg) {
                kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
                kotlin.jvm.internal.g0.p(displayName, "displayName");
                kotlin.jvm.internal.g0.p(enter, "enter");
                kotlin.jvm.internal.g0.p(dialogImg, "dialogImg");
                return new b(imgUrl, displayName, enter, dialogImg);
            }

            public int hashCode() {
                return (((((this.f69745a.hashCode() * 31) + this.f69746b.hashCode()) * 31) + this.f69747c.hashCode()) * 31) + this.f69748d.hashCode();
            }

            @m80.k
            public final String i() {
                return this.f69748d;
            }

            @m80.k
            public final g2 j() {
                return this.f69747c;
            }

            @m80.k
            public String toString() {
                return "Ready(imgUrl=" + this.f69745a + ", displayName=" + this.f69746b + ", enter=" + this.f69747c + ", dialogImg=" + this.f69748d + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final String f69749a;

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final String f69750b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f69751c;

            /* renamed from: d, reason: collision with root package name */
            public final long f69752d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@m80.k String imgUrl, @m80.k String displayName, boolean z11, long j11) {
                super(null);
                kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
                kotlin.jvm.internal.g0.p(displayName, "displayName");
                this.f69749a = imgUrl;
                this.f69750b = displayName;
                this.f69751c = z11;
                this.f69752d = j11;
            }

            public static /* synthetic */ c h(c cVar, String str, String str2, boolean z11, long j11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = cVar.f69749a;
                }
                if ((i11 & 2) != 0) {
                    str2 = cVar.f69750b;
                }
                if ((i11 & 4) != 0) {
                    z11 = cVar.f69751c;
                }
                if ((i11 & 8) != 0) {
                    j11 = cVar.f69752d;
                }
                boolean z12 = z11;
                return cVar.g(str, str2, z12, j11);
            }

            @Override // l3.z.a
            @m80.k
            public String a() {
                return this.f69750b;
            }

            @Override // l3.z.a
            @m80.k
            public String b() {
                return this.f69749a;
            }

            @m80.k
            public final String c() {
                return this.f69749a;
            }

            @m80.k
            public final String d() {
                return this.f69750b;
            }

            public final boolean e() {
                return this.f69751c;
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.g0.g(this.f69749a, cVar.f69749a) && kotlin.jvm.internal.g0.g(this.f69750b, cVar.f69750b) && this.f69751c == cVar.f69751c && this.f69752d == cVar.f69752d;
            }

            public final long f() {
                return this.f69752d;
            }

            @m80.k
            public final c g(@m80.k String imgUrl, @m80.k String displayName, boolean z11, long j11) {
                kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
                kotlin.jvm.internal.g0.p(displayName, "displayName");
                return new c(imgUrl, displayName, z11, j11);
            }

            public int hashCode() {
                return (((((this.f69749a.hashCode() * 31) + this.f69750b.hashCode()) * 31) + Boolean.hashCode(this.f69751c)) * 31) + Long.hashCode(this.f69752d);
            }

            public final long i() {
                return this.f69752d;
            }

            public final boolean j() {
                return this.f69751c;
            }

            @m80.k
            public String toString() {
                return "Settled(imgUrl=" + this.f69749a + ", displayName=" + this.f69750b + ", hasClaim=" + this.f69751c + ", endTime=" + this.f69752d + ')';
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public abstract String a();

        @m80.k
        public abstract String b();

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends z {

        /* renamed from: a, reason: collision with root package name */
        public final int f69753a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69754b;

        /* renamed from: c, reason: collision with root package name */
        public final long f69755c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, @m80.k String iconUrl, long j11) {
            super(null);
            kotlin.jvm.internal.g0.p(iconUrl, "iconUrl");
            this.f69753a = i11;
            this.f69754b = iconUrl;
            this.f69755c = j11;
        }

        public static /* synthetic */ b e(b bVar, int i11, String str, long j11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f69753a;
            }
            if ((i12 & 2) != 0) {
                str = bVar.f69754b;
            }
            if ((i12 & 4) != 0) {
                j11 = bVar.f69755c;
            }
            return bVar.d(i11, str, j11);
        }

        public final int a() {
            return this.f69753a;
        }

        @m80.k
        public final String b() {
            return this.f69754b;
        }

        public final long c() {
            return this.f69755c;
        }

        @m80.k
        public final b d(int i11, @m80.k String iconUrl, long j11) {
            kotlin.jvm.internal.g0.p(iconUrl, "iconUrl");
            return new b(i11, iconUrl, j11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f69753a == bVar.f69753a && kotlin.jvm.internal.g0.g(this.f69754b, bVar.f69754b) && this.f69755c == bVar.f69755c;
        }

        public final long f() {
            return this.f69755c;
        }

        @m80.k
        public final String g() {
            return this.f69754b;
        }

        public final int h() {
            return this.f69753a;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f69753a) * 31) + this.f69754b.hashCode()) * 31) + Long.hashCode(this.f69755c);
        }

        @m80.k
        public String toString() {
            return "Membership(reportId=" + this.f69753a + ", iconUrl=" + this.f69754b + ", endTime=" + this.f69755c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends z {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final p f69756a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69757b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k p iconState, @m80.k g2 enter) {
            super(null);
            kotlin.jvm.internal.g0.p(iconState, "iconState");
            kotlin.jvm.internal.g0.p(enter, "enter");
            this.f69756a = iconState;
            this.f69757b = enter;
        }

        public static /* synthetic */ c d(c cVar, p pVar, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pVar = cVar.f69756a;
            }
            if ((i11 & 2) != 0) {
                g2Var = cVar.f69757b;
            }
            return cVar.c(pVar, g2Var);
        }

        @m80.k
        public final p a() {
            return this.f69756a;
        }

        @m80.k
        public final g2 b() {
            return this.f69757b;
        }

        @m80.k
        public final c c(@m80.k p iconState, @m80.k g2 enter) {
            kotlin.jvm.internal.g0.p(iconState, "iconState");
            kotlin.jvm.internal.g0.p(enter, "enter");
            return new c(iconState, enter);
        }

        @m80.k
        public final g2 e() {
            return this.f69757b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f69756a, cVar.f69756a) && kotlin.jvm.internal.g0.g(this.f69757b, cVar.f69757b);
        }

        @m80.k
        public final p f() {
            return this.f69756a;
        }

        public int hashCode() {
            return (this.f69756a.hashCode() * 31) + this.f69757b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Ranking(iconState=" + this.f69756a + ", enter=" + this.f69757b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends z {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final p f69758a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final g2 f69759b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k p iconState, @m80.k g2 enter) {
            super(null);
            kotlin.jvm.internal.g0.p(iconState, "iconState");
            kotlin.jvm.internal.g0.p(enter, "enter");
            this.f69758a = iconState;
            this.f69759b = enter;
        }

        public static /* synthetic */ d d(d dVar, p pVar, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pVar = dVar.f69758a;
            }
            if ((i11 & 2) != 0) {
                g2Var = dVar.f69759b;
            }
            return dVar.c(pVar, g2Var);
        }

        @m80.k
        public final p a() {
            return this.f69758a;
        }

        @m80.k
        public final g2 b() {
            return this.f69759b;
        }

        @m80.k
        public final d c(@m80.k p iconState, @m80.k g2 enter) {
            kotlin.jvm.internal.g0.p(iconState, "iconState");
            kotlin.jvm.internal.g0.p(enter, "enter");
            return new d(iconState, enter);
        }

        @m80.k
        public final g2 e() {
            return this.f69759b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.g0.g(this.f69758a, dVar.f69758a) && kotlin.jvm.internal.g0.g(this.f69759b, dVar.f69759b);
        }

        @m80.k
        public final p f() {
            return this.f69758a;
        }

        public int hashCode() {
            return (this.f69758a.hashCode() * 31) + this.f69759b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Task(iconState=" + this.f69758a + ", enter=" + this.f69759b + ')';
        }
    }

    public /* synthetic */ z(kotlin.jvm.internal.v vVar) {
        this();
    }

    public z() {
    }
}
