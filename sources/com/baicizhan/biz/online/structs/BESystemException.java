package com.baicizhan.biz.online.structs;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import ts.f;
import w00.g;
import ws.d;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BESystemException extends Exception implements e {

    @g
    public final int code;

    @g
    @k
    public final String from_method;

    @g
    @k
    public final String from_service;

    @l
    @g
    public final String message_;

    @k
    public static final c Companion = new c(null);

    @g
    @k
    public static final ts.a<BESystemException, b> ADAPTER = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<BESystemException, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BESystemException read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BESystemException read(@k i protocol, @k b builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                d a62 = protocol.a6();
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
                            } else if (b11 == 11) {
                                builder.e(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
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
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k BESystemException struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BESystemException");
            protocol.Q6("from_service", 1, (byte) 11);
            protocol.p1(struct.from_service);
            protocol.N2();
            protocol.Q6("from_method", 2, (byte) 11);
            protocol.p1(struct.from_method);
            protocol.N2();
            protocol.Q6("code", 3, (byte) 8);
            protocol.l5(struct.code);
            protocol.N2();
            if (struct.message_ != null) {
                protocol.Q6("message", 4, (byte) 11);
                protocol.p1(struct.message_);
                protocol.N2();
            }
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

    public BESystemException(@k String from_service, @k String from_method, int i11, @l String str) {
        g0.p(from_service, "from_service");
        g0.p(from_method, "from_method");
        this.from_service = from_service;
        this.from_method = from_method;
        this.code = i11;
        this.message_ = str;
    }

    public static /* synthetic */ BESystemException copy$default(BESystemException bESystemException, String str, String str2, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bESystemException.from_service;
        }
        if ((i12 & 2) != 0) {
            str2 = bESystemException.from_method;
        }
        if ((i12 & 4) != 0) {
            i11 = bESystemException.code;
        }
        if ((i12 & 8) != 0) {
            str3 = bESystemException.message_;
        }
        return bESystemException.copy(str, str2, i11, str3);
    }

    @k
    public final String component1() {
        return this.from_service;
    }

    @k
    public final String component2() {
        return this.from_method;
    }

    public final int component3() {
        return this.code;
    }

    @l
    public final String component4() {
        return this.message_;
    }

    @k
    public final BESystemException copy(@k String from_service, @k String from_method, int i11, @l String str) {
        g0.p(from_service, "from_service");
        g0.p(from_method, "from_method");
        return new BESystemException(from_service, from_method, i11, str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BESystemException)) {
            return false;
        }
        BESystemException bESystemException = (BESystemException) obj;
        return g0.g(this.from_service, bESystemException.from_service) && g0.g(this.from_method, bESystemException.from_method) && this.code == bESystemException.code && g0.g(this.message_, bESystemException.message_);
    }

    public int hashCode() {
        int hashCode = ((((this.from_service.hashCode() * 31) + this.from_method.hashCode()) * 31) + Integer.hashCode(this.code)) * 31;
        String str = this.message_;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    @k
    public String toString() {
        return "BESystemException(from_service=" + this.from_service + ", from_method=" + this.from_method + ", code=" + this.code + ", message_=" + this.message_ + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        ADAPTER.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBESystemException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BESystemException.kt\ncom/baicizhan/biz/online/structs/BESystemException$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class b implements f<BESystemException> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f15948a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f15949b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f15950c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f15951d;

        public b() {
            this.f15948a = null;
            this.f15949b = null;
            this.f15950c = null;
            this.f15951d = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BESystemException build() {
            String str = this.f15948a;
            if (str == null) {
                throw new IllegalStateException("Required field 'from_service' is missing");
            }
            String str2 = this.f15949b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'from_method' is missing");
            }
            Integer num = this.f15950c;
            if (num != null) {
                return new BESystemException(str, str2, num.intValue(), this.f15951d);
            }
            throw new IllegalStateException("Required field 'code' is missing");
        }

        @k
        public final b b(int i11) {
            this.f15950c = Integer.valueOf(i11);
            return this;
        }

        @k
        public final b c(@k String from_method) {
            g0.p(from_method, "from_method");
            this.f15949b = from_method;
            return this;
        }

        @k
        public final b d(@k String from_service) {
            g0.p(from_service, "from_service");
            this.f15948a = from_service;
            return this;
        }

        @k
        public final b e(@l String str) {
            this.f15951d = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f15948a = null;
            this.f15949b = null;
            this.f15950c = null;
            this.f15951d = null;
        }

        public b(@k BESystemException source) {
            g0.p(source, "source");
            this.f15948a = source.from_service;
            this.f15949b = source.from_method;
            this.f15950c = Integer.valueOf(source.code);
            this.f15951d = source.message_;
        }
    }
}
