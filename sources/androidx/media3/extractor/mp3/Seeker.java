package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.extractor.SeekMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
interface Seeker extends SeekMap {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        public UnseekableSeeker() {
            super(C.TIME_UNSET);
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return C.RATE_UNSET_INT;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getTimeUs(long j11) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getTimeUs(long j11);
}
