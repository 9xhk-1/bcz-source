package cl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends q<Bitmap> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // cl.q
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Drawable w(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f8775b).getResources(), bitmap);
    }

    @Deprecated
    public d(ImageView imageView, boolean z11) {
        super(imageView, z11);
    }
}
