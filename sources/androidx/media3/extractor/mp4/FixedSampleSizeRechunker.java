package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;
        public final long totalSize;

        private Results(long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11, long j12) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i11;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j11;
            this.totalSize = j12;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i11, long[] jArr, int[] iArr, long j11) {
        int[] iArr2 = iArr;
        int i12 = 8192 / i11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 : iArr2) {
            i14 += Util.ceilDivide(i15, i12);
        }
        long[] jArr2 = new long[i14];
        int[] iArr3 = new int[i14];
        long[] jArr3 = new long[i14];
        int[] iArr4 = new int[i14];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i13 < iArr2.length) {
            int i21 = iArr2[i13];
            long j12 = jArr[i13];
            while (i21 > 0) {
                int min = Math.min(i12, i21);
                jArr2[i18] = j12;
                int i22 = i11 * min;
                iArr3[i18] = i22;
                i17 += i22;
                i19 = Math.max(i19, i22);
                jArr3[i18] = i16 * j11;
                iArr4[i18] = 1;
                j12 += iArr3[i18];
                i16 += min;
                i21 -= min;
                i18++;
                i12 = i12;
            }
            i13++;
            iArr2 = iArr;
        }
        return new Results(jArr2, iArr3, i19, jArr3, iArr4, j11 * i16, i17);
    }
}
