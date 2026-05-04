package ho;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@j
@go.c
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Double f59623a = Double.valueOf(0.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final Float f59624b = Float.valueOf(0.0f);

    @CheckForNull
    public static <T> T a(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f59624b;
        }
        if (cls == Double.TYPE) {
            return (T) f59623a;
        }
        return null;
    }
}
