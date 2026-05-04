package x80;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.Optional;
import org.junit.platform.engine.TestDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<E extends AnnotatedElement> {

    /* renamed from: a, reason: collision with root package name */
    public final TestDescriptor f97782a;

    /* renamed from: b, reason: collision with root package name */
    public final E f97783b;

    public a(TestDescriptor testDescriptor, E annotatedElement) {
        this.f97782a = testDescriptor;
        this.f97783b = annotatedElement;
    }

    public final String a() {
        return this.f97782a.a();
    }

    public E b() {
        return this.f97783b;
    }

    public final <A extends Annotation> List<A> d(Class<A> annotationType) {
        ba0.c2.r(annotationType, "annotationType must not be null");
        return org.junit.platform.commons.util.a.s(b(), annotationType);
    }

    public final boolean e(Class<? extends Annotation> annotationType) {
        ba0.c2.r(annotationType, "annotationType must not be null");
        return org.junit.platform.commons.util.a.y(b(), annotationType);
    }

    public final <A extends Annotation> Optional<A> f(Class<A> annotationType) {
        ba0.c2.r(annotationType, "annotationType must not be null");
        return org.junit.platform.commons.util.a.m(b(), annotationType);
    }

    public TestDescriptor g() {
        return this.f97782a;
    }
}
