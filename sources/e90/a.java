package e90;

import ba0.c2;
import java.lang.annotation.Annotation;
import org.apiguardian.api.API;
import org.junit.jupiter.params.converter.ArgumentConversionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public abstract class a<A extends Annotation> implements b, v90.a<A> {

    /* renamed from: a, reason: collision with root package name */
    public A f49609a;

    @Override // e90.b
    public final Object a(Object source, p80.t context) throws ArgumentConversionException {
        Class<?> type;
        type = context.b().getType();
        return c(source, type, this.f49609a);
    }

    @Override // java.util.function.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void accept(A annotation) {
        c2.r(annotation, "annotation must not be null");
        this.f49609a = annotation;
    }

    public abstract Object c(Object source, Class<?> targetType, A annotation) throws ArgumentConversionException;
}
