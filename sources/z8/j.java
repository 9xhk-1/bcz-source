package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f101639b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, a> f101640c = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<g2> f101641a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
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
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(g2.f101554g.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k j struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("DailyTask");
            if (struct.f101641a != null) {
                protocol.Q6("userTasks", 1, (byte) 15);
                protocol.y2((byte) 12, struct.f101641a.size());
                Iterator<g2> it = struct.f101641a.iterator();
                while (it.hasNext()) {
                    g2.f101554g.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j(@m80.l List<g2> list) {
        this.f101641a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j c(j jVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = jVar.f101641a;
        }
        return jVar.b(list);
    }

    @m80.l
    public final List<g2> a() {
        return this.f101641a;
    }

    @m80.k
    public final j b(@m80.l List<g2> list) {
        return new j(list);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && kotlin.jvm.internal.g0.g(this.f101641a, ((j) obj).f101641a);
    }

    public int hashCode() {
        List<g2> list = this.f101641a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @m80.k
    public String toString() {
        return "DailyTask(userTasks=" + this.f101641a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101640c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDailyTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyTask.kt\ncom/baicizhan/biz/online/user_study_api/DailyTask$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<g2> f101642a;

        public a() {
            this.f101642a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j build() {
            return new j(this.f101642a);
        }

        @m80.k
        public final a b(@m80.l List<g2> list) {
            this.f101642a = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101642a = null;
        }

        public a(@m80.k j source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101642a = source.f101641a;
        }
    }
}
