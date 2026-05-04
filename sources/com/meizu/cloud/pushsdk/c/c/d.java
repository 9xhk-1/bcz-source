package com.meizu.cloud.pushsdk.c.c;

import com.badlogic.gdx.Net;

/* loaded from: classes7.dex */
public class d {
    public static boolean a(String str) {
        return "POST".equals(str) || Net.a.f11465d.equals(str) || "PATCH".equals(str) || "PROPPATCH".equals(str) || "REPORT".equals(str);
    }

    public static boolean b(String str) {
        return a(str) || "OPTIONS".equals(str) || Net.a.f11467f.equals(str) || "PROPFIND".equals(str) || "MKCOL".equals(str) || "LOCK".equals(str);
    }
}
