package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.common.collect.ImmutableList;
import ho.p0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;

    @Nullable
    private final p0<ReleasableExecutor> downloadExecutorSupplier;
    private final long durationUs;
    private final Format format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private final Timeline timeline;

    @Nullable
    private TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory {
        private final DataSource.Factory dataSourceFactory;

        @Nullable
        private p0<ReleasableExecutor> downloadExecutorSupplier;

        @Nullable
        private Object tag;

        @Nullable
        private String trackId;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
        private boolean treatLoadErrorsAsEndOfStream = true;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = (DataSource.Factory) Assertions.checkNotNull(factory);
        }

        public SingleSampleMediaSource createMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, long j11) {
            return new SingleSampleMediaSource(this.trackId, subtitleConfiguration, this.dataSourceFactory, j11, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag, this.downloadExecutorSupplier);
        }

        @uo.a
        public <T extends Executor> Factory setDownloadExecutor(final p0<T> p0Var, final Consumer<T> consumer) {
            this.downloadExecutorSupplier = new p0() { // from class: androidx.media3.exoplayer.source.i0
                @Override // ho.p0
                public final Object get() {
                    ReleasableExecutor from;
                    from = ReleasableExecutor.from((Executor) p0.this.get(), consumer);
                    return from;
                }
            };
            return this;
        }

        @uo.a
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        @uo.a
        public Factory setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        @Deprecated
        @uo.a
        public Factory setTrackId(@Nullable String str) {
            this.trackId = str;
            return this;
        }

        @uo.a
        public Factory setTreatLoadErrorsAsEndOfStream(boolean z11) {
            this.treatLoadErrorsAsEndOfStream = z11;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        DataSpec dataSpec = this.dataSpec;
        DataSource.Factory factory = this.dataSourceFactory;
        TransferListener transferListener = this.transferListener;
        Format format = this.format;
        long j12 = this.durationUs;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher createEventDispatcher = createEventDispatcher(mediaPeriodId);
        boolean z11 = this.treatLoadErrorsAsEndOfStream;
        p0<ReleasableExecutor> p0Var = this.downloadExecutorSupplier;
        return new SingleSampleMediaPeriod(dataSpec, factory, transferListener, format, j12, loadErrorHandlingPolicy, createEventDispatcher, z11, p0Var != null ? p0Var.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.transferListener = transferListener;
        refreshSourceInfo(this.timeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).release();
    }

    private SingleSampleMediaSource(@Nullable String str, MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, long j11, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z11, @Nullable Object obj, @Nullable p0<ReleasableExecutor> p0Var) {
        this.dataSourceFactory = factory;
        this.durationUs = j11;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z11;
        MediaItem build = new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId(subtitleConfiguration.uri.toString()).setSubtitleConfigurations(ImmutableList.of(subtitleConfiguration)).setTag(obj).build();
        this.mediaItem = build;
        Format.Builder label = new Format.Builder().setSampleMimeType((String) ho.b0.a(subtitleConfiguration.mimeType, MimeTypes.TEXT_UNKNOWN)).setLanguage(subtitleConfiguration.language).setSelectionFlags(subtitleConfiguration.selectionFlags).setRoleFlags(subtitleConfiguration.roleFlags).setLabel(subtitleConfiguration.label);
        String str2 = subtitleConfiguration.f4448id;
        this.format = label.setId(str2 != null ? str2 : str).build();
        this.dataSpec = new DataSpec.Builder().setUri(subtitleConfiguration.uri).setFlags(1).build();
        this.timeline = new SinglePeriodTimeline(j11, true, false, false, (Object) null, build);
        this.downloadExecutorSupplier = p0Var;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }
}
