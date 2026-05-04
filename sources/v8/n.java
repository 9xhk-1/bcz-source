package v8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f93337f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n, a> f93338g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f93339a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93340b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f93341c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f93342d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<l> f93343e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                } else if (b11 == 15) {
                                    ws.f v42 = protocol.v4();
                                    ArrayList arrayList = new ArrayList(v42.f96838b);
                                    int i11 = v42.f96838b;
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        arrayList.add(l.f93324d.read(protocol));
                                    }
                                    protocol.l8();
                                    builder.c(arrayList);
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.d(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.f(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.e(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 2) {
                    builder.b(protocol.readBool());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k n struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SchoolMajorResult");
            protocol.Q6("has_next", 1, (byte) 2);
            protocol.a4(struct.f93339a);
            protocol.N2();
            protocol.Q6("page_num", 2, (byte) 8);
            protocol.l5(struct.f93340b);
            protocol.N2();
            protocol.Q6("page_size", 3, (byte) 8);
            protocol.l5(struct.f93341c);
            protocol.N2();
            protocol.Q6("number", 4, (byte) 8);
            protocol.l5(struct.f93342d);
            protocol.N2();
            if (struct.f93343e != null) {
                protocol.Q6("majors", 5, (byte) 15);
                protocol.y2((byte) 12, struct.f93343e.size());
                Iterator<l> it = struct.f93343e.iterator();
                while (it.hasNext()) {
                    l.f93324d.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public n(boolean z11, int i11, int i12, int i13, @m80.l List<l> list) {
        this.f93339a = z11;
        this.f93340b = i11;
        this.f93341c = i12;
        this.f93342d = i13;
        this.f93343e = list;
    }

    public static /* synthetic */ n g(n nVar, boolean z11, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = nVar.f93339a;
        }
        if ((i14 & 2) != 0) {
            i11 = nVar.f93340b;
        }
        if ((i14 & 4) != 0) {
            i12 = nVar.f93341c;
        }
        if ((i14 & 8) != 0) {
            i13 = nVar.f93342d;
        }
        if ((i14 & 16) != 0) {
            list = nVar.f93343e;
        }
        List list2 = list;
        int i15 = i12;
        return nVar.f(z11, i11, i15, i13, list2);
    }

    public final boolean a() {
        return this.f93339a;
    }

    public final int b() {
        return this.f93340b;
    }

    public final int c() {
        return this.f93341c;
    }

    public final int d() {
        return this.f93342d;
    }

    @m80.l
    public final List<l> e() {
        return this.f93343e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f93339a == nVar.f93339a && this.f93340b == nVar.f93340b && this.f93341c == nVar.f93341c && this.f93342d == nVar.f93342d && g0.g(this.f93343e, nVar.f93343e);
    }

    @m80.k
    public final n f(boolean z11, int i11, int i12, int i13, @m80.l List<l> list) {
        return new n(z11, i11, i12, i13, list);
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.f93339a) * 31) + Integer.hashCode(this.f93340b)) * 31) + Integer.hashCode(this.f93341c)) * 31) + Integer.hashCode(this.f93342d)) * 31;
        List<l> list = this.f93343e;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @m80.k
    public String toString() {
        return "SchoolMajorResult(has_next=" + this.f93339a + ", page_num=" + this.f93340b + ", page_size=" + this.f93341c + ", number=" + this.f93342d + ", majors=" + this.f93343e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93338g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSchoolMajorResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchoolMajorResult.kt\ncom/baicizhan/biz/online/unified_user_service/SchoolMajorResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
    public static final class a implements ts.f<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Boolean f93344a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93345b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f93346c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f93347d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<l> f93348e;

        public a() {
            this.f93344a = null;
            this.f93345b = null;
            this.f93346c = null;
            this.f93347d = null;
            this.f93348e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n build() {
            Boolean bool = this.f93344a;
            if (bool == null) {
                throw new IllegalStateException("Required field 'has_next' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Integer num = this.f93345b;
            if (num == null) {
                throw new IllegalStateException("Required field 'page_num' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f93346c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'page_size' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f93347d;
            if (num3 != null) {
                return new n(booleanValue, intValue, intValue2, num3.intValue(), this.f93348e);
            }
            throw new IllegalStateException("Required field 'number' is missing");
        }

        @m80.k
        public final a b(boolean z11) {
            this.f93344a = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a c(@m80.l List<l> list) {
            this.f93348e = list;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f93347d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f93345b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f93346c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93344a = null;
            this.f93345b = null;
            this.f93346c = null;
            this.f93347d = null;
            this.f93348e = null;
        }

        public a(@m80.k n source) {
            g0.p(source, "source");
            this.f93344a = Boolean.valueOf(source.f93339a);
            this.f93345b = Integer.valueOf(source.f93340b);
            this.f93346c = Integer.valueOf(source.f93341c);
            this.f93347d = Integer.valueOf(source.f93342d);
            this.f93348e = source.f93343e;
        }
    }
}
