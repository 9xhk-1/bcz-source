package io.ktor.server.routing;

import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d1 f61729a;

    public /* synthetic */ r1(d1 d1Var, kotlin.jvm.internal.v vVar) {
        this(d1Var);
    }

    @m80.k
    public abstract ix.p1 a();

    @m80.k
    public final d1 b() {
        return this.f61729a;
    }

    public r1(d1 d1Var) {
        this.f61729a = d1Var;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends r1 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f61730b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final ix.g1 f61731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k d1 route, @m80.k String reason, @m80.k ix.g1 errorStatusCode) {
            super(route, null);
            kotlin.jvm.internal.g0.p(route, "route");
            kotlin.jvm.internal.g0.p(reason, "reason");
            kotlin.jvm.internal.g0.p(errorStatusCode, "errorStatusCode");
            this.f61730b = reason;
            this.f61731c = errorStatusCode;
        }

        @Override // io.ktor.server.routing.r1
        public /* bridge */ /* synthetic */ ix.p1 a() {
            return (ix.p1) d();
        }

        @m80.k
        public final ix.g1 c() {
            return this.f61731c;
        }

        @m80.k
        public Void d() {
            throw new UnsupportedOperationException("Parameters are available only when routing resolve succeeds");
        }

        @m80.k
        public final String e() {
            return this.f61730b;
        }

        @m80.k
        public String toString() {
            return "FAILURE \"" + this.f61730b + "\" @ " + b();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @yz.n(level = DeprecationLevel.ERROR, message = "This will become internal in future releases.")
        public a(@m80.k d1 route, @m80.k String reason) {
            this(route, reason, ix.g1.f62797c.z());
            kotlin.jvm.internal.g0.p(route, "route");
            kotlin.jvm.internal.g0.p(reason, "reason");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends r1 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final ix.p1 f61732b;

        /* renamed from: c, reason: collision with root package name */
        public final double f61733c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k d1 route, @m80.k ix.p1 parameters, double d11) {
            super(route, null);
            kotlin.jvm.internal.g0.p(route, "route");
            kotlin.jvm.internal.g0.p(parameters, "parameters");
            this.f61732b = parameters;
            this.f61733c = d11;
        }

        @Override // io.ktor.server.routing.r1
        @m80.k
        public ix.p1 a() {
            return this.f61732b;
        }

        public final double c() {
            return this.f61733c;
        }

        @m80.k
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.alipay.sdk.m.f0.c.f10532p);
            if (a().isEmpty()) {
                str = "";
            } else {
                str = "; " + a();
            }
            sb2.append(str);
            sb2.append(" @ ");
            sb2.append(b());
            return sb2.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @yz.n(level = DeprecationLevel.ERROR, message = "This will become internal in future releases.")
        public b(@m80.k d1 route, @m80.k ix.p1 parameters) {
            this(route, parameters, 0.0d);
            kotlin.jvm.internal.g0.p(route, "route");
            kotlin.jvm.internal.g0.p(parameters, "parameters");
        }
    }
}
