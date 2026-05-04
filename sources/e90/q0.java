package e90;

import ba0.c2;
import org.apiguardian.api.API;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public abstract class q0<S, T> implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Class<S> f49612a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f49613b;

    public q0(Class<S> sourceType, Class<T> targetType) {
        this.f49612a = (Class) c2.r(sourceType, "sourceType must not be null");
        this.f49613b = (Class) c2.r(targetType, "targetType must not be null");
    }

    @Override // e90.b
    public final Object a(Object source, p80.t context) throws ArgumentConversionException {
        Class type;
        Class type2;
        if (source == null) {
            return b(null);
        }
        if (!this.f49612a.isInstance(source)) {
            throw new ArgumentConversionException(String.format("%s cannot convert objects of type [%s]. Only source objects of type [%s] are supported.", getClass().getSimpleName(), source.getClass().getName(), this.f49612a.getName()));
        }
        Class<T> cls = this.f49613b;
        type = context.b().getType();
        if (ReflectionUtils.P0(cls, type)) {
            return b(this.f49612a.cast(source));
        }
        String simpleName = getClass().getSimpleName();
        type2 = context.b().getType();
        throw new ArgumentConversionException(String.format("%s cannot convert to type [%s]. Only target type [%s] is supported.", simpleName, type2.getName(), this.f49613b.getName()));
    }

    public abstract T b(S source) throws ArgumentConversionException;
}
