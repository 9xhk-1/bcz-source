package kk;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d implements ik.b {

    /* renamed from: c, reason: collision with root package name */
    public final ik.b f66644c;

    /* renamed from: d, reason: collision with root package name */
    public final ik.b f66645d;

    public d(ik.b bVar, ik.b bVar2) {
        this.f66644c = bVar;
        this.f66645d = bVar2;
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        this.f66644c.a(messageDigest);
        this.f66645d.a(messageDigest);
    }

    public ik.b c() {
        return this.f66644c;
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f66644c.equals(dVar.f66644c) && this.f66645d.equals(dVar.f66645d)) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return (this.f66644c.hashCode() * 31) + this.f66645d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f66644c + ", signature=" + this.f66645d + l50.b.f69928j;
    }
}
