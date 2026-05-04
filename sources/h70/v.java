package h70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.MessageConstraintException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class v extends z70.f implements x70.j {

    /* renamed from: f, reason: collision with root package name */
    public final CharsetDecoder f58824f;

    /* renamed from: g, reason: collision with root package name */
    public final v60.c f58825g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58826h;

    /* renamed from: i, reason: collision with root package name */
    public CharBuffer f58827i;

    public v(int i11, int i12, v60.c cVar, CharsetDecoder charsetDecoder, z70.b bVar) {
        super(i11, bVar == null ? z70.g.f101095a : bVar);
        this.f58826h = e80.a.k(i12, "Line buffer size");
        this.f58825g = cVar == null ? v60.c.f93129c : cVar;
        this.f58824f = charsetDecoder;
    }

    @Override // x70.j
    public int e(ByteBuffer byteBuffer, int i11) {
        if (byteBuffer == null) {
            return 0;
        }
        v();
        int min = Math.min(byteBuffer.remaining(), i11);
        int min2 = Math.min(this.f101094c.remaining(), min);
        if (this.f101094c.remaining() <= min2) {
            byteBuffer.put(this.f101094c);
            return min2;
        }
        int limit = this.f101094c.limit();
        this.f101094c.limit(this.f101094c.position() + min2);
        byteBuffer.put(this.f101094c);
        this.f101094c.limit(limit);
        return min;
    }

    @Override // x70.j
    public int g(WritableByteChannel writableByteChannel, int i11) throws IOException {
        if (writableByteChannel == null) {
            return 0;
        }
        v();
        if (this.f101094c.remaining() <= i11) {
            return writableByteChannel.write(this.f101094c);
        }
        int limit = this.f101094c.limit();
        this.f101094c.limit(limit - (this.f101094c.remaining() - i11));
        int write = writableByteChannel.write(this.f101094c);
        this.f101094c.limit(limit);
        return write;
    }

    @Override // x70.j
    public int j(WritableByteChannel writableByteChannel) throws IOException {
        if (writableByteChannel == null) {
            return 0;
        }
        v();
        return writableByteChannel.write(this.f101094c);
    }

    @Override // x70.j
    public String l(boolean z11) throws CharacterCodingException {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (n(charArrayBuffer, z11)) {
            return charArrayBuffer.toString();
        }
        return null;
    }

    @Override // x70.j
    public boolean n(CharArrayBuffer charArrayBuffer, boolean z11) throws CharacterCodingException {
        int i11;
        CoderResult decode;
        v();
        int position = this.f101094c.position();
        while (true) {
            if (position >= this.f101094c.limit()) {
                i11 = -1;
                break;
            }
            if (this.f101094c.get(position) == 10) {
                i11 = position + 1;
                break;
            }
            position++;
        }
        int e11 = this.f58825g.e();
        if (e11 > 0) {
            if ((i11 > 0 ? i11 : this.f101094c.limit()) - this.f101094c.position() >= e11) {
                throw new MessageConstraintException("Maximum line length limit exceeded");
            }
        }
        if (i11 == -1) {
            if (!z11 || !this.f101094c.hasRemaining()) {
                return false;
            }
            i11 = this.f101094c.limit();
        }
        int limit = this.f101094c.limit();
        this.f101094c.limit(i11);
        charArrayBuffer.ensureCapacity(this.f101094c.limit() - this.f101094c.position());
        if (this.f58824f != null) {
            if (this.f58827i == null) {
                this.f58827i = CharBuffer.allocate(this.f58826h);
            }
            this.f58824f.reset();
            do {
                decode = this.f58824f.decode(this.f101094c, this.f58827i, true);
                if (decode.isError()) {
                    decode.throwException();
                }
                if (decode.isOverflow()) {
                    this.f58827i.flip();
                    charArrayBuffer.append(this.f58827i.array(), this.f58827i.position(), this.f58827i.remaining());
                    this.f58827i.clear();
                }
            } while (!decode.isUnderflow());
            this.f58824f.flush(this.f58827i);
            this.f58827i.flip();
            if (this.f58827i.hasRemaining()) {
                charArrayBuffer.append(this.f58827i.array(), this.f58827i.position(), this.f58827i.remaining());
            }
        } else if (this.f101094c.hasArray()) {
            byte[] array = this.f101094c.array();
            int position2 = this.f101094c.position();
            int remaining = this.f101094c.remaining();
            charArrayBuffer.append(array, position2, remaining);
            this.f101094c.position(position2 + remaining);
        } else {
            while (this.f101094c.hasRemaining()) {
                charArrayBuffer.append((char) (this.f101094c.get() & 255));
            }
        }
        this.f101094c.limit(limit);
        int length = charArrayBuffer.length();
        if (length > 0) {
            if (charArrayBuffer.charAt(length - 1) == '\n') {
                length--;
                charArrayBuffer.setLength(length);
            }
            if (length > 0 && charArrayBuffer.charAt(length - 1) == '\r') {
                charArrayBuffer.setLength(length - 1);
            }
        }
        return true;
    }

    @Override // x70.j
    public int o(ReadableByteChannel readableByteChannel) throws IOException {
        e80.a.j(readableByteChannel, "Channel");
        u();
        if (!this.f101094c.hasRemaining()) {
            r();
        }
        return readableByteChannel.read(this.f101094c);
    }

    @Override // z70.f
    public void p() {
        super.p();
    }

    @Override // x70.j
    public int read() {
        v();
        return this.f101094c.get() & 255;
    }

    @Override // x70.j
    public int read(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return 0;
        }
        return e(byteBuffer, byteBuffer.remaining());
    }

    public v(int i11, int i12, CharsetDecoder charsetDecoder, z70.b bVar) {
        this(i11, i12, null, charsetDecoder, bVar);
    }

    @Deprecated
    public v(int i11, int i12, z70.b bVar, HttpParams httpParams) {
        super(i11, bVar);
        this.f58826h = e80.a.k(i12, "Line buffer size");
        Charset b11 = e80.c.b((String) httpParams.getParameter(a80.c.f2303b));
        if (b11 != null) {
            CharsetDecoder newDecoder = b11.newDecoder();
            this.f58824f = newDecoder;
            CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(a80.c.f2310i);
            newDecoder.onMalformedInput(codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction);
            CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(a80.c.f2311j);
            newDecoder.onUnmappableCharacter(codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2);
        } else {
            this.f58824f = null;
        }
        this.f58825g = v60.c.f93129c;
    }

    @Deprecated
    public v(int i11, int i12, HttpParams httpParams) {
        this(i11, i12, z70.g.f101095a, httpParams);
    }

    public v(int i11, int i12, Charset charset) {
        this(i11, i12, null, charset != null ? charset.newDecoder() : null, z70.g.f101095a);
    }

    public v(int i11, int i12, v60.c cVar, Charset charset) {
        this(i11, i12, cVar, charset != null ? charset.newDecoder() : null, z70.g.f101095a);
    }

    public v(int i11, int i12) {
        this(i11, i12, null, null, z70.g.f101095a);
    }

    public v(int i11) {
        this(i11, 256, null, null, z70.g.f101095a);
    }
}
