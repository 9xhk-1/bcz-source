package xk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fl.m;
import kk.u;
import sk.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f98130a;

    public b(@NonNull Context context) {
        this(context.getResources());
    }

    @Override // xk.e
    @Nullable
    public u<BitmapDrawable> a(@NonNull u<Bitmap> uVar, @NonNull ik.e eVar) {
        return t0.c(this.f98130a, uVar);
    }

    @Deprecated
    public b(@NonNull Resources resources, lk.e eVar) {
        this(resources);
    }

    public b(@NonNull Resources resources) {
        this.f98130a = (Resources) m.e(resources);
    }
}
