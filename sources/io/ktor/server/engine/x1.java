package io.ktor.server.engine;

import io.ktor.server.engine.a;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nEnvironmentUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnvironmentUtilsJvm.kt\nio/ktor/server/engine/EnvironmentUtilsJvmKt\n+ 2 EngineConnectorConfigJvm.kt\nio/ktor/server/engine/EngineConnectorConfigJvmKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,97:1\n20#2,2:98\n11483#3,9:100\n13409#3:109\n13410#3:111\n11492#3:112\n1#4:110\n1#4:113\n216#5,2:114\n*S KotlinDebug\n*F\n+ 1 EnvironmentUtilsJvm.kt\nio/ktor/server/engine/EnvironmentUtilsJvmKt\n*L\n51#1:98,2\n64#1:100,9\n64#1:109\n64#1:111\n64#1:112\n64#1:110\n77#1:114,2\n*E\n"})
/* loaded from: classes8.dex */
public final class x1 {
    public static final void c(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        System.clearProperty(key);
    }

    public static final void d(@m80.k d dVar, @m80.k String[] args) {
        ClassLoader classLoader;
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        kotlin.jvm.internal.g0.p(args, "args");
        ArrayList arrayList = new ArrayList();
        for (String str : args) {
            Pair<String, String> h11 = x.h(str, '=');
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
        String str2 = (String) a00.l1.B0(arrayList).get("-jar");
        URL url = str2 != null ? (u30.f0.J2(str2, "file:", false, 2, null) || u30.f0.J2(str2, "jrt:", false, 2, null) || u30.f0.J2(str2, "jar:", false, 2, null)) ? new URI(str2).toURL() : new File(str2).toURI().toURL() : null;
        if (url != null) {
            classLoader = new URLClassLoader(new URL[]{url}, zx.f.class.getClassLoader());
        } else {
            classLoader = zx.f.class.getClassLoader();
            kotlin.jvm.internal.g0.o(classLoader, "getClassLoader(...)");
        }
        dVar.e(classLoader);
    }

    public static final void e(@m80.k a.C0709a c0709a, @m80.k String host, @m80.k String sslPort, @m80.l String str, @m80.l final String str2, @m80.l final String str3, @m80.k String sslKeyAlias) {
        kotlin.jvm.internal.g0.p(c0709a, "<this>");
        kotlin.jvm.internal.g0.p(host, "host");
        kotlin.jvm.internal.g0.p(sslPort, "sslPort");
        kotlin.jvm.internal.g0.p(sslKeyAlias, "sslKeyAlias");
        if (str == null) {
            throw new IllegalArgumentException("SSL requires keystore: use -sslKeyStore=path or ktor.security.ssl.keyStore config");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("SSL requires keystore password: use ktor.security.ssl.keyStorePassword config");
        }
        if (str3 == null) {
            throw new IllegalArgumentException("SSL requires certificate password: use ktor.security.ssl.privateKeyPassword config");
        }
        File file = new File(str);
        if (!file.exists() && !file.isAbsolute()) {
            file = new File(".", str).getAbsoluteFile();
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            keyStore.load(fileInputStream, xy.v.b(str2));
            yz.g2 g2Var = yz.g2.f100423a;
            r00.b.a(fileInputStream, null);
            if (keyStore.getKey(sslKeyAlias, xy.v.b(str3)) == null) {
                throw new IllegalArgumentException(("The specified key " + sslKeyAlias + " doesn't exist in the key store " + str).toString());
            }
            kotlin.jvm.internal.g0.m(keyStore);
            x00.a aVar = new x00.a() { // from class: io.ktor.server.engine.v1
                @Override // x00.a
                public final Object invoke() {
                    char[] f11;
                    f11 = x1.f(str2);
                    return f11;
                }
            };
            x00.a aVar2 = new x00.a() { // from class: io.ktor.server.engine.w1
                @Override // x00.a
                public final Object invoke() {
                    char[] g11;
                    g11 = x1.g(str3);
                    return g11;
                }
            };
            List<o1> c11 = c0709a.c();
            t1 t1Var = new t1(keyStore, sslKeyAlias, aVar, aVar2);
            t1Var.k(host);
            t1Var.l(Integer.parseInt(sslPort));
            t1Var.q(file);
            c11.add(t1Var);
        } finally {
        }
    }

    public static final char[] f(String str) {
        return xy.v.b(str);
    }

    public static final char[] g(String str) {
        return xy.v.b(str);
    }

    @m80.l
    public static final String h(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return System.getProperty(key);
    }

    @m80.k
    public static final List<Pair<String, String>> i() {
        List j11 = a00.g0.j();
        Properties properties = System.getProperties();
        kotlin.jvm.internal.g0.o(properties, "getProperties(...)");
        for (Map.Entry entry : properties.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && u30.f0.J2(str, "ktor.", false, 2, null)) {
                Object value = entry.getValue();
                String str2 = value instanceof String ? (String) value : null;
                if (str2 != null) {
                    j11.add(yz.h1.a(str, str2));
                }
            }
        }
        return a00.g0.b(j11);
    }

    public static final void j(@m80.k String key, @m80.k String value) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(value, "value");
        System.setProperty(key, value);
    }
}
