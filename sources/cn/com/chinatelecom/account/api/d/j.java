package cn.com.chinatelecom.account.api.d;

import android.text.TextUtils;
import androidx.media3.extractor.Ac3Util;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8998a = {-30, -91, -67, -20, -69, -120, -30, -68, -113, -20, -99, -68};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f8999b = {-30, -91, -67, -20, -69, -120, -19, -73, -101, -19, -79, -106, -17, -74, -120, -17, -78, -78};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9000c = {-17, -103, -121, -17, com.baicizhan.main.vld.bonding.j.f25377b, -98, -19, -86, -117, -29, -98, -109, -30, -91, -91};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f9001d = {-20, -99, -86, -19, -73, -101, -19, -79, -106, -30, -75, -108, -20, -124, -81};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f9002e = {-19, -83, -79, -17, Byte.MIN_VALUE, -94, -19, -73, -101, -19, -79, -106, -20, -106, com.baicizhan.main.vld.bonding.j.f25376a, -17, -74, -118, -17, -102, -91};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9003f = {89, 101, 105, 97, 111, 126, -30, -68, -113, -20, -99, -68, -17, -74, -120, -17, -78, -78};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9004g = {-17, -107, -107, -17, -102, -121, -30, -83, -87, -20, -108, -102, -17, -74, -120, -17, -78, -78};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9005h = {67, 69, -17, -74, -120, -17, -78, -78};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f9006i = {-19, -109, -79, -17, -73, -97, -19, -79, -103, -20, -108, -106, -18, -78, com.baicizhan.main.vld.bonding.j.f25377b, -19, -93, com.baicizhan.main.vld.bonding.j.f25377b};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f9007j = {-19, -109, -79, -17, -73, -97, -17, -74, -120, -17, -78, -78};

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f9008k = {-29, -88, -114, -19, -109, -79, -17, -73, -97, -17, -74, -120, -17, -78, -78};

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f9009l = {-30, -91, -67, -17, -113, ws.c.f96765j, -17, ws.c.f96765j, -105, -17, -83, -127, -17, -122, -100, 89, 78, 65};

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f9010m = {-19, -98, -94, -20, ws.c.f96765j, -67, -17, -113, -71, -29, -99, -89, -19, -97, -122, -29, -105, -88};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f9011n = {-17, -113, -68, -18, -79, -100, -19, -109, -79, -17, -73, -97, -20, -100, -77, -17, -74, -123};

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f9012o = {93, 67, 76, 67, -17, ws.c.f96765j, -115, -20, -121, -88, -30, -68, -113, -20, -99, -68};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f9013p = {93, 67, 76, 67, -17, ws.c.f96765j, -115, -20, -121, -88, -17, -74, -120, -17, -78, -78};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f9014q = {-17, -125, -121, -19, -73, -92, -17, -107, -107, -17, -102, -121, -30, -83, -87, -20, -108, -102, -17, -82, -69, -30, -66, -81};

    public static String a(int i11, String str) {
        return a(i11, str, null);
    }

    public static JSONObject b() {
        return b(80001, cn.com.chinatelecom.account.api.a.d.a(f8999b), null);
    }

    public static JSONObject c() {
        return b(Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, cn.com.chinatelecom.account.api.a.d.a(f8998a));
    }

    public static JSONObject d() {
        return b(80004, cn.com.chinatelecom.account.api.a.d.a(f9002e));
    }

    public static JSONObject e() {
        return b(80103, cn.com.chinatelecom.account.api.a.d.a(f9009l));
    }

    public static String f() {
        return a(80200, cn.com.chinatelecom.account.api.a.d.a(f9010m));
    }

    public static String g() {
        return a(80100, cn.com.chinatelecom.account.api.a.d.a(f9006i));
    }

    public static String h() {
        return a(80101, cn.com.chinatelecom.account.api.a.d.a(f9007j));
    }

    public static JSONObject i() {
        return b(80102, cn.com.chinatelecom.account.api.a.d.a(f9008k));
    }

    public static String j() {
        return a(80201, cn.com.chinatelecom.account.api.a.d.a(f9011n));
    }

    public static String a(int i11, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i11);
            jSONObject.put("msg", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("reqId", str2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static JSONObject b(int i11, String str) {
        return b(i11, str, null);
    }

    public static JSONObject a() {
        return b(80003, cn.com.chinatelecom.account.api.a.d.a(f9001d));
    }

    public static JSONObject b(int i11, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i11);
            jSONObject.put("msg", str);
            if (TextUtils.isEmpty(str2)) {
                return jSONObject;
            }
            jSONObject.put("reqId", str2);
            return jSONObject;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return jSONObject;
        }
    }
}
