package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    private PrivateCommand(long j11, byte[] bArr, long j12) {
        this.ptsAdjustment = j12;
        this.identifier = j11;
        this.commandBytes = bArr;
    }

    public static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i11, long j11) {
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int i12 = i11 - 4;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        return new PrivateCommand(readUnsignedInt, bArr, j11);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.ptsAdjustment + ", identifier= " + this.identifier + " }";
    }
}
