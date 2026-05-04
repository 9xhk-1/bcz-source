package f90;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public abstract class b<A extends Annotation> implements e, v90.a<A> {

    /* renamed from: a, reason: collision with root package name */
    public final List<A> f51352a = new ArrayList();

    @Override // f90.e
    public final Stream<? extends d> a(final p80.n context) {
        return this.f51352a.stream().flatMap(new Function() { // from class: f90.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream d11;
                d11 = b.this.d(context, (Annotation) obj);
                return d11;
            }
        });
    }

    @Override // java.util.function.Consumer
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void accept(A annotation) {
        ba0.c2.r(annotation, "annotation must not be null");
        this.f51352a.add(annotation);
    }

    public abstract Stream<? extends d> d(p80.n context, A annotation);
}
