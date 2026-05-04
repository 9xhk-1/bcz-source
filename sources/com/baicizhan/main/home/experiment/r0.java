package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21415a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends r0 {

        /* renamed from: g, reason: collision with root package name */
        public static final int f21416g = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final String f21417b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f21418c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f21419d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f21420e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f21421f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.l String str, @m80.k String link, @m80.k String id2, @m80.k String title, @m80.k String content) {
            super(null);
            kotlin.jvm.internal.g0.p(link, "link");
            kotlin.jvm.internal.g0.p(id2, "id");
            kotlin.jvm.internal.g0.p(title, "title");
            kotlin.jvm.internal.g0.p(content, "content");
            this.f21417b = str;
            this.f21418c = link;
            this.f21419d = id2;
            this.f21420e = title;
            this.f21421f = content;
        }

        public static /* synthetic */ a g(a aVar, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f21417b;
            }
            if ((i11 & 2) != 0) {
                str2 = aVar.f21418c;
            }
            if ((i11 & 4) != 0) {
                str3 = aVar.f21419d;
            }
            if ((i11 & 8) != 0) {
                str4 = aVar.f21420e;
            }
            if ((i11 & 16) != 0) {
                str5 = aVar.f21421f;
            }
            String str6 = str5;
            String str7 = str3;
            return aVar.f(str, str2, str7, str4, str6);
        }

        @m80.l
        public final String a() {
            return this.f21417b;
        }

        @m80.k
        public final String b() {
            return this.f21418c;
        }

        @m80.k
        public final String c() {
            return this.f21419d;
        }

        @m80.k
        public final String d() {
            return this.f21420e;
        }

        @m80.k
        public final String e() {
            return this.f21421f;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f21417b, aVar.f21417b) && kotlin.jvm.internal.g0.g(this.f21418c, aVar.f21418c) && kotlin.jvm.internal.g0.g(this.f21419d, aVar.f21419d) && kotlin.jvm.internal.g0.g(this.f21420e, aVar.f21420e) && kotlin.jvm.internal.g0.g(this.f21421f, aVar.f21421f);
        }

        @m80.k
        public final a f(@m80.l String str, @m80.k String link, @m80.k String id2, @m80.k String title, @m80.k String content) {
            kotlin.jvm.internal.g0.p(link, "link");
            kotlin.jvm.internal.g0.p(id2, "id");
            kotlin.jvm.internal.g0.p(title, "title");
            kotlin.jvm.internal.g0.p(content, "content");
            return new a(str, link, id2, title, content);
        }

        @m80.k
        public final String h() {
            return this.f21421f;
        }

        public int hashCode() {
            String str = this.f21417b;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.f21418c.hashCode()) * 31) + this.f21419d.hashCode()) * 31) + this.f21420e.hashCode()) * 31) + this.f21421f.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f21419d;
        }

        @m80.l
        public final String j() {
            return this.f21417b;
        }

        @m80.k
        public final String k() {
            return this.f21418c;
        }

        @m80.k
        public final String l() {
            return this.f21420e;
        }

        @m80.k
        public String toString() {
            return "DropAd(img=" + this.f21417b + ", link=" + this.f21418c + ", id=" + this.f21419d + ", title=" + this.f21420e + ", content=" + this.f21421f + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends r0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final b f21422b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f21423c = 0;

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends r0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final c f21424b = new c();

        /* renamed from: c, reason: collision with root package name */
        public static final int f21425c = 0;

        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class d extends r0 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f21426e = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f21427b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f21428c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f21429d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k String img, @m80.k String link, @m80.k String id2) {
            super(null);
            kotlin.jvm.internal.g0.p(img, "img");
            kotlin.jvm.internal.g0.p(link, "link");
            kotlin.jvm.internal.g0.p(id2, "id");
            this.f21427b = img;
            this.f21428c = link;
            this.f21429d = id2;
        }

        public static /* synthetic */ d e(d dVar, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dVar.f21427b;
            }
            if ((i11 & 2) != 0) {
                str2 = dVar.f21428c;
            }
            if ((i11 & 4) != 0) {
                str3 = dVar.f21429d;
            }
            return dVar.d(str, str2, str3);
        }

        @m80.k
        public final String a() {
            return this.f21427b;
        }

        @m80.k
        public final String b() {
            return this.f21428c;
        }

        @m80.k
        public final String c() {
            return this.f21429d;
        }

        @m80.k
        public final d d(@m80.k String img, @m80.k String link, @m80.k String id2) {
            kotlin.jvm.internal.g0.p(img, "img");
            kotlin.jvm.internal.g0.p(link, "link");
            kotlin.jvm.internal.g0.p(id2, "id");
            return new d(img, link, id2);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.g0.g(this.f21427b, dVar.f21427b) && kotlin.jvm.internal.g0.g(this.f21428c, dVar.f21428c) && kotlin.jvm.internal.g0.g(this.f21429d, dVar.f21429d);
        }

        @m80.k
        public final String f() {
            return this.f21429d;
        }

        @m80.k
        public final String g() {
            return this.f21427b;
        }

        @m80.k
        public final String h() {
            return this.f21428c;
        }

        public int hashCode() {
            return (((this.f21427b.hashCode() * 31) + this.f21428c.hashCode()) * 31) + this.f21429d.hashCode();
        }

        @m80.k
        public String toString() {
            return "PopAd(img=" + this.f21427b + ", link=" + this.f21428c + ", id=" + this.f21429d + pn.j.f81007d;
        }
    }

    public /* synthetic */ r0(kotlin.jvm.internal.v vVar) {
        this();
    }

    public r0() {
    }
}
