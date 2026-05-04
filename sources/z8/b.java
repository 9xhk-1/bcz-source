package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f101164h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, C1386b> f101165i = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101166a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101167b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101168c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101169d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101170e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101171f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final boolean f101172g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C1386b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new C1386b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k C1386b builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return builder.build();
                }
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readBool());
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("BookReplaceInfo");
            protocol.Q6("old_book_id", 1, (byte) 8);
            protocol.l5(struct.f101166a);
            protocol.N2();
            protocol.Q6("new_book_id", 2, (byte) 8);
            protocol.l5(struct.f101167b);
            protocol.N2();
            protocol.Q6("main_page_popup_title", 3, (byte) 11);
            protocol.p1(struct.f101168c);
            protocol.N2();
            protocol.Q6("main_page_popup_content", 4, (byte) 11);
            protocol.p1(struct.f101169d);
            protocol.N2();
            protocol.Q6("main_page_popup_ok_text", 5, (byte) 11);
            protocol.p1(struct.f101170e);
            protocol.N2();
            protocol.Q6("main_page_popup_cancel_text", 6, (byte) 11);
            protocol.p1(struct.f101171f);
            protocol.N2();
            protocol.Q6("force_update", 7, (byte) 2);
            protocol.a4(struct.f101172g);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public b(int i11, int i12, @m80.k String main_page_popup_title, @m80.k String main_page_popup_content, @m80.k String main_page_popup_ok_text, @m80.k String main_page_popup_cancel_text, boolean z11) {
        kotlin.jvm.internal.g0.p(main_page_popup_title, "main_page_popup_title");
        kotlin.jvm.internal.g0.p(main_page_popup_content, "main_page_popup_content");
        kotlin.jvm.internal.g0.p(main_page_popup_ok_text, "main_page_popup_ok_text");
        kotlin.jvm.internal.g0.p(main_page_popup_cancel_text, "main_page_popup_cancel_text");
        this.f101166a = i11;
        this.f101167b = i12;
        this.f101168c = main_page_popup_title;
        this.f101169d = main_page_popup_content;
        this.f101170e = main_page_popup_ok_text;
        this.f101171f = main_page_popup_cancel_text;
        this.f101172g = z11;
    }

    public static /* synthetic */ b i(b bVar, int i11, int i12, String str, String str2, String str3, String str4, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f101166a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f101167b;
        }
        if ((i13 & 4) != 0) {
            str = bVar.f101168c;
        }
        if ((i13 & 8) != 0) {
            str2 = bVar.f101169d;
        }
        if ((i13 & 16) != 0) {
            str3 = bVar.f101170e;
        }
        if ((i13 & 32) != 0) {
            str4 = bVar.f101171f;
        }
        if ((i13 & 64) != 0) {
            z11 = bVar.f101172g;
        }
        String str5 = str4;
        boolean z12 = z11;
        String str6 = str3;
        String str7 = str;
        return bVar.h(i11, i12, str7, str2, str6, str5, z12);
    }

    public final int a() {
        return this.f101166a;
    }

    public final int b() {
        return this.f101167b;
    }

    @m80.k
    public final String c() {
        return this.f101168c;
    }

    @m80.k
    public final String d() {
        return this.f101169d;
    }

    @m80.k
    public final String e() {
        return this.f101170e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f101166a == bVar.f101166a && this.f101167b == bVar.f101167b && kotlin.jvm.internal.g0.g(this.f101168c, bVar.f101168c) && kotlin.jvm.internal.g0.g(this.f101169d, bVar.f101169d) && kotlin.jvm.internal.g0.g(this.f101170e, bVar.f101170e) && kotlin.jvm.internal.g0.g(this.f101171f, bVar.f101171f) && this.f101172g == bVar.f101172g;
    }

    @m80.k
    public final String f() {
        return this.f101171f;
    }

    public final boolean g() {
        return this.f101172g;
    }

    @m80.k
    public final b h(int i11, int i12, @m80.k String main_page_popup_title, @m80.k String main_page_popup_content, @m80.k String main_page_popup_ok_text, @m80.k String main_page_popup_cancel_text, boolean z11) {
        kotlin.jvm.internal.g0.p(main_page_popup_title, "main_page_popup_title");
        kotlin.jvm.internal.g0.p(main_page_popup_content, "main_page_popup_content");
        kotlin.jvm.internal.g0.p(main_page_popup_ok_text, "main_page_popup_ok_text");
        kotlin.jvm.internal.g0.p(main_page_popup_cancel_text, "main_page_popup_cancel_text");
        return new b(i11, i12, main_page_popup_title, main_page_popup_content, main_page_popup_ok_text, main_page_popup_cancel_text, z11);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f101166a) * 31) + Integer.hashCode(this.f101167b)) * 31) + this.f101168c.hashCode()) * 31) + this.f101169d.hashCode()) * 31) + this.f101170e.hashCode()) * 31) + this.f101171f.hashCode()) * 31) + Boolean.hashCode(this.f101172g);
    }

    @m80.k
    public String toString() {
        return "BookReplaceInfo(old_book_id=" + this.f101166a + ", new_book_id=" + this.f101167b + ", main_page_popup_title=" + this.f101168c + ", main_page_popup_content=" + this.f101169d + ", main_page_popup_ok_text=" + this.f101170e + ", main_page_popup_cancel_text=" + this.f101171f + ", force_update=" + this.f101172g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101165i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBookReplaceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookReplaceInfo.kt\ncom/baicizhan/biz/online/user_study_api/BookReplaceInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
    /* renamed from: z8.b$b, reason: collision with other inner class name */
    public static final class C1386b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101173a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101174b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101175c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101176d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101177e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101178f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Boolean f101179g;

        public C1386b() {
            this.f101173a = null;
            this.f101174b = null;
            this.f101175c = null;
            this.f101176d = null;
            this.f101177e = null;
            this.f101178f = null;
            this.f101179g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            Integer num = this.f101173a;
            if (num == null) {
                throw new IllegalStateException("Required field 'old_book_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101174b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'new_book_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f101175c;
            if (str == null) {
                throw new IllegalStateException("Required field 'main_page_popup_title' is missing");
            }
            String str2 = this.f101176d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'main_page_popup_content' is missing");
            }
            String str3 = this.f101177e;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'main_page_popup_ok_text' is missing");
            }
            String str4 = this.f101178f;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'main_page_popup_cancel_text' is missing");
            }
            Boolean bool = this.f101179g;
            if (bool != null) {
                return new b(intValue, intValue2, str, str2, str3, str4, bool.booleanValue());
            }
            throw new IllegalStateException("Required field 'force_update' is missing");
        }

        @m80.k
        public final C1386b b(boolean z11) {
            this.f101179g = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final C1386b c(@m80.k String main_page_popup_cancel_text) {
            kotlin.jvm.internal.g0.p(main_page_popup_cancel_text, "main_page_popup_cancel_text");
            this.f101178f = main_page_popup_cancel_text;
            return this;
        }

        @m80.k
        public final C1386b d(@m80.k String main_page_popup_content) {
            kotlin.jvm.internal.g0.p(main_page_popup_content, "main_page_popup_content");
            this.f101176d = main_page_popup_content;
            return this;
        }

        @m80.k
        public final C1386b e(@m80.k String main_page_popup_ok_text) {
            kotlin.jvm.internal.g0.p(main_page_popup_ok_text, "main_page_popup_ok_text");
            this.f101177e = main_page_popup_ok_text;
            return this;
        }

        @m80.k
        public final C1386b f(@m80.k String main_page_popup_title) {
            kotlin.jvm.internal.g0.p(main_page_popup_title, "main_page_popup_title");
            this.f101175c = main_page_popup_title;
            return this;
        }

        @m80.k
        public final C1386b g(int i11) {
            this.f101174b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final C1386b h(int i11) {
            this.f101173a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101173a = null;
            this.f101174b = null;
            this.f101175c = null;
            this.f101176d = null;
            this.f101177e = null;
            this.f101178f = null;
            this.f101179g = null;
        }

        public C1386b(@m80.k b source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101173a = Integer.valueOf(source.f101166a);
            this.f101174b = Integer.valueOf(source.f101167b);
            this.f101175c = source.f101168c;
            this.f101176d = source.f101169d;
            this.f101177e = source.f101170e;
            this.f101178f = source.f101171f;
            this.f101179g = Boolean.valueOf(source.f101172g);
        }
    }
}
