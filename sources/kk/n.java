package kk;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class n implements ik.b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f66787c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66788d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66789e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f66790f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f66791g;

    /* renamed from: h, reason: collision with root package name */
    public final ik.b f66792h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<Class<?>, ik.h<?>> f66793i;

    /* renamed from: j, reason: collision with root package name */
    public final ik.e f66794j;

    /* renamed from: k, reason: collision with root package name */
    public int f66795k;

    public n(Object obj, ik.b bVar, int i11, int i12, Map<Class<?>, ik.h<?>> map, Class<?> cls, Class<?> cls2, ik.e eVar) {
        this.f66787c = fl.m.e(obj);
        this.f66792h = (ik.b) fl.m.f(bVar, "Signature must not be null");
        this.f66788d = i11;
        this.f66789e = i12;
        this.f66793i = (Map) fl.m.e(map);
        this.f66790f = (Class) fl.m.f(cls, "Resource class must not be null");
        this.f66791g = (Class) fl.m.f(cls2, "Transcode class must not be null");
        this.f66794j = (ik.e) fl.m.e(eVar);
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f66787c.equals(nVar.f66787c) && this.f66792h.equals(nVar.f66792h) && this.f66789e == nVar.f66789e && this.f66788d == nVar.f66788d && this.f66793i.equals(nVar.f66793i) && this.f66790f.equals(nVar.f66790f) && this.f66791g.equals(nVar.f66791g) && this.f66794j.equals(nVar.f66794j)) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        if (this.f66795k == 0) {
            int hashCode = this.f66787c.hashCode();
            this.f66795k = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f66792h.hashCode()) * 31) + this.f66788d) * 31) + this.f66789e;
            this.f66795k = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f66793i.hashCode();
            this.f66795k = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f66790f.hashCode();
            this.f66795k = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f66791g.hashCode();
            this.f66795k = hashCode5;
            this.f66795k = (hashCode5 * 31) + this.f66794j.hashCode();
        }
        return this.f66795k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f66787c + ", width=" + this.f66788d + ", height=" + this.f66789e + ", resourceClass=" + this.f66790f + ", transcodeClass=" + this.f66791g + ", signature=" + this.f66792h + ", hashCode=" + this.f66795k + ", transformations=" + this.f66793i + ", options=" + this.f66794j + l50.b.f69928j;
    }
}
