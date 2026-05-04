package r8;

import kc.o;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f83645f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<f, a> f83646g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final String f83647a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f83648b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f83649c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public final String f83650d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final String f83651e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@k i protocol, @k a builder) {
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
                                } else if (b11 == 11) {
                                    builder.c(protocol.readString());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.d(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.f(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.e(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PushConfirmParams");
            protocol.Q6("channel", 1, (byte) 11);
            protocol.p1(struct.f83647a);
            protocol.N2();
            protocol.Q6("message_id", 2, (byte) 11);
            protocol.p1(struct.f83648b);
            protocol.N2();
            protocol.Q6("model", 3, (byte) 11);
            protocol.p1(struct.f83649c);
            protocol.N2();
            protocol.Q6("manufacturer", 4, (byte) 11);
            protocol.p1(struct.f83650d);
            protocol.N2();
            if (struct.f83651e != null) {
                protocol.Q6(o.L, 5, (byte) 11);
                protocol.p1(struct.f83651e);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public f(@k String channel, @k String message_id, @k String model, @k String manufacturer, @l String str) {
        g0.p(channel, "channel");
        g0.p(message_id, "message_id");
        g0.p(model, "model");
        g0.p(manufacturer, "manufacturer");
        this.f83647a = channel;
        this.f83648b = message_id;
        this.f83649c = model;
        this.f83650d = manufacturer;
        this.f83651e = str;
    }

    public static /* synthetic */ f g(f fVar, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fVar.f83647a;
        }
        if ((i11 & 2) != 0) {
            str2 = fVar.f83648b;
        }
        if ((i11 & 4) != 0) {
            str3 = fVar.f83649c;
        }
        if ((i11 & 8) != 0) {
            str4 = fVar.f83650d;
        }
        if ((i11 & 16) != 0) {
            str5 = fVar.f83651e;
        }
        String str6 = str5;
        String str7 = str3;
        return fVar.f(str, str2, str7, str4, str6);
    }

    @k
    public final String a() {
        return this.f83647a;
    }

    @k
    public final String b() {
        return this.f83648b;
    }

    @k
    public final String c() {
        return this.f83649c;
    }

    @k
    public final String d() {
        return this.f83650d;
    }

    @l
    public final String e() {
        return this.f83651e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(this.f83647a, fVar.f83647a) && g0.g(this.f83648b, fVar.f83648b) && g0.g(this.f83649c, fVar.f83649c) && g0.g(this.f83650d, fVar.f83650d) && g0.g(this.f83651e, fVar.f83651e);
    }

    @k
    public final f f(@k String channel, @k String message_id, @k String model, @k String manufacturer, @l String str) {
        g0.p(channel, "channel");
        g0.p(message_id, "message_id");
        g0.p(model, "model");
        g0.p(manufacturer, "manufacturer");
        return new f(channel, message_id, model, manufacturer, str);
    }

    public int hashCode() {
        int hashCode = ((((((this.f83647a.hashCode() * 31) + this.f83648b.hashCode()) * 31) + this.f83649c.hashCode()) * 31) + this.f83650d.hashCode()) * 31;
        String str = this.f83651e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        return "PushConfirmParams(channel=" + this.f83647a + ", message_id=" + this.f83648b + ", model=" + this.f83649c + ", manufacturer=" + this.f83650d + ", hint=" + this.f83651e + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f83646g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPushConfirmParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushConfirmParams.kt\ncom/baicizhan/biz/online/notify/PushConfirmParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f83652a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f83653b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f83654c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f83655d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f83656e;

        public a() {
            this.f83652a = null;
            this.f83653b = null;
            this.f83654c = null;
            this.f83655d = null;
            this.f83656e = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            String str = this.f83652a;
            if (str == null) {
                throw new IllegalStateException("Required field 'channel' is missing");
            }
            String str2 = this.f83653b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'message_id' is missing");
            }
            String str3 = this.f83654c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'model' is missing");
            }
            String str4 = this.f83655d;
            if (str4 != null) {
                return new f(str, str2, str3, str4, this.f83656e);
            }
            throw new IllegalStateException("Required field 'manufacturer' is missing");
        }

        @k
        public final a b(@k String channel) {
            g0.p(channel, "channel");
            this.f83652a = channel;
            return this;
        }

        @k
        public final a c(@l String str) {
            this.f83656e = str;
            return this;
        }

        @k
        public final a d(@k String manufacturer) {
            g0.p(manufacturer, "manufacturer");
            this.f83655d = manufacturer;
            return this;
        }

        @k
        public final a e(@k String message_id) {
            g0.p(message_id, "message_id");
            this.f83653b = message_id;
            return this;
        }

        @k
        public final a f(@k String model) {
            g0.p(model, "model");
            this.f83654c = model;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f83652a = null;
            this.f83653b = null;
            this.f83654c = null;
            this.f83655d = null;
            this.f83656e = null;
        }

        public a(@k f source) {
            g0.p(source, "source");
            this.f83652a = source.f83647a;
            this.f83653b = source.f83648b;
            this.f83654c = source.f83649c;
            this.f83655d = source.f83650d;
            this.f83656e = source.f83651e;
        }
    }
}
