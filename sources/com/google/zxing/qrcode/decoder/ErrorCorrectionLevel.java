package com.google.zxing.qrcode.decoder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final ErrorCorrectionLevel[] FOR_BITS;
    private final int bits;

    static {
        ErrorCorrectionLevel errorCorrectionLevel = L;
        ErrorCorrectionLevel errorCorrectionLevel2 = M;
        ErrorCorrectionLevel errorCorrectionLevel3 = Q;
        FOR_BITS = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, H, errorCorrectionLevel3};
    }

    ErrorCorrectionLevel(int i11) {
        this.bits = i11;
    }

    public static ErrorCorrectionLevel forBits(int i11) {
        if (i11 >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = FOR_BITS;
            if (i11 < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i11];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
