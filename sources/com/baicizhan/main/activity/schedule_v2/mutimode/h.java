package com.baicizhan.main.activity.schedule_v2.mutimode;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class h extends DialogFragment implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public ContextWrapper f19340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19341b;

    /* renamed from: c, reason: collision with root package name */
    public volatile xu.g f19342c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19343d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19344e;

    public h() {
        this.f19343d = new Object();
        this.f19344e = false;
    }

    public xu.g createComponentManager() {
        return new xu.g(this);
    }

    @Override // gv.c
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f19341b) {
            return null;
        }
        initializeComponentContext();
        return this.f19340a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f19340a == null) {
            this.f19340a = xu.g.b(super.getContext(), this);
            this.f19341b = su.a.a(super.getContext());
        }
    }

    public void inject() {
        if (this.f19344e) {
            return;
        }
        this.f19344e = true;
        ((m) generatedComponent()).c((l) gv.i.a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(savedInstanceState);
        return onGetLayoutInflater.cloneInContext(xu.g.c(onGetLayoutInflater, this));
    }

    @Override // gv.d
    public final xu.g componentManager() {
        if (this.f19342c == null) {
            synchronized (this.f19343d) {
                try {
                    if (this.f19342c == null) {
                        this.f19342c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f19342c;
    }

    public h(int contentLayoutId) {
        super(contentLayoutId);
        this.f19343d = new Object();
        this.f19344e = false;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f19340a;
        gv.f.d(contextWrapper == null || xu.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
