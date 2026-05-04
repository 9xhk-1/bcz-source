package com.baicizhan.main.wikiv2.lookup.wikiv2;

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
/* loaded from: classes3.dex */
public abstract class a extends Fragment implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public ContextWrapper f25626a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25627b;

    /* renamed from: c, reason: collision with root package name */
    public volatile xu.g f25628c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f25629d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25630e;

    public a() {
        this.f25629d = new Object();
        this.f25630e = false;
    }

    private void initializeComponentContext() {
        if (this.f25626a == null) {
            this.f25626a = xu.g.b(super.getContext(), this);
            this.f25627b = su.a.a(super.getContext());
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
        if (super.getContext() == null && !this.f25627b) {
            return null;
        }
        initializeComponentContext();
        return this.f25626a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f25630e) {
            return;
        }
        this.f25630e = true;
        ((d0) generatedComponent()).b((WikiSceneFragment) gv.i.a(this));
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
        if (this.f25628c == null) {
            synchronized (this.f25629d) {
                try {
                    if (this.f25628c == null) {
                        this.f25628c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f25628c;
    }

    public a(int contentLayoutId) {
        super(contentLayoutId);
        this.f25629d = new Object();
        this.f25630e = false;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f25626a;
        gv.f.d(contextWrapper == null || xu.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
