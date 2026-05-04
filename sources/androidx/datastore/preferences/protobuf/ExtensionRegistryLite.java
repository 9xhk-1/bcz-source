package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    static final String EXTENSION_CLASS_NAME = "androidx.datastore.preferences.protobuf.Extension";
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExtensionClassHolder {
        static final Class<?> INSTANCE = resolveExtensionClass();

        private ExtensionClassHolder() {
        }

        public static Class<?> resolveExtensionClass() {
            try {
                return Class.forName(ExtensionRegistryLite.EXTENSION_CLASS_NAME);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ObjectIntPair {
        private final int number;
        private final Object object;

        public ObjectIntPair(final Object object, final int number) {
            this.object = object;
            this.number = number;
        }

        public boolean equals(final Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.object == objectIntPair.object && this.number == objectIntPair.number;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    public ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite;
        if (Protobuf.assumeLiteRuntime) {
            return EMPTY_REGISTRY_LITE;
        }
        ExtensionRegistryLite extensionRegistryLite2 = emptyRegistry;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = emptyRegistry;
                if (extensionRegistryLite == null) {
                    extensionRegistryLite = ExtensionRegistryFactory.createEmpty();
                    emptyRegistry = extensionRegistryLite;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return extensionRegistryLite;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite newInstance() {
        return Protobuf.assumeLiteRuntime ? new ExtensionRegistryLite() : ExtensionRegistryFactory.create();
    }

    public static void setEagerlyParseMessageSets(boolean isEagerlyParse) {
        eagerlyParseMessageSets = isEagerlyParse;
    }

    public final void add(final GeneratedMessageLite.GeneratedExtension<?, ?> extension) {
        this.extensionsByNumber.put(new ObjectIntPair(extension.getContainingTypeDefaultInstance(), extension.getNumber()), extension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(final ContainingType containingTypeDefaultInstance, final int fieldNumber) {
        return (GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new ObjectIntPair(containingTypeDefaultInstance, fieldNumber));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite other) {
        if (other == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(other.extensionsByNumber);
        }
    }

    public final void add(ExtensionLite<?, ?> extension) {
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extension.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension<?, ?>) extension);
        }
        if (Protobuf.assumeLiteRuntime || !ExtensionRegistryFactory.isFullRegistry(this)) {
            return;
        }
        try {
            getClass().getMethod("add", ExtensionClassHolder.INSTANCE).invoke(this, extension);
        } catch (Exception e11) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extension), e11);
        }
    }

    public ExtensionRegistryLite(boolean empty) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
