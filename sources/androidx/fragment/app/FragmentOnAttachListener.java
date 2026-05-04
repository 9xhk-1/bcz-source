package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface FragmentOnAttachListener {
    @MainThread
    void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment);
}
