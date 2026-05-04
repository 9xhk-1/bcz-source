package g8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f53401d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u, a> f53402e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53403a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<t> f53404b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<t> f53405c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol, @m80.k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(t.f53388h.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.b(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v43 = protocol.v4();
                        ArrayList arrayList2 = new ArrayList(v43.f96838b);
                        int i13 = v43.f96838b;
                        while (i11 < i13) {
                            arrayList2.add(t.f53388h.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.d(arrayList2);
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
        public void write(@m80.k ws.i protocol, @m80.k u struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MallTabInfo");
            protocol.Q6("recommendType", 1, (byte) 8);
            protocol.l5(struct.f53403a);
            protocol.N2();
            if (struct.f53404b != null) {
                protocol.Q6(s9.b.f88139c, 2, (byte) 15);
                protocol.y2((byte) 12, struct.f53404b.size());
                Iterator<t> it = struct.f53404b.iterator();
                while (it.hasNext()) {
                    t.f53388h.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f53405c != null) {
                protocol.Q6(q9.h.f81939c, 3, (byte) 15);
                protocol.y2((byte) 12, struct.f53405c.size());
                Iterator<t> it2 = struct.f53405c.iterator();
                while (it2.hasNext()) {
                    t.f53388h.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public u(int i11, @m80.l List<t> list, @m80.l List<t> list2) {
        this.f53403a = i11;
        this.f53404b = list;
        this.f53405c = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u e(u uVar, int i11, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = uVar.f53403a;
        }
        if ((i12 & 2) != 0) {
            list = uVar.f53404b;
        }
        if ((i12 & 4) != 0) {
            list2 = uVar.f53405c;
        }
        return uVar.d(i11, list, list2);
    }

    public final int a() {
        return this.f53403a;
    }

    @m80.l
    public final List<t> b() {
        return this.f53404b;
    }

    @m80.l
    public final List<t> c() {
        return this.f53405c;
    }

    @m80.k
    public final u d(int i11, @m80.l List<t> list, @m80.l List<t> list2) {
        return new u(i11, list, list2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f53403a == uVar.f53403a && g0.g(this.f53404b, uVar.f53404b) && g0.g(this.f53405c, uVar.f53405c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f53403a) * 31;
        List<t> list = this.f53404b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<t> list2 = this.f53405c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "MallTabInfo(recommendType=" + this.f53403a + ", taobao=" + this.f53404b + ", mall=" + this.f53405c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53402e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMallTabInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallTabInfo.kt\ncom/baicizhan/biz/online/advertise_api/MallTabInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class a implements ts.f<u> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53406a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<t> f53407b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<t> f53408c;

        public a() {
            this.f53406a = null;
            this.f53407b = null;
            this.f53408c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u build() {
            Integer num = this.f53406a;
            if (num != null) {
                return new u(num.intValue(), this.f53407b, this.f53408c);
            }
            throw new IllegalStateException("Required field 'recommendType' is missing");
        }

        @m80.k
        public final a b(@m80.l List<t> list) {
            this.f53408c = list;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f53406a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.l List<t> list) {
            this.f53407b = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53406a = null;
            this.f53407b = null;
            this.f53408c = null;
        }

        public a(@m80.k u source) {
            g0.p(source, "source");
            this.f53406a = Integer.valueOf(source.f53403a);
            this.f53407b = source.f53404b;
            this.f53408c = source.f53405c;
        }
    }
}
