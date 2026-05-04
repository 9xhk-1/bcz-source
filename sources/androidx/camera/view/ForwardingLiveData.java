package androidx.camera.view;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ForwardingLiveData<T> extends MediatorLiveData<T> {
    private LiveData<T> mLiveDataSource;

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        LiveData<T> liveData = this.mLiveDataSource;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSource(@NonNull LiveData<T> liveData) {
        LiveData<T> liveData2 = this.mLiveDataSource;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.mLiveDataSource = liveData;
        super.addSource(liveData, new Observer() { // from class: androidx.camera.view.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ForwardingLiveData.this.setValue(obj);
            }
        });
    }
}
