package tx;

import java.lang.reflect.Method;
import java.net.SocketAddress;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f1 extends l0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f91076b = new a(0 == true ? 1 : 0);

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static final Class<?> f91077c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final SocketAddress f91078a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final Class<?> b() {
            Class<?> cls = f1.f91077c;
            if (cls != null) {
                return cls;
            }
            throw new IllegalStateException("Unix domain sockets are unsupported before Java 16.");
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls = null;
        try {
            cls = Class.forName(m0.f91149a);
        } catch (ClassNotFoundException unused) {
        }
        f91077c = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(@m80.k SocketAddress address) {
        super(null);
        kotlin.jvm.internal.g0.p(address, "address");
        this.f91078a = address;
        if (!kotlin.jvm.internal.g0.g(a().getClass().getName(), m0.f91149a)) {
            throw new IllegalStateException("address should be java.net.UnixDomainSocketAddress");
        }
    }

    public static /* synthetic */ f1 e(f1 f1Var, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f1Var.f();
        }
        return f1Var.d(str);
    }

    @Override // tx.l0
    @m80.k
    public SocketAddress a() {
        return this.f91078a;
    }

    @m80.k
    public final String c() {
        return f();
    }

    @m80.k
    public final f1 d(@m80.k String path) {
        kotlin.jvm.internal.g0.p(path, "path");
        return new f1(path);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.g0.g(f1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type io.ktor.network.sockets.UnixSocketAddress");
        return kotlin.jvm.internal.g0.g(a(), ((f1) obj).a());
    }

    @m80.k
    public final String f() {
        Method method = f91076b.b().getMethod("getPath", null);
        kotlin.jvm.internal.g0.o(method, "getMethod(...)");
        return method.invoke(a(), null).toString();
    }

    public int hashCode() {
        return a().hashCode();
    }

    @m80.k
    public String toString() {
        return a().toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f1(@m80.k java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r4, r0)
            tx.f1$a r0 = tx.f1.f91076b
            java.lang.Class r0 = tx.f1.a.a(r0)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "of"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object r4 = r0.invoke(r1, r4)
            java.lang.String r0 = "null cannot be cast to non-null type java.net.SocketAddress"
            kotlin.jvm.internal.g0.n(r4, r0)
            java.net.SocketAddress r4 = (java.net.SocketAddress) r4
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.f1.<init>(java.lang.String):void");
    }
}
