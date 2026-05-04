package at;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import u30.k0;
import u30.u0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f5483a = new a();

    @o
    @k
    public static final String a(@l Object obj) {
        if (obj == null) {
            return "null";
        }
        String num = Integer.toString(obj.hashCode(), kotlin.text.a.a(16));
        g0.o(num, "toString(...)");
        String upperCase = num.toUpperCase(Locale.ROOT);
        g0.o(upperCase, "toUpperCase(...)");
        return k0.m4(upperCase, 8, '0');
    }

    @o
    @k
    public static final String b(@l Collection<?> collection, @k String collectionType, @k String elementType) {
        g0.p(collectionType, "collectionType");
        g0.p(elementType, "elementType");
        if (collection == null) {
            return "null";
        }
        return collectionType + u0.f91709e + elementType + ">(size=" + collection.size() + ')';
    }

    @o
    @k
    public static final String c(@l Map<?, ?> map, @k String keyType, @k String valueType) {
        g0.p(keyType, "keyType");
        g0.p(valueType, "valueType");
        if (map == null) {
            return "null";
        }
        return "map<" + keyType + j2.O + valueType + ">(size=" + map.size() + ')';
    }
}
