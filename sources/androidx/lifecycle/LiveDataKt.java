package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LiveDataKt {
    @n(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @MainThread
    @k
    public static final <T> Observer<T> observe(@k LiveData<T> liveData, @k LifecycleOwner owner, @k final l<? super T, g2> onChanged) {
        g0.p(liveData, "<this>");
        g0.p(owner, "owner");
        g0.p(onChanged, "onChanged");
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t11) {
                onChanged.invoke(t11);
            }
        };
        liveData.observe(owner, observer);
        return observer;
    }
}
