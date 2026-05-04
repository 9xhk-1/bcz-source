package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int minCapacity) {
        int[] iArr = this.tags;
        if (minCapacity > iArr.length) {
            int i11 = this.count;
            int i12 = i11 + (i11 / 2);
            if (i12 >= minCapacity) {
                minCapacity = i12;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.tags = Arrays.copyOf(iArr, minCapacity);
            this.objects = Arrays.copyOf(this.objects, minCapacity);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] tags, int count) {
        int i11 = 17;
        for (int i12 = 0; i12 < count; i12++) {
            i11 = (i11 * 31) + tags[i12];
        }
        return i11;
    }

    private UnknownFieldSetLite mergeFrom(final CodedInputStream input) throws IOException {
        int readTag;
        do {
            readTag = input.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, input));
        return this;
    }

    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite first, UnknownFieldSetLite second) {
        int i11 = first.count + second.count;
        int[] copyOf = Arrays.copyOf(first.tags, i11);
        System.arraycopy(second.tags, 0, copyOf, first.count, second.count);
        Object[] copyOf2 = Arrays.copyOf(first.objects, i11);
        System.arraycopy(second.objects, 0, copyOf2, first.count, second.count);
        return new UnknownFieldSetLite(i11, copyOf, copyOf2, true);
    }

    public static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objects1, Object[] objects2, int count) {
        for (int i11 = 0; i11 < count; i11++) {
            if (!objects1[i11].equals(objects2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] tags1, int[] tags2, int count) {
        for (int i11 = 0; i11 < count; i11++) {
            if (tags1[i11] != tags2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int tag, Object object, Writer writer) throws IOException {
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (ByteString) object);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.writeFixed32(tagFieldNumber, ((Integer) object).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((UnknownFieldSetLite) object).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((UnknownFieldSetLite) object).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    public void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i11 = this.count;
        return i11 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i11) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i11 = this.memoizedSerializedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.count; i13++) {
            int i14 = this.tags[i13];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i14);
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i13]).longValue());
            } else if (tagWireType == 1) {
                computeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i13]).longValue());
            } else if (tagWireType == 2) {
                computeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i13]);
            } else if (tagWireType == 3) {
                computeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.objects[i13]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                computeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i13]).intValue());
            }
            i12 += computeUInt64Size;
        }
        this.memoizedSerializedSize = i12;
        return i12;
    }

    public int getSerializedSizeAsMessageSet() {
        int i11 = this.memoizedSerializedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.count; i13++) {
            i12 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i13]), (ByteString) this.objects[i13]);
        }
        this.memoizedSerializedSize = i12;
        return i12;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    public boolean mergeFieldFrom(final int tag, final CodedInputStream input) throws IOException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            storeField(tag, Long.valueOf(input.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(tag, Long.valueOf(input.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(tag, input.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(input);
            input.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
            storeField(tag, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(tag, Integer.valueOf(input.readFixed32()));
        return true;
    }

    public UnknownFieldSetLite mergeLengthDelimitedField(final int fieldNumber, final ByteString value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(fieldNumber, 2), value);
        return this;
    }

    public UnknownFieldSetLite mergeVarintField(int fieldNumber, int value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(fieldNumber, 0), Long.valueOf(value));
        return this;
    }

    public final void printWithIndent(StringBuilder buffer, int indent) {
        for (int i11 = 0; i11 < this.count; i11++) {
            MessageLiteToString.printField(buffer, indent, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i11])), this.objects[i11]);
        }
    }

    public void storeField(int tag, Object value) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i11 = this.count;
        iArr[i11] = tag;
        this.objects[i11] = value;
        this.count = i11 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream output) throws IOException {
        for (int i11 = 0; i11 < this.count; i11++) {
            output.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i11]), (ByteString) this.objects[i11]);
        }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i11 = 0; i11 < this.count; i11++) {
            int i12 = this.tags[i11];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i12);
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                output.writeUInt64(tagFieldNumber, ((Long) this.objects[i11]).longValue());
            } else if (tagWireType == 1) {
                output.writeFixed64(tagFieldNumber, ((Long) this.objects[i11]).longValue());
            } else if (tagWireType == 2) {
                output.writeBytes(tagFieldNumber, (ByteString) this.objects[i11]);
            } else if (tagWireType == 3) {
                output.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i11]).writeTo(output);
                output.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                output.writeFixed32(tagFieldNumber, ((Integer) this.objects[i11]).intValue());
            }
        }
    }

    private UnknownFieldSetLite(int count, int[] tags, Object[] objects, boolean isMutable) {
        this.memoizedSerializedSize = -1;
        this.count = count;
        this.tags = tags;
        this.objects = objects;
        this.isMutable = isMutable;
    }

    private static int hashCode(Object[] objects, int count) {
        int i11 = 17;
        for (int i12 = 0; i12 < count; i12++) {
            i11 = (i11 * 31) + objects[i12].hashCode();
        }
        return i11;
    }

    public int hashCode() {
        int i11 = this.count;
        return ((((527 + i11) * 31) + hashCode(this.tags, i11)) * 31) + hashCode(this.objects, this.count);
    }

    @CanIgnoreReturnValue
    public UnknownFieldSetLite mergeFrom(UnknownFieldSetLite other) {
        if (other.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i11 = this.count + other.count;
        ensureCapacity(i11);
        System.arraycopy(other.tags, 0, this.tags, this.count, other.count);
        System.arraycopy(other.objects, 0, this.objects, this.count, other.count);
        this.count = i11;
        return this;
    }

    public void writeAsMessageSetTo(Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i11 = this.count - 1; i11 >= 0; i11--) {
                writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i11]), this.objects[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.count; i12++) {
            writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i12]), this.objects[i12]);
        }
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i11 = 0; i11 < this.count; i11++) {
                writeField(this.tags[i11], this.objects[i11], writer);
            }
            return;
        }
        for (int i12 = this.count - 1; i12 >= 0; i12--) {
            writeField(this.tags[i12], this.objects[i12], writer);
        }
    }
}
