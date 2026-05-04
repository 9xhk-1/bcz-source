package o50;

import androidx.exifinterface.media.ExifInterface;
import f50.k0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    public static final /* synthetic */ <Base, T extends Base> void a(b<? super Base> bVar, f50.i<T> serializer) {
        g0.p(bVar, "<this>");
        g0.p(serializer, "serializer");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        bVar.d(o0.d(Object.class), serializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Base, T extends Base> void b(b<? super Base> bVar, h10.d<T> clazz) {
        g0.p(bVar, "<this>");
        g0.p(clazz, "clazz");
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        bVar.d(clazz, k0.j(null));
    }
}
