package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f79844g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h0, a> f79845h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f79846a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79847b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79848c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k0> f79849d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f79850e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f79851f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 == 11) {
                            builder.d(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 8) {
                            builder.c(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            builder.b(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(k0.f79965e.read(protocol));
                            }
                            protocol.l8();
                            builder.g(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.f(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            builder.e(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k h0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoundInfo");
            protocol.Q6("round_id", 1, (byte) 11);
            protocol.p1(struct.f79846a);
            protocol.N2();
            protocol.Q6("round_cate", 2, (byte) 8);
            protocol.l5(struct.f79847b);
            protocol.N2();
            protocol.Q6("life_count", 3, (byte) 8);
            protocol.l5(struct.f79848c);
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 4, (byte) 15);
            protocol.y2((byte) 12, struct.f79849d.size());
            Iterator<k0> it = struct.f79849d.iterator();
            while (it.hasNext()) {
                k0.f79965e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("round_type", 5, (byte) 8);
            protocol.l5(struct.f79850e);
            protocol.N2();
            protocol.Q6("round_time", 6, (byte) 8);
            protocol.l5(struct.f79851f);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public h0(@m80.k String round_id, int i11, int i12, @m80.k List<k0> words, int i13, int i14) {
        kotlin.jvm.internal.g0.p(round_id, "round_id");
        kotlin.jvm.internal.g0.p(words, "words");
        this.f79846a = round_id;
        this.f79847b = i11;
        this.f79848c = i12;
        this.f79849d = words;
        this.f79850e = i13;
        this.f79851f = i14;
    }

    public static /* synthetic */ h0 h(h0 h0Var, String str, int i11, int i12, List list, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = h0Var.f79846a;
        }
        if ((i15 & 2) != 0) {
            i11 = h0Var.f79847b;
        }
        if ((i15 & 4) != 0) {
            i12 = h0Var.f79848c;
        }
        if ((i15 & 8) != 0) {
            list = h0Var.f79849d;
        }
        if ((i15 & 16) != 0) {
            i13 = h0Var.f79850e;
        }
        if ((i15 & 32) != 0) {
            i14 = h0Var.f79851f;
        }
        int i16 = i13;
        int i17 = i14;
        return h0Var.g(str, i11, i12, list, i16, i17);
    }

    @m80.k
    public final String a() {
        return this.f79846a;
    }

    public final int b() {
        return this.f79847b;
    }

    public final int c() {
        return this.f79848c;
    }

    @m80.k
    public final List<k0> d() {
        return this.f79849d;
    }

    public final int e() {
        return this.f79850e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.g0.g(this.f79846a, h0Var.f79846a) && this.f79847b == h0Var.f79847b && this.f79848c == h0Var.f79848c && kotlin.jvm.internal.g0.g(this.f79849d, h0Var.f79849d) && this.f79850e == h0Var.f79850e && this.f79851f == h0Var.f79851f;
    }

    public final int f() {
        return this.f79851f;
    }

    @m80.k
    public final h0 g(@m80.k String round_id, int i11, int i12, @m80.k List<k0> words, int i13, int i14) {
        kotlin.jvm.internal.g0.p(round_id, "round_id");
        kotlin.jvm.internal.g0.p(words, "words");
        return new h0(round_id, i11, i12, words, i13, i14);
    }

    public int hashCode() {
        return (((((((((this.f79846a.hashCode() * 31) + Integer.hashCode(this.f79847b)) * 31) + Integer.hashCode(this.f79848c)) * 31) + this.f79849d.hashCode()) * 31) + Integer.hashCode(this.f79850e)) * 31) + Integer.hashCode(this.f79851f);
    }

    @m80.k
    public String toString() {
        return "RoundInfo(round_id=" + this.f79846a + ", round_cate=" + this.f79847b + ", life_count=" + this.f79848c + ", words=" + this.f79849d + ", round_type=" + this.f79850e + ", round_time=" + this.f79851f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79845h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoundInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundInfo.kt\ncom/baicizhan/biz/online/game_api/RoundInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
    public static final class a implements ts.f<h0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f79852a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79853b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79854c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<k0> f79855d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f79856e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f79857f;

        public a() {
            this.f79852a = null;
            this.f79853b = null;
            this.f79854c = null;
            this.f79855d = null;
            this.f79856e = null;
            this.f79857f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 build() {
            String str = this.f79852a;
            if (str == null) {
                throw new IllegalStateException("Required field 'round_id' is missing");
            }
            Integer num = this.f79853b;
            if (num == null) {
                throw new IllegalStateException("Required field 'round_cate' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79854c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'life_count' is missing");
            }
            int intValue2 = num2.intValue();
            List<k0> list = this.f79855d;
            if (list == null) {
                throw new IllegalStateException("Required field 'words' is missing");
            }
            Integer num3 = this.f79856e;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'round_type' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f79857f;
            if (num4 != null) {
                return new h0(str, intValue, intValue2, list, intValue3, num4.intValue());
            }
            throw new IllegalStateException("Required field 'round_time' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79854c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79853b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String round_id) {
            kotlin.jvm.internal.g0.p(round_id, "round_id");
            this.f79852a = round_id;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f79857f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f79856e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.k List<k0> words) {
            kotlin.jvm.internal.g0.p(words, "words");
            this.f79855d = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79852a = null;
            this.f79853b = null;
            this.f79854c = null;
            this.f79855d = null;
            this.f79856e = null;
            this.f79857f = null;
        }

        public a(@m80.k h0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79852a = source.f79846a;
            this.f79853b = Integer.valueOf(source.f79847b);
            this.f79854c = Integer.valueOf(source.f79848c);
            this.f79855d = source.f79849d;
            this.f79856e = Integer.valueOf(source.f79850e);
            this.f79857f = Integer.valueOf(source.f79851f);
        }
    }
}
