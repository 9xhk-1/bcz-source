package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.collect.q6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaPeriod[] periods;
    private final boolean[] periodsWithTimeOffsets;

    @Nullable
    private TrackGroupArray trackGroups;
    private final ArrayList<MediaPeriod> childrenPendingPreparation = new ArrayList<>();
    private final HashMap<TrackGroup, TrackGroup> childTrackGroupByMergedTrackGroup = new HashMap<>();
    private final IdentityHashMap<SampleStream, Integer> streamPeriodIndices = new IdentityHashMap<>();
    private MediaPeriod[] enabledPeriods = new MediaPeriod[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ForwardingTrackSelection implements ExoTrackSelection {
        private final TrackGroup trackGroup;
        private final ExoTrackSelection trackSelection;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.trackSelection = exoTrackSelection;
            this.trackGroup = trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void disable() {
            this.trackSelection.disable();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void enable() {
            this.trackSelection.enable();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingTrackSelection)) {
                return false;
            }
            ForwardingTrackSelection forwardingTrackSelection = (ForwardingTrackSelection) obj;
            return this.trackSelection.equals(forwardingTrackSelection.trackSelection) && this.trackGroup.equals(forwardingTrackSelection.trackGroup);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int evaluateQueueSize(long j11, List<? extends MediaChunk> list) {
            return this.trackSelection.evaluateQueueSize(j11, list);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean excludeTrack(int i11, long j11) {
            return this.trackSelection.excludeTrack(i11, j11);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public Format getFormat(int i11) {
            return this.trackGroup.getFormat(this.trackSelection.getIndexInTrackGroup(i11));
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int getIndexInTrackGroup(int i11) {
            return this.trackSelection.getIndexInTrackGroup(i11);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public long getLatestBitrateEstimate() {
            return this.trackSelection.getLatestBitrateEstimate();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public Format getSelectedFormat() {
            return this.trackGroup.getFormat(this.trackSelection.getSelectedIndexInTrackGroup());
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.trackSelection.getSelectedIndex();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndexInTrackGroup() {
            return this.trackSelection.getSelectedIndexInTrackGroup();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return this.trackSelection.getSelectionData();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return this.trackSelection.getSelectionReason();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int getType() {
            return this.trackSelection.getType();
        }

        public int hashCode() {
            return ((527 + this.trackGroup.hashCode()) * 31) + this.trackSelection.hashCode();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int indexOf(Format format) {
            return this.trackSelection.indexOf(this.trackGroup.indexOf(format));
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean isTrackExcluded(int i11, long j11) {
            return this.trackSelection.isTrackExcluded(i11, j11);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int length() {
            return this.trackSelection.length();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onDiscontinuity() {
            this.trackSelection.onDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onPlayWhenReadyChanged(boolean z11) {
            this.trackSelection.onPlayWhenReadyChanged(z11);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onPlaybackSpeed(float f11) {
            this.trackSelection.onPlaybackSpeed(f11);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void onRebuffer() {
            this.trackSelection.onRebuffer();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean shouldCancelChunkLoad(long j11, Chunk chunk, List<? extends MediaChunk> list) {
            return this.trackSelection.shouldCancelChunkLoad(j11, chunk, list);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j11, long j12, long j13, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            this.trackSelection.updateSelectedTrack(j11, j12, j13, list, mediaChunkIteratorArr);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public int indexOf(int i11) {
            return this.trackSelection.indexOf(i11);
        }
    }

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.periods = mediaPeriodArr;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        this.periodsWithTimeOffsets = new boolean[mediaPeriodArr.length];
        for (int i11 = 0; i11 < mediaPeriodArr.length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                this.periodsWithTimeOffsets[i11] = true;
                this.periods[i11] = new TimeOffsetMediaPeriod(mediaPeriodArr[i11], j11);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.childrenPendingPreparation.isEmpty()) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        int size = this.childrenPendingPreparation.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.childrenPendingPreparation.get(i11).continueLoading(loadingInfo);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j11, z11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.periods[0]).getAdjustedSeekPositionUs(j11, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    public MediaPeriod getChildPeriod(int i11) {
        return this.periodsWithTimeOffsets[i11] ? ((TimeOffsetMediaPeriod) this.periods[i11]).getWrappedMediaPeriod() : this.periods[i11];
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.childrenPendingPreparation.remove(mediaPeriod);
        if (!this.childrenPendingPreparation.isEmpty()) {
            return;
        }
        int i11 = 0;
        for (MediaPeriod mediaPeriod2 : this.periods) {
            i11 += mediaPeriod2.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.periods;
            if (i12 >= mediaPeriodArr.length) {
                this.trackGroups = new TrackGroupArray(trackGroupArr);
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
                return;
            }
            TrackGroupArray trackGroups = mediaPeriodArr[i12].getTrackGroups();
            int i14 = trackGroups.length;
            int i15 = 0;
            while (i15 < i14) {
                TrackGroup trackGroup = trackGroups.get(i15);
                Format[] formatArr = new Format[trackGroup.length];
                for (int i16 = 0; i16 < trackGroup.length; i16++) {
                    Format format = trackGroup.getFormat(i16);
                    Format.Builder buildUpon = format.buildUpon();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = format.f4446id;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    formatArr[i16] = buildUpon.setId(sb2.toString()).build();
                }
                TrackGroup trackGroup2 = new TrackGroup(i12 + ":" + trackGroup.f4451id, formatArr);
                this.childTrackGroupByMergedTrackGroup.put(trackGroup2, trackGroup);
                trackGroupArr[i13] = trackGroup2;
                i15++;
                i13++;
            }
            i12++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        Collections.addAll(this.childrenPendingPreparation, this.periods);
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.prepare(this, j11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        long j11 = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            long readDiscontinuity = mediaPeriod.readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                if (j11 == C.TIME_UNSET) {
                    for (MediaPeriod mediaPeriod2 : this.enabledPeriods) {
                        if (mediaPeriod2 == mediaPeriod) {
                            break;
                        }
                        if (mediaPeriod2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j11 = readDiscontinuity;
                } else if (readDiscontinuity != j11) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j11 != C.TIME_UNSET && mediaPeriod.seekToUs(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.compositeSequenceableLoader.reevaluateBuffer(j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        long seekToUs = this.enabledPeriods[0].seekToUs(j11);
        int i11 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i11 >= mediaPeriodArr.length) {
                return seekToUs;
            }
            if (mediaPeriodArr[i11].seekToUs(seekToUs) != seekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < exoTrackSelectionArr.length; i12++) {
            SampleStream sampleStream = sampleStreamArr[i12];
            Integer num = sampleStream == null ? null : this.streamPeriodIndices.get(sampleStream);
            iArr[i12] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i12];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.getTrackGroup().f4451id;
                iArr2[i12] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i12] = -1;
            }
        }
        this.streamPeriodIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        ArrayList arrayList = new ArrayList(this.periods.length);
        long j12 = j11;
        int i13 = 0;
        while (i13 < this.periods.length) {
            for (int i14 = i11; i14 < exoTrackSelectionArr.length; i14++) {
                sampleStreamArr3[i14] = iArr[i14] == i13 ? sampleStreamArr[i14] : null;
                if (iArr2[i14] == i13) {
                    ExoTrackSelection exoTrackSelection2 = (ExoTrackSelection) Assertions.checkNotNull(exoTrackSelectionArr[i14]);
                    exoTrackSelectionArr2[i14] = new ForwardingTrackSelection(exoTrackSelection2, (TrackGroup) Assertions.checkNotNull(this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection2.getTrackGroup())));
                } else {
                    exoTrackSelectionArr2[i14] = null;
                }
            }
            int i15 = i13;
            long selectTracks = this.periods[i13].selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j12);
            if (i15 == 0) {
                j12 = selectTracks;
            } else if (selectTracks != j12) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < exoTrackSelectionArr.length; i16++) {
                if (iArr2[i16] == i15) {
                    SampleStream sampleStream2 = (SampleStream) Assertions.checkNotNull(sampleStreamArr3[i16]);
                    sampleStreamArr2[i16] = sampleStreamArr3[i16];
                    this.streamPeriodIndices.put(sampleStream2, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr[i16] == i15) {
                    Assertions.checkState(sampleStreamArr3[i16] == null);
                }
            }
            if (z11) {
                arrayList.add(this.periods[i15]);
            }
            i13 = i15 + 1;
            i11 = 0;
        }
        int i17 = i11;
        System.arraycopy(sampleStreamArr2, i17, sampleStreamArr, i17, length);
        this.enabledPeriods = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[i17]);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList, q6.D(arrayList, new ho.r() { // from class: androidx.media3.exoplayer.source.a0
            @Override // ho.r
            public final Object apply(Object obj) {
                List trackTypes;
                trackTypes = ((MediaPeriod) obj).getTrackGroups().getTrackTypes();
                return trackTypes;
            }
        }));
        return j12;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }
}
