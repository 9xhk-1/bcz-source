package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n2.v;
import r1.c;
import s1.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Cubemap extends j {

    /* renamed from: j, reason: collision with root package name */
    public static r1.e f11482j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Application, com.badlogic.gdx.utils.a<Cubemap>> f11483k = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public d f11484i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum CubemapSide {
        PositiveX(0, f.K2, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f),
        NegativeX(1, f.L2, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f),
        PositiveY(2, f.M2, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f),
        NegativeY(3, f.N2, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f),
        PositiveZ(4, f.O2, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f),
        NegativeZ(5, f.P2, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f);

        public final Vector3 direction;
        public final int glEnum;
        public final int index;

        /* renamed from: up, reason: collision with root package name */
        public final Vector3 f11485up;

        CubemapSide(int i11, int i12, float f11, float f12, float f13, float f14, float f15, float f16) {
            this.index = i11;
            this.glEnum = i12;
            this.f11485up = new Vector3(f11, f12, f13);
            this.direction = new Vector3(f14, f15, f16);
        }

        public Vector3 getDirection(Vector3 vector3) {
            return vector3.set(this.direction);
        }

        public int getGLEnum() {
            return this.glEnum;
        }

        public Vector3 getUp(Vector3 vector3) {
            return vector3.set(this.f11485up);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11486a;

        public a(int i11) {
            this.f11486a = i11;
        }

        @Override // r1.c.a
        public void a(r1.e eVar, String str, Class cls) {
            eVar.D1(str, this.f11486a);
        }
    }

    public Cubemap(d dVar) {
        super(f.I2);
        this.f11484i = dVar;
        q1(dVar);
        if (dVar.a()) {
            k1(q1.g.f81378a, this);
        }
    }

    public static void k1(Application application, Cubemap cubemap) {
        Map<Application, com.badlogic.gdx.utils.a<Cubemap>> map = f11483k;
        com.badlogic.gdx.utils.a<Cubemap> aVar = map.get(application);
        if (aVar == null) {
            aVar = new com.badlogic.gdx.utils.a<>();
        }
        aVar.a(cubemap);
        map.put(application, aVar);
    }

    public static void l1(Application application) {
        f11483k.remove(application);
    }

    public static String n1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Managed cubemap/app: { ");
        Iterator<Application> it = f11483k.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(f11483k.get(it.next()).f13179b);
            sb2.append(" ");
        }
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }

    public static int o1() {
        return f11483k.get(q1.g.f81378a).f13179b;
    }

    public static void p1(Application application) {
        com.badlogic.gdx.utils.a<Cubemap> aVar = f11483k.get(application);
        if (aVar == null) {
            return;
        }
        r1.e eVar = f11482j;
        if (eVar == null) {
            for (int i11 = 0; i11 < aVar.f13179b; i11++) {
                aVar.get(i11).Q0();
            }
            return;
        }
        eVar.X();
        com.badlogic.gdx.utils.a<? extends Cubemap> aVar2 = new com.badlogic.gdx.utils.a<>(aVar);
        a.b<? extends Cubemap> it = aVar2.iterator();
        while (it.hasNext()) {
            Cubemap next = it.next();
            String a12 = f11482j.a1(next);
            if (a12 == null) {
                next.Q0();
            } else {
                int m12 = f11482j.m1(a12);
                f11482j.D1(a12, 0);
                next.f12452b = 0;
                d.b bVar = new d.b();
                bVar.f87095d = next.m1();
                bVar.f87096e = next.Z();
                bVar.f87097f = next.R();
                bVar.f87098g = next.n0();
                bVar.f87099h = next.w0();
                bVar.f87094c = next;
                bVar.f82826a = new a(m12);
                f11482j.F1(a12);
                next.f12452b = q1.g.f81384g.p();
                f11482j.w1(a12, Cubemap.class, bVar);
            }
        }
        aVar.clear();
        aVar.g(aVar2);
    }

    public static void r1(r1.e eVar) {
        f11482j = eVar;
    }

    @Override // com.badlogic.gdx.graphics.j
    public int C0() {
        return this.f11484i.getWidth();
    }

    @Override // com.badlogic.gdx.graphics.j
    public int D() {
        return 0;
    }

    @Override // com.badlogic.gdx.graphics.j
    public int I() {
        return this.f11484i.getHeight();
    }

    @Override // com.badlogic.gdx.graphics.j
    public boolean J0() {
        return this.f11484i.a();
    }

    @Override // com.badlogic.gdx.graphics.j
    public void Q0() {
        if (!J0()) {
            throw new GdxRuntimeException("Tried to reload an unmanaged Cubemap");
        }
        this.f12452b = q1.g.f81384g.p();
        q1(this.f11484i);
    }

    @Override // com.badlogic.gdx.graphics.j, a3.q
    public void dispose() {
        if (this.f12452b == 0) {
            return;
        }
        o();
        if (this.f11484i.a()) {
            Map<Application, com.badlogic.gdx.utils.a<Cubemap>> map = f11483k;
            if (map.get(q1.g.f81378a) != null) {
                map.get(q1.g.f81378a).C(this, true);
            }
        }
    }

    public d m1() {
        return this.f11484i;
    }

    public void q1(d dVar) {
        if (!dVar.b()) {
            dVar.prepare();
        }
        S();
        f1(this.f12453c, this.f12454d, true);
        h1(this.f12455e, this.f12456f, true);
        d1(this.f12457g, true);
        dVar.f();
        q1.g.f81384g.glBindTexture(this.f12451a, 0);
    }

    public Cubemap(v1.a aVar, v1.a aVar2, v1.a aVar3, v1.a aVar4, v1.a aVar5, v1.a aVar6) {
        this(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, false);
    }

    public Cubemap(v1.a aVar, v1.a aVar2, v1.a aVar3, v1.a aVar4, v1.a aVar5, v1.a aVar6, boolean z11) {
        this(TextureData.a.b(aVar, z11), TextureData.a.b(aVar2, z11), TextureData.a.b(aVar3, z11), TextureData.a.b(aVar4, z11), TextureData.a.b(aVar5, z11), TextureData.a.b(aVar6, z11));
    }

    public Cubemap(Pixmap pixmap, Pixmap pixmap2, Pixmap pixmap3, Pixmap pixmap4, Pixmap pixmap5, Pixmap pixmap6) {
        this(pixmap, pixmap2, pixmap3, pixmap4, pixmap5, pixmap6, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Cubemap(com.badlogic.gdx.graphics.Pixmap r4, com.badlogic.gdx.graphics.Pixmap r5, com.badlogic.gdx.graphics.Pixmap r6, com.badlogic.gdx.graphics.Pixmap r7, com.badlogic.gdx.graphics.Pixmap r8, com.badlogic.gdx.graphics.Pixmap r9, boolean r10) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r4 != 0) goto L6
            r2 = r1
            goto Lb
        L6:
            n2.v r2 = new n2.v
            r2.<init>(r4, r1, r10, r0)
        Lb:
            if (r5 != 0) goto Lf
            r4 = r1
            goto L14
        Lf:
            n2.v r4 = new n2.v
            r4.<init>(r5, r1, r10, r0)
        L14:
            if (r6 != 0) goto L18
            r5 = r1
            goto L1d
        L18:
            n2.v r5 = new n2.v
            r5.<init>(r6, r1, r10, r0)
        L1d:
            if (r7 != 0) goto L21
            r6 = r1
            goto L26
        L21:
            n2.v r6 = new n2.v
            r6.<init>(r7, r1, r10, r0)
        L26:
            if (r8 != 0) goto L2a
            r7 = r1
            goto L2f
        L2a:
            n2.v r7 = new n2.v
            r7.<init>(r8, r1, r10, r0)
        L2f:
            if (r9 != 0) goto L39
            r10 = r1
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r2
        L37:
            r4 = r3
            goto L45
        L39:
            n2.v r8 = new n2.v
            r8.<init>(r9, r1, r10, r0)
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r2
            r6 = r4
            goto L37
        L45:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.Cubemap.<init>(com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, com.badlogic.gdx.graphics.Pixmap, boolean):void");
    }

    public Cubemap(int i11, int i12, int i13, Pixmap.Format format) {
        this(new v(new Pixmap(i13, i12, format), null, false, true), new v(new Pixmap(i13, i12, format), null, false, true), new v(new Pixmap(i11, i13, format), null, false, true), new v(new Pixmap(i11, i13, format), null, false, true), new v(new Pixmap(i11, i12, format), null, false, true), new v(new Pixmap(i11, i12, format), null, false, true));
    }

    public Cubemap(TextureData textureData, TextureData textureData2, TextureData textureData3, TextureData textureData4, TextureData textureData5, TextureData textureData6) {
        this(new n2.b(textureData, textureData2, textureData3, textureData4, textureData5, textureData6));
    }
}
