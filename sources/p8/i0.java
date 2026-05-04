package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f79912g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i0, a> f79913h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79914a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k0> f79915b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f79916c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f79917d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f79918e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79919f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    case 3:
                        if (b11 == 10) {
                            builder.f(protocol.T1());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            builder.d(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.e(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            builder.c(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k i0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoundReq");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f79914a);
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 2, (byte) 15);
            protocol.y2((byte) 12, struct.f79915b.size());
            Iterator<k0> it = struct.f79915b.iterator();
            while (it.hasNext()) {
                k0.f79965e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("study_record_version", 3, (byte) 10);
            protocol.q7(struct.f79916c);
            protocol.N2();
            protocol.Q6("round_time", 4, (byte) 8);
            protocol.l5(struct.f79917d);
            protocol.N2();
            protocol.Q6("round_type", 5, (byte) 8);
            protocol.l5(struct.f79918e);
            protocol.N2();
            if (struct.f79919f != null) {
                protocol.Q6("round_cate", 6, (byte) 8);
                protocol.l5(struct.f79919f.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public i0(int i11, @m80.k List<k0> words, long j11, int i12, int i13, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(words, "words");
        this.f79914a = i11;
        this.f79915b = words;
        this.f79916c = j11;
        this.f79917d = i12;
        this.f79918e = i13;
        this.f79919f = num;
    }

    public static /* synthetic */ i0 h(i0 i0Var, int i11, List list, long j11, int i12, int i13, Integer num, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = i0Var.f79914a;
        }
        if ((i14 & 2) != 0) {
            list = i0Var.f79915b;
        }
        if ((i14 & 4) != 0) {
            j11 = i0Var.f79916c;
        }
        if ((i14 & 8) != 0) {
            i12 = i0Var.f79917d;
        }
        if ((i14 & 16) != 0) {
            i13 = i0Var.f79918e;
        }
        if ((i14 & 32) != 0) {
            num = i0Var.f79919f;
        }
        Integer num2 = num;
        int i15 = i12;
        long j12 = j11;
        return i0Var.g(i11, list, j12, i15, i13, num2);
    }

    public final int a() {
        return this.f79914a;
    }

    @m80.k
    public final List<k0> b() {
        return this.f79915b;
    }

    public final long c() {
        return this.f79916c;
    }

    public final int d() {
        return this.f79917d;
    }

    public final int e() {
        return this.f79918e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f79914a == i0Var.f79914a && kotlin.jvm.internal.g0.g(this.f79915b, i0Var.f79915b) && this.f79916c == i0Var.f79916c && this.f79917d == i0Var.f79917d && this.f79918e == i0Var.f79918e && kotlin.jvm.internal.g0.g(this.f79919f, i0Var.f79919f);
    }

    @m80.l
    public final Integer f() {
        return this.f79919f;
    }

    @m80.k
    public final i0 g(int i11, @m80.k List<k0> words, long j11, int i12, int i13, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(words, "words");
        return new i0(i11, words, j11, i12, i13, num);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f79914a) * 31) + this.f79915b.hashCode()) * 31) + Long.hashCode(this.f79916c)) * 31) + Integer.hashCode(this.f79917d)) * 31) + Integer.hashCode(this.f79918e)) * 31;
        Integer num = this.f79919f;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.k
    public String toString() {
        return "RoundReq(book_id=" + this.f79914a + ", words=" + this.f79915b + ", study_record_version=" + this.f79916c + ", round_time=" + this.f79917d + ", round_type=" + this.f79918e + ", round_cate=" + this.f79919f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79913h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoundReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundReq.kt\ncom/baicizhan/biz/online/game_api/RoundReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1#2:248\n*E\n"})
    public static final class a implements ts.f<i0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79920a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<k0> f79921b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f79922c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f79923d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f79924e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f79925f;

        public a() {
            this.f79920a = null;
            this.f79921b = null;
            this.f79922c = null;
            this.f79923d = null;
            this.f79924e = null;
            this.f79925f = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f79920a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 build() {
            Integer num = this.f79920a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            List<k0> list = this.f79921b;
            if (list == null) {
                throw new IllegalStateException("Required field 'words' is missing");
            }
            Long l11 = this.f79922c;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'study_record_version' is missing");
            }
            long longValue = l11.longValue();
            Integer num2 = this.f79923d;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'round_time' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f79924e;
            if (num3 != null) {
                return new i0(intValue, list, longValue, intValue2, num3.intValue(), this.f79925f);
            }
            throw new IllegalStateException("Required field 'round_type' is missing");
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f79925f = num;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f79923d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f79924e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(long j11) {
            this.f79922c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a g(@m80.k List<k0> words) {
            kotlin.jvm.internal.g0.p(words, "words");
            this.f79921b = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79920a = null;
            this.f79921b = null;
            this.f79922c = null;
            this.f79923d = null;
            this.f79924e = null;
            this.f79925f = null;
        }

        public a(@m80.k i0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79920a = Integer.valueOf(source.f79914a);
            this.f79921b = source.f79915b;
            this.f79922c = Long.valueOf(source.f79916c);
            this.f79923d = Integer.valueOf(source.f79917d);
            this.f79924e = Integer.valueOf(source.f79918e);
            this.f79925f = source.f79919f;
        }
    }
}
