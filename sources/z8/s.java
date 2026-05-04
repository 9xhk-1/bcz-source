package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101991d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s, a> f101992e = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<u> f101993a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101994b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101995c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<s, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.c(Integer.valueOf(protocol.s8()));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(u.f102072f.read(protocol));
                    }
                    protocol.l8();
                    builder.d(arrayList);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k s struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ExperienceRankDetail");
            if (struct.f101993a != null) {
                protocol.Q6("users", 1, (byte) 15);
                protocol.y2((byte) 12, struct.f101993a.size());
                Iterator<u> it = struct.f101993a.iterator();
                while (it.hasNext()) {
                    u.f102072f.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f101994b != null) {
                protocol.Q6("status", 2, (byte) 8);
                protocol.l5(struct.f101994b.intValue());
                protocol.N2();
            }
            if (struct.f101995c != null) {
                protocol.Q6("rankId", 3, (byte) 8);
                protocol.l5(struct.f101995c.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public s(@m80.l List<u> list, @m80.l Integer num, @m80.l Integer num2) {
        this.f101993a = list;
        this.f101994b = num;
        this.f101995c = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s e(s sVar, List list, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sVar.f101993a;
        }
        if ((i11 & 2) != 0) {
            num = sVar.f101994b;
        }
        if ((i11 & 4) != 0) {
            num2 = sVar.f101995c;
        }
        return sVar.d(list, num, num2);
    }

    @m80.l
    public final List<u> a() {
        return this.f101993a;
    }

    @m80.l
    public final Integer b() {
        return this.f101994b;
    }

    @m80.l
    public final Integer c() {
        return this.f101995c;
    }

    @m80.k
    public final s d(@m80.l List<u> list, @m80.l Integer num, @m80.l Integer num2) {
        return new s(list, num, num2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.g0.g(this.f101993a, sVar.f101993a) && kotlin.jvm.internal.g0.g(this.f101994b, sVar.f101994b) && kotlin.jvm.internal.g0.g(this.f101995c, sVar.f101995c);
    }

    public int hashCode() {
        List<u> list = this.f101993a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f101994b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101995c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "ExperienceRankDetail(users=" + this.f101993a + ", status=" + this.f101994b + ", rankId=" + this.f101995c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101992e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nExperienceRankDetail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperienceRankDetail.kt\ncom/baicizhan/biz/online/user_study_api/ExperienceRankDetail$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
    public static final class a implements ts.f<s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<u> f101996a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101997b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101998c;

        public a() {
            this.f101996a = null;
            this.f101997b = null;
            this.f101998c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s build() {
            return new s(this.f101996a, this.f101997b, this.f101998c);
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f101998c = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f101997b = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l List<u> list) {
            this.f101996a = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101996a = null;
            this.f101997b = null;
            this.f101998c = null;
        }

        public a(@m80.k s source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101996a = source.f101993a;
            this.f101997b = source.f101994b;
            this.f101998c = source.f101995c;
        }
    }
}
