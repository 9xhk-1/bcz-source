package sk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a<DataType> implements ik.f<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final ik.f<DataType, Bitmap> f88733a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f88734b;

    public a(Context context, ik.f<DataType, Bitmap> fVar) {
        this(context.getResources(), fVar);
    }

    @Override // ik.f
    public kk.u<BitmapDrawable> a(@NonNull DataType datatype, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        return t0.c(this.f88734b, this.f88733a.a(datatype, i11, i12, eVar));
    }

    @Override // ik.f
    public boolean b(@NonNull DataType datatype, @NonNull ik.e eVar) throws IOException {
        return this.f88733a.b(datatype, eVar);
    }

    @Deprecated
    public a(Resources resources, lk.e eVar, ik.f<DataType, Bitmap> fVar) {
        this(resources, fVar);
    }

    public a(@NonNull Resources resources, @NonNull ik.f<DataType, Bitmap> fVar) {
        this.f88734b = (Resources) fl.m.e(resources);
        this.f88733a = (ik.f) fl.m.e(fVar);
    }
}
