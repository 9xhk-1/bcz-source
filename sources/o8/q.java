package o8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f76501c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q, a> f76502d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76503a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<String> f76504b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(protocol.readString());
                        }
                        protocol.l8();
                        builder.b(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k q struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("QsInfo");
            protocol.Q6("qs", 1, (byte) 11);
            protocol.p1(struct.f76503a);
            protocol.N2();
            if (struct.f76504b != null) {
                protocol.Q6("options", 2, (byte) 15);
                protocol.y2((byte) 11, struct.f76504b.size());
                Iterator<String> it = struct.f76504b.iterator();
                while (it.hasNext()) {
                    protocol.p1(it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public q(@m80.k String qs2, @m80.l List<String> list) {
        g0.p(qs2, "qs");
        this.f76503a = qs2;
        this.f76504b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q d(q qVar, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qVar.f76503a;
        }
        if ((i11 & 2) != 0) {
            list = qVar.f76504b;
        }
        return qVar.c(str, list);
    }

    @m80.k
    public final String a() {
        return this.f76503a;
    }

    @m80.l
    public final List<String> b() {
        return this.f76504b;
    }

    @m80.k
    public final q c(@m80.k String qs2, @m80.l List<String> list) {
        g0.p(qs2, "qs");
        return new q(qs2, list);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return g0.g(this.f76503a, qVar.f76503a) && g0.g(this.f76504b, qVar.f76504b);
    }

    public int hashCode() {
        int hashCode = this.f76503a.hashCode() * 31;
        List<String> list = this.f76504b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @m80.k
    public String toString() {
        return "QsInfo(qs=" + this.f76503a + ", options=" + this.f76504b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76502d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nQsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QsInfo.kt\ncom/baicizhan/biz/online/course_api/QsInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
    public static final class a implements ts.f<q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76505a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<String> f76506b;

        public a() {
            this.f76505a = null;
            this.f76506b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q build() {
            String str = this.f76505a;
            if (str != null) {
                return new q(str, this.f76506b);
            }
            throw new IllegalStateException("Required field 'qs' is missing");
        }

        @m80.k
        public final a b(@m80.l List<String> list) {
            this.f76506b = list;
            return this;
        }

        @m80.k
        public final a c(@m80.k String qs2) {
            g0.p(qs2, "qs");
            this.f76505a = qs2;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76505a = null;
            this.f76506b = null;
        }

        public a(@m80.k q source) {
            g0.p(source, "source");
            this.f76505a = source.f76503a;
            this.f76506b = source.f76504b;
        }
    }
}
