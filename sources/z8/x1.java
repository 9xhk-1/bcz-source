package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x1 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f102265c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x1, a> f102266d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102267a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f102268b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<x1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k x1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserRoadMapElement");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f102267a);
            protocol.N2();
            protocol.Q6("options", 2, (byte) 15);
            protocol.y2((byte) 8, struct.f102268b.size());
            Iterator<Integer> it = struct.f102268b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public x1(int i11, @m80.k List<Integer> options) {
        kotlin.jvm.internal.g0.p(options, "options");
        this.f102267a = i11;
        this.f102268b = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x1 d(x1 x1Var, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = x1Var.f102267a;
        }
        if ((i12 & 2) != 0) {
            list = x1Var.f102268b;
        }
        return x1Var.c(i11, list);
    }

    public final int a() {
        return this.f102267a;
    }

    @m80.k
    public final List<Integer> b() {
        return this.f102268b;
    }

    @m80.k
    public final x1 c(int i11, @m80.k List<Integer> options) {
        kotlin.jvm.internal.g0.p(options, "options");
        return new x1(i11, options);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.f102267a == x1Var.f102267a && kotlin.jvm.internal.g0.g(this.f102268b, x1Var.f102268b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f102267a) * 31) + this.f102268b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserRoadMapElement(topic_id=" + this.f102267a + ", options=" + this.f102268b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102266d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserRoadMapElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRoadMapElement.kt\ncom/baicizhan/biz/online/user_study_api/UserRoadMapElement$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class a implements ts.f<x1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102269a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<Integer> f102270b;

        public a() {
            this.f102269a = null;
            this.f102270b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x1 build() {
            Integer num = this.f102269a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            List<Integer> list = this.f102270b;
            if (list != null) {
                return new x1(intValue, list);
            }
            throw new IllegalStateException("Required field 'options' is missing");
        }

        @m80.k
        public final a b(@m80.k List<Integer> options) {
            kotlin.jvm.internal.g0.p(options, "options");
            this.f102270b = options;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f102269a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102269a = null;
            this.f102270b = null;
        }

        public a(@m80.k x1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102269a = Integer.valueOf(source.f102267a);
            this.f102270b = source.f102268b;
        }
    }
}
