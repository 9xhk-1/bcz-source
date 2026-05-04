package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {
    private static final GeneratedMessageInfoFactory instance = new GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public boolean isSupported(Class<?> messageType) {
        return GeneratedMessageLite.class.isAssignableFrom(messageType);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public MessageInfo messageInfoFor(Class<?> messageType) {
        if (!GeneratedMessageLite.class.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Unsupported message type: " + messageType.getName());
        }
        try {
            return (MessageInfo) GeneratedMessageLite.getDefaultInstance(messageType.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e11) {
            throw new RuntimeException("Unable to get message info for " + messageType.getName(), e11);
        }
    }
}
