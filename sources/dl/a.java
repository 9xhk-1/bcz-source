package dl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import dl.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    public final g<Drawable> f48022a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dl.a$a, reason: collision with other inner class name */
    public final class C0571a implements f<R> {

        /* renamed from: a, reason: collision with root package name */
        public final f<Drawable> f48023a;

        public C0571a(f<Drawable> fVar) {
            this.f48023a = fVar;
        }

        @Override // dl.f
        public boolean a(R r11, f.a aVar) {
            return this.f48023a.a(new BitmapDrawable(aVar.getView().getResources(), a.this.b(r11)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f48022a = gVar;
    }

    @Override // dl.g
    public f<R> a(DataSource dataSource, boolean z11) {
        return new C0571a(this.f48022a.a(dataSource, z11));
    }

    public abstract Bitmap b(R r11);
}
