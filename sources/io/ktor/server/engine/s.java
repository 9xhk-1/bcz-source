package io.ktor.server.engine;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nClassLoaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLoaders.kt\nio/ktor/server/engine/ClassLoaderDelegate\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n11165#2:79\n11500#2,3:80\n*S KotlinDebug\n*F\n+ 1 ClassLoaders.kt\nio/ktor/server/engine/ClassLoaderDelegate\n*L\n76#1:79\n76#1:80,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s extends ClassLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@m80.k ClassLoader delegate) {
        super(delegate);
        kotlin.jvm.internal.g0.p(delegate, "delegate");
    }

    @m80.k
    public final List<String> a() {
        Package[] packages = getPackages();
        kotlin.jvm.internal.g0.o(packages, "getPackages(...)");
        ArrayList arrayList = new ArrayList(packages.length);
        for (Package r02 : packages) {
            arrayList.add(r02.getName());
        }
        return arrayList;
    }
}
