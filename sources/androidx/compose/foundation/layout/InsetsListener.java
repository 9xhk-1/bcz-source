package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {

    @m80.k
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private boolean runningAnimation;

    @l
    private WindowInsetsCompat savedInsets;

    public InsetsListener(@m80.k WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.getConsumes() ? 1 : 0);
        this.composeInsets = windowInsetsHolder;
    }

    @m80.k
    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    @l
    public final WindowInsetsCompat getSavedInsets() {
        return this.savedInsets;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @m80.k
    public WindowInsetsCompat onApplyWindowInsets(@m80.k View view, @m80.k WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
        this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? WindowInsetsCompat.CONSUMED : windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(@m80.k WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = false;
        this.runningAnimation = false;
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        if (windowInsetsAnimationCompat.getDurationMillis() != 0 && windowInsetsCompat != null) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        }
        this.savedInsets = null;
        super.onEnd(windowInsetsAnimationCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(@m80.k WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = true;
        this.runningAnimation = true;
        super.onPrepare(windowInsetsAnimationCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @m80.k
    public WindowInsetsCompat onProgress(@m80.k WindowInsetsCompat windowInsetsCompat, @m80.k List<WindowInsetsAnimationCompat> list) {
        WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        return this.composeInsets.getConsumes() ? WindowInsetsCompat.CONSUMED : windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @m80.k
    public WindowInsetsAnimationCompat.BoundsCompat onStart(@m80.k WindowInsetsAnimationCompat windowInsetsAnimationCompat, @m80.k WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.prepared = false;
        return super.onStart(windowInsetsAnimationCompat, boundsCompat);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@m80.k View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
                WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    public final void setPrepared(boolean z11) {
        this.prepared = z11;
    }

    public final void setRunningAnimation(boolean z11) {
        this.runningAnimation = z11;
    }

    public final void setSavedInsets(@l WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@m80.k View view) {
    }
}
