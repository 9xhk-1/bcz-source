package org.apache.http.message;

import e80.a;
import java.io.Serializable;
import l70.r;
import org.apache.http.ParseException;
import org.apache.http.d;
import org.apache.http.f;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class BufferedHeader implements d, Cloneable, Serializable {
    private static final long serialVersionUID = -2768352615787625448L;
    private final CharArrayBuffer buffer;
    private final String name;
    private final int valuePos;

    public BufferedHeader(CharArrayBuffer charArrayBuffer) throws ParseException {
        a.j(charArrayBuffer, "Char array buffer");
        int indexOf = charArrayBuffer.indexOf(58);
        if (indexOf == -1) {
            throw new ParseException("Invalid header: " + charArrayBuffer.toString());
        }
        String substringTrimmed = charArrayBuffer.substringTrimmed(0, indexOf);
        if (substringTrimmed.isEmpty()) {
            throw new ParseException("Invalid header: " + charArrayBuffer.toString());
        }
        this.buffer = charArrayBuffer;
        this.name = substringTrimmed;
        this.valuePos = indexOf + 1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.d
    public CharArrayBuffer getBuffer() {
        return this.buffer;
    }

    @Override // org.apache.http.e
    public f[] getElements() throws ParseException {
        r rVar = new r(0, this.buffer.length());
        rVar.e(this.valuePos);
        return l70.f.f70688c.a(this.buffer, rVar);
    }

    @Override // org.apache.http.v
    public String getName() {
        return this.name;
    }

    @Override // org.apache.http.v
    public String getValue() {
        CharArrayBuffer charArrayBuffer = this.buffer;
        return charArrayBuffer.substringTrimmed(this.valuePos, charArrayBuffer.length());
    }

    @Override // org.apache.http.d
    public int getValuePos() {
        return this.valuePos;
    }

    public String toString() {
        return this.buffer.toString();
    }
}
