package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.ThemeUtils;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes2.dex */
public final class SplashScreen {

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final float MASK_FACTOR = 0.6666667f;

    @m80.k
    private final Impl impl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final SplashScreen installSplashScreen(@m80.k Activity activity) {
            g0.p(activity, "<this>");
            SplashScreen splashScreen = new SplashScreen(activity, null);
            splashScreen.install();
            return splashScreen;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Impl {

        @m80.k
        private final Activity activity;

        @m80.l
        private OnExitAnimationListener animationListener;

        @m80.l
        private Integer backgroundColor;

        @m80.l
        private Integer backgroundResId;
        private int finalThemeId;
        private boolean hasBackground;

        @m80.l
        private Drawable icon;

        @m80.l
        private SplashScreenViewProvider mSplashScreenViewProvider;

        @m80.k
        private KeepOnScreenCondition splashScreenWaitPredicate;

        public Impl(@m80.k Activity activity) {
            g0.p(activity, "activity");
            this.activity = activity;
            this.splashScreenWaitPredicate = new KeepOnScreenCondition() { // from class: androidx.core.splashscreen.a
                @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
                public final boolean shouldKeepOnScreen() {
                    boolean m5604splashScreenWaitPredicate$lambda0;
                    m5604splashScreenWaitPredicate$lambda0 = SplashScreen.Impl.m5604splashScreenWaitPredicate$lambda0();
                    return m5604splashScreenWaitPredicate$lambda0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: dispatchOnExitAnimation$lambda-3, reason: not valid java name */
        public static final void m5603dispatchOnExitAnimation$lambda3(SplashScreenViewProvider splashScreenViewProvider, OnExitAnimationListener finalListener) {
            g0.p(splashScreenViewProvider, "$splashScreenViewProvider");
            g0.p(finalListener, "$finalListener");
            splashScreenViewProvider.getView().bringToFront();
            finalListener.onSplashScreenExit(splashScreenViewProvider);
        }

        private final void displaySplashScreenIcon(View view, Drawable drawable) {
            float dimension;
            ImageView imageView = (ImageView) view.findViewById(R.id.splashscreen_icon_view);
            if (this.hasBackground) {
                Drawable drawable2 = imageView.getContext().getDrawable(R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawable2 != null) {
                    imageView.setBackground(new MaskedDrawable(drawable2, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new MaskedDrawable(drawable, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: splashScreenWaitPredicate$lambda-0, reason: not valid java name */
        public static final boolean m5604splashScreenWaitPredicate$lambda0() {
            return false;
        }

        public final void dispatchOnExitAnimation(@m80.k final SplashScreenViewProvider splashScreenViewProvider) {
            g0.p(splashScreenViewProvider, "splashScreenViewProvider");
            final OnExitAnimationListener onExitAnimationListener = this.animationListener;
            if (onExitAnimationListener == null) {
                return;
            }
            this.animationListener = null;
            splashScreenViewProvider.getView().postOnAnimation(new Runnable() { // from class: androidx.core.splashscreen.b
                @Override // java.lang.Runnable
                public final void run() {
                    SplashScreen.Impl.m5603dispatchOnExitAnimation$lambda3(SplashScreenViewProvider.this, onExitAnimationListener);
                }
            });
        }

        @m80.k
        public final Activity getActivity() {
            return this.activity;
        }

        @m80.l
        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        @m80.l
        public final Integer getBackgroundResId() {
            return this.backgroundResId;
        }

        public final int getFinalThemeId() {
            return this.finalThemeId;
        }

        public final boolean getHasBackground() {
            return this.hasBackground;
        }

        @m80.l
        public final Drawable getIcon() {
            return this.icon;
        }

        @m80.k
        public final KeepOnScreenCondition getSplashScreenWaitPredicate() {
            return this.splashScreenWaitPredicate;
        }

        public void install() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.activity.getTheme();
            if (currentTheme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.backgroundResId = Integer.valueOf(typedValue.resourceId);
                this.backgroundColor = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.icon = currentTheme.getDrawable(typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
                this.hasBackground = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
            }
            g0.o(currentTheme, "currentTheme");
            setPostSplashScreenTheme(currentTheme, typedValue);
        }

        public final void setBackgroundColor(@m80.l Integer num) {
            this.backgroundColor = num;
        }

        public final void setBackgroundResId(@m80.l Integer num) {
            this.backgroundResId = num;
        }

        public final void setFinalThemeId(int i11) {
            this.finalThemeId = i11;
        }

        public final void setHasBackground(boolean z11) {
            this.hasBackground = z11;
        }

        public final void setIcon(@m80.l Drawable drawable) {
            this.icon = drawable;
        }

        public void setKeepOnScreenCondition(@m80.k KeepOnScreenCondition keepOnScreenCondition) {
            g0.p(keepOnScreenCondition, "keepOnScreenCondition");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
            final View findViewById = this.activity.findViewById(android.R.id.content);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    SplashScreenViewProvider splashScreenViewProvider;
                    if (SplashScreen.Impl.this.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    splashScreenViewProvider = SplashScreen.Impl.this.mSplashScreenViewProvider;
                    if (splashScreenViewProvider == null) {
                        return true;
                    }
                    SplashScreen.Impl.this.dispatchOnExitAnimation(splashScreenViewProvider);
                    return true;
                }
            });
        }

        public void setOnExitAnimationListener(@m80.k OnExitAnimationListener exitAnimationListener) {
            g0.p(exitAnimationListener, "exitAnimationListener");
            this.animationListener = exitAnimationListener;
            final SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(this.activity);
            Integer num = this.backgroundResId;
            Integer num2 = this.backgroundColor;
            View view = splashScreenViewProvider.getView();
            if (num != null && num.intValue() != 0) {
                view.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                view.setBackgroundColor(num2.intValue());
            } else {
                view.setBackground(this.activity.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.icon;
            if (drawable != null) {
                displaySplashScreenIcon(view, drawable);
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@m80.k View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    g0.p(view2, "view");
                    if (view2.isAttachedToWindow()) {
                        view2.removeOnLayoutChangeListener(this);
                        if (!SplashScreen.Impl.this.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                            SplashScreen.Impl.this.dispatchOnExitAnimation(splashScreenViewProvider);
                        } else {
                            SplashScreen.Impl.this.mSplashScreenViewProvider = splashScreenViewProvider;
                        }
                    }
                }
            });
        }

        public final void setPostSplashScreenTheme(@m80.k Resources.Theme currentTheme, @m80.k TypedValue typedValue) {
            g0.p(currentTheme, "currentTheme");
            g0.p(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true)) {
                int i11 = typedValue.resourceId;
                this.finalThemeId = i11;
                if (i11 != 0) {
                    this.activity.setTheme(i11);
                }
            }
        }

        public final void setSplashScreenWaitPredicate(@m80.k KeepOnScreenCondition keepOnScreenCondition) {
            g0.p(keepOnScreenCondition, "<set-?>");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class Impl31 extends Impl {

        @m80.k
        private final ViewGroup.OnHierarchyChangeListener hierarchyListener;
        private boolean mDecorFitWindowInsets;

        @m80.l
        private ViewTreeObserver.OnPreDrawListener preDrawListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl31(@m80.k final Activity activity) {
            super(activity);
            g0.p(activity, "activity");
            this.mDecorFitWindowInsets = true;
            this.hierarchyListener = new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(@m80.l View view, @m80.l View view2) {
                    if (j.a(view2)) {
                        SplashScreen.Impl31 impl31 = SplashScreen.Impl31.this;
                        impl31.setMDecorFitWindowInsets(impl31.computeDecorFitsWindow(k.a(view2)));
                        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(@m80.l View view, @m80.l View view2) {
                }
            };
        }

        private final void applyAppSystemUiTheme() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = getActivity().getTheme();
            Window window = getActivity().getWindow();
            if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            if (theme.resolveAttribute(android.R.attr.enforceNavigationBarContrast, typedValue, true)) {
                window.setNavigationBarContrastEnforced(typedValue.data != 0);
            }
            if (theme.resolveAttribute(android.R.attr.enforceStatusBarContrast, typedValue, true)) {
                window.setStatusBarContrastEnforced(typedValue.data != 0);
            }
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            g0.o(theme, "theme");
            ThemeUtils.Api31.applyThemesSystemBarAppearance(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.mDecorFitWindowInsets);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnExitAnimationListener$lambda-0, reason: not valid java name */
        public static final void m5605setOnExitAnimationListener$lambda0(Impl31 this$0, OnExitAnimationListener exitAnimationListener, SplashScreenView splashScreenView) {
            g0.p(this$0, "this$0");
            g0.p(exitAnimationListener, "$exitAnimationListener");
            g0.p(splashScreenView, "splashScreenView");
            this$0.applyAppSystemUiTheme();
            exitAnimationListener.onSplashScreenExit(new SplashScreenViewProvider(splashScreenView, this$0.getActivity()));
        }

        public final boolean computeDecorFitsWindow(@m80.k SplashScreenView child) {
            WindowInsets build;
            View rootView;
            g0.p(child, "child");
            build = h.a().build();
            g0.o(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = child.getRootView();
            return (build == rootView.computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
        }

        @m80.k
        public final ViewGroup.OnHierarchyChangeListener getHierarchyListener() {
            return this.hierarchyListener;
        }

        public final boolean getMDecorFitWindowInsets() {
            return this.mDecorFitWindowInsets;
        }

        @m80.l
        public final ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
            return this.preDrawListener;
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void install() {
            Resources.Theme theme = getActivity().getTheme();
            g0.o(theme, "activity.theme");
            setPostSplashScreenTheme(theme, new TypedValue());
            ((ViewGroup) getActivity().getWindow().getDecorView()).setOnHierarchyChangeListener(this.hierarchyListener);
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setKeepOnScreenCondition(@m80.k KeepOnScreenCondition keepOnScreenCondition) {
            g0.p(keepOnScreenCondition, "keepOnScreenCondition");
            setSplashScreenWaitPredicate(keepOnScreenCondition);
            final View findViewById = getActivity().findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (this.preDrawListener != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
            }
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (SplashScreen.Impl31.this.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            };
            this.preDrawListener = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }

        public final void setMDecorFitWindowInsets(boolean z11) {
            this.mDecorFitWindowInsets = z11;
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setOnExitAnimationListener(@m80.k final OnExitAnimationListener exitAnimationListener) {
            android.window.SplashScreen splashScreen;
            g0.p(exitAnimationListener, "exitAnimationListener");
            splashScreen = getActivity().getSplashScreen();
            splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: androidx.core.splashscreen.i
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    SplashScreen.Impl31.m5605setOnExitAnimationListener$lambda0(SplashScreen.Impl31.this, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final void setPreDrawListener(@m80.l ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.preDrawListener = onPreDrawListener;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface KeepOnScreenCondition {
        @MainThread
        boolean shouldKeepOnScreen();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnExitAnimationListener {
        @MainThread
        void onSplashScreenExit(@m80.k SplashScreenViewProvider splashScreenViewProvider);
    }

    public /* synthetic */ SplashScreen(Activity activity, v vVar) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void install() {
        this.impl.install();
    }

    @w00.o
    @m80.k
    public static final SplashScreen installSplashScreen(@m80.k Activity activity) {
        return Companion.installSplashScreen(activity);
    }

    public final void setKeepOnScreenCondition(@m80.k KeepOnScreenCondition condition) {
        g0.p(condition, "condition");
        this.impl.setKeepOnScreenCondition(condition);
    }

    public final void setOnExitAnimationListener(@m80.k OnExitAnimationListener listener) {
        g0.p(listener, "listener");
        this.impl.setOnExitAnimationListener(listener);
    }

    private SplashScreen(Activity activity) {
        this.impl = Build.VERSION.SDK_INT >= 31 ? new Impl31(activity) : new Impl(activity);
    }
}
