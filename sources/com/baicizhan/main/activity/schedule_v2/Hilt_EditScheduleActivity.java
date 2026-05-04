package com.baicizhan.main.activity.schedule_v2;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import gv.i;
import oe.q0;
import xu.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class Hilt_EditScheduleActivity extends BaseAppCompatActivity implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public l f18928a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xu.a f18929b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18930c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f18931d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_EditScheduleActivity.this.inject();
        }
    }

    public Hilt_EditScheduleActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof gv.c) {
            l b11 = componentManager().b();
            this.f18928a = b11;
            if (b11.c()) {
                this.f18928a.d(getDefaultViewModelCreationExtras());
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
        if (this.f18931d) {
            return;
        }
        this.f18931d = true;
        ((q0) generatedComponent()).u((EditScheduleActivity) i.a(this));
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
        l lVar = this.f18928a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f18929b == null) {
            synchronized (this.f18930c) {
                try {
                    if (this.f18929b == null) {
                        this.f18929b = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f18929b;
    }
}
