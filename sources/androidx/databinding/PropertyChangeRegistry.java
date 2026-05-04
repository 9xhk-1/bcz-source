package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class PropertyChangeRegistry extends CallbackRegistry<Observable.OnPropertyChangedCallback, Observable, Void> {
    private static final CallbackRegistry.NotifierCallback<Observable.OnPropertyChangedCallback, Observable, Void> NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback<Observable.OnPropertyChangedCallback, Observable, Void>() { // from class: androidx.databinding.PropertyChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(Observable.OnPropertyChangedCallback onPropertyChangedCallback, Observable observable, int i11, Void r42) {
            onPropertyChangedCallback.onPropertyChanged(observable, i11);
        }
    };

    public PropertyChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    public void notifyChange(@NonNull Observable observable, int i11) {
        notifyCallbacks(observable, i11, null);
    }
}
