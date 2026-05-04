package o00;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;
import yz.v0;
import yz.y0;
import yz.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final m f75505a = new q00.d();

    @y0(version = "1.2")
    @v0
    public static final boolean a(int i11, int i12, int i13) {
        return z.f100469g.f(i11, i12, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    public static final /* synthetic */ <T> T b(Object obj) {
        try {
            g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
            return obj;
        } catch (ClassCastException e11) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (g0.g(classLoader, classLoader2)) {
                throw e11;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e11);
        }
    }
}
