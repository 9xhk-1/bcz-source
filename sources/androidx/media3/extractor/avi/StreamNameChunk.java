package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class StreamNameChunk implements AviChunk {
    public final String name;

    private StreamNameChunk(String str) {
        this.name = str;
    }

    public static StreamNameChunk parseFrom(ParsableByteArray parsableByteArray) {
        return new StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return AviExtractor.FOURCC_strn;
    }
}
