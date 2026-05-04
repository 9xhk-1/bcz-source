package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        /* renamed from: clone */
        Builder mo5607clone();

        boolean mergeDelimitedFrom(InputStream input) throws IOException;

        boolean mergeDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString data) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream input) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(MessageLite other);

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream input) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data, int off, int len) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data, int off, int len, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException;
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream output) throws IOException;

    void writeTo(CodedOutputStream output) throws IOException;

    void writeTo(OutputStream output) throws IOException;
}
