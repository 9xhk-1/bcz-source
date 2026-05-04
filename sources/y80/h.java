package y80;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Predicate;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class h implements Predicate<Method> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f99680a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99681b;

    public h(Class<? extends Annotation> annotationType, boolean mustReturnPrimitiveVoid) {
        this.f99680a = annotationType;
        this.f99681b = mustReturnPrimitiveVoid;
    }

    @Override // java.util.function.Predicate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean test(Method candidate) {
        if (ReflectionUtils.o1(candidate) || ReflectionUtils.j1(candidate) || ReflectionUtils.N0(candidate) || ReflectionUtils.H1(candidate) != this.f99681b) {
            return false;
        }
        return org.junit.platform.commons.util.a.y(candidate, this.f99680a);
    }
}
