package h10;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "KClasses")
@u0({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,46:1\n9#2:47\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n25#1:47\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @o00.i
    @y0(version = "1.4")
    @m80.k
    public static final <T> T a(@m80.k d<T> dVar, @m80.l Object obj) {
        g0.p(dVar, "<this>");
        if (dVar.B(obj)) {
            g0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.x());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    @o00.i
    @y0(version = "1.4")
    public static final <T> T b(@m80.k d<T> dVar, @m80.l Object obj) {
        g0.p(dVar, "<this>");
        if (!dVar.B(obj)) {
            return null;
        }
        g0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
