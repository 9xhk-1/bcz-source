package u30;

import a00.a1;
import a00.b1;
import a00.k1;
import a00.v1;
import a00.w1;
import a00.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.random.Random;
import yz.g2;
import yz.h1;
import yz.s1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2565:1\n130#1,2:2566\n221#1,5:2568\n507#1,5:2574\n507#1,5:2579\n467#1:2584\n1188#1,2:2585\n468#1,2:2587\n1190#1:2589\n470#1:2590\n467#1:2591\n1188#1,2:2592\n468#1,2:2594\n1190#1:2596\n470#1:2597\n1188#1,3:2598\n497#1,2:2601\n497#1,2:2603\n755#1,4:2605\n724#1,4:2609\n740#1,4:2613\n787#1,4:2617\n887#1,5:2621\n928#1,3:2626\n931#1,3:2636\n946#1,3:2639\n949#1,3:2649\n1046#1,3:2666\n1016#1,4:2669\n1005#1:2673\n1188#1,2:2674\n1190#1:2677\n1006#1:2678\n1188#1,3:2679\n1037#1:2682\n1179#1:2683\n1180#1:2685\n1038#1:2686\n1179#1,2:2687\n1188#1,3:2689\n2069#1,2:2692\n2071#1,6:2695\n2093#1,2:2701\n2095#1,6:2704\n2510#1,6:2710\n2540#1,7:2716\n1#2:2573\n1#2:2676\n1#2:2684\n1#2:2694\n1#2:2703\n382#3,7:2629\n382#3,7:2642\n382#3,7:2652\n382#3,7:2659\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n56#1:2566,2\n66#1:2568,5\n425#1:2574,5\n434#1:2579,5\n445#1:2584\n445#1:2585,2\n445#1:2587,2\n445#1:2589\n445#1:2590\n456#1:2591\n456#1:2592,2\n456#1:2594,2\n456#1:2596\n456#1:2597\n467#1:2598,3\n479#1:2601,2\n488#1:2603,2\n682#1:2605,4\n697#1:2609,4\n711#1:2613,4\n774#1:2617,4\n847#1:2621,5\n903#1:2626,3\n903#1:2636,3\n916#1:2639,3\n916#1:2649,3\n975#1:2666,3\n985#1:2669,4\n995#1:2673\n995#1:2674,2\n995#1:2677\n995#1:2678\n1005#1:2679,3\n1029#1:2682\n1029#1:2683\n1029#1:2685\n1029#1:2686\n1037#1:2687,2\n1875#1:2689,3\n2163#1:2692,2\n2163#1:2695,6\n2180#1:2701,2\n2180#1:2704,6\n2499#1:2710,6\n2527#1:2716,7\n995#1:2676\n1029#1:2684\n2163#1:2694\n2180#1:2703\n903#1:2629,7\n916#1:2642,7\n930#1:2652,7\n948#1:2659,7\n*E\n"})
/* loaded from: classes8.dex */
public class r0 extends l0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,70:1\n2554#2:71\n*E\n"})
    public static final class a implements Iterable<Character>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f91698a;

        public a(CharSequence charSequence) {
            this.f91698a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return k0.U3(this.f91698a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,731:1\n2562#2:732\n*E\n"})
    public static final class b implements q30.m<Character> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f91699a;

        public b(CharSequence charSequence) {
            this.f91699a = charSequence;
        }

        @Override // q30.m
        public Iterator<Character> iterator() {
            return k0.U3(this.f91699a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt$groupingBy$1\n*L\n1#1,2565:1\n*E\n"})
    public static final class c<K> implements a00.w0<Character, K> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f91700a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<Character, K> f91701b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(CharSequence charSequence, x00.l<? super Character, ? extends K> lVar) {
            this.f91700a = charSequence;
            this.f91701b = lVar;
        }

        @Override // a00.w0
        public /* bridge */ /* synthetic */ Object a(Character ch2) {
            return c(ch2.charValue());
        }

        @Override // a00.w0
        public Iterator<Character> b() {
            return k0.U3(this.f91700a);
        }

        public K c(char c11) {
            return this.f91701b.invoke(Character.valueOf(c11));
        }
    }

    @y0(version = "1.5")
    @o00.f
    public static final <R> R A7(CharSequence charSequence, x00.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            R invoke = transform.invoke(Character.valueOf(charSequence.charAt(i11)));
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R A8(CharSequence charSequence, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.k
    public static String A9(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (i11 >= 0) {
            String substring = str.substring(0, g10.u.B(i11, str.length()));
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    @m80.l
    public static final Character B7(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R B8(CharSequence charSequence, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.k
    public static final CharSequence B9(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - g10.u.B(i11, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    @m80.l
    public static final Character C7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double C8(CharSequence charSequence, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).doubleValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.k
    public static String C9(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (i11 >= 0) {
            int length = str.length();
            String substring = str.substring(length - g10.u.B(i11, length));
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<R> D7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            a00.m0.s0(arrayList, transform.invoke(Character.valueOf(charSequence.charAt(i11))));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float D8(CharSequence charSequence, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).floatValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.k
    public static final CharSequence D9(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int A3 = k0.A3(charSequence); -1 < A3; A3--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(A3))).booleanValue()) {
                return charSequence.subSequence(A3 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @w00.j(name = "flatMapIndexedIterable")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R> List<R> E7(CharSequence charSequence, x00.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            a00.m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), Character.valueOf(charSequence.charAt(i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R E8(CharSequence charSequence, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.k
    public static final String E9(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int A3 = k0.A3(str); -1 < A3; A3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(A3))).booleanValue()) {
                String substring = str.substring(A3 + 1);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                return substring;
            }
        }
        return str;
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C F7(CharSequence charSequence, C destination, x00.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            a00.m0.s0(destination, transform.invoke(Integer.valueOf(i12), Character.valueOf(charSequence.charAt(i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R F8(CharSequence charSequence, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.k
    public static final CharSequence F9(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                return charSequence.subSequence(0, i11);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C G7(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            a00.m0.s0(destination, transform.invoke(Character.valueOf(charSequence.charAt(i11))));
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character G8(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (kotlin.jvm.internal.g0.t(charAt, charAt2) > 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    @m80.k
    public static final String G9(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
                String substring = str.substring(0, i11);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                return substring;
            }
        }
        return str;
    }

    public static final <R> R H7(@m80.k CharSequence charSequence, R r11, @m80.k x00.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            r11 = operation.invoke(r11, Character.valueOf(charSequence.charAt(i11)));
        }
        return r11;
    }

    @w00.j(name = "minOrThrow")
    @y0(version = "1.7")
    public static final char H8(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (kotlin.jvm.internal.g0.t(charAt, charAt2) > 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return charAt;
    }

    @m80.k
    public static <C extends Collection<? super Character>> C H9(@m80.k CharSequence charSequence, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            destination.add(Character.valueOf(charSequence.charAt(i11)));
        }
        return destination;
    }

    public static final boolean I6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R I7(@m80.k CharSequence charSequence, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, Character.valueOf(charSequence.charAt(i11)));
            i11++;
            i12++;
        }
        return r11;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character I8(@m80.k CharSequence charSequence, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    @m80.k
    public static final HashSet<Character> I9(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return (HashSet) H9(charSequence, new HashSet(k1.j(g10.u.B(charSequence.length(), 128))));
    }

    public static final boolean J6(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final <R> R J7(@m80.k CharSequence charSequence, R r11, @m80.k x00.p<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int A3 = k0.A3(charSequence); A3 >= 0; A3--) {
            r11 = operation.invoke(Character.valueOf(charSequence.charAt(A3)), r11);
        }
        return r11;
    }

    @w00.j(name = "minWithOrThrow")
    @y0(version = "1.7")
    public static final char J8(@m80.k CharSequence charSequence, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return charAt;
    }

    @m80.k
    public static final List<Character> J9(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? K9(charSequence) : a00.g0.l(Character.valueOf(charSequence.charAt(0))) : a00.h0.J();
    }

    public static final boolean K6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <R> R K7(@m80.k CharSequence charSequence, R r11, @m80.k x00.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        for (int A3 = k0.A3(charSequence); A3 >= 0; A3--) {
            r11 = operation.invoke(Integer.valueOf(A3), Character.valueOf(charSequence.charAt(A3)), r11);
        }
        return r11;
    }

    public static final boolean K8(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @m80.k
    public static final List<Character> K9(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return (List) H9(charSequence, new ArrayList(charSequence.length()));
    }

    @m80.k
    public static final Iterable<Character> L6(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? a00.h0.J() : new a(charSequence);
    }

    public static final void L7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            action.invoke(Character.valueOf(charSequence.charAt(i11)));
        }
    }

    public static final boolean L8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final Set<Character> L9(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) H9(charSequence, new LinkedHashSet(k1.j(g10.u.B(charSequence.length(), 128)))) : v1.f(Character.valueOf(charSequence.charAt(0))) : w1.k();
    }

    @m80.k
    public static final q30.m<Character> M6(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? q30.x.l() : new b(charSequence);
    }

    public static final void M7(@m80.k CharSequence charSequence, @m80.k x00.p<? super Integer, ? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            action.invoke(Integer.valueOf(i12), Character.valueOf(charSequence.charAt(i11)));
            i11++;
            i12++;
        }
    }

    @y0(version = "1.1")
    @m80.k
    public static final <S extends CharSequence> S M8(@m80.k S s11, @m80.k x00.l<? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(s11, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        for (int i11 = 0; i11 < s11.length(); i11++) {
            action.invoke(Character.valueOf(s11.charAt(i11)));
        }
        return s11;
    }

    @y0(version = "1.2")
    @m80.k
    public static final List<String> M9(@m80.k CharSequence charSequence, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return N9(charSequence, i11, i12, z11, new x00.l() { // from class: u30.m0
            @Override // x00.l
            public final Object invoke(Object obj) {
                String Q9;
                Q9 = r0.Q9((CharSequence) obj);
                return Q9;
            }
        });
    }

    @m80.k
    public static final <K, V> Map<K, V> N6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(charSequence.length()), 16));
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(charSequence.charAt(i11)));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @o00.f
    public static final char N7(CharSequence charSequence, int i11, x00.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= charSequence.length()) ? defaultValue.invoke(Integer.valueOf(i11)).charValue() : charSequence.charAt(i11);
    }

    @y0(version = "1.4")
    @m80.k
    public static final <S extends CharSequence> S N8(@m80.k S s11, @m80.k x00.p<? super Integer, ? super Character, g2> action) {
        kotlin.jvm.internal.g0.p(s11, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int i11 = 0;
        int i12 = 0;
        while (i11 < s11.length()) {
            action.invoke(Integer.valueOf(i12), Character.valueOf(s11.charAt(i11)));
            i11++;
            i12++;
        }
        return s11;
    }

    @y0(version = "1.2")
    @m80.k
    public static final <R> List<R> N9(@m80.k CharSequence charSequence, int i11, int i12, boolean z11, @m80.k x00.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        z1.a(i11, i12);
        int length = charSequence.length();
        int i13 = 0;
        ArrayList arrayList = new ArrayList((length / i12) + (length % i12 == 0 ? 0 : 1));
        while (i13 >= 0 && i13 < length) {
            int i14 = i13 + i11;
            if (i14 < 0 || i14 > length) {
                if (!z11) {
                    break;
                }
                i14 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i13, i14)));
            i13 += i12;
        }
        return arrayList;
    }

    @m80.k
    public static final <K> Map<K, Character> O6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(charSequence.length()), 16));
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @m80.l
    public static Character O7(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 < 0 || i11 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i11));
    }

    @m80.k
    public static final Pair<CharSequence, CharSequence> O8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            } else {
                sb3.append(charAt);
            }
        }
        return new Pair<>(sb2, sb3);
    }

    public static /* synthetic */ List O9(CharSequence charSequence, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return M9(charSequence, i11, i12, z11);
    }

    @m80.k
    public static final <K, V> Map<K, V> P6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(charSequence.length()), 16));
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final <K> Map<K, List<Character>> P7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final Pair<String, String> P8(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            } else {
                sb3.append(charAt);
            }
        }
        return new Pair<>(sb2.toString(), sb3.toString());
    }

    public static /* synthetic */ List P9(CharSequence charSequence, int i11, int i12, boolean z11, x00.l lVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return N9(charSequence, i11, i12, z11, lVar);
    }

    @m80.k
    public static final <K, M extends Map<? super K, ? super Character>> M Q6(@m80.k CharSequence charSequence, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return destination;
    }

    @m80.k
    public static final <K, V> Map<K, List<V>> Q7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @o00.f
    public static final char Q8(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return R8(charSequence, Random.Default);
    }

    public static final String Q9(CharSequence it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.toString();
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M R6(@m80.k CharSequence charSequence, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    @m80.k
    public static final <K, M extends Map<? super K, List<Character>>> M R7(@m80.k CharSequence charSequence, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return destination;
    }

    @y0(version = "1.3")
    public static final char R8(@m80.k CharSequence charSequence, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @y0(version = "1.2")
    @m80.k
    public static final q30.m<String> R9(@m80.k CharSequence charSequence, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return S9(charSequence, i11, i12, z11, new x00.l() { // from class: u30.n0
            @Override // x00.l
            public final Object invoke(Object obj) {
                String V9;
                V9 = r0.V9((CharSequence) obj);
                return V9;
            }
        });
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@m80.k CharSequence charSequence, @m80.k M destination, @m80.k x00.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(charSequence.charAt(i11)));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, M extends Map<? super K, List<V>>> M S7(@m80.k CharSequence charSequence, @m80.k M destination, @m80.k x00.l<? super Character, ? extends K> keySelector, @m80.k x00.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    @y0(version = "1.4")
    @o00.f
    public static final Character S8(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return T8(charSequence, Random.Default);
    }

    @y0(version = "1.2")
    @m80.k
    public static final <R> q30.m<R> S9(@m80.k final CharSequence charSequence, final int i11, int i12, boolean z11, @m80.k final x00.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        z1.a(i11, i12);
        return q30.k0.N1(a00.r0.E1(g10.u.B1(z11 ? k0.z3(charSequence) : g10.u.W1(0, (charSequence.length() - i11) + 1), i12)), new x00.l() { // from class: u30.q0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object W9;
                W9 = r0.W9(i11, charSequence, transform, ((Integer) obj).intValue());
                return W9;
            }
        });
    }

    @y0(version = "1.3")
    @m80.k
    public static final <V> Map<Character, V> T6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(g10.u.B(charSequence.length(), 128)), 16));
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            linkedHashMap.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @y0(version = "1.1")
    @m80.k
    public static final <K> a00.w0<Character, K> T7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        return new c(charSequence, keySelector);
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character T8(@m80.k CharSequence charSequence, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    public static /* synthetic */ q30.m T9(CharSequence charSequence, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return R9(charSequence, i11, i12, z11);
    }

    @y0(version = "1.3")
    @m80.k
    public static final <V, M extends Map<? super Character, ? super V>> M U6(@m80.k CharSequence charSequence, @m80.k M destination, @m80.k x00.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            destination.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    public static final int U7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public static final char U8(@m80.k CharSequence charSequence, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i11))).charValue();
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return charAt;
    }

    public static /* synthetic */ q30.m U9(CharSequence charSequence, int i11, int i12, boolean z11, x00.l lVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return S9(charSequence, i11, i12, z11, lVar);
    }

    @y0(version = "1.2")
    @m80.k
    public static List<String> V6(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return M9(charSequence, i11, i11, true);
    }

    public static final int V7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static final char V8(@m80.k CharSequence charSequence, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                charAt = operation.invoke(Integer.valueOf(i11), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i11))).charValue();
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return charAt;
    }

    public static final String V9(CharSequence it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.toString();
    }

    @y0(version = "1.2")
    @m80.k
    public static final <R> List<R> W6(@m80.k CharSequence charSequence, int i11, @m80.k x00.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return N9(charSequence, i11, i11, true, transform);
    }

    public static char W7(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(k0.A3(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character W8(@m80.k CharSequence charSequence, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                charAt = operation.invoke(Integer.valueOf(i11), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i11))).charValue();
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final Object W9(int i11, CharSequence charSequence, x00.l lVar, int i12) {
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > charSequence.length()) {
            i13 = charSequence.length();
        }
        return lVar.invoke(charSequence.subSequence(i12, i13));
    }

    @y0(version = "1.2")
    @m80.k
    public static final q30.m<String> X6(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return Y6(charSequence, i11, new x00.l() { // from class: u30.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                String Z6;
                Z6 = r0.Z6((CharSequence) obj);
                return Z6;
            }
        });
    }

    public static final char X7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                char charAt = charSequence.charAt(length);
                if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                } else {
                    return charAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character X8(@m80.k CharSequence charSequence, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i11))).charValue();
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    @m80.k
    public static final Iterable<a1<Character>> X9(@m80.k final CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return new b1(new x00.a() { // from class: u30.p0
            @Override // x00.a
            public final Object invoke() {
                Iterator Y9;
                Y9 = r0.Y9(charSequence);
                return Y9;
            }
        });
    }

    @y0(version = "1.2")
    @m80.k
    public static final <R> q30.m<R> Y6(@m80.k CharSequence charSequence, int i11, @m80.k x00.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return S9(charSequence, i11, i11, true, transform);
    }

    @m80.l
    public static final Character Y7(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char Y8(@m80.k CharSequence charSequence, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int A3 = k0.A3(charSequence);
        if (A3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(A3);
        for (int i11 = A3 - 1; i11 >= 0; i11--) {
            charAt = operation.invoke(Character.valueOf(charSequence.charAt(i11)), Character.valueOf(charAt)).charValue();
        }
        return charAt;
    }

    public static final Iterator Y9(CharSequence charSequence) {
        return k0.U3(charSequence);
    }

    public static final String Z6(CharSequence it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.toString();
    }

    @m80.l
    public static final Character Z7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            char charAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    public static final char Z8(@m80.k CharSequence charSequence, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int A3 = k0.A3(charSequence);
        if (A3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(A3);
        for (int i11 = A3 - 1; i11 >= 0; i11--) {
            charAt = operation.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i11)), Character.valueOf(charAt)).charValue();
        }
        return charAt;
    }

    @m80.k
    public static final List<Pair<Character, Character>> Z9(@m80.k CharSequence charSequence, @m80.k CharSequence other) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(h1.a(Character.valueOf(charSequence.charAt(i11)), Character.valueOf(other.charAt(i11))));
        }
        return arrayList;
    }

    @o00.f
    public static final int a7(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.length();
    }

    @m80.k
    public static final <R> List<R> a8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i11))));
        }
        return arrayList;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character a9(@m80.k CharSequence charSequence, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int A3 = k0.A3(charSequence);
        if (A3 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(A3);
        for (int i11 = A3 - 1; i11 >= 0; i11--) {
            charAt = operation.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i11)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @m80.k
    public static final <V> List<V> aa(@m80.k CharSequence charSequence, @m80.k CharSequence other, @m80.k x00.p<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i11)), Character.valueOf(other.charAt(i11))));
        }
        return arrayList;
    }

    public static final int b7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i12))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @m80.k
    public static final <R> List<R> b8(@m80.k CharSequence charSequence, @m80.k x00.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), Character.valueOf(charSequence.charAt(i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character b9(@m80.k CharSequence charSequence, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int A3 = k0.A3(charSequence);
        if (A3 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(A3);
        for (int i11 = A3 - 1; i11 >= 0; i11--) {
            charAt = operation.invoke(Character.valueOf(charSequence.charAt(i11)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @y0(version = "1.2")
    @m80.k
    public static final List<Pair<Character, Character>> ba(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return a00.h0.J();
        }
        ArrayList arrayList = new ArrayList(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            i11++;
            arrayList.add(h1.a(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i11))));
        }
        return arrayList;
    }

    @m80.k
    public static final CharSequence c7(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 >= 0) {
            return charSequence.subSequence(g10.u.B(i11, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<R> c8(@m80.k CharSequence charSequence, @m80.k x00.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            int i13 = i12 + 1;
            R invoke = transform.invoke(Integer.valueOf(i12), Character.valueOf(charSequence.charAt(i11)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @m80.k
    public static final CharSequence c9(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    @y0(version = "1.2")
    @m80.k
    public static final <R> List<R> ca(@m80.k CharSequence charSequence, @m80.k x00.p<? super Character, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return a00.h0.J();
        }
        ArrayList arrayList = new ArrayList(length);
        int i11 = 0;
        while (i11 < length) {
            Character valueOf = Character.valueOf(charSequence.charAt(i11));
            i11++;
            arrayList.add(transform.invoke(valueOf, Character.valueOf(charSequence.charAt(i11))));
        }
        return arrayList;
    }

    @m80.k
    public static String d7(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (i11 >= 0) {
            String substring = str.substring(g10.u.B(i11, str.length()));
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C d8(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            int i13 = i12 + 1;
            R invoke = transform.invoke(Integer.valueOf(i12), Character.valueOf(charSequence.charAt(i11)));
            if (invoke != null) {
                destination.add(invoke);
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @o00.f
    public static final String d9(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return c9(str).toString();
    }

    @m80.k
    public static final CharSequence e7(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 >= 0) {
            return z9(charSequence, g10.u.u(charSequence.length() - i11, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C e8(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i12), Character.valueOf(charSequence.charAt(i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @y0(version = "1.4")
    @m80.k
    public static final <R> List<R> e9(@m80.k CharSequence charSequence, R r11, @m80.k x00.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r11);
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            r11 = operation.invoke(r11, Character.valueOf(charSequence.charAt(i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.k
    public static String f7(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (i11 >= 0) {
            return A9(str, g10.u.u(str.length() - i11, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }

    @m80.k
    public static final <R> List<R> f8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            R invoke = transform.invoke(Character.valueOf(charSequence.charAt(i11)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @m80.k
    public static final <R> List<R> f9(@m80.k CharSequence charSequence, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r11);
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Character.valueOf(charSequence.charAt(i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.k
    public static final CharSequence g7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int A3 = k0.A3(charSequence); -1 < A3; A3--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(A3))).booleanValue()) {
                return charSequence.subSequence(0, A3 + 1);
            }
        }
        return "";
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C g8(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            R invoke = transform.invoke(Character.valueOf(charSequence.charAt(i11)));
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    @y0(version = "1.4")
    @m80.k
    public static final List<Character> g9(@m80.k CharSequence charSequence, @m80.k x00.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return a00.h0.J();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        int i11 = 1;
        while (i11 < length) {
            Character invoke = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i11)));
            char charValue = invoke.charValue();
            arrayList.add(invoke);
            i11++;
            charAt = charValue;
        }
        return arrayList;
    }

    @m80.k
    public static final String h7(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int A3 = k0.A3(str); -1 < A3; A3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(A3))).booleanValue()) {
                String substring = str.substring(0, A3 + 1);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                return substring;
            }
        }
        return "";
    }

    @m80.k
    public static final <R, C extends Collection<? super R>> C h8(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i11))));
        }
        return destination;
    }

    @y0(version = "1.4")
    @m80.k
    public static final List<Character> h9(@m80.k CharSequence charSequence, @m80.k x00.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return a00.h0.J();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        int i11 = 1;
        while (i11 < length) {
            Character invoke = operation.invoke(Integer.valueOf(i11), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i11)));
            char charValue = invoke.charValue();
            arrayList.add(invoke);
            i11++;
            charAt = charValue;
        }
        return arrayList;
    }

    @m80.k
    public static final CharSequence i7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                return charSequence.subSequence(i11, charSequence.length());
            }
        }
        return "";
    }

    @m80.l
    @y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Character i8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends R> selector) {
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

    @y0(version = "1.4")
    @m80.k
    public static final <R> List<R> i9(@m80.k CharSequence charSequence, R r11, @m80.k x00.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r11);
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            r11 = operation.invoke(r11, Character.valueOf(charSequence.charAt(i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.k
    public static final String j7(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
                String substring = str.substring(i11);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                return substring;
            }
        }
        return "";
    }

    @w00.j(name = "maxByOrThrow")
    @y0(version = "1.7")
    public static final <R extends Comparable<? super R>> char j8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        if (A3 != 0) {
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
        }
        return charAt;
    }

    @y0(version = "1.4")
    @m80.k
    public static final <R> List<R> j9(@m80.k CharSequence charSequence, R r11, @m80.k x00.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (charSequence.length() == 0) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r11);
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, Character.valueOf(charSequence.charAt(i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @o00.f
    public static final char k7(CharSequence charSequence, int i11, x00.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= charSequence.length()) ? defaultValue.invoke(Integer.valueOf(i11)).charValue() : charSequence.charAt(i11);
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double k8(CharSequence charSequence, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).doubleValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    public static char k9(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @o00.f
    public static final Character l7(CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return O7(charSequence, i11);
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float l8(CharSequence charSequence, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).floatValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    public static final char l9(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Character ch2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                ch2 = Character.valueOf(charAt);
                z11 = true;
            }
        }
        if (!z11) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        kotlin.jvm.internal.g0.n(ch2, "null cannot be cast to non-null type kotlin.Char");
        return ch2.charValue();
    }

    @m80.k
    public static final CharSequence m7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R m8(CharSequence charSequence, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    public static final Character m9(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @m80.k
    public static final String n7(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R extends Comparable<? super R>> R n8(CharSequence charSequence, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                R invoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    public static final Character n9(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Character ch2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z11) {
                    return null;
                }
                ch2 = Character.valueOf(charAt);
                z11 = true;
            }
        }
        if (z11) {
            return ch2;
        }
        return null;
    }

    @m80.k
    public static final CharSequence o7(@m80.k CharSequence charSequence, @m80.k x00.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            char charAt = charSequence.charAt(i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
            i11++;
            i12 = i13;
        }
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Double o8(CharSequence charSequence, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).doubleValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @m80.k
    public static final CharSequence o9(@m80.k CharSequence charSequence, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? "" : k0.D5(charSequence, indices);
    }

    @m80.k
    public static final String p7(@m80.k String str, @m80.k x00.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        int i12 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
            i11++;
            i12 = i13;
        }
        return sb2.toString();
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final Float p8(CharSequence charSequence, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).floatValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @m80.k
    public static final CharSequence p9(@m80.k CharSequence charSequence, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = a00.i0.d0(indices, 10);
        if (d02 == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb2.append(charSequence.charAt(it.next().intValue()));
        }
        return sb2;
    }

    @m80.k
    public static final <C extends Appendable> C q7(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequence.length()) {
            char charAt = charSequence.charAt(i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R q8(CharSequence charSequence, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @m80.k
    public static final String q9(@m80.k String str, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? "" : k0.H5(str, indices);
    }

    @m80.k
    public static final CharSequence r7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <R> R r8(CharSequence charSequence, Comparator<? super R> comparator, x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @o00.f
    public static final String r9(String str, Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return p9(str, indices).toString();
    }

    @m80.k
    public static final String s7(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character s8(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (kotlin.jvm.internal.g0.t(charAt, charAt2) < 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final int s9(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            i11 += selector.invoke(Character.valueOf(charSequence.charAt(i12))).intValue();
        }
        return i11;
    }

    @m80.k
    public static final <C extends Appendable> C t7(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    @w00.j(name = "maxOrThrow")
    @y0(version = "1.7")
    public static final char t8(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (kotlin.jvm.internal.g0.t(charAt, charAt2) < 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return charAt;
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final double t9(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            d11 += selector.invoke(Character.valueOf(charSequence.charAt(i11))).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final <C extends Appendable> C u7(@m80.k CharSequence charSequence, @m80.k C destination, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character u8(@m80.k CharSequence charSequence, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return Character.valueOf(charAt);
    }

    @w00.j(name = "sumOfDouble")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final double u9(CharSequence charSequence, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        double d11 = 0.0d;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            d11 += selector.invoke(Character.valueOf(charSequence.charAt(i11))).doubleValue();
        }
        return d11;
    }

    @o00.f
    public static final Character v7(CharSequence charSequence, x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @w00.j(name = "maxWithOrThrow")
    @y0(version = "1.7")
    public static final char v8(@m80.k CharSequence charSequence, @m80.k Comparator<? super Character> comparator) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                char charAt2 = charSequence.charAt(i11);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return charAt;
    }

    @w00.j(name = "sumOfInt")
    @y0(version = "1.4")
    @o00.f
    public static final int v9(CharSequence charSequence, x00.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = 0;
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            i11 += selector.invoke(Character.valueOf(charSequence.charAt(i12))).intValue();
        }
        return i11;
    }

    @o00.f
    public static final Character w7(CharSequence charSequence, x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i11 = length - 1;
            char charAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i11 < 0) {
                return null;
            }
            length = i11;
        }
    }

    @m80.l
    @y0(version = "1.4")
    public static final <R extends Comparable<? super R>> Character w8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends R> selector) {
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

    @w00.j(name = "sumOfLong")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final long w9(CharSequence charSequence, x00.l<? super Character, Long> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long j11 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            j11 += selector.invoke(Character.valueOf(charSequence.charAt(i11))).longValue();
        }
        return j11;
    }

    public static char x7(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @w00.j(name = "minByOrThrow")
    @y0(version = "1.7")
    public static final <R extends Comparable<? super R>> char x8(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int A3 = k0.A3(charSequence);
        if (A3 != 0) {
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
        }
        return charAt;
    }

    @w00.j(name = "sumOfUInt")
    @y0(version = "1.5")
    @o00.f
    public static final int x9(CharSequence charSequence, x00.l<? super Character, s1> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = s1.i(0);
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            i11 = s1.i(i11 + selector.invoke(Character.valueOf(charSequence.charAt(i12))).m0());
        }
        return i11;
    }

    public static final char y7(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final double y8(CharSequence charSequence, x00.l<? super Character, Double> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).doubleValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @w00.j(name = "sumOfULong")
    @y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final long y9(CharSequence charSequence, x00.l<? super Character, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            i11 = yz.w1.i(i11 + selector.invoke(Character.valueOf(charSequence.charAt(i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.5")
    @o00.f
    public static final <R> R z7(CharSequence charSequence, x00.l<? super Character, ? extends R> transform) {
        R r11;
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        while (true) {
            if (i11 >= charSequence.length()) {
                r11 = null;
                break;
            }
            r11 = transform.invoke(Character.valueOf(charSequence.charAt(i11)));
            if (r11 != null) {
                break;
            }
            i11++;
        }
        if (r11 != null) {
            return r11;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final float z8(CharSequence charSequence, x00.l<? super Character, Float> selector) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int A3 = k0.A3(charSequence);
        int i11 = 1;
        if (1 <= A3) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(charSequence.charAt(i11))).floatValue());
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @m80.k
    public static final CharSequence z9(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 >= 0) {
            return charSequence.subSequence(0, g10.u.B(i11, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i11 + " is less than zero.").toString());
    }
}
