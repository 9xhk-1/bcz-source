package yv;

import java.lang.reflect.Method;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResourceContainerExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceContainerExt.kt\ndev/icerock/moko/resources/ResourceContainerExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    @m80.l
    public static final a a(@m80.k i<a> iVar, @m80.k String filePath) {
        g0.p(iVar, "<this>");
        g0.p(filePath, "filePath");
        return new a(l.a(filePath));
    }

    @m80.l
    public static final e b(@m80.k i<e> iVar, @m80.k String fileName) {
        String str;
        Method method;
        g0.p(iVar, "<this>");
        g0.p(fileName, "fileName");
        if (k0.O3(fileName)) {
            return null;
        }
        if (fileName.length() > 1) {
            str = fileName.substring(1, fileName.length());
            g0.o(str, "substring(...)");
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ct.d.f46852f);
        int i11 = 0;
        sb2.append(Character.toUpperCase(fileName.charAt(0)));
        sb2.append(str);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        Method[] methods = iVar.getClass().getMethods();
        g0.o(methods, "getMethods(...)");
        int length = methods.length;
        while (true) {
            if (i11 >= length) {
                method = null;
                break;
            }
            method = methods[i11];
            if (g0.g(method.getName(), sb3)) {
                break;
            }
            i11++;
        }
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(iVar, null);
        g0.n(invoke, "null cannot be cast to non-null type dev.icerock.moko.resources.ImageResource");
        return (e) invoke;
    }
}
