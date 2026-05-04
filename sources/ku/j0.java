package ku;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class j0 extends d implements Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final String f68736b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends j0 {
        public a(ju.m mVar, String str) {
            super(mVar, str);
        }

        private Object writeReplace() throws ObjectStreamException {
            return new c1(this);
        }

        @Override // ku.d
        /* renamed from: W0, reason: merged with bridge method [inline-methods] */
        public a G0(ju.m mVar) {
            return new a(mVar, this.f68736b);
        }

        @Override // ku.j0, ju.t
        public /* bridge */ /* synthetic */ Object c() {
            return super.c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends j0 {
        public b(ju.m mVar, String str) {
            super(mVar, str);
        }

        private Object writeReplace() throws ObjectStreamException {
            return new c1(this);
        }

        @Override // ku.d
        /* renamed from: W0, reason: merged with bridge method [inline-methods] */
        public b G0(ju.m mVar) {
            return new b(mVar, this.f68736b);
        }

        @Override // ku.j0, ju.t
        public /* bridge */ /* synthetic */ Object c() {
            return super.c();
        }
    }

    public j0(ju.m mVar, String str) {
        super(mVar);
        this.f68736b = str;
    }

    @Override // ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        if (v0(qVar)) {
            j0(sb2);
        } else {
            sb2.append(qVar.e() ? q.i(this.f68736b) : q.j(this.f68736b));
        }
    }

    @Override // ku.d
    public String Q0() {
        return this.f68736b;
    }

    @Override // ju.t
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public String c() {
        return this.f68736b;
    }

    public boolean V0() {
        return this instanceof a;
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        return ConfigValueType.STRING;
    }
}
