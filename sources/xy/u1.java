package xy;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface u1 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f98657c = a.f98658a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f98658a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final u1 f98659b = new z1(false, null, 3, 0 == true ? 1 : 0);

        public static /* synthetic */ u1 b(a aVar, boolean z11, x00.l builder, int i11, Object obj) {
            int i12 = i11 & 1;
            int i13 = 0;
            if (i12 != 0) {
                z11 = false;
            }
            kotlin.jvm.internal.g0.p(builder, "builder");
            y1 y1Var = new y1(z11, i13, 2, null);
            builder.invoke(y1Var);
            return y1Var.build();
        }

        @m80.k
        public final u1 a(boolean z11, @m80.k x00.l<? super v1, g2> builder) {
            kotlin.jvm.internal.g0.p(builder, "builder");
            y1 y1Var = new y1(z11, 0, 2, null);
            builder.invoke(y1Var);
            return y1Var.build();
        }

        @m80.k
        public final u1 c() {
            return f98659b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValues$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n1863#2,2:417\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValues$DefaultImpls\n*L\n68#1:417,2\n*E\n"})
    public static final class b {
        public static boolean a(@m80.k u1 u1Var, @m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return u1Var.a(name) != null;
        }

        public static boolean b(@m80.k u1 u1Var, @m80.k String name, @m80.k String value) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(value, "value");
            List<String> a11 = u1Var.a(name);
            if (a11 != null) {
                return a11.contains(value);
            }
            return false;
        }

        public static void c(@m80.k u1 u1Var, @m80.k x00.p<? super String, ? super List<String>, g2> body) {
            kotlin.jvm.internal.g0.p(body, "body");
            Iterator<T> it = u1Var.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                body.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        @m80.l
        public static String d(@m80.k u1 u1Var, @m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            List<String> a11 = u1Var.a(name);
            if (a11 != null) {
                return (String) a00.r0.L2(a11);
            }
            return null;
        }
    }

    @m80.l
    List<String> a(@m80.k String str);

    boolean b();

    boolean c(@m80.k String str, @m80.k String str2);

    boolean contains(@m80.k String str);

    void d(@m80.k x00.p<? super String, ? super List<String>, g2> pVar);

    @m80.k
    Set<Map.Entry<String, List<String>>> entries();

    @m80.l
    String get(@m80.k String str);

    boolean isEmpty();

    @m80.k
    Set<String> names();
}
