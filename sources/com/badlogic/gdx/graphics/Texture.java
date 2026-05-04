package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n2.v;
import r1.c;
import s1.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Texture extends j {

    /* renamed from: j, reason: collision with root package name */
    public static r1.e f11504j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Application, com.badlogic.gdx.utils.a<Texture>> f11505k = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public TextureData f11506i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TextureFilter {
        Nearest(f.f11692x2),
        Linear(9729),
        MipMap(9987),
        MipMapNearestNearest(f.f11704z2),
        MipMapLinearNearest(f.A2),
        MipMapNearestLinear(f.B2),
        MipMapLinearLinear(9987);

        final int glEnum;

        TextureFilter(int i11) {
            this.glEnum = i11;
        }

        public int getGLEnum() {
            return this.glEnum;
        }

        public boolean isMipMap() {
            int i11 = this.glEnum;
            return (i11 == 9728 || i11 == 9729) ? false : true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TextureWrap {
        MirroredRepeat(f.A3),
        ClampToEdge(f.f11705z3),
        Repeat(f.f11699y3);

        final int glEnum;

        TextureWrap(int i11) {
            this.glEnum = i11;
        }

        public int getGLEnum() {
            return this.glEnum;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11507a;

        public a(int i11) {
            this.f11507a = i11;
        }

        @Override // r1.c.a
        public void a(r1.e eVar, String str, Class cls) {
            eVar.D1(str, this.f11507a);
        }
    }

    public Texture() {
        super(0, 0);
    }

    public static void k1(Application application, Texture texture) {
        Map<Application, com.badlogic.gdx.utils.a<Texture>> map = f11505k;
        com.badlogic.gdx.utils.a<Texture> aVar = map.get(application);
        if (aVar == null) {
            aVar = new com.badlogic.gdx.utils.a<>();
        }
        aVar.a(texture);
        map.put(application, aVar);
    }

    public static void l1(Application application) {
        f11505k.remove(application);
    }

    public static String n1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Managed textures/app: { ");
        Iterator<Application> it = f11505k.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(f11505k.get(it.next()).f13179b);
            sb2.append(" ");
        }
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }

    public static int o1() {
        return f11505k.get(q1.g.f81378a).f13179b;
    }

    public static void q1(Application application) {
        com.badlogic.gdx.utils.a<Texture> aVar = f11505k.get(application);
        if (aVar == null) {
            return;
        }
        r1.e eVar = f11504j;
        if (eVar == null) {
            for (int i11 = 0; i11 < aVar.f13179b; i11++) {
                aVar.get(i11).Q0();
            }
            return;
        }
        eVar.X();
        com.badlogic.gdx.utils.a<? extends Texture> aVar2 = new com.badlogic.gdx.utils.a<>(aVar);
        a.b<? extends Texture> it = aVar2.iterator();
        while (it.hasNext()) {
            Texture next = it.next();
            String a12 = f11504j.a1(next);
            if (a12 == null) {
                next.Q0();
            } else {
                int m12 = f11504j.m1(a12);
                f11504j.D1(a12, 0);
                next.f12452b = 0;
                p.b bVar = new p.b();
                bVar.f87130e = next.p1();
                bVar.f87131f = next.Z();
                bVar.f87132g = next.R();
                bVar.f87133h = next.n0();
                bVar.f87134i = next.w0();
                bVar.f87128c = next.f11506i.e();
                bVar.f87129d = next;
                bVar.f82826a = new a(m12);
                f11504j.F1(a12);
                next.f12452b = q1.g.f81384g.p();
                f11504j.w1(a12, Texture.class, bVar);
            }
        }
        aVar.clear();
        aVar.g(aVar2);
    }

    public static void s1(r1.e eVar) {
        f11504j = eVar;
    }

    @Override // com.badlogic.gdx.graphics.j
    public int C0() {
        return this.f11506i.getWidth();
    }

    @Override // com.badlogic.gdx.graphics.j
    public int D() {
        return 0;
    }

    @Override // com.badlogic.gdx.graphics.j
    public int I() {
        return this.f11506i.getHeight();
    }

    @Override // com.badlogic.gdx.graphics.j
    public boolean J0() {
        return this.f11506i.a();
    }

    @Override // com.badlogic.gdx.graphics.j
    public void Q0() {
        if (!J0()) {
            throw new GdxRuntimeException("Tried to reload unmanaged Texture");
        }
        this.f12452b = q1.g.f81384g.p();
        r1(this.f11506i);
    }

    @Override // com.badlogic.gdx.graphics.j, a3.q
    public void dispose() {
        if (this.f12452b == 0) {
            return;
        }
        o();
        if (this.f11506i.a()) {
            Map<Application, com.badlogic.gdx.utils.a<Texture>> map = f11505k;
            if (map.get(q1.g.f81378a) != null) {
                map.get(q1.g.f81378a).C(this, true);
            }
        }
    }

    public void m1(Pixmap pixmap, int i11, int i12) {
        if (this.f11506i.a()) {
            throw new GdxRuntimeException("can't draw to a managed texture");
        }
        S();
        q1.g.f81384g.glTexSubImage2D(this.f12451a, 0, i11, i12, pixmap.i1(), pixmap.f1(), pixmap.c1(), pixmap.e1(), pixmap.h1());
    }

    public TextureData p1() {
        return this.f11506i;
    }

    public void r1(TextureData textureData) {
        if (this.f11506i != null && textureData.a() != this.f11506i.a()) {
            throw new GdxRuntimeException("New data must have the same managed status as the old data");
        }
        this.f11506i = textureData;
        if (!textureData.b()) {
            textureData.prepare();
        }
        S();
        j.i1(f.f11552a0, textureData);
        f1(this.f12453c, this.f12454d, true);
        h1(this.f12455e, this.f12456f, true);
        d1(this.f12457g, true);
        q1.g.f81384g.glBindTexture(this.f12451a, 0);
    }

    public String toString() {
        TextureData textureData = this.f11506i;
        return textureData instanceof n2.d ? textureData.toString() : super.toString();
    }

    public Texture(String str) {
        this(q1.g.f81382e.a(str));
    }

    public Texture(v1.a aVar) {
        this(aVar, (Pixmap.Format) null, false);
    }

    public Texture(v1.a aVar, boolean z11) {
        this(aVar, (Pixmap.Format) null, z11);
    }

    public Texture(v1.a aVar, Pixmap.Format format, boolean z11) {
        this(TextureData.a.a(aVar, format, z11));
    }

    public Texture(Pixmap pixmap) {
        this(new v(pixmap, null, false, false));
    }

    public Texture(Pixmap pixmap, boolean z11) {
        this(new v(pixmap, null, z11, false));
    }

    public Texture(Pixmap pixmap, Pixmap.Format format, boolean z11) {
        this(new v(pixmap, format, z11, false));
    }

    public Texture(int i11, int i12, Pixmap.Format format) {
        this(new v(new Pixmap(i11, i12, format), null, false, true));
    }

    public Texture(TextureData textureData) {
        this(f.f11552a0, q1.g.f81384g.p(), textureData);
    }

    public Texture(int i11, int i12, TextureData textureData) {
        super(i11, i12);
        r1(textureData);
        if (textureData.a()) {
            k1(q1.g.f81378a, this);
        }
    }
}
