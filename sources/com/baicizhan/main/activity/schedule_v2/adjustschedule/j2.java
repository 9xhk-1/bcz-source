package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class j2 extends com.baicizhan.base.c implements gv.d {

    /* renamed from: d, reason: collision with root package name */
    public ContextWrapper f19135d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19136e;

    /* renamed from: f, reason: collision with root package name */
    public volatile xu.g f19137f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f19138g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f19139h = false;

    private void initializeComponentContext() {
        if (this.f19135d == null) {
            this.f19135d = xu.g.b(super.getContext(), this);
            this.f19136e = su.a.a(super.getContext());
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
        if (super.getContext() == null && !this.f19136e) {
            return null;
        }
        initializeComponentContext();
        return this.f19135d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f19139h) {
            return;
        }
        this.f19139h = true;
        ((w0) generatedComponent()).j((AdjustScheduleClassicFragment) gv.i.a(this));
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
        if (this.f19137f == null) {
            synchronized (this.f19138g) {
                try {
                    if (this.f19137f == null) {
                        this.f19137f = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f19137f;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f19135d;
        gv.f.d(contextWrapper == null || xu.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
