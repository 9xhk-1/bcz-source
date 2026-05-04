package o8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f76481d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, a> f76482e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final h f76483a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<p> f76484b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<t> f76485c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                arrayList.add(t.f76528g.read(protocol));
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
                            arrayList2.add(p.f76490g.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.c(arrayList2);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.b(h.f76422e.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("Message");
            protocol.Q6("heart_beat", 1, (byte) 12);
            h.f76422e.write(protocol, struct.f76483a);
            protocol.N2();
            if (struct.f76484b != null) {
                protocol.Q6("pro_contents", 2, (byte) 15);
                protocol.y2((byte) 12, struct.f76484b.size());
                Iterator<p> it = struct.f76484b.iterator();
                while (it.hasNext()) {
                    p.f76490g.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f76485c != null) {
                protocol.Q6("user_contents", 3, (byte) 15);
                protocol.y2((byte) 12, struct.f76485c.size());
                Iterator<t> it2 = struct.f76485c.iterator();
                while (it2.hasNext()) {
                    t.f76528g.write(protocol, it2.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public o(@m80.k h heart_beat, @m80.l List<p> list, @m80.l List<t> list2) {
        g0.p(heart_beat, "heart_beat");
        this.f76483a = heart_beat;
        this.f76484b = list;
        this.f76485c = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o e(o oVar, h hVar, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = oVar.f76483a;
        }
        if ((i11 & 2) != 0) {
            list = oVar.f76484b;
        }
        if ((i11 & 4) != 0) {
            list2 = oVar.f76485c;
        }
        return oVar.d(hVar, list, list2);
    }

    @m80.k
    public final h a() {
        return this.f76483a;
    }

    @m80.l
    public final List<p> b() {
        return this.f76484b;
    }

    @m80.l
    public final List<t> c() {
        return this.f76485c;
    }

    @m80.k
    public final o d(@m80.k h heart_beat, @m80.l List<p> list, @m80.l List<t> list2) {
        g0.p(heart_beat, "heart_beat");
        return new o(heart_beat, list, list2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return g0.g(this.f76483a, oVar.f76483a) && g0.g(this.f76484b, oVar.f76484b) && g0.g(this.f76485c, oVar.f76485c);
    }

    public int hashCode() {
        int hashCode = this.f76483a.hashCode() * 31;
        List<p> list = this.f76484b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<t> list2 = this.f76485c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "Message(heart_beat=" + this.f76483a + ", pro_contents=" + this.f76484b + ", user_contents=" + this.f76485c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76482e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\ncom/baicizhan/biz/online/course_api/Message$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class a implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public h f76486a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<p> f76487b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<t> f76488c;

        public a() {
            this.f76486a = null;
            this.f76487b = null;
            this.f76488c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o build() {
            h hVar = this.f76486a;
            if (hVar != null) {
                return new o(hVar, this.f76487b, this.f76488c);
            }
            throw new IllegalStateException("Required field 'heart_beat' is missing");
        }

        @m80.k
        public final a b(@m80.k h heart_beat) {
            g0.p(heart_beat, "heart_beat");
            this.f76486a = heart_beat;
            return this;
        }

        @m80.k
        public final a c(@m80.l List<p> list) {
            this.f76487b = list;
            return this;
        }

        @m80.k
        public final a d(@m80.l List<t> list) {
            this.f76488c = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76486a = null;
            this.f76487b = null;
            this.f76488c = null;
        }

        public a(@m80.k o source) {
            g0.p(source, "source");
            this.f76486a = source.f76483a;
            this.f76487b = source.f76484b;
            this.f76488c = source.f76485c;
        }
    }
}
