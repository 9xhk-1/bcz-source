package w70;

import java.util.Map;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes9.dex */
public class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final c80.g0<v<?>> f95694a = new c80.g0<>();

    @Override // w70.y
    public v<?> a(String str) {
        return this.f95694a.c(str);
    }

    public Map<String, v<?>> b() {
        return this.f95694a.b();
    }

    public void c(String str, v<?> vVar) {
        this.f95694a.e(str, vVar);
    }

    public void d(Map<String, v<?>> map) {
        this.f95694a.g(map);
    }

    public void e(String str) {
        this.f95694a.h(str);
    }
}
