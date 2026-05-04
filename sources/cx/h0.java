package cx;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n1#1,37:1\n58#2,16:38\n58#2,16:54\n58#2,16:71\n18#3:70\n*S KotlinDebug\n*F\n+ 1 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n*L\n19#1:38,16\n27#1:54,16\n12#1:71,16\n12#1:70\n*E\n"})
/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<gz.a> f46887a;

    static {
        h10.r rVar;
        h10.d d11 = o0.d(gz.a.class);
        try {
            rVar = o0.B(gz.a.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f46887a = new xy.a<>("BodyTypeAttributeKey", new gz.a(d11, rVar));
    }

    @m80.k
    public static final xy.a<gz.a> a() {
        return f46887a;
    }

    public static final /* synthetic */ <T> void b(y yVar, T t11) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        if (t11 == null) {
            yVar.l(mx.u.f73831a);
            kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            h10.d d11 = o0.d(Object.class);
            try {
                kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
            } catch (Throwable unused) {
            }
            yVar.m(new gz.a(d11, null));
            return;
        }
        if (t11 instanceof mx.v) {
            yVar.l(t11);
            yVar.m(null);
            return;
        }
        yVar.l(t11);
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d12 = o0.d(Object.class);
        try {
            kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused2) {
        }
        yVar.m(new gz.a(d12, null));
    }

    public static final void c(@m80.k y yVar, @m80.l Object obj, @m80.k gz.a bodyType) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(bodyType, "bodyType");
        if (obj == null) {
            obj = mx.u.f73831a;
        }
        yVar.l(obj);
        yVar.m(bodyType);
    }
}
