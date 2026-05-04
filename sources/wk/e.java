package wk;

import androidx.annotation.NonNull;
import kk.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends uk.h<c> implements q {
    public e(c cVar) {
        super(cVar);
    }

    @Override // kk.u
    @NonNull
    public Class<c> a() {
        return c.class;
    }

    @Override // kk.u
    public int getSize() {
        return ((c) this.f92270a).j();
    }

    @Override // uk.h, kk.q
    public void initialize() {
        ((c) this.f92270a).e().prepareToDraw();
    }

    @Override // kk.u
    public void recycle() {
        ((c) this.f92270a).stop();
        ((c) this.f92270a).m();
    }
}
