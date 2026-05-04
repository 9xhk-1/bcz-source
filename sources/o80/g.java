package o80;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class g<A extends Annotation> implements p80.k {

    /* renamed from: a, reason: collision with root package name */
    public final y90.e f76575a = y90.g.c(getClass());

    /* renamed from: b, reason: collision with root package name */
    public final Class<A> f76576b;

    public g(Class<A> annotationType) {
        this.f76576b = annotationType;
    }

    public static /* synthetic */ p80.h M(g gVar, AnnotatedElement annotatedElement, Annotation annotation) {
        p80.h N = gVar.N(annotation);
        gVar.P(annotation, annotatedElement, N);
        return N;
    }

    public abstract p80.h N(A annotation);

    public abstract p80.h O();

    public final void P(final A annotation, final AnnotatedElement annotatedElement, final p80.h result) {
        this.f76575a.l(new Supplier() { // from class: o80.d
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Evaluation of %s on [%s] resulted in: %s", annotation, annotatedElement, result);
                return format;
            }
        });
    }

    @Override // p80.k
    public final p80.h h(p80.n context) {
        Optional<AnnotatedElement> e11 = context.e();
        if (!e11.isPresent()) {
            return O();
        }
        final AnnotatedElement annotatedElement = e11.get();
        return (p80.h) org.junit.platform.commons.util.a.s(annotatedElement, this.f76576b).stream().map(new Function() { // from class: o80.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g.M(g.this, annotatedElement, (Annotation) obj);
            }
        }).filter(new f()).findFirst().orElse(O());
    }
}
