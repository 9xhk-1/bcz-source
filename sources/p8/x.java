package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f80238c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x, a> f80239d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<w> f80240a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f80241b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<x, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 10) {
                        builder.c(protocol.T1());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(w.f80225d.read(protocol));
                    }
                    protocol.l8();
                    builder.b(arrayList);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k x struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("IslandInfo");
            protocol.Q6("islands", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f80240a.size());
            Iterator<w> it = struct.f80240a.iterator();
            while (it.hasNext()) {
                w.f80225d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("version", 2, (byte) 10);
            protocol.q7(struct.f80241b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public x(@m80.k List<w> islands, long j11) {
        kotlin.jvm.internal.g0.p(islands, "islands");
        this.f80240a = islands;
        this.f80241b = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x d(x xVar, List list, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = xVar.f80240a;
        }
        if ((i11 & 2) != 0) {
            j11 = xVar.f80241b;
        }
        return xVar.c(list, j11);
    }

    @m80.k
    public final List<w> a() {
        return this.f80240a;
    }

    public final long b() {
        return this.f80241b;
    }

    @m80.k
    public final x c(@m80.k List<w> islands, long j11) {
        kotlin.jvm.internal.g0.p(islands, "islands");
        return new x(islands, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.g0.g(this.f80240a, xVar.f80240a) && this.f80241b == xVar.f80241b;
    }

    public int hashCode() {
        return (this.f80240a.hashCode() * 31) + Long.hashCode(this.f80241b);
    }

    @m80.k
    public String toString() {
        return "IslandInfo(islands=" + this.f80240a + ", version=" + this.f80241b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80239d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIslandInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IslandInfo.kt\ncom/baicizhan/biz/online/game_api/IslandInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class a implements ts.f<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<w> f80242a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f80243b;

        public a() {
            this.f80242a = null;
            this.f80243b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x build() {
            List<w> list = this.f80242a;
            if (list == null) {
                throw new IllegalStateException("Required field 'islands' is missing");
            }
            Long l11 = this.f80243b;
            if (l11 != null) {
                return new x(list, l11.longValue());
            }
            throw new IllegalStateException("Required field 'version' is missing");
        }

        @m80.k
        public final a b(@m80.k List<w> islands) {
            kotlin.jvm.internal.g0.p(islands, "islands");
            this.f80242a = islands;
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f80243b = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80242a = null;
            this.f80243b = null;
        }

        public a(@m80.k x source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80242a = source.f80240a;
            this.f80243b = Long.valueOf(source.f80241b);
        }
    }
}
