package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {

    @m80.k
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @m80.k
    private static final Companion Companion = new Companion(null);

    @m80.l
    private ViewModelStore _viewModelStore;

    @m80.k
    private final ActivityResultRegistry activityResultRegistry;

    @LayoutRes
    private int contentLayoutId;

    @m80.k
    private final ContextAwareHelper contextAwareHelper;

    @m80.k
    private final c0 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @m80.k
    private final c0 fullyDrawnReporter$delegate;

    @m80.k
    private final MenuHostHelper menuHostHelper;

    @m80.k
    private final AtomicInteger nextLocalRequestCode;

    @m80.k
    private final c0 onBackPressedDispatcher$delegate;

    @m80.k
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;

    @m80.k
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;

    @m80.k
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;

    @m80.k
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;

    @m80.k
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;

    @m80.k
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @m80.k
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;

    @m80.k
    private final SavedStateRegistryController savedStateRegistryController;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(33)
    public static final class Api33Impl {

        @m80.k
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @m80.k
        public final OnBackInvokedDispatcher getOnBackInvokedDispatcher(@m80.k Activity activity) {
            g0.p(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            g0.o(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NonConfigurationInstances {

        @m80.l
        private Object custom;

        @m80.l
        private ViewModelStore viewModelStore;

        @m80.l
        public final Object getCustom() {
            return this.custom;
        }

        @m80.l
        public final ViewModelStore getViewModelStore() {
            return this.viewModelStore;
        }

        public final void setCustom(@m80.l Object obj) {
            this.custom = obj;
        }

        public final void setViewModelStore(@m80.l ViewModelStore viewModelStore) {
            this.viewModelStore = viewModelStore;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(@m80.k View view);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {

        @m80.l
        private Runnable currentRunnable;
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        private boolean onDrawScheduled;

        public ReportFullyDrawnExecutorImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$0(ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
            Runnable runnable = reportFullyDrawnExecutorImpl.currentRunnable;
            if (runnable != null) {
                g0.m(runnable);
                runnable.run();
                reportFullyDrawnExecutorImpl.currentRunnable = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@m80.k Runnable runnable) {
            g0.p(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            g0.o(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0(ComponentActivity.ReportFullyDrawnExecutorImpl.this);
                    }
                });
            } else if (g0.g(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @m80.l
        public final Runnable getCurrentRunnable() {
            return this.currentRunnable;
        }

        public final long getEndWatchTimeMillis() {
            return this.endWatchTimeMillis;
        }

        public final boolean getOnDrawScheduled() {
            return this.onDrawScheduled;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().isFullyDrawnReported()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final void setCurrentRunnable(@m80.l Runnable runnable) {
            this.currentRunnable = runnable;
        }

        public final void setOnDrawScheduled(boolean z11) {
            this.onDrawScheduled = z11;
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(@m80.k View view) {
            g0.p(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.activity.a
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        SavedStateRegistryController create = SavedStateRegistryController.Companion.create(this);
        this.savedStateRegistryController = create;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = e0.c(new x00.a<FullyDrawnReporter>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final FullyDrawnReporter invoke() {
                ComponentActivity.ReportFullyDrawnExecutor reportFullyDrawnExecutor;
                reportFullyDrawnExecutor = ComponentActivity.this.reportFullyDrawnExecutor;
                final ComponentActivity componentActivity = ComponentActivity.this;
                return new FullyDrawnReporter(reportFullyDrawnExecutor, new x00.a<g2>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2.1
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
                        ComponentActivity.this.reportFullyDrawn();
                    }
                });
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ComponentActivity$activityResultRegistry$1(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$2(ComponentActivity.this, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$3(ComponentActivity.this, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                g0.p(source, "source");
                g0.p(event, "event");
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        create.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.d
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle _init_$lambda$4;
                _init_$lambda$4 = ComponentActivity._init_$lambda$4(ComponentActivity.this);
                return _init_$lambda$4;
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.e
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                ComponentActivity._init_$lambda$5(ComponentActivity.this, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = e0.c(new x00.a<SavedStateViewModelFactory>() { // from class: androidx.activity.ComponentActivity$defaultViewModelProviderFactory$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final SavedStateViewModelFactory invoke() {
                Application application = ComponentActivity.this.getApplication();
                ComponentActivity componentActivity = ComponentActivity.this;
                return new SavedStateViewModelFactory(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
            }
        });
        this.onBackPressedDispatcher$delegate = e0.c(new ComponentActivity$onBackPressedDispatcher$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        g0.p(lifecycleOwner, "<anonymous parameter 0>");
        g0.p(event, "event");
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        g0.p(lifecycleOwner, "<anonymous parameter 0>");
        g0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.clearAvailableContext();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            componentActivity.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context it) {
        g0.p(it, "it");
        Bundle consumeRestoredStateForKey = componentActivity.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (consumeRestoredStateForKey != null) {
            componentActivity.activityResultRegistry.onRestoreInstanceState(consumeRestoredStateForKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher.this, this, lifecycleOwner, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        g0.p(lifecycleOwner, "<anonymous parameter 0>");
        g0.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackPressedDispatcher.setOnBackInvokedDispatcher(Api33Impl.INSTANCE.getOnBackInvokedDispatcher(componentActivity));
        }
    }

    private final ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new ReportFullyDrawnExecutorImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this._viewModelStore = nonConfigurationInstances.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@m80.l View view, @m80.l ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@m80.k MenuProvider provider) {
        g0.p(provider, "provider");
        this.menuHostHelper.addMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@m80.k Consumer<Configuration> listener) {
        g0.p(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(@m80.k OnContextAvailableListener listener) {
        g0.p(listener, "listener");
        this.contextAwareHelper.addOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@m80.k Consumer<MultiWindowModeChangedInfo> listener) {
        g0.p(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(@m80.k Consumer<Intent> listener) {
        g0.p(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@m80.k Consumer<PictureInPictureModeChangedInfo> listener) {
        g0.p(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@m80.k Consumer<Integer> listener) {
        g0.p(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(@m80.k Runnable listener) {
        g0.p(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    @m80.k
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @m80.k
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        if (getApplication() != null) {
            CreationExtras.Key<Application> key = ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY;
            Application application = getApplication();
            g0.o(application, "application");
            mutableCreationExtras.set(key, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, extras);
        }
        return mutableCreationExtras;
    }

    @m80.k
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    @m80.k
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter$delegate.getValue();
    }

    @m80.l
    @yz.n(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @m80.k
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @m80.k
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @m80.k
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @m80.k
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        ViewModelStore viewModelStore = this._viewModelStore;
        g0.m(viewModelStore);
        return viewModelStore;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        g0.o(decorView, "window.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        g0.o(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        g0.o(decorView3, "window.decorView");
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        g0.o(decorView4, "window.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        g0.o(decorView5, "window.decorView");
        ViewTreeFullyDrawnReporterOwner.set(decorView5, this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @yz.n(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    @CallSuper
    public void onActivityResult(int i11, int i12, @m80.l Intent intent) {
        if (this.activityResultRegistry.dispatchResult(i11, i12, intent)) {
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.app.Activity
    @yz.n(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    @CallSuper
    @MainThread
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@m80.k Configuration newConfig) {
        g0.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        this.savedStateRegistryController.performRestore(bundle);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, @m80.k Menu menu) {
        g0.p(menu, "menu");
        if (i11 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i11, menu);
        this.menuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, @m80.k MenuItem item) {
        g0.p(item, "item");
        if (super.onMenuItemSelected(i11, item)) {
            return true;
        }
        if (i11 == 0) {
            return this.menuHostHelper.onMenuItemSelected(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @yz.n(message = "Deprecated in android.app.Activity")
    @CallSuper
    public void onMultiWindowModeChanged(boolean z11) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z11));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@m80.k Intent intent) {
        g0.p(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, @m80.k Menu menu) {
        g0.p(menu, "menu");
        this.menuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    @yz.n(message = "Deprecated in android.app.Activity")
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z11) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z11));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i11, @m80.l View view, @m80.k Menu menu) {
        g0.p(menu, "menu");
        if (i11 != 0) {
            return true;
        }
        super.onPreparePanel(i11, view, menu);
        this.menuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    @yz.n(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    @CallSuper
    public void onRequestPermissionsResult(int i11, @m80.k String[] permissions, @m80.k int[] grantResults) {
        g0.p(permissions, "permissions");
        g0.p(grantResults, "grantResults");
        if (this.activityResultRegistry.dispatchResult(i11, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, permissions).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i11, permissions, grantResults);
    }

    @m80.l
    @yz.n(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @m80.l
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.getViewModelStore();
        }
        if (viewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.setCustom(onRetainCustomNonConfigurationInstance);
        nonConfigurationInstances2.setViewModelStore(viewModelStore);
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@m80.k Bundle outState) {
        g0.p(outState, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            g0.n(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.performSave(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i11));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // androidx.activity.contextaware.ContextAware
    @m80.l
    public Context peekAvailableContext() {
        return this.contextAwareHelper.peekAvailableContext();
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @m80.k
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@m80.k ActivityResultContract<I, O> contract, @m80.k ActivityResultRegistry registry, @m80.k ActivityResultCallback<O> callback) {
        g0.p(contract, "contract");
        g0.p(registry, "registry");
        g0.p(callback, "callback");
        return registry.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@m80.k MenuProvider provider) {
        g0.p(provider, "provider");
        this.menuHostHelper.removeMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@m80.k Consumer<Configuration> listener) {
        g0.p(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(@m80.k OnContextAvailableListener listener) {
        g0.p(listener, "listener");
        this.contextAwareHelper.removeOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@m80.k Consumer<MultiWindowModeChangedInfo> listener) {
        g0.p(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(@m80.k Consumer<Intent> listener) {
        g0.p(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@m80.k Consumer<PictureInPictureModeChangedInfo> listener) {
        g0.p(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@m80.k Consumer<Integer> listener) {
        g0.p(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(@m80.k Runnable listener) {
        g0.p(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i11) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(i11);
    }

    @Override // android.app.Activity
    @yz.n(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@m80.k Intent intent, int i11) {
        g0.p(intent, "intent");
        super.startActivityForResult(intent, i11);
    }

    @Override // android.app.Activity
    @yz.n(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@m80.k IntentSender intent, int i11, @m80.l Intent intent2, int i12, int i13, int i14) throws IntentSender.SendIntentException {
        g0.p(intent, "intent");
        super.startIntentSenderForResult(intent, i11, intent2, i12, i13, i14);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@m80.k MenuProvider provider, @m80.k LifecycleOwner owner) {
        g0.p(provider, "provider");
        g0.p(owner, "owner");
        this.menuHostHelper.addMenuProvider(provider, owner);
    }

    @Override // android.app.Activity
    @yz.n(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@m80.k Intent intent, int i11, @m80.l Bundle bundle) {
        g0.p(intent, "intent");
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // android.app.Activity
    @yz.n(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@m80.k IntentSender intent, int i11, @m80.l Intent intent2, int i12, int i13, int i14, @m80.l Bundle bundle) throws IntentSender.SendIntentException {
        g0.p(intent, "intent");
        super.startIntentSenderForResult(intent, i11, intent2, i12, i13, i14, bundle);
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@m80.k MenuProvider provider, @m80.k LifecycleOwner owner, @m80.k Lifecycle.State state) {
        g0.p(provider, "provider");
        g0.p(owner, "owner");
        g0.p(state, "state");
        this.menuHostHelper.addMenuProvider(provider, owner, state);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @m80.k
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@m80.k ActivityResultContract<I, O> contract, @m80.k ActivityResultCallback<O> callback) {
        g0.p(contract, "contract");
        g0.p(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z11, @m80.k Configuration newConfig) {
        g0.p(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z11, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z11, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z11, @m80.k Configuration newConfig) {
        g0.p(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z11, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z11, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@m80.l View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@m80.l View view, @m80.l ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        g0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i11) {
        this();
        this.contentLayoutId = i11;
    }
}
