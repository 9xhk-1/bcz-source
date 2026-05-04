package wk;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import fl.m;
import java.security.MessageDigest;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f implements ik.h<c> {

    /* renamed from: c, reason: collision with root package name */
    public final ik.h<Bitmap> f96441c;

    public f(ik.h<Bitmap> hVar) {
        this.f96441c = (ik.h) m.e(hVar);
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        this.f96441c.a(messageDigest);
    }

    @Override // ik.h
    @NonNull
    public u<c> b(@NonNull Context context, @NonNull u<c> uVar, int i11, int i12) {
        c cVar = uVar.get();
        u<Bitmap> hVar = new sk.h(cVar.e(), com.bumptech.glide.c.e(context).h());
        u<Bitmap> b11 = this.f96441c.b(context, hVar, i11, i12);
        if (!hVar.equals(b11)) {
            hVar.recycle();
        }
        cVar.o(this.f96441c, b11.get());
        return uVar;
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f96441c.equals(((f) obj).f96441c);
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return this.f96441c.hashCode();
    }
}
