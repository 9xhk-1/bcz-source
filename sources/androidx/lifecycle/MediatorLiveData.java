package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    private SafeIterableMap<LiveData<?>, Source<?>> mSources;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Source<V> implements Observer<V> {
        final LiveData<V> mLiveData;
        final Observer<? super V> mObserver;
        int mVersion = -1;

        public Source(LiveData<V> liveData, Observer<? super V> observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable V v11) {
            if (this.mVersion != this.mLiveData.getVersion()) {
                this.mVersion = this.mLiveData.getVersion();
                this.mObserver.onChanged(v11);
            }
        }

        public void plug() {
            this.mLiveData.observeForever(this);
        }

        public void unplug() {
            this.mLiveData.removeObserver(this);
        }
    }

    public MediatorLiveData() {
        this.mSources = new SafeIterableMap<>();
    }

    @MainThread
    public <S> void addSource(@NonNull LiveData<S> liveData, @NonNull Observer<? super S> observer) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        Source<?> source = new Source<>(liveData, observer);
        Source<?> putIfAbsent = this.mSources.putIfAbsent(liveData, source);
        if (putIfAbsent != null && putIfAbsent.mObserver != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (putIfAbsent == null && hasActiveObservers()) {
            source.plug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().plug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().unplug();
        }
    }

    @MainThread
    public <S> void removeSource(@NonNull LiveData<S> liveData) {
        Source<?> remove = this.mSources.remove(liveData);
        if (remove != null) {
            remove.unplug();
        }
    }

    public MediatorLiveData(T t11) {
        super(t11);
        this.mSources = new SafeIterableMap<>();
    }
}
