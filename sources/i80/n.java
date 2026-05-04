package i80;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Method f60323a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadMode f60324b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f60325c;

    /* renamed from: d, reason: collision with root package name */
    public final int f60326d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f60327e;

    /* renamed from: f, reason: collision with root package name */
    public String f60328f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i11, boolean z11) {
        this.f60323a = method;
        this.f60324b = threadMode;
        this.f60325c = cls;
        this.f60326d = i11;
        this.f60327e = z11;
    }

    public final synchronized void a() {
        if (this.f60328f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f60323a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f60323a.getName());
            sb2.append('(');
            sb2.append(this.f60325c.getName());
            this.f60328f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        a();
        n nVar = (n) obj;
        nVar.a();
        return this.f60328f.equals(nVar.f60328f);
    }

    public int hashCode() {
        return this.f60323a.hashCode();
    }
}
