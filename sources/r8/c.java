package r8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final b f83614k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<c, a> f83615l = new C1043c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f83616a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f83617b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f83618c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f83619d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final r8.b f83620e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final r8.b f83621f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @w00.g
    public final r8.b f83622g;

    /* renamed from: h, reason: collision with root package name */
    @l
    @w00.g
    public final r8.a f83623h;

    /* renamed from: i, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f83624i;

    /* renamed from: j, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f83625j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r8.c$c, reason: collision with other inner class name */
    public static final class C1043c implements ts.a<c, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol, @k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(r8.b.f83597j.read(protocol));
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(r8.b.f83597j.read(protocol));
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(r8.b.f83597j.read(protocol));
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(r8.a.f83591d.read(protocol));
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(Integer.valueOf(protocol.s8()));
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
        public void write(@k i protocol, @k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("NotifyResult");
            protocol.Q6("popup", 1, (byte) 8);
            protocol.l5(struct.f83616a);
            protocol.N2();
            protocol.Q6("reddot", 2, (byte) 8);
            protocol.l5(struct.f83617b);
            protocol.N2();
            protocol.Q6("service_url", 3, (byte) 11);
            protocol.p1(struct.f83618c);
            protocol.N2();
            protocol.Q6("count", 4, (byte) 8);
            protocol.l5(struct.f83619d);
            protocol.N2();
            if (struct.f83620e != null) {
                protocol.Q6("emergency", 5, (byte) 12);
                r8.b.f83597j.write(protocol, struct.f83620e);
                protocol.N2();
            }
            if (struct.f83621f != null) {
                protocol.Q6(q9.h.f81943g, 6, (byte) 12);
                r8.b.f83597j.write(protocol, struct.f83621f);
                protocol.N2();
            }
            if (struct.f83622g != null) {
                protocol.Q6("advNotify", 7, (byte) 12);
                r8.b.f83597j.write(protocol, struct.f83622g);
                protocol.N2();
            }
            if (struct.f83623h != null) {
                protocol.Q6("advFeedback", 8, (byte) 12);
                r8.a.f83591d.write(protocol, struct.f83623h);
                protocol.N2();
            }
            if (struct.f83624i != null) {
                protocol.Q6("latest_notify_time_sec", 9, (byte) 8);
                protocol.l5(struct.f83624i.intValue());
                protocol.N2();
            }
            if (struct.f83625j != null) {
                protocol.Q6("unread_count", 10, (byte) 8);
                protocol.l5(struct.f83625j.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public c(int i11, int i12, @k String service_url, int i13, @l r8.b bVar, @l r8.b bVar2, @l r8.b bVar3, @l r8.a aVar, @l Integer num, @l Integer num2) {
        g0.p(service_url, "service_url");
        this.f83616a = i11;
        this.f83617b = i12;
        this.f83618c = service_url;
        this.f83619d = i13;
        this.f83620e = bVar;
        this.f83621f = bVar2;
        this.f83622g = bVar3;
        this.f83623h = aVar;
        this.f83624i = num;
        this.f83625j = num2;
    }

    public static /* synthetic */ c l(c cVar, int i11, int i12, String str, int i13, r8.b bVar, r8.b bVar2, r8.b bVar3, r8.a aVar, Integer num, Integer num2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = cVar.f83616a;
        }
        if ((i14 & 2) != 0) {
            i12 = cVar.f83617b;
        }
        if ((i14 & 4) != 0) {
            str = cVar.f83618c;
        }
        if ((i14 & 8) != 0) {
            i13 = cVar.f83619d;
        }
        if ((i14 & 16) != 0) {
            bVar = cVar.f83620e;
        }
        if ((i14 & 32) != 0) {
            bVar2 = cVar.f83621f;
        }
        if ((i14 & 64) != 0) {
            bVar3 = cVar.f83622g;
        }
        if ((i14 & 128) != 0) {
            aVar = cVar.f83623h;
        }
        if ((i14 & 256) != 0) {
            num = cVar.f83624i;
        }
        if ((i14 & 512) != 0) {
            num2 = cVar.f83625j;
        }
        Integer num3 = num;
        Integer num4 = num2;
        r8.b bVar4 = bVar3;
        r8.a aVar2 = aVar;
        r8.b bVar5 = bVar;
        r8.b bVar6 = bVar2;
        return cVar.k(i11, i12, str, i13, bVar5, bVar6, bVar4, aVar2, num3, num4);
    }

    public final int a() {
        return this.f83616a;
    }

    @l
    public final Integer b() {
        return this.f83625j;
    }

    public final int c() {
        return this.f83617b;
    }

    @k
    public final String d() {
        return this.f83618c;
    }

    public final int e() {
        return this.f83619d;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f83616a == cVar.f83616a && this.f83617b == cVar.f83617b && g0.g(this.f83618c, cVar.f83618c) && this.f83619d == cVar.f83619d && g0.g(this.f83620e, cVar.f83620e) && g0.g(this.f83621f, cVar.f83621f) && g0.g(this.f83622g, cVar.f83622g) && g0.g(this.f83623h, cVar.f83623h) && g0.g(this.f83624i, cVar.f83624i) && g0.g(this.f83625j, cVar.f83625j);
    }

    @l
    public final r8.b f() {
        return this.f83620e;
    }

    @l
    public final r8.b g() {
        return this.f83621f;
    }

    @l
    public final r8.b h() {
        return this.f83622g;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f83616a) * 31) + Integer.hashCode(this.f83617b)) * 31) + this.f83618c.hashCode()) * 31) + Integer.hashCode(this.f83619d)) * 31;
        r8.b bVar = this.f83620e;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        r8.b bVar2 = this.f83621f;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        r8.b bVar3 = this.f83622g;
        int hashCode4 = (hashCode3 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        r8.a aVar = this.f83623h;
        int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f83624i;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f83625j;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @l
    public final r8.a i() {
        return this.f83623h;
    }

    @l
    public final Integer j() {
        return this.f83624i;
    }

    @k
    public final c k(int i11, int i12, @k String service_url, int i13, @l r8.b bVar, @l r8.b bVar2, @l r8.b bVar3, @l r8.a aVar, @l Integer num, @l Integer num2) {
        g0.p(service_url, "service_url");
        return new c(i11, i12, service_url, i13, bVar, bVar2, bVar3, aVar, num, num2);
    }

    @k
    public String toString() {
        return "NotifyResult(popup=" + this.f83616a + ", reddot=" + this.f83617b + ", service_url=" + this.f83618c + ", count=" + this.f83619d + ", emergency=" + this.f83620e + ", notify=" + this.f83621f + ", advNotify=" + this.f83622g + ", advFeedback=" + this.f83623h + ", latest_notify_time_sec=" + this.f83624i + ", unread_count=" + this.f83625j + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f83615l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNotifyResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotifyResult.kt\ncom/baicizhan/biz/online/notify/NotifyResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
    public static final class a implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f83626a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f83627b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f83628c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f83629d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public r8.b f83630e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public r8.b f83631f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public r8.b f83632g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public r8.a f83633h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public Integer f83634i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public Integer f83635j;

        public a() {
            this.f83626a = null;
            this.f83627b = null;
            this.f83628c = null;
            this.f83629d = null;
            this.f83630e = null;
            this.f83631f = null;
            this.f83632g = null;
            this.f83633h = null;
            this.f83634i = null;
            this.f83635j = null;
        }

        @k
        public final a a(@l r8.a aVar) {
            this.f83633h = aVar;
            return this;
        }

        @k
        public final a b(@l r8.b bVar) {
            this.f83632g = bVar;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f83626a;
            if (num == null) {
                throw new IllegalStateException("Required field 'popup' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f83627b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'reddot' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f83628c;
            if (str == null) {
                throw new IllegalStateException("Required field 'service_url' is missing");
            }
            Integer num3 = this.f83629d;
            if (num3 != null) {
                return new c(intValue, intValue2, str, num3.intValue(), this.f83630e, this.f83631f, this.f83632g, this.f83633h, this.f83634i, this.f83635j);
            }
            throw new IllegalStateException("Required field 'count' is missing");
        }

        @k
        public final a d(int i11) {
            this.f83629d = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a e(@l r8.b bVar) {
            this.f83630e = bVar;
            return this;
        }

        @k
        public final a f(@l Integer num) {
            this.f83634i = num;
            return this;
        }

        @k
        public final a g(@l r8.b bVar) {
            this.f83631f = bVar;
            return this;
        }

        @k
        public final a h(int i11) {
            this.f83626a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a i(int i11) {
            this.f83627b = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a j(@k String service_url) {
            g0.p(service_url, "service_url");
            this.f83628c = service_url;
            return this;
        }

        @k
        public final a k(@l Integer num) {
            this.f83635j = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f83626a = null;
            this.f83627b = null;
            this.f83628c = null;
            this.f83629d = null;
            this.f83630e = null;
            this.f83631f = null;
            this.f83632g = null;
            this.f83633h = null;
            this.f83634i = null;
            this.f83635j = null;
        }

        public a(@k c source) {
            g0.p(source, "source");
            this.f83626a = Integer.valueOf(source.f83616a);
            this.f83627b = Integer.valueOf(source.f83617b);
            this.f83628c = source.f83618c;
            this.f83629d = Integer.valueOf(source.f83619d);
            this.f83630e = source.f83620e;
            this.f83631f = source.f83621f;
            this.f83632g = source.f83622g;
            this.f83633h = source.f83623h;
            this.f83634i = source.f83624i;
            this.f83635j = source.f83625j;
        }
    }
}
