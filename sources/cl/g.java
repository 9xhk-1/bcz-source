package cl;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends j<Drawable> {
    public g(ImageView imageView) {
        super(imageView);
    }

    @Override // cl.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void u(@Nullable Drawable drawable) {
        ((ImageView) this.f8775b).setImageDrawable(drawable);
    }

    @Deprecated
    public g(ImageView imageView, boolean z11) {
        super(imageView, z11);
    }
}
