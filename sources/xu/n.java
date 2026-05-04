package xu;

import androidx.lifecycle.SavedStateHandle;
import tv.s;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"dagger.hilt.android.lifecycle.ActivityRetainedSavedState"})
@x("dagger.hilt.android.scopes.ActivityRetainedScoped")
@tv.e
/* loaded from: classes8.dex */
public final class n implements tv.h<SavedStateHandle> {

    /* renamed from: a, reason: collision with root package name */
    public final t<l> f98356a;

    public n(t<l> savedStateHandleHolderProvider) {
        this.f98356a = savedStateHandleHolderProvider;
    }

    public static n a(t<l> savedStateHandleHolderProvider) {
        return new n(savedStateHandleHolderProvider);
    }

    public static SavedStateHandle c(l savedStateHandleHolder) {
        return (SavedStateHandle) s.f(m.a(savedStateHandleHolder));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SavedStateHandle get() {
        return c(this.f98356a.get());
    }
}
