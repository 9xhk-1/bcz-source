package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f76363e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, a> f76364f = new C0933b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f76365a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f76366b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76367c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f76368d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: o8.b$b, reason: collision with other inner class name */
    public static final class C0933b implements ts.a<b, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 10) {
                                builder.e(protocol.T1());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("CommentReq");
            protocol.Q6("course_id", 1, (byte) 8);
            protocol.l5(struct.f76365a);
            protocol.N2();
            protocol.Q6(ma.b.f72902e1, 2, (byte) 8);
            protocol.l5(struct.f76366b);
            protocol.N2();
            protocol.Q6("content", 3, (byte) 11);
            protocol.p1(struct.f76367c);
            protocol.N2();
            protocol.Q6("time", 4, (byte) 10);
            protocol.q7(struct.f76368d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public b(int i11, int i12, @m80.k String content, long j11) {
        g0.p(content, "content");
        this.f76365a = i11;
        this.f76366b = i12;
        this.f76367c = content;
        this.f76368d = j11;
    }

    public static /* synthetic */ b f(b bVar, int i11, int i12, String str, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f76365a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f76366b;
        }
        if ((i13 & 4) != 0) {
            str = bVar.f76367c;
        }
        if ((i13 & 8) != 0) {
            j11 = bVar.f76368d;
        }
        String str2 = str;
        return bVar.e(i11, i12, str2, j11);
    }

    public final int a() {
        return this.f76365a;
    }

    public final int b() {
        return this.f76366b;
    }

    @m80.k
    public final String c() {
        return this.f76367c;
    }

    public final long d() {
        return this.f76368d;
    }

    @m80.k
    public final b e(int i11, int i12, @m80.k String content, long j11) {
        g0.p(content, "content");
        return new b(i11, i12, content, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f76365a == bVar.f76365a && this.f76366b == bVar.f76366b && g0.g(this.f76367c, bVar.f76367c) && this.f76368d == bVar.f76368d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f76365a) * 31) + Integer.hashCode(this.f76366b)) * 31) + this.f76367c.hashCode()) * 31) + Long.hashCode(this.f76368d);
    }

    @m80.k
    public String toString() {
        return "CommentReq(course_id=" + this.f76365a + ", article_id=" + this.f76366b + ", content=" + this.f76367c + ", time=" + this.f76368d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76364f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCommentReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentReq.kt\ncom/baicizhan/biz/online/course_api/CommentReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
    public static final class a implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f76369a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f76370b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f76371c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f76372d;

        public a() {
            this.f76369a = null;
            this.f76370b = null;
            this.f76371c = null;
            this.f76372d = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f76370b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b build() {
            Integer num = this.f76369a;
            if (num == null) {
                throw new IllegalStateException("Required field 'course_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f76370b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'article_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f76371c;
            if (str == null) {
                throw new IllegalStateException("Required field 'content' is missing");
            }
            Long l11 = this.f76372d;
            if (l11 != null) {
                return new b(intValue, intValue2, str, l11.longValue());
            }
            throw new IllegalStateException("Required field 'time' is missing");
        }

        @m80.k
        public final a c(@m80.k String content) {
            g0.p(content, "content");
            this.f76371c = content;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f76369a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f76372d = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76369a = null;
            this.f76370b = null;
            this.f76371c = null;
            this.f76372d = null;
        }

        public a(@m80.k b source) {
            g0.p(source, "source");
            this.f76369a = Integer.valueOf(source.f76365a);
            this.f76370b = Integer.valueOf(source.f76366b);
            this.f76371c = source.f76367c;
            this.f76372d = Long.valueOf(source.f76368d);
        }
    }
}
