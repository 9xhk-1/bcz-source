package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.ExtractorsFactory;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public class SimpleExoPlayer extends BasePlayer implements ExoPlayer {
    private final ConditionVariable constructorFinished;
    private final ExoPlayerImpl player;

    @Deprecated
    public SimpleExoPlayer(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, MediaSource.Factory factory, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector, boolean z11, Clock clock, Looper looper) {
        this(new ExoPlayer.Builder(context, renderersFactory, factory, trackSelector, loadControl, bandwidthMeter, analyticsCollector).setUseLazyPreparation(z11).setClock(clock).setLooper(looper));
    }

    private void blockUntilConstructorFinished() {
        this.constructorFinished.blockUninterruptible();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        blockUntilConstructorFinished();
        this.player.addAnalyticsListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        blockUntilConstructorFinished();
        this.player.addAudioOffloadListener(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void addListener(Player.Listener listener) {
        blockUntilConstructorFinished();
        this.player.addListener(listener);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i11, List<MediaItem> list) {
        blockUntilConstructorFinished();
        this.player.addMediaItems(i11, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.addMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<MediaSource> list) {
        blockUntilConstructorFinished();
        this.player.addMediaSources(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearAuxEffectInfo() {
        blockUntilConstructorFinished();
        this.player.clearAuxEffectInfo();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener) {
        blockUntilConstructorFinished();
        this.player.clearCameraMotionListener(cameraMotionListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        blockUntilConstructorFinished();
        this.player.clearVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        blockUntilConstructorFinished();
        this.player.clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        blockUntilConstructorFinished();
        this.player.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        blockUntilConstructorFinished();
        this.player.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        blockUntilConstructorFinished();
        this.player.clearVideoTextureView(textureView);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        blockUntilConstructorFinished();
        return this.player.createMessage(target);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void decreaseDeviceVolume() {
        blockUntilConstructorFinished();
        this.player.decreaseDeviceVolume();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public AnalyticsCollector getAnalyticsCollector() {
        blockUntilConstructorFinished();
        return this.player.getAnalyticsCollector();
    }

    @Override // androidx.media3.common.Player
    public Looper getApplicationLooper() {
        blockUntilConstructorFinished();
        return this.player.getApplicationLooper();
    }

    @Override // androidx.media3.common.Player
    public AudioAttributes getAudioAttributes() {
        blockUntilConstructorFinished();
        return this.player.getAudioAttributes();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters getAudioDecoderCounters() {
        blockUntilConstructorFinished();
        return this.player.getAudioDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format getAudioFormat() {
        blockUntilConstructorFinished();
        return this.player.getAudioFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getAudioSessionId() {
        blockUntilConstructorFinished();
        return this.player.getAudioSessionId();
    }

    @Override // androidx.media3.common.Player
    public Player.Commands getAvailableCommands() {
        blockUntilConstructorFinished();
        return this.player.getAvailableCommands();
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        blockUntilConstructorFinished();
        return this.player.getBufferedPosition();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Clock getClock() {
        blockUntilConstructorFinished();
        return this.player.getClock();
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        blockUntilConstructorFinished();
        return this.player.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        blockUntilConstructorFinished();
        return this.player.getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        blockUntilConstructorFinished();
        return this.player.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        blockUntilConstructorFinished();
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.Player
    public CueGroup getCurrentCues() {
        blockUntilConstructorFinished();
        return this.player.getCurrentCues();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        blockUntilConstructorFinished();
        return this.player.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        blockUntilConstructorFinished();
        return this.player.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        blockUntilConstructorFinished();
        return this.player.getCurrentPosition();
    }

    @Override // androidx.media3.common.Player
    public Timeline getCurrentTimeline() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTimeline();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public TrackGroupArray getCurrentTrackGroups() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTrackGroups();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public TrackSelectionArray getCurrentTrackSelections() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTrackSelections();
    }

    @Override // androidx.media3.common.Player
    public Tracks getCurrentTracks() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTracks();
    }

    @Override // androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        blockUntilConstructorFinished();
        return this.player.getDeviceInfo();
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        blockUntilConstructorFinished();
        return this.player.getDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        blockUntilConstructorFinished();
        return this.player.getDuration();
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        blockUntilConstructorFinished();
        return this.player.getMaxSeekToPreviousPosition();
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getMediaMetadata() {
        blockUntilConstructorFinished();
        return this.player.getMediaMetadata();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        blockUntilConstructorFinished();
        return this.player.getPauseAtEndOfMediaItems();
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        blockUntilConstructorFinished();
        return this.player.getPlayWhenReady();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackLooper();
    }

    @Override // androidx.media3.common.Player
    public PlaybackParameters getPlaybackParameters() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackParameters();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackState();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getPlaylistMetadata() {
        blockUntilConstructorFinished();
        return this.player.getPlaylistMetadata();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        blockUntilConstructorFinished();
        return this.player.getPreloadConfiguration();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Renderer getRenderer(int i11) {
        blockUntilConstructorFinished();
        return this.player.getRenderer(i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        blockUntilConstructorFinished();
        return this.player.getRendererCount();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int i11) {
        blockUntilConstructorFinished();
        return this.player.getRendererType(i11);
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        blockUntilConstructorFinished();
        return this.player.getRepeatMode();
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        blockUntilConstructorFinished();
        return this.player.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        blockUntilConstructorFinished();
        return this.player.getSeekForwardIncrement();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public SeekParameters getSeekParameters() {
        blockUntilConstructorFinished();
        return this.player.getSeekParameters();
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        blockUntilConstructorFinished();
        return this.player.getShuffleModeEnabled();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        blockUntilConstructorFinished();
        return this.player.getSkipSilenceEnabled();
    }

    @Override // androidx.media3.common.Player
    public Size getSurfaceSize() {
        blockUntilConstructorFinished();
        return this.player.getSurfaceSize();
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        blockUntilConstructorFinished();
        return this.player.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        blockUntilConstructorFinished();
        return this.player.getTrackSelectionParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackSelector getTrackSelector() {
        blockUntilConstructorFinished();
        return this.player.getTrackSelector();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        blockUntilConstructorFinished();
        return this.player.getVideoChangeFrameRateStrategy();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters getVideoDecoderCounters() {
        blockUntilConstructorFinished();
        return this.player.getVideoDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format getVideoFormat() {
        blockUntilConstructorFinished();
        return this.player.getVideoFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoScalingMode() {
        blockUntilConstructorFinished();
        return this.player.getVideoScalingMode();
    }

    @Override // androidx.media3.common.Player
    public VideoSize getVideoSize() {
        blockUntilConstructorFinished();
        return this.player.getVideoSize();
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        blockUntilConstructorFinished();
        return this.player.getVolume();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void increaseDeviceVolume() {
        blockUntilConstructorFinished();
        this.player.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        blockUntilConstructorFinished();
        return this.player.isDeviceMuted();
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        blockUntilConstructorFinished();
        return this.player.isLoading();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        blockUntilConstructorFinished();
        return this.player.isPlayingAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        return this.player.isReleased();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        blockUntilConstructorFinished();
        return this.player.isSleepingForOffload();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        blockUntilConstructorFinished();
        return this.player.isTunnelingEnabled();
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i11, int i12, int i13) {
        blockUntilConstructorFinished();
        this.player.moveMediaItems(i11, i12, i13);
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        blockUntilConstructorFinished();
        this.player.prepare();
    }

    @Override // androidx.media3.common.Player
    public void release() {
        blockUntilConstructorFinished();
        this.player.release();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        blockUntilConstructorFinished();
        this.player.removeAnalyticsListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        blockUntilConstructorFinished();
        this.player.removeAudioOffloadListener(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void removeListener(Player.Listener listener) {
        blockUntilConstructorFinished();
        this.player.removeListener(listener);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i11, int i12) {
        blockUntilConstructorFinished();
        this.player.removeMediaItems(i11, i12);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i11, int i12, List<MediaItem> list) {
        blockUntilConstructorFinished();
        this.player.replaceMediaItems(i11, i12, list);
    }

    @Override // androidx.media3.common.BasePlayer
    public void seekTo(int i11, long j11, int i12, boolean z11) {
        blockUntilConstructorFinished();
        this.player.seekTo(i11, j11, i12, z11);
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
        blockUntilConstructorFinished();
        this.player.setAudioAttributes(audioAttributes, z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAudioSessionId(int i11) {
        blockUntilConstructorFinished();
        this.player.setAudioSessionId(i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        blockUntilConstructorFinished();
        this.player.setAuxEffectInfo(auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setCameraMotionListener(CameraMotionListener cameraMotionListener) {
        blockUntilConstructorFinished();
        this.player.setCameraMotionListener(cameraMotionListener);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceMuted(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setDeviceMuted(z11);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceVolume(int i11) {
        blockUntilConstructorFinished();
        this.player.setDeviceVolume(i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setForegroundMode(z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setHandleAudioBecomingNoisy(z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(@Nullable ImageOutput imageOutput) {
        blockUntilConstructorFinished();
        this.player.setImageOutput(imageOutput);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, boolean z11) {
        blockUntilConstructorFinished();
        this.player.setMediaItems(list, z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.setMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list) {
        blockUntilConstructorFinished();
        this.player.setMediaSources(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setPauseAtEndOfMediaItems(z11);
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setPlayWhenReady(z11);
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        blockUntilConstructorFinished();
        this.player.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        blockUntilConstructorFinished();
        this.player.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @RequiresApi(23)
    public void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        blockUntilConstructorFinished();
        this.player.setPreferredAudioDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        blockUntilConstructorFinished();
        this.player.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int i11) {
        blockUntilConstructorFinished();
        this.player.setPriority(i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
        blockUntilConstructorFinished();
        this.player.setPriorityTaskManager(priorityTaskManager);
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(int i11) {
        blockUntilConstructorFinished();
        this.player.setRepeatMode(i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(@Nullable SeekParameters seekParameters) {
        blockUntilConstructorFinished();
        this.player.setSeekParameters(seekParameters);
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setShuffleModeEnabled(z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        blockUntilConstructorFinished();
        this.player.setShuffleOrder(shuffleOrder);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSkipSilenceEnabled(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setSkipSilenceEnabled(z11);
    }

    public void setThrowsWhenUsingWrongThread(boolean z11) {
        blockUntilConstructorFinished();
        this.player.setThrowsWhenUsingWrongThread(z11);
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        blockUntilConstructorFinished();
        this.player.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int i11) {
        blockUntilConstructorFinished();
        this.player.setVideoChangeFrameRateStrategy(i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Effect> list) {
        blockUntilConstructorFinished();
        this.player.setVideoEffects(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        blockUntilConstructorFinished();
        this.player.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoScalingMode(int i11) {
        blockUntilConstructorFinished();
        this.player.setVideoScalingMode(i11);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(@Nullable Surface surface) {
        blockUntilConstructorFinished();
        this.player.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        blockUntilConstructorFinished();
        this.player.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        blockUntilConstructorFinished();
        this.player.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        blockUntilConstructorFinished();
        this.player.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f11) {
        blockUntilConstructorFinished();
        this.player.setVolume(f11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i11) {
        blockUntilConstructorFinished();
        this.player.setWakeMode(i11);
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        blockUntilConstructorFinished();
        this.player.stop();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public static final class Builder {
        private final ExoPlayer.Builder wrappedBuilder;

        @Deprecated
        public Builder(Context context) {
            this.wrappedBuilder = new ExoPlayer.Builder(context);
        }

        @Deprecated
        public SimpleExoPlayer build() {
            return this.wrappedBuilder.buildSimpleExoPlayer();
        }

        @Deprecated
        @uo.a
        public Builder experimentalSetForegroundModeTimeoutMs(long j11) {
            this.wrappedBuilder.experimentalSetForegroundModeTimeoutMs(j11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
            this.wrappedBuilder.setAnalyticsCollector(analyticsCollector);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
            this.wrappedBuilder.setAudioAttributes(audioAttributes, z11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            this.wrappedBuilder.setBandwidthMeter(bandwidthMeter);
            return this;
        }

        @VisibleForTesting
        @Deprecated
        @uo.a
        public Builder setClock(Clock clock) {
            this.wrappedBuilder.setClock(clock);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setDetachSurfaceTimeoutMs(long j11) {
            this.wrappedBuilder.setDetachSurfaceTimeoutMs(j11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setHandleAudioBecomingNoisy(boolean z11) {
            this.wrappedBuilder.setHandleAudioBecomingNoisy(z11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            this.wrappedBuilder.setLivePlaybackSpeedControl(livePlaybackSpeedControl);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setLoadControl(LoadControl loadControl) {
            this.wrappedBuilder.setLoadControl(loadControl);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setLooper(Looper looper) {
            this.wrappedBuilder.setLooper(looper);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.wrappedBuilder.setMediaSourceFactory(factory);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setPauseAtEndOfMediaItems(boolean z11) {
            this.wrappedBuilder.setPauseAtEndOfMediaItems(z11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            this.wrappedBuilder.setPriorityTaskManager(priorityTaskManager);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setReleaseTimeoutMs(long j11) {
            this.wrappedBuilder.setReleaseTimeoutMs(j11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long j11) {
            this.wrappedBuilder.setSeekBackIncrementMs(j11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long j11) {
            this.wrappedBuilder.setSeekForwardIncrementMs(j11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setSeekParameters(SeekParameters seekParameters) {
            this.wrappedBuilder.setSeekParameters(seekParameters);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setSkipSilenceEnabled(boolean z11) {
            this.wrappedBuilder.setSkipSilenceEnabled(z11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setTrackSelector(TrackSelector trackSelector) {
            this.wrappedBuilder.setTrackSelector(trackSelector);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setUseLazyPreparation(boolean z11) {
            this.wrappedBuilder.setUseLazyPreparation(z11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setVideoChangeFrameRateStrategy(int i11) {
            this.wrappedBuilder.setVideoChangeFrameRateStrategy(i11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setVideoScalingMode(int i11) {
            this.wrappedBuilder.setVideoScalingMode(i11);
            return this;
        }

        @Deprecated
        @uo.a
        public Builder setWakeMode(int i11) {
            this.wrappedBuilder.setWakeMode(i11);
            return this;
        }

        @Deprecated
        public Builder(Context context, RenderersFactory renderersFactory) {
            this.wrappedBuilder = new ExoPlayer.Builder(context, renderersFactory);
        }

        @Deprecated
        public Builder(Context context, ExtractorsFactory extractorsFactory) {
            this.wrappedBuilder = new ExoPlayer.Builder(context, new DefaultMediaSourceFactory(context, extractorsFactory));
        }

        @Deprecated
        public Builder(Context context, RenderersFactory renderersFactory, ExtractorsFactory extractorsFactory) {
            this.wrappedBuilder = new ExoPlayer.Builder(context, renderersFactory, new DefaultMediaSourceFactory(context, extractorsFactory));
        }

        @Deprecated
        public Builder(Context context, RenderersFactory renderersFactory, TrackSelector trackSelector, MediaSource.Factory factory, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector) {
            this.wrappedBuilder = new ExoPlayer.Builder(context, renderersFactory, factory, trackSelector, loadControl, bandwidthMeter, analyticsCollector);
        }
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public ExoPlaybackException getPlayerError() {
        blockUntilConstructorFinished();
        return this.player.getPlayerError();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i11, MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.addMediaSource(i11, mediaSource);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i11, List<MediaSource> list) {
        blockUntilConstructorFinished();
        this.player.addMediaSources(i11, list);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(@Nullable Surface surface) {
        blockUntilConstructorFinished();
        this.player.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i11) {
        blockUntilConstructorFinished();
        this.player.decreaseDeviceVolume(i11);
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i11) {
        blockUntilConstructorFinished();
        this.player.increaseDeviceVolume(i11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.prepare(mediaSource);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z11, int i11) {
        blockUntilConstructorFinished();
        this.player.setDeviceMuted(z11, i11);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i11, int i12) {
        blockUntilConstructorFinished();
        this.player.setDeviceVolume(i11, i12);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, int i11, long j11) {
        blockUntilConstructorFinished();
        this.player.setMediaItems(list, i11, j11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean z11) {
        blockUntilConstructorFinished();
        this.player.setMediaSource(mediaSource, z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, boolean z11) {
        blockUntilConstructorFinished();
        this.player.setMediaSources(list, z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z11, boolean z12) {
        blockUntilConstructorFinished();
        this.player.prepare(mediaSource, z11, z12);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long j11) {
        blockUntilConstructorFinished();
        this.player.setMediaSource(mediaSource, j11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, int i11, long j11) {
        blockUntilConstructorFinished();
        this.player.setMediaSources(list, i11, j11);
    }

    public SimpleExoPlayer(Builder builder) {
        this(builder.wrappedBuilder);
    }

    public SimpleExoPlayer(ExoPlayer.Builder builder) {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.constructorFinished = conditionVariable;
        try {
            this.player = new ExoPlayerImpl(builder, this);
            conditionVariable.open();
        } catch (Throwable th2) {
            this.constructorFinished.open();
            throw th2;
        }
    }
}
