package hy;

import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSuppressionAttribute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuppressionAttribute.kt\nio/ktor/server/http/content/SuppressionAttributeKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,32:1\n18#2:33\n58#3,16:34\n*S KotlinDebug\n*F\n+ 1 SuppressionAttribute.kt\nio/ktor/server/http/content/SuppressionAttributeKt\n*L\n17#1:33\n17#1:34,16\n*E\n"})
/* loaded from: classes8.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<Boolean> f59987a;

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(Boolean.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(Boolean.TYPE);
        } catch (Throwable unused) {
            rVar = null;
        }
        f59987a = new xy.a<>("preventCompression", new gz.a(d11, rVar));
    }

    @m80.k
    public static final xy.a<Boolean> a() {
        return f59987a;
    }

    public static final boolean c(@m80.k zx.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return bVar.getAttributes().c(f59987a);
    }

    public static final void e(@m80.k zx.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        bVar.getAttributes().e(f59987a, Boolean.TRUE);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Please use suppressCompression() and isCompressionSuppressed) instead")
    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d(zx.b bVar) {
    }
}
