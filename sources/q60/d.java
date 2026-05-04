package q60;

import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d implements n60.g {

    /* renamed from: a, reason: collision with root package name */
    public final c f81796a = new c();

    @Override // n60.g
    public String a(String str) {
        return b(str);
    }

    public String b(String str) {
        return this.f81796a.a(str);
    }

    public boolean c(String str, String str2) {
        return b(str).equals(b(str2));
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return b((String) obj);
        }
        throw new EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }
}
