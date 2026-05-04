package qu;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    @Nonnull
    public static <T> T a(Context context, Class<T> cls) {
        ComponentCallbacks2 a11 = tu.a.a(context);
        gv.f.d(a11 instanceof gv.d, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", a11.getClass());
        gv.c<?> componentManager = ((gv.d) a11).componentManager();
        if (!(componentManager instanceof gv.h)) {
            return (T) pu.c.a(a11, cls);
        }
        gv.f.d(b(cls, c.class), "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", cls.getCanonicalName());
        return cls.cast(((gv.h) componentManager).u());
    }

    public static boolean b(Class<?> clazz, Class<? extends Annotation> annotationClazz) {
        for (Annotation annotation : clazz.getAnnotations()) {
            if (annotation.annotationType().equals(annotationClazz)) {
                return true;
            }
        }
        return false;
    }
}
