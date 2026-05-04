package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.ui.TimeBar;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;

    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @Nullable
    private final View fastForwardButton;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;

    @Nullable
    private final View nextButton;

    @Nullable
    private final View pauseButton;
    private final Timeline.Period period;

    @Nullable
    private final View playButton;
    private boolean[] playedAdGroups;

    @Nullable
    private Player player;

    @Nullable
    private final TextView positionView;

    @Nullable
    private final View previousButton;

    @Nullable
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;

    @Nullable
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;

    @Nullable
    private final View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPlayButtonIfSuppressed;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;

    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;

    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    private final View vrButton;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = LegacyPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (LegacyPlayerControlView.this.nextButton == view) {
                player.seekToNext();
                return;
            }
            if (LegacyPlayerControlView.this.previousButton == view) {
                player.seekToPrevious();
                return;
            }
            if (LegacyPlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() != 4) {
                    player.seekForward();
                    return;
                }
                return;
            }
            if (LegacyPlayerControlView.this.rewindButton == view) {
                player.seekBack();
                return;
            }
            if (LegacyPlayerControlView.this.playButton == view) {
                Util.handlePlayButtonAction(player);
                return;
            }
            if (LegacyPlayerControlView.this.pauseButton == view) {
                Util.handlePauseButtonAction(player);
            } else if (LegacyPlayerControlView.this.repeatToggleButton == view) {
                player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), LegacyPlayerControlView.this.repeatToggleModes));
            } else if (LegacyPlayerControlView.this.shuffleButton == view) {
                player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5)) {
                LegacyPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                LegacyPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                LegacyPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                LegacyPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                LegacyPlayerControlView.this.updateTimeline();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j11) {
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j11));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j11) {
            LegacyPlayerControlView.this.scrubbing = true;
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j11));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j11, boolean z11) {
            LegacyPlayerControlView.this.scrubbing = false;
            if (z11 || LegacyPlayerControlView.this.player == null) {
                return;
            }
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.seekToTimeBarPosition(legacyPlayerControlView.player, j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ProgressUpdateListener {
        void onProgressUpdate(long j11, long j12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface VisibilityListener {
        void onVisibilityChange(int i11);
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i11 = 0; i11 < windowCount; i11++) {
            if (timeline.getWindow(i11, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs <= 0) {
            this.hideAtMs = C.TIME_UNSET;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i11 = this.showTimeoutMs;
        this.hideAtMs = uptimeMillis + i11;
        if (this.isAttachedToWindow) {
            postDelayed(this.hideAction, i11);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i11) {
        return i11 == 90 || i11 == 89 || i11 == 85 || i11 == 79 || i11 == 126 || i11 == 127 || i11 == 87 || i11 == 88;
    }

    private void requestPlayPauseAccessibilityFocus() {
        View view;
        View view2;
        boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (shouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (shouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (shouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (shouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void seekTo(Player player, int i11, long j11) {
        player.seekTo(i11, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j11) {
        int currentMediaItemIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.window).getDurationMs();
                if (j11 < durationMs) {
                    break;
                }
                if (currentMediaItemIndex == windowCount - 1) {
                    j11 = durationMs;
                    break;
                } else {
                    j11 -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        seekTo(player, currentMediaItemIndex, j11);
        updateProgress();
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    private void updateButton(boolean z11, boolean z12, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z12);
        view.setAlpha(z12 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                z11 = player.isCommandAvailable(5);
                z13 = player.isCommandAvailable(7);
                z14 = player.isCommandAvailable(11);
                z15 = player.isCommandAvailable(12);
                z12 = player.isCommandAvailable(9);
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
            }
            updateButton(this.showPreviousButton, z13, this.previousButton);
            updateButton(this.showRewindButton, z14, this.rewindButton);
            updateButton(this.showFastForwardButton, z15, this.fastForwardButton);
            updateButton(this.showNextButton, z12, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z11;
        boolean z12;
        if (isVisible() && this.isAttachedToWindow) {
            boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            View view = this.playButton;
            if (view != null) {
                z11 = !shouldShowPlayButton && view.isFocused();
                z12 = !shouldShowPlayButton && this.playButton.isAccessibilityFocused();
                this.playButton.setVisibility(shouldShowPlayButton ? 0 : 8);
            } else {
                z11 = false;
                z12 = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                z11 |= shouldShowPlayButton && view2.isFocused();
                z12 |= shouldShowPlayButton && this.pauseButton.isAccessibilityFocused();
                this.pauseButton.setVisibility(shouldShowPlayButton ? 8 : 0);
            }
            if (z11) {
                requestPlayPauseFocus();
            }
            if (z12) {
                requestPlayPauseAccessibilityFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long j11;
        long j12;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                j11 = this.currentWindowOffset + player.getContentPosition();
                j12 = this.currentWindowOffset + player.getContentBufferedPosition();
            } else {
                j11 = 0;
                j12 = 0;
            }
            boolean z11 = j11 != this.currentPosition;
            boolean z12 = j12 != this.currentBufferedPosition;
            this.currentPosition = j11;
            this.currentBufferedPosition = j12;
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing && z11) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j11));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(j11);
                this.timeBar.setBufferedPosition(j12);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null && (z11 || z12)) {
                progressUpdateListener.onProgressUpdate(j11, j12);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long min = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (j11 % 1000));
            float f11 = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f11 > 0.0f ? (long) (min / f11) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
                return;
            }
            if (player == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, true, imageView);
                this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(player.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeline() {
        int i11;
        Timeline.Window window;
        long j11;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z11 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        long j12 = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            i11 = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z12 = this.multiWindowTimeBar;
            int i12 = z12 ? 0 : currentMediaItemIndex;
            int windowCount = z12 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i11 = 0;
            long j13 = 0;
            while (true) {
                if (i12 > windowCount) {
                    break;
                }
                if (i12 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j13);
                }
                currentTimeline.getWindow(i12, this.window);
                Timeline.Window window2 = this.window;
                if (window2.durationUs == C.TIME_UNSET) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z11);
                    break;
                }
                int i13 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i13 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i13, this.period);
                        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
                        int adGroupCount = this.period.getAdGroupCount();
                        while (removedAdGroupCount < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                j11 = j12;
                                long j14 = this.period.durationUs;
                                if (j14 == C.TIME_UNSET) {
                                    removedAdGroupCount++;
                                    j12 = j11;
                                } else {
                                    adGroupTimeUs = j14;
                                }
                            } else {
                                j11 = j12;
                            }
                            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                            if (positionInWindowUs >= j11) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i11 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i11] = Util.usToMs(j13 + positionInWindowUs);
                                this.playedAdGroups[i11] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i11++;
                            }
                            removedAdGroupCount++;
                            j12 = j11;
                        }
                        i13++;
                    }
                }
                j13 += window.durationUs;
                i12++;
                j12 = j12;
                z11 = true;
            }
            j12 = j13;
        }
        long usToMs = Util.usToMs(j12);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, usToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(usToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i14 = i11 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i14 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i14);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i14);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i11, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i11, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i14);
        }
        updateProgress();
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.handlePauseButtonAction(player);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j11 = this.hideAtMs;
        if (j11 != C.TIME_UNSET) {
            long uptimeMillis = j11 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i11) {
        this.repeatToggleModes = i11;
        Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i11 == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i11 == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i11 == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z11) {
        this.showFastForwardButton = z11;
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        this.showMultiWindowTimeBar = z11;
        updateTimeline();
    }

    public void setShowNextButton(boolean z11) {
        this.showNextButton = z11;
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        this.showPlayButtonIfSuppressed = z11;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z11) {
        this.showPreviousButton = z11;
        updateNavigation();
    }

    public void setShowRewindButton(boolean z11) {
        this.showRewindButton = z11;
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z11) {
        this.showShuffleButton = z11;
        updateShuffleButton();
    }

    public void setShowTimeoutMs(int i11) {
        this.showTimeoutMs = i11;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public void setShowVrButton(boolean z11) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i11, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
            requestPlayPauseAccessibilityFocus();
        }
        hideAfterTimeout();
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i11) {
        return typedArray.getInt(R.styleable.LegacyPlayerControlView_repeat_toggle_modes, i11);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i11, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i11);
        int i12 = R.layout.exo_legacy_player_control_view;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = C.TIME_UNSET;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.LegacyPlayerControlView, i11, 0);
            try {
                this.showTimeoutMs = obtainStyledAttributes.getInt(R.styleable.LegacyPlayerControlView_show_timeout, this.showTimeoutMs);
                i12 = obtainStyledAttributes.getResourceId(R.styleable.LegacyPlayerControlView_controller_layout_id, i12);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = obtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_rewind_button, this.showRewindButton);
                this.showFastForwardButton = obtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_fastforward_button, this.showFastForwardButton);
                this.showPreviousButton = obtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_previous_button, this.showPreviousButton);
                this.showNextButton = obtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_next_button, this.showNextButton);
                this.showShuffleButton = obtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(R.styleable.LegacyPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        StringBuilder sb2 = new StringBuilder();
        this.formatBuilder = sb2;
        this.formatter = new Formatter(sb2, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.updateProgressAction = new Runnable() { // from class: androidx.media3.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                LegacyPlayerControlView.this.updateProgress();
            }
        };
        this.hideAction = new Runnable() { // from class: androidx.media3.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                LegacyPlayerControlView.this.hide();
            }
        };
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        int i13 = R.id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i13);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i13);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.playButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.pauseButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.previousButton = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(componentListener);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.nextButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.rewindButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.fastForwardButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.vrButton = findViewById8;
        setShowVrButton(false);
        updateButton(false, false, findViewById8);
        Resources resources = context.getResources();
        this.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.repeatOffButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_repeat_off);
        this.repeatOneButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_repeat_one);
        this.repeatAllButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_repeat_all);
        this.shuffleOnButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_shuffle_on);
        this.shuffleOffButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.currentPosition = C.TIME_UNSET;
        this.currentBufferedPosition = C.TIME_UNSET;
    }
}
