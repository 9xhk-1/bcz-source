package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80244d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x0, a> f80245e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<v0> f80246a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<h1> f80247b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f80248c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<x0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 4) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 10) {
                            builder.d(protocol.T1());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i12 = v42.f96838b;
                        while (i11 < i12) {
                            arrayList.add(h1.f79859y.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.a(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v43 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v43.f96838b);
                    int i13 = v43.f96838b;
                    while (i11 < i13) {
                        arrayList2.add(v0.f80203l.read(protocol));
                        i11++;
                    }
                    protocol.l8();
                    builder.c(arrayList2);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k x0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyRecrodRsp");
            protocol.Q6("study_records", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f80246a.size());
            Iterator<v0> it = struct.f80246a.iterator();
            while (it.hasNext()) {
                v0.f80203l.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("ability", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f80247b.size());
            Iterator<h1> it2 = struct.f80247b.iterator();
            while (it2.hasNext()) {
                h1.f79859y.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("version", 4, (byte) 10);
            protocol.q7(struct.f80248c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public x0(@m80.k List<v0> study_records, @m80.k List<h1> ability, long j11) {
        kotlin.jvm.internal.g0.p(study_records, "study_records");
        kotlin.jvm.internal.g0.p(ability, "ability");
        this.f80246a = study_records;
        this.f80247b = ability;
        this.f80248c = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x0 e(x0 x0Var, List list, List list2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = x0Var.f80246a;
        }
        if ((i11 & 2) != 0) {
            list2 = x0Var.f80247b;
        }
        if ((i11 & 4) != 0) {
            j11 = x0Var.f80248c;
        }
        return x0Var.d(list, list2, j11);
    }

    @m80.k
    public final List<v0> a() {
        return this.f80246a;
    }

    @m80.k
    public final List<h1> b() {
        return this.f80247b;
    }

    public final long c() {
        return this.f80248c;
    }

    @m80.k
    public final x0 d(@m80.k List<v0> study_records, @m80.k List<h1> ability, long j11) {
        kotlin.jvm.internal.g0.p(study_records, "study_records");
        kotlin.jvm.internal.g0.p(ability, "ability");
        return new x0(study_records, ability, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.g0.g(this.f80246a, x0Var.f80246a) && kotlin.jvm.internal.g0.g(this.f80247b, x0Var.f80247b) && this.f80248c == x0Var.f80248c;
    }

    public int hashCode() {
        return (((this.f80246a.hashCode() * 31) + this.f80247b.hashCode()) * 31) + Long.hashCode(this.f80248c);
    }

    @m80.k
    public String toString() {
        return "StudyRecrodRsp(study_records=" + this.f80246a + ", ability=" + this.f80247b + ", version=" + this.f80248c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80245e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyRecrodRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecrodRsp.kt\ncom/baicizhan/biz/online/game_api/StudyRecrodRsp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a implements ts.f<x0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<v0> f80249a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<h1> f80250b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f80251c;

        public a() {
            this.f80249a = null;
            this.f80250b = null;
            this.f80251c = null;
        }

        @m80.k
        public final a a(@m80.k List<h1> ability) {
            kotlin.jvm.internal.g0.p(ability, "ability");
            this.f80250b = ability;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x0 build() {
            List<v0> list = this.f80249a;
            if (list == null) {
                throw new IllegalStateException("Required field 'study_records' is missing");
            }
            List<h1> list2 = this.f80250b;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'ability' is missing");
            }
            Long l11 = this.f80251c;
            if (l11 != null) {
                return new x0(list, list2, l11.longValue());
            }
            throw new IllegalStateException("Required field 'version' is missing");
        }

        @m80.k
        public final a c(@m80.k List<v0> study_records) {
            kotlin.jvm.internal.g0.p(study_records, "study_records");
            this.f80249a = study_records;
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f80251c = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80249a = null;
            this.f80250b = null;
            this.f80251c = null;
        }

        public a(@m80.k x0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80249a = source.f80246a;
            this.f80250b = source.f80247b;
            this.f80251c = Long.valueOf(source.f80248c);
        }
    }
}
