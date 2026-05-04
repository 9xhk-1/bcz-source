package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f77913a;

    public a() {
        this.f77913a = new ArrayList();
    }

    public final int a() {
        return this.f77913a.size();
    }

    public String toString() {
        try {
            return "[" + a(",") + l50.b.f69930l;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(Object obj) {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f77913a.add(Array.get(obj, i11));
        }
    }

    public final Object a(int i11) {
        Object obj = (i11 < 0 || i11 >= this.f77913a.size()) ? null : this.f77913a.get(i11);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i11 + "] not found.");
    }

    public a(String str) {
        this(new c(str));
    }

    private String a(String str) {
        int size = this.f77913a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.a(this.f77913a.get(i11)));
        }
        return stringBuffer.toString();
    }

    public a(Collection collection) {
        this.f77913a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) {
        this();
        char c11;
        ArrayList arrayList;
        Object d11;
        char c12 = cVar.c();
        if (c12 == '[') {
            c11 = ']';
        } else {
            if (c12 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c11 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c13 = cVar.c();
            cVar.a();
            if (c13 == ',') {
                arrayList = this.f77913a;
                d11 = null;
            } else {
                arrayList = this.f77913a;
                d11 = cVar.d();
            }
            arrayList.add(d11);
            char c14 = cVar.c();
            if (c14 != ')') {
                if (c14 != ',' && c14 != ';') {
                    if (c14 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c11 == c14) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c11) + "'");
        } while (cVar.c() != ']');
    }
}
