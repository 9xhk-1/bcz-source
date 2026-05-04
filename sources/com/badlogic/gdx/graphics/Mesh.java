package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n2.a0;
import n2.b0;
import n2.w;
import n2.x;
import n2.y;
import n2.z;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Mesh implements a3.q {

    /* renamed from: h, reason: collision with root package name */
    public static final Map<Application, com.badlogic.gdx.utils.a<Mesh>> f11487h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final b0 f11488a;

    /* renamed from: b, reason: collision with root package name */
    public final n2.p f11489b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11490c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11491d;

    /* renamed from: e, reason: collision with root package name */
    public n2.s f11492e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11493f;

    /* renamed from: g, reason: collision with root package name */
    public final Vector3 f11494g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum VertexDataType {
        VertexArray,
        VertexBufferObject,
        VertexBufferObjectSubData,
        VertexBufferObjectWithVAO
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11495a;

        static {
            int[] iArr = new int[VertexDataType.values().length];
            f11495a = iArr;
            try {
                iArr[VertexDataType.VertexBufferObject.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11495a[VertexDataType.VertexBufferObjectSubData.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11495a[VertexDataType.VertexBufferObjectWithVAO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11495a[VertexDataType.VertexArray.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Mesh(b0 b0Var, n2.p pVar, boolean z11) {
        this.f11490c = true;
        this.f11493f = false;
        this.f11494g = new Vector3();
        this.f11488a = b0Var;
        this.f11489b = pVar;
        this.f11491d = z11;
        b(q1.g.f81378a, this);
    }

    public static void Q0(Application application) {
        f11487h.remove(application);
    }

    public static void R1(Matrix4 matrix4, float[] fArr, int i11, int i12, int i13, int i14, int i15) {
        if (i12 < 0 || i13 < 1 || i12 + i13 > i11) {
            throw new IndexOutOfBoundsException();
        }
        if (i14 < 0 || i15 < 1 || (i14 + i15) * i11 > fArr.length) {
            throw new IndexOutOfBoundsException("start = " + i14 + ", count = " + i15 + ", vertexSize = " + i11 + ", length = " + fArr.length);
        }
        Vector3 vector3 = new Vector3();
        int i16 = i12 + (i14 * i11);
        int i17 = 0;
        if (i13 == 1) {
            while (i17 < i15) {
                vector3.set(fArr[i16], 0.0f, 0.0f).mul(matrix4);
                fArr[i16] = vector3.f12537x;
                i16 += i11;
                i17++;
            }
            return;
        }
        if (i13 == 2) {
            while (i17 < i15) {
                int i18 = i16 + 1;
                vector3.set(fArr[i16], fArr[i18], 0.0f).mul(matrix4);
                fArr[i16] = vector3.f12537x;
                fArr[i18] = vector3.f12538y;
                i16 += i11;
                i17++;
            }
            return;
        }
        if (i13 != 3) {
            return;
        }
        while (i17 < i15) {
            int i19 = i16 + 1;
            int i21 = i16 + 2;
            vector3.set(fArr[i16], fArr[i19], fArr[i21]).mul(matrix4);
            fArr[i16] = vector3.f12537x;
            fArr[i19] = vector3.f12538y;
            fArr[i21] = vector3.f12539z;
            i16 += i11;
            i17++;
        }
    }

    public static void U1(Matrix3 matrix3, float[] fArr, int i11, int i12, int i13, int i14) {
        if (i13 < 0 || i14 < 1 || (i13 + i14) * i11 > fArr.length) {
            throw new IndexOutOfBoundsException("start = " + i13 + ", count = " + i14 + ", vertexSize = " + i11 + ", length = " + fArr.length);
        }
        Vector2 vector2 = new Vector2();
        int i15 = i12 + (i13 * i11);
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = i15 + 1;
            vector2.set(fArr[i15], fArr[i17]).mul(matrix3);
            fArr[i15] = vector2.f12535x;
            fArr[i17] = vector2.f12536y;
            i15 += i11;
        }
    }

    public static void b(Application application, Mesh mesh) {
        Map<Application, com.badlogic.gdx.utils.a<Mesh>> map = f11487h;
        com.badlogic.gdx.utils.a<Mesh> aVar = map.get(application);
        if (aVar == null) {
            aVar = new com.badlogic.gdx.utils.a<>();
        }
        aVar.a(mesh);
        map.put(application, aVar);
    }

    public static String n1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Managed meshes/app: { ");
        Iterator<Application> it = f11487h.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(f11487h.get(it.next()).f13179b);
            sb2.append(" ");
        }
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }

    public static void z1(Application application) {
        com.badlogic.gdx.utils.a<Mesh> aVar = f11487h.get(application);
        if (aVar == null) {
            return;
        }
        for (int i11 = 0; i11 < aVar.f13179b; i11++) {
            aVar.get(i11).f11488a.invalidate();
            aVar.get(i11).f11489b.invalidate();
        }
    }

    public boolean A1() {
        return this.f11493f;
    }

    public final b0 B1(boolean z11, int i11, s sVar) {
        return q1.g.f81386i != null ? new a0(z11, i11, sVar) : new y(z11, i11, sVar);
    }

    public float C0(Vector3 vector3, int i11, int i12, Matrix4 matrix4) {
        return i0(vector3.f12537x, vector3.f12538y, vector3.f12539z, i11, i12, matrix4);
    }

    public void C1(w wVar, int i11) {
        E1(wVar, i11, 0, this.f11489b.o0() > 0 ? D0() : m(), this.f11490c);
    }

    public BoundingBox D(BoundingBox boundingBox, int i11, int i12) {
        return d1(boundingBox.inf(), i11, i12);
    }

    public int D0() {
        return this.f11489b.D0();
    }

    public void D1(w wVar, int i11, int i12, int i13) {
        E1(wVar, i11, i12, i13, this.f11490c);
    }

    public void E1(w wVar, int i11, int i12, int i13, boolean z11) {
        if (i13 == 0) {
            return;
        }
        if (z11) {
            n(wVar);
        }
        if (!this.f11491d) {
            int m02 = this.f11493f ? this.f11492e.m0() : 0;
            if (this.f11489b.D0() > 0) {
                if (i13 + i12 > this.f11489b.o0()) {
                    throw new GdxRuntimeException("Mesh attempting to access memory outside of the index buffer (count: " + i13 + ", offset: " + i12 + ", max: " + this.f11489b.o0() + pn.j.f81007d);
                }
                if (!this.f11493f || m02 <= 0) {
                    q1.g.f81385h.w3(i11, i13, f.f11685w1, i12 * 2);
                } else {
                    q1.g.f81386i.E3(i11, i13, f.f11685w1, i12 * 2, m02);
                }
            } else if (!this.f11493f || m02 <= 0) {
                q1.g.f81385h.glDrawArrays(i11, i12, i13);
            } else {
                q1.g.f81386i.F0(i11, i12, i13, m02);
            }
        } else if (this.f11489b.D0() > 0) {
            ShortBuffer d11 = this.f11489b.d(false);
            int position = d11.position();
            d11.limit();
            d11.position(i12);
            q1.g.f81385h.glDrawElements(i11, i13, f.f11685w1, d11);
            d11.position(position);
        } else {
            q1.g.f81385h.glDrawArrays(i11, i12, i13);
        }
        if (z11) {
            f(wVar);
        }
    }

    public void F1(float f11, float f12, float f13) {
        r q12 = q1(1);
        int i11 = q12.f12492e / 4;
        int i12 = q12.f12489b;
        int m11 = m();
        int s12 = s1() / 4;
        float[] fArr = new float[m11 * s12];
        w1(fArr);
        int i13 = 0;
        if (i12 == 1) {
            while (i13 < m11) {
                fArr[i11] = fArr[i11] * f11;
                i11 += s12;
                i13++;
            }
        } else if (i12 == 2) {
            while (i13 < m11) {
                fArr[i11] = fArr[i11] * f11;
                int i14 = i11 + 1;
                fArr[i14] = fArr[i14] * f12;
                i11 += s12;
                i13++;
            }
        } else if (i12 == 3) {
            while (i13 < m11) {
                fArr[i11] = fArr[i11] * f11;
                int i15 = i11 + 1;
                fArr[i15] = fArr[i15] * f12;
                int i16 = i11 + 2;
                fArr[i16] = fArr[i16] * f13;
                i11 += s12;
                i13++;
            }
        }
        N1(fArr);
    }

    public void G1(boolean z11) {
        this.f11490c = z11;
    }

    public Mesh H1(short[] sArr) {
        this.f11489b.l0(sArr, 0, sArr.length);
        return this;
    }

    public BoundingBox I(BoundingBox boundingBox, int i11, int i12, Matrix4 matrix4) {
        return e1(boundingBox.inf(), i11, i12, matrix4);
    }

    public Mesh I1(short[] sArr, int i11, int i12) {
        this.f11489b.l0(sArr, i11, i12);
        return this;
    }

    public float J0(float f11, float f12, float f13, int i11, int i12, Matrix4 matrix4) {
        int i13;
        int D0 = D0();
        if (i11 >= 0) {
            boolean z11 = true;
            if (i12 >= 1 && (i13 = i11 + i12) <= D0) {
                FloatBuffer d11 = this.f11488a.d(false);
                ShortBuffer d12 = this.f11489b.d(false);
                r q12 = q1(1);
                int i14 = q12.f12492e / 4;
                int i15 = this.f11488a.getAttributes().f12497b / 4;
                int i16 = q12.f12489b;
                short s11 = c2.f100412d;
                float f14 = 0.0f;
                if (i16 == 1) {
                    float f15 = 0.0f;
                    for (int i17 = i11; i17 < i13; i17++) {
                        this.f11494g.set(d11.get(((d12.get(i17) & c2.f100412d) * i15) + i14), 0.0f, 0.0f);
                        if (matrix4 != null) {
                            this.f11494g.mul(matrix4);
                        }
                        float len2 = this.f11494g.sub(f11, f12, f13).len2();
                        if (len2 > f15) {
                            f15 = len2;
                        }
                    }
                    return f15;
                }
                char c11 = 2;
                if (i16 == 2) {
                    int i18 = i11;
                    float f16 = 0.0f;
                    while (i18 < i13) {
                        int i19 = ((d12.get(i18) & c2.f100412d) * i15) + i14;
                        boolean z12 = z11;
                        this.f11494g.set(d11.get(i19), d11.get(i19 + 1), 0.0f);
                        if (matrix4 != null) {
                            this.f11494g.mul(matrix4);
                        }
                        float len22 = this.f11494g.sub(f11, f12, f13).len2();
                        if (len22 > f16) {
                            f16 = len22;
                        }
                        i18++;
                        z11 = z12;
                    }
                    return f16;
                }
                if (i16 != 3) {
                    return 0.0f;
                }
                int i21 = i11;
                while (i21 < i13) {
                    int i22 = ((d12.get(i21) & s11) * i15) + i14;
                    short s12 = s11;
                    char c12 = c11;
                    this.f11494g.set(d11.get(i22), d11.get(i22 + 1), d11.get(i22 + 2));
                    if (matrix4 != null) {
                        this.f11494g.mul(matrix4);
                    }
                    float len23 = this.f11494g.sub(f11, f12, f13).len2();
                    if (len23 > f14) {
                        f14 = len23;
                    }
                    i21++;
                    s11 = s12;
                    c11 = c12;
                }
                return f14;
            }
        }
        throw new GdxRuntimeException("Not enough indices");
    }

    public Mesh J1(FloatBuffer floatBuffer) {
        n2.s sVar = this.f11492e;
        if (sVar == null) {
            throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
        }
        sVar.Y0(floatBuffer, floatBuffer.limit());
        return this;
    }

    public Mesh K1(FloatBuffer floatBuffer, int i11) {
        n2.s sVar = this.f11492e;
        if (sVar == null) {
            throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
        }
        sVar.Y0(floatBuffer, i11);
        return this;
    }

    public Mesh L1(float[] fArr) {
        n2.s sVar = this.f11492e;
        if (sVar == null) {
            throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
        }
        sVar.h0(fArr, 0, fArr.length);
        return this;
    }

    public Mesh M1(float[] fArr, int i11, int i12) {
        n2.s sVar = this.f11492e;
        if (sVar == null) {
            throw new GdxRuntimeException("An InstanceBufferObject must be set before setting instance data!");
        }
        sVar.h0(fArr, i11, i12);
        return this;
    }

    public Mesh N1(float[] fArr) {
        this.f11488a.S0(fArr, 0, fArr.length);
        return this;
    }

    public Mesh O1(float[] fArr, int i11, int i12) {
        this.f11488a.S0(fArr, i11, i12);
        return this;
    }

    public void P1(Matrix4 matrix4) {
        Q1(matrix4, 0, m());
    }

    public void Q1(Matrix4 matrix4, int i11, int i12) {
        r q12 = q1(1);
        int i13 = q12.f12492e / 4;
        int s12 = s1() / 4;
        int i14 = q12.f12489b;
        m();
        int i15 = i12 * s12;
        float[] fArr = new float[i15];
        int i16 = i11 * s12;
        t1(i16, i15, fArr);
        R1(matrix4, fArr, s12, i13, i14, 0, i12);
        a2(i16, fArr);
    }

    public void R(BoundingBox boundingBox) {
        int m11 = m();
        if (m11 == 0) {
            throw new GdxRuntimeException("No vertices defined");
        }
        int i11 = 0;
        FloatBuffer d11 = this.f11488a.d(false);
        boundingBox.inf();
        r q12 = q1(1);
        int i12 = q12.f12492e / 4;
        int i13 = this.f11488a.getAttributes().f12497b / 4;
        int i14 = q12.f12489b;
        if (i14 == 1) {
            while (i11 < m11) {
                boundingBox.ext(d11.get(i12), 0.0f, 0.0f);
                i12 += i13;
                i11++;
            }
            return;
        }
        if (i14 == 2) {
            while (i11 < m11) {
                boundingBox.ext(d11.get(i12), d11.get(i12 + 1), 0.0f);
                i12 += i13;
                i11++;
            }
            return;
        }
        if (i14 != 3) {
            return;
        }
        while (i11 < m11) {
            boundingBox.ext(d11.get(i12), d11.get(i12 + 1), d11.get(i12 + 2));
            i12 += i13;
            i11++;
        }
    }

    public void S1(Matrix3 matrix3) {
        T1(matrix3, 0, m());
    }

    public void T1(Matrix3 matrix3, int i11, int i12) {
        int i13 = q1(16).f12492e / 4;
        int s12 = s1() / 4;
        int m11 = m() * s12;
        float[] fArr = new float[m11];
        t1(0, m11, fArr);
        U1(matrix3, fArr, s12, i13, i11, i12);
        O1(fArr, 0, m11);
    }

    public Mesh V0(boolean z11) {
        return a1(z11, false, null);
    }

    public void V1(w wVar, int[] iArr, int[] iArr2) {
        this.f11488a.i(wVar, iArr);
        n2.s sVar = this.f11492e;
        if (sVar != null && sVar.m0() > 0) {
            this.f11492e.i(wVar, iArr2);
        }
        if (this.f11489b.D0() > 0) {
            this.f11489b.p();
        }
    }

    public Mesh W1(int i11, FloatBuffer floatBuffer) {
        return X1(i11, floatBuffer, 0, floatBuffer.limit());
    }

    public float X(float f11, float f12, float f13) {
        return i0(f11, f12, f13, 0, D0(), null);
    }

    public Mesh X1(int i11, FloatBuffer floatBuffer, int i12, int i13) {
        this.f11492e.I0(i11, floatBuffer, i12, i13);
        return this;
    }

    public Mesh Y1(int i11, float[] fArr) {
        return Z1(i11, fArr, 0, fArr.length);
    }

    public float Z(float f11, float f12, float f13, int i11, int i12) {
        return i0(f11, f12, f13, i11, i12, null);
    }

    public Mesh Z1(int i11, float[] fArr, int i12, int i13) {
        this.f11492e.j0(i11, fArr, i12, i13);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.badlogic.gdx.graphics.Mesh a1(boolean r19, boolean r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.Mesh.a1(boolean, boolean, int[]):com.badlogic.gdx.graphics.Mesh");
    }

    public Mesh a2(int i11, float[] fArr) {
        return b2(i11, fArr, 0, fArr.length);
    }

    public Mesh b1() {
        if (this.f11493f) {
            this.f11493f = false;
            this.f11492e.dispose();
            this.f11492e = null;
        }
        return this;
    }

    public Mesh b2(int i11, float[] fArr, int i12, int i13) {
        this.f11488a.r0(i11, fArr, i12, i13);
        return this;
    }

    public Mesh c1(boolean z11, int i11, r... rVarArr) {
        if (this.f11493f) {
            throw new GdxRuntimeException("Trying to enable InstancedRendering on same Mesh instance twice. Use disableInstancedRendering to clean up old InstanceData first");
        }
        this.f11493f = true;
        this.f11492e = new n2.q(z11, i11, rVarArr);
        return this;
    }

    public BoundingBox d1(BoundingBox boundingBox, int i11, int i12) {
        return e1(boundingBox, i11, i12, null);
    }

    @Override // a3.q
    public void dispose() {
        Map<Application, com.badlogic.gdx.utils.a<Mesh>> map = f11487h;
        if (map.get(q1.g.f81378a) != null) {
            map.get(q1.g.f81378a).C(this, true);
        }
        this.f11488a.dispose();
        n2.s sVar = this.f11492e;
        if (sVar != null) {
            sVar.dispose();
        }
        this.f11489b.dispose();
    }

    public BoundingBox e1(BoundingBox boundingBox, int i11, int i12, Matrix4 matrix4) {
        int i13;
        int D0 = D0();
        int m11 = m();
        if (D0 != 0) {
            m11 = D0;
        }
        if (i11 < 0 || i12 < 1 || (i13 = i11 + i12) > m11) {
            throw new GdxRuntimeException("Invalid part specified ( offset=" + i11 + ", count=" + i12 + ", max=" + m11 + " )");
        }
        FloatBuffer d11 = this.f11488a.d(false);
        ShortBuffer d12 = this.f11489b.d(false);
        r q12 = q1(1);
        int i14 = q12.f12492e / 4;
        int i15 = this.f11488a.getAttributes().f12497b / 4;
        int i16 = q12.f12489b;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    if (D0 > 0) {
                        while (i11 < i13) {
                            int i17 = ((d12.get(i11) & c2.f100412d) * i15) + i14;
                            this.f11494g.set(d11.get(i17), d11.get(i17 + 1), d11.get(i17 + 2));
                            if (matrix4 != null) {
                                this.f11494g.mul(matrix4);
                            }
                            boundingBox.ext(this.f11494g);
                            i11++;
                        }
                    } else {
                        while (i11 < i13) {
                            int i18 = (i11 * i15) + i14;
                            this.f11494g.set(d11.get(i18), d11.get(i18 + 1), d11.get(i18 + 2));
                            if (matrix4 != null) {
                                this.f11494g.mul(matrix4);
                            }
                            boundingBox.ext(this.f11494g);
                            i11++;
                        }
                    }
                }
            } else if (D0 > 0) {
                while (i11 < i13) {
                    int i19 = ((d12.get(i11) & c2.f100412d) * i15) + i14;
                    this.f11494g.set(d11.get(i19), d11.get(i19 + 1), 0.0f);
                    if (matrix4 != null) {
                        this.f11494g.mul(matrix4);
                    }
                    boundingBox.ext(this.f11494g);
                    i11++;
                }
            } else {
                while (i11 < i13) {
                    int i21 = (i11 * i15) + i14;
                    this.f11494g.set(d11.get(i21), d11.get(i21 + 1), 0.0f);
                    if (matrix4 != null) {
                        this.f11494g.mul(matrix4);
                    }
                    boundingBox.ext(this.f11494g);
                    i11++;
                }
            }
        } else if (D0 > 0) {
            while (i11 < i13) {
                this.f11494g.set(d11.get(((d12.get(i11) & c2.f100412d) * i15) + i14), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.f11494g.mul(matrix4);
                }
                boundingBox.ext(this.f11494g);
                i11++;
            }
        } else {
            while (i11 < i13) {
                this.f11494g.set(d11.get((i11 * i15) + i14), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.f11494g.mul(matrix4);
                }
                boundingBox.ext(this.f11494g);
                i11++;
            }
        }
        return boundingBox;
    }

    public void f(w wVar) {
        V1(wVar, null, null);
    }

    public n2.p f1() {
        return this.f11489b;
    }

    public void g1(int i11, int i12, short[] sArr, int i13) {
        int D0 = D0();
        if (i12 < 0) {
            i12 = D0 - i11;
        }
        if (i11 < 0 || i11 >= D0 || i11 + i12 > D0) {
            throw new IllegalArgumentException("Invalid range specified, offset: " + i11 + ", count: " + i12 + ", max: " + D0);
        }
        if (sArr.length - i13 >= i12) {
            ShortBuffer l12 = l1(false);
            int position = l12.position();
            l12.position(i11);
            l12.get(sArr, i13, i12);
            l12.position(position);
            return;
        }
        throw new IllegalArgumentException("not enough room in indices array, has " + sArr.length + " shorts, needs " + i12);
    }

    public void h1(int i11, short[] sArr, int i12) {
        g1(i11, -1, sArr, i12);
    }

    public float i0(float f11, float f12, float f13, int i11, int i12, Matrix4 matrix4) {
        return (float) Math.sqrt(J0(f11, f12, f13, i11, i12, matrix4));
    }

    public void i1(short[] sArr) {
        j1(sArr, 0);
    }

    public void j1(short[] sArr, int i11) {
        h1(0, sArr, i11);
    }

    @Deprecated
    public ShortBuffer k1() {
        return this.f11489b.d(true);
    }

    public ShortBuffer l1(boolean z11) {
        return this.f11489b.d(z11);
    }

    public int m() {
        return this.f11488a.m();
    }

    public s m1() {
        n2.s sVar = this.f11492e;
        if (sVar != null) {
            return sVar.getAttributes();
        }
        return null;
    }

    public void n(w wVar) {
        o(wVar, null, null);
    }

    public float n0(Vector3 vector3) {
        return i0(vector3.f12537x, vector3.f12538y, vector3.f12539z, 0, D0(), null);
    }

    public void o(w wVar, int[] iArr, int[] iArr2) {
        this.f11488a.g(wVar, iArr);
        n2.s sVar = this.f11492e;
        if (sVar != null && sVar.m0() > 0) {
            this.f11492e.g(wVar, iArr2);
        }
        if (this.f11489b.D0() > 0) {
            this.f11489b.S();
        }
    }

    public int o1() {
        return this.f11489b.o0();
    }

    public int p1() {
        return this.f11488a.W();
    }

    public r q1(int i11) {
        s attributes = this.f11488a.getAttributes();
        int size = attributes.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (attributes.f(i12).f12488a == i11) {
                return attributes.f(i12);
            }
        }
        return null;
    }

    public s r1() {
        return this.f11488a.getAttributes();
    }

    public int s1() {
        return this.f11488a.getAttributes().f12497b;
    }

    public float[] t1(int i11, int i12, float[] fArr) {
        return u1(i11, i12, fArr, 0);
    }

    public float[] u1(int i11, int i12, float[] fArr, int i13) {
        int m11 = (m() * s1()) / 4;
        if (i12 == -1 && (i12 = m11 - i11) > fArr.length - i13) {
            i12 = fArr.length - i13;
        }
        if (i11 < 0 || i12 <= 0 || i11 + i12 > m11 || i13 < 0 || i13 >= fArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (fArr.length - i13 >= i12) {
            FloatBuffer y12 = y1(false);
            int position = y12.position();
            y12.position(i11);
            y12.get(fArr, i13, i12);
            y12.position(position);
            return fArr;
        }
        throw new IllegalArgumentException("not enough room in vertices array, has " + fArr.length + " floats, needs " + i12);
    }

    public float[] v1(int i11, float[] fArr) {
        return t1(i11, -1, fArr);
    }

    public float w0(Vector3 vector3, int i11, int i12) {
        return i0(vector3.f12537x, vector3.f12538y, vector3.f12539z, i11, i12, null);
    }

    public float[] w1(float[] fArr) {
        return t1(0, -1, fArr);
    }

    @Deprecated
    public FloatBuffer x1() {
        return this.f11488a.d(true);
    }

    public FloatBuffer y1(boolean z11) {
        return this.f11488a.d(z11);
    }

    public BoundingBox z() {
        BoundingBox boundingBox = new BoundingBox();
        R(boundingBox);
        return boundingBox;
    }

    public Mesh(boolean z11, int i11, int i12, r... rVarArr) {
        this.f11490c = true;
        this.f11493f = false;
        this.f11494g = new Vector3();
        this.f11488a = B1(z11, i11, new s(rVarArr));
        this.f11489b = new n2.n(z11, i12);
        this.f11491d = false;
        b(q1.g.f81378a, this);
    }

    public Mesh(boolean z11, int i11, int i12, s sVar) {
        this.f11490c = true;
        this.f11493f = false;
        this.f11494g = new Vector3();
        this.f11488a = B1(z11, i11, sVar);
        this.f11489b = new n2.n(z11, i12);
        this.f11491d = false;
        b(q1.g.f81378a, this);
    }

    public Mesh(boolean z11, boolean z12, int i11, int i12, s sVar) {
        this.f11490c = true;
        this.f11493f = false;
        this.f11494g = new Vector3();
        this.f11488a = B1(z11, i11, sVar);
        this.f11489b = new n2.n(z12, i12);
        this.f11491d = false;
        b(q1.g.f81378a, this);
    }

    public Mesh(VertexDataType vertexDataType, boolean z11, int i11, int i12, r... rVarArr) {
        this(vertexDataType, z11, i11, i12, new s(rVarArr));
    }

    public Mesh(VertexDataType vertexDataType, boolean z11, int i11, int i12, s sVar) {
        this.f11490c = true;
        this.f11493f = false;
        this.f11494g = new Vector3();
        int i13 = a.f11495a[vertexDataType.ordinal()];
        if (i13 == 1) {
            this.f11488a = new y(z11, i11, sVar);
            this.f11489b = new n2.n(z11, i12);
            this.f11491d = false;
        } else if (i13 == 2) {
            this.f11488a = new z(z11, i11, sVar);
            this.f11489b = new n2.o(z11, i12);
            this.f11491d = false;
        } else if (i13 != 3) {
            this.f11488a = new x(i11, sVar);
            this.f11489b = new n2.m(i12);
            this.f11491d = true;
        } else {
            this.f11488a = new a0(z11, i11, sVar);
            this.f11489b = new n2.o(z11, i12);
            this.f11491d = false;
        }
        b(q1.g.f81378a, this);
    }
}
