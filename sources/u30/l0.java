package u30;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1260#2,14:109\n1584#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: classes8.dex */
public class l0 extends k0 {
    @w00.j(name = "sumOfBigDecimal")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigDecimal A6(CharSequence charSequence, x00.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i11))));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final BigInteger B6(CharSequence charSequence, x00.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i11))));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static final SortedSet<Character> C6(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return (SortedSet) r0.H9(charSequence, new TreeSet());
    }

    @o00.f
    public static final char t6(CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.charAt(i11);
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character u6(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return r0.s8(charSequence);
    }

    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character v6(CharSequence charSequence, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        if (A3 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = selector.invoke(Character.valueOf(charAt));
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                R invoke2 = selector.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) < 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character w6(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return r0.u8(charSequence, comparator);
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character x6(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return r0.G8(charSequence);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character y6(CharSequence charSequence, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        if (A3 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = selector.invoke(Character.valueOf(charAt));
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                R invoke2 = selector.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) > 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character z6(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return r0.I8(charSequence, comparator);
    }
}
