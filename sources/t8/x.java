package t8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f90314c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x, a> f90315d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<i> f90316a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<w> f90317b;

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
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    if (s11 != 4) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i12 = v42.f96838b;
                        while (i11 < i12) {
                            arrayList.add(w.f90309d.read(protocol));
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
                        arrayList2.add(i.f90079f.read(protocol));
                        i11++;
                    }
                    protocol.l8();
                    builder.b(arrayList2);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k x struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("WordRootRes");
            protocol.Q6("roots", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f90316a.size());
            Iterator<i> it = struct.f90316a.iterator();
            while (it.hasNext()) {
                i.f90079f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("word_pack_list", 4, (byte) 15);
            protocol.y2((byte) 12, struct.f90317b.size());
            Iterator<w> it2 = struct.f90317b.iterator();
            while (it2.hasNext()) {
                w.f90309d.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public x(@m80.k List<i> roots, @m80.k List<w> word_pack_list) {
        g0.p(roots, "roots");
        g0.p(word_pack_list, "word_pack_list");
        this.f90316a = roots;
        this.f90317b = word_pack_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x d(x xVar, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = xVar.f90316a;
        }
        if ((i11 & 2) != 0) {
            list2 = xVar.f90317b;
        }
        return xVar.c(list, list2);
    }

    @m80.k
    public final List<i> a() {
        return this.f90316a;
    }

    @m80.k
    public final List<w> b() {
        return this.f90317b;
    }

    @m80.k
    public final x c(@m80.k List<i> roots, @m80.k List<w> word_pack_list) {
        g0.p(roots, "roots");
        g0.p(word_pack_list, "word_pack_list");
        return new x(roots, word_pack_list);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return g0.g(this.f90316a, xVar.f90316a) && g0.g(this.f90317b, xVar.f90317b);
    }

    public int hashCode() {
        return (this.f90316a.hashCode() * 31) + this.f90317b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordRootRes(roots=" + this.f90316a + ", word_pack_list=" + this.f90317b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90315d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordRootRes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordRootRes.kt\ncom/baicizhan/biz/online/resource_api/WordRootRes$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
    public static final class a implements ts.f<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<i> f90318a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<w> f90319b;

        public a() {
            this.f90318a = null;
            this.f90319b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x build() {
            List<i> list = this.f90318a;
            if (list == null) {
                throw new IllegalStateException("Required field 'roots' is missing");
            }
            List<w> list2 = this.f90319b;
            if (list2 != null) {
                return new x(list, list2);
            }
            throw new IllegalStateException("Required field 'word_pack_list' is missing");
        }

        @m80.k
        public final a b(@m80.k List<i> roots) {
            g0.p(roots, "roots");
            this.f90318a = roots;
            return this;
        }

        @m80.k
        public final a c(@m80.k List<w> word_pack_list) {
            g0.p(word_pack_list, "word_pack_list");
            this.f90319b = word_pack_list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90318a = null;
            this.f90319b = null;
        }

        public a(@m80.k x source) {
            g0.p(source, "source");
            this.f90318a = source.f90316a;
            this.f90319b = source.f90317b;
        }
    }
}
