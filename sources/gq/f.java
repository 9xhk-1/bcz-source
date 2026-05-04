package gq;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.tencent.rtmp.TXLiveConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final int f54008c = 21522;

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f54009d = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCorrectionLevel f54010a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f54011b;

    public f(int i11) {
        this.f54010a = ErrorCorrectionLevel.forBits((i11 >> 3) & 3);
        this.f54011b = (byte) (i11 & 7);
    }

    public static f a(int i11, int i12) {
        f b11 = b(i11, i12);
        return b11 != null ? b11 : b(i11 ^ 21522, i12 ^ 21522);
    }

    public static f b(int i11, int i12) {
        int e11;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int[] iArr : f54009d) {
            int i15 = iArr[0];
            if (i15 == i11 || i15 == i12) {
                return new f(iArr[1]);
            }
            int e12 = e(i11, i15);
            if (e12 < i13) {
                i14 = iArr[1];
                i13 = e12;
            }
            if (i11 != i12 && (e11 = e(i12, i15)) < i13) {
                i14 = iArr[1];
                i13 = e11;
            }
        }
        if (i13 <= 3) {
            return new f(i14);
        }
        return null;
    }

    public static int e(int i11, int i12) {
        return Integer.bitCount(i11 ^ i12);
    }

    public byte c() {
        return this.f54011b;
    }

    public ErrorCorrectionLevel d() {
        return this.f54010a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f54010a == fVar.f54010a && this.f54011b == fVar.f54011b;
    }

    public int hashCode() {
        return (this.f54010a.ordinal() << 3) | this.f54011b;
    }
}
