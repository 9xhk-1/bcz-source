package dd;

import androidx.annotation.CallSuper;
import com.baicizhan.client.framework.BaseApp;
import com.baicizhan.main.BaicizhanApp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class k extends BaseApp implements gv.d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f47932b = false;

    /* renamed from: c, reason: collision with root package name */
    public final xu.d f47933c = new xu.d(new a());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements xu.f {
        public a() {
        }

        @Override // xu.f
        public Object get() {
            return i.a().a(new zu.c(k.this)).b();
        }
    }

    @Override // gv.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final xu.d componentManager() {
        return this.f47933c;
    }

    public void e() {
        if (this.f47932b) {
            return;
        }
        this.f47932b = true;
        ((e) generatedComponent()).e((BaicizhanApp) gv.i.a(this));
    }

    @Override // gv.c
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // com.baicizhan.client.framework.BaseApp, android.app.Application
    @CallSuper
    public void onCreate() {
        e();
        super.onCreate();
    }
}
