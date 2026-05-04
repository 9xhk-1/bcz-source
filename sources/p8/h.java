package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f79838c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h, a> f79839d = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79840a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<f> f79841b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<h, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(f.f79787d.read(protocol));
                        }
                        protocol.l8();
                        builder.b(arrayList);
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
        public void write(@m80.k ws.i protocol, @m80.k h struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("BuildingMap");
            protocol.Q6("skuId", 1, (byte) 8);
            protocol.l5(struct.f79840a);
            protocol.N2();
            protocol.Q6("buildings", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f79841b.size());
            Iterator<f> it = struct.f79841b.iterator();
            while (it.hasNext()) {
                f.f79787d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public h(int i11, @m80.k List<f> buildings) {
        kotlin.jvm.internal.g0.p(buildings, "buildings");
        this.f79840a = i11;
        this.f79841b = buildings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h d(h hVar, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = hVar.f79840a;
        }
        if ((i12 & 2) != 0) {
            list = hVar.f79841b;
        }
        return hVar.c(i11, list);
    }

    public final int a() {
        return this.f79840a;
    }

    @m80.k
    public final List<f> b() {
        return this.f79841b;
    }

    @m80.k
    public final h c(int i11, @m80.k List<f> buildings) {
        kotlin.jvm.internal.g0.p(buildings, "buildings");
        return new h(i11, buildings);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f79840a == hVar.f79840a && kotlin.jvm.internal.g0.g(this.f79841b, hVar.f79841b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79840a) * 31) + this.f79841b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BuildingMap(skuId=" + this.f79840a + ", buildings=" + this.f79841b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79839d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBuildingMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildingMap.kt\ncom/baicizhan/biz/online/game_api/BuildingMap$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class a implements ts.f<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79842a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<f> f79843b;

        public a() {
            this.f79842a = null;
            this.f79843b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h build() {
            Integer num = this.f79842a;
            if (num == null) {
                throw new IllegalStateException("Required field 'skuId' is missing");
            }
            int intValue = num.intValue();
            List<f> list = this.f79843b;
            if (list != null) {
                return new h(intValue, list);
            }
            throw new IllegalStateException("Required field 'buildings' is missing");
        }

        @m80.k
        public final a b(@m80.k List<f> buildings) {
            kotlin.jvm.internal.g0.p(buildings, "buildings");
            this.f79843b = buildings;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79842a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79842a = null;
            this.f79843b = null;
        }

        public a(@m80.k h source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79842a = Integer.valueOf(source.f79840a);
            this.f79843b = source.f79841b;
        }
    }
}
