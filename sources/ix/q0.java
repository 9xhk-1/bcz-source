package ix;

import java.util.List;
import xy.u1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface q0 extends xy.u1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f62976a = a.f62977a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f62977a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final q0 f62978b = f0.f62771d;

        @m80.k
        public final q0 a(@m80.k x00.l<? super r0, yz.g2> builder) {
            kotlin.jvm.internal.g0.p(builder, "builder");
            r0 r0Var = new r0(0, 1, null);
            builder.invoke(r0Var);
            return r0Var.build();
        }

        @m80.k
        public final q0 b() {
            return f62978b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public static boolean a(@m80.k q0 q0Var, @m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return u1.b.a(q0Var, name);
        }

        public static boolean b(@m80.k q0 q0Var, @m80.k String name, @m80.k String value) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(value, "value");
            return u1.b.b(q0Var, name, value);
        }

        public static void c(@m80.k q0 q0Var, @m80.k x00.p<? super String, ? super List<String>, yz.g2> body) {
            kotlin.jvm.internal.g0.p(body, "body");
            u1.b.c(q0Var, body);
        }

        @m80.l
        public static String d(@m80.k q0 q0Var, @m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return u1.b.d(q0Var, name);
        }
    }
}
