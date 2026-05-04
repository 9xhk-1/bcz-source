package androidx.media3.common;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingPlayer implements Player {
    private final Player player;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ForwardingListener implements Player.Listener {
        private final ForwardingPlayer forwardingPlayer;
        private final Player.Listener listener;

        public ForwardingListener(ForwardingPlayer forwardingPlayer, Player.Listener listener) {
            this.forwardingPlayer = forwardingPlayer;
            this.listener = listener;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingListener)) {
                return false;
            }
            ForwardingListener forwardingListener = (ForwardingListener) obj;
            if (this.forwardingPlayer.equals(forwardingListener.forwardingPlayer)) {
                return this.listener.equals(forwardingListener.listener);
            }
            return false;
        }

        public int hashCode() {
            return (this.forwardingPlayer.hashCode() * 31) + this.listener.hashCode();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            this.listener.onAudioAttributesChanged(audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAudioSessionIdChanged(int i11) {
            this.listener.onAudioSessionIdChanged(i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAvailableCommandsChanged(Player.Commands commands) {
            this.listener.onAvailableCommandsChanged(commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(List<Cue> list) {
            this.listener.onCues(list);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            this.listener.onDeviceInfoChanged(deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceVolumeChanged(int i11, boolean z11) {
            this.listener.onDeviceVolumeChanged(i11, z11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            this.listener.onEvents(this.forwardingPlayer, events);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsLoadingChanged(boolean z11) {
            this.listener.onIsLoadingChanged(z11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z11) {
            this.listener.onIsPlayingChanged(z11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onLoadingChanged(boolean z11) {
            this.listener.onIsLoadingChanged(z11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long j11) {
            this.listener.onMaxSeekToPreviousPositionChanged(j11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaItemTransition(@Nullable MediaItem mediaItem, int i11) {
            this.listener.onMediaItemTransition(mediaItem, i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            this.listener.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(Metadata metadata) {
            this.listener.onMetadata(metadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z11, int i11) {
            this.listener.onPlayWhenReadyChanged(z11, i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            this.listener.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i11) {
            this.listener.onPlaybackStateChanged(i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackSuppressionReasonChanged(int i11) {
            this.listener.onPlaybackSuppressionReasonChanged(i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            this.listener.onPlayerError(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
            this.listener.onPlayerErrorChanged(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerStateChanged(boolean z11, int i11) {
            this.listener.onPlayerStateChanged(z11, i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            this.listener.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(int i11) {
            this.listener.onPositionDiscontinuity(i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            this.listener.onRenderedFirstFrame();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRepeatModeChanged(int i11) {
            this.listener.onRepeatModeChanged(i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekBackIncrementChanged(long j11) {
            this.listener.onSeekBackIncrementChanged(j11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekForwardIncrementChanged(long j11) {
            this.listener.onSeekForwardIncrementChanged(j11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onShuffleModeEnabledChanged(boolean z11) {
            this.listener.onShuffleModeEnabledChanged(z11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean z11) {
            this.listener.onSkipSilenceEnabledChanged(z11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSurfaceSizeChanged(int i11, int i12) {
            this.listener.onSurfaceSizeChanged(i11, i12);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(Timeline timeline, int i11) {
            this.listener.onTimelineChanged(timeline, i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            this.listener.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(Tracks tracks) {
            this.listener.onTracksChanged(tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.listener.onVideoSizeChanged(videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVolumeChanged(float f11) {
            this.listener.onVolumeChanged(f11);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(CueGroup cueGroup) {
            this.listener.onCues(cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i11) {
            this.listener.onPositionDiscontinuity(positionInfo, positionInfo2, i11);
        }
    }

    public ForwardingPlayer(Player player) {
        this.player = player;
    }

    @Override // androidx.media3.common.Player
    public void addListener(Player.Listener listener) {
        this.player.addListener(new ForwardingListener(this, listener));
    }

    @Override // androidx.media3.common.Player
    public void addMediaItem(MediaItem mediaItem) {
        this.player.addMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(List<MediaItem> list) {
        this.player.addMediaItems(list);
    }

    @Override // androidx.media3.common.Player
    public boolean canAdvertiseSession() {
        return this.player.canAdvertiseSession();
    }

    @Override // androidx.media3.common.Player
    public void clearMediaItems() {
        this.player.clearMediaItems();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        this.player.clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        this.player.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        this.player.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        this.player.clearVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void decreaseDeviceVolume() {
        this.player.decreaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public Looper getApplicationLooper() {
        return this.player.getApplicationLooper();
    }

    @Override // androidx.media3.common.Player
    public AudioAttributes getAudioAttributes() {
        return this.player.getAudioAttributes();
    }

    @Override // androidx.media3.common.Player
    public Player.Commands getAvailableCommands() {
        return this.player.getAvailableCommands();
    }

    @Override // androidx.media3.common.Player
    public int getBufferedPercentage() {
        return this.player.getBufferedPercentage();
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        return this.player.getBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        return this.player.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public long getContentDuration() {
        return this.player.getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        return this.player.getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        return this.player.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.Player
    public CueGroup getCurrentCues() {
        return this.player.getCurrentCues();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentLiveOffset() {
        return this.player.getCurrentLiveOffset();
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public Object getCurrentManifest() {
        return this.player.getCurrentManifest();
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public MediaItem getCurrentMediaItem() {
        return this.player.getCurrentMediaItem();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        return this.player.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        return this.player.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // androidx.media3.common.Player
    public Timeline getCurrentTimeline() {
        return this.player.getCurrentTimeline();
    }

    @Override // androidx.media3.common.Player
    public Tracks getCurrentTracks() {
        return this.player.getCurrentTracks();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public int getCurrentWindowIndex() {
        return this.player.getCurrentWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        return this.player.getDeviceInfo();
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        return this.player.getDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        return this.player.getDuration();
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        return this.player.getMaxSeekToPreviousPosition();
    }

    @Override // androidx.media3.common.Player
    public MediaItem getMediaItemAt(int i11) {
        return this.player.getMediaItemAt(i11);
    }

    @Override // androidx.media3.common.Player
    public int getMediaItemCount() {
        return this.player.getMediaItemCount();
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getMediaMetadata() {
        return this.player.getMediaMetadata();
    }

    @Override // androidx.media3.common.Player
    public int getNextMediaItemIndex() {
        return this.player.getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public int getNextWindowIndex() {
        return this.player.getNextWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    @Override // androidx.media3.common.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.player.getPlaybackParameters();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        return this.player.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public PlaybackException getPlayerError() {
        return this.player.getPlayerError();
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getPlaylistMetadata() {
        return this.player.getPlaylistMetadata();
    }

    @Override // androidx.media3.common.Player
    public int getPreviousMediaItemIndex() {
        return this.player.getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public int getPreviousWindowIndex() {
        return this.player.getPreviousWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        return this.player.getRepeatMode();
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        return this.player.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        return this.player.getSeekForwardIncrement();
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        return this.player.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.Player
    public Size getSurfaceSize() {
        return this.player.getSurfaceSize();
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        return this.player.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        return this.player.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.Player
    public VideoSize getVideoSize() {
        return this.player.getVideoSize();
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        return this.player.getVolume();
    }

    public Player getWrappedPlayer() {
        return this.player;
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public boolean hasNext() {
        return this.player.hasNext();
    }

    @Override // androidx.media3.common.Player
    public boolean hasNextMediaItem() {
        return this.player.hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public boolean hasNextWindow() {
        return this.player.hasNextWindow();
    }

    @Override // androidx.media3.common.Player
    public boolean hasPreviousMediaItem() {
        return this.player.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void increaseDeviceVolume() {
        this.player.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public boolean isCommandAvailable(int i11) {
        return this.player.isCommandAvailable(i11);
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemDynamic() {
        return this.player.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemLive() {
        return this.player.isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemSeekable() {
        return this.player.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.player.isCurrentWindowDynamic();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public boolean isCurrentWindowLive() {
        return this.player.isCurrentWindowLive();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.player.isCurrentWindowSeekable();
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        return this.player.isDeviceMuted();
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        return this.player.isLoading();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        return this.player.isPlayingAd();
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItem(int i11, int i12) {
        this.player.moveMediaItem(i11, i12);
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i11, int i12, int i13) {
        this.player.moveMediaItems(i11, i12, i13);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void next() {
        this.player.next();
    }

    @Override // androidx.media3.common.Player
    public void pause() {
        this.player.pause();
    }

    @Override // androidx.media3.common.Player
    public void play() {
        this.player.play();
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        this.player.prepare();
    }

    @Override // androidx.media3.common.Player
    public void release() {
        this.player.release();
    }

    @Override // androidx.media3.common.Player
    public void removeListener(Player.Listener listener) {
        this.player.removeListener(new ForwardingListener(this, listener));
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItem(int i11) {
        this.player.removeMediaItem(i11);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i11, int i12) {
        this.player.removeMediaItems(i11, i12);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItem(int i11, MediaItem mediaItem) {
        this.player.replaceMediaItem(i11, mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i11, int i12, List<MediaItem> list) {
        this.player.replaceMediaItems(i11, i12, list);
    }

    @Override // androidx.media3.common.Player
    public void seekBack() {
        this.player.seekBack();
    }

    @Override // androidx.media3.common.Player
    public void seekForward() {
        this.player.seekForward();
    }

    @Override // androidx.media3.common.Player
    public void seekTo(long j11) {
        this.player.seekTo(j11);
    }

    @Override // androidx.media3.common.Player
    public void seekToDefaultPosition() {
        this.player.seekToDefaultPosition();
    }

    @Override // androidx.media3.common.Player
    public void seekToNext() {
        this.player.seekToNext();
    }

    @Override // androidx.media3.common.Player
    public void seekToNextMediaItem() {
        this.player.seekToNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void seekToNextWindow() {
        this.player.seekToNextWindow();
    }

    @Override // androidx.media3.common.Player
    public void seekToPrevious() {
        this.player.seekToPrevious();
    }

    @Override // androidx.media3.common.Player
    public void seekToPreviousMediaItem() {
        this.player.seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void seekToPreviousWindow() {
        this.player.seekToPreviousWindow();
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
        this.player.setAudioAttributes(audioAttributes, z11);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceMuted(boolean z11) {
        this.player.setDeviceMuted(z11);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceVolume(int i11) {
        this.player.setDeviceVolume(i11);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(MediaItem mediaItem) {
        this.player.setMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list) {
        this.player.setMediaItems(list);
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z11) {
        this.player.setPlayWhenReady(z11);
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackSpeed(float f11) {
        this.player.setPlaybackSpeed(f11);
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(int i11) {
        this.player.setRepeatMode(i11);
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z11) {
        this.player.setShuffleModeEnabled(z11);
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(@Nullable Surface surface) {
        this.player.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        this.player.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        this.player.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        this.player.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f11) {
        this.player.setVolume(f11);
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        this.player.stop();
    }

    @Override // androidx.media3.common.Player
    public void addMediaItem(int i11, MediaItem mediaItem) {
        this.player.addMediaItem(i11, mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i11, List<MediaItem> list) {
        this.player.addMediaItems(i11, list);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(@Nullable Surface surface) {
        this.player.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i11) {
        this.player.decreaseDeviceVolume(i11);
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i11) {
        this.player.increaseDeviceVolume(i11);
    }

    @Override // androidx.media3.common.Player
    public void seekTo(int i11, long j11) {
        this.player.seekTo(i11, j11);
    }

    @Override // androidx.media3.common.Player
    public void seekToDefaultPosition(int i11) {
        this.player.seekToDefaultPosition(i11);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z11, int i11) {
        this.player.setDeviceMuted(z11, i11);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i11, int i12) {
        this.player.setDeviceVolume(i11, i12);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(MediaItem mediaItem, long j11) {
        this.player.setMediaItem(mediaItem, j11);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, boolean z11) {
        this.player.setMediaItems(list, z11);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(MediaItem mediaItem, boolean z11) {
        this.player.setMediaItem(mediaItem, z11);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, int i11, long j11) {
        this.player.setMediaItems(list, i11, j11);
    }
}
