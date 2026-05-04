package t8;

import ix.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f90158f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, a> f90159g = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final y f90160a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final s f90161b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final t8.b f90162c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final u f90163d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<m> f90164e;

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
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 15) {
                                    ws.f v42 = protocol.v4();
                                    ArrayList arrayList = new ArrayList(v42.f96838b);
                                    int i11 = v42.f96838b;
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        arrayList.add(m.f90131e.read(protocol));
                                    }
                                    protocol.l8();
                                    builder.e(arrayList);
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 12) {
                                builder.d(u.f90271o.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 12) {
                            builder.c(t8.b.f89986e.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.b(s.f90241k.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.f(y.f90321g.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("TopicResourceV2");
            if (struct.f90160a != null) {
                protocol.Q6("zpk_info", 1, (byte) 12);
                y.f90321g.write(protocol, struct.f90160a);
                protocol.N2();
            }
            if (struct.f90161b != null) {
                protocol.Q6("dict", 2, (byte) 12);
                s.f90241k.write(protocol, struct.f90161b);
                protocol.N2();
            }
            if (struct.f90162c != null) {
                protocol.Q6("dict_wiki", 3, (byte) 12);
                t8.b.f89986e.write(protocol, struct.f90162c);
                protocol.N2();
            }
            if (struct.f90163d != null) {
                protocol.Q6(l1.a.f62928f, 4, (byte) 12);
                u.f90271o.write(protocol, struct.f90163d);
                protocol.N2();
            }
            if (struct.f90164e != null) {
                protocol.Q6("similar_words", 5, (byte) 15);
                protocol.y2((byte) 12, struct.f90164e.size());
                Iterator<m> it = struct.f90164e.iterator();
                while (it.hasNext()) {
                    m.f90131e.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public p(@m80.l y yVar, @m80.l s sVar, @m80.l t8.b bVar, @m80.l u uVar, @m80.l List<m> list) {
        this.f90160a = yVar;
        this.f90161b = sVar;
        this.f90162c = bVar;
        this.f90163d = uVar;
        this.f90164e = list;
    }

    public static /* synthetic */ p g(p pVar, y yVar, s sVar, t8.b bVar, u uVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            yVar = pVar.f90160a;
        }
        if ((i11 & 2) != 0) {
            sVar = pVar.f90161b;
        }
        if ((i11 & 4) != 0) {
            bVar = pVar.f90162c;
        }
        if ((i11 & 8) != 0) {
            uVar = pVar.f90163d;
        }
        if ((i11 & 16) != 0) {
            list = pVar.f90164e;
        }
        List list2 = list;
        t8.b bVar2 = bVar;
        return pVar.f(yVar, sVar, bVar2, uVar, list2);
    }

    @m80.l
    public final y a() {
        return this.f90160a;
    }

    @m80.l
    public final s b() {
        return this.f90161b;
    }

    @m80.l
    public final t8.b c() {
        return this.f90162c;
    }

    @m80.l
    public final u d() {
        return this.f90163d;
    }

    @m80.l
    public final List<m> e() {
        return this.f90164e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return g0.g(this.f90160a, pVar.f90160a) && g0.g(this.f90161b, pVar.f90161b) && g0.g(this.f90162c, pVar.f90162c) && g0.g(this.f90163d, pVar.f90163d) && g0.g(this.f90164e, pVar.f90164e);
    }

    @m80.k
    public final p f(@m80.l y yVar, @m80.l s sVar, @m80.l t8.b bVar, @m80.l u uVar, @m80.l List<m> list) {
        return new p(yVar, sVar, bVar, uVar, list);
    }

    public int hashCode() {
        y yVar = this.f90160a;
        int hashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        s sVar = this.f90161b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        t8.b bVar = this.f90162c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        u uVar = this.f90163d;
        int hashCode4 = (hashCode3 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        List<m> list = this.f90164e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "TopicResourceV2(zpk_info=" + this.f90160a + ", dict=" + this.f90161b + ", dict_wiki=" + this.f90162c + ", media=" + this.f90163d + ", similar_words=" + this.f90164e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90159g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTopicResourceV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicResourceV2.kt\ncom/baicizhan/biz/online/resource_api/TopicResourceV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    public static final class a implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public y f90165a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public s f90166b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public t8.b f90167c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public u f90168d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<m> f90169e;

        public a() {
            this.f90165a = null;
            this.f90166b = null;
            this.f90167c = null;
            this.f90168d = null;
            this.f90169e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p build() {
            return new p(this.f90165a, this.f90166b, this.f90167c, this.f90168d, this.f90169e);
        }

        @m80.k
        public final a b(@m80.l s sVar) {
            this.f90166b = sVar;
            return this;
        }

        @m80.k
        public final a c(@m80.l t8.b bVar) {
            this.f90167c = bVar;
            return this;
        }

        @m80.k
        public final a d(@m80.l u uVar) {
            this.f90168d = uVar;
            return this;
        }

        @m80.k
        public final a e(@m80.l List<m> list) {
            this.f90169e = list;
            return this;
        }

        @m80.k
        public final a f(@m80.l y yVar) {
            this.f90165a = yVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90165a = null;
            this.f90166b = null;
            this.f90167c = null;
            this.f90168d = null;
            this.f90169e = null;
        }

        public a(@m80.k p source) {
            g0.p(source, "source");
            this.f90165a = source.f90160a;
            this.f90166b = source.f90161b;
            this.f90167c = source.f90162c;
            this.f90168d = source.f90163d;
            this.f90169e = source.f90164e;
        }
    }
}
