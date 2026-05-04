package sk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class w0 implements ik.f<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final uk.k f88812a;

    /* renamed from: b, reason: collision with root package name */
    public final lk.e f88813b;

    public w0(uk.k kVar, lk.e eVar) {
        this.f88812a = kVar;
        this.f88813b = eVar;
    }

    @Override // ik.f
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kk.u<Bitmap> a(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        kk.u<Drawable> a11 = this.f88812a.a(uri, i11, i12, eVar);
        if (a11 == null) {
            return null;
        }
        return s.a(this.f88813b, a11.get(), i11, i12);
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull ik.e eVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
