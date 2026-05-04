package xu;

import android.app.Application;
import android.app.Service;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o implements gv.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final Service f98357a;

    /* renamed from: b, reason: collision with root package name */
    public Object f98358b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({fv.a.class})
    @pu.b
    public interface a {
        uu.d b();
    }

    public o(Service service) {
        this.f98357a = service;
    }

    private Object a() {
        Application application = this.f98357a.getApplication();
        gv.f.d(application instanceof gv.c, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) pu.c.a(application, a.class)).b().a(this.f98357a).build();
    }

    @Override // gv.c
    public Object generatedComponent() {
        if (this.f98358b == null) {
            this.f98358b = a();
        }
        return this.f98358b;
    }
}
