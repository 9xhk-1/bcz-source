package a00;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o {
    @m80.k
    public static final <T> T[] a(@m80.k T[] reference, int i11) {
        kotlin.jvm.internal.g0.p(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i11);
        kotlin.jvm.internal.g0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    @w00.j(name = "contentDeepHashCode")
    @yz.y0(version = "1.3")
    @yz.v0
    public static final <T> int b(@m80.l T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @yz.y0(version = "1.3")
    public static final void c(int i11, int i12) {
        if (i11 <= i12) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + i12 + ").");
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.g0.y(0, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) new Object[0];
    }

    @o00.f
    public static final String e(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.y(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
