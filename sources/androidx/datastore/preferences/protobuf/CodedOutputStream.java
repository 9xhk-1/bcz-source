package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import com.alipay.sdk.m.n.a;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        public AbstractBufferedEncoder(int bufferSize) {
            super();
            if (bufferSize < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(bufferSize, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void buffer(byte value) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr[i11] = value;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int value) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            this.position = i12;
            bArr[i11] = (byte) (value & 255);
            int i13 = i11 + 2;
            this.position = i13;
            bArr[i12] = (byte) ((value >> 8) & 255);
            int i14 = i11 + 3;
            this.position = i14;
            bArr[i13] = (byte) ((value >> 16) & 255);
            this.position = i11 + 4;
            bArr[i14] = (byte) ((value >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            this.position = i12;
            bArr[i11] = (byte) (value & 255);
            int i13 = i11 + 2;
            this.position = i13;
            bArr[i12] = (byte) ((value >> 8) & 255);
            int i14 = i11 + 3;
            this.position = i14;
            bArr[i13] = (byte) ((value >> 16) & 255);
            int i15 = i11 + 4;
            this.position = i15;
            bArr[i14] = (byte) (255 & (value >> 24));
            int i16 = i11 + 5;
            this.position = i16;
            bArr[i15] = (byte) (((int) (value >> 32)) & 255);
            int i17 = i11 + 6;
            this.position = i17;
            bArr[i16] = (byte) (((int) (value >> 40)) & 255);
            int i18 = i11 + 7;
            this.position = i18;
            bArr[i17] = (byte) (((int) (value >> 48)) & 255);
            this.position = i11 + 8;
            bArr[i18] = (byte) (((int) (value >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(final int value) {
            if (value >= 0) {
                bufferUInt32NoTag(value);
            } else {
                bufferUInt64NoTag(value);
            }
        }

        public final void bufferTag(final int fieldNumber, final int wireType) {
            bufferUInt32NoTag(WireFormat.makeTag(fieldNumber, wireType));
        }

        public final void bufferUInt32NoTag(int value) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((value & a.f10855g) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) ((value | 128) & 255);
                    this.totalBytesWritten++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                bArr2[i12] = (byte) value;
                this.totalBytesWritten++;
                return;
            }
            long j11 = this.position;
            while ((value & a.f10855g) != 0) {
                byte[] bArr3 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                UnsafeUtil.putByte(bArr3, i13, (byte) ((value | 128) & 255));
                value >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            UnsafeUtil.putByte(bArr4, i14, (byte) value);
            this.totalBytesWritten += (int) (this.position - j11);
        }

        public final void bufferUInt64NoTag(long value) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) ((((int) value) | 128) & 255);
                    this.totalBytesWritten++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                bArr2[i12] = (byte) value;
                this.totalBytesWritten++;
                return;
            }
            long j11 = this.position;
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                UnsafeUtil.putByte(bArr3, i13, (byte) ((((int) value) | 128) & 255));
                value >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            UnsafeUtil.putByte(bArr4, i14, (byte) value);
            this.totalBytesWritten += (int) (this.position - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public ArrayEncoder(byte[] buffer, int offset, int length) {
            super();
            if (buffer == null) {
                throw new NullPointerException("buffer");
            }
            int i11 = offset + length;
            if ((offset | length | (buffer.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(buffer.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            this.buffer = buffer;
            this.offset = offset;
            this.position = offset;
            this.limit = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte value) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr[i11] = value;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i11, boolean z11) throws IOException {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(final ByteString value) throws IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int value) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) (value & 255);
                int i13 = i11 + 2;
                this.position = i13;
                bArr[i12] = (byte) ((value >> 8) & 255);
                int i14 = i11 + 3;
                this.position = i14;
                bArr[i13] = (byte) ((value >> 16) & 255);
                this.position = i11 + 4;
                bArr[i14] = (byte) ((value >> 24) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long value) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) (((int) value) & 255);
                int i13 = i11 + 2;
                this.position = i13;
                bArr[i12] = (byte) (((int) (value >> 8)) & 255);
                int i14 = i11 + 3;
                this.position = i14;
                bArr[i13] = (byte) (((int) (value >> 16)) & 255);
                int i15 = i11 + 4;
                this.position = i15;
                bArr[i14] = (byte) (((int) (value >> 24)) & 255);
                int i16 = i11 + 5;
                this.position = i16;
                bArr[i15] = (byte) (((int) (value >> 32)) & 255);
                int i17 = i11 + 6;
                this.position = i17;
                bArr[i16] = (byte) (((int) (value >> 40)) & 255);
                int i18 = i11 + 7;
                this.position = i18;
                bArr[i17] = (byte) (((int) (value >> 48)) & 255);
                this.position = i11 + 8;
                bArr[i18] = (byte) (((int) (value >> 56)) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(final MessageLite value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer duplicate = value.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String value) throws IOException {
            int i11 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(value.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(value.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(value));
                    this.position = Utf8.encode(value, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i12 = i11 + computeUInt32SizeNoTag2;
                this.position = i12;
                int encode = Utf8.encode(value, this.buffer, i12, spaceLeft());
                this.position = i11;
                writeUInt32NoTag((encode - i11) - computeUInt32SizeNoTag2);
                this.position = encode;
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.position = i11;
                inefficientWriteStringNoTag(value, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int value) throws IOException {
            while ((value & a.f10855g) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) ((value | 128) & 255);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
                }
            }
            byte[] bArr2 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr2[i12] = (byte) value;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long value) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    UnsafeUtil.putByte(bArr, i11, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                UnsafeUtil.putByte(bArr2, i12, (byte) value);
                return;
            }
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    bArr3[i13] = (byte) ((((int) value) | 128) & 255);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e11);
                }
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            bArr4[i14] = (byte) value;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(final int fieldNumber, final MessageLite value, Schema schema) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(((AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(final MessageLite value, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] value, int offset, int length) throws IOException {
            try {
                System.arraycopy(value, offset, this.buffer, this.position, length);
                this.position += length;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(length)), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer value) throws IOException {
            int remaining = value.remaining();
            try {
                value.get(this.buffer, this.position, remaining);
                this.position += remaining;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        public ByteOutputEncoder(ByteOutput out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.out = out;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int requiredSize) throws IOException {
            if (this.limit - this.position < requiredSize) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i11, 0);
            buffer(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(final ByteString value) throws IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(fieldNumber, 5);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(final int value) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(fieldNumber, 1);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(final long value) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            flush();
            this.out.writeLazy(value, offset, length);
            this.totalBytesWritten += length;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final MessageLite value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer duplicate = value.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String value) throws IOException {
            int length = value.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i11 = computeUInt32SizeNoTag + length;
            int i12 = this.limit;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int encode = Utf8.encode(value, bArr, 0, length);
                writeUInt32NoTag(encode);
                writeLazy(bArr, 0, encode);
                return;
            }
            if (i11 > i12 - this.position) {
                doFlush();
            }
            int i13 = this.position;
            try {
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(value.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    int encodedLength = Utf8.encodedLength(value);
                    bufferUInt32NoTag(encodedLength);
                    this.position = Utf8.encode(value, this.buffer, this.position, encodedLength);
                    this.totalBytesWritten += encodedLength;
                    return;
                }
                int i14 = i13 + computeUInt32SizeNoTag2;
                this.position = i14;
                int encode2 = Utf8.encode(value, this.buffer, i14, this.limit - i14);
                this.position = i13;
                int i15 = (encode2 - i13) - computeUInt32SizeNoTag2;
                bufferUInt32NoTag(i15);
                this.position = encode2;
                this.totalBytesWritten += i15;
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.totalBytesWritten -= this.position - i13;
                this.position = i13;
                inefficientWriteStringNoTag(value, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final MessageLite value, Schema schema) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final MessageLite value, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws IOException {
            flush();
            this.out.write(value, offset, length);
            this.totalBytesWritten += length;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) throws IOException {
            flush();
            int remaining = value.remaining();
            this.out.writeLazy(value);
            this.totalBytesWritten += remaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) throws IOException {
            flush();
            int remaining = value.remaining();
            this.out.write(value);
            this.totalBytesWritten += remaining;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        public HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String explanationMessage) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage);
        }

        public OutOfSpaceException(Throwable cause) {
            super(MESSAGE, cause);
        }

        public OutOfSpaceException(String explanationMessage, Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage, cause);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        public OutputStreamEncoder(OutputStream out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.out = out;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int requiredSize) throws IOException {
            if (this.limit - this.position < requiredSize) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i11, 0);
            buffer(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(final ByteString value) throws IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(fieldNumber, 5);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(final int value) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(fieldNumber, 1);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(final long value) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final MessageLite value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer duplicate = value.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String value) throws IOException {
            int encodedLength;
            try {
                int length = value.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i11 = computeUInt32SizeNoTag + length;
                int i12 = this.limit;
                if (i11 > i12) {
                    byte[] bArr = new byte[length];
                    int encode = Utf8.encode(value, bArr, 0, length);
                    writeUInt32NoTag(encode);
                    writeLazy(bArr, 0, encode);
                    return;
                }
                if (i11 > i12 - this.position) {
                    doFlush();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(value.length());
                int i13 = this.position;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i14 = i13 + computeUInt32SizeNoTag2;
                        this.position = i14;
                        int encode2 = Utf8.encode(value, this.buffer, i14, this.limit - i14);
                        this.position = i13;
                        encodedLength = (encode2 - i13) - computeUInt32SizeNoTag2;
                        bufferUInt32NoTag(encodedLength);
                        this.position = encode2;
                    } else {
                        encodedLength = Utf8.encodedLength(value);
                        bufferUInt32NoTag(encodedLength);
                        this.position = Utf8.encode(value, this.buffer, this.position, encodedLength);
                    }
                    this.totalBytesWritten += encodedLength;
                } catch (Utf8.UnpairedSurrogateException e11) {
                    this.totalBytesWritten -= this.position - i13;
                    this.position = i13;
                    throw e11;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(e12);
                }
            } catch (Utf8.UnpairedSurrogateException e13) {
                inefficientWriteStringNoTag(value, e13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(fieldNumber, 0);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final MessageLite value, Schema schema) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final MessageLite value, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws IOException {
            int i11 = this.limit;
            int i12 = this.position;
            if (i11 - i12 >= length) {
                System.arraycopy(value, offset, this.buffer, i12, length);
                this.position += length;
                this.totalBytesWritten += length;
                return;
            }
            int i13 = i11 - i12;
            System.arraycopy(value, offset, this.buffer, i12, i13);
            int i14 = offset + i13;
            int i15 = length - i13;
            this.position = this.limit;
            this.totalBytesWritten += i13;
            doFlush();
            if (i15 <= this.limit) {
                System.arraycopy(value, i14, this.buffer, 0, i15);
                this.position = i15;
            } else {
                this.out.write(value, i14, i15);
            }
            this.totalBytesWritten += i15;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) throws IOException {
            int remaining = value.remaining();
            int i11 = this.limit;
            int i12 = this.position;
            if (i11 - i12 >= remaining) {
                value.get(this.buffer, i12, remaining);
                this.position += remaining;
                this.totalBytesWritten += remaining;
                return;
            }
            int i13 = i11 - i12;
            value.get(this.buffer, i12, i13);
            int i14 = remaining - i13;
            this.position = this.limit;
            this.totalBytesWritten += i13;
            doFlush();
            while (true) {
                int i15 = this.limit;
                if (i14 > i15) {
                    value.get(this.buffer, 0, i15);
                    this.out.write(this.buffer, 0, this.limit);
                    int i16 = this.limit;
                    i14 -= i16;
                    this.totalBytesWritten += i16;
                } else {
                    value.get(this.buffer, 0, i14);
                    this.position = i14;
                    this.totalBytesWritten += i14;
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public SafeDirectNioEncoder(ByteBuffer buffer) {
            super();
            this.originalBuffer = buffer;
            this.buffer = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = buffer.position();
        }

        private void encode(String value) throws IOException {
            try {
                Utf8.encodeUtf8(value, this.buffer);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, this.buffer.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws IOException {
            try {
                this.buffer.put(value);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(final ByteString value) throws IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int value) throws IOException {
            try {
                this.buffer.putInt(value);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long value) throws IOException {
            try {
                this.buffer.putLong(value);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final MessageLite value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(final int fieldNumber, final MessageLite value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer duplicate = value.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(final int fieldNumber, final ByteString value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String value) throws IOException {
            int position = this.buffer.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(value.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(value.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(value));
                    encode(value);
                    return;
                }
                int position2 = this.buffer.position() + computeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, position2);
                encode(value);
                int position3 = this.buffer.position();
                Java8Compatibility.position(this.buffer, position);
                writeUInt32NoTag(position3 - position2);
                Java8Compatibility.position(this.buffer, position3);
            } catch (Utf8.UnpairedSurrogateException e11) {
                Java8Compatibility.position(this.buffer, position);
                inefficientWriteStringNoTag(value, e11);
            } catch (IllegalArgumentException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws IOException {
            while ((value & a.f10855g) != 0) {
                try {
                    this.buffer.put((byte) ((value | 128) & 255));
                    value >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new OutOfSpaceException(e11);
                }
            }
            this.buffer.put((byte) value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws IOException {
            while (((-128) & value) != 0) {
                try {
                    this.buffer.put((byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                } catch (BufferOverflowException e11) {
                    throw new OutOfSpaceException(e11);
                }
            }
            this.buffer.put((byte) value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws IOException {
            try {
                this.buffer.put(value, offset, length);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(final int fieldNumber, final MessageLite value, Schema schema) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(final MessageLite value, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) throws IOException {
            try {
                this.buffer.put(value);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        public UnsafeDirectNioEncoder(ByteBuffer buffer) {
            super();
            this.originalBuffer = buffer;
            this.buffer = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long addressOffset = UnsafeUtil.addressOffset(buffer);
            this.address = addressOffset;
            long position = buffer.position() + addressOffset;
            this.initialPosition = position;
            long limit = addressOffset + buffer.limit();
            this.limit = limit;
            this.oneVarintLimit = limit - 10;
            this.position = position;
        }

        private int bufferPos(long pos) {
            return (int) (pos - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long pos) {
            Java8Compatibility.position(this.buffer, bufferPos(pos));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) throws IOException {
            long j11 = this.position;
            if (j11 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j11;
            UnsafeUtil.putByte(j11, value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i11, boolean z11) throws IOException {
            writeTag(i11, 0);
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int fieldNumber, byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int fieldNumber, ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int fieldNumber, ByteString value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString value) throws IOException {
            writeUInt32NoTag(value.size());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int value) throws IOException {
            this.buffer.putInt(bufferPos(this.position), value);
            this.position += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int fieldNumber, long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long value) throws IOException {
            this.buffer.putLong(bufferPos(this.position), value);
            this.position += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int fieldNumber, MessageLite value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int fieldNumber, MessageLite value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer duplicate = value.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int fieldNumber, ByteString value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int fieldNumber, String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String value) throws IOException {
            long j11 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(value.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(value.length());
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    int encodedLength = Utf8.encodedLength(value);
                    writeUInt32NoTag(encodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(value, this.buffer);
                    this.position += encodedLength;
                    return;
                }
                int bufferPos = bufferPos(this.position) + computeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, bufferPos);
                Utf8.encodeUtf8(value, this.buffer);
                int position = this.buffer.position() - bufferPos;
                writeUInt32NoTag(position);
                this.position += position;
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.position = j11;
                repositionBuffer(j11);
                inefficientWriteStringNoTag(value, e11);
            } catch (IllegalArgumentException e12) {
                throw new OutOfSpaceException(e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int fieldNumber, int wireType) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int value) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((value & a.f10855g) != 0) {
                    long j11 = this.position;
                    this.position = j11 + 1;
                    UnsafeUtil.putByte(j11, (byte) ((value | 128) & 255));
                    value >>>= 7;
                }
                long j12 = this.position;
                this.position = 1 + j12;
                UnsafeUtil.putByte(j12, (byte) value);
                return;
            }
            while (true) {
                long j13 = this.position;
                if (j13 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((value & a.f10855g) == 0) {
                    this.position = 1 + j13;
                    UnsafeUtil.putByte(j13, (byte) value);
                    return;
                } else {
                    this.position = j13 + 1;
                    UnsafeUtil.putByte(j13, (byte) ((value | 128) & 255));
                    value >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int fieldNumber, long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long value) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((value & (-128)) != 0) {
                    long j11 = this.position;
                    this.position = j11 + 1;
                    UnsafeUtil.putByte(j11, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
                long j12 = this.position;
                this.position = 1 + j12;
                UnsafeUtil.putByte(j12, (byte) value);
                return;
            }
            while (true) {
                long j13 = this.position;
                if (j13 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((value & (-128)) == 0) {
                    this.position = 1 + j13;
                    UnsafeUtil.putByte(j13, (byte) value);
                    return;
                } else {
                    this.position = j13 + 1;
                    UnsafeUtil.putByte(j13, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int fieldNumber, byte[] value, int offset, int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int fieldNumber, MessageLite value, Schema schema) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite value, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) value).getSerializedSize(schema));
            schema.writeTo(value, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) throws IOException {
            if (value != null && offset >= 0 && length >= 0 && value.length - length >= offset) {
                long j11 = length;
                long j12 = this.limit - j11;
                long j13 = this.position;
                if (j12 >= j13) {
                    UnsafeUtil.copyMemory(value, offset, j13, j11);
                    this.position += j11;
                    return;
                }
            }
            if (value == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(length)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) throws IOException {
            try {
                int remaining = value.remaining();
                repositionBuffer(this.position);
                this.buffer.put(value);
                this.position += remaining;
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }
    }

    public static int computeBoolSize(final int fieldNumber, final boolean value) {
        return computeTagSize(fieldNumber) + computeBoolSizeNoTag(value);
    }

    public static int computeBoolSizeNoTag(final boolean unused) {
        return 1;
    }

    public static int computeByteArraySize(final int fieldNumber, final byte[] value) {
        return computeTagSize(fieldNumber) + computeByteArraySizeNoTag(value);
    }

    public static int computeByteArraySizeNoTag(final byte[] value) {
        return computeLengthDelimitedFieldSize(value.length);
    }

    public static int computeByteBufferSize(final int fieldNumber, final ByteBuffer value) {
        return computeTagSize(fieldNumber) + computeByteBufferSizeNoTag(value);
    }

    public static int computeByteBufferSizeNoTag(final ByteBuffer value) {
        return computeLengthDelimitedFieldSize(value.capacity());
    }

    public static int computeBytesSize(final int fieldNumber, final ByteString value) {
        return computeTagSize(fieldNumber) + computeBytesSizeNoTag(value);
    }

    public static int computeBytesSizeNoTag(final ByteString value) {
        return computeLengthDelimitedFieldSize(value.size());
    }

    public static int computeDoubleSize(final int fieldNumber, final double value) {
        return computeTagSize(fieldNumber) + computeDoubleSizeNoTag(value);
    }

    public static int computeDoubleSizeNoTag(final double unused) {
        return 8;
    }

    public static int computeEnumSize(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeEnumSizeNoTag(value);
    }

    public static int computeEnumSizeNoTag(final int value) {
        return computeInt32SizeNoTag(value);
    }

    public static int computeFixed32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeFixed32SizeNoTag(value);
    }

    public static int computeFixed32SizeNoTag(final int unused) {
        return 4;
    }

    public static int computeFixed64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeFixed64SizeNoTag(value);
    }

    public static int computeFixed64SizeNoTag(final long unused) {
        return 8;
    }

    public static int computeFloatSize(final int fieldNumber, final float value) {
        return computeTagSize(fieldNumber) + computeFloatSizeNoTag(value);
    }

    public static int computeFloatSizeNoTag(final float unused) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(final int fieldNumber, final MessageLite value) {
        return (computeTagSize(fieldNumber) * 2) + value.getSerializedSize();
    }

    @InlineMe(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(final MessageLite value) {
        return value.getSerializedSize();
    }

    public static int computeInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeInt32SizeNoTag(value);
    }

    public static int computeInt32SizeNoTag(final int value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeInt64SizeNoTag(value);
    }

    public static int computeInt64SizeNoTag(final long value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeLazyFieldMessageSetExtensionSize(final int fieldNumber, final LazyFieldLite value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeLazyFieldSize(3, value);
    }

    public static int computeLazyFieldSize(final int fieldNumber, final LazyFieldLite value) {
        return computeTagSize(fieldNumber) + computeLazyFieldSizeNoTag(value);
    }

    public static int computeLazyFieldSizeNoTag(final LazyFieldLite value) {
        return computeLengthDelimitedFieldSize(value.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int fieldLength) {
        return computeUInt32SizeNoTag(fieldLength) + fieldLength;
    }

    public static int computeMessageSetExtensionSize(final int fieldNumber, final MessageLite value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeMessageSize(3, value);
    }

    public static int computeMessageSize(final int fieldNumber, final MessageLite value) {
        return computeTagSize(fieldNumber) + computeMessageSizeNoTag(value);
    }

    public static int computeMessageSizeNoTag(final MessageLite value) {
        return computeLengthDelimitedFieldSize(value.getSerializedSize());
    }

    public static int computePreferredBufferSize(int dataLength) {
        if (dataLength > 4096) {
            return 4096;
        }
        return dataLength;
    }

    public static int computeRawMessageSetExtensionSize(final int fieldNumber, final ByteString value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeBytesSize(3, value);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(final int value) {
        return computeUInt32SizeNoTag(value);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeSFixed32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeSFixed32SizeNoTag(value);
    }

    public static int computeSFixed32SizeNoTag(final int unused) {
        return 4;
    }

    public static int computeSFixed64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeSFixed64SizeNoTag(value);
    }

    public static int computeSFixed64SizeNoTag(final long unused) {
        return 8;
    }

    public static int computeSInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeSInt32SizeNoTag(value);
    }

    public static int computeSInt32SizeNoTag(final int value) {
        return computeUInt32SizeNoTag(encodeZigZag32(value));
    }

    public static int computeSInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeSInt64SizeNoTag(value);
    }

    public static int computeSInt64SizeNoTag(final long value) {
        return computeUInt64SizeNoTag(encodeZigZag64(value));
    }

    public static int computeStringSize(final int fieldNumber, final String value) {
        return computeTagSize(fieldNumber) + computeStringSizeNoTag(value);
    }

    public static int computeStringSizeNoTag(final String value) {
        int length;
        try {
            length = Utf8.encodedLength(value);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = value.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(final int fieldNumber) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(fieldNumber, 0));
    }

    public static int computeUInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeUInt32SizeNoTag(value);
    }

    public static int computeUInt32SizeNoTag(final int value) {
        return (352 - (Integer.numberOfLeadingZeros(value) * 9)) >>> 6;
    }

    public static int computeUInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeUInt64SizeNoTag(value);
    }

    public static int computeUInt64SizeNoTag(long value) {
        return (640 - (Long.numberOfLeadingZeros(value) * 9)) >>> 6;
    }

    public static int encodeZigZag32(final int n11) {
        return (n11 >> 31) ^ (n11 << 1);
    }

    public static long encodeZigZag64(final long n11) {
        return (n11 >> 63) ^ (n11 << 1);
    }

    public static CodedOutputStream newInstance(final OutputStream output) {
        return newInstance(output, 4096);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer buffer) {
        return new SafeDirectNioEncoder(buffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer buffer) {
        return new UnsafeDirectNioEncoder(buffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String value, Utf8.UnpairedSurrogateException cause) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cause);
        byte[] bytes = value.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte value) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer value) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] value, int offset, int length) throws IOException;

    public abstract void writeBool(int fieldNumber, boolean value) throws IOException;

    public final void writeBoolNoTag(boolean z11) throws IOException {
        write(z11 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int fieldNumber, byte[] value) throws IOException;

    public abstract void writeByteArray(int fieldNumber, byte[] value, int offset, int length) throws IOException;

    public final void writeByteArrayNoTag(final byte[] value) throws IOException {
        writeByteArrayNoTag(value, 0, value.length);
    }

    public abstract void writeByteArrayNoTag(final byte[] value, final int offset, final int length) throws IOException;

    public abstract void writeByteBuffer(int fieldNumber, ByteBuffer value) throws IOException;

    public abstract void writeBytes(int fieldNumber, ByteString value) throws IOException;

    public abstract void writeBytesNoTag(final ByteString value) throws IOException;

    public final void writeDouble(final int fieldNumber, final double value) throws IOException {
        writeFixed64(fieldNumber, Double.doubleToRawLongBits(value));
    }

    public final void writeDoubleNoTag(final double value) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(value));
    }

    public final void writeEnum(final int fieldNumber, final int value) throws IOException {
        writeInt32(fieldNumber, value);
    }

    public final void writeEnumNoTag(final int value) throws IOException {
        writeInt32NoTag(value);
    }

    public abstract void writeFixed32(int fieldNumber, int value) throws IOException;

    public abstract void writeFixed32NoTag(int value) throws IOException;

    public abstract void writeFixed64(int fieldNumber, long value) throws IOException;

    public abstract void writeFixed64NoTag(long value) throws IOException;

    public final void writeFloat(final int fieldNumber, final float value) throws IOException {
        writeFixed32(fieldNumber, Float.floatToRawIntBits(value));
    }

    public final void writeFloatNoTag(final float value) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(value));
    }

    @Deprecated
    public final void writeGroup(final int fieldNumber, final MessageLite value) throws IOException {
        writeTag(fieldNumber, 3);
        writeGroupNoTag(value);
        writeTag(fieldNumber, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(final MessageLite value) throws IOException {
        value.writeTo(this);
    }

    public abstract void writeInt32(int fieldNumber, int value) throws IOException;

    public abstract void writeInt32NoTag(final int value) throws IOException;

    public final void writeInt64(final int fieldNumber, final long value) throws IOException {
        writeUInt64(fieldNumber, value);
    }

    public final void writeInt64NoTag(final long value) throws IOException {
        writeUInt64NoTag(value);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer value) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] value, int offset, int length) throws IOException;

    public abstract void writeMessage(final int fieldNumber, final MessageLite value) throws IOException;

    public abstract void writeMessage(final int fieldNumber, final MessageLite value, Schema schema) throws IOException;

    public abstract void writeMessageNoTag(final MessageLite value) throws IOException;

    public abstract void writeMessageNoTag(final MessageLite value, Schema schema) throws IOException;

    public abstract void writeMessageSetExtension(final int fieldNumber, final MessageLite value) throws IOException;

    public final void writeRawByte(final byte value) throws IOException {
        write(value);
    }

    public abstract void writeRawBytes(final ByteBuffer value) throws IOException;

    public final void writeRawBytes(final byte[] value) throws IOException {
        write(value, 0, value.length);
    }

    @InlineMe(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(final int value) throws IOException {
        writeFixed32NoTag(value);
    }

    @InlineMe(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(final long value) throws IOException {
        writeFixed64NoTag(value);
    }

    public abstract void writeRawMessageSetExtension(final int fieldNumber, final ByteString value) throws IOException;

    @InlineMe(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int value) throws IOException {
        writeUInt32NoTag(value);
    }

    @InlineMe(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long value) throws IOException {
        writeUInt64NoTag(value);
    }

    public final void writeSFixed32(final int fieldNumber, final int value) throws IOException {
        writeFixed32(fieldNumber, value);
    }

    public final void writeSFixed32NoTag(final int value) throws IOException {
        writeFixed32NoTag(value);
    }

    public final void writeSFixed64(final int fieldNumber, final long value) throws IOException {
        writeFixed64(fieldNumber, value);
    }

    public final void writeSFixed64NoTag(final long value) throws IOException {
        writeFixed64NoTag(value);
    }

    public final void writeSInt32(final int fieldNumber, final int value) throws IOException {
        writeUInt32(fieldNumber, encodeZigZag32(value));
    }

    public final void writeSInt32NoTag(final int value) throws IOException {
        writeUInt32NoTag(encodeZigZag32(value));
    }

    public final void writeSInt64(final int fieldNumber, final long value) throws IOException {
        writeUInt64(fieldNumber, encodeZigZag64(value));
    }

    public final void writeSInt64NoTag(final long value) throws IOException {
        writeUInt64NoTag(encodeZigZag64(value));
    }

    public abstract void writeString(int fieldNumber, String value) throws IOException;

    public abstract void writeStringNoTag(String value) throws IOException;

    public abstract void writeTag(int fieldNumber, int wireType) throws IOException;

    public abstract void writeUInt32(int fieldNumber, int value) throws IOException;

    public abstract void writeUInt32NoTag(int value) throws IOException;

    public abstract void writeUInt64(int fieldNumber, long value) throws IOException;

    public abstract void writeUInt64NoTag(long value) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(final int fieldNumber, final MessageLite value, Schema schema) {
        return (computeTagSize(fieldNumber) * 2) + computeGroupSizeNoTag(value, schema);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(final MessageLite value, Schema schema) {
        return ((AbstractMessageLite) value).getSerializedSize(schema);
    }

    public static int computeMessageSize(final int fieldNumber, final MessageLite value, final Schema schema) {
        return computeTagSize(fieldNumber) + computeMessageSizeNoTag(value, schema);
    }

    public static int computeMessageSizeNoTag(final MessageLite value, final Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) value).getSerializedSize(schema));
    }

    public static CodedOutputStream newInstance(final OutputStream output, final int bufferSize) {
        return new OutputStreamEncoder(output, bufferSize);
    }

    @Deprecated
    public final void writeGroupNoTag(final MessageLite value, Schema schema) throws IOException {
        schema.writeTo(value, this.wrapper);
    }

    public final void writeRawByte(final int value) throws IOException {
        write((byte) value);
    }

    public final void writeRawBytes(final byte[] value, int offset, int length) throws IOException {
        write(value, offset, length);
    }

    public static CodedOutputStream newInstance(final byte[] flatArray) {
        return newInstance(flatArray, 0, flatArray.length);
    }

    public final void writeRawBytes(final ByteString value) throws IOException {
        value.writeTo(this);
    }

    public static CodedOutputStream newInstance(final byte[] flatArray, final int offset, final int length) {
        return new ArrayEncoder(flatArray, offset, length);
    }

    @Deprecated
    public final void writeGroup(final int fieldNumber, final MessageLite value, Schema schema) throws IOException {
        writeTag(fieldNumber, 3);
        writeGroupNoTag(value, schema);
        writeTag(fieldNumber, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer buffer) {
        if (buffer.hasArray()) {
            return new HeapNioEncoder(buffer);
        }
        if (buffer.isDirect() && !buffer.isReadOnly()) {
            if (UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(buffer);
            }
            return newSafeInstance(buffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int unused) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int bufferSize) {
        if (bufferSize >= 0) {
            return new ByteOutputEncoder(byteOutput, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
