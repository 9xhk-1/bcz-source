package com.flipboard.bottomsheet.commons;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends Fragment implements c {

    /* renamed from: a, reason: collision with root package name */
    public b f29576a;

    @Override // com.flipboard.bottomsheet.commons.c
    public void b(FragmentManager manager, @IdRes int bottomSheetLayoutId) {
        t().q(manager, bottomSheetLayoutId);
    }

    @Override // com.flipboard.bottomsheet.commons.c
    public int c(FragmentTransaction transaction, @IdRes int bottomSheetLayoutId) {
        return t().p(transaction, bottomSheetLayoutId);
    }

    @Override // com.flipboard.bottomsheet.commons.c
    public void dismiss() {
        t().c();
    }

    @Override // com.flipboard.bottomsheet.commons.c
    public void dismissAllowingStateLoss() {
        t().d();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater getLayoutInflater(Bundle savedInstanceState) {
        return t().h(savedInstanceState, super.getLayoutInflater());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t().i(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        t().j(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t().k(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        t().l();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        t().m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        t().n(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        t().o();
    }

    @Override // com.flipboard.bottomsheet.commons.c
    public ql.d p() {
        return null;
    }

    public final b t() {
        if (this.f29576a == null) {
            this.f29576a = b.b(this);
        }
        return this.f29576a;
    }
}
