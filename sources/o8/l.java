package o8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f76455c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f76456d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f76457a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<m> f76458b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            arrayList.add(m.f76462d.read(protocol));
                        }
                        protocol.l8();
                        builder.b(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("LiveAnswerItem");
            protocol.Q6("show_time", 1, (byte) 8);
            protocol.l5(struct.f76457a);
            protocol.N2();
            protocol.Q6("options", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f76458b.size());
            Iterator<m> it = struct.f76458b.iterator();
            while (it.hasNext()) {
                m.f76462d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public l(int i11, @m80.k List<m> options) {
        g0.p(options, "options");
        this.f76457a = i11;
        this.f76458b = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l d(l lVar, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = lVar.f76457a;
        }
        if ((i12 & 2) != 0) {
            list = lVar.f76458b;
        }
        return lVar.c(i11, list);
    }

    public final int a() {
        return this.f76457a;
    }

    @m80.k
    public final List<m> b() {
        return this.f76458b;
    }

    @m80.k
    public final l c(int i11, @m80.k List<m> options) {
        g0.p(options, "options");
        return new l(i11, options);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f76457a == lVar.f76457a && g0.g(this.f76458b, lVar.f76458b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f76457a) * 31) + this.f76458b.hashCode();
    }

    @m80.k
    public String toString() {
        return "LiveAnswerItem(show_time=" + this.f76457a + ", options=" + this.f76458b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76456d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLiveAnswerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveAnswerItem.kt\ncom/baicizhan/biz/online/course_api/LiveAnswerItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f76459a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<m> f76460b;

        public a() {
            this.f76459a = null;
            this.f76460b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            Integer num = this.f76459a;
            if (num == null) {
                throw new IllegalStateException("Required field 'show_time' is missing");
            }
            int intValue = num.intValue();
            List<m> list = this.f76460b;
            if (list != null) {
                return new l(intValue, list);
            }
            throw new IllegalStateException("Required field 'options' is missing");
        }

        @m80.k
        public final a b(@m80.k List<m> options) {
            g0.p(options, "options");
            this.f76460b = options;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f76459a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76459a = null;
            this.f76460b = null;
        }

        public a(@m80.k l source) {
            g0.p(source, "source");
            this.f76459a = Integer.valueOf(source.f76457a);
            this.f76460b = source.f76458b;
        }
    }
}
