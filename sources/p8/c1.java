package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c1 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f79716g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c1, a> f79717h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79718a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f79719b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f79720c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f79721d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79722e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f79723f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<c1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 == 8) {
                            builder.a(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            builder.c(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(Integer.valueOf(protocol.s8()));
                            }
                            protocol.l8();
                            builder.f(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            builder.e(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            builder.b(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
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
        public void write(@m80.k ws.i protocol, @m80.k c1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBookInfo");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f79718a);
            protocol.N2();
            protocol.Q6("book_name", 2, (byte) 11);
            protocol.p1(struct.f79719b);
            protocol.N2();
            protocol.Q6("modes", 3, (byte) 15);
            protocol.y2((byte) 8, struct.f79720c.size());
            Iterator<Integer> it = struct.f79720c.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("count_per_round", 4, (byte) 8);
            protocol.l5(struct.f79721d);
            protocol.N2();
            if (struct.f79722e != null) {
                protocol.Q6("premium_book", 5, (byte) 8);
                protocol.l5(struct.f79722e.intValue());
                protocol.N2();
            }
            if (struct.f79723f != null) {
                protocol.Q6("book_img", 6, (byte) 11);
                protocol.p1(struct.f79723f);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public c1(int i11, @m80.k String book_name, @m80.k List<Integer> modes, int i12, @m80.l Integer num, @m80.l String str) {
        kotlin.jvm.internal.g0.p(book_name, "book_name");
        kotlin.jvm.internal.g0.p(modes, "modes");
        this.f79718a = i11;
        this.f79719b = book_name;
        this.f79720c = modes;
        this.f79721d = i12;
        this.f79722e = num;
        this.f79723f = str;
    }

    public static /* synthetic */ c1 h(c1 c1Var, int i11, String str, List list, int i12, Integer num, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c1Var.f79718a;
        }
        if ((i13 & 2) != 0) {
            str = c1Var.f79719b;
        }
        if ((i13 & 4) != 0) {
            list = c1Var.f79720c;
        }
        if ((i13 & 8) != 0) {
            i12 = c1Var.f79721d;
        }
        if ((i13 & 16) != 0) {
            num = c1Var.f79722e;
        }
        if ((i13 & 32) != 0) {
            str2 = c1Var.f79723f;
        }
        Integer num2 = num;
        String str3 = str2;
        return c1Var.g(i11, str, list, i12, num2, str3);
    }

    public final int a() {
        return this.f79718a;
    }

    @m80.k
    public final String b() {
        return this.f79719b;
    }

    @m80.k
    public final List<Integer> c() {
        return this.f79720c;
    }

    public final int d() {
        return this.f79721d;
    }

    @m80.l
    public final Integer e() {
        return this.f79722e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f79718a == c1Var.f79718a && kotlin.jvm.internal.g0.g(this.f79719b, c1Var.f79719b) && kotlin.jvm.internal.g0.g(this.f79720c, c1Var.f79720c) && this.f79721d == c1Var.f79721d && kotlin.jvm.internal.g0.g(this.f79722e, c1Var.f79722e) && kotlin.jvm.internal.g0.g(this.f79723f, c1Var.f79723f);
    }

    @m80.l
    public final String f() {
        return this.f79723f;
    }

    @m80.k
    public final c1 g(int i11, @m80.k String book_name, @m80.k List<Integer> modes, int i12, @m80.l Integer num, @m80.l String str) {
        kotlin.jvm.internal.g0.p(book_name, "book_name");
        kotlin.jvm.internal.g0.p(modes, "modes");
        return new c1(i11, book_name, modes, i12, num, str);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f79718a) * 31) + this.f79719b.hashCode()) * 31) + this.f79720c.hashCode()) * 31) + Integer.hashCode(this.f79721d)) * 31;
        Integer num = this.f79722e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f79723f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserBookInfo(book_id=" + this.f79718a + ", book_name=" + this.f79719b + ", modes=" + this.f79720c + ", count_per_round=" + this.f79721d + ", premium_book=" + this.f79722e + ", book_img=" + this.f79723f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79717h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBookInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookInfo.kt\ncom/baicizhan/biz/online/game_api/UserBookInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
    public static final class a implements ts.f<c1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79724a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f79725b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<Integer> f79726c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f79727d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f79728e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f79729f;

        public a() {
            this.f79724a = null;
            this.f79725b = null;
            this.f79726c = null;
            this.f79727d = null;
            this.f79728e = null;
            this.f79729f = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f79724a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f79729f = str;
            return this;
        }

        @m80.k
        public final a c(@m80.k String book_name) {
            kotlin.jvm.internal.g0.p(book_name, "book_name");
            this.f79725b = book_name;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c1 build() {
            Integer num = this.f79724a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f79725b;
            if (str == null) {
                throw new IllegalStateException("Required field 'book_name' is missing");
            }
            List<Integer> list = this.f79726c;
            if (list == null) {
                throw new IllegalStateException("Required field 'modes' is missing");
            }
            Integer num2 = this.f79727d;
            if (num2 != null) {
                return new c1(intValue, str, list, num2.intValue(), this.f79728e, this.f79729f);
            }
            throw new IllegalStateException("Required field 'count_per_round' is missing");
        }

        @m80.k
        public final a e(int i11) {
            this.f79727d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.k List<Integer> modes) {
            kotlin.jvm.internal.g0.p(modes, "modes");
            this.f79726c = modes;
            return this;
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.f79728e = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79724a = null;
            this.f79725b = null;
            this.f79726c = null;
            this.f79727d = null;
            this.f79728e = null;
            this.f79729f = null;
        }

        public a(@m80.k c1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79724a = Integer.valueOf(source.f79718a);
            this.f79725b = source.f79719b;
            this.f79726c = source.f79720c;
            this.f79727d = Integer.valueOf(source.f79721d);
            this.f79728e = source.f79722e;
            this.f79729f = source.f79723f;
        }
    }
}
