package sk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class x0 extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final String f88814d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f88815e = f88814d.getBytes(ik.b.f60686b);

    /* renamed from: c, reason: collision with root package name */
    public final int f88816c;

    public x0(int i11) {
        this.f88816c = i11;
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f88815e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f88816c).array());
    }

    @Override // sk.i
    public Bitmap c(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return z0.n(bitmap, this.f88816c);
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        return (obj instanceof x0) && this.f88816c == ((x0) obj).f88816c;
    }

    @Override // ik.b
    public int hashCode() {
        return fl.o.q(-950519196, fl.o.p(this.f88816c));
    }
}
