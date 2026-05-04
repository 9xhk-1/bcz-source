package com.esotericsoftware.spine;

import a3.d0;
import a3.r;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.a;
import com.esotericsoftware.spine.h;
import jl.m;
import jl.n;
import jl.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Skeleton {

    /* renamed from: q, reason: collision with root package name */
    public static final short[] f29191q = {0, 1, 2, 2, 3, 0};

    /* renamed from: a, reason: collision with root package name */
    public final jl.i f29192a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f29193b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<m> f29194c;

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<m> f29195d;

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c> f29196e;

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<i> f29197f;

    /* renamed from: g, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f29198g;

    /* renamed from: h, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<e> f29199h;

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<j> f29200i;

    /* renamed from: j, reason: collision with root package name */
    @d0
    public h f29201j;

    /* renamed from: k, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f29202k;

    /* renamed from: l, reason: collision with root package name */
    public float f29203l;

    /* renamed from: m, reason: collision with root package name */
    public float f29204m;

    /* renamed from: n, reason: collision with root package name */
    public float f29205n;

    /* renamed from: o, reason: collision with root package name */
    public float f29206o;

    /* renamed from: p, reason: collision with root package name */
    public float f29207p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Physics {
        none,
        reset,
        update,
        pose
    }

    public Skeleton(jl.i iVar) {
        b bVar;
        this.f29200i = new com.badlogic.gdx.utils.a<>();
        this.f29205n = 1.0f;
        this.f29206o = 1.0f;
        if (iVar == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        this.f29192a = iVar;
        com.badlogic.gdx.utils.a<b> aVar = new com.badlogic.gdx.utils.a<>(iVar.f64359b.f13179b);
        this.f29193b = aVar;
        b[] bVarArr = aVar.f13178a;
        a.b<BoneData> it = iVar.f64359b.iterator();
        while (it.hasNext()) {
            BoneData next = it.next();
            BoneData boneData = next.f29166c;
            if (boneData == null) {
                bVar = new b(next, this, (b) null);
            } else {
                b bVar2 = bVarArr[boneData.f29164a];
                b bVar3 = new b(next, this, bVar2);
                bVar2.f29333d.a(bVar3);
                bVar = bVar3;
            }
            this.f29193b.a(bVar);
        }
        this.f29194c = new com.badlogic.gdx.utils.a<>(iVar.f64360c.f13179b);
        this.f29195d = new com.badlogic.gdx.utils.a<>(iVar.f64360c.f13179b);
        a.b<n> it2 = iVar.f64360c.iterator();
        while (it2.hasNext()) {
            n next2 = it2.next();
            m mVar = new m(next2, bVarArr[next2.f64417c.f29164a]);
            this.f29194c.a(mVar);
            this.f29195d.a(mVar);
        }
        this.f29196e = new com.badlogic.gdx.utils.a<>(iVar.f64365h.f13179b);
        a.b<jl.e> it3 = iVar.f64365h.iterator();
        while (it3.hasNext()) {
            this.f29196e.a(new c(it3.next(), this));
        }
        this.f29197f = new com.badlogic.gdx.utils.a<>(iVar.f64366i.f13179b);
        a.b<o> it4 = iVar.f64366i.iterator();
        while (it4.hasNext()) {
            this.f29197f.a(new i(it4.next(), this));
        }
        this.f29198g = new com.badlogic.gdx.utils.a<>(iVar.f64367j.f13179b);
        a.b<PathConstraintData> it5 = iVar.f64367j.iterator();
        while (it5.hasNext()) {
            this.f29198g.a(new d(it5.next(), this));
        }
        this.f29199h = new com.badlogic.gdx.utils.a<>(iVar.f64368k.f13179b);
        a.b<jl.f> it6 = iVar.f64368k.iterator();
        while (it6.hasNext()) {
            this.f29199h.a(new e(it6.next(), this));
        }
        this.f29202k = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        c0();
    }

    public float A() {
        return this.f29204m;
    }

    public void B(float f11, float f12, float f13) {
        com.badlogic.gdx.utils.a<e> aVar = this.f29199h;
        e[] eVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            eVarArr[i12].l(f11, f12, f13);
        }
    }

    public void C(float f11, float f12) {
        com.badlogic.gdx.utils.a<e> aVar = this.f29199h;
        e[] eVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            eVarArr[i12].v(f11, f12);
        }
    }

    public void D(String str, @d0 String str2) {
        ol.b bVar;
        if (str == null) {
            throw new IllegalArgumentException("slotName cannot be null.");
        }
        m e11 = e(str);
        if (e11 == null) {
            throw new IllegalArgumentException("Slot not found: " + str);
        }
        if (str2 != null) {
            bVar = g(e11.f64407a.f64415a, str2);
            if (bVar == null) {
                throw new IllegalArgumentException("Attachment not found: " + str2 + ", for slot: " + str);
            }
        } else {
            bVar = null;
        }
        e11.i(bVar);
    }

    public void E() {
        com.badlogic.gdx.utils.a<b> aVar = this.f29193b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            bVarArr[i12].d0();
        }
        com.badlogic.gdx.utils.a<c> aVar2 = this.f29196e;
        c[] cVarArr = aVar2.f13178a;
        int i13 = aVar2.f13179b;
        for (int i14 = 0; i14 < i13; i14++) {
            cVarArr[i14].r();
        }
        com.badlogic.gdx.utils.a<i> aVar3 = this.f29197f;
        i[] iVarArr = aVar3.f13178a;
        int i15 = aVar3.f13179b;
        for (int i16 = 0; i16 < i15; i16++) {
            iVarArr[i16].v();
        }
        com.badlogic.gdx.utils.a<d> aVar4 = this.f29198g;
        d[] dVarArr = aVar4.f13178a;
        int i17 = aVar4.f13179b;
        for (int i18 = 0; i18 < i17; i18++) {
            dVarArr[i18].t();
        }
        com.badlogic.gdx.utils.a<e> aVar5 = this.f29199h;
        e[] eVarArr = aVar5.f13178a;
        int i19 = aVar5.f13179b;
        for (int i21 = 0; i21 < i19; i21++) {
            eVarArr[i21].t();
        }
    }

    public void F(float f11, float f12, float f13, float f14) {
        this.f29202k.F(f11, f12, f13, f14);
    }

    public void G(com.badlogic.gdx.graphics.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("color cannot be null.");
        }
        this.f29202k.H(bVar);
    }

    public void H(com.badlogic.gdx.utils.a<m> aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("drawOrder cannot be null.");
        }
        this.f29195d = aVar;
    }

    public void I(float f11, float f12) {
        this.f29203l = f11;
        this.f29204m = f12;
    }

    public void J(float f11, float f12) {
        this.f29205n = f11;
        this.f29206o = f12;
    }

    public void K(float f11) {
        this.f29205n = f11;
    }

    public void L(float f11) {
        this.f29206o = f11;
    }

    public void M(@d0 h hVar) {
        ol.b e11;
        h hVar2 = this.f29201j;
        if (hVar == hVar2) {
            return;
        }
        if (hVar != null) {
            if (hVar2 != null) {
                hVar.b(this, hVar2);
            } else {
                com.badlogic.gdx.utils.a<m> aVar = this.f29194c;
                m[] mVarArr = aVar.f13178a;
                int i11 = aVar.f13179b;
                for (int i12 = 0; i12 < i11; i12++) {
                    m mVar = mVarArr[i12];
                    String str = mVar.f64407a.f64420f;
                    if (str != null && (e11 = hVar.e(i12, str)) != null) {
                        mVar.i(e11);
                    }
                }
            }
        }
        this.f29201j = hVar;
        c0();
    }

    public void N(String str) {
        h g11 = this.f29192a.g(str);
        if (g11 != null) {
            M(g11);
            return;
        }
        throw new IllegalArgumentException("Skin not found: " + str);
    }

    public void O() {
        com.badlogic.gdx.utils.a<m> aVar = this.f29194c;
        m[] mVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        pl.g.a(mVarArr, 0, this.f29195d.f13178a, 0, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            mVarArr[i12].m();
        }
    }

    public void P(float f11) {
        this.f29207p = f11;
    }

    public void Q() {
        E();
        O();
    }

    public void R(float f11) {
        this.f29203l = f11;
    }

    public void S(float f11) {
        this.f29204m = f11;
    }

    public final void T(b bVar) {
        if (bVar.f29355z) {
            return;
        }
        b bVar2 = bVar.f29332c;
        if (bVar2 != null) {
            T(bVar2);
        }
        bVar.f29355z = true;
        this.f29200i.a(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(com.esotericsoftware.spine.c r5) {
        /*
            r4 = this;
            com.esotericsoftware.spine.b r0 = r5.f29359c
            boolean r0 = r0.A
            r1 = 1
            if (r0 == 0) goto L1b
            jl.e r0 = r5.f29357a
            boolean r2 = r0.f64305c
            if (r2 == 0) goto L19
            com.esotericsoftware.spine.h r2 = r4.f29201j
            if (r2 == 0) goto L1b
            com.badlogic.gdx.utils.a<jl.b> r2 = r2.f29459d
            boolean r0 = r2.l(r0, r1)
            if (r0 == 0) goto L1b
        L19:
            r0 = r1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r5.f29365i = r0
            if (r0 != 0) goto L21
            return
        L21:
            com.esotericsoftware.spine.b r0 = r5.f29359c
            r4.T(r0)
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r0 = r5.f29358b
            java.lang.Object r2 = r0.first()
            com.esotericsoftware.spine.b r2 = (com.esotericsoftware.spine.b) r2
            r4.T(r2)
            int r3 = r0.f13179b
            if (r3 != r1) goto L40
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.j> r0 = r4.f29200i
            r0.a(r5)
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r5 = r2.f29333d
            r4.Z(r5)
            return
        L40:
            java.lang.Object r0 = r0.peek()
            com.esotericsoftware.spine.b r0 = (com.esotericsoftware.spine.b) r0
            r4.T(r0)
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.j> r3 = r4.f29200i
            r3.a(r5)
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r5 = r2.f29333d
            r4.Z(r5)
            r0.f29355z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.Skeleton.U(com.esotericsoftware.spine.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(com.esotericsoftware.spine.d r8) {
        /*
            r7 = this;
            jl.m r0 = r8.f29373c
            com.esotericsoftware.spine.b r0 = r0.f64408b
            boolean r0 = r0.A
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            com.esotericsoftware.spine.PathConstraintData r0 = r8.f29371a
            boolean r3 = r0.f64305c
            if (r3 == 0) goto L1c
            com.esotericsoftware.spine.h r3 = r7.f29201j
            if (r3 == 0) goto L1e
            com.badlogic.gdx.utils.a<jl.b> r3 = r3.f29459d
            boolean r0 = r3.l(r0, r2)
            if (r0 == 0) goto L1e
        L1c:
            r0 = r2
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r8.f29379i = r0
            if (r0 != 0) goto L24
            goto L7d
        L24:
            jl.m r0 = r8.f29373c
            jl.n r3 = r0.e()
            int r3 = r3.f64415a
            com.esotericsoftware.spine.b r4 = r0.f64408b
            com.esotericsoftware.spine.h r5 = r7.f29201j
            if (r5 == 0) goto L35
            r7.W(r5, r3, r4)
        L35:
            jl.i r5 = r7.f29192a
            com.esotericsoftware.spine.h r5 = r5.f64362e
            if (r5 == 0) goto L42
            com.esotericsoftware.spine.h r6 = r7.f29201j
            if (r5 == r6) goto L42
            r7.W(r5, r3, r4)
        L42:
            ol.b r0 = r0.f64411e
            boolean r3 = r0 instanceof ol.h
            if (r3 == 0) goto L4b
            r7.X(r0, r4)
        L4b:
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r0 = r8.f29372b
            T[] r3 = r0.f13178a
            int r0 = r0.f13179b
            r4 = r1
        L52:
            if (r4 >= r0) goto L5e
            r5 = r3[r4]
            com.esotericsoftware.spine.b r5 = (com.esotericsoftware.spine.b) r5
            r7.T(r5)
            int r4 = r4 + 1
            goto L52
        L5e:
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.j> r4 = r7.f29200i
            r4.a(r8)
            r8 = r1
        L64:
            if (r8 >= r0) goto L72
            r4 = r3[r8]
            com.esotericsoftware.spine.b r4 = (com.esotericsoftware.spine.b) r4
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r4 = r4.f29333d
            r7.Z(r4)
            int r8 = r8 + 1
            goto L64
        L72:
            if (r1 >= r0) goto L7d
            r8 = r3[r1]
            com.esotericsoftware.spine.b r8 = (com.esotericsoftware.spine.b) r8
            r8.f29355z = r2
            int r1 = r1 + 1
            goto L72
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.Skeleton.V(com.esotericsoftware.spine.d):void");
    }

    public final void W(h hVar, int i11, b bVar) {
        h.a[] aVarArr = hVar.f29457b.A().f13178a;
        int i12 = hVar.f29457b.f13401a;
        for (int i13 = 0; i13 < i12; i13++) {
            h.a aVar = aVarArr[i13];
            if (aVar.f29462a == i11) {
                X(aVar.f29464c, bVar);
            }
        }
    }

    public final void X(ol.b bVar, b bVar2) {
        if (bVar instanceof ol.h) {
            int[] k11 = ((ol.h) bVar).k();
            if (k11 == null) {
                T(bVar2);
                return;
            }
            b[] bVarArr = this.f29193b.f13178a;
            int length = k11.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                int i13 = k11[i11] + i12;
                while (i12 < i13) {
                    T(bVarArr[k11[i12]]);
                    i12++;
                }
                i11 = i12;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(com.esotericsoftware.spine.e r5) {
        /*
            r4 = this;
            com.esotericsoftware.spine.b r0 = r5.f29388b
            boolean r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L1b
            jl.f r1 = r5.f29387a
            boolean r3 = r1.f64305c
            if (r3 == 0) goto L19
            com.esotericsoftware.spine.h r3 = r4.f29201j
            if (r3 == 0) goto L1b
            com.badlogic.gdx.utils.a<jl.b> r3 = r3.f29459d
            boolean r1 = r3.l(r1, r2)
            if (r1 == 0) goto L1b
        L19:
            r1 = r2
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r5.f29411y = r1
            if (r1 != 0) goto L21
            return
        L21:
            r4.T(r0)
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.j> r1 = r4.f29200i
            r1.a(r5)
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r5 = r0.f29333d
            r4.Z(r5)
            r0.f29355z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.Skeleton.Y(com.esotericsoftware.spine.e):void");
    }

    public final void Z(com.badlogic.gdx.utils.a<b> aVar) {
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            b bVar = bVarArr[i12];
            if (bVar.A) {
                if (bVar.f29355z) {
                    Z(bVar.f29333d);
                }
                bVar.f29355z = false;
            }
        }
    }

    @d0
    public b a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("boneName cannot be null.");
        }
        com.badlogic.gdx.utils.a<b> aVar = this.f29193b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            b bVar = bVarArr[i12];
            if (bVar.f29330a.f29165b.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(com.esotericsoftware.spine.i r8) {
        /*
            r7 = this;
            com.esotericsoftware.spine.b r0 = r8.f29468c
            boolean r0 = r0.A
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1c
            jl.o r0 = r8.f29466a
            boolean r3 = r0.f64305c
            if (r3 == 0) goto L1a
            com.esotericsoftware.spine.h r3 = r7.f29201j
            if (r3 == 0) goto L1c
            com.badlogic.gdx.utils.a<jl.b> r3 = r3.f29459d
            boolean r0 = r3.l(r0, r2)
            if (r0 == 0) goto L1c
        L1a:
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r8.f29475j = r0
            if (r0 != 0) goto L22
            goto L71
        L22:
            com.esotericsoftware.spine.b r0 = r8.f29468c
            r7.T(r0)
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r0 = r8.f29467b
            T[] r3 = r0.f13178a
            int r0 = r0.f13179b
            jl.o r4 = r8.f29466a
            boolean r4 = r4.f64438s
            if (r4 == 0) goto L45
            r4 = r1
        L34:
            if (r4 >= r0) goto L52
            r5 = r3[r4]
            com.esotericsoftware.spine.b r5 = (com.esotericsoftware.spine.b) r5
            com.esotericsoftware.spine.b r6 = r5.f29332c
            r7.T(r6)
            r7.T(r5)
            int r4 = r4 + 1
            goto L34
        L45:
            r4 = r1
        L46:
            if (r4 >= r0) goto L52
            r5 = r3[r4]
            com.esotericsoftware.spine.b r5 = (com.esotericsoftware.spine.b) r5
            r7.T(r5)
            int r4 = r4 + 1
            goto L46
        L52:
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.j> r4 = r7.f29200i
            r4.a(r8)
            r8 = r1
        L58:
            if (r8 >= r0) goto L66
            r4 = r3[r8]
            com.esotericsoftware.spine.b r4 = (com.esotericsoftware.spine.b) r4
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> r4 = r4.f29333d
            r7.Z(r4)
            int r8 = r8 + 1
            goto L58
        L66:
            if (r1 >= r0) goto L71
            r8 = r3[r1]
            com.esotericsoftware.spine.b r8 = (com.esotericsoftware.spine.b) r8
            r8.f29355z = r2
            int r1 = r1 + 1
            goto L66
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.Skeleton.a0(com.esotericsoftware.spine.i):void");
    }

    @d0
    public c b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<c> aVar = this.f29196e;
        c[] cVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c cVar = cVarArr[i12];
            if (cVar.f29357a.f64303a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public void b0(float f11) {
        this.f29207p += f11;
    }

    @d0
    public d c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<d> aVar = this.f29198g;
        d[] dVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            d dVar = dVarArr[i12];
            if (dVar.f29371a.f64303a.equals(str)) {
                return dVar;
            }
        }
        return null;
    }

    public void c0() {
        this.f29200i.clear();
        com.badlogic.gdx.utils.a<b> aVar = this.f29193b;
        int i11 = aVar.f13179b;
        b[] bVarArr = aVar.f13178a;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            b bVar = bVarArr[i13];
            boolean z11 = bVar.f29330a.f29176m;
            bVar.f29355z = z11;
            bVar.A = true ^ z11;
        }
        h hVar = this.f29201j;
        if (hVar != null) {
            com.badlogic.gdx.utils.a<BoneData> aVar2 = hVar.f29458c;
            BoneData[] boneDataArr = aVar2.f13178a;
            int i14 = aVar2.f13179b;
            for (int i15 = 0; i15 < i14; i15++) {
                b bVar2 = bVarArr[boneDataArr[i15].f29164a];
                do {
                    bVar2.f29355z = false;
                    bVar2.A = true;
                    bVar2 = bVar2.f29332c;
                } while (bVar2 != null);
            }
        }
        com.badlogic.gdx.utils.a<c> aVar3 = this.f29196e;
        int i16 = aVar3.f13179b;
        com.badlogic.gdx.utils.a<i> aVar4 = this.f29197f;
        int i17 = aVar4.f13179b;
        com.badlogic.gdx.utils.a<d> aVar5 = this.f29198g;
        int i18 = aVar5.f13179b;
        com.badlogic.gdx.utils.a<e> aVar6 = this.f29199h;
        int i19 = aVar6.f13179b;
        c[] cVarArr = aVar3.f13178a;
        i[] iVarArr = aVar4.f13178a;
        d[] dVarArr = aVar5.f13178a;
        e[] eVarArr = aVar6.f13178a;
        int i21 = i16 + i17 + i18 + i19;
        int i22 = 0;
        while (i22 < i21) {
            int i23 = i12;
            while (true) {
                if (i23 < i16) {
                    c cVar = cVarArr[i23];
                    if (cVar.f29357a.f64304b == i22) {
                        U(cVar);
                        break;
                    }
                    i23++;
                } else {
                    int i24 = 0;
                    while (true) {
                        if (i24 < i17) {
                            i iVar = iVarArr[i24];
                            if (iVar.f29466a.f64304b == i22) {
                                a0(iVar);
                                break;
                            }
                            i24++;
                        } else {
                            int i25 = 0;
                            while (true) {
                                if (i25 < i18) {
                                    d dVar = dVarArr[i25];
                                    if (dVar.f29371a.f64304b == i22) {
                                        V(dVar);
                                        break;
                                    }
                                    i25++;
                                } else {
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 < i19) {
                                            e eVar = eVarArr[i26];
                                            if (eVar.f29387a.f64304b == i22) {
                                                Y(eVar);
                                                break;
                                            }
                                            i26++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i22++;
            i12 = 0;
        }
        for (int i27 = 0; i27 < i11; i27++) {
            T(bVarArr[i27]);
        }
    }

    @d0
    public e d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<e> aVar = this.f29199h;
        e[] eVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            e eVar = eVarArr[i12];
            if (eVar.f29387a.f64303a.equals(str)) {
                return eVar;
            }
        }
        return null;
    }

    public void d0(Physics physics) {
        com.badlogic.gdx.utils.a<b> aVar = this.f29193b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            b bVar = bVarArr[i12];
            bVar.f29341l = bVar.f29334e;
            bVar.f29342m = bVar.f29335f;
            bVar.f29343n = bVar.f29336g;
            bVar.f29344o = bVar.f29337h;
            bVar.f29345p = bVar.f29338i;
            bVar.f29346q = bVar.f29339j;
            bVar.f29347r = bVar.f29340k;
        }
        com.badlogic.gdx.utils.a<j> aVar2 = this.f29200i;
        j[] jVarArr = aVar2.f13178a;
        int i13 = aVar2.f13179b;
        for (int i14 = 0; i14 < i13; i14++) {
            jVarArr[i14].a(physics);
        }
    }

    @d0
    public m e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("slotName cannot be null.");
        }
        com.badlogic.gdx.utils.a<m> aVar = this.f29194c;
        m[] mVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            m mVar = mVarArr[i12];
            if (mVar.f64407a.f64416b.equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    public void e0(Physics physics, b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("parent cannot be null.");
        }
        com.badlogic.gdx.utils.a<b> aVar = this.f29193b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 1; i12 < i11; i12++) {
            b bVar2 = bVarArr[i12];
            bVar2.f29341l = bVar2.f29334e;
            bVar2.f29342m = bVar2.f29335f;
            bVar2.f29343n = bVar2.f29336g;
            bVar2.f29344o = bVar2.f29337h;
            bVar2.f29345p = bVar2.f29338i;
            bVar2.f29346q = bVar2.f29339j;
            bVar2.f29347r = bVar2.f29340k;
        }
        b r11 = r();
        float f11 = bVar.f29348s;
        float f12 = bVar.f29349t;
        float f13 = bVar.f29351v;
        float f14 = bVar.f29352w;
        float f15 = this.f29203l;
        float f16 = this.f29204m;
        r11.f29350u = (f11 * f15) + (f12 * f16) + bVar.f29350u;
        r11.f29353x = (f15 * f13) + (f16 * f14) + bVar.f29353x;
        float f17 = r11.f29336g;
        float f18 = (r11.f29339j + f17) * 0.017453292f;
        float f19 = (f17 + 90.0f + r11.f29340k) * 0.017453292f;
        float d11 = pl.g.d(f18) * r11.f29337h;
        float d12 = pl.g.d(f19) * r11.f29338i;
        float f21 = pl.g.f(f18) * r11.f29337h;
        float f22 = pl.g.f(f19) * r11.f29338i;
        float f23 = this.f29205n;
        r11.f29348s = ((f11 * d11) + (f12 * f21)) * f23;
        r11.f29349t = ((f11 * d12) + (f12 * f22)) * f23;
        float f24 = this.f29206o;
        r11.f29351v = ((d11 * f13) + (f21 * f14)) * f24;
        r11.f29352w = ((f13 * d12) + (f14 * f22)) * f24;
        com.badlogic.gdx.utils.a<j> aVar2 = this.f29200i;
        j[] jVarArr = aVar2.f13178a;
        int i13 = aVar2.f13179b;
        for (int i14 = 0; i14 < i13; i14++) {
            j jVar = jVarArr[i14];
            if (jVar != r11) {
                jVar.a(physics);
            }
        }
    }

    @d0
    public i f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        com.badlogic.gdx.utils.a<i> aVar = this.f29197f;
        i[] iVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            i iVar = iVarArr[i12];
            if (iVar.f29466a.f64303a.equals(str)) {
                return iVar;
            }
        }
        return null;
    }

    @d0
    public ol.b g(int i11, String str) {
        ol.b e11;
        if (str == null) {
            throw new IllegalArgumentException("attachmentName cannot be null.");
        }
        h hVar = this.f29201j;
        if (hVar != null && (e11 = hVar.e(i11, str)) != null) {
            return e11;
        }
        h hVar2 = this.f29192a.f64362e;
        if (hVar2 != null) {
            return hVar2.e(i11, str);
        }
        return null;
    }

    @d0
    public ol.b h(String str, String str2) {
        n h11 = this.f29192a.h(str);
        if (h11 != null) {
            return g(h11.f(), str2);
        }
        throw new IllegalArgumentException("Slot not found: " + str);
    }

    public com.badlogic.gdx.utils.a<b> i() {
        return this.f29193b;
    }

    public void j(Vector2 vector2, Vector2 vector22, r rVar) {
        k(vector2, vector22, rVar, null);
    }

    public void k(Vector2 vector2, Vector2 vector22, r rVar, pl.c cVar) {
        float[] fArr;
        short[] sArr;
        int i11;
        r rVar2 = rVar;
        if (vector2 == null) {
            throw new IllegalArgumentException("offset cannot be null.");
        }
        if (vector22 == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        if (rVar2 == null) {
            throw new IllegalArgumentException("temp cannot be null.");
        }
        com.badlogic.gdx.utils.a<m> aVar = this.f29195d;
        m[] mVarArr = aVar.f13178a;
        int i12 = aVar.f13179b;
        float f11 = -2.14748365E9f;
        int i13 = 0;
        float f12 = 2.14748365E9f;
        float f13 = 2.14748365E9f;
        int i14 = 0;
        float f14 = -2.14748365E9f;
        while (i14 < i12) {
            m mVar = mVarArr[i14];
            if (mVar.f64408b.A) {
                ol.b bVar = mVar.f64411e;
                if (bVar instanceof ol.j) {
                    fArr = rVar2.I(8);
                    ((ol.j) bVar).j(mVar, fArr, i13, 2);
                    sArr = f29191q;
                    i11 = 8;
                } else if (bVar instanceof ol.g) {
                    ol.g gVar = (ol.g) bVar;
                    int o11 = gVar.o();
                    float[] I = rVar2.I(o11);
                    gVar.j(mVar, 0, o11, I, 0, 2);
                    sArr = gVar.A();
                    i11 = o11;
                    fArr = I;
                } else if (!(bVar instanceof ol.e) || cVar == null) {
                    fArr = null;
                    sArr = null;
                    i11 = i13;
                } else {
                    cVar.d(mVar, (ol.e) bVar);
                }
                if (fArr != null) {
                    if (cVar != null && cVar.k()) {
                        cVar.e(fArr, sArr, sArr.length);
                        fArr = cVar.j().f1625a;
                        i11 = cVar.j().f1626b;
                    }
                    for (int i15 = i13; i15 < i11; i15 += 2) {
                        float f15 = fArr[i15];
                        float f16 = fArr[i15 + 1];
                        f12 = Math.min(f12, f15);
                        f13 = Math.min(f13, f16);
                        f11 = Math.max(f11, f15);
                        f14 = Math.max(f14, f16);
                    }
                }
                if (cVar != null) {
                    cVar.c(mVar);
                }
            }
            i14++;
            rVar2 = rVar;
            i13 = 0;
        }
        if (cVar != null) {
            cVar.b();
        }
        vector2.set(f12, f13);
        vector22.set(f11 - f12, f14 - f13);
    }

    public com.badlogic.gdx.graphics.b l() {
        return this.f29202k;
    }

    public jl.i m() {
        return this.f29192a;
    }

    public com.badlogic.gdx.utils.a<m> n() {
        return this.f29195d;
    }

    public com.badlogic.gdx.utils.a<c> o() {
        return this.f29196e;
    }

    public com.badlogic.gdx.utils.a<d> p() {
        return this.f29198g;
    }

    public com.badlogic.gdx.utils.a<e> q() {
        return this.f29199h;
    }

    public b r() {
        com.badlogic.gdx.utils.a<b> aVar = this.f29193b;
        if (aVar.f13179b == 0) {
            return null;
        }
        return aVar.first();
    }

    public float s() {
        return this.f29205n;
    }

    public float t() {
        return this.f29206o;
    }

    public String toString() {
        String str = this.f29192a.f64358a;
        return str != null ? str : super.toString();
    }

    @d0
    public h u() {
        return this.f29201j;
    }

    public com.badlogic.gdx.utils.a<m> v() {
        return this.f29194c;
    }

    public float w() {
        return this.f29207p;
    }

    public com.badlogic.gdx.utils.a<i> x() {
        return this.f29197f;
    }

    public com.badlogic.gdx.utils.a<j> y() {
        return this.f29200i;
    }

    public float z() {
        return this.f29203l;
    }

    public Skeleton(Skeleton skeleton) {
        b bVar;
        this.f29200i = new com.badlogic.gdx.utils.a<>();
        this.f29205n = 1.0f;
        this.f29206o = 1.0f;
        if (skeleton != null) {
            this.f29192a = skeleton.f29192a;
            this.f29193b = new com.badlogic.gdx.utils.a<>(skeleton.f29193b.f13179b);
            a.b<b> it = skeleton.f29193b.iterator();
            while (it.hasNext()) {
                b next = it.next();
                b bVar2 = next.f29332c;
                if (bVar2 == null) {
                    bVar = new b(next, this, (b) null);
                } else {
                    b bVar3 = this.f29193b.get(bVar2.f29330a.f29164a);
                    b bVar4 = new b(next, this, bVar3);
                    bVar3.f29333d.a(bVar4);
                    bVar = bVar4;
                }
                this.f29193b.a(bVar);
            }
            this.f29194c = new com.badlogic.gdx.utils.a<>(skeleton.f29194c.f13179b);
            a.b<m> it2 = skeleton.f29194c.iterator();
            while (it2.hasNext()) {
                m next2 = it2.next();
                this.f29194c.a(new m(next2, this.f29193b.get(next2.f64408b.f29330a.f29164a)));
            }
            this.f29195d = new com.badlogic.gdx.utils.a<>(this.f29194c.f13179b);
            a.b<m> it3 = skeleton.f29195d.iterator();
            while (it3.hasNext()) {
                this.f29195d.a(this.f29194c.get(it3.next().f64407a.f64415a));
            }
            this.f29196e = new com.badlogic.gdx.utils.a<>(skeleton.f29196e.f13179b);
            a.b<c> it4 = skeleton.f29196e.iterator();
            while (it4.hasNext()) {
                this.f29196e.a(new c(it4.next(), skeleton));
            }
            this.f29197f = new com.badlogic.gdx.utils.a<>(skeleton.f29197f.f13179b);
            a.b<i> it5 = skeleton.f29197f.iterator();
            while (it5.hasNext()) {
                this.f29197f.a(new i(it5.next(), skeleton));
            }
            this.f29198g = new com.badlogic.gdx.utils.a<>(skeleton.f29198g.f13179b);
            a.b<d> it6 = skeleton.f29198g.iterator();
            while (it6.hasNext()) {
                this.f29198g.a(new d(it6.next(), skeleton));
            }
            this.f29199h = new com.badlogic.gdx.utils.a<>(skeleton.f29199h.f13179b);
            a.b<e> it7 = skeleton.f29199h.iterator();
            while (it7.hasNext()) {
                this.f29199h.a(new e(it7.next(), skeleton));
            }
            this.f29201j = skeleton.f29201j;
            this.f29202k = new com.badlogic.gdx.graphics.b(skeleton.f29202k);
            this.f29203l = skeleton.f29203l;
            this.f29204m = skeleton.f29204m;
            this.f29205n = skeleton.f29205n;
            this.f29206o = skeleton.f29206o;
            this.f29207p = skeleton.f29207p;
            c0();
            return;
        }
        throw new IllegalArgumentException("skeleton cannot be null.");
    }
}
