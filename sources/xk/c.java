package xk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kk.u;
import sk.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final lk.e f98131a;

    /* renamed from: b, reason: collision with root package name */
    public final e<Bitmap, byte[]> f98132b;

    /* renamed from: c, reason: collision with root package name */
    public final e<wk.c, byte[]> f98133c;

    public c(@NonNull lk.e eVar, @NonNull e<Bitmap, byte[]> eVar2, @NonNull e<wk.c, byte[]> eVar3) {
        this.f98131a = eVar;
        this.f98132b = eVar2;
        this.f98133c = eVar3;
    }

    @Override // xk.e
    @Nullable
    public u<byte[]> a(@NonNull u<Drawable> uVar, @NonNull ik.e eVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f98132b.a(h.c(((BitmapDrawable) drawable).getBitmap(), this.f98131a), eVar);
        }
        if (drawable instanceof wk.c) {
            return this.f98133c.a(b(uVar), eVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static u<wk.c> b(@NonNull u<Drawable> uVar) {
        return uVar;
    }
}
