package e70;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.ConnectionClosedException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.MessageConstraintException;
import org.apache.http.ParseException;
import org.apache.http.TruncatedChunkException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f49534n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f49535o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f49536p = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f49537e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f49538f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49539g;

    /* renamed from: h, reason: collision with root package name */
    public CharArrayBuffer f49540h;

    /* renamed from: i, reason: collision with root package name */
    public long f49541i;

    /* renamed from: j, reason: collision with root package name */
    public long f49542j;

    /* renamed from: k, reason: collision with root package name */
    public final v60.c f49543k;

    /* renamed from: l, reason: collision with root package name */
    public final List<CharArrayBuffer> f49544l;

    /* renamed from: m, reason: collision with root package name */
    public org.apache.http.e[] f49545m;

    public e(ReadableByteChannel readableByteChannel, x70.j jVar, v60.c cVar, a70.v vVar) {
        super(readableByteChannel, jVar, vVar);
        this.f49537e = 0;
        this.f49541i = -1L;
        this.f49542j = 0L;
        this.f49538f = false;
        this.f49539g = false;
        this.f49543k = cVar == null ? v60.c.f93129c : cVar;
        this.f49544l = new ArrayList();
    }

    public org.apache.http.e[] h() {
        org.apache.http.e[] eVarArr = this.f49545m;
        return eVarArr != null ? (org.apache.http.e[]) eVarArr.clone() : new org.apache.http.e[0];
    }

    public final void i() throws IOException {
        char charAt;
        CharArrayBuffer charArrayBuffer = this.f49540h;
        int size = this.f49544l.size();
        int i11 = 0;
        if ((this.f49540h.charAt(0) != ' ' && this.f49540h.charAt(0) != '\t') || size <= 0) {
            this.f49544l.add(charArrayBuffer);
            this.f49540h = null;
            return;
        }
        CharArrayBuffer charArrayBuffer2 = this.f49544l.get(size - 1);
        while (i11 < charArrayBuffer.length() && ((charAt = charArrayBuffer.charAt(i11)) == ' ' || charAt == '\t')) {
            i11++;
        }
        int e11 = this.f49543k.e();
        if (e11 > 0 && ((charArrayBuffer2.length() + 1) + charArrayBuffer.length()) - i11 > e11) {
            throw new MessageConstraintException("Maximum line length limit exceeded");
        }
        charArrayBuffer2.append(' ');
        charArrayBuffer2.append(charArrayBuffer, i11, charArrayBuffer.length() - i11);
    }

    public final void j() throws IOException {
        if (this.f49544l.size() > 0) {
            this.f49545m = new org.apache.http.e[this.f49544l.size()];
            for (int i11 = 0; i11 < this.f49544l.size(); i11++) {
                try {
                    this.f49545m[i11] = new BufferedHeader(this.f49544l.get(i11));
                } catch (ParseException e11) {
                    throw new IOException(e11);
                }
            }
        }
        this.f49544l.clear();
    }

    public final void k() throws IOException {
        CharArrayBuffer charArrayBuffer = this.f49540h;
        if (charArrayBuffer == null) {
            this.f49540h = new CharArrayBuffer(32);
        } else {
            charArrayBuffer.clear();
        }
        if (this.f49538f) {
            if (!this.f49513b.n(this.f49540h, this.f49539g)) {
                if (this.f49513b.length() > 2 || this.f49539g) {
                    throw new MalformedChunkCodingException("CRLF expected at end of chunk");
                }
                return;
            } else {
                if (!this.f49540h.isEmpty()) {
                    throw new MalformedChunkCodingException("CRLF expected at end of chunk");
                }
                this.f49538f = false;
            }
        }
        boolean n11 = this.f49513b.n(this.f49540h, this.f49539g);
        int e11 = this.f49543k.e();
        if (e11 > 0 && (this.f49540h.length() > e11 || (!n11 && this.f49513b.length() > e11))) {
            throw new MessageConstraintException("Maximum line length limit exceeded");
        }
        if (!n11) {
            if (this.f49539g) {
                throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
            }
            return;
        }
        int indexOf = this.f49540h.indexOf(59);
        if (indexOf < 0) {
            indexOf = this.f49540h.length();
        }
        String substringTrimmed = this.f49540h.substringTrimmed(0, indexOf);
        try {
            this.f49541i = Long.parseLong(substringTrimmed, 16);
            this.f49542j = 0L;
        } catch (NumberFormatException unused) {
            throw new MalformedChunkCodingException("Bad chunk header: " + substringTrimmed);
        }
    }

    @Override // m70.a
    public int read(ByteBuffer byteBuffer) throws IOException {
        e80.a.j(byteBuffer, "Byte buffer");
        if (this.f49537e == 2) {
            return -1;
        }
        int i11 = 0;
        while (true) {
            if (this.f49537e != 2) {
                if ((!this.f49513b.a() || this.f49541i == -1) && b() == -1) {
                    this.f49539g = true;
                }
                int i12 = this.f49537e;
                if (i12 == 0) {
                    if (this.f49541i == -1) {
                        k();
                        long j11 = this.f49541i;
                        if (j11 == -1) {
                            break;
                        }
                        if (j11 == 0) {
                            this.f49541i = -1L;
                            this.f49537e = 1;
                        }
                    }
                    int e11 = this.f49513b.e(byteBuffer, (int) Math.min(this.f49541i - this.f49542j, SieveCacheKt.NodeLinkMask));
                    if (e11 > 0) {
                        this.f49542j += e11;
                        i11 += e11;
                    } else if (!this.f49513b.a() && this.f49539g) {
                        this.f49537e = 2;
                        f();
                        throw new TruncatedChunkException("Truncated chunk (expected size: %,d; actual size: %,d)", Long.valueOf(this.f49541i), Long.valueOf(this.f49542j));
                    }
                    if (this.f49542j != this.f49541i) {
                        break;
                    }
                    this.f49541i = -1L;
                    this.f49542j = 0L;
                    this.f49538f = true;
                } else if (i12 == 1) {
                    CharArrayBuffer charArrayBuffer = this.f49540h;
                    if (charArrayBuffer == null) {
                        this.f49540h = new CharArrayBuffer(32);
                    } else {
                        charArrayBuffer.clear();
                    }
                    if (this.f49513b.n(this.f49540h, this.f49539g)) {
                        if (this.f49540h.length() > 0) {
                            int d11 = this.f49543k.d();
                            if (d11 > 0 && this.f49544l.size() >= d11) {
                                throw new MessageConstraintException("Maximum header count exceeded");
                            }
                            i();
                        } else {
                            this.f49537e = 2;
                            f();
                            j();
                        }
                    } else if (this.f49539g) {
                        this.f49537e = 2;
                        f();
                        return i11;
                    }
                } else {
                    continue;
                }
            } else {
                break;
            }
        }
        return i11;
    }

    public String toString() {
        return "[chunk-coded; completed: " + this.f49515d + "]";
    }

    public e(ReadableByteChannel readableByteChannel, x70.j jVar, a70.v vVar) {
        this(readableByteChannel, jVar, null, vVar);
    }
}
