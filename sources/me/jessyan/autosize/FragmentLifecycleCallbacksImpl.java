package me.jessyan.autosize;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class FragmentLifecycleCallbacksImpl extends FragmentManager.FragmentLifecycleCallbacks {
    private AutoAdaptStrategy mAutoAdaptStrategy;

    public FragmentLifecycleCallbacksImpl(AutoAdaptStrategy autoAdaptStrategy) {
        this.mAutoAdaptStrategy = autoAdaptStrategy;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        AutoAdaptStrategy autoAdaptStrategy = this.mAutoAdaptStrategy;
        if (autoAdaptStrategy != null) {
            autoAdaptStrategy.applyAdapt(fragment, fragment.getActivity());
        }
    }

    public void setAutoAdaptStrategy(AutoAdaptStrategy autoAdaptStrategy) {
        this.mAutoAdaptStrategy = autoAdaptStrategy;
    }
}
