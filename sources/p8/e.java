package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final c f79752i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, b> f79753j = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79754a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f79755b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79756c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f79757d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f79758e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f79759f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79760g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79761h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<e, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.a(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("BookInfo");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f79754a);
            protocol.N2();
            protocol.Q6("book_name", 2, (byte) 11);
            protocol.p1(struct.f79755b);
            protocol.N2();
            protocol.Q6("total_count", 3, (byte) 8);
            protocol.l5(struct.f79756c);
            protocol.N2();
            protocol.Q6("learned", 4, (byte) 8);
            protocol.l5(struct.f79757d);
            protocol.N2();
            protocol.Q6("mastered", 5, (byte) 8);
            protocol.l5(struct.f79758e);
            protocol.N2();
            if (struct.f79759f != null) {
                protocol.Q6("cover", 6, (byte) 11);
                protocol.p1(struct.f79759f);
                protocol.N2();
            }
            if (struct.f79760g != null) {
                protocol.Q6("status", 7, (byte) 8);
                protocol.l5(struct.f79760g.intValue());
                protocol.N2();
            }
            if (struct.f79761h != null) {
                protocol.Q6("remain_day", 8, (byte) 8);
                protocol.l5(struct.f79761h.intValue());
                protocol.N2();
            }
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

    public e(int i11, @m80.k String book_name, int i12, int i13, int i14, @m80.l String str, @m80.l Integer num, @m80.l Integer num2) {
        kotlin.jvm.internal.g0.p(book_name, "book_name");
        this.f79754a = i11;
        this.f79755b = book_name;
        this.f79756c = i12;
        this.f79757d = i13;
        this.f79758e = i14;
        this.f79759f = str;
        this.f79760g = num;
        this.f79761h = num2;
    }

    public static /* synthetic */ e j(e eVar, int i11, String str, int i12, int i13, int i14, String str2, Integer num, Integer num2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = eVar.f79754a;
        }
        if ((i15 & 2) != 0) {
            str = eVar.f79755b;
        }
        if ((i15 & 4) != 0) {
            i12 = eVar.f79756c;
        }
        if ((i15 & 8) != 0) {
            i13 = eVar.f79757d;
        }
        if ((i15 & 16) != 0) {
            i14 = eVar.f79758e;
        }
        if ((i15 & 32) != 0) {
            str2 = eVar.f79759f;
        }
        if ((i15 & 64) != 0) {
            num = eVar.f79760g;
        }
        if ((i15 & 128) != 0) {
            num2 = eVar.f79761h;
        }
        Integer num3 = num;
        Integer num4 = num2;
        int i16 = i14;
        String str3 = str2;
        return eVar.i(i11, str, i12, i13, i16, str3, num3, num4);
    }

    public final int a() {
        return this.f79754a;
    }

    @m80.k
    public final String b() {
        return this.f79755b;
    }

    public final int c() {
        return this.f79756c;
    }

    public final int d() {
        return this.f79757d;
    }

    public final int e() {
        return this.f79758e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f79754a == eVar.f79754a && kotlin.jvm.internal.g0.g(this.f79755b, eVar.f79755b) && this.f79756c == eVar.f79756c && this.f79757d == eVar.f79757d && this.f79758e == eVar.f79758e && kotlin.jvm.internal.g0.g(this.f79759f, eVar.f79759f) && kotlin.jvm.internal.g0.g(this.f79760g, eVar.f79760g) && kotlin.jvm.internal.g0.g(this.f79761h, eVar.f79761h);
    }

    @m80.l
    public final String f() {
        return this.f79759f;
    }

    @m80.l
    public final Integer g() {
        return this.f79760g;
    }

    @m80.l
    public final Integer h() {
        return this.f79761h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f79754a) * 31) + this.f79755b.hashCode()) * 31) + Integer.hashCode(this.f79756c)) * 31) + Integer.hashCode(this.f79757d)) * 31) + Integer.hashCode(this.f79758e)) * 31;
        String str = this.f79759f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f79760g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f79761h;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public final e i(int i11, @m80.k String book_name, int i12, int i13, int i14, @m80.l String str, @m80.l Integer num, @m80.l Integer num2) {
        kotlin.jvm.internal.g0.p(book_name, "book_name");
        return new e(i11, book_name, i12, i13, i14, str, num, num2);
    }

    @m80.k
    public String toString() {
        return "BookInfo(book_id=" + this.f79754a + ", book_name=" + this.f79755b + ", total_count=" + this.f79756c + ", learned=" + this.f79757d + ", mastered=" + this.f79758e + ", cover=" + this.f79759f + ", status=" + this.f79760g + ", remain_day=" + this.f79761h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79753j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBookInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookInfo.kt\ncom/baicizhan/biz/online/game_api/BookInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
    public static final class b implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79762a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f79763b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79764c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f79765d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f79766e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f79767f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f79768g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f79769h;

        public b() {
            this.f79762a = null;
            this.f79763b = null;
            this.f79764c = null;
            this.f79765d = null;
            this.f79766e = null;
            this.f79767f = null;
            this.f79768g = null;
            this.f79769h = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f79762a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b b(@m80.k String book_name) {
            kotlin.jvm.internal.g0.p(book_name, "book_name");
            this.f79763b = book_name;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f79762a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f79763b;
            if (str == null) {
                throw new IllegalStateException("Required field 'book_name' is missing");
            }
            Integer num2 = this.f79764c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'total_count' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f79765d;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'learned' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f79766e;
            if (num4 != null) {
                return new e(intValue, str, intValue2, intValue3, num4.intValue(), this.f79767f, this.f79768g, this.f79769h);
            }
            throw new IllegalStateException("Required field 'mastered' is missing");
        }

        @m80.k
        public final b d(@m80.l String str) {
            this.f79767f = str;
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f79765d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b f(int i11) {
            this.f79766e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b g(@m80.l Integer num) {
            this.f79769h = num;
            return this;
        }

        @m80.k
        public final b h(@m80.l Integer num) {
            this.f79768g = num;
            return this;
        }

        @m80.k
        public final b i(int i11) {
            this.f79764c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79762a = null;
            this.f79763b = null;
            this.f79764c = null;
            this.f79765d = null;
            this.f79766e = null;
            this.f79767f = null;
            this.f79768g = null;
            this.f79769h = null;
        }

        public b(@m80.k e source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79762a = Integer.valueOf(source.f79754a);
            this.f79763b = source.f79755b;
            this.f79764c = Integer.valueOf(source.f79756c);
            this.f79765d = Integer.valueOf(source.f79757d);
            this.f79766e = Integer.valueOf(source.f79758e);
            this.f79767f = source.f79759f;
            this.f79768g = source.f79760g;
            this.f79769h = source.f79761h;
        }
    }
}
