package o2;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends f implements com.badlogic.gdx.graphics.g {

    /* renamed from: mi, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.g f75574mi;

    public b(g gVar, com.badlogic.gdx.graphics.g gVar2) {
        super(gVar);
        this.f75574mi = gVar2;
    }

    private void u5() {
        int glGetError = this.f75574mi.glGetError();
        while (glGetError != 0) {
            this.f75584li.e().onError(glGetError);
            glGetError = this.f75574mi.glGetError();
        }
    }

    @Override // com.badlogic.gdx.graphics.f
    public void A(int i11) {
        this.f75582ji++;
        this.f75579gi++;
        this.f75574mi.A(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean A0(int i11) {
        this.f75579gi++;
        boolean A0 = this.f75574mi.A0(i11);
        u5();
        return A0;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void A1(int i11, int i12, String str) {
        this.f75579gi++;
        this.f75574mi.A1(i11, i12, str);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void A2(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.A2(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void B3(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.B3(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void B4(int i11, int i12, boolean z11, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75574mi.B4(i11, i12, z11, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void C(int i11) {
        this.f75579gi++;
        this.f75574mi.C(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void C0(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.C0(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void C2(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75574mi.C2(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void D(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.D(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void D0(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.D0(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void D1(int i11, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.D1(i11, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void D2(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75574mi.D2(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void D4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f75579gi++;
        this.f75574mi.D4(i11, i12, i13, i14, i15, i16, i17, i18, i19);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void E1(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.E1(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void E2(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.E2(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void E3(int i11, int i12, int i13, int i14, int i15) {
        this.f75583ki.a(i12);
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.E3(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void E4(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.E4(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void F(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.F(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void F0(int i11, int i12, int i13, int i14) {
        this.f75583ki.a(i13);
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.F0(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void F1(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.F1(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public boolean F2(int i11) {
        this.f75579gi++;
        boolean F2 = this.f75574mi.F2(i11);
        u5();
        return F2;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void F3(int i11, float f11, float f12, float f13) {
        this.f75579gi++;
        this.f75574mi.F3(i11, f11, f12, f13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean F4(int i11) {
        this.f75579gi++;
        boolean F4 = this.f75574mi.F4(i11);
        u5();
        return F4;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void G(int i11, float f11) {
        this.f75579gi++;
        this.f75574mi.G(i11, f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void G1(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.G1(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void G3(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75574mi.G3(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void G4(int i11, int i12, float f11, int i13) {
        this.f75579gi++;
        this.f75574mi.G4(i11, i12, f11, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void H(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.H(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void H1(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.H1(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void H4(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.H4(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void I0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.I0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void I1(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.I1(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void I2(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.I2(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void I4(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.I4(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void J(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.J(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void J0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.J0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public String J2(int i11, int i12) {
        this.f75579gi++;
        String J2 = this.f75574mi.J2(i11, i12);
        u5();
        return J2;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void J3(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f75583ki.a(i14);
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.J3(i11, i12, i13, i14, i15, i16);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void J4(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.J4(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void K(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.K(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void K0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.K0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void K3(int i11, int i12, Buffer buffer, Buffer buffer2) {
        this.f75579gi++;
        this.f75574mi.K3(i11, i12, buffer, buffer2);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void K4(int i11, float f11) {
        this.f75579gi++;
        this.f75574mi.K4(i11, f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public int L(int i11, String str) {
        this.f75579gi++;
        int L = this.f75574mi.L(i11, str);
        u5();
        return L;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void L0(int i11) {
        this.f75579gi++;
        this.f75574mi.L0(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public boolean L1(int i11) {
        this.f75579gi++;
        boolean L1 = this.f75574mi.L1(i11);
        u5();
        return L1;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void L2(int i11, String str) {
        this.f75579gi++;
        this.f75574mi.L2(i11, str);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void M(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.M(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void M0(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.M0(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void M1(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.M1(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String M2(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2) {
        this.f75579gi++;
        String M2 = this.f75574mi.M2(i11, i12, intBuffer, intBuffer2);
        u5();
        return M2;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void M3(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.M3(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void N() {
        this.f75579gi++;
        this.f75574mi.N();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void N3() {
        this.f75579gi++;
        this.f75574mi.N3();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void N4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.N4(i11, i12, i13, i14, i15, i16, i17, i18, i19, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void O(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.O(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void O0(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.O0(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void O2(int i11, float f11, float f12) {
        this.f75579gi++;
        this.f75574mi.O2(i11, f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void O3(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.O3(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void P0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.P0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void P1(int i11) {
        this.f75579gi++;
        this.f75574mi.P1(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void P4() {
        this.f75579gi++;
        this.f75574mi.P4();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void Q0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.Q0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public boolean Q1(int i11) {
        this.f75579gi++;
        boolean Q1 = this.f75574mi.Q1(i11);
        u5();
        return Q1;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Q2(int i11, int i12, boolean z11, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75574mi.Q2(i11, i12, z11, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void Q3(int i11, String[] strArr, int i12) {
        this.f75579gi++;
        this.f75574mi.Q3(i11, strArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void Q4(int i11, int i12, IntBuffer intBuffer, int i13, int i14, int i15, int i16) {
        this.f75579gi++;
        this.f75574mi.Q4(i11, i12, intBuffer, i13, i14, i15, i16);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void R(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75574mi.R(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void R0(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.R0(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void R1(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.R1(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void S(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75574mi.S(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int S0() {
        this.f75579gi++;
        int S0 = this.f75574mi.S0();
        u5();
        return S0;
    }

    @Override // com.badlogic.gdx.graphics.f
    public int S1(int i11) {
        this.f75579gi++;
        int S1 = this.f75574mi.S1(i11);
        u5();
        return S1;
    }

    @Override // com.badlogic.gdx.graphics.g
    public String S3(int i11, int i12) {
        this.f75579gi++;
        String S3 = this.f75574mi.S3(i11, i12);
        u5();
        return S3;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void S4(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75574mi.S4(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void T0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.T0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void T1(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.T1(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void T2(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.T2(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void T4(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.T4(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void U1(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.U1(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean U2(int i11) {
        this.f75579gi++;
        boolean U2 = this.f75574mi.U2(i11);
        u5();
        return U2;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void U3(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.U3(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void U4(int i11, float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75574mi.U4(i11, f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void V(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.V(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void V0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.V0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void V1(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.V1(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void V3(int i11) {
        this.f75579gi++;
        this.f75574mi.V3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int V4() {
        this.f75579gi++;
        int V4 = this.f75574mi.V4();
        u5();
        return V4;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void W0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.W0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void W1(int i11, int i12, IntBuffer intBuffer, int i13, IntBuffer intBuffer2) {
        this.f75579gi++;
        this.f75574mi.W1(i11, i12, intBuffer, i13, intBuffer2);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void W2(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.W2(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void W3(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.W3(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X0(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.X0(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X1(int i11, float f11, float f12) {
        this.f75579gi++;
        this.f75574mi.X1(i11, f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X2(int i11, int i12, int i13, boolean z11, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.X2(i11, i12, i13, z11, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X3(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.X3(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void X4(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.X4(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void Y(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.Y(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void Y0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.Y0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Y2(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.Y2(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Y4(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.Y4(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void Z(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.Z(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Z0(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.Z0(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void Z2(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.Z2(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Z3(int i11) {
        this.f75579gi++;
        this.f75574mi.Z3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a(int i11, int i12, int i13, boolean z11, int i14, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.a(i11, i12, i13, z11, i14, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a1(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75574mi.a1(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a4(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.a4(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a5(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.a5(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void b0(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        this.f75579gi++;
        this.f75574mi.b0(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void b1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.b1(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void b2(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.b2(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void b4(int i11, int i12, int i13, int i14, int i15, Buffer buffer) {
        this.f75583ki.a(i14);
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.b4(i11, i12, i13, i14, i15, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void b5(int i11, int i12, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.b5(i11, i12, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void c0(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.c0(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void c1(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75574mi.c1(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void c2(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2) {
        this.f75579gi++;
        this.f75574mi.c2(i11, i12, intBuffer, intBuffer2);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void c3(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f75579gi++;
        this.f75574mi.c3(i11, i12, i13, i14, i15, i16, i17, i18, i19);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public Buffer c4(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        Buffer c42 = this.f75574mi.c4(i11, i12, i13, i14);
        u5();
        return c42;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void c5(int i11, String[] strArr, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.c5(i11, strArr, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void d0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.d0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean d1(int i11) {
        this.f75579gi++;
        boolean d12 = this.f75574mi.d1(i11);
        u5();
        return d12;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void d2(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.d2(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void d3(int i11) {
        this.f75579gi++;
        this.f75574mi.d3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void d4(int i11, LongBuffer longBuffer) {
        this.f75579gi++;
        this.f75574mi.d4(i11, longBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void e(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.e(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void e0(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.e0(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void e1(int i11) {
        this.f75579gi++;
        this.f75574mi.e1(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void e2(int i11, float f11, float f12, float f13) {
        this.f75579gi++;
        this.f75574mi.e2(i11, f11, f12, f13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void e4(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.e4(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int e5() {
        this.f75579gi++;
        int e52 = this.f75574mi.e5();
        u5();
        return e52;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void f0(int i11, int i12, int i13, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.f0(i11, i12, i13, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void f1(int i11, int i12, int i13, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.f1(i11, i12, i13, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String f3(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2) {
        this.f75579gi++;
        String f32 = this.f75574mi.f3(i11, i12, intBuffer, intBuffer2);
        u5();
        return f32;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void f5(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.f5(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void g2(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.g2(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void g3(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.g3(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void g4(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.g4(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void g5(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.g5(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glActiveTexture(int i11) {
        this.f75579gi++;
        this.f75574mi.glActiveTexture(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glBindTexture(int i11, int i12) {
        this.f75580hi++;
        this.f75579gi++;
        this.f75574mi.glBindTexture(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glBlendFunc(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.glBlendFunc(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClear(int i11) {
        this.f75579gi++;
        this.f75574mi.glClear(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClearColor(float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75574mi.glClearColor(f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClearDepthf(float f11) {
        this.f75579gi++;
        this.f75574mi.glClearDepthf(f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClearStencil(int i11) {
        this.f75579gi++;
        this.f75574mi.glClearStencil(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glColorMask(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f75579gi++;
        this.f75574mi.glColorMask(z11, z12, z13, z14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCompressedTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.glCompressedTexImage2D(i11, i12, i13, i14, i15, i16, i17, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCompressedTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.glCompressedTexSubImage2D(i11, i12, i13, i14, i15, i16, i17, i18, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCopyTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f75579gi++;
        this.f75574mi.glCopyTexImage2D(i11, i12, i13, i14, i15, i16, i17, i18);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCopyTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f75579gi++;
        this.f75574mi.glCopyTexSubImage2D(i11, i12, i13, i14, i15, i16, i17, i18);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCullFace(int i11) {
        this.f75579gi++;
        this.f75574mi.glCullFace(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDeleteTextures(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.glDeleteTextures(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDepthFunc(int i11) {
        this.f75579gi++;
        this.f75574mi.glDepthFunc(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDepthMask(boolean z11) {
        this.f75579gi++;
        this.f75574mi.glDepthMask(z11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDepthRangef(float f11, float f12) {
        this.f75579gi++;
        this.f75574mi.glDepthRangef(f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDisable(int i11) {
        this.f75579gi++;
        this.f75574mi.glDisable(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDrawArrays(int i11, int i12, int i13) {
        this.f75583ki.a(i13);
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.glDrawArrays(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDrawElements(int i11, int i12, int i13, Buffer buffer) {
        this.f75583ki.a(i12);
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.glDrawElements(i11, i12, i13, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glEnable(int i11) {
        this.f75579gi++;
        this.f75574mi.glEnable(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glFinish() {
        this.f75579gi++;
        this.f75574mi.glFinish();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glFlush() {
        this.f75579gi++;
        this.f75574mi.glFlush();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glFrontFace(int i11) {
        this.f75579gi++;
        this.f75574mi.glFrontFace(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glGenTextures(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.glGenTextures(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int glGetError() {
        this.f75579gi++;
        return this.f75574mi.glGetError();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glGetIntegerv(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.glGetIntegerv(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String glGetString(int i11) {
        this.f75579gi++;
        String glGetString = this.f75574mi.glGetString(i11);
        u5();
        return glGetString;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glHint(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.glHint(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glLineWidth(float f11) {
        this.f75579gi++;
        this.f75574mi.glLineWidth(f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glPixelStorei(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.glPixelStorei(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glPolygonOffset(float f11, float f12) {
        this.f75579gi++;
        this.f75574mi.glPolygonOffset(f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glReadPixels(int i11, int i12, int i13, int i14, int i15, int i16, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.glReadPixels(i11, i12, i13, i14, i15, i16, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glSampleCoverage(float f11, boolean z11) {
        this.f75579gi++;
        this.f75574mi.glSampleCoverage(f11, z11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glScissor(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.glScissor(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glStencilFunc(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.glStencilFunc(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glStencilMask(int i11) {
        this.f75579gi++;
        this.f75574mi.glStencilMask(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glStencilOp(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.glStencilOp(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.glTexImage2D(i11, i12, i13, i14, i15, i16, i17, i18, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glTexParameterf(int i11, int i12, float f11) {
        this.f75579gi++;
        this.f75574mi.glTexParameterf(i11, i12, f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer) {
        this.f75579gi++;
        this.f75574mi.glTexSubImage2D(i11, i12, i13, i14, i15, i16, i17, i18, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glViewport(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75574mi.glViewport(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void h(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.h(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void h2(float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75574mi.h2(f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void h3(int i11, int[] iArr, int i12) {
        this.f75579gi++;
        this.f75574mi.h3(i11, iArr, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void h5(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.h5(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void i(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.i(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i1(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.i1(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i3(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.i3(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i4(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.i4(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i5(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.i5(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public int j(int i11, String str) {
        this.f75579gi++;
        int j11 = this.f75574mi.j(i11, str);
        u5();
        return j11;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void j3(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.j3(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void j4(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.j4(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int j5(int i11, String str) {
        this.f75579gi++;
        int j52 = this.f75574mi.j5(i11, str);
        u5();
        return j52;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void k(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.k(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void k0(int i11, int i12, LongBuffer longBuffer) {
        this.f75579gi++;
        this.f75574mi.k0(i11, i12, longBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void k2(int i11, int i12, int i13, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.k2(i11, i12, i13, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void k3(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.k3(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void k5(int i11) {
        this.f75579gi++;
        this.f75574mi.k5(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void l1(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.l1(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void l2(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.l2(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void l3(int i11) {
        this.f75579gi++;
        this.f75574mi.l3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void l4(int i11, float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75574mi.l4(i11, f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m0(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.m0(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m1(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.m1(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m2(int i11, int i12, Buffer buffer, int i13) {
        this.f75579gi++;
        this.f75574mi.m2(i11, i12, buffer, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m3(int i11) {
        this.f75579gi++;
        this.f75574mi.m3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int m5(int i11) {
        this.f75579gi++;
        int m52 = this.f75574mi.m5(i11);
        u5();
        return m52;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void n(int i11) {
        this.f75579gi++;
        this.f75574mi.n(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void n0(int i11) {
        this.f75579gi++;
        this.f75574mi.n0(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void n1(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75574mi.n1(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int n2(int i11, String str) {
        this.f75579gi++;
        int n22 = this.f75574mi.n2(i11, str);
        u5();
        return n22;
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean n3(int i11) {
        this.f75579gi++;
        boolean n32 = this.f75574mi.n3(i11);
        u5();
        return n32;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void n4(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.n4(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void o0(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.o0(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public Buffer o1(int i11, int i12) {
        this.f75579gi++;
        Buffer o12 = this.f75574mi.o1(i11, i12);
        u5();
        return o12;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void o3(int i11, int i12, float f11) {
        this.f75579gi++;
        this.f75574mi.o3(i11, i12, f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String o4(int i11) {
        this.f75579gi++;
        String o42 = this.f75574mi.o4(i11);
        u5();
        return o42;
    }

    @Override // com.badlogic.gdx.graphics.f
    public int p() {
        this.f75579gi++;
        int p11 = this.f75574mi.p();
        u5();
        return p11;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void p0(int i11, IntBuffer intBuffer, int i12, Buffer buffer, int i13) {
        this.f75579gi++;
        this.f75574mi.p0(i11, intBuffer, i12, buffer, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void q0(int i11) {
        this.f75579gi++;
        this.f75574mi.q0(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String q2(int i11) {
        this.f75579gi++;
        String q22 = this.f75574mi.q2(i11);
        u5();
        return q22;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void q3(int i11, int i12, Buffer buffer, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.q3(i11, i12, buffer, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void r0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.r0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void r1(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.r1(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void r2(int i11, int i12, boolean z11, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75574mi.r2(i11, i12, z11, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void r3(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.r3(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void r4(int i11) {
        this.f75579gi++;
        this.f75574mi.r4(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s(int i11) {
        this.f75579gi++;
        this.f75574mi.s(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s1(int i11) {
        this.f75579gi++;
        this.f75574mi.s1(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean s2(int i11) {
        this.f75579gi++;
        boolean s22 = this.f75574mi.s2(i11);
        u5();
        return s22;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s3(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.s3(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s4(int i11, int i12) {
        this.f75579gi++;
        this.f75574mi.s4(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void t(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.t(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void t0(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.t0(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void t1(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.t1(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean t3(int i11) {
        this.f75579gi++;
        boolean t32 = this.f75574mi.t3(i11);
        u5();
        return t32;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void u(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.u(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void u0() {
        this.f75579gi++;
        this.f75574mi.u0();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void u3(int i11) {
        this.f75579gi++;
        this.f75574mi.u3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void v4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
        this.f75579gi++;
        this.f75574mi.v4(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void w0(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.w0(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void w3(int i11, int i12, int i13, int i14) {
        this.f75583ki.a(i12);
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.w3(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void w4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f75579gi++;
        this.f75574mi.w4(i11, i12, i13, i14, i15, i16, i17, i18, i19);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public boolean x(int i11) {
        this.f75579gi++;
        boolean x11 = this.f75574mi.x(i11);
        u5();
        return x11;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void x0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.x0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void x1(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.x1(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int x4() {
        this.f75579gi++;
        int x42 = this.f75574mi.x4();
        u5();
        return x42;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void y(int i11, IntBuffer intBuffer) {
        this.f75581ii++;
        this.f75579gi++;
        this.f75574mi.y(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public boolean y0(int i11) {
        this.f75579gi++;
        boolean y02 = this.f75574mi.y0(i11);
        u5();
        return y02;
    }

    @Override // com.badlogic.gdx.graphics.g
    public void y1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        this.f75579gi++;
        this.f75574mi.y1(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void y4(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.y4(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.g
    public void z(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75574mi.z(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void z0(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75574mi.z0(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void z1(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.z1(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void z2(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75574mi.z2(i11, i12, floatBuffer);
        u5();
    }
}
