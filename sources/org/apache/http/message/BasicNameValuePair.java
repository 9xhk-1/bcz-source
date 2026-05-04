package org.apache.http.message;

import com.huawei.hms.framework.common.ContainerUtils;
import e80.g;
import java.io.Serializable;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.v;
import t60.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class BasicNameValuePair implements v, Cloneable, Serializable {
    private static final long serialVersionUID = -6437800749411518984L;
    private final String name;
    private final String value;

    public BasicNameValuePair(String str, String str2) {
        this.name = (String) e80.a.j(str, "Name");
        this.value = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            BasicNameValuePair basicNameValuePair = (BasicNameValuePair) obj;
            if (this.name.equals(basicNameValuePair.name) && g.a(this.value, basicNameValuePair.value)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.http.v
    public String getName() {
        return this.name;
    }

    @Override // org.apache.http.v
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return g.d(g.d(17, this.name), this.value);
    }

    public String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb2 = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb2.append(this.name);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.value);
        return sb2.toString();
    }
}
