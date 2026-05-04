package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.media3.common.C;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final Impl mImpl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Impl23 extends Impl20 {
        public Impl23(@NonNull Window window, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            return (this.mWindow.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z11) {
            if (!z11) {
                unsetSystemUiFlag(8192);
                return;
            }
            unsetWindowFlag(67108864);
            setWindowFlag(Integer.MIN_VALUE);
            setSystemUiFlag(8192);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Impl26 extends Impl23 {
        public Impl26(@NonNull Window window, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            return (this.mWindow.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z11) {
            if (!z11) {
                unsetSystemUiFlag(16);
                return;
            }
            unsetWindowFlag(C.BUFFER_FLAG_FIRST_SAMPLE);
            setWindowFlag(Integer.MIN_VALUE);
            setSystemUiFlag(16);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(@NonNull WindowInsetsControllerCompat windowInsetsControllerCompat, int i11);
    }

    @RequiresApi(30)
    @Deprecated
    private WindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
    }

    @NonNull
    @RequiresApi(30)
    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public void controlWindowInsetsAnimation(int i11, long j11, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        this.mImpl.controlWindowInsetsAnimation(i11, j11, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
    }

    @SuppressLint({"WrongConstant"})
    public int getSystemBarsBehavior() {
        return this.mImpl.getSystemBarsBehavior();
    }

    public void hide(int i11) {
        this.mImpl.hide(i11);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.mImpl.isAppearanceLightNavigationBars();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.mImpl.isAppearanceLightStatusBars();
    }

    public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public void setAppearanceLightNavigationBars(boolean z11) {
        this.mImpl.setAppearanceLightNavigationBars(z11);
    }

    public void setAppearanceLightStatusBars(boolean z11) {
        this.mImpl.setAppearanceLightStatusBars(z11);
    }

    public void setSystemBarsBehavior(int i11) {
        this.mImpl.setSystemBarsBehavior(i11);
    }

    public void show(int i11) {
        this.mImpl.show(i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Impl30 extends Impl {
        final WindowInsetsControllerCompat mCompatController;
        final WindowInsetsController mInsetsController;
        private final SimpleArrayMap<OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected Window mWindow;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Impl30(@androidx.annotation.NonNull android.view.Window r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat r3, @androidx.annotation.NonNull androidx.core.view.SoftwareKeyboardControllerCompat r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.e2.a(r2)
                r1.<init>(r0, r3, r4)
                r1.mWindow = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.WindowInsetsControllerCompat.Impl30.<init>(android.view.Window, androidx.core.view.WindowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat):void");
        }

        public static /* synthetic */ void a(Impl30 impl30, OnControllableInsetsChangedListener onControllableInsetsChangedListener, WindowInsetsController windowInsetsController, int i11) {
            if (impl30.mInsetsController == windowInsetsController) {
                onControllableInsetsChangedListener.onControllableInsetsChanged(impl30.mCompatController, i11);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void addOnControllableInsetsChangedListener(@NonNull final OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            if (this.mListeners.containsKey(onControllableInsetsChangedListener)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener2 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.i2
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i11) {
                    WindowInsetsControllerCompat.Impl30.a(WindowInsetsControllerCompat.Impl30.this, onControllableInsetsChangedListener, windowInsetsController, i11);
                }
            };
            this.mListeners.put(onControllableInsetsChangedListener, onControllableInsetsChangedListener2);
            this.mInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener2);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void controlWindowInsetsAnimation(int i11, long j11, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull final WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            this.mInsetsController.controlWindowInsetsAnimation(i11, j11, interpolator, cancellationSignal, new WindowInsetsAnimationControlListener() { // from class: androidx.core.view.WindowInsetsControllerCompat.Impl30.1
                private WindowInsetsAnimationControllerCompat mCompatAnimController = null;

                public void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onCancelled(windowInsetsAnimationController == null ? null : this.mCompatAnimController);
                }

                public void onFinished(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onFinished(this.mCompatAnimController);
                }

                public void onReady(@NonNull WindowInsetsAnimationController windowInsetsAnimationController, int i12) {
                    WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                    this.mCompatAnimController = windowInsetsAnimationControllerCompat;
                    windowInsetsAnimationControlListenerCompat.onReady(windowInsetsAnimationControllerCompat, i12);
                }
            });
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        @SuppressLint({"WrongConstant"})
        public int getSystemBarsBehavior() {
            int systemBarsBehavior;
            systemBarsBehavior = this.mInsetsController.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void hide(int i11) {
            if ((i11 & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.hide();
            }
            this.mInsetsController.hide(i11 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            int systemBarsAppearance;
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.mInsetsController.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            int systemBarsAppearance;
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.mInsetsController.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            WindowInsetsController.OnControllableInsetsChangedListener a11 = g2.a(this.mListeners.remove(onControllableInsetsChangedListener));
            if (a11 != null) {
                this.mInsetsController.removeOnControllableInsetsChangedListener(a11);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z11) {
            if (z11) {
                if (this.mWindow != null) {
                    setSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(16, 16);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z11) {
            if (z11) {
                if (this.mWindow != null) {
                    setSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setSystemBarsBehavior(int i11) {
            this.mInsetsController.setSystemBarsBehavior(i11);
        }

        public void setSystemUiFlag(int i11) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void show(int i11) {
            if ((i11 & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.show();
            }
            this.mInsetsController.show(i11 & (-9));
        }

        public void unsetSystemUiFlag(int i11) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        public Impl30(@NonNull WindowInsetsController windowInsetsController, @NonNull WindowInsetsControllerCompat windowInsetsControllerCompat, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mListeners = new SimpleArrayMap<>();
            this.mInsetsController = windowInsetsController;
            this.mCompatController = windowInsetsControllerCompat;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }
    }

    public WindowInsetsControllerCompat(@NonNull Window window, @NonNull View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.mImpl = new Impl30(window, this, softwareKeyboardControllerCompat);
        } else if (i11 >= 26) {
            this.mImpl = new Impl26(window, softwareKeyboardControllerCompat);
        } else {
            this.mImpl = new Impl23(window, softwareKeyboardControllerCompat);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Impl {
        public int getSystemBarsBehavior() {
            return 0;
        }

        public boolean isAppearanceLightNavigationBars() {
            return false;
        }

        public boolean isAppearanceLightStatusBars() {
            return false;
        }

        public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        public void hide(int i11) {
        }

        public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        public void setAppearanceLightNavigationBars(boolean z11) {
        }

        public void setAppearanceLightStatusBars(boolean z11) {
        }

        public void setSystemBarsBehavior(int i11) {
        }

        public void show(int i11) {
        }

        public void controlWindowInsetsAnimation(int i11, long j11, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(20)
    public static class Impl20 extends Impl {

        @NonNull
        private final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;

        @NonNull
        protected final Window mWindow;

        public Impl20(@NonNull Window window, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mWindow = window;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        private void hideForType(int i11) {
            if (i11 == 1) {
                setSystemUiFlag(4);
            } else if (i11 == 2) {
                setSystemUiFlag(2);
            } else {
                if (i11 != 8) {
                    return;
                }
                this.mSoftwareKeyboardControllerCompat.hide();
            }
        }

        private void showForType(int i11) {
            if (i11 == 1) {
                unsetSystemUiFlag(4);
                unsetWindowFlag(1024);
            } else if (i11 == 2) {
                unsetSystemUiFlag(2);
            } else {
                if (i11 != 8) {
                    return;
                }
                this.mSoftwareKeyboardControllerCompat.show();
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public int getSystemBarsBehavior() {
            return 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void hide(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    hideForType(i12);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setSystemBarsBehavior(int i11) {
            if (i11 == 0) {
                unsetSystemUiFlag(com.badlogic.gdx.graphics.g.f11731e5);
                return;
            }
            if (i11 == 1) {
                unsetSystemUiFlag(4096);
                setSystemUiFlag(2048);
            } else {
                if (i11 != 2) {
                    return;
                }
                unsetSystemUiFlag(2048);
                setSystemUiFlag(4096);
            }
        }

        public void setSystemUiFlag(int i11) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        public void setWindowFlag(int i11) {
            this.mWindow.addFlags(i11);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void show(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    showForType(i12);
                }
            }
        }

        public void unsetSystemUiFlag(int i11) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        public void unsetWindowFlag(int i11) {
            this.mWindow.clearFlags(i11);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void controlWindowInsetsAnimation(int i11, long j11, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }
    }
}
