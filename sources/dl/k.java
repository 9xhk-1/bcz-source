package dl;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import dl.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    public final a f48042a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        Animation a(Context context);
    }

    public k(a aVar) {
        this.f48042a = aVar;
    }

    @Override // dl.f
    public boolean a(R r11, f.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f48042a.a(view.getContext()));
        return false;
    }
}
