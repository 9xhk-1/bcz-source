package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f80056h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q, a> f80057i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80058a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f80059b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<v0> f80060c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f80061d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f80062e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f80063f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f80064g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.f(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 10) {
                            builder.e(protocol.T1());
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
                                arrayList.add(v0.f80203l.read(protocol));
                            }
                            protocol.l8();
                            builder.h(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            builder.g(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.b(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            builder.c(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 8) {
                            builder.d(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k q struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("FinishRoundReq");
            protocol.Q6("round_id", 1, (byte) 11);
            protocol.p1(struct.f80058a);
            protocol.N2();
            protocol.Q6("local_version", 2, (byte) 10);
            protocol.q7(struct.f80059b);
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 3, (byte) 15);
            protocol.y2((byte) 12, struct.f80060c.size());
            Iterator<v0> it = struct.f80060c.iterator();
            while (it.hasNext()) {
                v0.f80203l.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("study_score", 4, (byte) 8);
            protocol.l5(struct.f80061d);
            protocol.N2();
            protocol.Q6("combo", 5, (byte) 8);
            protocol.l5(struct.f80062e);
            protocol.N2();
            protocol.Q6("correctRate", 6, (byte) 8);
            protocol.l5(struct.f80063f);
            protocol.N2();
            if (struct.f80064g != null) {
                protocol.Q6("life_count", 7, (byte) 8);
                protocol.l5(struct.f80064g.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public q(@m80.k String round_id, long j11, @m80.k List<v0> words, int i11, int i12, int i13, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(round_id, "round_id");
        kotlin.jvm.internal.g0.p(words, "words");
        this.f80058a = round_id;
        this.f80059b = j11;
        this.f80060c = words;
        this.f80061d = i11;
        this.f80062e = i12;
        this.f80063f = i13;
        this.f80064g = num;
    }

    public static /* synthetic */ q i(q qVar, String str, long j11, List list, int i11, int i12, int i13, Integer num, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = qVar.f80058a;
        }
        if ((i14 & 2) != 0) {
            j11 = qVar.f80059b;
        }
        if ((i14 & 4) != 0) {
            list = qVar.f80060c;
        }
        if ((i14 & 8) != 0) {
            i11 = qVar.f80061d;
        }
        if ((i14 & 16) != 0) {
            i12 = qVar.f80062e;
        }
        if ((i14 & 32) != 0) {
            i13 = qVar.f80063f;
        }
        if ((i14 & 64) != 0) {
            num = qVar.f80064g;
        }
        Integer num2 = num;
        int i15 = i12;
        List list2 = list;
        return qVar.h(str, j11, list2, i11, i15, i13, num2);
    }

    @m80.k
    public final String a() {
        return this.f80058a;
    }

    public final long b() {
        return this.f80059b;
    }

    @m80.k
    public final List<v0> c() {
        return this.f80060c;
    }

    public final int d() {
        return this.f80061d;
    }

    public final int e() {
        return this.f80062e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.g0.g(this.f80058a, qVar.f80058a) && this.f80059b == qVar.f80059b && kotlin.jvm.internal.g0.g(this.f80060c, qVar.f80060c) && this.f80061d == qVar.f80061d && this.f80062e == qVar.f80062e && this.f80063f == qVar.f80063f && kotlin.jvm.internal.g0.g(this.f80064g, qVar.f80064g);
    }

    public final int f() {
        return this.f80063f;
    }

    @m80.l
    public final Integer g() {
        return this.f80064g;
    }

    @m80.k
    public final q h(@m80.k String round_id, long j11, @m80.k List<v0> words, int i11, int i12, int i13, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(round_id, "round_id");
        kotlin.jvm.internal.g0.p(words, "words");
        return new q(round_id, j11, words, i11, i12, i13, num);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f80058a.hashCode() * 31) + Long.hashCode(this.f80059b)) * 31) + this.f80060c.hashCode()) * 31) + Integer.hashCode(this.f80061d)) * 31) + Integer.hashCode(this.f80062e)) * 31) + Integer.hashCode(this.f80063f)) * 31;
        Integer num = this.f80064g;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.k
    public String toString() {
        return "FinishRoundReq(round_id=" + this.f80058a + ", local_version=" + this.f80059b + ", words=" + this.f80060c + ", study_score=" + this.f80061d + ", combo=" + this.f80062e + ", correctRate=" + this.f80063f + ", life_count=" + this.f80064g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80057i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nFinishRoundReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinishRoundReq.kt\ncom/baicizhan/biz/online/game_api/FinishRoundReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
    public static final class a implements ts.f<q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f80065a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f80066b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<v0> f80067c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f80068d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f80069e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f80070f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f80071g;

        public a() {
            this.f80065a = null;
            this.f80066b = null;
            this.f80067c = null;
            this.f80068d = null;
            this.f80069e = null;
            this.f80070f = null;
            this.f80071g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q build() {
            String str = this.f80065a;
            if (str == null) {
                throw new IllegalStateException("Required field 'round_id' is missing");
            }
            Long l11 = this.f80066b;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'local_version' is missing");
            }
            long longValue = l11.longValue();
            List<v0> list = this.f80067c;
            if (list == null) {
                throw new IllegalStateException("Required field 'words' is missing");
            }
            Integer num = this.f80068d;
            if (num == null) {
                throw new IllegalStateException("Required field 'study_score' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f80069e;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'combo' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f80070f;
            if (num3 != null) {
                return new q(str, longValue, list, intValue, intValue2, num3.intValue(), this.f80071g);
            }
            throw new IllegalStateException("Required field 'correctRate' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f80069e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f80070f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f80071g = num;
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f80066b = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String round_id) {
            kotlin.jvm.internal.g0.p(round_id, "round_id");
            this.f80065a = round_id;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f80068d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(@m80.k List<v0> words) {
            kotlin.jvm.internal.g0.p(words, "words");
            this.f80067c = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80065a = null;
            this.f80066b = null;
            this.f80067c = null;
            this.f80068d = null;
            this.f80069e = null;
            this.f80070f = null;
            this.f80071g = null;
        }

        public a(@m80.k q source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80065a = source.f80058a;
            this.f80066b = Long.valueOf(source.f80059b);
            this.f80067c = source.f80060c;
            this.f80068d = Integer.valueOf(source.f80061d);
            this.f80069e = Integer.valueOf(source.f80062e);
            this.f80070f = Integer.valueOf(source.f80063f);
            this.f80071g = source.f80064g;
        }
    }
}
