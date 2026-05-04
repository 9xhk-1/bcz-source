package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import androidx.annotation.RequiresApi;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.core.splashscreen.ThemeUtils;
import java.time.Duration;
import java.time.Instant;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SplashScreenViewProvider {

    @m80.k
    private final ViewImpl impl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ViewImpl {

        @m80.k
        private final c0 _splashScreenView$delegate;

        @m80.k
        private final Activity activity;

        public ViewImpl(@m80.k Activity activity) {
            g0.p(activity, "activity");
            this.activity = activity;
            this._splashScreenView$delegate = e0.c(new x00.a<ViewGroup>() { // from class: androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl$_splashScreenView$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                @m80.k
                public final ViewGroup invoke() {
                    View inflate = View.inflate(SplashScreenViewProvider.ViewImpl.this.getActivity(), R.layout.splash_screen_view, null);
                    if (inflate != null) {
                        return (ViewGroup) inflate;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            });
        }

        private final ViewGroup get_splashScreenView() {
            return (ViewGroup) this._splashScreenView$delegate.getValue();
        }

        public void createSplashScreenView() {
            View rootView = ((ViewGroup) this.activity.findViewById(android.R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(get_splashScreenView());
            }
        }

        @m80.k
        public final Activity getActivity() {
            return this.activity;
        }

        public long getIconAnimationDurationMillis() {
            return 0L;
        }

        public long getIconAnimationStartMillis() {
            return 0L;
        }

        @m80.k
        public View getIconView() {
            View findViewById = getSplashScreenView().findViewById(R.id.splashscreen_icon_view);
            g0.o(findViewById, "splashScreenView.findVie…d.splashscreen_icon_view)");
            return findViewById;
        }

        @m80.k
        public ViewGroup getSplashScreenView() {
            return get_splashScreenView();
        }

        public void remove() {
            ViewParent parent = getSplashScreenView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(getSplashScreenView());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class ViewImpl31 extends ViewImpl {
        public SplashScreenView platformView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewImpl31(@m80.k Activity activity) {
            super(activity);
            g0.p(activity, "activity");
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationDurationMillis() {
            Duration iconAnimationDuration;
            long millis;
            iconAnimationDuration = getPlatformView().getIconAnimationDuration();
            if (iconAnimationDuration == null) {
                return 0L;
            }
            millis = iconAnimationDuration.toMillis();
            return millis;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationStartMillis() {
            Instant iconAnimationStart;
            long epochMilli;
            iconAnimationStart = getPlatformView().getIconAnimationStart();
            if (iconAnimationStart == null) {
                return 0L;
            }
            epochMilli = iconAnimationStart.toEpochMilli();
            return epochMilli;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        @m80.k
        public View getIconView() {
            View iconView;
            iconView = getPlatformView().getIconView();
            g0.m(iconView);
            return iconView;
        }

        @m80.k
        public final SplashScreenView getPlatformView() {
            SplashScreenView splashScreenView = this.platformView;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            g0.S("platformView");
            return null;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void remove() {
            getPlatformView().remove();
            Resources.Theme theme = getActivity().getTheme();
            g0.o(theme, "activity.theme");
            View decorView = getActivity().getWindow().getDecorView();
            g0.o(decorView, "activity.window.decorView");
            ThemeUtils.Api31.applyThemesSystemBarAppearance$default(theme, decorView, null, 4, null);
        }

        public final void setPlatformView(@m80.k SplashScreenView splashScreenView) {
            g0.p(splashScreenView, "<set-?>");
            this.platformView = splashScreenView;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        @m80.k
        public SplashScreenView getSplashScreenView() {
            return getPlatformView();
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void createSplashScreenView() {
        }
    }

    public SplashScreenViewProvider(@m80.k Activity ctx) {
        g0.p(ctx, "ctx");
        ViewImpl viewImpl31 = Build.VERSION.SDK_INT >= 31 ? new ViewImpl31(ctx) : new ViewImpl(ctx);
        viewImpl31.createSplashScreenView();
        this.impl = viewImpl31;
    }

    public final long getIconAnimationDurationMillis() {
        return this.impl.getIconAnimationDurationMillis();
    }

    public final long getIconAnimationStartMillis() {
        return this.impl.getIconAnimationStartMillis();
    }

    @m80.k
    public final View getIconView() {
        return this.impl.getIconView();
    }

    @m80.k
    public final View getView() {
        return this.impl.getSplashScreenView();
    }

    public final void remove() {
        this.impl.remove();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(31)
    public SplashScreenViewProvider(@m80.k SplashScreenView platformView, @m80.k Activity ctx) {
        this(ctx);
        g0.p(platformView, "platformView");
        g0.p(ctx, "ctx");
        ((ViewImpl31) this.impl).setPlatformView(platformView);
    }
}
