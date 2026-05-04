package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import c40.b2;
import c40.l2;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@InternalComposeUiApi
/* loaded from: classes2.dex */
public final class WindowRecomposerPolicy {

    @m80.k
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();

    @m80.k
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    @yz.v0
    public final boolean compareAndSetFactory(@m80.k WindowRecomposerFactory windowRecomposerFactory, @m80.k WindowRecomposerFactory windowRecomposerFactory2) {
        return androidx.camera.view.q.a(factory, windowRecomposerFactory, windowRecomposerFactory2);
    }

    @m80.k
    public final Recomposer createAndInstallWindowRecomposer$ui_release(@m80.k View view) {
        final l2 f11;
        Recomposer createRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, createRecomposer);
        f11 = c40.k.f(b2.f7824a, d40.g.i(view.getHandler(), "windowRecomposer cleanup").q(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, view, null), 2, null);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                l2.a.b(l2.this, null, 1, null);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }
        });
        return createRecomposer;
    }

    @yz.v0
    @m80.k
    public final WindowRecomposerFactory getAndSetFactory(@m80.k WindowRecomposerFactory windowRecomposerFactory) {
        return factory.getAndSet(windowRecomposerFactory);
    }

    public final void setFactory(@m80.k WindowRecomposerFactory windowRecomposerFactory) {
        factory.set(windowRecomposerFactory);
    }

    public final <R> R withFactory(@m80.k WindowRecomposerFactory windowRecomposerFactory, @m80.k x00.a<? extends R> aVar) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R invoke = aVar.invoke();
            kotlin.jvm.internal.d0.d(1);
            if (!compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            kotlin.jvm.internal.d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.d0.d(1);
                if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    kotlin.jvm.internal.d0.c(1);
                    throw th3;
                }
                yz.r.a(th2, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th2;
            }
        }
    }
}
