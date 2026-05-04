package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Deprecated
        public static <T> void addAll(final Iterable<T> values, final Collection<? super T> list) {
            addAll((Iterable) values, (List) list);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> values, List<? super T> list) {
            if ((list instanceof ArrayList) && (values instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) values).size());
            }
            int size = list.size();
            for (T t11 : values) {
                if (t11 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t11);
            }
        }

        private String getReadingExceptionMessage(String target) {
            return "Reading " + getClass().getName() + " from a " + target + " threw an IOException (should never happen).";
        }

        public static UninitializedMessageException newUninitializedMessageException(MessageLite message) {
            return new UninitializedMessageException(message);
        }

        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo5607clone();

        public abstract BuilderType internalMergeFrom(MessageType message);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int read = input.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new LimitedInputStream(input, CodedInputStream.readRawVarint32(read, input)), extensionRegistry);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException;

        public static <T> void addAll(final Iterable<T> values, final List<? super T> list) {
            Internal.checkNotNull(values);
            if (!(values instanceof LazyStringList)) {
                if (values instanceof PrimitiveNonBoxingCollection) {
                    list.addAll((Collection) values);
                    return;
                } else {
                    addAllCheckingNulls(values, list);
                    return;
                }
            }
            List<?> underlyingElements = ((LazyStringList) values).getUnderlyingElements();
            LazyStringList lazyStringList = (LazyStringList) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                    for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                        lazyStringList.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    lazyStringList.add((ByteString) obj);
                } else if (obj instanceof byte[]) {
                    lazyStringList.add(ByteString.copyFrom((byte[]) obj));
                } else {
                    lazyStringList.add((LazyStringList) obj);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class LimitedInputStream extends FilterInputStream {
            private int limit;

            public LimitedInputStream(InputStream in2, int limit) {
                super(in2);
                this.limit = limit;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.limit--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(final long n11) throws IOException {
                int skip = (int) super.skip(Math.min(n11, this.limit));
                if (skip >= 0) {
                    this.limit -= skip;
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(final byte[] b11, final int off, int len) throws IOException {
                int i11 = this.limit;
                if (i11 <= 0) {
                    return -1;
                }
                int read = super.read(b11, off, Math.min(len, i11));
                if (read >= 0) {
                    this.limit -= read;
                }
                return read;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(final InputStream input) throws IOException {
            return mergeDelimitedFrom(input, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final CodedInputStream input) throws IOException {
            return mergeFrom(input, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final ByteString data) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newCodedInput = data.newCodedInput();
                mergeFrom(newCodedInput);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newCodedInput = data.newCodedInput();
                mergeFrom(newCodedInput, extensionRegistry);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data) throws InvalidProtocolBufferException {
            return mergeFrom(data, 0, data.length);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data, final int off, final int len) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(data, off, len);
                mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return mergeFrom(data, 0, data.length, extensionRegistry);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final byte[] data, final int off, final int len, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(data, off, len);
                mergeFrom(newInstance, extensionRegistry);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final InputStream input) throws IOException {
            CodedInputStream newInstance = CodedInputStream.newInstance(input);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            CodedInputStream newInstance = CodedInputStream.newInstance(input);
            mergeFrom(newInstance, extensionRegistry);
            newInstance.checkLastTagWas(0);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return (BuilderType) internalMergeFrom((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface InternalOneOfEnum {
        int getNumber();
    }

    public static <T> void addAll(final Iterable<T> values, final List<? super T> list) {
        Builder.addAll((Iterable) values, (List) list);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String target) {
        return "Serializing " + getClass().getName() + " to a " + target + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(Schema schema) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = schema.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void setMemoizedSerializedSize(int size) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream newInstance = CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (IOException e11) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeDelimitedTo(final OutputStream output) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream newInstance = CodedOutputStream.newInstance(output, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(final OutputStream output) throws IOException {
        CodedOutputStream newInstance = CodedOutputStream.newInstance(output, CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }
}
