package o8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f76507g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r, a> f76508h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f76509a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76510b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76511c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f76512d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<o8.a> f76513e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<s> f76514f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<r, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol, @m80.k a builder) {
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
                int i11 = 0;
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.T1());
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(o8.a.f76358d.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.d(arrayList);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(s.f76522d.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.g(arrayList2);
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k r struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("QuestionItem");
            protocol.Q6("question_id", 1, (byte) 10);
            protocol.q7(struct.f76509a);
            protocol.N2();
            protocol.Q6("title", 2, (byte) 11);
            protocol.p1(struct.f76510b);
            protocol.N2();
            protocol.Q6("question", 3, (byte) 11);
            protocol.p1(struct.f76511c);
            protocol.N2();
            protocol.Q6("show_time", 4, (byte) 10);
            protocol.q7(struct.f76512d);
            protocol.N2();
            protocol.Q6("selects", 5, (byte) 15);
            protocol.y2((byte) 12, struct.f76513e.size());
            Iterator<o8.a> it = struct.f76513e.iterator();
            while (it.hasNext()) {
                o8.a.f76358d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("under_lines", 6, (byte) 15);
            protocol.y2((byte) 12, struct.f76514f.size());
            Iterator<s> it2 = struct.f76514f.iterator();
            while (it2.hasNext()) {
                s.f76522d.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public r(long j11, @m80.k String title, @m80.k String question, long j12, @m80.k List<o8.a> selects, @m80.k List<s> under_lines) {
        g0.p(title, "title");
        g0.p(question, "question");
        g0.p(selects, "selects");
        g0.p(under_lines, "under_lines");
        this.f76509a = j11;
        this.f76510b = title;
        this.f76511c = question;
        this.f76512d = j12;
        this.f76513e = selects;
        this.f76514f = under_lines;
    }

    public static /* synthetic */ r h(r rVar, long j11, String str, String str2, long j12, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = rVar.f76509a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            str = rVar.f76510b;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = rVar.f76511c;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            j12 = rVar.f76512d;
        }
        return rVar.g(j13, str3, str4, j12, (i11 & 16) != 0 ? rVar.f76513e : list, (i11 & 32) != 0 ? rVar.f76514f : list2);
    }

    public final long a() {
        return this.f76509a;
    }

    @m80.k
    public final String b() {
        return this.f76510b;
    }

    @m80.k
    public final String c() {
        return this.f76511c;
    }

    public final long d() {
        return this.f76512d;
    }

    @m80.k
    public final List<o8.a> e() {
        return this.f76513e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f76509a == rVar.f76509a && g0.g(this.f76510b, rVar.f76510b) && g0.g(this.f76511c, rVar.f76511c) && this.f76512d == rVar.f76512d && g0.g(this.f76513e, rVar.f76513e) && g0.g(this.f76514f, rVar.f76514f);
    }

    @m80.k
    public final List<s> f() {
        return this.f76514f;
    }

    @m80.k
    public final r g(long j11, @m80.k String title, @m80.k String question, long j12, @m80.k List<o8.a> selects, @m80.k List<s> under_lines) {
        g0.p(title, "title");
        g0.p(question, "question");
        g0.p(selects, "selects");
        g0.p(under_lines, "under_lines");
        return new r(j11, title, question, j12, selects, under_lines);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f76509a) * 31) + this.f76510b.hashCode()) * 31) + this.f76511c.hashCode()) * 31) + Long.hashCode(this.f76512d)) * 31) + this.f76513e.hashCode()) * 31) + this.f76514f.hashCode();
    }

    @m80.k
    public String toString() {
        return "QuestionItem(question_id=" + this.f76509a + ", title=" + this.f76510b + ", question=" + this.f76511c + ", show_time=" + this.f76512d + ", selects=" + this.f76513e + ", under_lines=" + this.f76514f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76508h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nQuestionItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionItem.kt\ncom/baicizhan/biz/online/course_api/QuestionItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
    public static final class a implements ts.f<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f76515a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f76516b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f76517c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f76518d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<o8.a> f76519e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<s> f76520f;

        public a() {
            this.f76515a = null;
            this.f76516b = null;
            this.f76517c = null;
            this.f76518d = null;
            this.f76519e = null;
            this.f76520f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r build() {
            Long l11 = this.f76515a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'question_id' is missing");
            }
            long longValue = l11.longValue();
            String str = this.f76516b;
            if (str == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str2 = this.f76517c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'question' is missing");
            }
            Long l12 = this.f76518d;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'show_time' is missing");
            }
            long longValue2 = l12.longValue();
            List<o8.a> list = this.f76519e;
            if (list == null) {
                throw new IllegalStateException("Required field 'selects' is missing");
            }
            List<s> list2 = this.f76520f;
            if (list2 != null) {
                return new r(longValue, str, str2, longValue2, list, list2);
            }
            throw new IllegalStateException("Required field 'under_lines' is missing");
        }

        @m80.k
        public final a b(@m80.k String question) {
            g0.p(question, "question");
            this.f76517c = question;
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f76515a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.k List<o8.a> selects) {
            g0.p(selects, "selects");
            this.f76519e = selects;
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f76518d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String title) {
            g0.p(title, "title");
            this.f76516b = title;
            return this;
        }

        @m80.k
        public final a g(@m80.k List<s> under_lines) {
            g0.p(under_lines, "under_lines");
            this.f76520f = under_lines;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76515a = null;
            this.f76516b = null;
            this.f76517c = null;
            this.f76518d = null;
            this.f76519e = null;
            this.f76520f = null;
        }

        public a(@m80.k r source) {
            g0.p(source, "source");
            this.f76515a = Long.valueOf(source.f76509a);
            this.f76516b = source.f76510b;
            this.f76517c = source.f76511c;
            this.f76518d = Long.valueOf(source.f76512d);
            this.f76519e = source.f76513e;
            this.f76520f = source.f76514f;
        }
    }
}
