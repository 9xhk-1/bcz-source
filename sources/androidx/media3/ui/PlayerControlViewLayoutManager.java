package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;

    @Nullable
    private final ViewGroup basicControls;

    @Nullable
    private final ViewGroup bottomBar;

    @Nullable
    private final ViewGroup centerControls;

    @Nullable
    private final View controlsBackground;

    @Nullable
    private final ViewGroup extraControls;

    @Nullable
    private final ViewGroup extraControlsScrollView;
    private final AnimatorSet hideAllBarsAnimator;
    private final AnimatorSet hideMainBarAnimator;
    private final AnimatorSet hideProgressBarAnimator;
    private boolean isMinimalMode;

    @Nullable
    private final ViewGroup minimalControls;
    private boolean needToShowBars;
    private final ValueAnimator overflowHideAnimator;
    private final ValueAnimator overflowShowAnimator;

    @Nullable
    private final View overflowShowButton;
    private final PlayerControlView playerControlView;
    private final AnimatorSet showAllBarsAnimator;
    private final AnimatorSet showMainBarAnimator;

    @Nullable
    private final View timeBar;

    @Nullable
    private final ViewGroup timeView;
    private final Runnable showAllBarsRunnable = new Runnable() { // from class: androidx.media3.ui.t
        @Override // java.lang.Runnable
        public final void run() {
            PlayerControlViewLayoutManager.this.showAllBars();
        }
    };
    private final Runnable hideAllBarsRunnable = new Runnable() { // from class: androidx.media3.ui.w
        @Override // java.lang.Runnable
        public final void run() {
            PlayerControlViewLayoutManager.this.hideAllBars();
        }
    };
    private final Runnable hideProgressBarRunnable = new Runnable() { // from class: androidx.media3.ui.x
        @Override // java.lang.Runnable
        public final void run() {
            PlayerControlViewLayoutManager.this.hideProgressBar();
        }
    };
    private final Runnable hideMainBarRunnable = new Runnable() { // from class: androidx.media3.ui.y
        @Override // java.lang.Runnable
        public final void run() {
            PlayerControlViewLayoutManager.this.hideMainBar();
        }
    };
    private final Runnable hideControllerRunnable = new Runnable() { // from class: androidx.media3.ui.z
        @Override // java.lang.Runnable
        public final void run() {
            PlayerControlViewLayoutManager.this.hideController();
        }
    };
    private final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.a0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            PlayerControlViewLayoutManager.this.onLayoutChange(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };
    private boolean animationEnabled = true;
    private int uxState = 0;
    private final List<View> shownButtons = new ArrayList();

    public PlayerControlViewLayoutManager(final PlayerControlView playerControlView) {
        this.playerControlView = playerControlView;
        this.controlsBackground = playerControlView.findViewById(R.id.exo_controls_background);
        this.centerControls = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.minimalControls = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.bottomBar = viewGroup;
        this.timeView = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View findViewById = playerControlView.findViewById(R.id.exo_progress);
        this.timeBar = findViewById;
        this.basicControls = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.extraControls = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.extraControlsScrollView = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.overflowShowButton = findViewById2;
        View findViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlViewLayoutManager.this.onOverflowButtonClick(view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlViewLayoutManager.this.onOverflowButtonClick(view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlayerControlViewLayoutManager.d(PlayerControlViewLayoutManager.this, valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(4);
                }
                if (PlayerControlViewLayoutManager.this.centerControls != null) {
                    PlayerControlViewLayoutManager.this.centerControls.setVisibility(4);
                }
                if (PlayerControlViewLayoutManager.this.minimalControls != null) {
                    PlayerControlViewLayoutManager.this.minimalControls.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (!(PlayerControlViewLayoutManager.this.timeBar instanceof DefaultTimeBar) || PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((DefaultTimeBar) PlayerControlViewLayoutManager.this.timeBar).hideScrubber(250L);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlayerControlViewLayoutManager.f(PlayerControlViewLayoutManager.this, valueAnimator);
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(0);
                }
                if (PlayerControlViewLayoutManager.this.centerControls != null) {
                    PlayerControlViewLayoutManager.this.centerControls.setVisibility(0);
                }
                if (PlayerControlViewLayoutManager.this.minimalControls != null) {
                    PlayerControlViewLayoutManager.this.minimalControls.setVisibility(PlayerControlViewLayoutManager.this.isMinimalMode ? 0 : 4);
                }
                if (!(PlayerControlViewLayoutManager.this.timeBar instanceof DefaultTimeBar) || PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((DefaultTimeBar) PlayerControlViewLayoutManager.this.timeBar).showScrubber(250L);
            }
        });
        Resources resources = playerControlView.getResources();
        int i11 = R.dimen.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i11) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i11);
        AnimatorSet animatorSet = new AnimatorSet();
        this.hideMainBarAnimator = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(1);
                if (PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet.play(ofFloat).with(ofTranslationY(0.0f, dimension, findViewById)).with(ofTranslationY(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideProgressBarAnimator = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(2);
                if (PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet2.play(ofTranslationY(dimension, dimension2, findViewById)).with(ofTranslationY(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.hideAllBarsAnimator = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(2);
                if (PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet3.play(ofFloat).with(ofTranslationY(0.0f, dimension2, findViewById)).with(ofTranslationY(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.showMainBarAnimator = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet4.play(ofFloat2).with(ofTranslationY(dimension, 0.0f, findViewById)).with(ofTranslationY(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.showAllBarsAnimator = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet5.play(ofFloat2).with(ofTranslationY(dimension2, 0.0f, findViewById)).with(ofTranslationY(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.overflowShowAnimator = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlayerControlViewLayoutManager.a(PlayerControlViewLayoutManager.this, valueAnimator);
            }
        });
        ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PlayerControlViewLayoutManager.this.basicControls != null) {
                    PlayerControlViewLayoutManager.this.basicControls.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(0);
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.setTranslationX(PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth());
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.scrollTo(PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth(), 0);
                }
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.overflowHideAnimator = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlayerControlViewLayoutManager.l(PlayerControlViewLayoutManager.this, valueAnimator);
            }
        });
        ofFloat4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (PlayerControlViewLayoutManager.this.basicControls != null) {
                    PlayerControlViewLayoutManager.this.basicControls.setVisibility(0);
                }
            }
        });
    }

    public static /* synthetic */ void a(PlayerControlViewLayoutManager playerControlViewLayoutManager, ValueAnimator valueAnimator) {
        playerControlViewLayoutManager.getClass();
        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void animateOverflow(float f11) {
        if (this.extraControlsScrollView != null) {
            this.extraControlsScrollView.setTranslationX((int) (r0.getWidth() * (1.0f - f11)));
        }
        ViewGroup viewGroup = this.timeView;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f11);
        }
        ViewGroup viewGroup2 = this.basicControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f11);
        }
    }

    public static /* synthetic */ void d(PlayerControlViewLayoutManager playerControlViewLayoutManager, ValueAnimator valueAnimator) {
        playerControlViewLayoutManager.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = playerControlViewLayoutManager.controlsBackground;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = playerControlViewLayoutManager.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = playerControlViewLayoutManager.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static /* synthetic */ void f(PlayerControlViewLayoutManager playerControlViewLayoutManager, ValueAnimator valueAnimator) {
        playerControlViewLayoutManager.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = playerControlViewLayoutManager.controlsBackground;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = playerControlViewLayoutManager.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = playerControlViewLayoutManager.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    private static int getHeightWithMargins(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static int getWidthWithMargins(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAllBars() {
        this.hideAllBarsAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideController() {
        setUxState(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideMainBar() {
        this.hideMainBarAnimator.start();
        postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressBar() {
        this.hideProgressBarAnimator.start();
    }

    public static /* synthetic */ void l(PlayerControlViewLayoutManager playerControlViewLayoutManager, ValueAnimator valueAnimator) {
        playerControlViewLayoutManager.getClass();
        playerControlViewLayoutManager.animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator ofTranslationY(float f11, float f12, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean useMinimalMode = useMinimalMode();
        if (this.isMinimalMode != useMinimalMode) {
            this.isMinimalMode = useMinimalMode;
            view.post(new Runnable() { // from class: androidx.media3.ui.n
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerControlViewLayoutManager.this.updateLayoutForSizeChange();
                }
            });
        }
        boolean z11 = i13 - i11 != i17 - i15;
        if (this.isMinimalMode || !z11) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.s
            @Override // java.lang.Runnable
            public final void run() {
                PlayerControlViewLayoutManager.this.onLayoutWidthChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutWidthChanged() {
        int i11;
        if (this.basicControls == null || this.extraControls == null) {
            return;
        }
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        while (true) {
            if (this.extraControls.getChildCount() <= 1) {
                break;
            }
            int childCount = this.extraControls.getChildCount() - 2;
            View childAt = this.extraControls.getChildAt(childCount);
            this.extraControls.removeViewAt(childCount);
            this.basicControls.addView(childAt, 0);
        }
        View view = this.overflowShowButton;
        if (view != null) {
            view.setVisibility(8);
        }
        int widthWithMargins = getWidthWithMargins(this.timeView);
        int childCount2 = this.basicControls.getChildCount() - 1;
        for (int i12 = 0; i12 < childCount2; i12++) {
            widthWithMargins += getWidthWithMargins(this.basicControls.getChildAt(i12));
        }
        if (widthWithMargins <= width) {
            ViewGroup viewGroup = this.extraControlsScrollView;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.overflowHideAnimator.isStarted()) {
                return;
            }
            this.overflowShowAnimator.cancel();
            this.overflowHideAnimator.start();
            return;
        }
        View view2 = this.overflowShowButton;
        if (view2 != null) {
            view2.setVisibility(0);
            widthWithMargins += getWidthWithMargins(this.overflowShowButton);
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = this.basicControls.getChildAt(i13);
            widthWithMargins -= getWidthWithMargins(childAt2);
            arrayList.add(childAt2);
            if (widthWithMargins <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.basicControls.removeViews(0, arrayList.size());
        for (i11 = 0; i11 < arrayList.size(); i11++) {
            this.extraControls.addView((View) arrayList.get(i11), this.extraControls.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOverflowButtonClick(View view) {
        resetHideCallbacks();
        if (view.getId() == R.id.exo_overflow_show) {
            this.overflowShowAnimator.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            this.overflowHideAnimator.start();
        }
    }

    private void postDelayedRunnable(Runnable runnable, long j11) {
        if (j11 >= 0) {
            this.playerControlView.postDelayed(runnable, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUxState(int i11) {
        int i12 = this.uxState;
        this.uxState = i11;
        if (i11 == 2) {
            this.playerControlView.setVisibility(8);
        } else if (i12 == 2) {
            this.playerControlView.setVisibility(0);
        }
        if (i12 != i11) {
            this.playerControlView.notifyOnVisibilityChange();
        }
    }

    private boolean shouldHideInMinimalMode(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAllBars() {
        if (!this.animationEnabled) {
            setUxState(0);
            resetHideCallbacks();
            return;
        }
        int i11 = this.uxState;
        if (i11 == 1) {
            this.showMainBarAnimator.start();
        } else if (i11 == 2) {
            this.showAllBarsAnimator.start();
        } else if (i11 == 3) {
            this.needToShowBars = true;
        } else if (i11 == 4) {
            return;
        }
        resetHideCallbacks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayoutForSizeChange() {
        ViewGroup viewGroup = this.minimalControls;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.isMinimalMode ? 0 : 4);
        }
        if (this.timeBar != null) {
            int dimensionPixelSize = this.playerControlView.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.timeBar.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.isMinimalMode) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.timeBar.setLayoutParams(marginLayoutParams);
            }
            View view = this.timeBar;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.isMinimalMode) {
                    defaultTimeBar.hideScrubber(true);
                } else {
                    int i11 = this.uxState;
                    if (i11 == 1) {
                        defaultTimeBar.hideScrubber(false);
                    } else if (i11 != 3) {
                        defaultTimeBar.showScrubber();
                    }
                }
            }
        }
        for (View view2 : this.shownButtons) {
            view2.setVisibility((this.isMinimalMode && shouldHideInMinimalMode(view2)) ? 4 : 0);
        }
    }

    private boolean useMinimalMode() {
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        int height = (this.playerControlView.getHeight() - this.playerControlView.getPaddingBottom()) - this.playerControlView.getPaddingTop();
        int widthWithMargins = getWidthWithMargins(this.centerControls);
        ViewGroup viewGroup = this.centerControls;
        int paddingLeft = widthWithMargins - (viewGroup != null ? viewGroup.getPaddingLeft() + this.centerControls.getPaddingRight() : 0);
        int heightWithMargins = getHeightWithMargins(this.centerControls);
        ViewGroup viewGroup2 = this.centerControls;
        return width <= Math.max(paddingLeft, getWidthWithMargins(this.timeView) + getWidthWithMargins(this.overflowShowButton)) || height <= (heightWithMargins - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.centerControls.getPaddingBottom() : 0)) + (getHeightWithMargins(this.bottomBar) * 2);
    }

    public boolean getShowButton(@Nullable View view) {
        return view != null && this.shownButtons.contains(view);
    }

    public void hide() {
        int i11 = this.uxState;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        removeHideCallbacks();
        if (!this.animationEnabled) {
            hideController();
        } else if (this.uxState == 1) {
            hideProgressBar();
        } else {
            hideAllBars();
        }
    }

    public void hideImmediately() {
        int i11 = this.uxState;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        removeHideCallbacks();
        hideController();
    }

    public boolean isAnimationEnabled() {
        return this.animationEnabled;
    }

    public boolean isFullyVisible() {
        return this.uxState == 0 && this.playerControlView.isVisible();
    }

    public void onAttachedToWindow() {
        this.playerControlView.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onDetachedFromWindow() {
        this.playerControlView.removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View view = this.controlsBackground;
        if (view != null) {
            view.layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    public void removeHideCallbacks() {
        this.playerControlView.removeCallbacks(this.hideControllerRunnable);
        this.playerControlView.removeCallbacks(this.hideAllBarsRunnable);
        this.playerControlView.removeCallbacks(this.hideMainBarRunnable);
        this.playerControlView.removeCallbacks(this.hideProgressBarRunnable);
    }

    public void resetHideCallbacks() {
        if (this.uxState == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.playerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.animationEnabled) {
                postDelayedRunnable(this.hideControllerRunnable, showTimeoutMs);
            } else if (this.uxState == 1) {
                postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
            } else {
                postDelayedRunnable(this.hideMainBarRunnable, showTimeoutMs);
            }
        }
    }

    public void setAnimationEnabled(boolean z11) {
        this.animationEnabled = z11;
    }

    public void setShowButton(@Nullable View view, boolean z11) {
        if (view == null) {
            return;
        }
        if (!z11) {
            view.setVisibility(8);
            this.shownButtons.remove(view);
            return;
        }
        if (this.isMinimalMode && shouldHideInMinimalMode(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.shownButtons.add(view);
    }

    public void show() {
        if (!this.playerControlView.isVisible()) {
            this.playerControlView.setVisibility(0);
            this.playerControlView.updateAll();
            this.playerControlView.requestPlayPauseFocus();
        }
        showAllBars();
    }
}
