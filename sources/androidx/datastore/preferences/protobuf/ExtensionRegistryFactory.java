package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ExtensionRegistryFactory {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    public static ExtensionRegistryLite create() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("newInstance");
        return invokeSubclassFactory != null ? invokeSubclassFactory : new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite createEmpty() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return invokeSubclassFactory != null ? invokeSubclassFactory : ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String methodName) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(methodName, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isFullRegistry(ExtensionRegistryLite registry) {
        Class<?> cls;
        return (Protobuf.assumeLiteRuntime || (cls = EXTENSION_REGISTRY_CLASS) == null || !cls.isAssignableFrom(registry.getClass())) ? false : true;
    }

    public static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
