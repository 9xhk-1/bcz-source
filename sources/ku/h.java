package ku;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class h extends d implements Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68722b;

    public h(ju.m mVar, boolean z11) {
        super(mVar);
        this.f68722b = z11;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new c1(this);
    }

    @Override // ku.d
    public String Q0() {
        return this.f68722b ? n6.m.f74525c : "false";
    }

    @Override // ku.d
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public h G0(ju.m mVar) {
        return new h(mVar, this.f68722b);
    }

    @Override // ju.t
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public Boolean c() {
        return Boolean.valueOf(this.f68722b);
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        return ConfigValueType.BOOLEAN;
    }
}
