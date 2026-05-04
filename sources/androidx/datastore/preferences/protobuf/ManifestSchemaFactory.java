package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
final class ManifestSchemaFactory implements SchemaFactory {
    private static final MessageInfoFactory EMPTY_FACTORY = new MessageInfoFactory() { // from class: androidx.datastore.preferences.protobuf.ManifestSchemaFactory.1
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> clazz) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> clazz) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final MessageInfoFactory messageInfoFactory;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CompositeMessageInfoFactory implements MessageInfoFactory {
        private MessageInfoFactory[] factories;

        public CompositeMessageInfoFactory(MessageInfoFactory... factories) {
            this.factories = factories;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> clazz) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(clazz)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> clazz) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(clazz)) {
                    return messageInfoFactory.messageInfoFor(clazz);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + clazz.getName());
        }
    }

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private static boolean allowExtensions(MessageInfo messageInfo) {
        return AnonymousClass2.$SwitchMap$com$google$protobuf$ProtoSyntax[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static MessageInfoFactory getDefaultMessageInfoFactory() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static MessageInfoFactory getDescriptorMessageInfoFactory() {
        if (Protobuf.assumeLiteRuntime) {
            return EMPTY_FACTORY;
        }
        try {
            return (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> Schema<T> newSchema(Class<T> messageType, MessageInfo messageInfo) {
        if (useLiteRuntime(messageType)) {
            return MessageSchema.newSchema(messageType, messageInfo, NewInstanceSchemas.lite(), ListFieldSchemas.lite(), SchemaUtil.unknownFieldSetLiteSchema(), allowExtensions(messageInfo) ? ExtensionSchemas.lite() : null, MapFieldSchemas.lite());
        }
        NewInstanceSchema full = NewInstanceSchemas.full();
        ExtensionSchema<?> extensionSchema = null;
        ListFieldSchema full2 = ListFieldSchemas.full();
        UnknownFieldSchema<?, ?> unknownFieldSetFullSchema = SchemaUtil.unknownFieldSetFullSchema();
        if (allowExtensions(messageInfo)) {
            extensionSchema = ExtensionSchemas.full();
        }
        return MessageSchema.newSchema(messageType, messageInfo, full, full2, unknownFieldSetFullSchema, extensionSchema, MapFieldSchemas.full());
    }

    private static boolean useLiteRuntime(Class<?> messageType) {
        return Protobuf.assumeLiteRuntime || GeneratedMessageLite.class.isAssignableFrom(messageType);
    }

    @Override // androidx.datastore.preferences.protobuf.SchemaFactory
    public <T> Schema<T> createSchema(Class<T> messageType) {
        SchemaUtil.requireGeneratedMessage(messageType);
        MessageInfo messageInfoFor = this.messageInfoFactory.messageInfoFor(messageType);
        return messageInfoFor.isMessageSetWireFormat() ? useLiteRuntime(messageType) ? MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), messageInfoFor.getDefaultInstance()) : MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetFullSchema(), ExtensionSchemas.full(), messageInfoFor.getDefaultInstance()) : newSchema(messageType, messageInfoFor);
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (MessageInfoFactory) Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }
}
