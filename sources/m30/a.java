package m30;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1#2:148\n295#3,2:149\n295#3,2:151\n774#3:153\n865#3,2:154\n1872#3,3:156\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:149,2\n57#1:151,2\n72#1:153\n72#1:154,2\n78#1:156,3\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final String a(@k String str) {
        g0.p(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' > charAt || charAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(charAt));
        sb2.append((CharSequence) str, 1, str.length());
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @k
    public static final String b(@k String str) {
        g0.p(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' > charAt || charAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        g0.o(substring, "substring(...)");
        return lowerCase + substring;
    }

    @k
    public static final String c(@k String str, boolean z11) {
        Integer num;
        g0.p(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        if (!d(str, 0, z11)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z11)) {
            if (z11) {
                return b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring = str.substring(1);
            g0.o(substring, "substring(...)");
            return lowerCase + substring;
        }
        Iterator<Integer> it = k0.z3(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!d(str, num.intValue(), z11)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return e(str, z11);
        }
        int intValue = num2.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String substring2 = str.substring(0, intValue);
        g0.o(substring2, "substring(...)");
        sb2.append(e(substring2, z11));
        String substring3 = str.substring(intValue);
        g0.o(substring3, "substring(...)");
        sb2.append(substring3);
        return sb2.toString();
    }

    public static final boolean d(String str, int i11, boolean z11) {
        char charAt = str.charAt(i11);
        return z11 ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    public static final String e(String str, boolean z11) {
        if (z11) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @k
    public static final String f(@k String str) {
        g0.p(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
