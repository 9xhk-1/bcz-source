package aa0;

import ba0.c2;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m implements l1 {
    public static /* synthetic */ String d(String str) {
        return "String must have length of 1: " + str;
    }

    @Override // aa0.l1
    public boolean a(Class<?> targetType) {
        return targetType == Character.class;
    }

    @Override // aa0.l1
    public Object c(final String source, Class<?> targetType) {
        c2.f(source.length() == 1, new Supplier() { // from class: aa0.l
            @Override // java.util.function.Supplier
            public final Object get() {
                return m.d(source);
            }
        });
        return Character.valueOf(source.charAt(0));
    }
}
