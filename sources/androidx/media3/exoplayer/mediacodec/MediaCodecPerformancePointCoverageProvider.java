package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Util;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class Api29 {
        private Api29() {
        }

        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            p.a();
            int evaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, o.a(i11, i12, (int) d11));
            if (evaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return evaluatePerformancePointCoverage;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            r2 = r4.get(r1).capabilities.getVideoCapabilities().getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int evaluateH264RequiredSupport(boolean r4) {
            /*
                r0 = 0
                androidx.media3.common.Format$Builder r1 = new androidx.media3.common.Format$Builder     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                r1.<init>()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                java.lang.String r2 = "video/avc"
                androidx.media3.common.Format$Builder r1 = r1.setSampleMimeType(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                androidx.media3.common.Format r1 = r1.build()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                java.lang.String r2 = r1.sampleMimeType     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                if (r2 == 0) goto L66
                androidx.media3.exoplayer.mediacodec.MediaCodecSelector r2 = androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                java.util.List r4 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSoftMatch(r2, r1, r4, r0)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                r1 = r0
            L1b:
                int r2 = r4.size()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                if (r1 >= r2) goto L66
                java.lang.Object r2 = r4.get(r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r2     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                android.media.MediaCodecInfo$CodecCapabilities r2 = r2.capabilities     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                if (r2 == 0) goto L63
                java.lang.Object r2 = r4.get(r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r2     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                android.media.MediaCodecInfo$CodecCapabilities r2 = r2.capabilities     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                if (r2 == 0) goto L63
                java.lang.Object r2 = r4.get(r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r2     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                android.media.MediaCodecInfo$CodecCapabilities r2 = r2.capabilities     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                java.util.List r2 = androidx.media3.exoplayer.mediacodec.l.a(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                if (r2 == 0) goto L63
                boolean r3 = r2.isEmpty()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                if (r3 != 0) goto L63
                androidx.media3.exoplayer.mediacodec.p.a()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                r4 = 720(0x2d0, float:1.009E-42)
                r1 = 60
                r3 = 1280(0x500, float:1.794E-42)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = androidx.media3.exoplayer.mediacodec.o.a(r3, r4, r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                int r4 = evaluatePerformancePointCoverage(r2, r4)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L66
                return r4
            L63:
                int r1 = r1 + 1
                goto L1b
            L66:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.Api29.evaluateH264RequiredSupport(boolean):int");
        }

        private static int evaluatePerformancePointCoverage(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i11 = 0; i11 < list.size(); i11++) {
                covers = m.a(list.get(i11)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean shouldIgnorePerformancePoints() {
            if (Util.SDK_INT >= 35) {
                return false;
            }
            int evaluateH264RequiredSupport = evaluateH264RequiredSupport(false);
            int evaluateH264RequiredSupport2 = evaluateH264RequiredSupport(true);
            if (evaluateH264RequiredSupport == 0) {
                return true;
            }
            return evaluateH264RequiredSupport2 == 0 ? evaluateH264RequiredSupport != 2 : (evaluateH264RequiredSupport == 2 && evaluateH264RequiredSupport2 == 2) ? false : true;
        }
    }

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        if (Util.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i11, i12, d11);
        }
        return 0;
    }
}
