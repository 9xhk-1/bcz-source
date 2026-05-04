package com.baicizhan.main.wikiv2.lookup.wikiv2;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class Hilt_WikiSceneActivity extends BaseAppCompatActivity implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public xu.l f25590a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xu.a f25591b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25592c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f25593d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_WikiSceneActivity.this.inject();
        }
    }

    public Hilt_WikiSceneActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof gv.c) {
            xu.l b11 = componentManager().b();
            this.f25590a = b11;
            if (b11.c()) {
                this.f25590a.d(getDefaultViewModelCreationExtras());
            }
        }
    }

    public xu.a createComponentManager() {
        return new xu.a(this);
    }

    @Override // gv.c
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return dagger.hilt.android.internal.lifecycle.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f25593d) {
            return;
        }
        this.f25593d = true;
        ((c) generatedComponent()).p((WikiSceneActivity) gv.i.a(this));
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSavedStateHandleHolder();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        xu.l lVar = this.f25590a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f25591b == null) {
            synchronized (this.f25592c) {
                try {
                    if (this.f25591b == null) {
                        this.f25591b = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f25591b;
    }
}
