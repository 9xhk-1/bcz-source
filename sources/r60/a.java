package r60;

import n60.g;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.RuleType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public d f83273a = new d(NameType.GENERIC, RuleType.APPROX, true);

    @Override // n60.g
    public String a(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        return this.f83273a.c(str);
    }

    public NameType b() {
        return this.f83273a.f();
    }

    public RuleType c() {
        return this.f83273a.g();
    }

    public boolean d() {
        return this.f83273a.h();
    }

    public void e(boolean z11) {
        this.f83273a = new d(this.f83273a.f(), this.f83273a.g(), z11);
    }

    @Override // n60.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("BeiderMorseEncoder encode parameter is not of type String");
    }

    public void f(NameType nameType) {
        this.f83273a = new d(nameType, this.f83273a.g(), this.f83273a.h());
    }

    public void g(RuleType ruleType) {
        this.f83273a = new d(this.f83273a.f(), ruleType, this.f83273a.h());
    }
}
