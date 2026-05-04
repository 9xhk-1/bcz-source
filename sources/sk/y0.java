package sk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class y0 extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final String f88817d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f88818e = f88817d.getBytes(ik.b.f60686b);

    /* renamed from: c, reason: collision with root package name */
    public final int f88819c;

    public y0(int i11) {
        fl.m.b(i11 > 0, "roundingRadius must be greater than 0.");
        this.f88819c = i11;
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f88818e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f88819c).array());
    }

    @Override // sk.i
    public Bitmap c(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return z0.q(eVar, bitmap, this.f88819c);
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        return (obj instanceof y0) && this.f88819c == ((y0) obj).f88819c;
    }

    @Override // ik.b
    public int hashCode() {
        return fl.o.q(-569625254, fl.o.p(this.f88819c));
    }
}
