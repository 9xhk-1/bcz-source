package sk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class t implements ik.h<Drawable> {

    /* renamed from: c, reason: collision with root package name */
    public final ik.h<Bitmap> f88798c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f88799d;

    public t(ik.h<Bitmap> hVar, boolean z11) {
        this.f88798c = hVar;
        this.f88799d = z11;
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        this.f88798c.a(messageDigest);
    }

    @Override // ik.h
    @NonNull
    public kk.u<Drawable> b(@NonNull Context context, @NonNull kk.u<Drawable> uVar, int i11, int i12) {
        lk.e h11 = com.bumptech.glide.c.e(context).h();
        Drawable drawable = uVar.get();
        kk.u<Bitmap> a11 = s.a(h11, drawable, i11, i12);
        if (a11 != null) {
            kk.u<Bitmap> b11 = this.f88798c.b(context, a11, i11, i12);
            if (!b11.equals(a11)) {
                return d(context, b11);
            }
            b11.recycle();
            return uVar;
        }
        if (!this.f88799d) {
            return uVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public final kk.u<Drawable> d(Context context, kk.u<Bitmap> uVar) {
        return t0.c(context.getResources(), uVar);
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f88798c.equals(((t) obj).f88798c);
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return this.f88798c.hashCode();
    }

    public ik.h<BitmapDrawable> c() {
        return this;
    }
}
