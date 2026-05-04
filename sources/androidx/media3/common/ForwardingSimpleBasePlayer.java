package androidx.media3.common;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingSimpleBasePlayer extends SimpleBasePlayer {
    private Metadata lastTimedMetadata;
    private LivePositionSuppliers livePositionSuppliers;
    private int pendingDiscontinuityReason;
    private boolean pendingFirstFrameRendered;
    private long pendingPositionDiscontinuityNewPositionMs;
    private int playWhenReadyChangeReason;
    private final Player player;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LivePositionSuppliers {
        public final SimpleBasePlayer.LivePositionSupplier bufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentBufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier currentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier totalBufferedPositionSupplier;

        public LivePositionSuppliers(final Player player) {
            Objects.requireNonNull(player);
            this.currentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.i
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return Player.this.getCurrentPosition();
                }
            });
            this.bufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.j
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return Player.this.getBufferedPosition();
                }
            });
            this.contentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.k
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return Player.this.getContentPosition();
                }
            });
            this.contentBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.l
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return Player.this.getContentBufferedPosition();
                }
            });
            this.totalBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.m
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return Player.this.getTotalBufferedDuration();
                }
            });
        }

        public void disconnect(long j11, long j12) {
            this.currentPositionSupplier.disconnect(j11);
            this.bufferedPositionSupplier.disconnect(j11);
            this.contentPositionSupplier.disconnect(j12);
            this.contentBufferedPositionSupplier.disconnect(j12);
            this.totalBufferedPositionSupplier.disconnect(0L);
        }
    }

    public ForwardingSimpleBasePlayer(final Player player) {
        super(player.getApplicationLooper());
        this.player = player;
        this.lastTimedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
        this.playWhenReadyChangeReason = 1;
        this.pendingDiscontinuityReason = 5;
        this.livePositionSuppliers = new LivePositionSuppliers(player);
        player.addListener(new Player.Listener() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer.1
            @Override // androidx.media3.common.Player.Listener
            public void onEvents(Player player2, Player.Events events) {
                ForwardingSimpleBasePlayer.this.invalidateState();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onMetadata(Metadata metadata) {
                ForwardingSimpleBasePlayer.this.lastTimedMetadata = metadata;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayWhenReadyChanged(boolean z11, int i11) {
                ForwardingSimpleBasePlayer.this.playWhenReadyChangeReason = i11;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i11) {
                ForwardingSimpleBasePlayer.this.pendingDiscontinuityReason = i11;
                ForwardingSimpleBasePlayer.this.pendingPositionDiscontinuityNewPositionMs = positionInfo2.positionMs;
                ForwardingSimpleBasePlayer.this.livePositionSuppliers.disconnect(positionInfo.positionMs, positionInfo.contentPositionMs);
                ForwardingSimpleBasePlayer.this.livePositionSuppliers = new LivePositionSuppliers(player);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onRenderedFirstFrame() {
                ForwardingSimpleBasePlayer.this.pendingFirstFrameRendered = true;
            }
        });
    }

    public final Player getPlayer() {
        return this.player;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public SimpleBasePlayer.State getState() {
        SimpleBasePlayer.State.Builder builder = new SimpleBasePlayer.State.Builder();
        LivePositionSuppliers livePositionSuppliers = this.livePositionSuppliers;
        if (this.player.isCommandAvailable(16)) {
            builder.setAdBufferedPositionMs(livePositionSuppliers.bufferedPositionSupplier);
            builder.setAdPositionMs(livePositionSuppliers.currentPositionSupplier);
        }
        if (this.player.isCommandAvailable(21)) {
            builder.setAudioAttributes(this.player.getAudioAttributes());
        }
        builder.setAvailableCommands(this.player.getAvailableCommands());
        if (this.player.isCommandAvailable(16)) {
            builder.setContentBufferedPositionMs(livePositionSuppliers.contentBufferedPositionSupplier);
            builder.setContentPositionMs(livePositionSuppliers.contentPositionSupplier);
            if (this.player.isCommandAvailable(17)) {
                builder.setCurrentAd(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.player.isCommandAvailable(28)) {
            builder.setCurrentCues(this.player.getCurrentCues());
        }
        if (this.player.isCommandAvailable(17)) {
            builder.setCurrentMediaItemIndex(this.player.getCurrentMediaItemIndex());
        }
        builder.setDeviceInfo(this.player.getDeviceInfo());
        if (this.player.isCommandAvailable(23)) {
            builder.setDeviceVolume(this.player.getDeviceVolume());
            builder.setIsDeviceMuted(this.player.isDeviceMuted());
        }
        builder.setIsLoading(this.player.isLoading());
        builder.setMaxSeekToPreviousPositionMs(this.player.getMaxSeekToPreviousPosition());
        if (this.pendingFirstFrameRendered) {
            builder.setNewlyRenderedFirstFrame(true);
            this.pendingFirstFrameRendered = false;
        }
        builder.setPlaybackParameters(this.player.getPlaybackParameters());
        builder.setPlaybackState(this.player.getPlaybackState());
        builder.setPlaybackSuppressionReason(this.player.getPlaybackSuppressionReason());
        builder.setPlayerError(this.player.getPlayerError());
        if (this.player.isCommandAvailable(17)) {
            builder.setPlaylist(this.player.getCurrentTimeline(), this.player.isCommandAvailable(30) ? this.player.getCurrentTracks() : Tracks.EMPTY, this.player.isCommandAvailable(18) ? this.player.getMediaMetadata() : null);
        }
        if (this.player.isCommandAvailable(18)) {
            builder.setPlaylistMetadata(this.player.getPlaylistMetadata());
        }
        builder.setPlayWhenReady(this.player.getPlayWhenReady(), this.playWhenReadyChangeReason);
        long j11 = this.pendingPositionDiscontinuityNewPositionMs;
        if (j11 != C.TIME_UNSET) {
            builder.setPositionDiscontinuity(this.pendingDiscontinuityReason, j11);
            this.pendingPositionDiscontinuityNewPositionMs = C.TIME_UNSET;
        }
        builder.setRepeatMode(this.player.getRepeatMode());
        builder.setSeekBackIncrementMs(this.player.getSeekBackIncrement());
        builder.setSeekForwardIncrementMs(this.player.getSeekForwardIncrement());
        builder.setShuffleModeEnabled(this.player.getShuffleModeEnabled());
        builder.setSurfaceSize(this.player.getSurfaceSize());
        builder.setTimedMetadata(this.lastTimedMetadata);
        if (this.player.isCommandAvailable(16)) {
            builder.setTotalBufferedDurationMs(livePositionSuppliers.totalBufferedPositionSupplier);
        }
        builder.setTrackSelectionParameters(this.player.getTrackSelectionParameters());
        builder.setVideoSize(this.player.getVideoSize());
        if (this.player.isCommandAvailable(22)) {
            builder.setVolume(this.player.getVolume());
        }
        return builder.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleAddMediaItems(int i11, List<MediaItem> list) {
        if (list.size() == 1) {
            this.player.addMediaItem(i11, list.get(0));
        } else {
            this.player.addMediaItems(i11, list);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleClearVideoOutput(@Nullable Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.clearVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.clearVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.clearVideoSurfaceHolder((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.player.clearVideoSurface((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.player.clearVideoSurface();
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleDecreaseDeviceVolume(int i11) {
        if (this.player.isCommandAvailable(34)) {
            this.player.decreaseDeviceVolume(i11);
        } else {
            this.player.decreaseDeviceVolume();
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleIncreaseDeviceVolume(int i11) {
        if (this.player.isCommandAvailable(34)) {
            this.player.increaseDeviceVolume(i11);
        } else {
            this.player.increaseDeviceVolume();
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleMoveMediaItems(int i11, int i12, int i13) {
        if (i12 == i11 + 1) {
            this.player.moveMediaItem(i11, i13);
        } else {
            this.player.moveMediaItems(i11, i12, i13);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handlePrepare() {
        this.player.prepare();
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleRelease() {
        this.player.release();
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleRemoveMediaItems(int i11, int i12) {
        if (i12 == i11 + 1) {
            this.player.removeMediaItem(i11);
        } else {
            this.player.removeMediaItems(i11, i12);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleReplaceMediaItems(int i11, int i12, List<MediaItem> list) {
        if (i12 == i11 + 1 && list.size() == 1) {
            this.player.replaceMediaItem(i11, list.get(0));
        } else {
            this.player.replaceMediaItems(i11, i12, list);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSeek(int i11, long j11, int i12) {
        switch (i12) {
            case 4:
                this.player.seekToDefaultPosition();
                break;
            case 5:
                this.player.seekTo(j11);
                break;
            case 6:
                this.player.seekToPreviousMediaItem();
                break;
            case 7:
                this.player.seekToPrevious();
                break;
            case 8:
                this.player.seekToNextMediaItem();
                break;
            case 9:
                this.player.seekToNext();
                break;
            case 10:
                if (i11 != -1) {
                    this.player.seekTo(i11, j11);
                    break;
                }
                break;
            case 11:
                this.player.seekBack();
                break;
            case 12:
                this.player.seekForward();
                break;
            default:
                throw new IllegalStateException();
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
        this.player.setAudioAttributes(audioAttributes, z11);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetDeviceMuted(boolean z11, int i11) {
        if (this.player.isCommandAvailable(34)) {
            this.player.setDeviceMuted(z11, i11);
        } else {
            this.player.setDeviceMuted(z11);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetDeviceVolume(int i11, int i12) {
        if (this.player.isCommandAvailable(33)) {
            this.player.setDeviceVolume(i11, i12);
        } else {
            this.player.setDeviceVolume(i11);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetMediaItems(List<MediaItem> list, int i11, long j11) {
        boolean z11 = list.size() == 1 && this.player.isCommandAvailable(31);
        if (i11 == -1) {
            if (z11) {
                this.player.setMediaItem(list.get(0));
            } else {
                this.player.setMediaItems(list);
            }
        } else if (z11) {
            this.player.setMediaItem(list.get(0), j11);
        } else {
            this.player.setMediaItems(list, i11, j11);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetPlayWhenReady(boolean z11) {
        this.player.setPlayWhenReady(z11);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetRepeatMode(int i11) {
        this.player.setRepeatMode(i11);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetShuffleModeEnabled(boolean z11) {
        this.player.setShuffleModeEnabled(z11);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.setVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.setVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.setVideoSurfaceHolder((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.player.setVideoSurface((Surface) obj);
        }
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleSetVolume(float f11) {
        this.player.setVolume(f11);
        return com.google.common.util.concurrent.d1.p();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public com.google.common.util.concurrent.p1<?> handleStop() {
        this.player.stop();
        return com.google.common.util.concurrent.d1.p();
    }
}
