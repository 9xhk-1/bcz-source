package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MetadataItem extends Table {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Vector extends BaseVector {
        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }

        public MetadataItem get(int i11) {
            return get(new MetadataItem(), i11);
        }

        public MetadataItem get(MetadataItem metadataItem, int i11) {
            return metadataItem.__assign(Table.__indirect(__element(i11), this.f4374bb), this.f4374bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addCodepoints(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(6, i11, 0);
    }

    public static void addCompatAdded(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(3, s11, 0);
    }

    public static void addEmojiStyle(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(1, z11, false);
    }

    public static void addHeight(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(5, s11, 0);
    }

    public static void addId(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static void addSdkAdded(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(2, s11, 0);
    }

    public static void addWidth(FlatBufferBuilder flatBufferBuilder, short s11) {
        flatBufferBuilder.addShort(4, s11, 0);
    }

    public static int createCodepointsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataItem(FlatBufferBuilder flatBufferBuilder, int i11, boolean z11, short s11, short s12, short s13, short s14, int i12) {
        flatBufferBuilder.startTable(7);
        addCodepoints(flatBufferBuilder, i12);
        addId(flatBufferBuilder, i11);
        addHeight(flatBufferBuilder, s14);
        addWidth(flatBufferBuilder, s13);
        addCompatAdded(flatBufferBuilder, s12);
        addSdkAdded(flatBufferBuilder, s11);
        addEmojiStyle(flatBufferBuilder, z11);
        return endMetadataItem(flatBufferBuilder);
    }

    public static int endMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer) {
        return getRootAsMetadataItem(byteBuffer, new MetadataItem());
    }

    public static void startCodepointsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }

    public MetadataItem __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public int codepoints(int i11) {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.f4380bb.getInt(__vector(__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer codepointsAsByteBuffer() {
        return __vector_as_bytebuffer(16, 4);
    }

    public ByteBuffer codepointsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 4);
    }

    public int codepointsLength() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public IntVector codepointsVector() {
        return codepointsVector(new IntVector());
    }

    public short compatAdded() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f4380bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public boolean emojiStyle() {
        int __offset = __offset(6);
        return (__offset == 0 || this.f4380bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public short height() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.f4380bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public int id() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4380bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public short sdkAdded() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f4380bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short width() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.f4380bb.getShort(__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer, MetadataItem metadataItem) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataItem.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public IntVector codepointsVector(IntVector intVector) {
        int __offset = __offset(16);
        if (__offset != 0) {
            return intVector.__assign(__vector(__offset), this.f4380bb);
        }
        return null;
    }
}
