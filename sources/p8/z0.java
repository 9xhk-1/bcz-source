package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80284d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z0, a> f80285e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f80286a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f80287b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<v0> f80288c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<z0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(v0.f80203l.read(protocol));
                            }
                            protocol.l8();
                            builder.d(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.c(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k z0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SubmitRecordReq");
            protocol.Q6("local_version", 1, (byte) 10);
            protocol.q7(struct.f80286a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f80287b);
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 3, (byte) 15);
            protocol.y2((byte) 12, struct.f80288c.size());
            Iterator<v0> it = struct.f80288c.iterator();
            while (it.hasNext()) {
                v0.f80203l.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public z0(long j11, int i11, @m80.k List<v0> words) {
        kotlin.jvm.internal.g0.p(words, "words");
        this.f80286a = j11;
        this.f80287b = i11;
        this.f80288c = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z0 e(z0 z0Var, long j11, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = z0Var.f80286a;
        }
        if ((i12 & 2) != 0) {
            i11 = z0Var.f80287b;
        }
        if ((i12 & 4) != 0) {
            list = z0Var.f80288c;
        }
        return z0Var.d(j11, i11, list);
    }

    public final long a() {
        return this.f80286a;
    }

    public final int b() {
        return this.f80287b;
    }

    @m80.k
    public final List<v0> c() {
        return this.f80288c;
    }

    @m80.k
    public final z0 d(long j11, int i11, @m80.k List<v0> words) {
        kotlin.jvm.internal.g0.p(words, "words");
        return new z0(j11, i11, words);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f80286a == z0Var.f80286a && this.f80287b == z0Var.f80287b && kotlin.jvm.internal.g0.g(this.f80288c, z0Var.f80288c);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f80286a) * 31) + Integer.hashCode(this.f80287b)) * 31) + this.f80288c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SubmitRecordReq(local_version=" + this.f80286a + ", book_id=" + this.f80287b + ", words=" + this.f80288c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80285e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSubmitRecordReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitRecordReq.kt\ncom/baicizhan/biz/online/game_api/SubmitRecordReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
    public static final class a implements ts.f<z0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f80289a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f80290b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<v0> f80291c;

        public a() {
            this.f80289a = null;
            this.f80290b = null;
            this.f80291c = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f80290b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z0 build() {
            Long l11 = this.f80289a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'local_version' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f80290b;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            List<v0> list = this.f80291c;
            if (list != null) {
                return new z0(longValue, intValue, list);
            }
            throw new IllegalStateException("Required field 'words' is missing");
        }

        @m80.k
        public final a c(long j11) {
            this.f80289a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.k List<v0> words) {
            kotlin.jvm.internal.g0.p(words, "words");
            this.f80291c = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80289a = null;
            this.f80290b = null;
            this.f80291c = null;
        }

        public a(@m80.k z0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80289a = Long.valueOf(source.f80286a);
            this.f80290b = Integer.valueOf(source.f80287b);
            this.f80291c = source.f80288c;
        }
    }
}
