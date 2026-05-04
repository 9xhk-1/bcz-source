package androidx.media3.extractor.wav;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i11, int i12, int i13, int i14, int i15, int i16, byte[] bArr) {
        this.formatType = i11;
        this.numChannels = i12;
        this.frameRateHz = i13;
        this.averageBytesPerSecond = i14;
        this.blockSize = i15;
        this.bitsPerSample = i16;
        this.extraData = bArr;
    }
}
