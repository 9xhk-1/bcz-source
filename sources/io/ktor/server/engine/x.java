package io.ktor.server.engine;

import ey.d;
import io.ktor.server.engine.a;
import io.ktor.server.engine.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCommandLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLine.kt\nio/ktor/server/engine/CommandLineKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 EngineConnectorConfig.kt\nio/ktor/server/engine/EngineConnectorConfigKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n11483#2,9:170\n13409#2:179\n13410#2:181\n11492#2:182\n1#3:180\n1#3:210\n51#4,2:183\n774#5:185\n865#5,2:186\n1557#5:188\n1628#5,3:189\n774#5:192\n865#5,2:193\n1557#5:195\n1628#5,3:196\n1557#5:199\n1628#5,3:200\n2669#5,7:203\n*S KotlinDebug\n*F\n+ 1 CommandLine.kt\nio/ktor/server/engine/CommandLineKt\n*L\n39#1:170,9\n39#1:179\n39#1:181\n39#1:182\n39#1:180\n80#1:183,2\n101#1:185\n101#1:186,2\n102#1:188\n102#1:189,3\n104#1:192\n104#1:193,2\n104#1:195\n104#1:196,3\n112#1:199\n112#1:200,3\n112#1:203,7\n*E\n"})
/* loaded from: classes8.dex */
public final class x {
    @m80.k
    public static final u c(@m80.k final String[] args) {
        kotlin.jvm.internal.g0.p(args, "args");
        ArrayList arrayList = new ArrayList();
        for (String str : args) {
            Pair<String, String> h11 = h(str, '=');
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
        final Map B0 = a00.l1.B0(arrayList);
        final ey.a f11 = f(arrayList);
        String a11 = ey.b.a(f11, y.f61463b);
        if (a11 == null) {
            a11 = "Application";
        }
        final Logger a12 = ez.a.a(a11);
        zx.v0 d11 = zx.j.d(f.b(new x00.l() { // from class: io.ktor.server.engine.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d12;
                d12 = x.d(Logger.this, args, f11, (d) obj);
                return d12;
            }
        }), new x00.l() { // from class: io.ktor.server.engine.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 e11;
                e11 = x.e(B0, f11, (zx.w0) obj);
                return e11;
            }
        });
        String str2 = (String) B0.get("-host");
        if (str2 == null && (str2 = ey.b.a(f11, y.f61464c)) == null) {
            str2 = "0.0.0.0";
        }
        String str3 = str2;
        String str4 = (String) B0.get("-port");
        if (str4 == null) {
            str4 = ey.b.a(f11, y.f61465d);
        }
        String str5 = (String) B0.get("-sslPort");
        if (str5 == null) {
            str5 = ey.b.a(f11, y.f61468g);
        }
        String str6 = str5;
        String str7 = (String) B0.get("-sslKeyStore");
        if (str7 == null) {
            str7 = ey.b.a(f11, y.f61469h);
        }
        String str8 = str7;
        String a13 = ey.b.a(f11, y.f61471j);
        String obj = a13 != null ? u30.k0.b6(a13).toString() : null;
        String a14 = ey.b.a(f11, y.f61472k);
        String obj2 = a14 != null ? u30.k0.b6(a14).toString() : null;
        String a15 = ey.b.a(f11, y.f61470i);
        if (a15 == null) {
            a15 = "mykey";
        }
        String str9 = a15;
        if (str4 == null && str6 == null) {
            throw new IllegalArgumentException("Neither port nor sslPort specified. Use command line options -port/-sslPort or configure connectors in application.conf");
        }
        k.a aVar = new k.a();
        if (str4 != null) {
            List<o1> c11 = aVar.c();
            n1 n1Var = new n1(null, 1, null);
            n1Var.k(str3);
            n1Var.l(Integer.parseInt(str4));
            c11.add(n1Var);
        }
        if (str6 != null) {
            x1.e(aVar, str3, str6, str8, obj, obj2, str9);
        }
        return new u(d11, aVar);
    }

    public static final yz.g2 d(Logger logger, String[] strArr, ey.a aVar, d applicationEnvironment) {
        kotlin.jvm.internal.g0.p(applicationEnvironment, "$this$applicationEnvironment");
        applicationEnvironment.g(logger);
        x1.d(applicationEnvironment, strArr);
        applicationEnvironment.f(aVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 e(Map map, ey.a aVar, zx.w0 serverConfig) {
        List<String> b11;
        kotlin.jvm.internal.g0.p(serverConfig, "$this$serverConfig");
        String str = (String) map.get("-path");
        if (str == null && (str = ey.b.a(aVar, y.f61467f)) == null) {
            str = "";
        }
        serverConfig.k(str);
        String a11 = ey.b.a(aVar, y.f61473l);
        serverConfig.i(a11 != null ? Boolean.parseBoolean(a11) : io.ktor.util.a.f61985a.b());
        String str2 = (String) map.get("-watch");
        if (str2 == null || (b11 = u30.k0.o5(str2, new String[]{","}, false, 0, 6, null)) == null) {
            b11 = ey.b.b(aVar, y.f61466e);
        }
        if (b11 != null) {
            serverConfig.l(b11);
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public static final ey.a f(@m80.k List<Pair<String, String>> args) {
        ey.a b11;
        kotlin.jvm.internal.g0.p(args, "args");
        List<Pair<String, String>> list = args;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : list) {
            if (u30.f0.J2((String) ((Pair) obj).getFirst(), "-P:", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(yz.h1.a(u30.k0.x4((String) pair.getFirst(), "-P:"), pair.getSecond()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (kotlin.jvm.internal.g0.g(((Pair) obj2).getFirst(), "-config")) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(a00.i0.d0(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add((String) ((Pair) it.next()).getSecond());
        }
        ey.i iVar = new ey.i(arrayList2);
        ey.i iVar2 = new ey.i(x1.i());
        int size = arrayList4.size();
        if (size == 0) {
            b11 = d.a.b(ey.d.f50228a, null, 1, null);
        } else if (size != 1) {
            ArrayList arrayList5 = new ArrayList(a00.i0.d0(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(ey.d.f50228a.a((String) it2.next()));
            }
            Iterator it3 = arrayList5.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = ey.n.b((ey.a) next, (ey.a) it3.next());
            }
            b11 = (ey.a) next;
        } else {
            b11 = ey.d.f50228a.a((String) a00.r0.m5(arrayList4));
        }
        return ey.n.b(ey.n.b(b11, iVar2), iVar);
    }

    public static final void g(@m80.k a.C0709a c0709a, @m80.k ey.a deploymentConfig) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        kotlin.jvm.internal.g0.p(c0709a, "<this>");
        kotlin.jvm.internal.g0.p(deploymentConfig, "deploymentConfig");
        ey.c d11 = deploymentConfig.d("callGroupSize");
        if (d11 != null && (string5 = d11.getString()) != null) {
            c0709a.h(Integer.parseInt(string5));
        }
        ey.c d12 = deploymentConfig.d("connectionGroupSize");
        if (d12 != null && (string4 = d12.getString()) != null) {
            c0709a.i(Integer.parseInt(string4));
        }
        ey.c d13 = deploymentConfig.d("workerGroupSize");
        if (d13 != null && (string3 = d13.getString()) != null) {
            c0709a.m(Integer.parseInt(string3));
        }
        ey.c d14 = deploymentConfig.d("shutdownGracePeriod");
        if (d14 != null && (string2 = d14.getString()) != null) {
            c0709a.k(Long.parseLong(string2));
        }
        ey.c d15 = deploymentConfig.d("shutdownTimeout");
        if (d15 == null || (string = d15.getString()) == null) {
            return;
        }
        c0709a.l(Long.parseLong(string));
    }

    @m80.l
    public static final Pair<String, String> h(@m80.k String str, char c11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        int I3 = u30.k0.I3(str, c11, 0, false, 6, null);
        if (I3 == -1) {
            return null;
        }
        return new Pair<>(u30.r0.A9(str, I3), u30.r0.d7(str, I3 + 1));
    }
}
