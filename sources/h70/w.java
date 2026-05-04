package h70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w extends z70.f implements x70.k {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f58828i = {13, 10};

    /* renamed from: f, reason: collision with root package name */
    public final CharsetEncoder f58829f;

    /* renamed from: g, reason: collision with root package name */
    public final int f58830g;

    /* renamed from: h, reason: collision with root package name */
    public CharBuffer f58831h;

    public w(int i11, int i12, CharsetEncoder charsetEncoder, z70.b bVar) {
        super(i11, bVar == null ? z70.g.f101095a : bVar);
        this.f58830g = e80.a.k(i12, "Line buffer size");
        this.f58829f = charsetEncoder;
    }

    private void x(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        u();
        int length = bArr.length;
        q(this.f101094c.position() + length);
        this.f101094c.put(bArr, 0, length);
    }

    @Override // x70.k
    public void b(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() <= 0) {
            x(f58828i);
            return;
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        c(charArrayBuffer);
    }

    @Override // x70.k
    public void c(CharArrayBuffer charArrayBuffer) throws CharacterCodingException {
        boolean z11;
        if (charArrayBuffer == null) {
            return;
        }
        u();
        if (charArrayBuffer.length() > 0) {
            int i11 = 0;
            if (this.f58829f == null) {
                q(this.f101094c.position() + charArrayBuffer.length());
                if (this.f101094c.hasArray()) {
                    byte[] array = this.f101094c.array();
                    int length = charArrayBuffer.length();
                    int position = this.f101094c.position();
                    while (i11 < length) {
                        array[position + i11] = (byte) charArrayBuffer.charAt(i11);
                        i11++;
                    }
                    this.f101094c.position(position + length);
                } else {
                    while (i11 < charArrayBuffer.length()) {
                        this.f101094c.put((byte) charArrayBuffer.charAt(i11));
                        i11++;
                    }
                }
            } else {
                if (this.f58831h == null) {
                    this.f58831h = CharBuffer.allocate(this.f58830g);
                }
                this.f58829f.reset();
                int length2 = charArrayBuffer.length();
                int i12 = 0;
                while (length2 > 0) {
                    int remaining = this.f58831h.remaining();
                    if (length2 <= remaining) {
                        remaining = length2;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f58831h.put(charArrayBuffer.buffer(), i12, remaining);
                    this.f58831h.flip();
                    boolean z12 = true;
                    while (z12) {
                        CoderResult encode = this.f58829f.encode(this.f58831h, this.f101094c, z11);
                        if (encode.isError()) {
                            encode.throwException();
                        }
                        if (encode.isOverflow()) {
                            r();
                        }
                        z12 = !encode.isUnderflow();
                    }
                    this.f58831h.compact();
                    i12 += remaining;
                    length2 -= remaining;
                }
                boolean z13 = true;
                while (z13) {
                    CoderResult flush = this.f58829f.flush(this.f101094c);
                    if (flush.isError()) {
                        flush.throwException();
                    }
                    if (flush.isOverflow()) {
                        r();
                    }
                    z13 = !flush.isUnderflow();
                }
            }
        }
        y();
    }

    @Override // x70.k
    public int i(WritableByteChannel writableByteChannel) throws IOException {
        e80.a.j(writableByteChannel, "Channel");
        v();
        return writableByteChannel.write(this.f101094c);
    }

    @Override // x70.k
    public void m(ReadableByteChannel readableByteChannel) throws IOException {
        if (readableByteChannel == null) {
            return;
        }
        u();
        readableByteChannel.read(this.f101094c);
    }

    @Override // z70.f
    public void p() {
        super.p();
    }

    public void w(HttpParams httpParams) {
        p();
    }

    @Override // x70.k
    public void write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return;
        }
        u();
        q(this.f101094c.position() + byteBuffer.remaining());
        this.f101094c.put(byteBuffer);
    }

    public final void y() {
        x(f58828i);
    }

    @Deprecated
    public w(int i11, int i12, z70.b bVar, HttpParams httpParams) {
        super(i11, bVar);
        this.f58830g = e80.a.k(i12, "Line buffer size");
        Charset b11 = e80.c.b((String) httpParams.getParameter(a80.c.f2303b));
        if (b11 != null) {
            CharsetEncoder newEncoder = b11.newEncoder();
            this.f58829f = newEncoder;
            CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(a80.c.f2310i);
            newEncoder.onMalformedInput(codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction);
            CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(a80.c.f2311j);
            newEncoder.onUnmappableCharacter(codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2);
            return;
        }
        this.f58829f = null;
    }

    @Deprecated
    public w(int i11, int i12, HttpParams httpParams) {
        this(i11, i12, z70.g.f101095a, httpParams);
    }

    public w(int i11) {
        this(i11, 256, (CharsetEncoder) null, z70.g.f101095a);
    }

    public w(int i11, int i12, Charset charset) {
        this(i11, i12, charset != null ? charset.newEncoder() : null, z70.g.f101095a);
    }

    public w(int i11, int i12) {
        this(i11, i12, (CharsetEncoder) null, z70.g.f101095a);
    }
}
