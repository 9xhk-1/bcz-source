package xy;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributesKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n58#2,16:115\n1863#3,2:131\n*S KotlinDebug\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n18#1:115,16\n109#1:131,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    public static final /* synthetic */ <T> a<T> a(String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = kotlin.jvm.internal.o0.d(Object.class);
        try {
            kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        return new a<>(name, new gz.a(d11, null));
    }

    public static final void c(@m80.k b bVar, @m80.k b other) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Iterator<T> it = other.f().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            kotlin.jvm.internal.g0.n(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            bVar.e(aVar, other.g(aVar));
        }
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Please use `AttributeKey` class instead", replaceWith = @yz.w0(expression = "AttributeKey", imports = {}))
    public static /* synthetic */ void b() {
    }
}
