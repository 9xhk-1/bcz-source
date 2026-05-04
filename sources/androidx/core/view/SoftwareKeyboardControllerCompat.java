package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SoftwareKeyboardControllerCompat {
    private final Impl mImpl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(20)
    public static class Impl20 extends Impl {

        @Nullable
        private final View mView;

        public Impl20(@Nullable View view) {
            this.mView = view;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void hide() {
            View view = this.mView;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void show() {
            final View view = this.mView;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.mView.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.x
                @Override // java.lang.Runnable
                public final void run() {
                    ((InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    public SoftwareKeyboardControllerCompat(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(view);
        } else {
            this.mImpl = new Impl20(view);
        }
    }

    public void hide() {
        this.mImpl.hide();
    }

    public void show() {
        this.mImpl.show();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Impl30 extends Impl20 {

        @Nullable
        private View mView;

        @Nullable
        private WindowInsetsController mWindowInsetsController;

        public Impl30(@NonNull View view) {
            super(view);
            this.mView = view;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void hide() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view2 = this.mView;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.hide();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.d0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i11) {
                    atomicBoolean.set((r2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.mView) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        public void show() {
            int ime;
            View view = this.mView;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view2 = this.mView;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.show();
        }

        public Impl30(@Nullable WindowInsetsController windowInsetsController) {
            super(null);
            this.mWindowInsetsController = windowInsetsController;
        }
    }

    @RequiresApi(30)
    @Deprecated
    public SoftwareKeyboardControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Impl {
        public void hide() {
        }

        public void show() {
        }
    }
}
