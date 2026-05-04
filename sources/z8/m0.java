package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101759e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m0, a> f101760f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101761a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101762b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f101763c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<l0> f101764d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 15) {
                                ws.f v42 = protocol.v4();
                                ArrayList arrayList = new ArrayList(v42.f96838b);
                                int i11 = v42.f96838b;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    arrayList.add(l0.f101734f.read(protocol));
                                }
                                protocol.l8();
                                builder.e(arrayList);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 4) {
                            builder.d(Double.valueOf(protocol.readDouble()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k m0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SearchPageResources");
            protocol.Q6("module_id", 1, (byte) 8);
            protocol.l5(struct.f101761a);
            protocol.N2();
            protocol.Q6("module_name", 2, (byte) 11);
            protocol.p1(struct.f101762b);
            protocol.N2();
            if (struct.f101763c != null) {
                protocol.Q6("ratio", 3, (byte) 4);
                protocol.writeDouble(struct.f101763c.doubleValue());
                protocol.N2();
            }
            protocol.Q6("resources", 4, (byte) 15);
            protocol.y2((byte) 12, struct.f101764d.size());
            Iterator<l0> it = struct.f101764d.iterator();
            while (it.hasNext()) {
                l0.f101734f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m0(int i11, @m80.k String module_name, @m80.l Double d11, @m80.k List<l0> resources) {
        kotlin.jvm.internal.g0.p(module_name, "module_name");
        kotlin.jvm.internal.g0.p(resources, "resources");
        this.f101761a = i11;
        this.f101762b = module_name;
        this.f101763c = d11;
        this.f101764d = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m0 f(m0 m0Var, int i11, String str, Double d11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = m0Var.f101761a;
        }
        if ((i12 & 2) != 0) {
            str = m0Var.f101762b;
        }
        if ((i12 & 4) != 0) {
            d11 = m0Var.f101763c;
        }
        if ((i12 & 8) != 0) {
            list = m0Var.f101764d;
        }
        return m0Var.e(i11, str, d11, list);
    }

    public final int a() {
        return this.f101761a;
    }

    @m80.k
    public final String b() {
        return this.f101762b;
    }

    @m80.l
    public final Double c() {
        return this.f101763c;
    }

    @m80.k
    public final List<l0> d() {
        return this.f101764d;
    }

    @m80.k
    public final m0 e(int i11, @m80.k String module_name, @m80.l Double d11, @m80.k List<l0> resources) {
        kotlin.jvm.internal.g0.p(module_name, "module_name");
        kotlin.jvm.internal.g0.p(resources, "resources");
        return new m0(i11, module_name, d11, resources);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f101761a == m0Var.f101761a && kotlin.jvm.internal.g0.g(this.f101762b, m0Var.f101762b) && kotlin.jvm.internal.g0.g(this.f101763c, m0Var.f101763c) && kotlin.jvm.internal.g0.g(this.f101764d, m0Var.f101764d);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f101761a) * 31) + this.f101762b.hashCode()) * 31;
        Double d11 = this.f101763c;
        return ((hashCode + (d11 == null ? 0 : d11.hashCode())) * 31) + this.f101764d.hashCode();
    }

    @m80.k
    public String toString() {
        return "SearchPageResources(module_id=" + this.f101761a + ", module_name=" + this.f101762b + ", ratio=" + this.f101763c + ", resources=" + this.f101764d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101760f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSearchPageResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchPageResources.kt\ncom/baicizhan/biz/online/user_study_api/SearchPageResources$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
    public static final class a implements ts.f<m0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101765a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101766b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Double f101767c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<l0> f101768d;

        public a() {
            this.f101765a = null;
            this.f101766b = null;
            this.f101767c = null;
            this.f101768d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 build() {
            Integer num = this.f101765a;
            if (num == null) {
                throw new IllegalStateException("Required field 'module_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101766b;
            if (str == null) {
                throw new IllegalStateException("Required field 'module_name' is missing");
            }
            Double d11 = this.f101767c;
            List<l0> list = this.f101768d;
            if (list != null) {
                return new m0(intValue, str, d11, list);
            }
            throw new IllegalStateException("Required field 'resources' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101765a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String module_name) {
            kotlin.jvm.internal.g0.p(module_name, "module_name");
            this.f101766b = module_name;
            return this;
        }

        @m80.k
        public final a d(@m80.l Double d11) {
            this.f101767c = d11;
            return this;
        }

        @m80.k
        public final a e(@m80.k List<l0> resources) {
            kotlin.jvm.internal.g0.p(resources, "resources");
            this.f101768d = resources;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101765a = null;
            this.f101766b = null;
            this.f101767c = null;
            this.f101768d = null;
        }

        public a(@m80.k m0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101765a = Integer.valueOf(source.f101761a);
            this.f101766b = source.f101762b;
            this.f101767c = source.f101763c;
            this.f101768d = source.f101764d;
        }
    }
}
