package z7;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import okio.ByteString;
import ws.i;
import ws.j;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ws.c f101042a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, g2> f101043b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k ws.c compact, @k l<? super String, g2> methodCalled) {
        g0.p(compact, "compact");
        g0.p(methodCalled, "methodCalled");
        this.f101042a = compact;
        this.f101043b = methodCalled;
    }

    @Override // ws.i
    public void A7() {
        this.f101042a.A7();
    }

    @Override // ws.i
    public void E6() {
        this.f101042a.E6();
    }

    @Override // ws.i
    public void H7(byte b11, int i11) {
        this.f101042a.H7(b11, i11);
    }

    @Override // ws.i
    public void I4() {
        this.f101042a.I4();
    }

    @Override // ws.i
    @k
    public ByteString K3() {
        return this.f101042a.K3();
    }

    @Override // ws.i
    public void L2(short s11) {
        this.f101042a.L2(s11);
    }

    @Override // ws.i
    public void N2() {
        this.f101042a.N2();
    }

    @Override // ws.i
    @k
    public ws.g O() {
        return this.f101042a.O();
    }

    @Override // ws.i
    public void Q6(@k String fieldName, int i11, byte b11) {
        g0.p(fieldName, "fieldName");
        this.f101042a.Q6(fieldName, i11, b11);
    }

    @Override // ws.i
    public long T1() {
        return this.f101042a.T1();
    }

    @Override // ws.i
    @k
    public ws.h T8() {
        return this.f101042a.T8();
    }

    @Override // ws.i
    public void U3(@k String name, byte b11, int i11) throws IOException {
        g0.p(name, "name");
        this.f101043b.invoke(name);
        this.f101042a.U3(name, b11, i11);
    }

    @Override // ws.i
    public void V0() {
        this.f101042a.V0();
    }

    @Override // ws.i
    public void W1() {
        this.f101042a.W1();
    }

    @Override // ws.i
    @k
    public j X0() {
        return this.f101042a.X0();
    }

    @Override // ws.i
    public void a4(boolean z11) {
        this.f101042a.a4(z11);
    }

    @Override // ws.i
    @k
    public ws.d a6() {
        return this.f101042a.a6();
    }

    @Override // ws.i
    public void b3(byte b11, byte b12, int i11) {
        this.f101042a.b3(b11, b12, i11);
    }

    @Override // ws.i
    public void b6() {
        this.f101042a.b6();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f101042a.close();
    }

    @Override // ws.i
    @m80.l
    public Object g(@k j00.c<? super g2> cVar) {
        return this.f101042a.g(cVar);
    }

    @Override // ws.i
    public void g6(@k String structName) {
        g0.p(structName, "structName");
        this.f101042a.g6(structName);
    }

    @Override // ws.i
    public void i5() {
        this.f101042a.i5();
    }

    @Override // ws.i
    public void l4() {
        this.f101042a.l4();
    }

    @Override // ws.i
    public void l5(int i11) {
        this.f101042a.l5(i11);
    }

    @Override // ws.i
    public void l8() {
        this.f101042a.l8();
    }

    @Override // ws.i
    public void o8() {
        this.f101042a.o8();
    }

    @Override // ws.i
    public void p1(@k String str) {
        g0.p(str, "str");
        this.f101042a.p1(str);
    }

    @Override // ws.i
    public void q7(long j11) {
        this.f101042a.q7(j11);
    }

    @Override // ws.i
    public void r0() {
        this.f101042a.r0();
    }

    @Override // ws.i
    public boolean readBool() {
        return this.f101042a.readBool();
    }

    @Override // ws.i
    public byte readByte() {
        return this.f101042a.readByte();
    }

    @Override // ws.i
    public double readDouble() {
        return this.f101042a.readDouble();
    }

    @Override // ws.i
    @k
    public String readString() {
        return this.f101042a.readString();
    }

    @Override // ws.i
    public void reset() {
        this.f101042a.reset();
    }

    @Override // ws.i
    public int s8() {
        return this.f101042a.s8();
    }

    @Override // ws.i
    public void t4() {
        this.f101042a.t4();
    }

    @Override // ws.i
    public void u(byte b11) {
        this.f101042a.u(b11);
    }

    @Override // ws.i
    @k
    public ws.k u0() {
        return this.f101042a.u0();
    }

    @Override // ws.i
    @k
    public ws.f v4() {
        return this.f101042a.v4();
    }

    @Override // ws.i
    public short w6() {
        return this.f101042a.w6();
    }

    @Override // ws.i
    public void writeDouble(double d11) {
        this.f101042a.writeDouble(d11);
    }

    @Override // ws.i
    public void y2(byte b11, int i11) {
        this.f101042a.y2(b11, i11);
    }

    @Override // ws.i
    public void z1(@k ByteString buf) {
        g0.p(buf, "buf");
        this.f101042a.z1(buf);
    }
}
