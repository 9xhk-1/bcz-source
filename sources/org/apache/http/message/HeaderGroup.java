package org.apache.http.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import l70.l;
import org.apache.http.e;
import org.apache.http.h;
import org.apache.http.util.CharArrayBuffer;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class HeaderGroup implements Cloneable, Serializable {
    private static final e[] EMPTY = new e[0];
    private static final long serialVersionUID = 2608834160639271617L;
    private final List<e> headers = new ArrayList(16);

    public void addHeader(e eVar) {
        if (eVar == null) {
            return;
        }
        this.headers.add(eVar);
    }

    public void clear() {
        this.headers.clear();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean containsHeader(String str) {
        for (int i11 = 0; i11 < this.headers.size(); i11++) {
            if (this.headers.get(i11).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public HeaderGroup copy() {
        HeaderGroup headerGroup = new HeaderGroup();
        headerGroup.headers.addAll(this.headers);
        return headerGroup;
    }

    public e[] getAllHeaders() {
        List<e> list = this.headers;
        return (e[]) list.toArray(new e[list.size()]);
    }

    public e getCondensedHeader(String str) {
        e[] headers = getHeaders(str);
        if (headers.length == 0) {
            return null;
        }
        if (headers.length == 1) {
            return headers[0];
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
        charArrayBuffer.append(headers[0].getValue());
        for (int i11 = 1; i11 < headers.length; i11++) {
            charArrayBuffer.append(j2.O);
            charArrayBuffer.append(headers[i11].getValue());
        }
        return new BasicHeader(str.toLowerCase(Locale.ROOT), charArrayBuffer.toString());
    }

    public e getFirstHeader(String str) {
        for (int i11 = 0; i11 < this.headers.size(); i11++) {
            e eVar = this.headers.get(i11);
            if (eVar.getName().equalsIgnoreCase(str)) {
                return eVar;
            }
        }
        return null;
    }

    public e[] getHeaders(String str) {
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < this.headers.size(); i11++) {
            e eVar = this.headers.get(i11);
            if (eVar.getName().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(eVar);
            }
        }
        return arrayList != null ? (e[]) arrayList.toArray(new e[arrayList.size()]) : EMPTY;
    }

    public e getLastHeader(String str) {
        for (int size = this.headers.size() - 1; size >= 0; size--) {
            e eVar = this.headers.get(size);
            if (eVar.getName().equalsIgnoreCase(str)) {
                return eVar;
            }
        }
        return null;
    }

    public h iterator() {
        return new l(this.headers, null);
    }

    public void removeHeader(e eVar) {
        if (eVar == null) {
            return;
        }
        this.headers.remove(eVar);
    }

    public void setHeaders(e[] eVarArr) {
        clear();
        if (eVarArr == null) {
            return;
        }
        Collections.addAll(this.headers, eVarArr);
    }

    public String toString() {
        return this.headers.toString();
    }

    public void updateHeader(e eVar) {
        if (eVar == null) {
            return;
        }
        for (int i11 = 0; i11 < this.headers.size(); i11++) {
            if (this.headers.get(i11).getName().equalsIgnoreCase(eVar.getName())) {
                this.headers.set(i11, eVar);
                return;
            }
        }
        this.headers.add(eVar);
    }

    public h iterator(String str) {
        return new l(this.headers, str);
    }
}
