package fb0;

import androidx.exifinterface.media.ExifInterface;
import h10.k;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInjectProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InjectProperty.kt\norg/koin/ext/InjectPropertyKt\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,19:1\n124#2,4:20\n124#2,4:25\n142#3:24\n142#3:29\n138#3,5:30\n*S KotlinDebug\n*F\n+ 1 InjectProperty.kt\norg/koin/ext/InjectPropertyKt\n*L\n9#1:20,4\n13#1:25,4\n9#1:24\n13#1:29\n17#1:30,5\n*E\n"})
/* loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void a(k<T> kVar) {
        g0.p(kVar, "<this>");
        cb0.b h11 = jb0.c.f64013a.a().get().P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        kVar.set(h11.i(o0.d(Object.class), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void b(k<T> kVar, cb0.b scope) {
        g0.p(kVar, "<this>");
        g0.p(scope, "scope");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        kVar.set(scope.i(o0.d(Object.class), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void c(k<T> kVar, na0.a koin) {
        g0.p(kVar, "<this>");
        g0.p(koin, "koin");
        cb0.b h11 = koin.P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        kVar.set(h11.i(o0.d(Object.class), null, null));
    }
}
