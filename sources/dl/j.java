package dl;

import android.view.View;
import dl.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    public final a f48041a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f48041a = aVar;
    }

    @Override // dl.f
    public boolean a(R r11, f.a aVar) {
        if (aVar.getView() == null) {
            return false;
        }
        this.f48041a.a(aVar.getView());
        return false;
    }
}
