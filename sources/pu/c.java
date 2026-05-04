package pu;

import gv.g;
import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81202a = "dagger.hilt.android.EarlyEntryPoint";

    @Nonnull
    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof gv.b) {
            if (obj instanceof g) {
                gv.f.d(!b(cls, f81202a), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        }
        if (obj instanceof gv.c) {
            return (T) a(((gv.c) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), gv.b.class, gv.c.class));
    }

    public static boolean b(Class<?> clazz, String annotationName) {
        for (Annotation annotation : clazz.getAnnotations()) {
            if (annotation.annotationType().getCanonicalName().contentEquals(annotationName)) {
                return true;
            }
        }
        return false;
    }
}
