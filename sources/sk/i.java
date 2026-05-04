package sk;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class i implements ik.h<Bitmap> {
    @Override // ik.h
    @NonNull
    public final kk.u<Bitmap> b(@NonNull Context context, @NonNull kk.u<Bitmap> uVar, int i11, int i12) {
        if (!fl.o.x(i11, i12)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i11 + " or height: " + i12 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        lk.e h11 = com.bumptech.glide.c.e(context).h();
        Bitmap bitmap = uVar.get();
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getWidth();
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = bitmap.getHeight();
        }
        Bitmap c11 = c(h11, bitmap, i11, i12);
        return bitmap.equals(c11) ? uVar : h.c(c11, h11);
    }

    public abstract Bitmap c(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12);
}
