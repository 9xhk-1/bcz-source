package r0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends a<ImageView> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f82774b;

    public b(@k ImageView imageView) {
        this.f82774b = imageView;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && g0.g(getView(), ((b) obj).getView());
    }

    @Override // r0.a, t0.d
    @l
    public Drawable h() {
        return getView().getDrawable();
    }

    public int hashCode() {
        return getView().hashCode();
    }

    @Override // r0.a
    public void o(@l Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    @Override // r0.d, t0.d
    @k
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ImageView getView() {
        return this.f82774b;
    }
}
