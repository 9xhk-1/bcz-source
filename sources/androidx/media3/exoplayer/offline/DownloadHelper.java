package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.ExtractorsFactory;
import com.google.common.collect.aa;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS;

    @Deprecated
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT;
    private Callback callback;
    private final Handler callbackHandler;
    private List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final MediaItem.LocalConfiguration localConfiguration;
    private MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private MediaPreparer mediaPreparer;

    @Nullable
    private final MediaSource mediaSource;
    private final RendererCapabilitiesList rendererCapabilities;
    private final SparseIntArray scratchSet;
    private TrackGroupArray[] trackGroupArrays;
    private List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final DefaultTrackSelector trackSelector;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveContentUnsupportedException extends IOException {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 2;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 1;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final DownloadHelper downloadHelper;
        public MediaPeriod[] mediaPeriods;
        private final MediaSource mediaSource;
        private final Handler mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private boolean released;
        public Timeline timeline;
        private final Allocator allocator = new DefaultAllocator(true, 65536);
        private final ArrayList<MediaPeriod> pendingMediaPeriods = new ArrayList<>();
        private final Handler downloadHelperHandler = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: androidx.media3.exoplayer.offline.g
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleDownloadHelperCallbackMessage;
                handleDownloadHelperCallbackMessage = DownloadHelper.MediaPreparer.this.handleDownloadHelperCallbackMessage(message);
                return handleDownloadHelperCallbackMessage;
            }
        });

        public MediaPreparer(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            Handler createHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = createHandler;
            createHandler.sendEmptyMessage(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleDownloadHelperCallbackMessage(Message message) {
            if (this.released) {
                return false;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (ExoPlaybackException e11) {
                    this.downloadHelperHandler.obtainMessage(2, new IOException(e11)).sendToTarget();
                }
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((IOException) Util.castNonNull(message.obj));
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                this.mediaSource.prepareSource(this, null, PlayerId.UNSET);
                this.mediaSourceHandler.sendEmptyMessage(2);
                return true;
            }
            int i12 = 0;
            if (i11 == 2) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i12 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i12).maybeThrowPrepareError();
                            i12++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100L);
                } catch (IOException e11) {
                    this.downloadHelperHandler.obtainMessage(2, e11).sendToTarget();
                }
                return true;
            }
            if (i11 == 3) {
                MediaPeriod mediaPeriod = (MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                }
                return true;
            }
            if (i11 != 4) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i12 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i12]);
                    i12++;
                }
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(2);
                this.downloadHelperHandler.sendEmptyMessage(1);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
            MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(2, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new MediaPeriod[timeline.getPeriodCount()];
            int i11 = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i11 >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod createPeriod = this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i11)), this.allocator, 0L);
                this.mediaPeriods[i11] = createPeriod;
                this.pendingMediaPeriods.add(createPeriod);
                i11++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(4);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(3, mediaPeriod).sendToTarget();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnreleaseableRendererCapabilitiesList implements RendererCapabilitiesList {
        private final RendererCapabilities[] rendererCapabilities;

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public RendererCapabilities[] getRendererCapabilities() {
            return this.rendererCapabilities;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public int size() {
            return this.rendererCapabilities.length;
        }

        private UnreleaseableRendererCapabilitiesList(RendererCapabilities[] rendererCapabilitiesArr) {
            this.rendererCapabilities = rendererCapabilitiesArr;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public void release() {
        }
    }

    static {
        DefaultTrackSelector.Parameters build = DefaultTrackSelector.Parameters.DEFAULT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
        DEFAULT_TRACK_SELECTOR_PARAMETERS = build;
        DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = build;
    }

    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilitiesList rendererCapabilitiesList) {
        this.localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaSource = mediaSource;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectionParameters, new DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesList;
        this.scratchSet = new SparseIntArray();
        defaultTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: androidx.media3.exoplayer.offline.f
            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DownloadHelper.a();
            }
        }, new FakeBandwidthMeter());
        this.callbackHandler = Util.createHandlerForCurrentOrMainLooper();
        this.window = new Timeline.Window();
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void addTrackSelectionInternal(int i11, TrackSelectionParameters trackSelectionParameters) throws ExoPlaybackException {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i11);
        aa<TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType(it.next()).build());
            runTrackSelection(i11);
        }
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithMedia() {
        Assertions.checkState(this.isPreparedWithMedia);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    private static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory factory, @Nullable final DrmSessionManager drmSessionManager) {
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(factory, ExtractorsFactory.EMPTY);
        if (drmSessionManager != null) {
            defaultMediaSourceFactory.setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: androidx.media3.exoplayer.offline.b
                @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
                public final DrmSessionManager get(MediaItem mediaItem2) {
                    return DownloadHelper.d(DrmSessionManager.this, mediaItem2);
                }
            });
        }
        return defaultMediaSourceFactory.createMediaSource(mediaItem);
    }

    public static /* synthetic */ void e(DownloadHelper downloadHelper, Callback callback) {
        downloadHelper.getClass();
        callback.onPrepared(downloadHelper);
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        Assertions.checkArgument(isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)));
        return forMediaItem(mediaItem, DEFAULT_TRACK_SELECTOR_PARAMETERS, null, null, null);
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DEFAULT_TRACK_SELECTOR_PARAMETERS;
    }

    private static boolean isProgressive(MediaItem.LocalConfiguration localConfiguration) {
        return Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(final IOException iOException) {
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: androidx.media3.exoplayer.offline.d
            @Override // java.lang.Runnable
            public final void run() {
                ((DownloadHelper.Callback) Assertions.checkNotNull(r0.callback)).onPrepareError(DownloadHelper.this, iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() throws ExoPlaybackException {
        Assertions.checkNotNull(this.mediaPreparer);
        Assertions.checkNotNull(this.mediaPreparer.mediaPeriods);
        Assertions.checkNotNull(this.mediaPreparer.timeline);
        int length = this.mediaPreparer.mediaPeriods.length;
        int size = this.rendererCapabilities.size();
        this.trackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        this.immutableTrackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                this.trackSelectionsByPeriodAndRenderer[i11][i12] = new ArrayList();
                this.immutableTrackSelectionsByPeriodAndRenderer[i11][i12] = Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i11][i12]);
            }
        }
        this.trackGroupArrays = new TrackGroupArray[length];
        this.mappedTrackInfos = new MappingTrackSelector.MappedTrackInfo[length];
        for (int i13 = 0; i13 < length; i13++) {
            this.trackGroupArrays[i13] = this.mediaPreparer.mediaPeriods[i13].getTrackGroups();
            this.trackSelector.onSelectionActivated(runTrackSelection(i13).info);
            this.mappedTrackInfos[i13] = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.trackSelector.getCurrentMappedTrackInfo());
        }
        setPreparedWithMedia();
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: androidx.media3.exoplayer.offline.c
            @Override // java.lang.Runnable
            public final void run() {
                ((DownloadHelper.Callback) Assertions.checkNotNull(r0.callback)).onPrepared(DownloadHelper.this);
            }
        });
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private TrackSelectorResult runTrackSelection(int i11) throws ExoPlaybackException {
        TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities.getRendererCapabilities(), this.trackGroupArrays[i11], new MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i11)), this.mediaPreparer.timeline);
        for (int i12 = 0; i12 < selectTracks.length; i12++) {
            ExoTrackSelection exoTrackSelection = selectTracks.selections[i12];
            if (exoTrackSelection != null) {
                List<ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i11][i12];
                int i13 = 0;
                while (true) {
                    if (i13 >= list.size()) {
                        list.add(exoTrackSelection);
                        break;
                    }
                    ExoTrackSelection exoTrackSelection2 = list.get(i13);
                    if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                        this.scratchSet.clear();
                        for (int i14 = 0; i14 < exoTrackSelection2.length(); i14++) {
                            this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i14), 0);
                        }
                        for (int i15 = 0; i15 < exoTrackSelection.length(); i15++) {
                            this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i15), 0);
                        }
                        int[] iArr = new int[this.scratchSet.size()];
                        for (int i16 = 0; i16 < this.scratchSet.size(); i16++) {
                            iArr[i16] = this.scratchSet.keyAt(i16);
                        }
                        list.set(i13, new DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
                    } else {
                        i13++;
                    }
                }
            }
        }
        return selectTracks;
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithMedia() {
        this.isPreparedWithMedia = true;
    }

    public void addAudioLanguagesToSelection(String... strArr) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder buildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            buildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                buildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters build = buildUpon.setPreferredAudioLanguage(str).build();
                for (int i11 = 0; i11 < periodCount; i11++) {
                    addTrackSelectionInternal(i11, build);
                }
            }
        } catch (ExoPlaybackException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void addTextLanguagesToSelection(boolean z11, String... strArr) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder buildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            buildUpon.setSelectUndeterminedTextLanguage(z11);
            buildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                buildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters build = buildUpon.setPreferredTextLanguage(str).build();
                for (int i11 = 0; i11 < periodCount; i11++) {
                    addTrackSelectionInternal(i11, build);
                }
            }
        } catch (ExoPlaybackException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void addTrackSelection(int i11, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            addTrackSelectionInternal(i11, trackSelectionParameters);
        } catch (ExoPlaybackException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i11, int i12, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder buildUpon = parameters.buildUpon();
            int i13 = 0;
            while (i13 < this.mappedTrackInfos[i11].getRendererCount()) {
                buildUpon.setRendererDisabled(i13, i13 != i12);
                i13++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i11, buildUpon.build());
                return;
            }
            TrackGroupArray trackGroups = this.mappedTrackInfos[i11].getTrackGroups(i12);
            for (int i14 = 0; i14 < list.size(); i14++) {
                buildUpon.setSelectionOverride(i12, trackGroups, list.get(i14));
                addTrackSelectionInternal(i11, buildUpon.build());
            }
        } catch (ExoPlaybackException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void clearTrackSelections(int i11) {
        assertPreparedWithMedia();
        for (int i12 = 0; i12 < this.rendererCapabilities.size(); i12++) {
            this.trackSelectionsByPeriodAndRenderer[i11][i12].clear();
        }
    }

    public DownloadRequest getDownloadRequest(@Nullable byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    @Nullable
    public Object getManifest() {
        if (this.mediaSource == null) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i11) {
        assertPreparedWithMedia();
        return this.mappedTrackInfos[i11];
    }

    public int getPeriodCount() {
        if (this.mediaSource == null) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.trackGroupArrays.length;
    }

    public TrackGroupArray getTrackGroups(int i11) {
        assertPreparedWithMedia();
        return this.trackGroupArrays[i11];
    }

    public List<ExoTrackSelection> getTrackSelections(int i11, int i12) {
        assertPreparedWithMedia();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i11][i12];
    }

    public Tracks getTracks(int i11) {
        assertPreparedWithMedia();
        return TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i11], this.immutableTrackSelectionsByPeriodAndRenderer[i11]);
    }

    public void prepare(final Callback callback) {
        Assertions.checkState(this.callback == null);
        this.callback = callback;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            this.mediaPreparer = new MediaPreparer(mediaSource, this);
        } else {
            this.callbackHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.offline.e
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadHelper.e(DownloadHelper.this, callback);
                }
            });
        }
    }

    public void release() {
        MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
        this.rendererCapabilities.release();
    }

    public void replaceTrackSelections(int i11, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            clearTrackSelections(i11);
            addTrackSelectionInternal(i11, trackSelectionParameters);
        } catch (ExoPlaybackException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager);
    }

    public DownloadRequest getDownloadRequest(String str, @Nullable byte[] bArr) {
        DownloadRequest.Builder mimeType = new DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        DownloadRequest.Builder data = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mediaSource == null) {
            return data.build();
        }
        assertPreparedWithMedia();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.trackSelectionsByPeriodAndRenderer.length;
        for (int i11 = 0; i11 < length; i11++) {
            arrayList2.clear();
            int length2 = this.trackSelectionsByPeriodAndRenderer[i11].length;
            for (int i12 = 0; i12 < length2; i12++) {
                arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i11][i12]);
            }
            arrayList.addAll(this.mediaPreparer.mediaPeriods[i11].getStreamKeys(arrayList2));
        }
        return data.setStreamKeys(arrayList).build();
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, DEFAULT_TRACK_SELECTOR_PARAMETERS, renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, trackSelectionParameters, renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        RendererCapabilitiesList unreleaseableRendererCapabilitiesList;
        boolean isProgressive = isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration));
        Assertions.checkArgument(isProgressive || factory != null);
        MediaSource createMediaSourceInternal = isProgressive ? null : createMediaSourceInternal(mediaItem, (DataSource.Factory) Util.castNonNull(factory), drmSessionManager);
        if (renderersFactory != null) {
            unreleaseableRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList();
        } else {
            unreleaseableRendererCapabilitiesList = new UnreleaseableRendererCapabilitiesList(new RendererCapabilities[0]);
        }
        return new DownloadHelper(mediaItem, createMediaSourceInternal, trackSelectionParameters, unreleaseableRendererCapabilitiesList);
    }

    public static /* synthetic */ void a() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FakeBandwidthMeter implements BandwidthMeter {
        private FakeBandwidthMeter() {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        @Nullable
        public TransferListener getTransferListener() {
            return null;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        }
    }

    public static /* synthetic */ DrmSessionManager d(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        return drmSessionManager;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DownloadTrackSelection extends BaseTrackSelection {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Factory implements ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i11 = 0; i11 < definitionArr.length; i11++) {
                    ExoTrackSelection.Definition definition = definitionArr[i11];
                    exoTrackSelectionArr[i11] = definition == null ? null : new DownloadTrackSelection(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j11, long j12, long j13, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        }
    }
}
