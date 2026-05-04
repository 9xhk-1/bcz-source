package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aa;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ListChunk implements AviChunk {
    public final ImmutableList<AviChunk> children;
    private final int type;

    private ListChunk(int i11, ImmutableList<AviChunk> immutableList) {
        this.type = i11;
        this.children = immutableList;
    }

    @Nullable
    private static AviChunk createBox(int i11, int i12, ParsableByteArray parsableByteArray) {
        switch (i11) {
            case AviExtractor.FOURCC_strf /* 1718776947 */:
                return StreamFormatChunk.parseFrom(i12, parsableByteArray);
            case AviExtractor.FOURCC_avih /* 1751742049 */:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strh /* 1752331379 */:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strn /* 1852994675 */:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static ListChunk parseFrom(int i11, ParsableByteArray parsableByteArray) {
        ImmutableList.a aVar = new ImmutableList.a();
        int limit = parsableByteArray.limit();
        int i12 = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk parseFrom = readLittleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(readLittleEndianInt, i12, parsableByteArray);
            if (parseFrom != null) {
                if (parseFrom.getType() == 1752331379) {
                    i12 = ((AviStreamHeaderChunk) parseFrom).getTrackType();
                }
                aVar.g(parseFrom);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(limit);
        }
        return new ListChunk(i11, aVar.e());
    }

    @Nullable
    public <T extends AviChunk> T getChild(Class<T> cls) {
        aa<AviChunk> it = this.children.iterator();
        while (it.hasNext()) {
            T t11 = (T) it.next();
            if (t11.getClass() == cls) {
                return t11;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }
}
