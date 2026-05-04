package l60;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface l extends e1, WritableByteChannel {
    @m80.k
    l A() throws IOException;

    @m80.k
    l M0(@m80.k String str, int i11, int i12) throws IOException;

    @m80.k
    l N1(@m80.k String str, int i11, int i12, @m80.k Charset charset) throws IOException;

    @m80.k
    OutputStream O8();

    @m80.k
    l Q1(long j11) throws IOException;

    @m80.k
    l R7(@m80.k String str, @m80.k Charset charset) throws IOException;

    long V2(@m80.k g1 g1Var) throws IOException;

    @m80.k
    l W(long j11) throws IOException;

    @m80.k
    l W2(int i11) throws IOException;

    @m80.k
    l X3(@m80.k ByteString byteString) throws IOException;

    @m80.k
    l X4() throws IOException;

    @m80.k
    l d8(@m80.k g1 g1Var, long j11) throws IOException;

    @Override // l60.e1, java.io.Flushable
    void flush() throws IOException;

    @m80.k
    k getBuffer();

    @m80.k
    l n5(@m80.k String str) throws IOException;

    @m80.k
    l o2(@m80.k ByteString byteString, int i11, int i12) throws IOException;

    @m80.k
    l p3(long j11) throws IOException;

    @m80.k
    l write(@m80.k byte[] bArr) throws IOException;

    @m80.k
    l write(@m80.k byte[] bArr, int i11, int i12) throws IOException;

    @m80.k
    l writeByte(int i11) throws IOException;

    @m80.k
    l writeInt(int i11) throws IOException;

    @m80.k
    l writeLong(long j11) throws IOException;

    @m80.k
    l writeShort(int i11) throws IOException;

    @m80.k
    l x4(int i11) throws IOException;

    @yz.n(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @yz.w0(expression = "buffer", imports = {}))
    @m80.k
    k z();

    @m80.k
    l z2(int i11) throws IOException;
}
