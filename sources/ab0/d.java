package ab0;

import a00.l1;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import org.koin.core.error.NoPropertyFileFoundException;
import r00.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPropertyRegistryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyRegistryExt.kt\norg/koin/core/registry/PropertyRegistryExtKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,58:1\n216#2,2:59\n*S KotlinDebug\n*F\n+ 1 PropertyRegistryExt.kt\norg/koin/core/registry/PropertyRegistryExtKt\n*L\n18#1:59,2\n*E\n"})
/* loaded from: classes9.dex */
public final class d {
    public static final void a(@k c cVar) {
        g0.p(cVar, "<this>");
        cVar.d().w().a("load properties from environment");
        Properties properties = System.getProperties();
        g0.m(properties);
        d(cVar, properties);
        Map<String, String> map = System.getenv();
        g0.o(map, "getenv(...)");
        Properties properties2 = new Properties();
        properties2.putAll(map);
        d(cVar, properties2);
    }

    public static final void b(@k c cVar, @k String fileName) {
        String str;
        g0.p(cVar, "<this>");
        g0.p(fileName, "fileName");
        cVar.d().w().a("load properties from " + fileName);
        URL resource = na0.a.class.getResource(fileName);
        if (resource != null) {
            str = new String(u.j(resource), u30.d.f91599b);
        } else {
            str = null;
        }
        if (str == null) {
            throw new NoPropertyFileFoundException("No properties found for file '" + fileName + '\'');
        }
        cVar.d().w().e("loaded properties from file:'" + fileName + '\'');
        d(cVar, c(str));
    }

    public static final Properties c(String str) {
        Properties properties = new Properties();
        byte[] bytes = str.getBytes(u30.d.f91599b);
        g0.o(bytes, "getBytes(...)");
        properties.load(new ByteArrayInputStream(bytes));
        return properties;
    }

    public static final void d(@k c cVar, @k Properties properties) {
        g0.p(cVar, "<this>");
        g0.p(properties, "properties");
        cVar.d().w().a("load " + properties.size() + " properties");
        Map D0 = l1.D0(properties);
        g0.n(D0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        for (Map.Entry entry : D0.entrySet()) {
            cVar.f((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
