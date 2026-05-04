package aa0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface l1 {
    boolean a(Class<?> targetType);

    default Object b(String source, Class<?> targetType, ClassLoader classLoader) throws Exception {
        return c(source, targetType);
    }

    Object c(String source, Class<?> targetType) throws Exception;
}
