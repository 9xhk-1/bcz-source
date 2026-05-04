package ku;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class s extends g0 implements Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f68809c;

    public s(ju.m mVar, int i11, String str) {
        super(mVar, str);
        this.f68809c = i11;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new c1(this);
    }

    @Override // ku.g0, ku.d
    public String Q0() {
        String Q0 = super.Q0();
        return Q0 == null ? Integer.toString(this.f68809c) : Q0;
    }

    @Override // ku.g0
    public double U0() {
        return this.f68809c;
    }

    @Override // ku.g0
    public long X0() {
        return this.f68809c;
    }

    @Override // ku.d
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public s G0(ju.m mVar) {
        return new s(mVar, this.f68809c, this.f68721b);
    }

    @Override // ku.g0, ju.t
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return Integer.valueOf(this.f68809c);
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        return ConfigValueType.NUMBER;
    }
}
