package k80;

import android.content.res.Resources;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f66016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66018c;

    /* renamed from: e, reason: collision with root package name */
    public i80.c f66020e;

    /* renamed from: g, reason: collision with root package name */
    public String f66022g;

    /* renamed from: h, reason: collision with root package name */
    public int f66023h;

    /* renamed from: i, reason: collision with root package name */
    public Class<?> f66024i;

    /* renamed from: f, reason: collision with root package name */
    public boolean f66021f = true;

    /* renamed from: d, reason: collision with root package name */
    public final f f66019d = new f();

    public b(Resources resources, int i11, int i12) {
        this.f66016a = resources;
        this.f66017b = i11;
        this.f66018c = i12;
    }

    public b a(Class<? extends Throwable> cls, int i11) {
        this.f66019d.a(cls, i11);
        return this;
    }

    public void b() {
        this.f66021f = false;
    }

    public i80.c c() {
        i80.c cVar = this.f66020e;
        return cVar != null ? cVar : i80.c.f();
    }

    public int d(Throwable th2) {
        Integer b11 = this.f66019d.b(th2);
        if (b11 != null) {
            return b11.intValue();
        }
        Log.d(i80.c.f60259s, "No specific message ressource ID found for " + th2);
        return this.f66018c;
    }

    public void e(int i11) {
        this.f66023h = i11;
    }

    public void f(Class<?> cls) {
        this.f66024i = cls;
    }

    public void g(i80.c cVar) {
        this.f66020e = cVar;
    }

    public void h(String str) {
        this.f66022g = str;
    }
}
