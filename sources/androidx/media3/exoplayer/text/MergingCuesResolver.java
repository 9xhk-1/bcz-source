package androidx.media3.exoplayer.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.s7;
import ho.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final s7<CuesWithTiming> CUES_DISPLAY_PRIORITY_COMPARATOR = s7.z().D(new r() { // from class: androidx.media3.exoplayer.text.a
        @Override // ho.r
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((CuesWithTiming) obj).startTimeUs);
            return valueOf;
        }
    }).e(s7.z().F().D(new r() { // from class: androidx.media3.exoplayer.text.b
        @Override // ho.r
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((CuesWithTiming) obj).durationUs);
            return valueOf;
        }
    }));
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j11) {
        Assertions.checkArgument(cuesWithTiming.startTimeUs != C.TIME_UNSET);
        Assertions.checkArgument(cuesWithTiming.durationUs != C.TIME_UNSET);
        boolean z11 = cuesWithTiming.startTimeUs <= j11 && j11 < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z11;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z11;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j11) {
        int i11 = 0;
        while (i11 < this.cuesWithTimingList.size()) {
            long j12 = this.cuesWithTimingList.get(i11).startTimeUs;
            if (j11 > j12 && j11 > this.cuesWithTimingList.get(i11).endTimeUs) {
                this.cuesWithTimingList.remove(i11);
                i11--;
            } else if (j11 < j12) {
                return;
            }
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public ImmutableList<Cue> getCuesAtTimeUs(long j11) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j11 >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.cuesWithTimingList.size(); i11++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i11);
                    if (j11 >= cuesWithTiming.startTimeUs && j11 < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j11 < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                ImmutableList.a builder = ImmutableList.builder();
                for (int i12 = 0; i12 < sortedCopyOf.size(); i12++) {
                    builder.c(((CuesWithTiming) sortedCopyOf.get(i12)).cues);
                }
                return builder.e();
            }
        }
        return ImmutableList.of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j11) {
        int i11 = 0;
        long j12 = -9223372036854775807L;
        while (true) {
            if (i11 >= this.cuesWithTimingList.size()) {
                break;
            }
            long j13 = this.cuesWithTimingList.get(i11).startTimeUs;
            long j14 = this.cuesWithTimingList.get(i11).endTimeUs;
            if (j11 < j13) {
                j12 = j12 == C.TIME_UNSET ? j13 : Math.min(j12, j13);
            } else {
                if (j11 < j14) {
                    j12 = j12 == C.TIME_UNSET ? j14 : Math.min(j12, j14);
                }
                i11++;
            }
        }
        if (j12 != C.TIME_UNSET) {
            return j12;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j11) {
        if (this.cuesWithTimingList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j11 < this.cuesWithTimingList.get(0).startTimeUs) {
            return C.TIME_UNSET;
        }
        long j12 = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i11 = 0; i11 < this.cuesWithTimingList.size(); i11++) {
            long j13 = this.cuesWithTimingList.get(i11).startTimeUs;
            long j14 = this.cuesWithTimingList.get(i11).endTimeUs;
            if (j14 > j11) {
                if (j13 > j11) {
                    break;
                }
                j12 = Math.max(j12, j13);
            } else {
                j12 = Math.max(j12, j14);
            }
        }
        return j12;
    }
}
