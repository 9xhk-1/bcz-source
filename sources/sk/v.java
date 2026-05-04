package sk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class v extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final String f88804c = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f88805d = f88804c.getBytes(ik.b.f60686b);

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f88805d);
    }

    @Override // sk.i
    public Bitmap c(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return z0.f(eVar, bitmap, i11, i12);
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        return obj instanceof v;
    }

    @Override // ik.b
    public int hashCode() {
        return 1572326941;
    }
}
