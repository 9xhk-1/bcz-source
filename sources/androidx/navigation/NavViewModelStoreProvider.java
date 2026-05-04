package androidx.navigation;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelStore;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface NavViewModelStoreProvider {
    @k
    ViewModelStore getViewModelStore(@k String str);
}
