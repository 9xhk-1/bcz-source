package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int i11, int i12, String str) {
        this.profile = i11;
        this.level = i12;
        this.codecs = str;
    }

    @Nullable
    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = readUnsignedByte >> 1;
        int readUnsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((readUnsignedByte & 1) << 5);
        if (i11 == 4 || i11 == 5 || i11 == 7 || i11 == 8) {
            str = "dvhe";
        } else if (i11 == 9) {
            str = "dvav";
        } else {
            if (i11 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i11 < 10 ? ".0" : ".");
        sb2.append(i11);
        sb2.append(readUnsignedByte2 < 10 ? ".0" : ".");
        sb2.append(readUnsignedByte2);
        return new DolbyVisionConfig(i11, readUnsignedByte2, sb2.toString());
    }
}
