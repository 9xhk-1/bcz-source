package t8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f90078e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, a> f90079f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90080a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90081b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f90082c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f90083d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 15) {
                                ws.f v42 = protocol.v4();
                                ArrayList arrayList = new ArrayList(v42.f96838b);
                                int i11 = v42.f96838b;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    arrayList.add(Integer.valueOf(protocol.s8()));
                                }
                                protocol.l8();
                                builder.e(arrayList);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("RootItem");
            protocol.Q6("root_id", 1, (byte) 8);
            protocol.l5(struct.f90080a);
            protocol.N2();
            protocol.Q6("root_en", 2, (byte) 11);
            protocol.p1(struct.f90081b);
            protocol.N2();
            protocol.Q6("root_type", 3, (byte) 8);
            protocol.l5(struct.f90082c);
            protocol.N2();
            protocol.Q6("topic_ids", 4, (byte) 15);
            protocol.y2((byte) 8, struct.f90083d.size());
            Iterator<Integer> it = struct.f90083d.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public i(int i11, @m80.k String root_en, int i12, @m80.k List<Integer> topic_ids) {
        g0.p(root_en, "root_en");
        g0.p(topic_ids, "topic_ids");
        this.f90080a = i11;
        this.f90081b = root_en;
        this.f90082c = i12;
        this.f90083d = topic_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i f(i iVar, int i11, String str, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = iVar.f90080a;
        }
        if ((i13 & 2) != 0) {
            str = iVar.f90081b;
        }
        if ((i13 & 4) != 0) {
            i12 = iVar.f90082c;
        }
        if ((i13 & 8) != 0) {
            list = iVar.f90083d;
        }
        return iVar.e(i11, str, i12, list);
    }

    public final int a() {
        return this.f90080a;
    }

    @m80.k
    public final String b() {
        return this.f90081b;
    }

    public final int c() {
        return this.f90082c;
    }

    @m80.k
    public final List<Integer> d() {
        return this.f90083d;
    }

    @m80.k
    public final i e(int i11, @m80.k String root_en, int i12, @m80.k List<Integer> topic_ids) {
        g0.p(root_en, "root_en");
        g0.p(topic_ids, "topic_ids");
        return new i(i11, root_en, i12, topic_ids);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f90080a == iVar.f90080a && g0.g(this.f90081b, iVar.f90081b) && this.f90082c == iVar.f90082c && g0.g(this.f90083d, iVar.f90083d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f90080a) * 31) + this.f90081b.hashCode()) * 31) + Integer.hashCode(this.f90082c)) * 31) + this.f90083d.hashCode();
    }

    @m80.k
    public String toString() {
        return "RootItem(root_id=" + this.f90080a + ", root_en=" + this.f90081b + ", root_type=" + this.f90082c + ", topic_ids=" + this.f90083d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90079f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRootItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootItem.kt\ncom/baicizhan/biz/online/resource_api/RootItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"})
    public static final class a implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90084a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90085b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f90086c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<Integer> f90087d;

        public a() {
            this.f90084a = null;
            this.f90085b = null;
            this.f90086c = null;
            this.f90087d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            Integer num = this.f90084a;
            if (num == null) {
                throw new IllegalStateException("Required field 'root_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f90085b;
            if (str == null) {
                throw new IllegalStateException("Required field 'root_en' is missing");
            }
            Integer num2 = this.f90086c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'root_type' is missing");
            }
            int intValue2 = num2.intValue();
            List<Integer> list = this.f90087d;
            if (list != null) {
                return new i(intValue, str, intValue2, list);
            }
            throw new IllegalStateException("Required field 'topic_ids' is missing");
        }

        @m80.k
        public final a b(@m80.k String root_en) {
            g0.p(root_en, "root_en");
            this.f90085b = root_en;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f90084a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f90086c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k List<Integer> topic_ids) {
            g0.p(topic_ids, "topic_ids");
            this.f90087d = topic_ids;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90084a = null;
            this.f90085b = null;
            this.f90086c = null;
            this.f90087d = null;
        }

        public a(@m80.k i source) {
            g0.p(source, "source");
            this.f90084a = Integer.valueOf(source.f90080a);
            this.f90085b = source.f90081b;
            this.f90086c = Integer.valueOf(source.f90082c);
            this.f90087d = source.f90083d;
        }
    }
}
