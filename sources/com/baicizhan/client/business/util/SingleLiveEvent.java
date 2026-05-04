package com.baicizhan.client.business.util;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SingleLiveEvent<T> extends MutableLiveData<T> {
    private static final String TAG = "SingleLiveEvent";
    private final AtomicBoolean mPending = new AtomicBoolean(false);
    private Map<Observer<? super T>, Observer<? super T>> mObsWrap = new ConcurrentHashMap();

    @MainThread
    public void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull final Observer<? super T> observer) {
        if (hasActiveObservers() || this.mObsWrap.size() > 1) {
            qb.c.q(TAG, "Multiple observers registered but only one will be notified of changes. %d", Integer.valueOf(this.mObsWrap.size()));
        }
        this.mObsWrap.put(observer, new Observer<T>() { // from class: com.baicizhan.client.business.util.SingleLiveEvent.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(@Nullable T t11) {
                if (SingleLiveEvent.this.mPending.compareAndSet(true, false)) {
                    observer.onChanged(t11);
                }
            }
        });
        super.observe(lifecycleOwner, this.mObsWrap.get(observer));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NonNull Observer<? super T> observer) {
        Observer<? super T> observer2 = this.mObsWrap.get(observer);
        if (observer2 != null) {
            super.removeObserver(observer2);
        } else {
            super.removeObserver(observer);
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t11) {
        this.mPending.set(true);
        super.setValue(t11);
    }
}
