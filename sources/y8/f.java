package y8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f99549d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, a> f99550e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f99551a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<g> f99552b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f99553c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return builder.build();
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(g.f99558g.read(protocol));
                        }
                        protocol.l8();
                        builder.d(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserBookInfo");
            protocol.Q6("max_limit", 1, (byte) 8);
            protocol.l5(struct.f99551a);
            protocol.N2();
            protocol.Q6("user_books", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f99552b.size());
            Iterator<g> it = struct.f99552b.iterator();
            while (it.hasNext()) {
                g.f99558g.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f99553c != null) {
                protocol.Q6("copper_limit", 3, (byte) 8);
                protocol.l5(struct.f99553c.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public f(int i11, @m80.k List<g> user_books, @m80.l Integer num) {
        g0.p(user_books, "user_books");
        this.f99551a = i11;
        this.f99552b = user_books;
        this.f99553c = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f e(f fVar, int i11, List list, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = fVar.f99551a;
        }
        if ((i12 & 2) != 0) {
            list = fVar.f99552b;
        }
        if ((i12 & 4) != 0) {
            num = fVar.f99553c;
        }
        return fVar.d(i11, list, num);
    }

    public final int a() {
        return this.f99551a;
    }

    @m80.k
    public final List<g> b() {
        return this.f99552b;
    }

    @m80.l
    public final Integer c() {
        return this.f99553c;
    }

    @m80.k
    public final f d(int i11, @m80.k List<g> user_books, @m80.l Integer num) {
        g0.p(user_books, "user_books");
        return new f(i11, user_books, num);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f99551a == fVar.f99551a && g0.g(this.f99552b, fVar.f99552b) && g0.g(this.f99553c, fVar.f99553c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f99551a) * 31) + this.f99552b.hashCode()) * 31;
        Integer num = this.f99553c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.k
    public String toString() {
        return "UserBookInfo(max_limit=" + this.f99551a + ", user_books=" + this.f99552b + ", copper_limit=" + this.f99553c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99550e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBookInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookInfo.kt\ncom/baicizhan/biz/online/user_book/UserBookInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f99554a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<g> f99555b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f99556c;

        public a() {
            this.f99554a = null;
            this.f99555b = null;
            this.f99556c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            Integer num = this.f99554a;
            if (num == null) {
                throw new IllegalStateException("Required field 'max_limit' is missing");
            }
            int intValue = num.intValue();
            List<g> list = this.f99555b;
            if (list != null) {
                return new f(intValue, list, this.f99556c);
            }
            throw new IllegalStateException("Required field 'user_books' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f99556c = num;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f99554a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k List<g> user_books) {
            g0.p(user_books, "user_books");
            this.f99555b = user_books;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99554a = null;
            this.f99555b = null;
            this.f99556c = null;
        }

        public a(@m80.k f source) {
            g0.p(source, "source");
            this.f99554a = Integer.valueOf(source.f99551a);
            this.f99555b = source.f99552b;
            this.f99556c = source.f99553c;
        }
    }
}
