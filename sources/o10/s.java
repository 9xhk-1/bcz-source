package o10;

import a00.h0;
import a00.m0;
import a00.x1;
import h20.f0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import n10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmBuiltInsSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsSignatures.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSignatures\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n13#2:213\n13#2:219\n13#2:225\n13#2:226\n13#2:227\n13#2:228\n13#2:229\n13#2:230\n1454#3,5:214\n1454#3,5:220\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsSignatures.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSignatures\n*L\n64#1:213\n185#1:219\n23#1:225\n71#1:226\n80#1:227\n136#1:228\n163#1:229\n180#1:230\n65#1:214,5\n189#1:220,5\n*E\n"})
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final s f75565a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Set<String> f75566b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Set<String> f75567c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Set<String> f75568d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Set<String> f75569e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final Set<String> f75570f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final Set<String> f75571g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final Set<String> f75572h;

    static {
        s sVar = new s();
        f75565a = sVar;
        f0 f0Var = f0.f58067a;
        f75566b = x1.D(f0Var.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f75567c = x1.C(x1.C(x1.C(x1.C(x1.C(x1.C(sVar.b(), f0Var.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), f0Var.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), f0Var.e("Double", "isInfinite()Z", "isNaN()Z")), f0Var.e("Float", "isInfinite()Z", "isNaN()Z")), f0Var.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), f0Var.e("CharSequence", "isEmpty()Z"));
        f75568d = f0Var.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f75569e = x1.C(x1.C(x1.C(x1.C(x1.C(x1.C(f0Var.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), f0Var.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), f0Var.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), f0Var.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), f0Var.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), f0Var.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f0Var.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f75570f = x1.C(x1.C(f0Var.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), f0Var.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f0Var.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> a11 = sVar.a();
        String[] b11 = f0Var.b("D");
        Set C = x1.C(a11, f0Var.e("Float", (String[]) Arrays.copyOf(b11, b11.length)));
        String[] b12 = f0Var.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f75571g = x1.C(C, f0Var.e("String", (String[]) Arrays.copyOf(b12, b12.length)));
        String[] b13 = f0Var.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f75572h = f0Var.e("Throwable", (String[]) Arrays.copyOf(b13, b13.length));
    }

    public final Set<String> a() {
        f0 f0Var = f0.f58067a;
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List Q = h0.Q(jvmPrimitiveType, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            String b11 = ((JvmPrimitiveType) it.next()).getWrapperFqName().g().b();
            g0.o(b11, "asString(...)");
            String[] b12 = f0Var.b("Ljava/lang/String;");
            m0.s0(linkedHashSet, f0Var.e(b11, (String[]) Arrays.copyOf(b12, b12.length)));
        }
        return linkedHashSet;
    }

    public final Set<String> b() {
        f0 f0Var = f0.f58067a;
        List<JvmPrimitiveType> Q = h0.Q(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : Q) {
            String b11 = jvmPrimitiveType.getWrapperFqName().g().b();
            g0.o(b11, "asString(...)");
            m0.s0(linkedHashSet, f0Var.e(b11, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
        }
        return linkedHashSet;
    }

    @m80.k
    public final Set<String> c() {
        return f75568d;
    }

    @m80.k
    public final Set<String> d() {
        return f75566b;
    }

    @m80.k
    public final Set<String> e() {
        return f75571g;
    }

    @m80.k
    public final Set<String> f() {
        return f75567c;
    }

    @m80.k
    public final Set<String> g() {
        return f75570f;
    }

    @m80.k
    public final Set<String> h() {
        return f75572h;
    }

    @m80.k
    public final Set<String> i() {
        return f75569e;
    }

    public final boolean j(@m80.k n20.d fqName) {
        g0.p(fqName, "fqName");
        return g0.g(fqName, o.a.f74045i) || n10.o.e(fqName);
    }

    public final boolean k(@m80.k n20.d fqName) {
        g0.p(fqName, "fqName");
        if (j(fqName)) {
            return true;
        }
        n20.b n11 = a.f75522a.n(fqName);
        if (n11 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n11.a().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
