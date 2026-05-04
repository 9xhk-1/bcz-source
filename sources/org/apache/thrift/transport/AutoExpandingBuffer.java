package org.apache.thrift.transport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class AutoExpandingBuffer {
    private byte[] array;
    private final double growthCoefficient;

    public AutoExpandingBuffer(int i11, double d11) {
        if (d11 < 1.0d) {
            throw new IllegalArgumentException("Growth coefficient must be >= 1.0");
        }
        this.array = new byte[i11];
        this.growthCoefficient = d11;
    }

    public byte[] array() {
        return this.array;
    }

    public void resizeIfNecessary(int i11) {
        byte[] bArr = this.array;
        if (bArr.length < i11) {
            byte[] bArr2 = new byte[(int) (i11 * this.growthCoefficient)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.array = bArr2;
        }
    }
}
