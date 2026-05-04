package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x0 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f102253f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x0, a> f102254g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f102255a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<j0> f102256b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<com.baicizhan.biz.online.user_study_api.a> f102257c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final w0 f102258d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<w0> f102259e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<x0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                } else if (b11 == 15) {
                                    ws.f v42 = protocol.v4();
                                    ArrayList arrayList = new ArrayList(v42.f96838b);
                                    int i12 = v42.f96838b;
                                    while (i11 < i12) {
                                        arrayList.add(w0.f102196f.read(protocol));
                                        i11++;
                                    }
                                    protocol.l8();
                                    builder.b(arrayList);
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 12) {
                                builder.a(w0.f102196f.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 15) {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(com.baicizhan.biz.online.user_study_api.a.f15973d.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.f(arrayList2);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v44 = protocol.v4();
                        ArrayList arrayList3 = new ArrayList(v44.f96838b);
                        int i14 = v44.f96838b;
                        while (i11 < i14) {
                            arrayList3.add(j0.f101644h.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.e(arrayList3);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 2) {
                    builder.d(protocol.readBool());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k x0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("TrainPageResources");
            protocol.Q6(k3.u0.f65628b, 1, (byte) 2);
            protocol.a4(struct.f102255a);
            protocol.N2();
            protocol.Q6("outerResource", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f102256b.size());
            Iterator<j0> it = struct.f102256b.iterator();
            while (it.hasNext()) {
                j0.f101644h.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("resources", 3, (byte) 15);
            protocol.y2((byte) 12, struct.f102257c.size());
            Iterator<com.baicizhan.biz.online.user_study_api.a> it2 = struct.f102257c.iterator();
            while (it2.hasNext()) {
                com.baicizhan.biz.online.user_study_api.a.f15973d.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f102258d != null) {
                protocol.Q6("banner", 4, (byte) 12);
                w0.f102196f.write(protocol, struct.f102258d);
                protocol.N2();
            }
            if (struct.f102259e != null) {
                protocol.Q6("banners", 5, (byte) 15);
                protocol.y2((byte) 12, struct.f102259e.size());
                Iterator<w0> it3 = struct.f102259e.iterator();
                while (it3.hasNext()) {
                    w0.f102196f.write(protocol, it3.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public x0(boolean z11, @m80.k List<j0> outerResource, @m80.k List<com.baicizhan.biz.online.user_study_api.a> resources, @m80.l w0 w0Var, @m80.l List<w0> list) {
        kotlin.jvm.internal.g0.p(outerResource, "outerResource");
        kotlin.jvm.internal.g0.p(resources, "resources");
        this.f102255a = z11;
        this.f102256b = outerResource;
        this.f102257c = resources;
        this.f102258d = w0Var;
        this.f102259e = list;
    }

    public static /* synthetic */ x0 g(x0 x0Var, boolean z11, List list, List list2, w0 w0Var, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = x0Var.f102255a;
        }
        if ((i11 & 2) != 0) {
            list = x0Var.f102256b;
        }
        if ((i11 & 4) != 0) {
            list2 = x0Var.f102257c;
        }
        if ((i11 & 8) != 0) {
            w0Var = x0Var.f102258d;
        }
        if ((i11 & 16) != 0) {
            list3 = x0Var.f102259e;
        }
        List list4 = list3;
        List list5 = list2;
        return x0Var.f(z11, list, list5, w0Var, list4);
    }

    public final boolean a() {
        return this.f102255a;
    }

    @m80.k
    public final List<j0> b() {
        return this.f102256b;
    }

    @m80.k
    public final List<com.baicizhan.biz.online.user_study_api.a> c() {
        return this.f102257c;
    }

    @m80.l
    public final w0 d() {
        return this.f102258d;
    }

    @m80.l
    public final List<w0> e() {
        return this.f102259e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f102255a == x0Var.f102255a && kotlin.jvm.internal.g0.g(this.f102256b, x0Var.f102256b) && kotlin.jvm.internal.g0.g(this.f102257c, x0Var.f102257c) && kotlin.jvm.internal.g0.g(this.f102258d, x0Var.f102258d) && kotlin.jvm.internal.g0.g(this.f102259e, x0Var.f102259e);
    }

    @m80.k
    public final x0 f(boolean z11, @m80.k List<j0> outerResource, @m80.k List<com.baicizhan.biz.online.user_study_api.a> resources, @m80.l w0 w0Var, @m80.l List<w0> list) {
        kotlin.jvm.internal.g0.p(outerResource, "outerResource");
        kotlin.jvm.internal.g0.p(resources, "resources");
        return new x0(z11, outerResource, resources, w0Var, list);
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.f102255a) * 31) + this.f102256b.hashCode()) * 31) + this.f102257c.hashCode()) * 31;
        w0 w0Var = this.f102258d;
        int hashCode2 = (hashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        List<w0> list = this.f102259e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "TrainPageResources(enable=" + this.f102255a + ", outerResource=" + this.f102256b + ", resources=" + this.f102257c + ", banner=" + this.f102258d + ", banners=" + this.f102259e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102254g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTrainPageResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainPageResources.kt\ncom/baicizhan/biz/online/user_study_api/TrainPageResources$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
    public static final class a implements ts.f<x0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Boolean f102260a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<j0> f102261b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<com.baicizhan.biz.online.user_study_api.a> f102262c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public w0 f102263d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<w0> f102264e;

        public a() {
            this.f102260a = null;
            this.f102261b = null;
            this.f102262c = null;
            this.f102263d = null;
            this.f102264e = null;
        }

        @m80.k
        public final a a(@m80.l w0 w0Var) {
            this.f102263d = w0Var;
            return this;
        }

        @m80.k
        public final a b(@m80.l List<w0> list) {
            this.f102264e = list;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public x0 build() {
            Boolean bool = this.f102260a;
            if (bool == null) {
                throw new IllegalStateException("Required field 'enable' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            List<j0> list = this.f102261b;
            if (list == null) {
                throw new IllegalStateException("Required field 'outerResource' is missing");
            }
            List<com.baicizhan.biz.online.user_study_api.a> list2 = this.f102262c;
            if (list2 != null) {
                return new x0(booleanValue, list, list2, this.f102263d, this.f102264e);
            }
            throw new IllegalStateException("Required field 'resources' is missing");
        }

        @m80.k
        public final a d(boolean z11) {
            this.f102260a = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a e(@m80.k List<j0> outerResource) {
            kotlin.jvm.internal.g0.p(outerResource, "outerResource");
            this.f102261b = outerResource;
            return this;
        }

        @m80.k
        public final a f(@m80.k List<com.baicizhan.biz.online.user_study_api.a> resources) {
            kotlin.jvm.internal.g0.p(resources, "resources");
            this.f102262c = resources;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102260a = null;
            this.f102261b = null;
            this.f102262c = null;
            this.f102263d = null;
            this.f102264e = null;
        }

        public a(@m80.k x0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102260a = Boolean.valueOf(source.f102255a);
            this.f102261b = source.f102256b;
            this.f102262c = source.f102257c;
            this.f102263d = source.f102258d;
            this.f102264e = source.f102259e;
        }
    }
}
