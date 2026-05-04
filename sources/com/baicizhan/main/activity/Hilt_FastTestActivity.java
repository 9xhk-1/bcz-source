package com.baicizhan.main.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.ComposeBaseActivity;
import fd.y0;
import gv.c;
import gv.d;
import gv.i;
import xu.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class Hilt_FastTestActivity extends ComposeBaseActivity implements d {

    /* renamed from: b, reason: collision with root package name */
    public l f17955b;

    /* renamed from: c, reason: collision with root package name */
    public volatile xu.a f17956c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17957d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f17958e = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_FastTestActivity.this.inject();
        }
    }

    public Hilt_FastTestActivity() {
        _initHiltInternal();
    }

    public final void _initHiltInternal() {
        addOnContextAvailableListener(new a());
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

    public final void initSavedStateHandleHolder() {
        if (getApplication() instanceof c) {
            l b11 = componentManager().b();
            this.f17955b = b11;
            if (b11.c()) {
                this.f17955b.d(getDefaultViewModelCreationExtras());
            }
        }
    }

    public void inject() {
        if (this.f17958e) {
            return;
        }
        this.f17958e = true;
        ((y0) generatedComponent()).g((FastTestActivity) i.a(this));
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSavedStateHandleHolder();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l lVar = this.f17955b;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f17956c == null) {
            synchronized (this.f17957d) {
                try {
                    if (this.f17956c == null) {
                        this.f17956c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f17956c;
    }
}
