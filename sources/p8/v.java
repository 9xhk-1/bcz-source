package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f80196c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<v, a> f80197d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80198a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80199b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<v, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 11) {
                        builder.a(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k v struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("GameUserBasicInfo");
            protocol.Q6("nickname", 1, (byte) 11);
            protocol.p1(struct.f80198a);
            protocol.N2();
            protocol.Q6(q9.h.f81940d, 2, (byte) 11);
            protocol.p1(struct.f80199b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public v(@m80.k String nickname, @m80.k String avatar) {
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        this.f80198a = nickname;
        this.f80199b = avatar;
    }

    public static /* synthetic */ v d(v vVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vVar.f80198a;
        }
        if ((i11 & 2) != 0) {
            str2 = vVar.f80199b;
        }
        return vVar.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f80198a;
    }

    @m80.k
    public final String b() {
        return this.f80199b;
    }

    @m80.k
    public final v c(@m80.k String nickname, @m80.k String avatar) {
        kotlin.jvm.internal.g0.p(nickname, "nickname");
        kotlin.jvm.internal.g0.p(avatar, "avatar");
        return new v(nickname, avatar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.g0.g(this.f80198a, vVar.f80198a) && kotlin.jvm.internal.g0.g(this.f80199b, vVar.f80199b);
    }

    public int hashCode() {
        return (this.f80198a.hashCode() * 31) + this.f80199b.hashCode();
    }

    @m80.k
    public String toString() {
        return "GameUserBasicInfo(nickname=" + this.f80198a + ", avatar=" + this.f80199b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80197d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameUserBasicInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameUserBasicInfo.kt\ncom/baicizhan/biz/online/game_api/GameUserBasicInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class a implements ts.f<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f80200a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f80201b;

        public a() {
            this.f80200a = null;
            this.f80201b = null;
        }

        @m80.k
        public final a a(@m80.k String avatar) {
            kotlin.jvm.internal.g0.p(avatar, "avatar");
            this.f80201b = avatar;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v build() {
            String str = this.f80200a;
            if (str == null) {
                throw new IllegalStateException("Required field 'nickname' is missing");
            }
            String str2 = this.f80201b;
            if (str2 != null) {
                return new v(str, str2);
            }
            throw new IllegalStateException("Required field 'avatar' is missing");
        }

        @m80.k
        public final a c(@m80.k String nickname) {
            kotlin.jvm.internal.g0.p(nickname, "nickname");
            this.f80200a = nickname;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80200a = null;
            this.f80201b = null;
        }

        public a(@m80.k v source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80200a = source.f80198a;
            this.f80201b = source.f80199b;
        }
    }
}
