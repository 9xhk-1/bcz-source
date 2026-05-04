package h20;

import a00.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSignatureBuildingComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n11165#2:40\n11500#2,3:41\n11500#2,3:46\n37#3,2:44\n*S KotlinDebug\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n*L\n20#1:40\n20#1:41,3\n25#1:46,3\n20#1:44,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f0 f58067a = new f0();

    public static final CharSequence k(String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return f58067a.c(it);
    }

    @m80.k
    public final String[] b(@m80.k String... signatures) {
        kotlin.jvm.internal.g0.p(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + l70.f.f70689d;
    }

    @m80.k
    public final Set<String> d(@m80.k String internalName, @m80.k String... signatures) {
        kotlin.jvm.internal.g0.p(internalName, "internalName");
        kotlin.jvm.internal.g0.p(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    @m80.k
    public final Set<String> e(@m80.k String name, @m80.k String... signatures) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @m80.k
    public final Set<String> f(@m80.k String name, @m80.k String... signatures) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @m80.k
    public final String g(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return "java/util/function/" + name;
    }

    @m80.k
    public final String h(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return "java/lang/" + name;
    }

    @m80.k
    public final String i(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return "java/util/" + name;
    }

    @m80.k
    public final String j(@m80.k String name, @m80.k List<String> parameters, @m80.k String ret) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        kotlin.jvm.internal.g0.p(ret, "ret");
        return name + '(' + r0.r3(parameters, "", null, null, 0, null, e0.f58066a, 30, null) + ')' + c(ret);
    }

    @m80.k
    public final String l(@m80.k String internalName, @m80.k String jvmDescriptor) {
        kotlin.jvm.internal.g0.p(internalName, "internalName");
        kotlin.jvm.internal.g0.p(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
