package qy;

import io.ktor.utils.io.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResponseType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseType.kt\nio/ktor/server/response/ResponseTypeKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,27:1\n18#2:28\n58#3,16:29\n*S KotlinDebug\n*F\n+ 1 ResponseType.kt\nio/ktor/server/response/ResponseTypeKt\n*L\n11#1:28\n11#1:29,16\n*E\n"})
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<gz.a> f82757a;

    static {
        h10.r rVar;
        h10.d d11 = o0.d(gz.a.class);
        try {
            rVar = o0.B(gz.a.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f82757a = new xy.a<>("ResponseTypeAttributeKey", new gz.a(d11, rVar));
    }

    @m80.l
    public static final gz.a a(@m80.k a aVar) {
        g0.p(aVar, "<this>");
        return (gz.a) aVar.c().getAttributes().a(f82757a);
    }

    @b0
    public static final void b(@m80.k a aVar, @m80.l gz.a aVar2) {
        g0.p(aVar, "<this>");
        if (aVar2 != null) {
            aVar.c().getAttributes().e(f82757a, aVar2);
        } else {
            aVar.c().getAttributes().b(f82757a);
        }
    }
}
