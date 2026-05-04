package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f93597e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y, a> f93598f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93599a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93600b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93601c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f93602d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<y, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 10) {
                                builder.e(Long.valueOf(protocol.T1()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.a(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.d(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k y struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserProfile");
            protocol.Q6("nickname", 1, (byte) 11);
            protocol.p1(struct.f93599a);
            protocol.N2();
            protocol.Q6("gender_id", 2, (byte) 8);
            protocol.l5(struct.f93600b);
            protocol.N2();
            if (struct.f93601c != null) {
                protocol.Q6(q9.h.f81940d, 3, (byte) 11);
                protocol.p1(struct.f93601c);
                protocol.N2();
            }
            if (struct.f93602d != null) {
                protocol.Q6("unique_id", 4, (byte) 10);
                protocol.q7(struct.f93602d.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public y(@m80.k String nickname, int i11, @m80.l String str, @m80.l Long l11) {
        g0.p(nickname, "nickname");
        this.f93599a = nickname;
        this.f93600b = i11;
        this.f93601c = str;
        this.f93602d = l11;
    }

    public static /* synthetic */ y f(y yVar, String str, int i11, String str2, Long l11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = yVar.f93599a;
        }
        if ((i12 & 2) != 0) {
            i11 = yVar.f93600b;
        }
        if ((i12 & 4) != 0) {
            str2 = yVar.f93601c;
        }
        if ((i12 & 8) != 0) {
            l11 = yVar.f93602d;
        }
        return yVar.e(str, i11, str2, l11);
    }

    @m80.k
    public final String a() {
        return this.f93599a;
    }

    public final int b() {
        return this.f93600b;
    }

    @m80.l
    public final String c() {
        return this.f93601c;
    }

    @m80.l
    public final Long d() {
        return this.f93602d;
    }

    @m80.k
    public final y e(@m80.k String nickname, int i11, @m80.l String str, @m80.l Long l11) {
        g0.p(nickname, "nickname");
        return new y(nickname, i11, str, l11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return g0.g(this.f93599a, yVar.f93599a) && this.f93600b == yVar.f93600b && g0.g(this.f93601c, yVar.f93601c) && g0.g(this.f93602d, yVar.f93602d);
    }

    public int hashCode() {
        int hashCode = ((this.f93599a.hashCode() * 31) + Integer.hashCode(this.f93600b)) * 31;
        String str = this.f93601c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f93602d;
        return hashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserProfile(nickname=" + this.f93599a + ", gender_id=" + this.f93600b + ", avatar=" + this.f93601c + ", unique_id=" + this.f93602d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93598f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserProfile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProfile.kt\ncom/baicizhan/biz/online/unified_user_service/UserProfile$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class a implements ts.f<y> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93603a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93604b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93605c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f93606d;

        public a() {
            this.f93603a = null;
            this.f93604b = null;
            this.f93605c = null;
            this.f93606d = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f93605c = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y build() {
            String str = this.f93603a;
            if (str == null) {
                throw new IllegalStateException("Required field 'nickname' is missing");
            }
            Integer num = this.f93604b;
            if (num != null) {
                return new y(str, num.intValue(), this.f93605c, this.f93606d);
            }
            throw new IllegalStateException("Required field 'gender_id' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f93604b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String nickname) {
            g0.p(nickname, "nickname");
            this.f93603a = nickname;
            return this;
        }

        @m80.k
        public final a e(@m80.l Long l11) {
            this.f93606d = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93603a = null;
            this.f93604b = null;
            this.f93605c = null;
            this.f93606d = null;
        }

        public a(@m80.k y source) {
            g0.p(source, "source");
            this.f93603a = source.f93599a;
            this.f93604b = Integer.valueOf(source.f93600b);
            this.f93605c = source.f93601c;
            this.f93606d = source.f93602d;
        }
    }
}
