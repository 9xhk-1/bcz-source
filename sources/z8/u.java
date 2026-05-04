package z8;

import com.baicizhan.client.business.dataset.provider.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f102071e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u, a> f102072f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102073a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102074b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f102075c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final boolean f102076d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 2) {
                                builder.c(protocol.readBool());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.e(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k u struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ExperienceRankUser");
            protocol.Q6("nickname", 1, (byte) 11);
            protocol.p1(struct.f102073a);
            protocol.N2();
            protocol.Q6(q9.h.f81940d, 2, (byte) 11);
            protocol.p1(struct.f102074b);
            protocol.N2();
            protocol.Q6(a.b.C0242a.f16107c, 3, (byte) 8);
            protocol.l5(struct.f102075c);
            protocol.N2();
            protocol.Q6("me", 4, (byte) 2);
            protocol.a4(struct.f102076d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public u(@m80.k String nickname, @m80.k String avatar, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        this.f102073a = nickname;
        this.f102074b = avatar;
        this.f102075c = i11;
        this.f102076d = z11;
    }

    public static /* synthetic */ u f(u uVar, String str, String str2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = uVar.f102073a;
        }
        if ((i12 & 2) != 0) {
            str2 = uVar.f102074b;
        }
        if ((i12 & 4) != 0) {
            i11 = uVar.f102075c;
        }
        if ((i12 & 8) != 0) {
            z11 = uVar.f102076d;
        }
        return uVar.e(str, str2, i11, z11);
    }

    @m80.k
    public final String a() {
        return this.f102073a;
    }

    @m80.k
    public final String b() {
        return this.f102074b;
    }

    public final int c() {
        return this.f102075c;
    }

    public final boolean d() {
        return this.f102076d;
    }

    @m80.k
    public final u e(@m80.k String nickname, @m80.k String avatar, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        return new u(nickname, avatar, i11, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.g0.g(this.f102073a, uVar.f102073a) && kotlin.jvm.internal.g0.g(this.f102074b, uVar.f102074b) && this.f102075c == uVar.f102075c && this.f102076d == uVar.f102076d;
    }

    public int hashCode() {
        return (((((this.f102073a.hashCode() * 31) + this.f102074b.hashCode()) * 31) + Integer.hashCode(this.f102075c)) * 31) + Boolean.hashCode(this.f102076d);
    }

    @m80.k
    public String toString() {
        return "ExperienceRankUser(nickname=" + this.f102073a + ", avatar=" + this.f102074b + ", score=" + this.f102075c + ", me=" + this.f102076d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102072f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nExperienceRankUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperienceRankUser.kt\ncom/baicizhan/biz/online/user_study_api/ExperienceRankUser$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    public static final class a implements ts.f<u> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f102077a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f102078b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102079c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Boolean f102080d;

        public a() {
            this.f102077a = null;
            this.f102078b = null;
            this.f102079c = null;
            this.f102080d = null;
        }

        @m80.k
        public final a a(@m80.k String avatar) {
            kotlin.jvm.internal.g0.p(avatar, "avatar");
            this.f102078b = avatar;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u build() {
            String str = this.f102077a;
            if (str == null) {
                throw new IllegalStateException("Required field 'nickname' is missing");
            }
            String str2 = this.f102078b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'avatar' is missing");
            }
            Integer num = this.f102079c;
            if (num == null) {
                throw new IllegalStateException("Required field 'score' is missing");
            }
            int intValue = num.intValue();
            Boolean bool = this.f102080d;
            if (bool != null) {
                return new u(str, str2, intValue, bool.booleanValue());
            }
            throw new IllegalStateException("Required field 'me' is missing");
        }

        @m80.k
        public final a c(boolean z11) {
            this.f102080d = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String nickname) {
            kotlin.jvm.internal.g0.p(nickname, "nickname");
            this.f102077a = nickname;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f102079c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102077a = null;
            this.f102078b = null;
            this.f102079c = null;
            this.f102080d = null;
        }

        public a(@m80.k u source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102077a = source.f102073a;
            this.f102078b = source.f102074b;
            this.f102079c = Integer.valueOf(source.f102075c);
            this.f102080d = Boolean.valueOf(source.f102076d);
        }
    }
}
