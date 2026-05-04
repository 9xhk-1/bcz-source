package g8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f53321d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, b> f53322e = new a();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<q> f53323a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<q> f53324b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<q> f53325c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<m, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol, @m80.k b builder) {
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
                                arrayList.add(q.f53352g.read(protocol));
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
                            arrayList2.add(q.f53352g.read(protocol));
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
                        arrayList3.add(q.f53352g.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BottomAdvInfos");
            if (struct.f53323a != null) {
                protocol.Q6("carousel_banner", 1, (byte) 15);
                protocol.y2((byte) 12, struct.f53323a.size());
                Iterator<q> it = struct.f53323a.iterator();
                while (it.hasNext()) {
                    q.f53352g.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f53324b != null) {
                protocol.Q6("horizontal_banner", 2, (byte) 15);
                protocol.y2((byte) 12, struct.f53324b.size());
                Iterator<q> it2 = struct.f53324b.iterator();
                while (it2.hasNext()) {
                    q.f53352g.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f53325c != null) {
                protocol.Q6("grid_ad", 3, (byte) 15);
                protocol.y2((byte) 12, struct.f53325c.size());
                Iterator<q> it3 = struct.f53325c.iterator();
                while (it3.hasNext()) {
                    q.f53352g.write(protocol, it3.next());
                }
                protocol.i5();
                protocol.N2();
            }
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

    public m(@m80.l List<q> list, @m80.l List<q> list2, @m80.l List<q> list3) {
        this.f53323a = list;
        this.f53324b = list2;
        this.f53325c = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m e(m mVar, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mVar.f53323a;
        }
        if ((i11 & 2) != 0) {
            list2 = mVar.f53324b;
        }
        if ((i11 & 4) != 0) {
            list3 = mVar.f53325c;
        }
        return mVar.d(list, list2, list3);
    }

    @m80.l
    public final List<q> a() {
        return this.f53323a;
    }

    @m80.l
    public final List<q> b() {
        return this.f53324b;
    }

    @m80.l
    public final List<q> c() {
        return this.f53325c;
    }

    @m80.k
    public final m d(@m80.l List<q> list, @m80.l List<q> list2, @m80.l List<q> list3) {
        return new m(list, list2, list3);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g0.g(this.f53323a, mVar.f53323a) && g0.g(this.f53324b, mVar.f53324b) && g0.g(this.f53325c, mVar.f53325c);
    }

    public int hashCode() {
        List<q> list = this.f53323a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<q> list2 = this.f53324b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<q> list3 = this.f53325c;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "BottomAdvInfos(carousel_banner=" + this.f53323a + ", horizontal_banner=" + this.f53324b + ", grid_ad=" + this.f53325c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53322e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBottomAdvInfos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomAdvInfos.kt\ncom/baicizhan/biz/online/advertise_api/BottomAdvInfos$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
    public static final class b implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<q> f53326a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<q> f53327b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<q> f53328c;

        public b() {
            this.f53326a = null;
            this.f53327b = null;
            this.f53328c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            return new m(this.f53326a, this.f53327b, this.f53328c);
        }

        @m80.k
        public final b b(@m80.l List<q> list) {
            this.f53326a = list;
            return this;
        }

        @m80.k
        public final b c(@m80.l List<q> list) {
            this.f53328c = list;
            return this;
        }

        @m80.k
        public final b d(@m80.l List<q> list) {
            this.f53327b = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53326a = null;
            this.f53327b = null;
            this.f53328c = null;
        }

        public b(@m80.k m source) {
            g0.p(source, "source");
            this.f53326a = source.f53323a;
            this.f53327b = source.f53324b;
            this.f53328c = source.f53325c;
        }
    }
}
