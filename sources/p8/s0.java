package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s0 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f80110f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s0, a> f80111g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80112a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<n0> f80113b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<q0> f80114c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80115d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f80116e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<s0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 8) {
                                    builder.c(protocol.s8());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.f(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(q0.f80073h.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v43 = protocol.v4();
                        ArrayList arrayList2 = new ArrayList(v43.f96838b);
                        int i13 = v43.f96838b;
                        while (i11 < i13) {
                            arrayList2.add(n0.f80009g.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.b(arrayList2);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.e(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k s0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceSkuInfo");
            protocol.Q6("skuId", 1, (byte) 8);
            protocol.l5(struct.f80112a);
            protocol.N2();
            protocol.Q6("chapters", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f80113b.size());
            Iterator<n0> it = struct.f80113b.iterator();
            while (it.hasNext()) {
                n0.f80009g.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("lessons", 3, (byte) 15);
            protocol.y2((byte) 12, struct.f80114c.size());
            Iterator<q0> it2 = struct.f80114c.iterator();
            while (it2.hasNext()) {
                q0.f80073h.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("version", 4, (byte) 11);
            protocol.p1(struct.f80115d);
            protocol.N2();
            protocol.Q6("languageType", 5, (byte) 8);
            protocol.l5(struct.f80116e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public s0(int i11, @m80.k List<n0> chapters, @m80.k List<q0> lessons, @m80.k String version, int i12) {
        kotlin.jvm.internal.g0.p(chapters, "chapters");
        kotlin.jvm.internal.g0.p(lessons, "lessons");
        kotlin.jvm.internal.g0.p(version, "version");
        this.f80112a = i11;
        this.f80113b = chapters;
        this.f80114c = lessons;
        this.f80115d = version;
        this.f80116e = i12;
    }

    public static /* synthetic */ s0 g(s0 s0Var, int i11, List list, List list2, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = s0Var.f80112a;
        }
        if ((i13 & 2) != 0) {
            list = s0Var.f80113b;
        }
        if ((i13 & 4) != 0) {
            list2 = s0Var.f80114c;
        }
        if ((i13 & 8) != 0) {
            str = s0Var.f80115d;
        }
        if ((i13 & 16) != 0) {
            i12 = s0Var.f80116e;
        }
        int i14 = i12;
        List list3 = list2;
        return s0Var.f(i11, list, list3, str, i14);
    }

    public final int a() {
        return this.f80112a;
    }

    @m80.k
    public final List<n0> b() {
        return this.f80113b;
    }

    @m80.k
    public final List<q0> c() {
        return this.f80114c;
    }

    @m80.k
    public final String d() {
        return this.f80115d;
    }

    public final int e() {
        return this.f80116e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f80112a == s0Var.f80112a && kotlin.jvm.internal.g0.g(this.f80113b, s0Var.f80113b) && kotlin.jvm.internal.g0.g(this.f80114c, s0Var.f80114c) && kotlin.jvm.internal.g0.g(this.f80115d, s0Var.f80115d) && this.f80116e == s0Var.f80116e;
    }

    @m80.k
    public final s0 f(int i11, @m80.k List<n0> chapters, @m80.k List<q0> lessons, @m80.k String version, int i12) {
        kotlin.jvm.internal.g0.p(chapters, "chapters");
        kotlin.jvm.internal.g0.p(lessons, "lessons");
        kotlin.jvm.internal.g0.p(version, "version");
        return new s0(i11, chapters, lessons, version, i12);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f80112a) * 31) + this.f80113b.hashCode()) * 31) + this.f80114c.hashCode()) * 31) + this.f80115d.hashCode()) * 31) + Integer.hashCode(this.f80116e);
    }

    @m80.k
    public String toString() {
        return "SentenceSkuInfo(skuId=" + this.f80112a + ", chapters=" + this.f80113b + ", lessons=" + this.f80114c + ", version=" + this.f80115d + ", languageType=" + this.f80116e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80111g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceSkuInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceSkuInfo.kt\ncom/baicizhan/biz/online/game_api/SentenceSkuInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
    public static final class a implements ts.f<s0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80117a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<n0> f80118b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<q0> f80119c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f80120d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f80121e;

        public a() {
            this.f80117a = null;
            this.f80118b = null;
            this.f80119c = null;
            this.f80120d = null;
            this.f80121e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s0 build() {
            Integer num = this.f80117a;
            if (num == null) {
                throw new IllegalStateException("Required field 'skuId' is missing");
            }
            int intValue = num.intValue();
            List<n0> list = this.f80118b;
            if (list == null) {
                throw new IllegalStateException("Required field 'chapters' is missing");
            }
            List<q0> list2 = this.f80119c;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'lessons' is missing");
            }
            String str = this.f80120d;
            if (str == null) {
                throw new IllegalStateException("Required field 'version' is missing");
            }
            Integer num2 = this.f80121e;
            if (num2 != null) {
                return new s0(intValue, list, list2, str, num2.intValue());
            }
            throw new IllegalStateException("Required field 'languageType' is missing");
        }

        @m80.k
        public final a b(@m80.k List<n0> chapters) {
            kotlin.jvm.internal.g0.p(chapters, "chapters");
            this.f80118b = chapters;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f80121e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k List<q0> lessons) {
            kotlin.jvm.internal.g0.p(lessons, "lessons");
            this.f80119c = lessons;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f80117a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String version) {
            kotlin.jvm.internal.g0.p(version, "version");
            this.f80120d = version;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80117a = null;
            this.f80118b = null;
            this.f80119c = null;
            this.f80120d = null;
            this.f80121e = null;
        }

        public a(@m80.k s0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80117a = Integer.valueOf(source.f80112a);
            this.f80118b = source.f80113b;
            this.f80119c = source.f80114c;
            this.f80120d = source.f80115d;
            this.f80121e = Integer.valueOf(source.f80116e);
        }
    }
}
