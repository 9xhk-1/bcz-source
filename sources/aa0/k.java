package aa0;

import ba0.c2;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k implements l1 {
    public static /* synthetic */ String d(String str) {
        return "String must be 'true' or 'false' (ignoring case): " + str;
    }

    @Override // aa0.l1
    public boolean a(Class<?> targetType) {
        return targetType == Boolean.class;
    }

    @Override // aa0.l1
    public Object c(final String source, Class<?> targetType) {
        boolean equalsIgnoreCase = n6.m.f74525c.equalsIgnoreCase(source);
        c2.f(equalsIgnoreCase || "false".equalsIgnoreCase(source), new Supplier() { // from class: aa0.j
            @Override // java.util.function.Supplier
            public final Object get() {
                return k.d(source);
            }
        });
        return Boolean.valueOf(equalsIgnoreCase);
    }
}
