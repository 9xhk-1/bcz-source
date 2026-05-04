package el;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements ik.b {

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f49876c;

    /* renamed from: d, reason: collision with root package name */
    public final long f49877d;

    /* renamed from: e, reason: collision with root package name */
    public final int f49878e;

    public d(@Nullable String str, long j11, int i11) {
        this.f49876c = str == null ? "" : str;
        this.f49877d = j11;
        this.f49878e = i11;
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f49877d).putInt(this.f49878e).array());
        messageDigest.update(this.f49876c.getBytes(ik.b.f60686b));
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f49877d == dVar.f49877d && this.f49878e == dVar.f49878e && this.f49876c.equals(dVar.f49876c);
    }

    @Override // ik.b
    public int hashCode() {
        int hashCode = this.f49876c.hashCode() * 31;
        long j11 = this.f49877d;
        return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f49878e;
    }
}
