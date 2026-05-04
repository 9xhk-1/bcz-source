package k2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;
import k2.b;
import l2.m;
import n2.w;
import q1.g;
import x1.d;
import x1.i;
import y1.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: l2, reason: collision with root package name */
    public static String f65150l2;

    /* renamed from: m2, reason: collision with root package name */
    public static String f65151m2;

    /* renamed from: n2, reason: collision with root package name */
    public static final x1.b f65152n2 = new x1.b();

    /* renamed from: j2, reason: collision with root package name */
    public final int f65153j2;

    /* renamed from: k2, reason: collision with root package name */
    public final f f65154k2;

    public c(i iVar) {
        this(iVar, new a());
    }

    public static String C1(i iVar, a aVar) {
        String t12 = b.t1(iVar, aVar);
        if (aVar.f65155k) {
            return t12;
        }
        return t12 + "#define PackedDepthFlag\n";
    }

    public static final x1.b s1(i iVar) {
        x1.b bVar = f65152n2;
        bVar.clear();
        x1.c cVar = iVar.f97050d;
        if (cVar != null) {
            bVar.u(cVar);
        }
        d dVar = iVar.f97049c;
        if (dVar != null) {
            bVar.u(dVar);
        }
        return bVar;
    }

    public static final String x1() {
        if (f65151m2 == null) {
            f65151m2 = g.f81382e.i("com/badlogic/gdx/graphics/g3d/shaders/depth.fragment.glsl").I();
        }
        return f65151m2;
    }

    public static final String y1() {
        if (f65150l2 == null) {
            f65150l2 = g.f81382e.i("com/badlogic/gdx/graphics/g3d/shaders/depth.vertex.glsl").I();
        }
        return f65150l2;
    }

    @Override // k2.b, k2.a
    public void Q0(i iVar, x1.b bVar) {
        long j11 = y1.a.f98941j;
        if (!bVar.p(j11)) {
            super.Q0(iVar, bVar);
            return;
        }
        y1.a aVar = (y1.a) bVar.l(j11);
        bVar.r(j11);
        long j12 = f.f98979i;
        boolean p11 = bVar.p(j12);
        if (!p11) {
            bVar.v(this.f65154k2);
        }
        if (aVar.f98945h >= ((f) bVar.l(j12)).f98980e) {
            super.Q0(iVar, bVar);
        }
        if (!p11) {
            bVar.r(j12);
        }
        bVar.v(aVar);
    }

    @Override // k2.b, k2.a, x1.k
    public void end() {
        super.end();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // k2.b, x1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(x1.i r11) {
        /*
            r10 = this;
            com.badlogic.gdx.math.Matrix4[] r0 = r11.f97051e
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.length
            k2.b$a r2 = r10.X1
            int r2 = r2.f65083f
            if (r0 <= r2) goto Ld
            return r1
        Ld:
            c2.b r0 = r11.f97048b
            com.badlogic.gdx.graphics.Mesh r0 = r0.f7490e
            com.badlogic.gdx.graphics.s r0 = r0.r1()
            int r0 = r0.g()
            k2.b$a r2 = r10.X1
            int r2 = r2.f65084g
            if (r0 <= r2) goto L20
            return r1
        L20:
            x1.b r0 = s1(r11)
            long r2 = r10.T1
            long r4 = y1.a.f98941j
            long r6 = r2 & r4
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 1
            if (r6 != 0) goto L38
            long r8 = y1.j.f98991l
            long r2 = r2 & r8
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L38
            r2 = r7
            goto L39
        L38:
            r2 = r1
        L39:
            boolean r3 = r0.p(r4)
            if (r3 == 0) goto L49
            long r3 = y1.j.f98991l
            boolean r0 = r0.p(r3)
            if (r0 == 0) goto L49
            r0 = r7
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r2 == r0) goto L4d
            return r1
        L4d:
            com.badlogic.gdx.math.Matrix4[] r11 = r11.f97051e
            if (r11 == 0) goto L53
            r11 = r7
            goto L54
        L53:
            r11 = r1
        L54:
            int r0 = r10.f65153j2
            if (r0 <= 0) goto L5a
            r0 = r7
            goto L5b
        L5a:
            r0 = r1
        L5b:
            if (r11 != r0) goto L5e
            return r7
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.u(x1.i):boolean");
    }

    @Override // k2.b, k2.a, x1.k
    public void y0(com.badlogic.gdx.graphics.a aVar, m mVar) {
        super.y0(aVar, mVar);
    }

    public c(i iVar, a aVar) {
        this(iVar, aVar, C1(iVar, aVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(x1.i r8, k2.c.a r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = r9.f65078a
            if (r0 == 0) goto L6
        L4:
            r5 = r0
            goto Lb
        L6:
            java.lang.String r0 = y1()
            goto L4
        Lb:
            java.lang.String r0 = r9.f65079b
            if (r0 == 0) goto L15
        Lf:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            goto L1a
        L15:
            java.lang.String r0 = x1()
            goto Lf
        L1a:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.<init>(x1.i, k2.c$a, java.lang.String):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends b.a {

        /* renamed from: k, reason: collision with root package name */
        public boolean f65155k;

        /* renamed from: l, reason: collision with root package name */
        public float f65156l;

        public a() {
            this.f65155k = false;
            this.f65156l = 0.5f;
            this.f65086i = 1028;
        }

        public a(String str, String str2) {
            super(str, str2);
            this.f65155k = false;
            this.f65156l = 0.5f;
        }
    }

    public c(i iVar, a aVar, String str, String str2, String str3) {
        this(iVar, aVar, new w(str + str2, str + str3));
    }

    public c(i iVar, a aVar, w wVar) {
        super(iVar, aVar, wVar);
        s1(iVar);
        Matrix4[] matrix4Arr = iVar.f97051e;
        if (matrix4Arr != null && matrix4Arr.length > aVar.f65083f) {
            throw new GdxRuntimeException("too many bones: " + iVar.f97051e.length + ", max configured: " + aVar.f65083f);
        }
        this.f65153j2 = matrix4Arr == null ? 0 : aVar.f65083f;
        int g11 = iVar.f97048b.f7490e.r1().g();
        if (g11 <= aVar.f65084g) {
            this.f65154k2 = new f(f.f98979i, aVar.f65156l);
            return;
        }
        throw new GdxRuntimeException("too many bone weights: " + g11 + ", max configured: " + aVar.f65084g);
    }
}
