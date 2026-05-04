package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f76429c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, a> f76430d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f76431a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f76432b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.b(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ImproveChapterDoneReq");
            protocol.Q6("chapter_id", 1, (byte) 10);
            protocol.q7(struct.f76431a);
            protocol.N2();
            protocol.Q6("progress", 2, (byte) 8);
            protocol.l5(struct.f76432b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public i(long j11, int i11) {
        this.f76431a = j11;
        this.f76432b = i11;
    }

    public static /* synthetic */ i d(i iVar, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = iVar.f76431a;
        }
        if ((i12 & 2) != 0) {
            i11 = iVar.f76432b;
        }
        return iVar.c(j11, i11);
    }

    public final long a() {
        return this.f76431a;
    }

    public final int b() {
        return this.f76432b;
    }

    @m80.k
    public final i c(long j11, int i11) {
        return new i(j11, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f76431a == iVar.f76431a && this.f76432b == iVar.f76432b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f76431a) * 31) + Integer.hashCode(this.f76432b);
    }

    @m80.k
    public String toString() {
        return "ImproveChapterDoneReq(chapter_id=" + this.f76431a + ", progress=" + this.f76432b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76430d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImproveChapterDoneReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImproveChapterDoneReq.kt\ncom/baicizhan/biz/online/course_api/ImproveChapterDoneReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
    public static final class a implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f76433a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f76434b;

        public a() {
            this.f76433a = null;
            this.f76434b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            Long l11 = this.f76433a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'chapter_id' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f76434b;
            if (num != null) {
                return new i(longValue, num.intValue());
            }
            throw new IllegalStateException("Required field 'progress' is missing");
        }

        @m80.k
        public final a b(long j11) {
            this.f76433a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f76434b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76433a = null;
            this.f76434b = null;
        }

        public a(@m80.k i source) {
            g0.p(source, "source");
            this.f76433a = Long.valueOf(source.f76431a);
            this.f76434b = Integer.valueOf(source.f76432b);
        }
    }
}
