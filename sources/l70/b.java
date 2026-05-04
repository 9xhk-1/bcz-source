package l70;

import com.huawei.hms.framework.common.ContainerUtils;
import org.apache.http.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b implements org.apache.http.f, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final String f70672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70673b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f70674c;

    public b(String str, String str2, v[] vVarArr) {
        this.f70672a = (String) e80.a.j(str, "Name");
        this.f70673b = str2;
        if (vVarArr != null) {
            this.f70674c = vVarArr;
        } else {
            this.f70674c = new v[0];
        }
    }

    @Override // org.apache.http.f
    public v a(int i11) {
        return this.f70674c[i11];
    }

    @Override // org.apache.http.f
    public v b(String str) {
        e80.a.j(str, "Name");
        for (v vVar : this.f70674c) {
            if (vVar.getName().equalsIgnoreCase(str)) {
                return vVar;
            }
        }
        return null;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.apache.http.f) {
            b bVar = (b) obj;
            if (this.f70672a.equals(bVar.f70672a) && e80.g.a(this.f70673b, bVar.f70673b) && e80.g.b(this.f70674c, bVar.f70674c)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.http.f
    public String getName() {
        return this.f70672a;
    }

    @Override // org.apache.http.f
    public int getParameterCount() {
        return this.f70674c.length;
    }

    @Override // org.apache.http.f
    public v[] getParameters() {
        return (v[]) this.f70674c.clone();
    }

    @Override // org.apache.http.f
    public String getValue() {
        return this.f70673b;
    }

    public int hashCode() {
        int d11 = e80.g.d(e80.g.d(17, this.f70672a), this.f70673b);
        for (v vVar : this.f70674c) {
            d11 = e80.g.d(d11, vVar);
        }
        return d11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f70672a);
        if (this.f70673b != null) {
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(this.f70673b);
        }
        for (v vVar : this.f70674c) {
            sb2.append("; ");
            sb2.append(vVar);
        }
        return sb2.toString();
    }

    public b(String str, String str2) {
        this(str, str2, null);
    }
}
