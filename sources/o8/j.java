package o8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f76435f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, a> f76436g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76437a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f76438b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<r> f76439c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f76440d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f76441e;

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
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 8) {
                                    builder.e(Integer.valueOf(protocol.s8()));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.c(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(r.f76508h.read(protocol));
                            }
                            protocol.l8();
                            builder.d(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.b(protocol.T1());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.f(protocol.readString());
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
            protocol.g6("ImproveVideoInfo");
            protocol.Q6("video_url", 1, (byte) 11);
            protocol.p1(struct.f76437a);
            protocol.N2();
            protocol.Q6("duration", 2, (byte) 10);
            protocol.q7(struct.f76438b);
            protocol.N2();
            if (struct.f76439c != null) {
                protocol.Q6("questions", 3, (byte) 15);
                protocol.y2((byte) 12, struct.f76439c.size());
                Iterator<r> it = struct.f76439c.iterator();
                while (it.hasNext()) {
                    r.f76508h.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f76440d != null) {
                protocol.Q6("next_url", 4, (byte) 11);
                protocol.p1(struct.f76440d);
                protocol.N2();
            }
            if (struct.f76441e != null) {
                protocol.Q6("video_status", 5, (byte) 8);
                protocol.l5(struct.f76441e.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j(@m80.k String video_url, long j11, @m80.l List<r> list, @m80.l String str, @m80.l Integer num) {
        g0.p(video_url, "video_url");
        this.f76437a = video_url;
        this.f76438b = j11;
        this.f76439c = list;
        this.f76440d = str;
        this.f76441e = num;
    }

    public static /* synthetic */ j g(j jVar, String str, long j11, List list, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jVar.f76437a;
        }
        if ((i11 & 2) != 0) {
            j11 = jVar.f76438b;
        }
        if ((i11 & 4) != 0) {
            list = jVar.f76439c;
        }
        if ((i11 & 8) != 0) {
            str2 = jVar.f76440d;
        }
        if ((i11 & 16) != 0) {
            num = jVar.f76441e;
        }
        Integer num2 = num;
        List list2 = list;
        return jVar.f(str, j11, list2, str2, num2);
    }

    @m80.k
    public final String a() {
        return this.f76437a;
    }

    public final long b() {
        return this.f76438b;
    }

    @m80.l
    public final List<r> c() {
        return this.f76439c;
    }

    @m80.l
    public final String d() {
        return this.f76440d;
    }

    @m80.l
    public final Integer e() {
        return this.f76441e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f76437a, jVar.f76437a) && this.f76438b == jVar.f76438b && g0.g(this.f76439c, jVar.f76439c) && g0.g(this.f76440d, jVar.f76440d) && g0.g(this.f76441e, jVar.f76441e);
    }

    @m80.k
    public final j f(@m80.k String video_url, long j11, @m80.l List<r> list, @m80.l String str, @m80.l Integer num) {
        g0.p(video_url, "video_url");
        return new j(video_url, j11, list, str, num);
    }

    public int hashCode() {
        int hashCode = ((this.f76437a.hashCode() * 31) + Long.hashCode(this.f76438b)) * 31;
        List<r> list = this.f76439c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f76440d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f76441e;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "ImproveVideoInfo(video_url=" + this.f76437a + ", duration=" + this.f76438b + ", questions=" + this.f76439c + ", next_url=" + this.f76440d + ", video_status=" + this.f76441e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76436g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImproveVideoInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImproveVideoInfo.kt\ncom/baicizhan/biz/online/course_api/ImproveVideoInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76442a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f76443b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<r> f76444c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f76445d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f76446e;

        public a() {
            this.f76442a = null;
            this.f76443b = null;
            this.f76444c = null;
            this.f76445d = null;
            this.f76446e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j build() {
            String str = this.f76442a;
            if (str == null) {
                throw new IllegalStateException("Required field 'video_url' is missing");
            }
            Long l11 = this.f76443b;
            if (l11 != null) {
                return new j(str, l11.longValue(), this.f76444c, this.f76445d, this.f76446e);
            }
            throw new IllegalStateException("Required field 'duration' is missing");
        }

        @m80.k
        public final a b(long j11) {
            this.f76443b = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f76445d = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l List<r> list) {
            this.f76444c = list;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f76446e = num;
            return this;
        }

        @m80.k
        public final a f(@m80.k String video_url) {
            g0.p(video_url, "video_url");
            this.f76442a = video_url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76442a = null;
            this.f76443b = null;
            this.f76444c = null;
            this.f76445d = null;
            this.f76446e = null;
        }

        public a(@m80.k j source) {
            g0.p(source, "source");
            this.f76442a = source.f76437a;
            this.f76443b = Long.valueOf(source.f76438b);
            this.f76444c = source.f76439c;
            this.f76445d = source.f76440d;
            this.f76446e = source.f76441e;
        }
    }
}
