package u30;

import com.bumptech.glide.load.engine.GlideException;
import yz.g2;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "2.2")
@j2(markerClass = {kotlin.c.class})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f91627d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final i f91628e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final i f91629f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91630a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b f91631b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d f91632c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f91633a = i.f91627d.a().e();

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public b.a f91634b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public d.a f91635c;

        @yz.v0
        public a() {
        }

        @yz.v0
        @m80.k
        public final i a() {
            b a11;
            d a12;
            boolean z11 = this.f91633a;
            b.a aVar = this.f91634b;
            if (aVar == null || (a11 = aVar.a()) == null) {
                a11 = b.f91636j.a();
            }
            d.a aVar2 = this.f91635c;
            if (aVar2 == null || (a12 = aVar2.a()) == null) {
                a12 = d.f91653h.a();
            }
            return new i(z11, a11, a12);
        }

        @o00.f
        public final void b(x00.l<? super b.a, g2> builderAction) {
            kotlin.jvm.internal.g0.p(builderAction, "builderAction");
            builderAction.invoke(c());
        }

        @m80.k
        public final b.a c() {
            if (this.f91634b == null) {
                this.f91634b = new b.a();
            }
            b.a aVar = this.f91634b;
            kotlin.jvm.internal.g0.m(aVar);
            return aVar;
        }

        @m80.k
        public final d.a d() {
            if (this.f91635c == null) {
                this.f91635c = new d.a();
            }
            d.a aVar = this.f91635c;
            kotlin.jvm.internal.g0.m(aVar);
            return aVar;
        }

        public final boolean e() {
            return this.f91633a;
        }

        @o00.f
        public final void f(x00.l<? super d.a, g2> builderAction) {
            kotlin.jvm.internal.g0.p(builderAction, "builderAction");
            builderAction.invoke(d());
        }

        public final void g(boolean z11) {
            this.f91633a = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final C1221b f91636j = new C1221b(null);

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public static final b f91637k = new b(Integer.MAX_VALUE, Integer.MAX_VALUE, GlideException.a.f28776d, "", "", "");

        /* renamed from: a, reason: collision with root package name */
        public final int f91638a;

        /* renamed from: b, reason: collision with root package name */
        public final int f91639b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f91640c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f91641d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f91642e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f91643f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f91644g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f91645h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f91646i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public int f91647a;

            /* renamed from: b, reason: collision with root package name */
            public int f91648b;

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public String f91649c;

            /* renamed from: d, reason: collision with root package name */
            @m80.k
            public String f91650d;

            /* renamed from: e, reason: collision with root package name */
            @m80.k
            public String f91651e;

            /* renamed from: f, reason: collision with root package name */
            @m80.k
            public String f91652f;

            public a() {
                C1221b c1221b = b.f91636j;
                this.f91647a = c1221b.a().g();
                this.f91648b = c1221b.a().f();
                this.f91649c = c1221b.a().h();
                this.f91650d = c1221b.a().d();
                this.f91651e = c1221b.a().c();
                this.f91652f = c1221b.a().e();
            }

            @m80.k
            public final b a() {
                return new b(this.f91647a, this.f91648b, this.f91649c, this.f91650d, this.f91651e, this.f91652f);
            }

            @m80.k
            public final String b() {
                return this.f91651e;
            }

            @m80.k
            public final String c() {
                return this.f91650d;
            }

            @m80.k
            public final String d() {
                return this.f91652f;
            }

            public final int e() {
                return this.f91648b;
            }

            public final int f() {
                return this.f91647a;
            }

            @m80.k
            public final String g() {
                return this.f91649c;
            }

            public final void h(@m80.k String value) {
                kotlin.jvm.internal.g0.p(value, "value");
                if (!k0.m3(value, '\n', false, 2, null) && !k0.m3(value, '\r', false, 2, null)) {
                    this.f91651e = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }

            public final void i(@m80.k String value) {
                kotlin.jvm.internal.g0.p(value, "value");
                if (!k0.m3(value, '\n', false, 2, null) && !k0.m3(value, '\r', false, 2, null)) {
                    this.f91650d = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }

            public final void j(@m80.k String value) {
                kotlin.jvm.internal.g0.p(value, "value");
                if (!k0.m3(value, '\n', false, 2, null) && !k0.m3(value, '\r', false, 2, null)) {
                    this.f91652f = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }

            public final void k(int i11) {
                if (i11 > 0) {
                    this.f91648b = i11;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i11);
            }

            public final void l(int i11) {
                if (i11 > 0) {
                    this.f91647a = i11;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i11);
            }

            public final void m(@m80.k String str) {
                kotlin.jvm.internal.g0.p(str, "<set-?>");
                this.f91649c = str;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: u30.i$b$b, reason: collision with other inner class name */
        public static final class C1221b {
            public /* synthetic */ C1221b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final b a() {
                return b.f91637k;
            }

            public C1221b() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (r4 != false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r4, int r5, @m80.k java.lang.String r6, @m80.k java.lang.String r7, @m80.k java.lang.String r8, @m80.k java.lang.String r9) {
            /*
                r3 = this;
                java.lang.String r0 = "groupSeparator"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "byteSeparator"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "bytePrefix"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "byteSuffix"
                kotlin.jvm.internal.g0.p(r9, r0)
                r3.<init>()
                r3.f91638a = r4
                r3.f91639b = r5
                r3.f91640c = r6
                r3.f91641d = r7
                r3.f91642e = r8
                r3.f91643f = r9
                r0 = 0
                r1 = 1
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r2) goto L2e
                if (r5 != r2) goto L2e
                r4 = r1
                goto L2f
            L2e:
                r4 = r0
            L2f:
                r3.f91644g = r4
                int r4 = r8.length()
                if (r4 != 0) goto L45
                int r4 = r9.length()
                if (r4 != 0) goto L45
                int r4 = r7.length()
                if (r4 > r1) goto L45
                r4 = r1
                goto L46
            L45:
                r4 = r0
            L46:
                r3.f91645h = r4
                boolean r4 = u30.j.b(r6)
                if (r4 != 0) goto L60
                boolean r4 = u30.j.b(r7)
                if (r4 != 0) goto L60
                boolean r4 = u30.j.b(r8)
                if (r4 != 0) goto L60
                boolean r4 = u30.j.b(r9)
                if (r4 == 0) goto L61
            L60:
                r0 = r1
            L61:
                r3.f91646i = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u30.i.b.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        @m80.k
        public final StringBuilder b(@m80.k StringBuilder sb2, @m80.k String indent) {
            kotlin.jvm.internal.g0.p(sb2, "sb");
            kotlin.jvm.internal.g0.p(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f91638a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f91639b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f91640c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f91641d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f91642e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f91643f);
            sb2.append("\"");
            return sb2;
        }

        @m80.k
        public final String c() {
            return this.f91642e;
        }

        @m80.k
        public final String d() {
            return this.f91641d;
        }

        @m80.k
        public final String e() {
            return this.f91643f;
        }

        public final int f() {
            return this.f91639b;
        }

        public final int g() {
            return this.f91638a;
        }

        @m80.k
        public final String h() {
            return this.f91640c;
        }

        public final boolean i() {
            return this.f91646i;
        }

        public final boolean j() {
            return this.f91644g;
        }

        public final boolean k() {
            return this.f91645h;
        }

        @m80.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final i a() {
            return i.f91628e;
        }

        @m80.k
        public final i b() {
            return i.f91629f;
        }

        public c() {
        }
    }

    static {
        b.C1221b c1221b = b.f91636j;
        b a11 = c1221b.a();
        d.b bVar = d.f91653h;
        f91628e = new i(false, a11, bVar.a());
        f91629f = new i(true, c1221b.a(), bVar.a());
    }

    public i(boolean z11, @m80.k b bytes, @m80.k d number) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        kotlin.jvm.internal.g0.p(number, "number");
        this.f91630a = z11;
        this.f91631b = bytes;
        this.f91632c = number;
    }

    @m80.k
    public final b c() {
        return this.f91631b;
    }

    @m80.k
    public final d d() {
        return this.f91632c;
    }

    public final boolean e() {
        return this.f91630a;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f91630a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f91631b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f91632c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public static final b f91653h = new b(null);

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public static final d f91654i = new d("", "", false, 1);

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f91655a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f91656b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f91657c;

        /* renamed from: d, reason: collision with root package name */
        public final int f91658d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f91659e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f91660f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f91661g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final d a() {
                return d.f91654i;
            }

            public b() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r3 != false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(@m80.k java.lang.String r3, @m80.k java.lang.String r4, boolean r5, int r6) {
            /*
                r2 = this;
                java.lang.String r0 = "prefix"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "suffix"
                kotlin.jvm.internal.g0.p(r4, r0)
                r2.<init>()
                r2.f91655a = r3
                r2.f91656b = r4
                r2.f91657c = r5
                r2.f91658d = r6
                int r5 = r3.length()
                r0 = 0
                r1 = 1
                if (r5 != 0) goto L25
                int r5 = r4.length()
                if (r5 != 0) goto L25
                r5 = r1
                goto L26
            L25:
                r5 = r0
            L26:
                r2.f91659e = r5
                if (r5 == 0) goto L2e
                if (r6 != r1) goto L2e
                r5 = r1
                goto L2f
            L2e:
                r5 = r0
            L2f:
                r2.f91660f = r5
                boolean r3 = u30.j.b(r3)
                if (r3 != 0) goto L3d
                boolean r3 = u30.j.b(r4)
                if (r3 == 0) goto L3e
            L3d:
                r0 = r1
            L3e:
                r2.f91661g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u30.i.d.<init>(java.lang.String, java.lang.String, boolean, int):void");
        }

        @m80.k
        public final StringBuilder b(@m80.k StringBuilder sb2, @m80.k String indent) {
            kotlin.jvm.internal.g0.p(sb2, "sb");
            kotlin.jvm.internal.g0.p(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f91655a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f91656b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f91657c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f91658d);
            return sb2;
        }

        public final boolean c() {
            return this.f91661g;
        }

        public final int d() {
            return this.f91658d;
        }

        @m80.k
        public final String f() {
            return this.f91655a;
        }

        public final boolean g() {
            return this.f91657c;
        }

        @m80.k
        public final String h() {
            return this.f91656b;
        }

        public final boolean i() {
            return this.f91659e;
        }

        public final boolean j() {
            return this.f91660f;
        }

        @m80.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormat$NumberHexFormat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,845:1\n1#2:846\n*E\n"})
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public String f91662a;

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public String f91663b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f91664c;

            /* renamed from: d, reason: collision with root package name */
            public int f91665d;

            public a() {
                b bVar = d.f91653h;
                this.f91662a = bVar.a().f();
                this.f91663b = bVar.a().h();
                this.f91664c = bVar.a().g();
                this.f91665d = bVar.a().d();
            }

            @m80.k
            public final d a() {
                return new d(this.f91662a, this.f91663b, this.f91664c, this.f91665d);
            }

            public final int b() {
                return this.f91665d;
            }

            @m80.k
            public final String d() {
                return this.f91662a;
            }

            public final boolean e() {
                return this.f91664c;
            }

            @m80.k
            public final String f() {
                return this.f91663b;
            }

            public final void g(int i11) {
                if (i11 > 0) {
                    this.f91665d = i11;
                    return;
                }
                throw new IllegalArgumentException(("Non-positive values are prohibited for minLength, but was " + i11).toString());
            }

            public final void h(@m80.k String value) {
                kotlin.jvm.internal.g0.p(value, "value");
                if (!k0.m3(value, '\n', false, 2, null) && !k0.m3(value, '\r', false, 2, null)) {
                    this.f91662a = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }

            public final void i(boolean z11) {
                this.f91664c = z11;
            }

            public final void j(@m80.k String value) {
                kotlin.jvm.internal.g0.p(value, "value");
                if (!k0.m3(value, '\n', false, 2, null) && !k0.m3(value, '\r', false, 2, null)) {
                    this.f91663b = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }

            @y0(version = "2.0")
            public static /* synthetic */ void c() {
            }
        }

        @y0(version = "2.0")
        public static /* synthetic */ void e() {
        }
    }
}
