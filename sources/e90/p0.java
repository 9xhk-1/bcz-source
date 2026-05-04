package e90;

import org.apiguardian.api.API;
import org.junit.jupiter.params.converter.ArgumentConversionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public abstract class p0 implements b {
    @Override // e90.b
    public final Object a(Object source, p80.t context) throws ArgumentConversionException {
        Class<?> type;
        type = context.b().getType();
        return b(source, type);
    }

    public abstract Object b(Object source, Class<?> targetType) throws ArgumentConversionException;
}
