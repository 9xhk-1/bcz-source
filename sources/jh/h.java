package jh;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.plusreview.activity.DefaultReviewActivity;
import gv.i;
import xu.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class h extends BaseAppCompatActivity implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public l f64094a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xu.a f64095b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f64096c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f64097d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            h.this.inject();
        }
    }

    public h() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof gv.c) {
            l b11 = componentManager().b();
            this.f64094a = b11;
            if (b11.c()) {
                this.f64094a.d(getDefaultViewModelCreationExtras());
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
        if (this.f64097d) {
            return;
        }
        this.f64097d = true;
        ((f) generatedComponent()).c((DefaultReviewActivity) i.a(this));
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSavedStateHandleHolder();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l lVar = this.f64094a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f64095b == null) {
            synchronized (this.f64096c) {
                try {
                    if (this.f64095b == null) {
                        this.f64095b = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f64095b;
    }
}
