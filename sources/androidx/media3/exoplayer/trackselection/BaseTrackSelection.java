package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    private boolean playWhenReady;
    protected final int[] tracks;
    private final int type;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    public static /* synthetic */ int a(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.group.equals(baseTrackSelection.group) && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j11, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i11, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isTrackExcluded = isTrackExcluded(i11, elapsedRealtime);
        int i12 = 0;
        while (i12 < this.length && !isTrackExcluded) {
            isTrackExcluded = (i12 == i11 || isTrackExcluded(i12, elapsedRealtime)) ? false : true;
            i12++;
        }
        if (!isTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i11] = Math.max(jArr[i11], Util.addWithOverflowDefault(elapsedRealtime, j11, Long.MAX_VALUE));
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final Format getFormat(int i11) {
        return this.formats[i11];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i11) {
        return this.tracks[i11];
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i11 = 0; i11 < this.length; i11++) {
            if (this.formats[i11] == format) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i11, long j11) {
        return this.excludeUntilTimes[i11] > j11;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @CallSuper
    public void onPlayWhenReadyChanged(boolean z11) {
        this.playWhenReady = z11;
    }

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i11) {
        Assertions.checkState(iArr.length > 0);
        this.type = i11;
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.formats[i12] = trackGroup.getFormat(iArr[i12]);
        }
        Arrays.sort(this.formats, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BaseTrackSelection.a((Format) obj, (Format) obj2);
            }
        });
        this.tracks = new int[this.length];
        int i13 = 0;
        while (true) {
            int i14 = this.length;
            if (i13 >= i14) {
                this.excludeUntilTimes = new long[i14];
                this.playWhenReady = false;
                return;
            } else {
                this.tracks[i13] = trackGroup.indexOf(this.formats[i13]);
                i13++;
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i11) {
        for (int i12 = 0; i12 < this.length; i12++) {
            if (this.tracks[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f11) {
    }
}
