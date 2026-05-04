package h8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f58955e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, a> f58956f = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<g> f58957a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f58958b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f58959c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final h f58960d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                at.b.a(protocol, b11);
                            } else if (b11 == 12) {
                                builder.e(h.f58926j.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
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
                        arrayList.add(g.f58912h.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k j struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("TravelRewardInfo");
            if (struct.f58957a != null) {
                protocol.Q6("gift_list", 1, (byte) 15);
                protocol.y2((byte) 12, struct.f58957a.size());
                Iterator<g> it = struct.f58957a.iterator();
                while (it.hasNext()) {
                    g.f58912h.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f58958b != null) {
                protocol.Q6(w9.i.f96007a, 2, (byte) 8);
                protocol.l5(struct.f58958b.intValue());
                protocol.N2();
            }
            if (struct.f58959c != null) {
                protocol.Q6("credit", 3, (byte) 8);
                protocol.l5(struct.f58959c.intValue());
                protocol.N2();
            }
            if (struct.f58960d != null) {
                protocol.Q6("level_info", 4, (byte) 12);
                h.f58926j.write(protocol, struct.f58960d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j(@m80.l List<g> list, @m80.l Integer num, @m80.l Integer num2, @m80.l h hVar) {
        this.f58957a = list;
        this.f58958b = num;
        this.f58959c = num2;
        this.f58960d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j f(j jVar, List list, Integer num, Integer num2, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = jVar.f58957a;
        }
        if ((i11 & 2) != 0) {
            num = jVar.f58958b;
        }
        if ((i11 & 4) != 0) {
            num2 = jVar.f58959c;
        }
        if ((i11 & 8) != 0) {
            hVar = jVar.f58960d;
        }
        return jVar.e(list, num, num2, hVar);
    }

    @m80.l
    public final List<g> a() {
        return this.f58957a;
    }

    @m80.l
    public final Integer b() {
        return this.f58958b;
    }

    @m80.l
    public final Integer c() {
        return this.f58959c;
    }

    @m80.l
    public final h d() {
        return this.f58960d;
    }

    @m80.k
    public final j e(@m80.l List<g> list, @m80.l Integer num, @m80.l Integer num2, @m80.l h hVar) {
        return new j(list, num, num2, hVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f58957a, jVar.f58957a) && g0.g(this.f58958b, jVar.f58958b) && g0.g(this.f58959c, jVar.f58959c) && g0.g(this.f58960d, jVar.f58960d);
    }

    public int hashCode() {
        List<g> list = this.f58957a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f58958b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f58959c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        h hVar = this.f58960d;
        return hashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "TravelRewardInfo(gift_list=" + this.f58957a + ", exp=" + this.f58958b + ", credit=" + this.f58959c + ", level_info=" + this.f58960d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58956f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTravelRewardInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TravelRewardInfo.kt\ncom/baicizhan/biz/online/avatar_api/TravelRewardInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<g> f58961a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f58962b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f58963c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public h f58964d;

        public a() {
            this.f58961a = null;
            this.f58962b = null;
            this.f58963c = null;
            this.f58964d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j build() {
            return new j(this.f58961a, this.f58962b, this.f58963c, this.f58964d);
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f58963c = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f58962b = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l List<g> list) {
            this.f58961a = list;
            return this;
        }

        @m80.k
        public final a e(@m80.l h hVar) {
            this.f58964d = hVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58961a = null;
            this.f58962b = null;
            this.f58963c = null;
            this.f58964d = null;
        }

        public a(@m80.k j source) {
            g0.p(source, "source");
            this.f58961a = source.f58957a;
            this.f58962b = source.f58958b;
            this.f58963c = source.f58959c;
            this.f58964d = source.f58960d;
        }
    }
}
