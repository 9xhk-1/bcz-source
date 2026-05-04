package androidx.databinding;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
class WeakListener<T> extends WeakReference<ViewDataBinding> {
    protected final int mLocalFieldId;
    private final ObservableReference<T> mObservable;
    private T mTarget;

    public WeakListener(ViewDataBinding viewDataBinding, int i11, ObservableReference<T> observableReference, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.mLocalFieldId = i11;
        this.mObservable = observableReference;
    }

    @Nullable
    public ViewDataBinding getBinder() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            unregister();
        }
        return viewDataBinding;
    }

    public T getTarget() {
        return this.mTarget;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.mObservable.setLifecycleOwner(lifecycleOwner);
    }

    public void setTarget(T t11) {
        unregister();
        this.mTarget = t11;
        if (t11 != null) {
            this.mObservable.addListener(t11);
        }
    }

    public boolean unregister() {
        boolean z11;
        T t11 = this.mTarget;
        if (t11 != null) {
            this.mObservable.removeListener(t11);
            z11 = true;
        } else {
            z11 = false;
        }
        this.mTarget = null;
        return z11;
    }
}
