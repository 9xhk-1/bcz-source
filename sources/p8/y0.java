package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80272d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y0, a> f80273e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80274a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80275b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<h1> f80276c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<y0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(h1.f79859y.read(protocol));
                            }
                            protocol.l8();
                            builder.d(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.a(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k y0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SubmitAbilityReq");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f80274a);
            protocol.N2();
            protocol.Q6("game_id", 2, (byte) 11);
            protocol.p1(struct.f80275b);
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 3, (byte) 15);
            protocol.y2((byte) 12, struct.f80276c.size());
            Iterator<h1> it = struct.f80276c.iterator();
            while (it.hasNext()) {
                h1.f79859y.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public y0(int i11, @m80.k String game_id, @m80.k List<h1> words) {
        kotlin.jvm.internal.g0.p(game_id, "game_id");
        kotlin.jvm.internal.g0.p(words, "words");
        this.f80274a = i11;
        this.f80275b = game_id;
        this.f80276c = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y0 e(y0 y0Var, int i11, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = y0Var.f80274a;
        }
        if ((i12 & 2) != 0) {
            str = y0Var.f80275b;
        }
        if ((i12 & 4) != 0) {
            list = y0Var.f80276c;
        }
        return y0Var.d(i11, str, list);
    }

    public final int a() {
        return this.f80274a;
    }

    @m80.k
    public final String b() {
        return this.f80275b;
    }

    @m80.k
    public final List<h1> c() {
        return this.f80276c;
    }

    @m80.k
    public final y0 d(int i11, @m80.k String game_id, @m80.k List<h1> words) {
        kotlin.jvm.internal.g0.p(game_id, "game_id");
        kotlin.jvm.internal.g0.p(words, "words");
        return new y0(i11, game_id, words);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f80274a == y0Var.f80274a && kotlin.jvm.internal.g0.g(this.f80275b, y0Var.f80275b) && kotlin.jvm.internal.g0.g(this.f80276c, y0Var.f80276c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f80274a) * 31) + this.f80275b.hashCode()) * 31) + this.f80276c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SubmitAbilityReq(book_id=" + this.f80274a + ", game_id=" + this.f80275b + ", words=" + this.f80276c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80273e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSubmitAbilityReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitAbilityReq.kt\ncom/baicizhan/biz/online/game_api/SubmitAbilityReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
    public static final class a implements ts.f<y0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80277a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f80278b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<h1> f80279c;

        public a() {
            this.f80277a = null;
            this.f80278b = null;
            this.f80279c = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f80277a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y0 build() {
            Integer num = this.f80277a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f80278b;
            if (str == null) {
                throw new IllegalStateException("Required field 'game_id' is missing");
            }
            List<h1> list = this.f80279c;
            if (list != null) {
                return new y0(intValue, str, list);
            }
            throw new IllegalStateException("Required field 'words' is missing");
        }

        @m80.k
        public final a c(@m80.k String game_id) {
            kotlin.jvm.internal.g0.p(game_id, "game_id");
            this.f80278b = game_id;
            return this;
        }

        @m80.k
        public final a d(@m80.k List<h1> words) {
            kotlin.jvm.internal.g0.p(words, "words");
            this.f80279c = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80277a = null;
            this.f80278b = null;
            this.f80279c = null;
        }

        public a(@m80.k y0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80277a = Integer.valueOf(source.f80274a);
            this.f80278b = source.f80275b;
            this.f80279c = source.f80276c;
        }
    }
}
