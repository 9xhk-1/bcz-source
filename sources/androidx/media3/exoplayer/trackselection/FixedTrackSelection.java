package androidx.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class FixedTrackSelection extends BaseTrackSelection {

    @Nullable
    private final Object data;
    private final int reason;

    public FixedTrackSelection(TrackGroup trackGroup, int i11) {
        this(trackGroup, i11, 0);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return this.data;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i11, int i12) {
        this(trackGroup, i11, i12, 0, null);
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i11, int i12, int i13, @Nullable Object obj) {
        super(trackGroup, new int[]{i11}, i12);
        this.reason = i13;
        this.data = obj;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j11, long j12, long j13, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }
}
