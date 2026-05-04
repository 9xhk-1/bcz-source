package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n extends j {

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Application, com.badlogic.gdx.utils.a<n>> f12483k = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public o f12484i;

    /* renamed from: j, reason: collision with root package name */
    public Texture.TextureWrap f12485j;

    public n(int i11, int i12, int i13, int i14, int i15, int i16) {
        this(new n2.a(i11, i12, i13, 0, i14, i15, i16));
    }

    public static void k1(Application application, n nVar) {
        Map<Application, com.badlogic.gdx.utils.a<n>> map = f12483k;
        com.badlogic.gdx.utils.a<n> aVar = map.get(application);
        if (aVar == null) {
            aVar = new com.badlogic.gdx.utils.a<>();
        }
        aVar.a(nVar);
        map.put(application, aVar);
    }

    public static void l1(Application application) {
        f12483k.remove(application);
    }

    public static String n1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Managed TextureArrays/app: { ");
        Iterator<Application> it = f12483k.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(f12483k.get(it.next()).f13179b);
            sb2.append(" ");
        }
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }

    public static int o1() {
        return f12483k.get(q1.g.f81378a).f13179b;
    }

    public static void p1(Application application) {
        com.badlogic.gdx.utils.a<n> aVar = f12483k.get(application);
        if (aVar == null) {
            return;
        }
        for (int i11 = 0; i11 < aVar.f13179b; i11++) {
            aVar.get(i11).Q0();
        }
    }

    @Override // com.badlogic.gdx.graphics.j
    public int C0() {
        return this.f12484i.getWidth();
    }

    @Override // com.badlogic.gdx.graphics.j
    public int D() {
        return this.f12484i.getDepth();
    }

    @Override // com.badlogic.gdx.graphics.j
    public int I() {
        return this.f12484i.getHeight();
    }

    @Override // com.badlogic.gdx.graphics.j
    public boolean J0() {
        return this.f12484i.a();
    }

    @Override // com.badlogic.gdx.graphics.j
    public void Q0() {
        if (!J0()) {
            throw new GdxRuntimeException("Tried to reload an unmanaged TextureArray");
        }
        this.f12452b = q1.g.f81384g.p();
        q1(this.f12484i);
    }

    public o m1() {
        return this.f12484i;
    }

    public final void q1(o oVar) {
        if (this.f12484i != null && oVar.a() != this.f12484i.a()) {
            throw new GdxRuntimeException("New data must have the same managed status as the old data");
        }
        this.f12484i = oVar;
        S();
        if (!oVar.b()) {
            oVar.prepare();
        }
        oVar.f();
        a1(this.f12453c, this.f12454d);
        r1(this.f12455e, this.f12456f, this.f12485j);
        q1.g.f81384g.glBindTexture(this.f12451a, 0);
    }

    public void r1(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2, Texture.TextureWrap textureWrap3) {
        this.f12485j = textureWrap3;
        super.b1(textureWrap, textureWrap2);
        q1.g.f81384g.z0(this.f12451a, g.f11797p5, textureWrap3.getGLEnum());
    }

    public void s1(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2, Texture.TextureWrap textureWrap3) {
        t1(textureWrap, textureWrap2, textureWrap3, false);
    }

    public void t1(Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2, Texture.TextureWrap textureWrap3, boolean z11) {
        h1(textureWrap, textureWrap2, z11);
        if (textureWrap3 != null) {
            if (z11 || this.f12485j != textureWrap3) {
                q1.g.f81384g.z0(this.f12451a, g.f11797p5, textureWrap.getGLEnum());
                this.f12485j = textureWrap3;
            }
        }
    }

    public void u1() {
        S();
        this.f12484i.f();
    }

    public n(o oVar) {
        super(g.f11791o5, q1.g.f81384g.p());
        this.f12485j = Texture.TextureWrap.ClampToEdge;
        if (q1.g.f81386i == null) {
            throw new GdxRuntimeException("Texture3D requires a device running with GLES 3.0 compatibilty");
        }
        q1(oVar);
        if (oVar.a()) {
            k1(q1.g.f81378a, this);
        }
    }
}
