package o80;

import java.lang.annotation.Annotation;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class j<A extends Annotation> implements p80.k {

    /* renamed from: a, reason: collision with root package name */
    public final Class<A> f76580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f76581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f76582c;

    /* renamed from: d, reason: collision with root package name */
    public final Function<A, String> f76583d;

    public j(Class<A> annotationType, String enabledReason, String disabledReason, Function<A, String> customDisabledReason) {
        this.f76580a = annotationType;
        this.f76581b = enabledReason;
        this.f76582c = disabledReason;
        this.f76583d = customDisabledReason;
    }

    public static /* synthetic */ p80.h L(j jVar, Annotation annotation) {
        return jVar.O(annotation) ? p80.h.c(jVar.f76581b) : p80.h.b(jVar.f76582c, jVar.f76583d.apply(annotation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p80.h N() {
        return p80.h.c(String.format("@%s is not present", this.f76580a.getSimpleName()));
    }

    public abstract boolean O(A annotation);

    @Override // p80.k
    public p80.h h(p80.n context) {
        return (p80.h) org.junit.platform.commons.util.a.p(context.e(), this.f76580a).map(new Function() { // from class: o80.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j.L(j.this, (Annotation) obj);
            }
        }).orElseGet(new Supplier() { // from class: o80.i
            @Override // java.util.function.Supplier
            public final Object get() {
                p80.h N;
                N = j.this.N();
                return N;
            }
        });
    }
}
