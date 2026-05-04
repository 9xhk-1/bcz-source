package com.baicizhan.main.home.player;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.ComposeBaseActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class Hilt_HomeActivity extends ComposeBaseActivity implements gv.d {

    /* renamed from: b, reason: collision with root package name */
    public xu.l f23114b;

    /* renamed from: c, reason: collision with root package name */
    public volatile xu.a f23115c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23116d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f23117e = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_HomeActivity.this.inject();
        }
    }

    public Hilt_HomeActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof gv.c) {
            xu.l b11 = componentManager().b();
            this.f23114b = b11;
            if (b11.c()) {
                this.f23114b.d(getDefaultViewModelCreationExtras());
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
        if (this.f23117e) {
            return;
        }
        this.f23117e = true;
        ((n4) generatedComponent()).h((HomeActivity) gv.i.a(this));
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
        xu.l lVar = this.f23114b;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f23115c == null) {
            synchronized (this.f23116d) {
                try {
                    if (this.f23115c == null) {
                        this.f23115c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f23115c;
    }
}
