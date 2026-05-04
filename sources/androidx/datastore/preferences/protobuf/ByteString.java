package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final ByteArrayCopier byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            return Arrays.copyOfRange(bytes, offset, size + offset);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bytes, int offset, int length) {
            super(bytes);
            ByteString.checkRange(offset, offset + length, bytes.length);
            this.bytesOffset = offset;
            this.bytesLength = length;
        }

        private void readObject(ObjectInputStream in2) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int index) {
            ByteString.checkIndex(index, size());
            return this.bytes[this.bytesOffset + index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int index) {
            return this.bytes[this.bytesOffset + index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bytes, int offset, int size);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new LiteralByteString(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }

        private CodedBuilder(int size) {
            byte[] bArr = new byte[size];
            this.buffer = bArr;
            this.output = CodedOutputStream.newInstance(bArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        public abstract boolean equalsRange(ByteString other, int offset, int length);

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void writeToReverse(ByteOutput byteOutput) throws IOException {
            writeTo(byteOutput);
        }

        private LeafByteString() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bytes) {
            super();
            bytes.getClass();
            this.bytes = bytes;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int index) {
            return this.bytes[index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void copyTo(ByteBuffer target) {
            target.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.bytes, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ByteString) || size() != ((ByteString) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(other instanceof LiteralByteString)) {
                return other.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) other;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString other, int offset, int length) {
            if (length > other.size()) {
                throw new IllegalArgumentException("Length too large: " + length + size());
            }
            int i11 = offset + length;
            if (i11 > other.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + offset + j2.O + length + j2.O + other.size());
            }
            if (!(other instanceof LiteralByteString)) {
                return other.substring(offset, i11).equals(substring(0, length));
            }
            LiteralByteString literalByteString = (LiteralByteString) other;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + length;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + offset;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int index) {
            return this.bytes[index];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialHash(int h11, int offset, int length) {
            return Internal.partialHash(h11, this.bytes, getOffsetIntoBytes() + offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialIsValidUtf8(int state, int offset, int length) {
            int offsetIntoBytes = getOffsetIntoBytes() + offset;
            return Utf8.partialIsValidUtf8(state, this.bytes, offsetIntoBytes, length + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString substring(int beginIndex, int endIndex) {
            int checkRange = ByteString.checkRange(beginIndex, endIndex, size());
            return checkRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + beginIndex, checkRange);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int sourceOffset, int numberToWrite) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + sourceOffset, numberToWrite);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(ByteOutput output) throws IOException {
            output.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NioByteString extends LeafByteString {
        private final ByteBuffer buffer;

        public NioByteString(ByteBuffer buffer) {
            super();
            Internal.checkNotNull(buffer, "buffer");
            this.buffer = buffer.slice().order(ByteOrder.nativeOrder());
        }

        private void readObject(ObjectInputStream in2) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private ByteBuffer slice(int beginIndex, int endIndex) {
            if (beginIndex < this.buffer.position() || endIndex > this.buffer.limit() || beginIndex > endIndex) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(beginIndex), Integer.valueOf(endIndex)));
            }
            ByteBuffer slice = this.buffer.slice();
            Java8Compatibility.position(slice, beginIndex - this.buffer.position());
            Java8Compatibility.limit(slice, endIndex - this.buffer.position());
            return slice;
        }

        private Object writeReplace() {
            return ByteString.copyFrom(this.buffer.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public ByteBuffer asReadOnlyByteBuffer() {
            return this.buffer.asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int index) {
            try {
                return this.buffer.get(index);
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new ArrayIndexOutOfBoundsException(e12.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void copyTo(ByteBuffer target) {
            target.put(this.buffer.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            ByteBuffer slice = this.buffer.slice();
            Java8Compatibility.position(slice, sourceOffset);
            slice.get(target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) other;
            if (size() != byteString.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            return other instanceof NioByteString ? this.buffer.equals(((NioByteString) other).buffer) : other instanceof RopeByteString ? other.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public boolean equalsRange(ByteString other, int offset, int length) {
            return substring(0, length).equals(other.substring(offset, length + offset));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte internalByteAt(int index) {
            return byteAt(index);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public boolean isValidUtf8() {
            return Utf8.isValidUtf8(this.buffer);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.buffer, true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public InputStream newInput() {
            return new InputStream() { // from class: androidx.datastore.preferences.protobuf.ByteString.NioByteString.1
                private final ByteBuffer buf;

                {
                    this.buf = NioByteString.this.buffer.slice();
                }

                @Override // java.io.InputStream
                public int available() throws IOException {
                    return this.buf.remaining();
                }

                @Override // java.io.InputStream
                public void mark(int readlimit) {
                    Java8Compatibility.mark(this.buf);
                }

                @Override // java.io.InputStream
                public boolean markSupported() {
                    return true;
                }

                @Override // java.io.InputStream
                public int read() throws IOException {
                    if (this.buf.hasRemaining()) {
                        return this.buf.get() & 255;
                    }
                    return -1;
                }

                @Override // java.io.InputStream
                public void reset() throws IOException {
                    try {
                        Java8Compatibility.reset(this.buf);
                    } catch (InvalidMarkException e11) {
                        throw new IOException(e11);
                    }
                }

                @Override // java.io.InputStream
                public int read(byte[] bytes, int off, int len) throws IOException {
                    if (!this.buf.hasRemaining()) {
                        return -1;
                    }
                    int min = Math.min(len, this.buf.remaining());
                    this.buf.get(bytes, off, min);
                    return min;
                }
            };
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int partialHash(int h11, int offset, int length) {
            for (int i11 = offset; i11 < offset + length; i11++) {
                h11 = (h11 * 31) + this.buffer.get(i11);
            }
            return h11;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int partialIsValidUtf8(int state, int offset, int length) {
            return Utf8.partialIsValidUtf8(state, this.buffer, offset, length + offset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.buffer.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public ByteString substring(int beginIndex, int endIndex) {
            try {
                return new NioByteString(slice(beginIndex, endIndex));
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new ArrayIndexOutOfBoundsException(e12.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public String toStringInternal(Charset charset) {
            byte[] byteArray;
            int length;
            int i11;
            if (this.buffer.hasArray()) {
                byteArray = this.buffer.array();
                i11 = this.buffer.arrayOffset() + this.buffer.position();
                length = this.buffer.remaining();
            } else {
                byteArray = toByteArray();
                length = byteArray.length;
                i11 = 0;
            }
            return new String(byteArray, i11, length, charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void writeTo(OutputStream out) throws IOException {
            out.write(toByteArray());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void writeToInternal(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
            if (!this.buffer.hasArray()) {
                ByteBufferWriter.write(slice(sourceOffset, numberToWrite + sourceOffset), out);
            } else {
                out.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + sourceOffset, numberToWrite);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void writeTo(ByteOutput output) throws IOException {
            output.writeLazy(this.buffer.slice());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }
    }

    static {
        byteArrayCopier = Android.isOnAndroidDevice() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new Comparator<ByteString>() { // from class: androidx.datastore.preferences.protobuf.ByteString.2
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator, java.util.Iterator] */
            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator, java.util.Iterator] */
            @Override // java.util.Comparator
            public int compare(ByteString former, ByteString latter) {
                ?? iterator2 = former.iterator2();
                ?? iterator22 = latter.iterator2();
                while (iterator2.hasNext() && iterator22.hasNext()) {
                    int compareTo = Integer.valueOf(ByteString.toInt(iterator2.nextByte())).compareTo(Integer.valueOf(ByteString.toInt(iterator22.nextByte())));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return Integer.valueOf(former.size()).compareTo(Integer.valueOf(latter.size()));
            }
        };
    }

    private static ByteString balancedConcat(Iterator<ByteString> iterator, int length) {
        if (length < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(length)));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i11 = length >>> 1;
        return balancedConcat(iterator, i11).concat(balancedConcat(iterator, length - i11));
    }

    public static void checkIndex(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + index);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + index + j2.O + size);
        }
    }

    @CanIgnoreReturnValue
    public static int checkRange(int startIndex, int endIndex, int size) {
        int i11 = endIndex - startIndex;
        if ((startIndex | endIndex | i11 | (size - endIndex)) >= 0) {
            return i11;
        }
        if (startIndex < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + startIndex + " < 0");
        }
        if (endIndex < startIndex) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + startIndex + j2.O + endIndex);
        }
        throw new IndexOutOfBoundsException("End index: " + endIndex + " >= " + size);
    }

    public static ByteString copyFrom(byte[] bytes, int offset, int size) {
        checkRange(offset, offset + size, bytes.length);
        return new LiteralByteString(byteArrayCopier.copyFrom(bytes, offset, size));
    }

    public static ByteString copyFromUtf8(String text) {
        return new LiteralByteString(text.getBytes(Internal.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String hexString, int index) {
        int hexDigit = hexDigit(hexString.charAt(index));
        if (hexDigit != -1) {
            return hexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + hexString + " must only contain [0-9a-fA-F] but contained " + hexString.charAt(index) + " at index " + index);
    }

    public static ByteString fromHex(@CompileTimeConstant String hexString) {
        if (hexString.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + hexString + " of length " + hexString.length() + " must be even.");
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (extractHexDigit(hexString, i12 + 1) | (extractHexDigit(hexString, i12) << 4));
        }
        return new LiteralByteString(bArr);
    }

    private static int hexDigit(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'A' && c11 <= 'F') {
            return c11 - '7';
        }
        if (c11 < 'a' || c11 > 'f') {
            return -1;
        }
        return c11 - 'W';
    }

    public static CodedBuilder newCodedBuilder(int size) {
        return new CodedBuilder(size);
    }

    public static Output newOutput(int initialCapacity) {
        return new Output(initialCapacity);
    }

    public static ByteString nioByteString(ByteBuffer buffer) {
        return new NioByteString(buffer);
    }

    private static ByteString readChunk(InputStream in2, final int chunkSize) throws IOException {
        byte[] bArr = new byte[chunkSize];
        int i11 = 0;
        while (i11 < chunkSize) {
            int read = in2.read(bArr, i11, chunkSize - i11);
            if (read == -1) {
                break;
            }
            i11 += read;
        }
        if (i11 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i11);
    }

    public static ByteString readFrom(InputStream streamToDrain) throws IOException {
        return readFrom(streamToDrain, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte value) {
        return value & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return TextFormatEscaper.escapeBytes(this);
        }
        return TextFormatEscaper.escapeBytes(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer buffer) {
        if (!buffer.hasArray()) {
            return new NioByteString(buffer);
        }
        return wrap(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int index);

    public final ByteString concat(ByteString other) {
        if (Integer.MAX_VALUE - size() >= other.size()) {
            return RopeByteString.concatenate(this, other);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + other.size());
    }

    public abstract void copyTo(ByteBuffer target);

    public void copyTo(byte[] target, int offset) {
        copyTo(target, 0, offset, size());
    }

    public abstract void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    public final boolean endsWith(ByteString suffix) {
        return size() >= suffix.size() && substring(size() - suffix.size()).equals(suffix);
    }

    public abstract boolean equals(Object o11);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i11 = this.hash;
        if (i11 == 0) {
            int size = size();
            i11 = partialHash(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.hash = i11;
        }
        return i11;
    }

    public abstract byte internalByteAt(int index);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int h11, int offset, int length);

    public abstract int partialIsValidUtf8(int state, int offset, int length);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString prefix) {
        return size() >= prefix.size() && substring(0, prefix.size()).equals(prefix);
    }

    public final ByteString substring(int beginIndex) {
        return substring(beginIndex, size());
    }

    public abstract ByteString substring(int beginIndex, int endIndex);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String charsetName) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(charsetName));
        } catch (UnsupportedCharsetException e11) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e11);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.UTF_8);
    }

    public abstract void writeTo(ByteOutput byteOutput) throws IOException;

    public abstract void writeTo(OutputStream out) throws IOException;

    public final void writeTo(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        checkRange(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            writeToInternal(out, sourceOffset, numberToWrite);
        }
    }

    public abstract void writeToInternal(OutputStream out, int sourceOffset, int numberToWrite) throws IOException;

    public abstract void writeToReverse(ByteOutput byteOutput) throws IOException;

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream streamToDrain, int chunkSize) throws IOException {
        return readFrom(streamToDrain, chunkSize, chunkSize);
    }

    @Deprecated
    public final void copyTo(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        checkRange(sourceOffset, sourceOffset + numberToCopy, size());
        checkRange(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.ByteString.1
            private final int limit;
            private int position = 0;

            {
                this.limit = ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < this.limit;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i11 = this.position;
                if (i11 >= this.limit) {
                    throw new NoSuchElementException();
                }
                this.position = i11 + 1;
                return ByteString.this.internalByteAt(i11);
            }
        };
    }

    public static ByteString copyFrom(byte[] bytes) {
        return copyFrom(bytes, 0, bytes.length);
    }

    public static ByteString readFrom(InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(streamToDrain, minChunkSize);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            minChunkSize = Math.min(minChunkSize * 2, maxChunkSize);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = initialCapacity;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[initialCapacity];
        }

        private void flushFullBuffer(int minSize) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(minSize, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i11 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i11 >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i11 > 0) {
                this.flushedBuffers.add(new LiteralByteString(Arrays.copyOf(bArr, i11)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b11) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i11 = this.bufferPos;
                this.bufferPos = i11 + 1;
                bArr[i11] = (byte) b11;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public void writeTo(OutputStream out) throws IOException {
            int i11;
            ByteString[] byteStringArr;
            byte[] bArr;
            int i12;
            synchronized (this) {
                byteStringArr = (ByteString[]) this.flushedBuffers.toArray(new ByteString[0]);
                bArr = this.buffer;
                i12 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(out);
            }
            out.write(Arrays.copyOf(bArr, i12));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b11, int offset, int length) {
            try {
                byte[] bArr = this.buffer;
                int length2 = bArr.length;
                int i11 = this.bufferPos;
                if (length <= length2 - i11) {
                    System.arraycopy(b11, offset, bArr, i11, length);
                    this.bufferPos += length;
                } else {
                    int length3 = bArr.length - i11;
                    System.arraycopy(b11, offset, bArr, i11, length3);
                    int i12 = length - length3;
                    flushFullBuffer(i12);
                    System.arraycopy(b11, offset + length3, this.buffer, 0, i12);
                    this.bufferPos = i12;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer bytes, int size) {
        checkRange(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bytes) {
        return new LiteralByteString(bytes);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bytes, int offset, int length) {
        return new BoundedByteString(bytes, offset, length);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static ByteString copyFrom(ByteBuffer bytes) {
        return copyFrom(bytes, bytes.remaining());
    }

    public static ByteString copyFrom(String text, String charsetName) throws UnsupportedEncodingException {
        return new LiteralByteString(text.getBytes(charsetName));
    }

    public static ByteString copyFrom(String text, Charset charset) {
        return new LiteralByteString(text.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> byteStrings) {
        int size;
        if (!(byteStrings instanceof Collection)) {
            Iterator<ByteString> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) byteStrings).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(byteStrings.iterator(), size);
    }
}
