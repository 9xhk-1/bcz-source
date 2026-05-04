package com.zx.a.I8b7;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y1 extends JSONArray {
    public y1(String str) throws JSONException {
        super(str);
    }

    public synchronized void a(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            super.remove(0);
            r2.b("removeM " + i12);
        }
    }

    @Override // org.json.JSONArray
    public synchronized String getString(int i11) throws JSONException {
        return super.getString(i11);
    }

    @Override // org.json.JSONArray
    public synchronized JSONArray put(boolean z11) {
        return super.put(z11);
    }

    @Override // org.json.JSONArray
    public synchronized Object remove(int i11) {
        return super.remove(i11);
    }

    @Override // org.json.JSONArray
    public synchronized String toString() {
        return super.toString();
    }

    public y1() {
    }

    @Override // org.json.JSONArray
    public synchronized JSONArray put(Object obj) {
        return super.put(obj);
    }

    public synchronized int a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i11 = 0; i11 < length(); i11++) {
            synchronized (this) {
                if (!super.getString(i11).startsWith(str)) {
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // org.json.JSONArray
    public synchronized JSONArray put(int i11, Object obj) throws JSONException {
        return super.put(i11, obj);
    }
}
