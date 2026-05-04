package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import com.alipay.sdk.m.n.a;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import s60.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        public SafeDirectWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) (value >>> 28));
            int i12 = this.pos;
            this.pos = i12 - 4;
            this.buffer.putInt(i12 - 3, (value & 127) | 128 | ((((value >>> 21) & 127) | 128) << 24) | ((((value >>> 14) & 127) | 128) << 16) | ((((value >>> 7) & 127) | 128) << 8));
        }

        private void writeVarint32FourBytes(int value) {
            int i11 = this.pos;
            this.pos = i11 - 4;
            this.buffer.putInt(i11 - 3, (value & 127) | 128 | ((266338304 & value) << 3) | (((2080768 & value) | 2097152) << 2) | (((value & 16256) | 16384) << 1));
        }

        private void writeVarint32OneByte(int value) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            int i11 = this.pos - 3;
            this.pos = i11;
            this.buffer.putInt(i11, (((value & 127) | 128) << 8) | ((2080768 & value) << 10) | (((value & 16256) | 16384) << 9));
        }

        private void writeVarint32TwoBytes(int value) {
            int i11 = this.pos;
            this.pos = i11 - 2;
            this.buffer.putShort(i11 - 1, (short) ((value & 127) | 128 | ((value & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long value) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, (value & 127) | 128 | ((71494644084506624L & value) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | IjkMediaMeta.AV_CH_LOW_FREQUENCY_2) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | 2097152) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long value) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, (value & 127) | 128 | (((71494644084506624L & value) | 72057594037927936L) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | IjkMediaMeta.AV_CH_LOW_FREQUENCY_2) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | 2097152) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64FiveBytes(long value) {
            int i11 = this.pos;
            this.pos = i11 - 5;
            this.buffer.putLong(i11 - 7, (((value & 127) | 128) << 24) | ((34091302912L & value) << 28) | (((266338304 & value) | 268435456) << 27) | (((2080768 & value) | 2097152) << 26) | (((16256 & value) | 16384) << 25));
        }

        private void writeVarint64FourBytes(long value) {
            writeVarint32FourBytes((int) value);
        }

        private void writeVarint64NineBytes(long value) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) (value >>> 56));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        private void writeVarint64OneByte(long value) {
            writeVarint32OneByte((int) value);
        }

        private void writeVarint64SevenBytes(long value) {
            int i11 = this.pos - 7;
            this.pos = i11;
            this.buffer.putLong(i11, (((value & 127) | 128) << 8) | ((558551906910208L & value) << 14) | (((4363686772736L & value) | 4398046511104L) << 13) | (((34091302912L & value) | IjkMediaMeta.AV_CH_LOW_FREQUENCY_2) << 12) | (((266338304 & value) | 268435456) << 11) | (((2080768 & value) | 2097152) << 10) | (((16256 & value) | 16384) << 9));
        }

        private void writeVarint64SixBytes(long value) {
            int i11 = this.pos;
            this.pos = i11 - 6;
            this.buffer.putLong(i11 - 7, (((value & 127) | 128) << 16) | ((4363686772736L & value) << 21) | (((34091302912L & value) | IjkMediaMeta.AV_CH_LOW_FREQUENCY_2) << 20) | (((266338304 & value) | 268435456) << 19) | (((2080768 & value) | 2097152) << 18) | (((16256 & value) | 16384) << 17));
        }

        private void writeVarint64TenBytes(long value) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) (value >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer2.put(i12, (byte) (((value >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long value) {
            writeVarint32ThreeBytes((int) value);
        }

        private void writeVarint64TwoBytes(long value) {
            writeVarint32TwoBytes((int) value);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, value);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i11 = this.pos - length;
                this.pos = i11;
                Java8Compatibility.position(this.buffer, i11 + 1);
                this.buffer.put(value, offset, length);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int value) {
            if ((value & a.f10855g) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newDirectBuffer(capacity));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i11 = this.pos - length;
            this.pos = i11;
            Java8Compatibility.position(this.buffer, i11 + 1);
            this.buffer.put(value, offset, length);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
                if (nioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = nioBuffer;
                    Java8Compatibility.limit(nioBuffer, nioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.buffer.limit() - 1;
                    this.limitMinusOne = limit;
                    this.pos = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int value) {
            int i11 = this.pos;
            this.pos = i11 - 4;
            this.buffer.putInt(i11 - 3, value);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long value) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, value);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i11 = this.pos - remaining;
            this.pos = i11;
            Java8Compatibility.position(this.buffer, i11 + 1);
            this.buffer.put(value);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String in2) {
            int i11;
            int i12;
            int i13;
            char charAt;
            requireSpace(in2.length());
            int length = in2.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = in2.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = in2.charAt(length);
                if (charAt2 < 128 && (i13 = this.pos) >= 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    this.pos = i13 - 1;
                    byteBuffer.put(i13, (byte) charAt2);
                } else if (charAt2 < 2048 && (i12 = this.pos) > 0) {
                    ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i12 - 1;
                    byteBuffer2.put(i12, (byte) ((charAt2 & d.f88057a) | 128));
                    ByteBuffer byteBuffer3 = this.buffer;
                    int i14 = this.pos;
                    this.pos = i14 - 1;
                    byteBuffer3.put(i14, (byte) ((charAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i11 = this.pos) > 1) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i11 - 1;
                    byteBuffer4.put(i11, (byte) ((charAt2 & d.f88057a) | 128));
                    ByteBuffer byteBuffer5 = this.buffer;
                    int i15 = this.pos;
                    this.pos = i15 - 1;
                    byteBuffer5.put(i15, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.buffer;
                    int i16 = this.pos;
                    this.pos = i16 - 1;
                    byteBuffer6.put(i16, (byte) ((charAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char charAt3 = in2.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                ByteBuffer byteBuffer7 = this.buffer;
                                int i17 = this.pos;
                                this.pos = i17 - 1;
                                byteBuffer7.put(i17, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.buffer;
                                int i18 = this.pos;
                                this.pos = i18 - 1;
                                byteBuffer8.put(i18, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.buffer;
                                int i19 = this.pos;
                                this.pos = i19 - 1;
                                byteBuffer9.put(i19, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.buffer;
                                int i21 = this.pos;
                                this.pos = i21 - 1;
                                byteBuffer10.put(i21, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            } else {
                int i11 = this.pos - remaining;
                this.pos = i11;
                Java8Compatibility.position(this.buffer, i11 + 1);
                this.buffer.put(value);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        public SafeHeapWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 28);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 21) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 14) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 5;
            bArr[i15] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 21);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 14) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 4;
            bArr[i14] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            bArr[i11] = (byte) value;
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 14);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 3;
            bArr[i13] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 7);
            this.pos = i11 - 2;
            bArr[i12] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 49);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 42) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 35) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((value >>> 28) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((value >>> 21) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((value >>> 14) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 8;
            bArr[i18] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 28);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 21) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 14) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 5;
            bArr[i15] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 21);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 14) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 4;
            bArr[i14] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 56);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 49) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 42) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((value >>> 35) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((value >>> 28) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((value >>> 21) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((value >>> 14) & 127) | 128);
            int i19 = i11 - 8;
            this.pos = i19;
            bArr[i18] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 9;
            bArr[i19] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            bArr[i11] = (byte) value;
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 42);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 35) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 28) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((value >>> 21) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((value >>> 14) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 7;
            bArr[i17] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 35);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 28) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 21) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((value >>> 14) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 6;
            bArr[i16] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 63);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 56) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((value >>> 49) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((value >>> 42) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((value >>> 35) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((value >>> 28) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((value >>> 21) & 127) | 128);
            int i19 = i11 - 8;
            this.pos = i19;
            bArr[i18] = (byte) (((value >>> 14) & 127) | 128);
            int i21 = i11 - 9;
            this.pos = i21;
            bArr[i19] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 10;
            bArr[i21] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (((int) value) >>> 14);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i11 - 3;
            bArr[i13] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (value >>> 7);
            this.pos = i11 - 2;
            bArr[i12] = (byte) ((((int) value) & 127) | 128);
        }

        public int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        public int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            bArr[i11] = value;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i11, boolean z11) throws IOException {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) throws IOException {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) throws IOException {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) throws IOException {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) throws IOException {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i11 = this.pos - length;
                this.pos = i11;
                System.arraycopy(value, offset, this.buffer, i11 + 1, length);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) throws IOException {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) throws IOException {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int fieldNumber, String value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) throws IOException {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) throws IOException {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int value) {
            if ((value & a.f10855g) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newHeapBuffer(capacity));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i11 = this.pos - length;
            this.pos = i11;
            System.arraycopy(value, offset, this.buffer, i11 + 1, length);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                int arrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + arrayOffset;
                int position = arrayOffset + allocatedBuffer.position();
                this.offset = position;
                this.offsetMinusOne = position - 1;
                int i11 = this.limit - 1;
                this.limitMinusOne = i11;
                this.pos = i11;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) ((value >> 24) & 255);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) ((value >> 16) & 255);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) ((value >> 8) & 255);
            this.pos = i11 - 4;
            bArr[i14] = (byte) (value & 255);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long value) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (((int) (value >> 56)) & 255);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((int) (value >> 48)) & 255);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((int) (value >> 40)) & 255);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((int) (value >> 32)) & 255);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((int) (value >> 24)) & 255);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((int) (value >> 16)) & 255);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((int) (value >> 8)) & 255);
            this.pos = i11 - 8;
            bArr[i18] = (byte) (((int) value) & 255);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i11 = this.pos - remaining;
            this.pos = i11;
            value.get(this.buffer, i11 + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            }
            int i11 = this.pos - remaining;
            this.pos = i11;
            value.get(this.buffer, i11 + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String in2) {
            int i11;
            int i12;
            int i13;
            char charAt;
            requireSpace(in2.length());
            int length = in2.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = in2.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = in2.charAt(length);
                if (charAt2 < 128 && (i13 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i13 - 1;
                    bArr[i13] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i12 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    int i14 = i12 - 1;
                    this.pos = i14;
                    bArr2[i12] = (byte) ((charAt2 & d.f88057a) | 128);
                    this.pos = i12 - 2;
                    bArr2[i14] = (byte) ((charAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i11 = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    int i15 = i11 - 1;
                    this.pos = i15;
                    bArr3[i11] = (byte) ((charAt2 & d.f88057a) | 128);
                    int i16 = i11 - 2;
                    this.pos = i16;
                    bArr3[i15] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.pos = i11 - 3;
                    bArr3[i16] = (byte) ((charAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char charAt3 = in2.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.buffer;
                                int i17 = this.pos;
                                int i18 = i17 - 1;
                                this.pos = i18;
                                bArr4[i17] = (byte) ((codePoint & 63) | 128);
                                int i19 = i17 - 2;
                                this.pos = i19;
                                bArr4[i18] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i21 = i17 - 3;
                                this.pos = i21;
                                bArr4[i19] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.pos = i17 - 4;
                                bArr4[i21] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        public UnsafeDirectWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 28));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 21) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 14) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 21));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 14) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 7) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((value & 127) | 128));
        }

        private void writeVarint32OneByte(int value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 14));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 7) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((value & 127) | 128));
        }

        private void writeVarint32TwoBytes(int value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 7));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 49));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 42) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 35) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 28) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((value >>> 21) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((value >>> 14) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((value >>> 7) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 28));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 21) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 14) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 21));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 14) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 7) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 56));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 49) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 42) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 35) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((value >>> 28) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((value >>> 21) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((value >>> 14) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((value >>> 7) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) ((value & 127) | 128));
        }

        private void writeVarint64OneByte(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 42));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 35) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 28) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 21) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((value >>> 14) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((value >>> 7) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 35));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 28) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 21) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 14) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((value >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 63));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 56) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((value >>> 49) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((value >>> 42) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((value >>> 35) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((value >>> 28) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((value >>> 21) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((value >>> 14) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((value >>> 7) & 127) | 128));
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.putByte(j21, (byte) ((value & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((int) value) >>> 14));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((value >>> 7) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TwoBytes(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (value >>> 7));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((((int) value) & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, value);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                this.pos -= length;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(value, offset, length);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int value) {
            if ((value & a.f10855g) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newDirectBuffer(capacity));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            this.pos -= length;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(value, offset, length);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
                if (nioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = nioBuffer;
                    Java8Compatibility.limit(nioBuffer, nioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    long addressOffset = UnsafeUtil.addressOffset(this.buffer);
                    this.bufferOffset = addressOffset;
                    long limit = addressOffset + (this.buffer.limit() - 1);
                    this.limitMinusOne = limit;
                    this.pos = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) ((value >> 24) & 255));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((value >> 16) & 255));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((value >> 8) & 255));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (value & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long value) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((int) (value >> 56)) & 255));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((int) (value >> 48)) & 255));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((int) (value >> 40)) & 255));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((int) (value >> 32)) & 255));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((int) (value >> 24)) & 255));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((int) (value >> 16)) & 255));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((int) (value >> 8)) & 255));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((int) value) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            this.pos -= remaining;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(value);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String in2) {
            char charAt;
            requireSpace(in2.length());
            int length = in2.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = in2.charAt(length)) >= 128) {
                    break;
                }
                long j11 = this.pos;
                this.pos = j11 - 1;
                UnsafeUtil.putByte(j11, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = in2.charAt(length);
                if (charAt2 < 128) {
                    long j12 = this.pos;
                    if (j12 >= this.bufferOffset) {
                        this.pos = j12 - 1;
                        UnsafeUtil.putByte(j12, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j13 = this.pos;
                    if (j13 > this.bufferOffset) {
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(j13, (byte) ((charAt2 & d.f88057a) | 128));
                        long j14 = this.pos;
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(j14, (byte) ((charAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j15 = this.pos;
                    if (j15 > this.bufferOffset + 1) {
                        this.pos = j15 - 1;
                        UnsafeUtil.putByte(j15, (byte) ((charAt2 & d.f88057a) | 128));
                        long j16 = this.pos;
                        this.pos = j16 - 1;
                        UnsafeUtil.putByte(j16, (byte) (((charAt2 >>> 6) & 63) | 128));
                        long j17 = this.pos;
                        this.pos = j17 - 1;
                        UnsafeUtil.putByte(j17, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.bufferOffset + 2) {
                    if (length != 0) {
                        char charAt3 = in2.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            long j18 = this.pos;
                            this.pos = j18 - 1;
                            UnsafeUtil.putByte(j18, (byte) ((codePoint & 63) | 128));
                            long j19 = this.pos;
                            this.pos = j19 - 1;
                            UnsafeUtil.putByte(j19, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j21 = this.pos;
                            this.pos = j21 - 1;
                            UnsafeUtil.putByte(j21, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j22 = this.pos;
                            this.pos = j22 - 1;
                            UnsafeUtil.putByte(j22, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            } else {
                this.pos -= remaining;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(value);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        public UnsafeHeapWriter(BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeArrayOperations();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 28));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 21));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) ((value & 127) | 128));
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 14));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) ((value & 127) | 128));
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 7));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 49));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr6, j16, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr7, j17, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr8, j18, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 28));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 21));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 56));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr6, j16, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr7, j17, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr8, j18, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr9, j19, (byte) ((value & 127) | 128));
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 42));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr6, j16, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr7, j17, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 35));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr6, j16, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 63));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr6, j16, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr7, j17, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr8, j18, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr9, j19, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.putByte(bArr10, j21, (byte) ((value & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (((int) value) >>> 14));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (value >>> 7));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) ((((int) value) & 127) | 128));
        }

        public int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        public int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, value);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int fieldNumber, ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            if (spaceLeft() >= length) {
                this.pos -= length;
                System.arraycopy(value, offset, this.buffer, arrayPos() + 1, length);
            } else {
                this.totalDoneBytes += length;
                this.buffers.addFirst(AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeTag(int fieldNumber, int wireType) {
            writeVarint32(WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint32(int value) {
            if ((value & a.f10855g) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeVarint64(long value) {
            switch (BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newHeapBuffer(capacity));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            requireSpace(length);
            this.pos -= length;
            System.arraycopy(value, offset, this.buffer, arrayPos() + 1, length);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                long arrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + arrayOffset;
                long position = arrayOffset + allocatedBuffer.position();
                this.offset = position;
                this.offsetMinusOne = position - 1;
                long j11 = this.limit - 1;
                this.limitMinusOne = j11;
                this.pos = j11;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed32(int value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) ((value >> 24) & 255));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) ((value >> 16) & 255));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) ((value >> 8) & 255));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (value & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeFixed64(long value) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (((int) (value >> 56)) & 255));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((int) (value >> 48)) & 255));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((int) (value >> 40)) & 255));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((int) (value >> 32)) & 255));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) (((int) (value >> 24)) & 255));
            byte[] bArr6 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr6, j16, (byte) (((int) (value >> 16)) & 255));
            byte[] bArr7 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr7, j17, (byte) (((int) (value >> 8)) & 255));
            byte[] bArr8 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr8, j18, (byte) (((int) value) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt32(int value) {
            writeVarint32(CodedOutputStream.encodeZigZag32(value));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeSInt64(long value) {
            writeVarint64(CodedOutputStream.encodeZigZag64(value));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public void writeString(String in2) {
            char charAt;
            requireSpace(in2.length());
            int length = in2.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = in2.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.buffer;
                long j11 = this.pos;
                this.pos = j11 - 1;
                UnsafeUtil.putByte(bArr, j11, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = in2.charAt(length);
                if (charAt2 < 128) {
                    long j12 = this.pos;
                    if (j12 > this.offsetMinusOne) {
                        byte[] bArr2 = this.buffer;
                        this.pos = j12 - 1;
                        UnsafeUtil.putByte(bArr2, j12, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j13 = this.pos;
                    if (j13 > this.offset) {
                        byte[] bArr3 = this.buffer;
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(bArr3, j13, (byte) ((charAt2 & d.f88057a) | 128));
                        byte[] bArr4 = this.buffer;
                        long j14 = this.pos;
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(bArr4, j14, (byte) ((charAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j15 = this.pos;
                    if (j15 > this.offset + 1) {
                        byte[] bArr5 = this.buffer;
                        this.pos = j15 - 1;
                        UnsafeUtil.putByte(bArr5, j15, (byte) ((charAt2 & d.f88057a) | 128));
                        byte[] bArr6 = this.buffer;
                        long j16 = this.pos;
                        this.pos = j16 - 1;
                        UnsafeUtil.putByte(bArr6, j16, (byte) (((charAt2 >>> 6) & 63) | 128));
                        byte[] bArr7 = this.buffer;
                        long j17 = this.pos;
                        this.pos = j17 - 1;
                        UnsafeUtil.putByte(bArr7, j17, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.offset + 2) {
                    if (length != 0) {
                        char charAt3 = in2.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr8 = this.buffer;
                            long j18 = this.pos;
                            this.pos = j18 - 1;
                            UnsafeUtil.putByte(bArr8, j18, (byte) ((codePoint & 63) | 128));
                            byte[] bArr9 = this.buffer;
                            long j19 = this.pos;
                            this.pos = j19 - 1;
                            UnsafeUtil.putByte(bArr9, j19, (byte) (((codePoint >>> 6) & 63) | 128));
                            byte[] bArr10 = this.buffer;
                            long j21 = this.pos;
                            this.pos = j21 - 1;
                            UnsafeUtil.putByte(bArr10, j21, (byte) (((codePoint >>> 12) & 63) | 128));
                            byte[] bArr11 = this.buffer;
                            long j22 = this.pos;
                            this.pos = j22 - 1;
                            UnsafeUtil.putByte(bArr11, j22, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer value) {
            int remaining = value.remaining();
            requireSpace(remaining);
            this.pos -= remaining;
            value.get(this.buffer, arrayPos() + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(value));
                nextBuffer();
            }
            this.pos -= remaining;
            value.get(this.buffer, arrayPos() + 1, remaining);
        }
    }

    public /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i11, AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long value) {
        byte b11;
        if (((-128) & value) == 0) {
            return (byte) 1;
        }
        if (value < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & value) != 0) {
            b11 = (byte) 6;
            value >>>= 28;
        } else {
            b11 = 2;
        }
        if ((CoroutineScheduler.f68464x & value) != 0) {
            b11 = (byte) (b11 + 2);
            value >>>= 14;
        }
        return (value & (-16384)) != 0 ? (byte) (b11 + 1) : b11;
    }

    public static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.isSupported();
    }

    public static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator alloc) {
        return newDirectInstance(alloc, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator alloc) {
        return newHeapInstance(alloc, 4096);
    }

    public static BinaryWriter newSafeDirectInstance(BufferAllocator alloc, int chunkSize) {
        return new SafeDirectWriter(alloc, chunkSize);
    }

    public static BinaryWriter newSafeHeapInstance(BufferAllocator alloc, int chunkSize) {
        return new SafeHeapWriter(alloc, chunkSize);
    }

    public static BinaryWriter newUnsafeDirectInstance(BufferAllocator alloc, int chunkSize) {
        if (isUnsafeDirectSupported()) {
            return new UnsafeDirectWriter(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    public static BinaryWriter newUnsafeHeapInstance(BufferAllocator alloc, int chunkSize) {
        if (isUnsafeHeapSupported()) {
            return new UnsafeHeapWriter(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private void writeBoolList_Internal(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(fieldNumber, list.get(size).booleanValue());
            }
            return;
        }
        requireSpace(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(list.get(size2).booleanValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeDoubleList_Internal(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(fieldNumber, list.get(size).doubleValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFixed32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFixed64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFloatList_Internal(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(fieldNumber, list.get(size).floatValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeLazyString(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            writeString(fieldNumber, (String) value);
        } else {
            writeBytes(fieldNumber, (ByteString) value);
        }
    }

    public static final void writeMapEntryField(Writer writer, int fieldNumber, WireFormat.FieldType fieldType, Object object) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(fieldNumber, ((Boolean) object).booleanValue());
                return;
            case 2:
                writer.writeFixed32(fieldNumber, ((Integer) object).intValue());
                return;
            case 3:
                writer.writeFixed64(fieldNumber, ((Long) object).longValue());
                return;
            case 4:
                writer.writeInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 5:
                writer.writeInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 6:
                writer.writeSFixed32(fieldNumber, ((Integer) object).intValue());
                return;
            case 7:
                writer.writeSFixed64(fieldNumber, ((Long) object).longValue());
                return;
            case 8:
                writer.writeSInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 9:
                writer.writeSInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 10:
                writer.writeString(fieldNumber, (String) object);
                return;
            case 11:
                writer.writeUInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 12:
                writer.writeUInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 13:
                writer.writeFloat(fieldNumber, ((Float) object).floatValue());
                return;
            case 14:
                writer.writeDouble(fieldNumber, ((Double) object).doubleValue());
                return;
            case 15:
                writer.writeMessage(fieldNumber, object);
                return;
            case 16:
                writer.writeBytes(fieldNumber, (ByteString) object);
                return;
            case 17:
                if (object instanceof Internal.EnumLite) {
                    writer.writeEnum(fieldNumber, ((Internal.EnumLite) object).getNumber());
                    return;
                } else {
                    if (!(object instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.writeEnum(fieldNumber, ((Integer) object).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeSInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeUInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeUInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    @CanIgnoreReturnValue
    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    public abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    public final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    public final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    public abstract void requireSpace(int size);

    public abstract void writeBool(boolean value);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(fieldNumber, (BooleanArrayList) list, packed);
        } else {
            writeBoolList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int fieldNumber, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(fieldNumber, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int fieldNumber, double value) throws IOException {
        writeFixed64(fieldNumber, Double.doubleToRawLongBits(value));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(fieldNumber, (DoubleArrayList) list, packed);
        } else {
            writeDoubleList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int fieldNumber, int value) throws IOException {
        writeInt32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeInt32List(fieldNumber, list, packed);
    }

    public abstract void writeFixed32(int value);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeFixed32List_Internal(fieldNumber, list, packed);
        }
    }

    public abstract void writeFixed64(long value);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(fieldNumber, (LongArrayList) list, packed);
        } else {
            writeFixed64List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int fieldNumber, float value) throws IOException {
        writeFixed32(fieldNumber, Float.floatToRawIntBits(value));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(fieldNumber, (FloatArrayList) list, packed);
        } else {
            writeFloatList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size));
        }
    }

    public abstract void writeInt32(int value);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int fieldNumber, long value) throws IOException {
        writeUInt64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeUInt64List(fieldNumber, list, packed);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int fieldNumber, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int fieldNumber, Object value) throws IOException {
        writeTag(1, 4);
        if (value instanceof ByteString) {
            writeBytes(3, (ByteString) value);
        } else {
            writeMessage(3, value);
        }
        writeUInt32(2, fieldNumber);
        writeTag(1, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int fieldNumber, int value) throws IOException {
        writeFixed32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeFixed32List(fieldNumber, list, packed);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int fieldNumber, long value) throws IOException {
        writeFixed64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeFixed64List(fieldNumber, list, packed);
    }

    public abstract void writeSInt32(int value);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeSInt32List_Internal(fieldNumber, list, packed);
        }
    }

    public abstract void writeSInt64(long value);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(fieldNumber, (LongArrayList) list, packed);
        } else {
            writeSInt64List_Internal(fieldNumber, list, packed);
        }
    }

    public abstract void writeString(String in2);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int fieldNumber, List<String> list) throws IOException {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(fieldNumber, list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(fieldNumber, lazyStringList.getRaw(size2));
        }
    }

    public abstract void writeTag(int fieldNumber, int wireType);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(fieldNumber, (IntArrayList) list, packed);
        } else {
            writeUInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(fieldNumber, (LongArrayList) list, packed);
        } else {
            writeUInt64List_Internal(fieldNumber, list, packed);
        }
    }

    public abstract void writeVarint32(int value);

    public abstract void writeVarint64(long value);

    private BinaryWriter(BufferAllocator alloc, int chunkSize) {
        this.buffers = new ArrayDeque<>(4);
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (BufferAllocator) Internal.checkNotNull(alloc, "alloc");
        this.chunkSize = chunkSize;
    }

    public static BinaryWriter newDirectInstance(BufferAllocator alloc, int chunkSize) {
        return isUnsafeDirectSupported() ? newUnsafeDirectInstance(alloc, chunkSize) : newSafeDirectInstance(alloc, chunkSize);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator alloc, int chunkSize) {
        return isUnsafeHeapSupported() ? newUnsafeHeapInstance(alloc, chunkSize) : newSafeHeapInstance(alloc, chunkSize);
    }

    public final AllocatedBuffer newDirectBuffer(int capacity) {
        return this.alloc.allocateDirectBuffer(Math.max(capacity, this.chunkSize));
    }

    public final AllocatedBuffer newHeapBuffer(int capacity) {
        return this.alloc.allocateHeapBuffer(Math.max(capacity, this.chunkSize));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int fieldNumber, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size), schema);
        }
    }

    private void writeBoolList_Internal(int fieldNumber, BooleanArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(list.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(fieldNumber, list.getBoolean(size2));
        }
    }

    private void writeDoubleList_Internal(int fieldNumber, DoubleArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(list.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(fieldNumber, list.getDouble(size2));
        }
    }

    private void writeFixed32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeFixed64List_Internal(int fieldNumber, LongArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(list.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(fieldNumber, list.getLong(size2));
        }
    }

    private void writeFloatList_Internal(int fieldNumber, FloatArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(list.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(fieldNumber, list.getFloat(size2));
        }
    }

    private void writeInt32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeSInt64List_Internal(int fieldNumber, LongArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(list.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(fieldNumber, list.getLong(size2));
        }
    }

    private void writeUInt32List_Internal(int fieldNumber, IntArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeUInt64List_Internal(int fieldNumber, LongArrayList list, boolean packed) throws IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint64(list.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(fieldNumber, list.getLong(size2));
        }
    }
}
