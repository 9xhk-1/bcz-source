package vh;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.selftest.activity.WalkListenActivity;
import xu.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a extends BaseAppCompatActivity implements gv.d {

    /* renamed from: a, reason: collision with root package name */
    public l f93931a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xu.a f93932b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f93933c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f93934d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: vh.a$a, reason: collision with other inner class name */
    public class C1265a implements OnContextAvailableListener {
        public C1265a() {
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
        addOnContextAvailableListener(new C1265a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof gv.c) {
            l b11 = componentManager().b();
            this.f93931a = b11;
            if (b11.c()) {
                this.f93931a.d(getDefaultViewModelCreationExtras());
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
        if (this.f93934d) {
            return;
        }
        this.f93934d = true;
        ((j) generatedComponent()).s((WalkListenActivity) gv.i.a(this));
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
        l lVar = this.f93931a;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // gv.d
    public final xu.a componentManager() {
        if (this.f93932b == null) {
            synchronized (this.f93933c) {
                try {
                    if (this.f93932b == null) {
                        this.f93932b = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f93932b;
    }
}
