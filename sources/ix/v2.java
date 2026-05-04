package ix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUrlDecodedParametersBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1#2:89\n1863#3:90\n1557#3:91\n1628#3,3:92\n1864#3:95\n1863#3:96\n1557#3:97\n1628#3,3:98\n1864#3:101\n*S KotlinDebug\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilderKt\n*L\n72#1:90\n76#1:91\n76#1:92,3\n72#1:95\n83#1:96\n85#1:97\n85#1:98,3\n83#1:101\n*E\n"})
/* loaded from: classes8.dex */
public final class v2 {
    public static final void b(xy.v1 v1Var, xy.v1 v1Var2) {
        for (String str : v1Var2.names()) {
            List<String> a11 = v1Var2.a(str);
            if (a11 == null) {
                a11 = a00.h0.J();
            }
            String k11 = f.k(str, 0, 0, false, null, 15, null);
            List<String> list = a11;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            v1Var.f(k11, arrayList);
        }
    }

    public static final void c(xy.v1 v1Var, xy.u1 u1Var) {
        for (String str : u1Var.names()) {
            List<String> a11 = u1Var.a(str);
            if (a11 == null) {
                a11 = a00.h0.J();
            }
            String n11 = f.n(str, false, 1, null);
            List<String> list = a11;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f.p((String) it.next()));
            }
            v1Var.f(n11, arrayList);
        }
    }

    @m80.k
    public static final p1 d(@m80.k xy.v1 parameters) {
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        q1 b11 = t1.b(0, 1, null);
        b(b11, parameters);
        return b11.build();
    }

    @m80.k
    public static final q1 e(@m80.k xy.u1 parameters) {
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        q1 b11 = t1.b(0, 1, null);
        c(b11, parameters);
        return b11;
    }
}
