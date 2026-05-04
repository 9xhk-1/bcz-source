package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, int i11, Random random) {
        super(trackGroup, iArr, i11);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return 3;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j11, long j12, long j13, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = 0;
        for (int i12 = 0; i12 < this.length; i12++) {
            if (!isTrackExcluded(i12, elapsedRealtime)) {
                i11++;
            }
        }
        this.selectedIndex = this.random.nextInt(i11);
        if (i11 != this.length) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.length; i14++) {
                if (!isTrackExcluded(i14, elapsedRealtime)) {
                    int i15 = i13 + 1;
                    if (this.selectedIndex == i13) {
                        this.selectedIndex = i14;
                        return;
                    }
                    i13 = i15;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements ExoTrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        public static /* synthetic */ ExoTrackSelection a(Factory factory, ExoTrackSelection.Definition definition) {
            factory.getClass();
            return new RandomTrackSelection(definition.group, definition.tracks, definition.type, factory.random);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new TrackSelectionUtil.AdaptiveTrackSelectionFactory() { // from class: androidx.media3.exoplayer.trackselection.z
                @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
                    return RandomTrackSelection.Factory.a(RandomTrackSelection.Factory.this, definition);
                }
            });
        }

        public Factory(int i11) {
            this.random = new Random(i11);
        }
    }
}
