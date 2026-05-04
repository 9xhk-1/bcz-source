package sk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class q0 extends i {

    /* renamed from: g, reason: collision with root package name */
    public static final String f88776g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f88777h = f88776g.getBytes(ik.b.f60686b);

    /* renamed from: c, reason: collision with root package name */
    public final float f88778c;

    /* renamed from: d, reason: collision with root package name */
    public final float f88779d;

    /* renamed from: e, reason: collision with root package name */
    public final float f88780e;

    /* renamed from: f, reason: collision with root package name */
    public final float f88781f;

    public q0(float f11, float f12, float f13, float f14) {
        this.f88778c = f11;
        this.f88779d = f12;
        this.f88780e = f13;
        this.f88781f = f14;
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f88777h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f88778c).putFloat(this.f88779d).putFloat(this.f88780e).putFloat(this.f88781f).array());
    }

    @Override // sk.i
    public Bitmap c(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return z0.p(eVar, bitmap, this.f88778c, this.f88779d, this.f88780e, this.f88781f);
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f88778c == q0Var.f88778c && this.f88779d == q0Var.f88779d && this.f88780e == q0Var.f88780e && this.f88781f == q0Var.f88781f) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return fl.o.o(this.f88781f, fl.o.o(this.f88780e, fl.o.o(this.f88779d, fl.o.q(-2013597734, fl.o.n(this.f88778c)))));
    }
}
