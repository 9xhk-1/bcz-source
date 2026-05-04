package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80040d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, a> f80041e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<p8.a> f80042a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<p8.a> f80043b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<d0> f80044c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<p, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol, @m80.k a builder) {
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
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(d0.f79737e.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.c(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v43 = protocol.v4();
                        ArrayList arrayList2 = new ArrayList(v43.f96838b);
                        int i13 = v43.f96838b;
                        while (i11 < i13) {
                            arrayList2.add(p8.a.f79641d.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.d(arrayList2);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v44 = protocol.v4();
                    ArrayList arrayList3 = new ArrayList(v44.f96838b);
                    int i14 = v44.f96838b;
                    while (i11 < i14) {
                        arrayList3.add(p8.a.f79641d.read(protocol));
                        i11++;
                    }
                    protocol.l8();
                    builder.b(arrayList3);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("EquipmentInfo");
            protocol.Q6("lefts", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f80042a.size());
            Iterator<p8.a> it = struct.f80042a.iterator();
            while (it.hasNext()) {
                p8.a.f79641d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("rights", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f80043b.size());
            Iterator<p8.a> it2 = struct.f80043b.iterator();
            while (it2.hasNext()) {
                p8.a.f79641d.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("resources", 3, (byte) 15);
            protocol.y2((byte) 12, struct.f80044c.size());
            Iterator<d0> it3 = struct.f80044c.iterator();
            while (it3.hasNext()) {
                d0.f79737e.write(protocol, it3.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public p(@m80.k List<p8.a> lefts, @m80.k List<p8.a> rights, @m80.k List<d0> resources) {
        kotlin.jvm.internal.g0.p(lefts, "lefts");
        kotlin.jvm.internal.g0.p(rights, "rights");
        kotlin.jvm.internal.g0.p(resources, "resources");
        this.f80042a = lefts;
        this.f80043b = rights;
        this.f80044c = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p e(p pVar, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pVar.f80042a;
        }
        if ((i11 & 2) != 0) {
            list2 = pVar.f80043b;
        }
        if ((i11 & 4) != 0) {
            list3 = pVar.f80044c;
        }
        return pVar.d(list, list2, list3);
    }

    @m80.k
    public final List<p8.a> a() {
        return this.f80042a;
    }

    @m80.k
    public final List<p8.a> b() {
        return this.f80043b;
    }

    @m80.k
    public final List<d0> c() {
        return this.f80044c;
    }

    @m80.k
    public final p d(@m80.k List<p8.a> lefts, @m80.k List<p8.a> rights, @m80.k List<d0> resources) {
        kotlin.jvm.internal.g0.p(lefts, "lefts");
        kotlin.jvm.internal.g0.p(rights, "rights");
        kotlin.jvm.internal.g0.p(resources, "resources");
        return new p(lefts, rights, resources);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.g0.g(this.f80042a, pVar.f80042a) && kotlin.jvm.internal.g0.g(this.f80043b, pVar.f80043b) && kotlin.jvm.internal.g0.g(this.f80044c, pVar.f80044c);
    }

    public int hashCode() {
        return (((this.f80042a.hashCode() * 31) + this.f80043b.hashCode()) * 31) + this.f80044c.hashCode();
    }

    @m80.k
    public String toString() {
        return "EquipmentInfo(lefts=" + this.f80042a + ", rights=" + this.f80043b + ", resources=" + this.f80044c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80041e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEquipmentInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EquipmentInfo.kt\ncom/baicizhan/biz/online/game_api/EquipmentInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
    public static final class a implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<p8.a> f80045a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<p8.a> f80046b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<d0> f80047c;

        public a() {
            this.f80045a = null;
            this.f80046b = null;
            this.f80047c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p build() {
            List<p8.a> list = this.f80045a;
            if (list == null) {
                throw new IllegalStateException("Required field 'lefts' is missing");
            }
            List<p8.a> list2 = this.f80046b;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'rights' is missing");
            }
            List<d0> list3 = this.f80047c;
            if (list3 != null) {
                return new p(list, list2, list3);
            }
            throw new IllegalStateException("Required field 'resources' is missing");
        }

        @m80.k
        public final a b(@m80.k List<p8.a> lefts) {
            kotlin.jvm.internal.g0.p(lefts, "lefts");
            this.f80045a = lefts;
            return this;
        }

        @m80.k
        public final a c(@m80.k List<d0> resources) {
            kotlin.jvm.internal.g0.p(resources, "resources");
            this.f80047c = resources;
            return this;
        }

        @m80.k
        public final a d(@m80.k List<p8.a> rights) {
            kotlin.jvm.internal.g0.p(rights, "rights");
            this.f80046b = rights;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80045a = null;
            this.f80046b = null;
            this.f80047c = null;
        }

        public a(@m80.k p source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80045a = source.f80042a;
            this.f80046b = source.f80043b;
            this.f80047c = source.f80044c;
        }
    }
}
