package xu;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a implements gv.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f98334a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f98335b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Activity f98336c;

    /* renamed from: d, reason: collision with root package name */
    public final gv.c<ru.b> f98337d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.b.class})
    @pu.b
    /* renamed from: xu.a$a, reason: collision with other inner class name */
    public interface InterfaceC1328a {
        uu.a a();
    }

    public a(Activity activity) {
        this.f98336c = activity;
        this.f98337d = new b((ComponentActivity) activity);
    }

    public Object a() {
        String str;
        if (this.f98336c.getApplication() instanceof gv.c) {
            return ((InterfaceC1328a) pu.c.a(this.f98337d, InterfaceC1328a.class)).a().a(this.f98336c).build();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f98336c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f98336c.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    public final l b() {
        return ((b) this.f98337d).c();
    }

    @Override // gv.c
    public Object generatedComponent() {
        if (this.f98334a == null) {
            synchronized (this.f98335b) {
                try {
                    if (this.f98334a == null) {
                        this.f98334a = a();
                    }
                } finally {
                }
            }
        }
        return this.f98334a;
    }
}
