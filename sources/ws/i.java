package ws;

import java.io.Closeable;
import java.io.IOException;
import m80.l;
import okio.ByteString;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface i extends Closeable {
    void A7() throws IOException;

    void E6() throws IOException;

    void H7(byte b11, int i11) throws IOException;

    void I4() throws IOException;

    @m80.k
    ByteString K3() throws IOException;

    void L2(short s11) throws IOException;

    void N2() throws IOException;

    @m80.k
    g O() throws IOException;

    void Q6(@m80.k String str, int i11, byte b11) throws IOException;

    long T1() throws IOException;

    @m80.k
    h T8() throws IOException;

    void U3(@m80.k String str, byte b11, int i11) throws IOException;

    void V0() throws IOException;

    void W1() throws IOException;

    @m80.k
    j X0() throws IOException;

    void a4(boolean z11) throws IOException;

    @m80.k
    d a6() throws IOException;

    void b3(byte b11, byte b12, int i11) throws IOException;

    void b6() throws IOException;

    @l
    Object g(@m80.k j00.c<? super g2> cVar);

    void g6(@m80.k String str) throws IOException;

    void i5() throws IOException;

    void l4() throws IOException;

    void l5(int i11) throws IOException;

    void l8() throws IOException;

    void o8() throws IOException;

    void p1(@m80.k String str) throws IOException;

    void q7(long j11) throws IOException;

    void r0() throws IOException;

    boolean readBool() throws IOException;

    byte readByte() throws IOException;

    double readDouble() throws IOException;

    @m80.k
    String readString() throws IOException;

    int s8() throws IOException;

    void t4() throws IOException;

    void u(byte b11) throws IOException;

    @m80.k
    k u0() throws IOException;

    @m80.k
    f v4() throws IOException;

    short w6() throws IOException;

    void writeDouble(double d11) throws IOException;

    void y2(byte b11, int i11) throws IOException;

    void z1(@m80.k ByteString byteString) throws IOException;

    default void reset() {
    }
}
