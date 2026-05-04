package ix;

import java.util.List;
import xy.u1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface p1 extends xy.u1 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f62972b = a.f62973a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f62973a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final p1 f62974b = g0.f62796d;

        @m80.k
        public final p1 a(@m80.k x00.l<? super q1, yz.g2> builder) {
            kotlin.jvm.internal.g0.p(builder, "builder");
            q1 b11 = t1.b(0, 1, null);
            builder.invoke(b11);
            return b11.build();
        }

        @m80.k
        public final p1 b() {
            return f62974b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public static boolean a(@m80.k p1 p1Var, @m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return u1.b.a(p1Var, name);
        }

        public static boolean b(@m80.k p1 p1Var, @m80.k String name, @m80.k String value) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(value, "value");
            return u1.b.b(p1Var, name, value);
        }

        public static void c(@m80.k p1 p1Var, @m80.k x00.p<? super String, ? super List<String>, yz.g2> body) {
            kotlin.jvm.internal.g0.p(body, "body");
            u1.b.c(p1Var, body);
        }

        @m80.l
        public static String d(@m80.k p1 p1Var, @m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return u1.b.d(p1Var, name);
        }
    }
}
