package z1;

import a3.v0;
import java.util.Comparator;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final int f100589b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f100590c = 1;

    /* renamed from: a, reason: collision with root package name */
    public a f100591a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            if (bVar.m() == bVar2.m()) {
                return 0;
            }
            return bVar.m() - bVar2.m() < 0.0f ? -1 : 1;
        }
    }

    @Override // z1.f
    public void D(int i11, com.badlogic.gdx.utils.a<b> aVar) {
        if (i11 == 1) {
            v0.a().c(aVar, this.f100591a);
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            q1.g.f81384g.glDepthMask(false);
        }
    }

    @Override // z1.f
    public void I(int i11) {
        if (i11 == 1) {
            q1.g.f81384g.glDepthMask(true);
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        }
    }

    @Override // z1.f
    public w R(int i11) {
        return null;
    }

    @Override // z1.f
    public void b() {
        q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11552a0);
    }

    @Override // z1.f
    public int o(b bVar) {
        return !bVar.c().c() ? 1 : 0;
    }

    @Override // z1.f
    public void z() {
        q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11552a0);
    }
}
