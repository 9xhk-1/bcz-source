package dl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import dl.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements f<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    public final int f48031a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48032b;

    public d(int i11, boolean z11) {
        this.f48031a = i11;
        this.f48032b = z11;
    }

    @Override // dl.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable a11 = aVar.a();
        if (a11 == null) {
            a11 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{a11, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f48032b);
        transitionDrawable.startTransition(this.f48031a);
        aVar.b(transitionDrawable);
        return true;
    }
}
