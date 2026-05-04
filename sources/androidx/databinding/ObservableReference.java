package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
interface ObservableReference<T> {
    void addListener(T t11);

    WeakListener<T> getListener();

    void removeListener(T t11);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
