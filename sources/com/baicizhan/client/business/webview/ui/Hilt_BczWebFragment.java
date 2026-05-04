package com.baicizhan.client.business.webview.ui;

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
abstract class Hilt_BczWebFragment extends Fragment implements gv.d {
    private ContextWrapper componentContext;
    private volatile xu.g componentManager;
    private final Object componentManagerLock;
    private boolean disableGetContextFix;
    private boolean injected;

    public Hilt_BczWebFragment() {
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = xu.g.b(super.getContext(), this);
            this.disableGetContextFix = su.a.a(super.getContext());
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
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((BczWebFragment_GeneratedInjector) generatedComponent()).injectBczWebFragment((BczWebFragment) gv.i.a(this));
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
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    public Hilt_BczWebFragment(int contentLayoutId) {
        super(contentLayoutId);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        gv.f.d(contextWrapper == null || xu.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
