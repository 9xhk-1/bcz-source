package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i11, int i12) {
        this.targetType = i11;
        byte[] bArr = new byte[i12 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i11, int i12) {
        if (this.isFilling) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i14 = this.nalLength;
            if (length < i14 + i13) {
                this.nalData = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, this.nalData, this.nalLength, i13);
            this.nalLength += i13;
        }
    }

    public boolean endNalUnit(int i11) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i11;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i11) {
        Assertions.checkState(!this.isFilling);
        boolean z11 = i11 == this.targetType;
        this.isFilling = z11;
        if (z11) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}
