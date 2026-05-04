package el;

import androidx.annotation.NonNull;
import fl.m;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e implements ik.b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f49879c;

    public e(@NonNull Object obj) {
        this.f49879c = m.e(obj);
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f49879c.toString().getBytes(ik.b.f60686b));
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f49879c.equals(((e) obj).f49879c);
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return this.f49879c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f49879c + l50.b.f69928j;
    }
}
