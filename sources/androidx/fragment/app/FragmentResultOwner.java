package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface FragmentResultOwner {
    void clearFragmentResult(@NonNull String str);

    void clearFragmentResultListener(@NonNull String str);

    void setFragmentResult(@NonNull String str, @NonNull Bundle bundle);

    void setFragmentResultListener(@NonNull String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull FragmentResultListener fragmentResultListener);
}
