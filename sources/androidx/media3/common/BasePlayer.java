package androidx.media3.common;

import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class BasePlayer implements Player {
    protected final Timeline.Window window = new Timeline.Window();

    private int getRepeatModeForNavigation() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void ignoreSeek(int i11) {
        seekTo(-1, C.TIME_UNSET, i11, false);
    }

    private void repeatCurrentMediaItem(int i11) {
        seekTo(getCurrentMediaItemIndex(), C.TIME_UNSET, i11, true);
    }

    private void seekToCurrentItem(long j11, int i11) {
        seekTo(getCurrentMediaItemIndex(), j11, i11, false);
    }

    private void seekToDefaultPositionInternal(int i11, int i12) {
        seekTo(i11, C.TIME_UNSET, i12, false);
    }

    private void seekToNextMediaItemInternal(int i11) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            ignoreSeek(i11);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i11);
        } else {
            seekToDefaultPositionInternal(nextMediaItemIndex, i11);
        }
    }

    private void seekToOffset(long j11, int i11) {
        long currentPosition = getCurrentPosition() + j11;
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekToCurrentItem(Math.max(currentPosition, 0L), i11);
    }

    private void seekToPreviousMediaItemInternal(int i11) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            ignoreSeek(i11);
        } else if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i11);
        } else {
            seekToDefaultPositionInternal(previousMediaItemIndex, i11);
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(int i11, MediaItem mediaItem) {
        addMediaItems(i11, ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(List<MediaItem> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // androidx.media3.common.Player
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // androidx.media3.common.Player
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.common.Player
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return Util.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // androidx.media3.common.Player
    public final long getContentDuration() {
        Timeline currentTimeline = getCurrentTimeline();
        return currentTimeline.isEmpty() ? C.TIME_UNSET : currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentLiveOffset() {
        Timeline currentTimeline = getCurrentTimeline();
        return (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).windowStartTimeMs == C.TIME_UNSET) ? C.TIME_UNSET : (this.window.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - getContentPosition();
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final Object getCurrentManifest() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).manifest;
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final MediaItem getCurrentMediaItem() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final MediaItem getMediaItemAt(int i11) {
        return getCurrentTimeline().getWindow(i11, this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // androidx.media3.common.Player
    public final int getNextMediaItemIndex() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getNextWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getPreviousMediaItemIndex() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // androidx.media3.common.Player
    public final boolean isCommandAvailable(int i11) {
        return getAvailableCommands().contains(i11);
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemDynamic() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isDynamic;
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemLive() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isLive();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemSeekable() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isSeekable;
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItem(int i11, int i12) {
        if (i11 != i12) {
            moveMediaItems(i11, i11 + 1, i12);
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.Player
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItem(int i11) {
        removeMediaItems(i11, i11 + 1);
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItem(int i11, MediaItem mediaItem) {
        replaceMediaItems(i11, i11 + 1, ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void seekBack() {
        seekToOffset(-getSeekBackIncrement(), 11);
    }

    @Override // androidx.media3.common.Player
    public final void seekForward() {
        seekToOffset(getSeekForwardIncrement(), 12);
    }

    @uo.g
    public abstract void seekTo(int i11, long j11, int i12, boolean z11);

    @Override // androidx.media3.common.Player
    public final void seekTo(long j11) {
        seekToCurrentItem(j11, 5);
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition() {
        seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 4);
    }

    @Override // androidx.media3.common.Player
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            ignoreSeek(9);
            return;
        }
        if (hasNextMediaItem()) {
            seekToNextMediaItemInternal(9);
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 9);
        } else {
            ignoreSeek(9);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToNextMediaItem() {
        seekToNextMediaItemInternal(8);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            ignoreSeek(7);
            return;
        }
        boolean hasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (hasPreviousMediaItem) {
                seekToPreviousMediaItemInternal(7);
                return;
            } else {
                ignoreSeek(7);
                return;
            }
        }
        if (!hasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekToCurrentItem(0L, 7);
        } else {
            seekToPreviousMediaItemInternal(7);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToPreviousMediaItem() {
        seekToPreviousMediaItemInternal(6);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(MediaItem mediaItem) {
        setMediaItems(ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list) {
        setMediaItems(list, true);
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackSpeed(float f11) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f11));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(MediaItem mediaItem) {
        addMediaItems(ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(int i11, long j11) {
        seekTo(i11, j11, 10, false);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(MediaItem mediaItem, long j11) {
        setMediaItems(ImmutableList.of(mediaItem), 0, j11);
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition(int i11) {
        seekToDefaultPositionInternal(i11, 10);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(MediaItem mediaItem, boolean z11) {
        setMediaItems(ImmutableList.of(mediaItem), z11);
    }
}
