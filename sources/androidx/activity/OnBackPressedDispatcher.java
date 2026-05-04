package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n1747#2,3:403\n533#2,6:406\n533#2,6:412\n533#2,6:418\n533#2,6:424\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n109#1:403,3\n221#1:406,6\n240#1:412,6\n257#1:418,6\n274#1:424,6\n*E\n"})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;

    @m80.l
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;

    @m80.l
    private OnBackPressedCallback inProgressCallback;

    @m80.l
    private OnBackInvokedDispatcher invokedDispatcher;

    @m80.l
    private OnBackInvokedCallback onBackInvokedCallback;

    @m80.k
    private final a00.m<OnBackPressedCallback> onBackPressedCallbacks;

    @m80.l
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(33)
    public static final class Api33Impl {

        @m80.k
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @m80.k
        public final OnBackInvokedCallback createOnBackInvokedCallback(@m80.k final x00.a<g2> onBackInvoked) {
            g0.p(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.s
                public final void onBackInvoked() {
                    x00.a.this.invoke();
                }
            };
        }

        public final void registerOnBackInvokedCallback(@m80.k Object dispatcher, int i11, @m80.k Object callback) {
            g0.p(dispatcher, "dispatcher");
            g0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i11, (OnBackInvokedCallback) callback);
        }

        public final void unregisterOnBackInvokedCallback(@m80.k Object dispatcher, @m80.k Object callback) {
            g0.p(dispatcher, "dispatcher");
            g0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static final class Api34Impl {

        @m80.k
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @m80.k
        public final OnBackInvokedCallback createOnBackAnimationCallback(@m80.k final x00.l<? super BackEventCompat, g2> onBackStarted, @m80.k final x00.l<? super BackEventCompat, g2> onBackProgressed, @m80.k final x00.a<g2> onBackInvoked, @m80.k final x00.a<g2> onBackCancelled) {
            g0.p(onBackStarted, "onBackStarted");
            g0.p(onBackProgressed, "onBackProgressed");
            g0.p(onBackInvoked, "onBackInvoked");
            g0.p(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                public void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    g0.p(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                public void onBackStarted(BackEvent backEvent) {
                    g0.p(backEvent, "backEvent");
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        @m80.l
        private Cancellable currentCancellable;

        @m80.k
        private final Lifecycle lifecycle;

        @m80.k
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(@m80.k OnBackPressedDispatcher onBackPressedDispatcher, @m80.k Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            g0.p(lifecycle, "lifecycle");
            g0.p(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@m80.k LifecycleOwner source, @m80.k Lifecycle.Event event) {
            g0.p(source, "source");
            g0.p(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class OnBackPressedCancellable implements Cancellable {

        @m80.k
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(@m80.k OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            g0.p(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (g0.g(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            x00.a<g2> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            a00.m<OnBackPressedCallback> mVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = mVar.listIterator(mVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = null;
                    break;
                } else {
                    onBackPressedCallback = listIterator.previous();
                    if (onBackPressedCallback.isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            a00.m<OnBackPressedCallback> mVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = mVar.listIterator(mVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = null;
                    break;
                } else {
                    onBackPressedCallback = listIterator.previous();
                    if (onBackPressedCallback.isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackProgressed(backEventCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackStarted(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallback;
        a00.m<OnBackPressedCallback> mVar = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallback = null;
                break;
            } else {
                onBackPressedCallback = listIterator.previous();
                if (onBackPressedCallback.isEnabled()) {
                    break;
                }
            }
        }
        OnBackPressedCallback onBackPressedCallback2 = onBackPressedCallback;
        if (this.inProgressCallback != null) {
            onBackCancelled();
        }
        this.inProgressCallback = onBackPressedCallback2;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackStarted(backEventCompat);
        }
    }

    @RequiresApi(33)
    private final void updateBackInvokedCallbackState(boolean z11) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z11 && !this.backInvokedCallbackRegistered) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (z11 || !this.backInvokedCallbackRegistered) {
                return;
            }
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z11 = this.hasEnabledCallbacks;
        a00.m<OnBackPressedCallback> mVar = this.onBackPressedCallbacks;
        boolean z12 = false;
        if (mVar == null || !mVar.isEmpty()) {
            Iterator<OnBackPressedCallback> it = mVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isEnabled()) {
                    z12 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z12;
        if (z12 != z11) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z12));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z12);
            }
        }
    }

    @MainThread
    public final void addCallback(@m80.k OnBackPressedCallback onBackPressedCallback) {
        g0.p(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    @MainThread
    @m80.k
    public final Cancellable addCancellableCallback$activity_release(@m80.k OnBackPressedCallback onBackPressedCallback) {
        g0.p(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackProgressed(@m80.k BackEventCompat backEvent) {
        g0.p(backEvent, "backEvent");
        onBackProgressed(backEvent);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackStarted(@m80.k BackEventCompat backEvent) {
        g0.p(backEvent, "backEvent");
        onBackStarted(backEvent);
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            a00.m<OnBackPressedCallback> mVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = mVar.listIterator(mVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = null;
                    break;
                } else {
                    onBackPressedCallback = listIterator.previous();
                    if (onBackPressedCallback.isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(@m80.k OnBackInvokedDispatcher invoker) {
        g0.p(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(@m80.l Runnable runnable, @m80.l Consumer<Boolean> consumer) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new a00.m<>();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.onBackInvokedCallback = i11 >= 34 ? Api34Impl.INSTANCE.createOnBackAnimationCallback(new x00.l<BackEventCompat, g2>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(BackEventCompat backEventCompat) {
                    invoke2(backEventCompat);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BackEventCompat backEvent) {
                    g0.p(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.onBackStarted(backEvent);
                }
            }, new x00.l<BackEventCompat, g2>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(BackEventCompat backEventCompat) {
                    invoke2(backEventCompat);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BackEventCompat backEvent) {
                    g0.p(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.onBackProgressed(backEvent);
                }
            }, new x00.a<g2>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.onBackPressed();
                }
            }, new x00.a<g2>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.onBackCancelled();
                }
            }) : Api33Impl.INSTANCE.createOnBackInvokedCallback(new x00.a<g2>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.onBackPressed();
                }
            });
        }
    }

    @MainThread
    public final void addCallback(@m80.k LifecycleOwner owner, @m80.k OnBackPressedCallback onBackPressedCallback) {
        g0.p(owner, "owner");
        g0.p(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
    }

    @w00.k
    public OnBackPressedDispatcher(@m80.l Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : runnable);
    }
}
