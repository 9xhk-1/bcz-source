package m8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f72614e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<d, b> f72615f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f72616a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f72617b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f72618c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final boolean f72619d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<d, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@k i protocol, @k b builder) {
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
                            } else if (b11 == 2) {
                                builder.c(protocol.readBool());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.e(protocol.s8());
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
        public void write(@k i protocol, @k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBUserFinishPlanInfo");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f72616a);
            protocol.N2();
            protocol.Q6("total_words_count", 2, (byte) 8);
            protocol.l5(struct.f72617b);
            protocol.N2();
            protocol.Q6("new_words_count", 3, (byte) 8);
            protocol.l5(struct.f72618c);
            protocol.N2();
            protocol.Q6("is_book_finished", 4, (byte) 2);
            protocol.a4(struct.f72619d);
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

    public d(int i11, int i12, int i13, boolean z11) {
        this.f72616a = i11;
        this.f72617b = i12;
        this.f72618c = i13;
        this.f72619d = z11;
    }

    public static /* synthetic */ d f(d dVar, int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = dVar.f72616a;
        }
        if ((i14 & 2) != 0) {
            i12 = dVar.f72617b;
        }
        if ((i14 & 4) != 0) {
            i13 = dVar.f72618c;
        }
        if ((i14 & 8) != 0) {
            z11 = dVar.f72619d;
        }
        return dVar.e(i11, i12, i13, z11);
    }

    public final int a() {
        return this.f72616a;
    }

    public final int b() {
        return this.f72617b;
    }

    public final int c() {
        return this.f72618c;
    }

    public final boolean d() {
        return this.f72619d;
    }

    @k
    public final d e(int i11, int i12, int i13, boolean z11) {
        return new d(i11, i12, i13, z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f72616a == dVar.f72616a && this.f72617b == dVar.f72617b && this.f72618c == dVar.f72618c && this.f72619d == dVar.f72619d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f72616a) * 31) + Integer.hashCode(this.f72617b)) * 31) + Integer.hashCode(this.f72618c)) * 31) + Boolean.hashCode(this.f72619d);
    }

    @k
    public String toString() {
        return "BBUserFinishPlanInfo(book_id=" + this.f72616a + ", total_words_count=" + this.f72617b + ", new_words_count=" + this.f72618c + ", is_book_finished=" + this.f72619d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f72615f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBUserFinishPlanInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBUserFinishPlanInfo.kt\ncom/baicizhan/biz/online/bs_users/BBUserFinishPlanInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
    public static final class b implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f72620a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f72621b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f72622c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Boolean f72623d;

        public b() {
            this.f72620a = null;
            this.f72621b = null;
            this.f72622c = null;
            this.f72623d = null;
        }

        @k
        public final b a(int i11) {
            this.f72620a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f72620a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f72621b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'total_words_count' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f72622c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'new_words_count' is missing");
            }
            int intValue3 = num3.intValue();
            Boolean bool = this.f72623d;
            if (bool != null) {
                return new d(intValue, intValue2, intValue3, bool.booleanValue());
            }
            throw new IllegalStateException("Required field 'is_book_finished' is missing");
        }

        @k
        public final b c(boolean z11) {
            this.f72623d = Boolean.valueOf(z11);
            return this;
        }

        @k
        public final b d(int i11) {
            this.f72622c = Integer.valueOf(i11);
            return this;
        }

        @k
        public final b e(int i11) {
            this.f72621b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f72620a = null;
            this.f72621b = null;
            this.f72622c = null;
            this.f72623d = null;
        }

        public b(@k d source) {
            g0.p(source, "source");
            this.f72620a = Integer.valueOf(source.f72616a);
            this.f72621b = Integer.valueOf(source.f72617b);
            this.f72622c = Integer.valueOf(source.f72618c);
            this.f72623d = Boolean.valueOf(source.f72619d);
        }
    }
}
