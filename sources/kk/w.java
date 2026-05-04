package kk;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class w implements ik.b {

    /* renamed from: k, reason: collision with root package name */
    public static final fl.j<Class<?>, byte[]> f66824k = new fl.j<>(50);

    /* renamed from: c, reason: collision with root package name */
    public final lk.b f66825c;

    /* renamed from: d, reason: collision with root package name */
    public final ik.b f66826d;

    /* renamed from: e, reason: collision with root package name */
    public final ik.b f66827e;

    /* renamed from: f, reason: collision with root package name */
    public final int f66828f;

    /* renamed from: g, reason: collision with root package name */
    public final int f66829g;

    /* renamed from: h, reason: collision with root package name */
    public final Class<?> f66830h;

    /* renamed from: i, reason: collision with root package name */
    public final ik.e f66831i;

    /* renamed from: j, reason: collision with root package name */
    public final ik.h<?> f66832j;

    public w(lk.b bVar, ik.b bVar2, ik.b bVar3, int i11, int i12, ik.h<?> hVar, Class<?> cls, ik.e eVar) {
        this.f66825c = bVar;
        this.f66826d = bVar2;
        this.f66827e = bVar3;
        this.f66828f = i11;
        this.f66829g = i12;
        this.f66832j = hVar;
        this.f66830h = cls;
        this.f66831i = eVar;
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f66825c.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f66828f).putInt(this.f66829g).array();
        this.f66827e.a(messageDigest);
        this.f66826d.a(messageDigest);
        messageDigest.update(bArr);
        ik.h<?> hVar = this.f66832j;
        if (hVar != null) {
            hVar.a(messageDigest);
        }
        this.f66831i.a(messageDigest);
        messageDigest.update(c());
        this.f66825c.put(bArr);
    }

    public final byte[] c() {
        fl.j<Class<?>, byte[]> jVar = f66824k;
        byte[] j11 = jVar.j(this.f66830h);
        if (j11 != null) {
            return j11;
        }
        byte[] bytes = this.f66830h.getName().getBytes(ik.b.f60686b);
        jVar.n(this.f66830h, bytes);
        return bytes;
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f66829g == wVar.f66829g && this.f66828f == wVar.f66828f && fl.o.e(this.f66832j, wVar.f66832j) && this.f66830h.equals(wVar.f66830h) && this.f66826d.equals(wVar.f66826d) && this.f66827e.equals(wVar.f66827e) && this.f66831i.equals(wVar.f66831i)) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        int hashCode = (((((this.f66826d.hashCode() * 31) + this.f66827e.hashCode()) * 31) + this.f66828f) * 31) + this.f66829g;
        ik.h<?> hVar = this.f66832j;
        if (hVar != null) {
            hashCode = (hashCode * 31) + hVar.hashCode();
        }
        return (((hashCode * 31) + this.f66830h.hashCode()) * 31) + this.f66831i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f66826d + ", signature=" + this.f66827e + ", width=" + this.f66828f + ", height=" + this.f66829g + ", decodedResourceClass=" + this.f66830h + ", transformation='" + this.f66832j + "', options=" + this.f66831i + l50.b.f69928j;
    }
}
