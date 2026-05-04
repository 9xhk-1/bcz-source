package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.databinding.Observable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class BaseObservable implements Observable {
    private transient PropertyChangeRegistry mCallbacks;

    @Override // androidx.databinding.Observable
    public void addOnPropertyChangedCallback(@NonNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new PropertyChangeRegistry();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mCallbacks.add(onPropertyChangedCallback);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
                if (propertyChangeRegistry == null) {
                    return;
                }
                propertyChangeRegistry.notifyCallbacks(this, 0, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyPropertyChanged(int i11) {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
                if (propertyChangeRegistry == null) {
                    return;
                }
                propertyChangeRegistry.notifyCallbacks(this, i11, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.Observable
    public void removeOnPropertyChangedCallback(@NonNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
                if (propertyChangeRegistry == null) {
                    return;
                }
                propertyChangeRegistry.remove(onPropertyChangedCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
