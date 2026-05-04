package sk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import dl.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j extends com.bumptech.glide.l<j, Bitmap> {
    @NonNull
    public static j n(@NonNull dl.g<Bitmap> gVar) {
        return new j().f(gVar);
    }

    @NonNull
    public static j o() {
        return new j().h();
    }

    @NonNull
    public static j p(int i11) {
        return new j().i(i11);
    }

    @NonNull
    public static j q(@NonNull c.a aVar) {
        return new j().j(aVar);
    }

    @NonNull
    public static j s(@NonNull dl.c cVar) {
        return new j().l(cVar);
    }

    @NonNull
    public static j t(@NonNull dl.g<Drawable> gVar) {
        return new j().m(gVar);
    }

    @Override // com.bumptech.glide.l
    public boolean equals(Object obj) {
        return (obj instanceof j) && super.equals(obj);
    }

    @NonNull
    public j h() {
        return j(new c.a());
    }

    @Override // com.bumptech.glide.l
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public j i(int i11) {
        return j(new c.a(i11));
    }

    @NonNull
    public j j(@NonNull c.a aVar) {
        return m(aVar.a());
    }

    @NonNull
    public j l(@NonNull dl.c cVar) {
        return m(cVar);
    }

    @NonNull
    public j m(@NonNull dl.g<Drawable> gVar) {
        return f(new dl.b(gVar));
    }
}
