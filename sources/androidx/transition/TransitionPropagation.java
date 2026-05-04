package androidx.transition;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class TransitionPropagation {
    public abstract void captureValues(@NonNull TransitionValues transitionValues);

    @Nullable
    @SuppressLint({"NullableCollection"})
    public abstract String[] getPropagationProperties();

    public abstract long getStartDelay(@NonNull ViewGroup viewGroup, @NonNull Transition transition, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2);
}
