package o2;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends f implements com.badlogic.gdx.graphics.f {

    /* renamed from: mi, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.f f75573mi;

    public a(g gVar, com.badlogic.gdx.graphics.f fVar) {
        super(gVar);
        this.f75573mi = fVar;
    }

    private void u5() {
        int glGetError = this.f75573mi.glGetError();
        while (glGetError != 0) {
            this.f75584li.e().onError(glGetError);
            glGetError = this.f75573mi.glGetError();
        }
    }

    @Override // com.badlogic.gdx.graphics.f
    public void A(int i11) {
        this.f75582ji++;
        this.f75579gi++;
        this.f75573mi.A(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean A0(int i11) {
        this.f75579gi++;
        boolean A0 = this.f75573mi.A0(i11);
        u5();
        return A0;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void A1(int i11, int i12, String str) {
        this.f75579gi++;
        this.f75573mi.A1(i11, i12, str);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void B4(int i11, int i12, boolean z11, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75573mi.B4(i11, i12, z11, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void C0(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.C0(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void C2(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75573mi.C2(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void D(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.D(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void D1(int i11, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.D1(i11, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void D2(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75573mi.D2(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void E1(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.E1(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void F(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.F(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void F3(int i11, float f11, float f12, float f13) {
        this.f75579gi++;
        this.f75573mi.F3(i11, f11, f12, f13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean F4(int i11) {
        this.f75579gi++;
        boolean F4 = this.f75573mi.F4(i11);
        u5();
        return F4;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void G(int i11, float f11) {
        this.f75579gi++;
        this.f75573mi.G(i11, f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void G1(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75573mi.G1(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void G3(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75573mi.G3(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void I0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.I0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void I4(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.I4(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void J(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.J(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void J0(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.J0(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void K(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.K(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void K4(int i11, float f11) {
        this.f75579gi++;
        this.f75573mi.K4(i11, f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void L2(int i11, String str) {
        this.f75579gi++;
        this.f75573mi.L2(i11, str);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void M(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.M(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void M1(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.M1(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String M2(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2) {
        this.f75579gi++;
        String M2 = this.f75573mi.M2(i11, i12, intBuffer, intBuffer2);
        u5();
        return M2;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void M3(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.M3(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void O0(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.O0(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void O2(int i11, float f11, float f12) {
        this.f75579gi++;
        this.f75573mi.O2(i11, f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void P1(int i11) {
        this.f75579gi++;
        this.f75573mi.P1(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Q2(int i11, int i12, boolean z11, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75573mi.Q2(i11, i12, z11, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void R(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75573mi.R(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void S(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75573mi.S(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int S0() {
        this.f75579gi++;
        int S0 = this.f75573mi.S0();
        u5();
        return S0;
    }

    @Override // com.badlogic.gdx.graphics.f
    public int S1(int i11) {
        this.f75579gi++;
        int S1 = this.f75573mi.S1(i11);
        u5();
        return S1;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void S4(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75573mi.S4(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void T0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.T0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean U2(int i11) {
        this.f75579gi++;
        boolean U2 = this.f75573mi.U2(i11);
        u5();
        return U2;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void U3(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.U3(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void U4(int i11, float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75573mi.U4(i11, f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void V(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.V(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int V4() {
        this.f75579gi++;
        int V4 = this.f75573mi.V4();
        u5();
        return V4;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X0(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.X0(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X1(int i11, float f11, float f12) {
        this.f75579gi++;
        this.f75573mi.X1(i11, f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X2(int i11, int i12, int i13, boolean z11, int i14, int i15) {
        this.f75579gi++;
        this.f75573mi.X2(i11, i12, i13, z11, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void X3(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.X3(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Y2(int i11, int i12, int i13, int i14, int i15) {
        this.f75579gi++;
        this.f75573mi.Y2(i11, i12, i13, i14, i15);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Y4(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.Y4(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Z0(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.Z0(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void Z3(int i11) {
        this.f75579gi++;
        this.f75573mi.Z3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a(int i11, int i12, int i13, boolean z11, int i14, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.a(i11, i12, i13, z11, i14, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a1(int i11, int i12, int[] iArr, int i13) {
        this.f75579gi++;
        this.f75573mi.a1(i11, i12, iArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a4(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.a4(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void a5(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.a5(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void b5(int i11, int i12, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.b5(i11, i12, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void c0(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.c0(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void c1(int i11, int i12, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75573mi.c1(i11, i12, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void c2(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2) {
        this.f75579gi++;
        this.f75573mi.c2(i11, i12, intBuffer, intBuffer2);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void d0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.d0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean d1(int i11) {
        this.f75579gi++;
        boolean d12 = this.f75573mi.d1(i11);
        u5();
        return d12;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void d2(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.d2(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void e(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75573mi.e(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void e1(int i11) {
        this.f75579gi++;
        this.f75573mi.e1(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void e2(int i11, float f11, float f12, float f13) {
        this.f75579gi++;
        this.f75573mi.e2(i11, f11, f12, f13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int e5() {
        this.f75579gi++;
        int e52 = this.f75573mi.e5();
        u5();
        return e52;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void f0(int i11, int i12, int i13, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.f0(i11, i12, i13, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void f1(int i11, int i12, int i13, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.f1(i11, i12, i13, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String f3(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2) {
        this.f75579gi++;
        String f32 = this.f75573mi.f3(i11, i12, intBuffer, intBuffer2);
        u5();
        return f32;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void g3(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.g3(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void g5(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.g5(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glActiveTexture(int i11) {
        this.f75579gi++;
        this.f75573mi.glActiveTexture(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glBindTexture(int i11, int i12) {
        this.f75580hi++;
        this.f75579gi++;
        this.f75573mi.glBindTexture(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glBlendFunc(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.glBlendFunc(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClear(int i11) {
        this.f75579gi++;
        this.f75573mi.glClear(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClearColor(float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75573mi.glClearColor(f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClearDepthf(float f11) {
        this.f75579gi++;
        this.f75573mi.glClearDepthf(f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glClearStencil(int i11) {
        this.f75579gi++;
        this.f75573mi.glClearStencil(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glColorMask(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f75579gi++;
        this.f75573mi.glColorMask(z11, z12, z13, z14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCompressedTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.glCompressedTexImage2D(i11, i12, i13, i14, i15, i16, i17, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCompressedTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.glCompressedTexSubImage2D(i11, i12, i13, i14, i15, i16, i17, i18, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCopyTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f75579gi++;
        this.f75573mi.glCopyTexImage2D(i11, i12, i13, i14, i15, i16, i17, i18);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCopyTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f75579gi++;
        this.f75573mi.glCopyTexSubImage2D(i11, i12, i13, i14, i15, i16, i17, i18);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glCullFace(int i11) {
        this.f75579gi++;
        this.f75573mi.glCullFace(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDeleteTextures(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.glDeleteTextures(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDepthFunc(int i11) {
        this.f75579gi++;
        this.f75573mi.glDepthFunc(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDepthMask(boolean z11) {
        this.f75579gi++;
        this.f75573mi.glDepthMask(z11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDepthRangef(float f11, float f12) {
        this.f75579gi++;
        this.f75573mi.glDepthRangef(f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDisable(int i11) {
        this.f75579gi++;
        this.f75573mi.glDisable(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDrawArrays(int i11, int i12, int i13) {
        this.f75583ki.a(i13);
        this.f75581ii++;
        this.f75579gi++;
        this.f75573mi.glDrawArrays(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glDrawElements(int i11, int i12, int i13, Buffer buffer) {
        this.f75583ki.a(i12);
        this.f75581ii++;
        this.f75579gi++;
        this.f75573mi.glDrawElements(i11, i12, i13, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glEnable(int i11) {
        this.f75579gi++;
        this.f75573mi.glEnable(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glFinish() {
        this.f75579gi++;
        this.f75573mi.glFinish();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glFlush() {
        this.f75579gi++;
        this.f75573mi.glFlush();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glFrontFace(int i11) {
        this.f75579gi++;
        this.f75573mi.glFrontFace(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glGenTextures(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.glGenTextures(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int glGetError() {
        this.f75579gi++;
        return this.f75573mi.glGetError();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glGetIntegerv(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.glGetIntegerv(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String glGetString(int i11) {
        this.f75579gi++;
        String glGetString = this.f75573mi.glGetString(i11);
        u5();
        return glGetString;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glHint(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.glHint(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glLineWidth(float f11) {
        this.f75579gi++;
        this.f75573mi.glLineWidth(f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glPixelStorei(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.glPixelStorei(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glPolygonOffset(float f11, float f12) {
        this.f75579gi++;
        this.f75573mi.glPolygonOffset(f11, f12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glReadPixels(int i11, int i12, int i13, int i14, int i15, int i16, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.glReadPixels(i11, i12, i13, i14, i15, i16, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glSampleCoverage(float f11, boolean z11) {
        this.f75579gi++;
        this.f75573mi.glSampleCoverage(f11, z11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glScissor(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.glScissor(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glStencilFunc(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75573mi.glStencilFunc(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glStencilMask(int i11) {
        this.f75579gi++;
        this.f75573mi.glStencilMask(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glStencilOp(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75573mi.glStencilOp(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.glTexImage2D(i11, i12, i13, i14, i15, i16, i17, i18, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glTexParameterf(int i11, int i12, float f11) {
        this.f75579gi++;
        this.f75573mi.glTexParameterf(i11, i12, f11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer) {
        this.f75579gi++;
        this.f75573mi.glTexSubImage2D(i11, i12, i13, i14, i15, i16, i17, i18, buffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void glViewport(int i11, int i12, int i13, int i14) {
        this.f75579gi++;
        this.f75573mi.glViewport(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void h(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.h(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void h2(float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75573mi.h2(f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i1(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.i1(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i3(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.i3(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i4(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.i4(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void i5(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.i5(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void j3(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.j3(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void j4(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.j4(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int j5(int i11, String str) {
        this.f75579gi++;
        int j52 = this.f75573mi.j5(i11, str);
        u5();
        return j52;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void k(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.k(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void k3(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.k3(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void k5(int i11) {
        this.f75579gi++;
        this.f75573mi.k5(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void l3(int i11) {
        this.f75579gi++;
        this.f75573mi.l3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void l4(int i11, float f11, float f12, float f13, float f14) {
        this.f75579gi++;
        this.f75573mi.l4(i11, f11, f12, f13, f14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m0(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.m0(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m1(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.m1(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m2(int i11, int i12, Buffer buffer, int i13) {
        this.f75579gi++;
        this.f75573mi.m2(i11, i12, buffer, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void m3(int i11) {
        this.f75579gi++;
        this.f75573mi.m3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int m5(int i11) {
        this.f75579gi++;
        int m52 = this.f75573mi.m5(i11);
        u5();
        return m52;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void n(int i11) {
        this.f75579gi++;
        this.f75573mi.n(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void n0(int i11) {
        this.f75579gi++;
        this.f75573mi.n0(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int n2(int i11, String str) {
        this.f75579gi++;
        int n22 = this.f75573mi.n2(i11, str);
        u5();
        return n22;
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean n3(int i11) {
        this.f75579gi++;
        boolean n32 = this.f75573mi.n3(i11);
        u5();
        return n32;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void o0(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.o0(i11, i12, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String o4(int i11) {
        this.f75579gi++;
        String o42 = this.f75573mi.o4(i11);
        u5();
        return o42;
    }

    @Override // com.badlogic.gdx.graphics.f
    public int p() {
        this.f75579gi++;
        int p11 = this.f75573mi.p();
        u5();
        return p11;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void p0(int i11, IntBuffer intBuffer, int i12, Buffer buffer, int i13) {
        this.f75579gi++;
        this.f75573mi.p0(i11, intBuffer, i12, buffer, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void q0(int i11) {
        this.f75579gi++;
        this.f75573mi.q0(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public String q2(int i11) {
        this.f75579gi++;
        String q22 = this.f75573mi.q2(i11);
        u5();
        return q22;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void q3(int i11, int i12, Buffer buffer, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.q3(i11, i12, buffer, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void r2(int i11, int i12, boolean z11, float[] fArr, int i13) {
        this.f75579gi++;
        this.f75573mi.r2(i11, i12, z11, fArr, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void r4(int i11) {
        this.f75579gi++;
        this.f75573mi.r4(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s(int i11) {
        this.f75579gi++;
        this.f75573mi.s(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s1(int i11) {
        this.f75579gi++;
        this.f75573mi.s1(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean s2(int i11) {
        this.f75579gi++;
        boolean s22 = this.f75573mi.s2(i11);
        u5();
        return s22;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s3(int i11, int i12, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.s3(i11, i12, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void s4(int i11, int i12) {
        this.f75579gi++;
        this.f75573mi.s4(i11, i12);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void t(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.t(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void t1(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.t1(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public boolean t3(int i11) {
        this.f75579gi++;
        boolean t32 = this.f75573mi.t3(i11);
        u5();
        return t32;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void u0() {
        this.f75579gi++;
        this.f75573mi.u0();
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void u3(int i11) {
        this.f75579gi++;
        this.f75573mi.u3(i11);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void w0(int i11, int i12, boolean z11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.w0(i11, i12, z11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void w3(int i11, int i12, int i13, int i14) {
        this.f75583ki.a(i12);
        this.f75581ii++;
        this.f75579gi++;
        this.f75573mi.w3(i11, i12, i13, i14);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void x0(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.x0(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void x1(int i11, IntBuffer intBuffer) {
        this.f75579gi++;
        this.f75573mi.x1(i11, intBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public int x4() {
        this.f75579gi++;
        int x42 = this.f75573mi.x4();
        u5();
        return x42;
    }

    @Override // com.badlogic.gdx.graphics.f
    public void z0(int i11, int i12, int i13) {
        this.f75579gi++;
        this.f75573mi.z0(i11, i12, i13);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void z1(int i11, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.z1(i11, floatBuffer);
        u5();
    }

    @Override // com.badlogic.gdx.graphics.f
    public void z2(int i11, int i12, FloatBuffer floatBuffer) {
        this.f75579gi++;
        this.f75573mi.z2(i11, i12, floatBuffer);
        u5();
    }
}
