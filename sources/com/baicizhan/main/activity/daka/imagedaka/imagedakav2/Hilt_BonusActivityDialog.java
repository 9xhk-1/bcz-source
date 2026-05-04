package com.baicizhan.main.activity.daka.imagedaka.imagedakav2;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import gv.c;
import gv.d;
import gv.i;
import sd.o;
import xu.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class Hilt_BonusActivityDialog extends BaseAppCompatActivity implements d {

    /* renamed from: a, reason: collision with root package name */
    public l f18401a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xu.a f18402b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18403c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f18404d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_BonusActivityDialog.this.inject();
        }
    }

    public Hilt_BonusActivityDialog() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof c) {
            l b11 = componentManager().b();
            this.f18401a = b11;
            if (b11.c()) {
                this.f18401a.d(getDefaultViewModelCreationExtras());
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
        if (this.f18404d) {
            return;
        }
        this.f18404d = true;
        ((o) generatedComponent()).n((BonusActivityDialog) i.a(this));
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
        l lVar = this.f18401a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f18402b == null) {
            synchronized (this.f18403c) {
                try {
                    if (this.f18402b == null) {
                        this.f18402b = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f18402b;
    }
}
