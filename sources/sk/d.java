package sk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes6.dex */
public class d implements ik.h<BitmapDrawable> {

    /* renamed from: c, reason: collision with root package name */
    public final ik.h<Drawable> f88739c;

    public d(ik.h<Bitmap> hVar) {
        this.f88739c = (ik.h) fl.m.e(new t(hVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kk.u<BitmapDrawable> c(kk.u<Drawable> uVar) {
        if (uVar.get() instanceof BitmapDrawable) {
            return uVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + uVar.get());
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        this.f88739c.a(messageDigest);
    }

    @Override // ik.h
    @NonNull
    public kk.u<BitmapDrawable> b(@NonNull Context context, @NonNull kk.u<BitmapDrawable> uVar, int i11, int i12) {
        return c(this.f88739c.b(context, d(uVar), i11, i12));
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f88739c.equals(((d) obj).f88739c);
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return this.f88739c.hashCode();
    }

    public static kk.u<Drawable> d(kk.u<BitmapDrawable> uVar) {
        return uVar;
    }
}
