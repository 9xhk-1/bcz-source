package n20;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFqNamesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n535#2:87\n520#2,6:88\n1#3:94\n*S KotlinDebug\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n*L\n73#1:87\n73#1:88,6\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74294a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f74370a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f74372c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f74371b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f74294a = iArr;
        }
    }

    @l
    public static final <V> V a(@m80.k c cVar, @m80.k Map<c, ? extends V> values) {
        Object next;
        g0.p(cVar, "<this>");
        g0.p(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<c, ? extends V> entry : values.entrySet()) {
            c key = entry.getKey();
            if (g0.g(cVar, key) || b(cVar, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean b(@m80.k c cVar, @m80.k c packageName) {
        g0.p(cVar, "<this>");
        g0.p(packageName, "packageName");
        return g0.g(f(cVar), packageName);
    }

    public static final boolean c(String str, String str2) {
        return f0.J2(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(@m80.k c cVar, @m80.k c packageName) {
        g0.p(cVar, "<this>");
        g0.p(packageName, "packageName");
        if (g0.g(cVar, packageName) || packageName.d()) {
            return true;
        }
        String b11 = cVar.b();
        g0.o(b11, "asString(...)");
        String b12 = packageName.b();
        g0.o(b12, "asString(...)");
        return c(b11, b12);
    }

    public static final boolean e(@l String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.f74370a;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            int i12 = a.f74294a[kVar.ordinal()];
            if (i12 == 1 || i12 == 2) {
                if (!Character.isJavaIdentifierStart(charAt)) {
                    return false;
                }
                kVar = k.f74371b;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (charAt == '.') {
                    kVar = k.f74372c;
                } else if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
            }
        }
        return kVar != k.f74372c;
    }

    @l
    public static final c f(@m80.k c cVar) {
        g0.p(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    @m80.k
    public static final c g(@m80.k c cVar, @m80.k c prefix) {
        g0.p(cVar, "<this>");
        g0.p(prefix, "prefix");
        if (!d(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (g0.g(cVar, prefix)) {
            c ROOT = c.f74284c;
            g0.o(ROOT, "ROOT");
            return ROOT;
        }
        String b11 = cVar.b();
        g0.o(b11, "asString(...)");
        String substring = b11.substring(prefix.b().length() + 1);
        g0.o(substring, "substring(...)");
        return new c(substring);
    }
}
