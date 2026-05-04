package com.alipay.sdk.m.j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.m.m.a;
import com.alipay.sdk.m.u.n;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10619a = 1010;

    /* renamed from: b, reason: collision with root package name */
    public static a f10620b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(boolean z11, JSONObject jSONObject, String str);
    }

    public static boolean a(com.alipay.sdk.m.s.a aVar, Context context) {
        return n.a(aVar, context, (List<a.b>) Collections.singletonList(new a.b("com.taobao.taobao", 0, "")), false);
    }

    public static boolean a(com.alipay.sdk.m.s.a aVar, Activity activity, int i11, String str, String str2, a aVar2) {
        try {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10672u0);
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i11);
            f10620b = aVar2;
            return true;
        } catch (Throwable th2) {
            aVar2.a(false, null, "UNKNOWN_ERROR");
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10680y0, th2);
            return false;
        }
    }

    public static boolean a(com.alipay.sdk.m.s.a aVar, int i11, int i12, Intent intent) {
        if (i11 != 1010 || intent == null) {
            return false;
        }
        a aVar2 = f10620b;
        if (aVar2 == null) {
            return true;
        }
        f10620b = null;
        if (i12 == -1) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10678x0, intent.toUri(1));
            aVar2.a(true, n.a(intent), "OK");
        } else if (i12 != 0) {
            com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10676w0, "" + i12);
        } else {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10674v0, intent.toUri(1));
            aVar2.a(false, null, "CANCELED");
        }
        return true;
    }
}
