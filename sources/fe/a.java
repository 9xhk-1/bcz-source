package fe;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.lookup.LookupWordActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a extends BaseAppCompatActivity implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public xu.l f51817a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xu.a f51818b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f51819c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f51820d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: fe.a$a, reason: collision with other inner class name */
    public class C0615a implements OnContextAvailableListener {
        public C0615a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            a.this.inject();
        }
    }

    public a() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new C0615a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof gv.c) {
            xu.l b11 = componentManager().b();
            this.f51817a = b11;
            if (b11.c()) {
                this.f51817a.d(getDefaultViewModelCreationExtras());
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
        if (this.f51820d) {
            return;
        }
        this.f51820d = true;
        ((j) generatedComponent()).r((LookupWordActivity) gv.i.a(this));
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
        xu.l lVar = this.f51817a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f51818b == null) {
            synchronized (this.f51819c) {
                try {
                    if (this.f51818b == null) {
                        this.f51818b = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f51818b;
    }
}
