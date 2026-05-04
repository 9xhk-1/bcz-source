package com.baicizhan.main.home.plan.newexam;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22564a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: com.baicizhan.main.home.plan.newexam.a$a, reason: collision with other inner class name */
    public static final class C0312a extends a {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final C0312a f22565b = new C0312a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f22566c = 0;

        public C0312a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22567c = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String link) {
            super(null);
            kotlin.jvm.internal.g0.p(link, "link");
            this.f22568b = link;
        }

        public static /* synthetic */ b c(b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f22568b;
            }
            return bVar.b(str);
        }

        @m80.k
        public final String a() {
            return this.f22568b;
        }

        @m80.k
        public final b b(@m80.k String link) {
            kotlin.jvm.internal.g0.p(link, "link");
            return new b(link);
        }

        @m80.k
        public final String d() {
            return this.f22568b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f22568b, ((b) obj).f22568b);
        }

        public int hashCode() {
            return this.f22568b.hashCode();
        }

        @m80.k
        public String toString() {
            return "GoStudy(link=" + this.f22568b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        public static final int f22569d = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final String f22570b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final String f22571c;

        public c(@m80.l String str, @m80.l String str2) {
            super(null);
            this.f22570b = str;
            this.f22571c = str2;
        }

        public static /* synthetic */ c d(c cVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cVar.f22570b;
            }
            if ((i11 & 2) != 0) {
                str2 = cVar.f22571c;
            }
            return cVar.c(str, str2);
        }

        @m80.l
        public final String a() {
            return this.f22570b;
        }

        @m80.l
        public final String b() {
            return this.f22571c;
        }

        @m80.k
        public final c c(@m80.l String str, @m80.l String str2) {
            return new c(str, str2);
        }

        @m80.l
        public final String e() {
            return this.f22571c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f22570b, cVar.f22570b) && kotlin.jvm.internal.g0.g(this.f22571c, cVar.f22571c);
        }

        @m80.l
        public final String f() {
            return this.f22570b;
        }

        public int hashCode() {
            String str = this.f22570b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f22571c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @m80.k
        public String toString() {
            return "HintDialog(title=" + this.f22570b + ", content=" + this.f22571c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class d extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22572c = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f22573b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k String link) {
            super(null);
            kotlin.jvm.internal.g0.p(link, "link");
            this.f22573b = link;
        }

        public static /* synthetic */ d c(d dVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dVar.f22573b;
            }
            return dVar.b(str);
        }

        @m80.k
        public final String a() {
            return this.f22573b;
        }

        @m80.k
        public final d b(@m80.k String link) {
            kotlin.jvm.internal.g0.p(link, "link");
            return new d(link);
        }

        @m80.k
        public final String d() {
            return this.f22573b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.g0.g(this.f22573b, ((d) obj).f22573b);
        }

        public int hashCode() {
            return this.f22573b.hashCode();
        }

        @m80.k
        public String toString() {
            return "WantMore(link=" + this.f22573b + pn.j.f81007d;
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
        this();
    }

    public a() {
    }
}
