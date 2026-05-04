package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class WebvttSubtitle implements Subtitle {
    private final List<WebvttCueInfo> cueInfos;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(List<WebvttCueInfo> list) {
        this.cueInfos = Collections.unmodifiableList(new ArrayList(list));
        this.cueTimesUs = new long[list.size() * 2];
        for (int i11 = 0; i11 < list.size(); i11++) {
            WebvttCueInfo webvttCueInfo = list.get(i11);
            int i12 = i11 * 2;
            long[] jArr = this.cueTimesUs;
            jArr[i12] = webvttCueInfo.startTimeUs;
            jArr[i12 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr2 = this.cueTimesUs;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.sortedCueTimesUs = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.cueInfos.size(); i11++) {
            long[] jArr = this.cueTimesUs;
            int i12 = i11 * 2;
            if (jArr[i12] <= j11 && j11 < jArr[i12 + 1]) {
                WebvttCueInfo webvttCueInfo = this.cueInfos.get(i11);
                Cue cue = webvttCueInfo.cue;
                if (cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: androidx.media3.extractor.text.webvtt.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((WebvttCueInfo) obj).startTimeUs, ((WebvttCueInfo) obj2).startTimeUs);
                return compare;
            }
        });
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList.add(((WebvttCueInfo) arrayList2.get(i13)).cue.buildUpon().setLine((-1) - i13, 1).build());
        }
        return arrayList;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i11) {
        Assertions.checkArgument(i11 >= 0);
        Assertions.checkArgument(i11 < this.sortedCueTimesUs.length);
        return this.sortedCueTimesUs[i11];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j11) {
        int binarySearchCeil = Util.binarySearchCeil(this.sortedCueTimesUs, j11, false, false);
        if (binarySearchCeil < this.sortedCueTimesUs.length) {
            return binarySearchCeil;
        }
        return -1;
    }
}
