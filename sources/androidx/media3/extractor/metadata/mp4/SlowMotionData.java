package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.google.common.collect.k3;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public final List<Segment> segments;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Segment {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new Comparator() { // from class: androidx.media3.extractor.metadata.mp4.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m11;
                m11 = k3.n().g(r1.startTimeMs, r2.startTimeMs).g(r1.endTimeMs, r2.endTimeMs).f(((SlowMotionData.Segment) obj).speedDivisor, ((SlowMotionData.Segment) obj2).speedDivisor).m();
                return m11;
            }
        };
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        public Segment(long j11, long j12, int i11) {
            Assertions.checkArgument(j11 < j12);
            this.startTimeMs = j11;
            this.endTimeMs = j12;
            this.speedDivisor = i11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public String toString() {
            return Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    private static boolean doSegmentsOverlap(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j11 = list.get(0).endTimeMs;
        for (int i11 = 1; i11 < list.size(); i11++) {
            if (list.get(i11).startTimeMs < j11) {
                return true;
            }
            j11 = list.get(i11).endTimeMs;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.segments;
    }
}
