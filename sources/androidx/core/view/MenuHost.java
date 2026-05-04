package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface MenuHost {
    void addMenuProvider(@NonNull MenuProvider menuProvider);

    void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state);

    void invalidateMenu();

    void removeMenuProvider(@NonNull MenuProvider menuProvider);
}
