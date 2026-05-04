package q2;

import com.badlogic.gdx.utils.l;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public l<String, Object> f81459a = new l<>();

    public void a() {
        this.f81459a.clear();
    }

    public boolean b(String str) {
        return this.f81459a.b(str);
    }

    public Object c(String str) {
        return this.f81459a.k(str);
    }

    public <T> T d(String str, Class<T> cls) {
        return (T) c(str);
    }

    public <T> T e(String str, T t11, Class<T> cls) {
        T t12 = (T) c(str);
        return t12 == null ? t11 : t12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return Objects.equals(this.f81459a, ((h) obj).f81459a);
        }
        return false;
    }

    public Iterator<String> f() {
        return this.f81459a.n();
    }

    public Iterator<Object> g() {
        return this.f81459a.z();
    }

    public void h(String str, Object obj) {
        this.f81459a.r(str, obj);
    }

    public int hashCode() {
        return this.f81459a.hashCode();
    }

    public void i(h hVar) {
        this.f81459a.s(hVar.f81459a);
    }

    public void j(String str) {
        this.f81459a.u(str);
    }

    public String toString() {
        return "MapProperties{properties=" + this.f81459a + l50.b.f69928j;
    }
}
