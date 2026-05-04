package cl;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Override // cl.j
    public void u(@Nullable T t11) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f8775b).getLayoutParams();
        Drawable w11 = w(t11);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            w11 = new i(w11, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f8775b).setImageDrawable(w11);
    }

    public abstract Drawable w(T t11);

    @Deprecated
    public q(ImageView imageView, boolean z11) {
        super(imageView, z11);
    }
}
