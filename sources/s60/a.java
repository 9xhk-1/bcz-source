package s60;

import java.io.UnsupportedEncodingException;
import n60.g;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends d implements g, n60.f {

    /* renamed from: d, reason: collision with root package name */
    public final String f88046d;

    public a() {
        this("UTF-8");
    }

    @Override // n60.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return h(str, i());
    }

    @Override // n60.f
    public String b(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return c(str);
        } catch (UnsupportedEncodingException e11) {
            throw new DecoderException(e11.getMessage(), e11);
        }
    }

    @Override // s60.d
    public byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return o60.d.v(bArr);
    }

    @Override // n60.d
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return b((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
    }

    @Override // s60.d
    public byte[] e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return o60.d.x(bArr);
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
    }

    @Override // s60.d
    public String g() {
        return "B";
    }

    public String h(String str, String str2) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return f(str, str2);
        } catch (UnsupportedEncodingException e11) {
            throw new EncoderException(e11.getMessage(), e11);
        }
    }

    public String i() {
        return this.f88046d;
    }

    public a(String str) {
        this.f88046d = str;
    }
}
