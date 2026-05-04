package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.databinding.library.R;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.ViewBinding;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final int REBOUND = 3;
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private LifecycleOwner mLifecycleOwner;
    private WeakListener[] mLocalFieldObservers;
    private OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.1
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new WeakPropertyListener(viewDataBinding, i11, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIST_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.2
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new WeakListListener(viewDataBinding, i11, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_MAP_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.3
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new WeakMapListener(viewDataBinding, i11, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.4
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new LiveDataListener(viewDataBinding, i11, referenceQueue).getListener();
        }
    };
    private static final CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> REBIND_NOTIFIER = new CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void>() { // from class: androidx.databinding.ViewDataBinding.5
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i11, Void r42) {
            if (i11 == 1) {
                if (onRebindCallback.onPreBind(viewDataBinding)) {
                    return;
                }
                viewDataBinding.mRebindHalted = true;
            } else if (i11 == 2) {
                onRebindCallback.onCanceled(viewDataBinding);
            } else {
                if (i11 != 3) {
                    return;
                }
                onRebindCallback.onBound(viewDataBinding);
            }
        }
    };
    private static final ReferenceQueue<ViewDataBinding> sReferenceQueue = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new View.OnAttachStateChangeListener() { // from class: androidx.databinding.ViewDataBinding.6
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.getBinding(view).mRebindRunnable.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i11) {
            this.layouts = new String[i11][];
            this.indexes = new int[i11][];
            this.layoutIds = new int[i11][];
        }

        public void setIncludes(int i11, String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i11] = strArr;
            this.indexes[i11] = iArr;
            this.layoutIds[i11] = iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveDataListener implements Observer, ObservableReference<LiveData<?>> {

        @Nullable
        WeakReference<LifecycleOwner> mLifecycleOwnerRef = null;
        final WeakListener<LiveData<?>> mListener;

        public LiveDataListener(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i11, this, referenceQueue);
        }

        @Nullable
        private LifecycleOwner getLifecycleOwner() {
            WeakReference<LifecycleOwner> weakReference = this.mLifecycleOwnerRef;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<LiveData<?>> getListener() {
            return this.mListener;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                WeakListener<LiveData<?>> weakListener = this.mListener;
                binder.handleFieldChange(weakListener.mLocalFieldId, weakListener.getTarget(), 0);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
            LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
            LiveData<?> target = this.mListener.getTarget();
            if (target != null) {
                if (lifecycleOwner2 != null) {
                    target.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    target.observe(lifecycleOwner, this);
                }
            }
            if (lifecycleOwner != null) {
                this.mLifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(LiveData<?> liveData) {
            LifecycleOwner lifecycleOwner = getLifecycleOwner();
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(LiveData<?> liveData) {
            liveData.removeObserver(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OnStartListener implements LifecycleObserver {
        final WeakReference<ViewDataBinding> mBinding;

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.mBinding.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.mBinding = new WeakReference<>(viewDataBinding);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {
        final int mPropertyId;

        public PropertyChangedInverseListener(int i11) {
            this.mPropertyId = i11;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i11) {
            if (i11 == this.mPropertyId || i11 == 0) {
                onChange();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WeakListListener extends ObservableList.OnListChangedCallback implements ObservableReference<ObservableList> {
        final WeakListener<ObservableList> mListener;

        public WeakListListener(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i11, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<ObservableList> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            ObservableList target;
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && (target = this.mListener.getTarget()) == observableList) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, target, 0);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i11, int i12) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i11, int i12) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i11, int i12, int i13) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i11, int i12) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WeakMapListener extends ObservableMap.OnMapChangedCallback implements ObservableReference<ObservableMap> {
        final WeakListener<ObservableMap> mListener;

        public WeakMapListener(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i11, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<ObservableMap> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(ObservableMap observableMap, Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder == null || observableMap != this.mListener.getTarget()) {
                return;
            }
            binder.handleFieldChange(this.mListener.mLocalFieldId, observableMap, 0);
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WeakPropertyListener extends Observable.OnPropertyChangedCallback implements ObservableReference<Observable> {
        final WeakListener<Observable> mListener;

        public WeakPropertyListener(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i11, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<Observable> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i11) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && this.mListener.getTarget() == observable) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observable, i11);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i11) {
        this.mRebindRunnable = new Runnable() { // from class: androidx.databinding.ViewDataBinding.7
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    ViewDataBinding.this.mPendingRebind = false;
                }
                ViewDataBinding.processReferenceQueue();
                if (ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                    ViewDataBinding.this.executePendingBindings();
                } else {
                    ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                }
            }
        };
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new WeakListener[i11];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new Choreographer.FrameCallback() { // from class: androidx.databinding.ViewDataBinding.8
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j11) {
                    ViewDataBinding.this.mRebindRunnable.run();
                }
            };
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    public static ViewDataBinding bind(Object obj, View view, int i11) {
        return DataBindingUtil.bind(checkAndCastToBindingComponent(obj), view, i11);
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry2 = this.mRebindCallbacks;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    public static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    private static int findIncludeIndex(String str, int i11, IncludedLayouts includedLayouts, int i12) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = includedLayouts.layouts[i12];
        int length = strArr.length;
        while (i11 < length) {
            if (TextUtils.equals(subSequence, strArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i11) {
        String str = (String) viewGroup.getChildAt(i11).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i12 = i11 + 1; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    break;
                }
                if (isNumeric(str2, length)) {
                    i11 = i12;
                }
            }
        }
        return i11;
    }

    public static ViewDataBinding getBinding(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public static int getColorFromResource(View view, int i11) {
        return view.getContext().getColor(i11);
    }

    public static ColorStateList getColorStateListFromResource(View view, int i11) {
        return view.getContext().getColorStateList(i11);
    }

    public static Drawable getDrawableFromResource(View view, int i11) {
        return view.getContext().getDrawable(i11);
    }

    public static <K, T> T getFrom(Map<K, T> map, K k11) {
        if (map == null) {
            return null;
        }
        return map.get(k11);
    }

    public static <T> T getFromArray(T[] tArr, int i11) {
        if (tArr == null || i11 < 0 || i11 >= tArr.length) {
            return null;
        }
        return tArr[i11];
    }

    public static <T> T getFromList(List<T> list, int i11) {
        if (list == null || i11 < 0 || i11 >= list.size()) {
            return null;
        }
        return list.get(i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <T extends ViewDataBinding> T inflateInternal(@NonNull LayoutInflater layoutInflater, int i11, @Nullable ViewGroup viewGroup, boolean z11, @Nullable Object obj) {
        return (T) DataBindingUtil.inflate(layoutInflater, i11, viewGroup, z11, checkAndCastToBindingComponent(obj));
    }

    private static boolean isNumeric(String str, int i11) {
        int length = str.length();
        if (length == i11) {
            return false;
        }
        while (i11 < length) {
            if (!Character.isDigit(str.charAt(i11))) {
                return false;
            }
            i11++;
        }
        return true;
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i11, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i11];
        mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    public static boolean parse(String str, boolean z11) {
        return str == null ? z11 : Boolean.parseBoolean(str);
    }

    private static int parseTagInt(String str, int i11) {
        int i12 = 0;
        while (i11 < str.length()) {
            i12 = (i12 * 10) + (str.charAt(i11) - '0');
            i11++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof WeakListener) {
                ((WeakListener) poll).unregister();
            }
        }
    }

    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    public static <T> void setTo(T[] tArr, int i11, T t11) {
        if (tArr == null || i11 < 0 || i11 >= tArr.length) {
            return;
        }
        tArr[i11] = t11;
    }

    public void addOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new CallbackRegistry<>(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback);
    }

    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    public abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    public void forceExecuteBindings() {
        executeBindings();
    }

    @Nullable
    public LifecycleOwner getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public Object getObservedField(int i11) {
        WeakListener weakListener = this.mLocalFieldObservers[i11];
        if (weakListener == null) {
            return null;
        }
        return weakListener.getTarget();
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.mRoot;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void handleFieldChange(int i11, Object obj, int i12) {
        if (this.mInLiveDataRegisterObserver || this.mInStateFlowRegisterObserver || !onFieldChange(i11, obj, i12)) {
            return;
        }
        requestRebind();
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int i11, Object obj, int i12);

    public void registerTo(int i11, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return;
        }
        WeakListener weakListener = this.mLocalFieldObservers[i11];
        if (weakListener == null) {
            weakListener = createWeakListener.create(this, i11, sReferenceQueue);
            this.mLocalFieldObservers[i11] = weakListener;
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
        weakListener.setTarget(obj);
    }

    public void removeOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    public void requestRebind() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.mPendingRebind) {
                        return;
                    }
                    this.mPendingRebind = true;
                    if (USE_CHOREOGRAPHER) {
                        this.mChoreographer.postFrameCallback(this.mFrameCallback);
                    } else {
                        this.mUIThreadHandler.post(this.mRebindRunnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    @MainThread
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        LifecycleOwner lifecycleOwner2 = this.mLifecycleOwner;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.mOnStartListener);
        }
        this.mLifecycleOwner = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new OnStartListener();
            }
            lifecycleOwner.getLifecycle().addObserver(this.mOnStartListener);
        }
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i11, @Nullable Object obj);

    public void unbind() {
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.unregister();
            }
        }
    }

    public boolean unregisterFrom(int i11) {
        WeakListener weakListener = this.mLocalFieldObservers[i11];
        if (weakListener != null) {
            return weakListener.unregister();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int i11, LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i11, liveData, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean updateRegistration(int i11, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return unregisterFrom(i11);
        }
        WeakListener weakListener = this.mLocalFieldObservers[i11];
        if (weakListener == null) {
            registerTo(i11, obj, createWeakListener);
            return true;
        }
        if (weakListener.getTarget() == obj) {
            return false;
        }
        unregisterFrom(i11);
        registerTo(i11, obj, createWeakListener);
        return true;
    }

    public static byte parse(String str, byte b11) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b11;
        }
    }

    public static long safeUnbox(Long l11) {
        if (l11 == null) {
            return 0L;
        }
        return l11.longValue();
    }

    public void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public static boolean getFromArray(boolean[] zArr, int i11) {
        if (zArr == null || i11 < 0 || i11 >= zArr.length) {
            return false;
        }
        return zArr[i11];
    }

    public static <T> T getFromList(SparseArray<T> sparseArray, int i11) {
        if (sparseArray == null || i11 < 0) {
            return null;
        }
        return sparseArray.get(i11);
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i11, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i11];
        for (View view : viewArr) {
            mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    public static short parse(String str, short s11) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s11;
        }
    }

    public static short safeUnbox(Short sh2) {
        if (sh2 == null) {
            return (short) 0;
        }
        return sh2.shortValue();
    }

    public static void setTo(boolean[] zArr, int i11, boolean z11) {
        if (zArr == null || i11 < 0 || i11 >= zArr.length) {
            return;
        }
        zArr[i11] = z11;
    }

    @TargetApi(16)
    public static <T> T getFromList(LongSparseArray<T> longSparseArray, int i11) {
        if (longSparseArray == null || i11 < 0) {
            return null;
        }
        return longSparseArray.get(i11);
    }

    public static int parse(String str, int i11) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    public static byte safeUnbox(Byte b11) {
        if (b11 == null) {
            return (byte) 0;
        }
        return b11.byteValue();
    }

    public static byte getFromArray(byte[] bArr, int i11) {
        if (bArr == null || i11 < 0 || i11 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i11];
    }

    public static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i11) {
        if (longSparseArray == null || i11 < 0) {
            return null;
        }
        return longSparseArray.get(i11);
    }

    public static long parse(String str, long j11) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j11;
        }
    }

    public static char safeUnbox(Character ch2) {
        if (ch2 == null) {
            return (char) 0;
        }
        return ch2.charValue();
    }

    public static void setTo(byte[] bArr, int i11, byte b11) {
        if (bArr == null || i11 < 0 || i11 >= bArr.length) {
            return;
        }
        bArr[i11] = b11;
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i11) {
        if (sparseBooleanArray == null || i11 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void mapBindings(androidx.databinding.DataBindingComponent r18, android.view.View r19, java.lang.Object[] r20, androidx.databinding.ViewDataBinding.IncludedLayouts r21, android.util.SparseIntArray r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mapBindings(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$IncludedLayouts, android.util.SparseIntArray, boolean):void");
    }

    public static float parse(String str, float f11) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f11;
        }
    }

    public static double safeUnbox(Double d11) {
        if (d11 == null) {
            return 0.0d;
        }
        return d11.doubleValue();
    }

    public static short getFromArray(short[] sArr, int i11) {
        if (sArr == null || i11 < 0 || i11 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i11];
    }

    public static int getFromList(SparseIntArray sparseIntArray, int i11) {
        if (sparseIntArray == null || i11 < 0) {
            return 0;
        }
        return sparseIntArray.get(i11);
    }

    public static double parse(String str, double d11) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d11;
        }
    }

    public static float safeUnbox(Float f11) {
        if (f11 == null) {
            return 0.0f;
        }
        return f11.floatValue();
    }

    public static void setTo(short[] sArr, int i11, short s11) {
        if (sArr == null || i11 < 0 || i11 >= sArr.length) {
            return;
        }
        sArr[i11] = s11;
    }

    public boolean updateRegistration(int i11, Observable observable) {
        return updateRegistration(i11, observable, CREATE_PROPERTY_LISTENER);
    }

    @TargetApi(18)
    public static long getFromList(SparseLongArray sparseLongArray, int i11) {
        if (sparseLongArray == null || i11 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i11);
    }

    public static char parse(String str, char c11) {
        return (str == null || str.isEmpty()) ? c11 : str.charAt(0);
    }

    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean updateRegistration(int i11, ObservableList observableList) {
        return updateRegistration(i11, observableList, CREATE_LIST_LISTENER);
    }

    public static char getFromArray(char[] cArr, int i11) {
        if (cArr == null || i11 < 0 || i11 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i11];
    }

    public static void setTo(char[] cArr, int i11, char c11) {
        if (cArr == null || i11 < 0 || i11 >= cArr.length) {
            return;
        }
        cArr[i11] = c11;
    }

    public boolean updateRegistration(int i11, ObservableMap observableMap) {
        return updateRegistration(i11, observableMap, CREATE_MAP_LISTENER);
    }

    public static int getFromArray(int[] iArr, int i11) {
        if (iArr == null || i11 < 0 || i11 >= iArr.length) {
            return 0;
        }
        return iArr[i11];
    }

    public static void setTo(int[] iArr, int i11, int i12) {
        if (iArr == null || i11 < 0 || i11 >= iArr.length) {
            return;
        }
        iArr[i11] = i12;
    }

    public static long getFromArray(long[] jArr, int i11) {
        if (jArr == null || i11 < 0 || i11 >= jArr.length) {
            return 0L;
        }
        return jArr[i11];
    }

    public static void setTo(long[] jArr, int i11, long j11) {
        if (jArr == null || i11 < 0 || i11 >= jArr.length) {
            return;
        }
        jArr[i11] = j11;
    }

    public ViewDataBinding(Object obj, View view, int i11) {
        this(checkAndCastToBindingComponent(obj), view, i11);
    }

    public static float getFromArray(float[] fArr, int i11) {
        if (fArr == null || i11 < 0 || i11 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i11];
    }

    public static void setTo(float[] fArr, int i11, float f11) {
        if (fArr == null || i11 < 0 || i11 >= fArr.length) {
            return;
        }
        fArr[i11] = f11;
    }

    public static double getFromArray(double[] dArr, int i11) {
        if (dArr == null || i11 < 0 || i11 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i11];
    }

    public static void setTo(double[] dArr, int i11, double d11) {
        if (dArr == null || i11 < 0 || i11 >= dArr.length) {
            return;
        }
        dArr[i11] = d11;
    }

    public static <T> void setTo(List<T> list, int i11, T t11) {
        if (list == null || i11 < 0 || i11 >= list.size()) {
            return;
        }
        list.set(i11, t11);
    }

    public static <T> void setTo(SparseArray<T> sparseArray, int i11, T t11) {
        if (sparseArray == null || i11 < 0 || i11 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i11, t11);
    }

    @TargetApi(16)
    public static <T> void setTo(LongSparseArray<T> longSparseArray, int i11, T t11) {
        if (longSparseArray == null || i11 < 0 || i11 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i11, t11);
    }

    public static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i11, T t11) {
        if (longSparseArray == null || i11 < 0 || i11 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i11, t11);
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int i11, boolean z11) {
        if (sparseBooleanArray == null || i11 < 0 || i11 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i11, z11);
    }

    public static void setTo(SparseIntArray sparseIntArray, int i11, int i12) {
        if (sparseIntArray == null || i11 < 0 || i11 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i11, i12);
    }

    @TargetApi(18)
    public static void setTo(SparseLongArray sparseLongArray, int i11, long j11) {
        if (sparseLongArray == null || i11 < 0 || i11 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i11, j11);
    }

    public static <K, T> void setTo(Map<K, T> map, K k11, T t11) {
        if (map == null) {
            return;
        }
        map.put(k11, t11);
    }
}
