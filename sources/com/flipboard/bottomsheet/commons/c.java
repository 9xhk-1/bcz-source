package com.flipboard.bottomsheet.commons;

import androidx.annotation.IdRes;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface c {
    void b(FragmentManager manager, @IdRes int bottomSheetLayoutId);

    int c(FragmentTransaction transaction, @IdRes int bottomSheetLayoutId);

    void dismiss();

    void dismissAllowingStateLoss();

    ql.d p();
}
