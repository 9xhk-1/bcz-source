package ku;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class f0 extends d implements Serializable {
    private static final long serialVersionUID = 2;

    public f0(ju.m mVar) {
        super(mVar);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new c1(this);
    }

    @Override // ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        sb2.append("null");
    }

    @Override // ku.d
    public String Q0() {
        return "null";
    }

    @Override // ku.d
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public f0 G0(ju.m mVar) {
        return new f0(mVar);
    }

    @Override // ju.t
    public Object c() {
        return null;
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        return ConfigValueType.NULL;
    }
}
