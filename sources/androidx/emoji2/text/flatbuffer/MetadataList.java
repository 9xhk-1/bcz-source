package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MetadataList extends Table {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Vector extends BaseVector {
        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }

        public MetadataList get(int i11) {
            return get(new MetadataList(), i11);
        }

        public MetadataList get(MetadataList metadataList, int i11) {
            return metadataList.__assign(Table.__indirect(__element(i11), this.f4374bb), this.f4374bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addList(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addSourceSha(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createListVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataList(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13) {
        flatBufferBuilder.startTable(3);
        addSourceSha(flatBufferBuilder, i13);
        addList(flatBufferBuilder, i12);
        addVersion(flatBufferBuilder, i11);
        return endMetadataList(flatBufferBuilder);
    }

    public static int endMetadataList(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static void finishMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.finish(i11);
    }

    public static void finishSizePrefixedMetadataListBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.finishSizePrefixed(i11);
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer) {
        return getRootAsMetadataList(byteBuffer, new MetadataList());
    }

    public static void startListVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startMetadataList(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public MetadataList __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public MetadataItem list(int i11) {
        return list(new MetadataItem(), i11);
    }

    public int listLength() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public MetadataItem.Vector listVector() {
        return listVector(new MetadataItem.Vector());
    }

    public String sourceSha() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public int version() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4380bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer byteBuffer, MetadataList metadataList) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataList.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public MetadataItem list(MetadataItem metadataItem, int i11) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return metadataItem.__assign(__indirect(__vector(__offset) + (i11 * 4)), this.f4380bb);
        }
        return null;
    }

    public MetadataItem.Vector listVector(MetadataItem.Vector vector) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.f4380bb);
        }
        return null;
    }
}
