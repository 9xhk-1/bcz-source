package com.baicizhan.main.home.plan;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class e extends Fragment implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public ContextWrapper f22404a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22405b;

    /* renamed from: c, reason: collision with root package name */
    public volatile xu.g f22406c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22407d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22408e;

    public e() {
        this.f22407d = new Object();
        this.f22408e = false;
    }

    private void initializeComponentContext() {
        if (this.f22404a == null) {
            this.f22404a = xu.g.b(super.getContext(), this);
            this.f22405b = su.a.a(super.getContext());
        }
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
        if (super.getContext() == null && !this.f22405b) {
            return null;
        }
        initializeComponentContext();
        return this.f22404a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f22408e) {
            return;
        }
        this.f22408e = true;
        ((n1) generatedComponent()).e((WordPlanFragment) gv.i.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(savedInstanceState);
        return onGetLayoutInflater.cloneInContext(xu.g.c(onGetLayoutInflater, this));
    }

    @Override // gv.d
    public final xu.g componentManager() {
        if (this.f22406c == null) {
            synchronized (this.f22407d) {
                try {
                    if (this.f22406c == null) {
                        this.f22406c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f22406c;
    }

    public e(int contentLayoutId) {
        super(contentLayoutId);
        this.f22407d = new Object();
        this.f22408e = false;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f22404a;
        gv.f.d(contextWrapper == null || xu.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
