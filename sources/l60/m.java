package l60;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface m extends g1, ReadableByteChannel {
    long B1() throws IOException;

    void F(long j11) throws IOException;

    boolean J() throws IOException;

    boolean J0(long j11, @m80.k ByteString byteString) throws IOException;

    @m80.k
    String L5() throws IOException;

    long O1(@m80.k ByteString byteString, long j11) throws IOException;

    boolean O5(long j11, @m80.k ByteString byteString, int i11, int i12) throws IOException;

    @m80.l
    <T> T P(@m80.k j1<T> j1Var) throws IOException;

    @m80.k
    byte[] P5(long j11) throws IOException;

    long R(@m80.k ByteString byteString, long j11) throws IOException;

    @m80.k
    String R3() throws IOException;

    @m80.k
    InputStream R8();

    long T4(byte b11, long j11, long j12) throws IOException;

    void T6(@m80.k k kVar, long j11) throws IOException;

    long U1(byte b11) throws IOException;

    @m80.k
    String V3(long j11, @m80.k Charset charset) throws IOException;

    int X2(@m80.k v0 v0Var) throws IOException;

    long X6(@m80.k ByteString byteString, long j11, long j12) throws IOException;

    long b0(@m80.k ByteString byteString) throws IOException;

    @m80.k
    String b2(long j11) throws IOException;

    @m80.k
    String b5(long j11) throws IOException;

    int b8() throws IOException;

    @m80.k
    k getBuffer();

    @m80.k
    ByteString h2(long j11) throws IOException;

    @m80.k
    String h3(@m80.k Charset charset) throws IOException;

    int k3() throws IOException;

    long l0(byte b11, long j11) throws IOException;

    long m4() throws IOException;

    long p0(@m80.k ByteString byteString) throws IOException;

    @m80.k
    m peek();

    @m80.l
    String q0() throws IOException;

    @m80.k
    ByteString q3() throws IOException;

    int read(@m80.k byte[] bArr) throws IOException;

    int read(@m80.k byte[] bArr, int i11, int i12) throws IOException;

    byte readByte() throws IOException;

    void readFully(@m80.k byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j11) throws IOException;

    long s7() throws IOException;

    void skip(long j11) throws IOException;

    short v1() throws IOException;

    @m80.k
    byte[] w2() throws IOException;

    @yz.n(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @yz.w0(expression = "buffer", imports = {}))
    @m80.k
    k z();

    long z7(@m80.k e1 e1Var) throws IOException;
}
