package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y1 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f102285e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y1, a> f102286f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102287a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102288b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f102289c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f102290d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<y1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                builder.b(arrayList);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.c(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.e(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k y1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserRoadMapElementV2");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f102287a);
            protocol.N2();
            protocol.Q6(ma.b.f72894c, 2, (byte) 8);
            protocol.l5(struct.f102288b);
            protocol.N2();
            protocol.Q6("tag_id", 3, (byte) 8);
            protocol.l5(struct.f102289c);
            protocol.N2();
            protocol.Q6("options", 4, (byte) 15);
            protocol.y2((byte) 8, struct.f102290d.size());
            Iterator<Integer> it = struct.f102290d.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public y1(int i11, int i12, int i13, @m80.k List<Integer> options) {
        kotlin.jvm.internal.g0.p(options, "options");
        this.f102287a = i11;
        this.f102288b = i12;
        this.f102289c = i13;
        this.f102290d = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y1 f(y1 y1Var, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = y1Var.f102287a;
        }
        if ((i14 & 2) != 0) {
            i12 = y1Var.f102288b;
        }
        if ((i14 & 4) != 0) {
            i13 = y1Var.f102289c;
        }
        if ((i14 & 8) != 0) {
            list = y1Var.f102290d;
        }
        return y1Var.e(i11, i12, i13, list);
    }

    public final int a() {
        return this.f102287a;
    }

    public final int b() {
        return this.f102288b;
    }

    public final int c() {
        return this.f102289c;
    }

    @m80.k
    public final List<Integer> d() {
        return this.f102290d;
    }

    @m80.k
    public final y1 e(int i11, int i12, int i13, @m80.k List<Integer> options) {
        kotlin.jvm.internal.g0.p(options, "options");
        return new y1(i11, i12, i13, options);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f102287a == y1Var.f102287a && this.f102288b == y1Var.f102288b && this.f102289c == y1Var.f102289c && kotlin.jvm.internal.g0.g(this.f102290d, y1Var.f102290d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f102287a) * 31) + Integer.hashCode(this.f102288b)) * 31) + Integer.hashCode(this.f102289c)) * 31) + this.f102290d.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserRoadMapElementV2(topic_id=" + this.f102287a + ", word_level_id=" + this.f102288b + ", tag_id=" + this.f102289c + ", options=" + this.f102290d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102286f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserRoadMapElementV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRoadMapElementV2.kt\ncom/baicizhan/biz/online/user_study_api/UserRoadMapElementV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class a implements ts.f<y1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102291a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102292b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102293c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<Integer> f102294d;

        public a() {
            this.f102291a = null;
            this.f102292b = null;
            this.f102293c = null;
            this.f102294d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y1 build() {
            Integer num = this.f102291a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102292b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'word_level_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f102293c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'tag_id' is missing");
            }
            int intValue3 = num3.intValue();
            List<Integer> list = this.f102294d;
            if (list != null) {
                return new y1(intValue, intValue2, intValue3, list);
            }
            throw new IllegalStateException("Required field 'options' is missing");
        }

        @m80.k
        public final a b(@m80.k List<Integer> options) {
            kotlin.jvm.internal.g0.p(options, "options");
            this.f102294d = options;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f102293c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f102291a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f102292b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102291a = null;
            this.f102292b = null;
            this.f102293c = null;
            this.f102294d = null;
        }

        public a(@m80.k y1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102291a = Integer.valueOf(source.f102287a);
            this.f102292b = Integer.valueOf(source.f102288b);
            this.f102293c = Integer.valueOf(source.f102289c);
            this.f102294d = source.f102290d;
        }
    }
}
