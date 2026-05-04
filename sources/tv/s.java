package tv;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s {
    public static <T> void a(T requirement, Class<T> clazz) {
        if (requirement != null) {
            return;
        }
        throw new IllegalStateException(clazz.getCanonicalName() + " must be set");
    }

    public static <T> T b(T reference) {
        reference.getClass();
        return reference;
    }

    public static <T> T c(T reference, String errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(errorMessage);
    }

    public static <T> T d(T reference, String errorMessageTemplate, Object errorMessageArg) {
        if (reference != null) {
            return reference;
        }
        if (!errorMessageTemplate.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (errorMessageTemplate.indexOf("%s") != errorMessageTemplate.lastIndexOf("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
        if (errorMessageArg instanceof Class) {
            errorMessageArg = ((Class) errorMessageArg).getCanonicalName();
        }
        throw new NullPointerException(errorMessageTemplate.replace("%s", String.valueOf(errorMessageArg)));
    }

    public static <T> T e(T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T f(T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
