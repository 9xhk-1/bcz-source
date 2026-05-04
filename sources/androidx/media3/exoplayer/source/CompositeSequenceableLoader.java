package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class CompositeSequenceableLoader implements SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final ImmutableList<SequenceableLoaderWithTrackTypes> loadersWithTrackTypes;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        private final SequenceableLoader loader;
        private final ImmutableList<Integer> trackTypes;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List<Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = ImmutableList.copyOf((Collection) list);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        public ImmutableList<Integer> getTrackTypes() {
            return this.trackTypes;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j11) {
            this.loader.reevaluateBuffer(j11);
        }
    }

    @Deprecated
    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this(ImmutableList.copyOf(sequenceableLoaderArr), Collections.nCopies(sequenceableLoaderArr.length, ImmutableList.of(-1)));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        boolean z11;
        boolean z12 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z12;
            }
            z11 = false;
            for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
                long nextLoadPositionUs2 = this.loadersWithTrackTypes.get(i11).getNextLoadPositionUs();
                boolean z13 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z13) {
                    z11 |= this.loadersWithTrackTypes.get(i11).continueLoading(loadingInfo);
                }
            }
            z12 |= z11;
        } while (z11);
        return z12;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = this.loadersWithTrackTypes.get(i11);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            if ((sequenceableLoaderWithTrackTypes.getTrackTypes().contains(1) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(2) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                j11 = Math.min(j11, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j12 = Math.min(j12, bufferedPositionUs);
            }
        }
        if (j11 != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = j11;
            return j11;
        }
        if (j12 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j13 = this.lastAudioVideoBufferedPositionUs;
        return j13 != C.TIME_UNSET ? j13 : j12;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            long nextLoadPositionUs = this.loadersWithTrackTypes.get(i11).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j11 = Math.min(j11, nextLoadPositionUs);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            if (this.loadersWithTrackTypes.get(i11).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        for (int i11 = 0; i11 < this.loadersWithTrackTypes.size(); i11++) {
            this.loadersWithTrackTypes.get(i11).reevaluateBuffer(j11);
        }
    }

    public CompositeSequenceableLoader(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        ImmutableList.a builder = ImmutableList.builder();
        Assertions.checkArgument(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            builder.g(new SequenceableLoaderWithTrackTypes(list.get(i11), list2.get(i11)));
        }
        this.loadersWithTrackTypes = builder.e();
        this.lastAudioVideoBufferedPositionUs = C.TIME_UNSET;
    }
}
