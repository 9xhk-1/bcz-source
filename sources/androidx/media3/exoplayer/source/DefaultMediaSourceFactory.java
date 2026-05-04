package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.ExternallyLoadedMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import ho.p0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";

    @Nullable
    private AdViewProvider adViewProvider;

    @Nullable
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;

    @Nullable
    private ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;

    @Nullable
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean parseSubtitlesDuringExtraction;

    @Nullable
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private SubtitleParser.Factory subtitleParserFactory;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DelegateFactoryLoader {

        @Nullable
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private int codecsToParseWithinGopSampleDependencies;
        private DataSource.Factory dataSourceFactory;

        @Nullable
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;

        @Nullable
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private SubtitleParser.Factory subtitleParserFactory;
        private final Map<Integer, p0<MediaSource.Factory>> mediaSourceFactorySuppliers = new HashMap();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();
        private boolean parseSubtitlesDuringExtraction = true;

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
            this.extractorsFactory = extractorsFactory;
            this.subtitleParserFactory = factory;
        }

        public static /* synthetic */ MediaSource.Factory c(DelegateFactoryLoader delegateFactoryLoader, DataSource.Factory factory) {
            delegateFactoryLoader.getClass();
            return new ProgressiveMediaSource.Factory(factory, delegateFactoryLoader.extractorsFactory);
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        private p0<MediaSource.Factory> loadSupplier(int i11) throws ClassNotFoundException {
            p0<MediaSource.Factory> p0Var;
            p0<MediaSource.Factory> p0Var2;
            p0<MediaSource.Factory> p0Var3 = this.mediaSourceFactorySuppliers.get(Integer.valueOf(i11));
            if (p0Var3 != null) {
                return p0Var3;
            }
            final DataSource.Factory factory = (DataSource.Factory) Assertions.checkNotNull(this.dataSourceFactory);
            if (i11 == 0) {
                final Class<? extends U> asSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                p0Var = new p0() { // from class: androidx.media3.exoplayer.source.f
                    @Override // ho.p0
                    public final Object get() {
                        MediaSource.Factory newInstance;
                        newInstance = DefaultMediaSourceFactory.newInstance(asSubclass, factory);
                        return newInstance;
                    }
                };
            } else if (i11 == 1) {
                final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                p0Var = new p0() { // from class: androidx.media3.exoplayer.source.g
                    @Override // ho.p0
                    public final Object get() {
                        MediaSource.Factory newInstance;
                        newInstance = DefaultMediaSourceFactory.newInstance(asSubclass2, factory);
                        return newInstance;
                    }
                };
            } else {
                if (i11 != 2) {
                    if (i11 == 3) {
                        final Class<? extends U> asSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        p0Var2 = new p0() { // from class: androidx.media3.exoplayer.source.i
                            @Override // ho.p0
                            public final Object get() {
                                MediaSource.Factory newInstance;
                                newInstance = DefaultMediaSourceFactory.newInstance(asSubclass3);
                                return newInstance;
                            }
                        };
                    } else {
                        if (i11 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i11);
                        }
                        p0Var2 = new p0() { // from class: androidx.media3.exoplayer.source.j
                            @Override // ho.p0
                            public final Object get() {
                                return DefaultMediaSourceFactory.DelegateFactoryLoader.c(DefaultMediaSourceFactory.DelegateFactoryLoader.this, factory);
                            }
                        };
                    }
                    this.mediaSourceFactorySuppliers.put(Integer.valueOf(i11), p0Var2);
                    return p0Var2;
                }
                final Class<? extends U> asSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                p0Var = new p0() { // from class: androidx.media3.exoplayer.source.h
                    @Override // ho.p0
                    public final Object get() {
                        MediaSource.Factory newInstance;
                        newInstance = DefaultMediaSourceFactory.newInstance(asSubclass4, factory);
                        return newInstance;
                    }
                };
            }
            p0Var2 = p0Var;
            this.mediaSourceFactorySuppliers.put(Integer.valueOf(i11), p0Var2);
            return p0Var2;
        }

        @Nullable
        @uo.a
        private p0<MediaSource.Factory> maybeLoadSupplier(int i11) {
            try {
                return loadSupplier(i11);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public MediaSource.Factory getMediaSourceFactory(int i11) throws ClassNotFoundException {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i11));
            if (factory != null) {
                return factory;
            }
            MediaSource.Factory factory2 = loadSupplier(i11).get();
            CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            factory2.experimentalSetCodecsToParseWithinGopSampleDependencies(this.codecsToParseWithinGopSampleDependencies);
            this.mediaSourceFactories.put(Integer.valueOf(i11), factory2);
            return factory2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return ro.i.E(this.mediaSourceFactorySuppliers.keySet());
        }

        public void setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setCodecsToParseWithinGopSampleDependencies(int i11) {
            this.codecsToParseWithinGopSampleDependencies = i11;
            this.extractorsFactory.experimentalSetCodecsToParseWithinGopSampleDependencies(i11);
        }

        public void setDataSourceFactory(DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setJpegExtractorFlags(int i11) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i11);
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z11) {
            this.parseSubtitlesDuringExtraction = z11;
            this.extractorsFactory.experimentalSetTextTrackTranscodingEnabled(z11);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z11);
            }
        }

        public void setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            this.extractorsFactory.setSubtitleParserFactory(factory);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(factory);
            }
        }
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    public static /* synthetic */ Extractor[] a(DefaultMediaSourceFactory defaultMediaSourceFactory, Format format) {
        return new Extractor[]{defaultMediaSourceFactory.subtitleParserFactory.supportsFormat(format) ? new SubtitleExtractor(defaultMediaSourceFactory.subtitleParserFactory.create(format), null) : new UnknownSubtitlesExtractor(format)};
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        return (clippingConfiguration.startPositionUs == 0 && clippingConfiguration.endPositionUs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) ? mediaSource : new ClippingMediaSource.Builder(mediaSource).setStartPositionUs(mediaItem.clippingConfiguration.startPositionUs).setEndPositionUs(mediaItem.clippingConfiguration.endPositionUs).setEnableInitialDiscontinuity(!mediaItem.clippingConfiguration.startsAtKeyFrame).setAllowDynamicClippingUpdates(mediaItem.clippingConfiguration.relativeToLiveWindow).setRelativeToDefaultPosition(mediaItem.clippingConfiguration.relativeToDefaultPosition).build();
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object obj = adsConfiguration.adsId;
        if (obj == null) {
            obj = ImmutableList.of((Uri) mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri);
        }
        return new AdsMediaSource(mediaSource, dataSpec, obj, this, adsLoader, adViewProvider, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @uo.a
    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(C.SSAI_SCHEME)) {
            return ((MediaSource.Factory) Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        if (Objects.equals(mediaItem.localConfiguration.mimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
            return new ExternallyLoadedMediaSource.Factory(Util.msToUs(mediaItem.localConfiguration.imageDurationMs), (ExternalLoader) Assertions.checkNotNull(this.externalImageLoader)).createMediaSource(mediaItem);
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != C.TIME_UNSET) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
        }
        try {
            MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(inferContentTypeForUriAndMimeType);
            MediaItem.LiveConfiguration.Builder buildUpon = mediaItem.liveConfiguration.buildUpon();
            if (mediaItem.liveConfiguration.targetOffsetMs == C.TIME_UNSET) {
                buildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
            }
            if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                buildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
            }
            if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                buildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
            }
            if (mediaItem.liveConfiguration.minOffsetMs == C.TIME_UNSET) {
                buildUpon.setMinOffsetMs(this.liveMinOffsetMs);
            }
            if (mediaItem.liveConfiguration.maxOffsetMs == C.TIME_UNSET) {
                buildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
            }
            MediaItem.LiveConfiguration build = buildUpon.build();
            if (!build.equals(mediaItem.liveConfiguration)) {
                mediaItem = mediaItem.buildUpon().setLiveConfiguration(build).build();
            }
            MediaSource createMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
            ImmutableList<MediaItem.SubtitleConfiguration> immutableList = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
            if (!immutableList.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
                mediaSourceArr[0] = createMediaSource;
                for (int i11 = 0; i11 < immutableList.size(); i11++) {
                    if (this.parseSubtitlesDuringExtraction) {
                        final Format build2 = new Format.Builder().setSampleMimeType(immutableList.get(i11).mimeType).setLanguage(immutableList.get(i11).language).setSelectionFlags(immutableList.get(i11).selectionFlags).setRoleFlags(immutableList.get(i11).roleFlags).setLabel(immutableList.get(i11).label).setId(immutableList.get(i11).f4448id).build();
                        ProgressiveMediaSource.Factory factory = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new ExtractorsFactory() { // from class: androidx.media3.exoplayer.source.e
                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public final Extractor[] createExtractors() {
                                return DefaultMediaSourceFactory.a(DefaultMediaSourceFactory.this, build2);
                            }
                        });
                        if (this.subtitleParserFactory.supportsFormat(build2)) {
                            build2 = build2.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(build2.sampleMimeType).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(build2)).build();
                        }
                        ProgressiveMediaSource.Factory enableLazyLoadingWithSingleTrack = factory.enableLazyLoadingWithSingleTrack(0, build2);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            enableLazyLoadingWithSingleTrack.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        mediaSourceArr[i11 + 1] = enableLazyLoadingWithSingleTrack.createMediaSource(MediaItem.fromUri(immutableList.get(i11).uri.toString()));
                    } else {
                        SingleSampleMediaSource.Factory factory2 = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i11 + 1] = factory2.createMediaSource(immutableList.get(i11), C.TIME_UNSET);
                    }
                }
                createMediaSource = new MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, createMediaSource));
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @UnstableApi
    @Deprecated
    @uo.a
    public DefaultMediaSourceFactory setAdViewProvider(@Nullable AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    @UnstableApi
    @Deprecated
    @uo.a
    public DefaultMediaSourceFactory setAdsLoaderProvider(@Nullable AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    @uo.a
    public DefaultMediaSourceFactory setDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setExternalImageLoader(@Nullable ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j11) {
        this.liveMaxOffsetMs = j11;
        return this;
    }

    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setLiveMaxSpeed(float f11) {
        this.liveMaxSpeed = f11;
        return this;
    }

    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j11) {
        this.liveMinOffsetMs = j11;
        return this;
    }

    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setLiveMinSpeed(float f11) {
        this.liveMinSpeed = f11;
        return this;
    }

    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j11) {
        this.liveTargetOffsetMs = j11;
        return this;
    }

    @uo.a
    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, AdViewProvider adViewProvider) {
        this.adsLoaderProvider = (AdsLoader.Provider) Assertions.checkNotNull(provider);
        this.adViewProvider = (AdViewProvider) Assertions.checkNotNull(adViewProvider);
        return this;
    }

    @uo.a
    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(@Nullable MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    @UnstableApi
    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSource.Factory(context), extractorsFactory);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    @Deprecated
    @uo.a
    public DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z11) {
        this.parseSubtitlesDuringExtraction = z11;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z11);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i11) {
        this.delegateFactoryLoader.setCodecsToParseWithinGopSampleDependencies(i11);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        this.delegateFactoryLoader.setCmcdConfigurationFactory((CmcdConfiguration.Factory) Assertions.checkNotNull(factory));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.setDrmSessionManagerProvider((DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    @uo.a
    public DefaultMediaSourceFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        this.subtitleParserFactory = (SubtitleParser.Factory) Assertions.checkNotNull(factory);
        this.delegateFactoryLoader.setSubtitleParserFactory(factory);
        return this;
    }

    @UnstableApi
    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @UnstableApi
    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory = new DefaultSubtitleParserFactory();
        this.subtitleParserFactory = defaultSubtitleParserFactory;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(extractorsFactory, defaultSubtitleParserFactory);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = C.TIME_UNSET;
        this.liveMinOffsetMs = C.TIME_UNSET;
        this.liveMaxOffsetMs = C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        public UnknownSubtitlesExtractor(Format format) {
            this.format = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput track = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
            extractorOutput.endTracks();
            track.format(this.format.buildUpon().setSampleMimeType(MimeTypes.TEXT_UNKNOWN).setCodecs(this.format.sampleMimeType).build());
        }

        @Override // androidx.media3.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
            return extractorInput.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }

        @Override // androidx.media3.extractor.Extractor
        public void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public void seek(long j11, long j12) {
        }
    }
}
