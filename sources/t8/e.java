package t8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f90009c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, a> f90010d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90011a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f90012b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            arrayList.add(Integer.valueOf(protocol.s8()));
                        }
                        protocol.l8();
                        builder.c(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.a(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("GameWordReq");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f90011a);
            protocol.N2();
            protocol.Q6("topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, struct.f90012b.size());
            Iterator<Integer> it = struct.f90012b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e(int i11, @m80.k List<Integer> topic_ids) {
        g0.p(topic_ids, "topic_ids");
        this.f90011a = i11;
        this.f90012b = topic_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e d(e eVar, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.f90011a;
        }
        if ((i12 & 2) != 0) {
            list = eVar.f90012b;
        }
        return eVar.c(i11, list);
    }

    public final int a() {
        return this.f90011a;
    }

    @m80.k
    public final List<Integer> b() {
        return this.f90012b;
    }

    @m80.k
    public final e c(int i11, @m80.k List<Integer> topic_ids) {
        g0.p(topic_ids, "topic_ids");
        return new e(i11, topic_ids);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f90011a == eVar.f90011a && g0.g(this.f90012b, eVar.f90012b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f90011a) * 31) + this.f90012b.hashCode();
    }

    @m80.k
    public String toString() {
        return "GameWordReq(book_id=" + this.f90011a + ", topic_ids=" + this.f90012b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90010d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGameWordReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameWordReq.kt\ncom/baicizhan/biz/online/resource_api/GameWordReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90013a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<Integer> f90014b;

        public a() {
            this.f90013a = null;
            this.f90014b = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f90013a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f90013a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            List<Integer> list = this.f90014b;
            if (list != null) {
                return new e(intValue, list);
            }
            throw new IllegalStateException("Required field 'topic_ids' is missing");
        }

        @m80.k
        public final a c(@m80.k List<Integer> topic_ids) {
            g0.p(topic_ids, "topic_ids");
            this.f90014b = topic_ids;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90013a = null;
            this.f90014b = null;
        }

        public a(@m80.k e source) {
            g0.p(source, "source");
            this.f90013a = Integer.valueOf(source.f90011a);
            this.f90014b = source.f90012b;
        }
    }
}
