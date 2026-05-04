package com.igexin.push.core.b;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.sdk.message.GTPopupMessage;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class m extends BaseActionBean implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    private static boolean f37837k = true;

    /* renamed from: l, reason: collision with root package name */
    private static int f37838l;

    /* renamed from: m, reason: collision with root package name */
    private static int f37839m;

    /* renamed from: a, reason: collision with root package name */
    public b f37840a;

    /* renamed from: b, reason: collision with root package name */
    public b f37841b;

    /* renamed from: c, reason: collision with root package name */
    public String f37842c;

    /* renamed from: d, reason: collision with root package name */
    public String f37843d;

    /* renamed from: e, reason: collision with root package name */
    public String f37844e;

    /* renamed from: f, reason: collision with root package name */
    public String f37845f;

    /* renamed from: g, reason: collision with root package name */
    public String f37846g;

    /* renamed from: h, reason: collision with root package name */
    public String f37847h;

    /* renamed from: i, reason: collision with root package name */
    public String f37848i;

    /* renamed from: j, reason: collision with root package name */
    public GTPopupMessage f37849j;

    public enum a {
        closePopup,
        intent,
        url
    }

    public static class b implements Serializable {
        private String A;
        private String B;
        private String C;
        private String D;
        private String E;
        private float F;
        private float G;

        /* renamed from: a, reason: collision with root package name */
        public String f37854a;

        /* renamed from: b, reason: collision with root package name */
        public String f37855b;

        /* renamed from: c, reason: collision with root package name */
        public String f37856c;

        /* renamed from: d, reason: collision with root package name */
        public String f37857d;

        /* renamed from: e, reason: collision with root package name */
        public String f37858e;

        /* renamed from: f, reason: collision with root package name */
        public String f37859f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList<b> f37860g;

        /* renamed from: h, reason: collision with root package name */
        public String f37861h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f37862i;

        /* renamed from: j, reason: collision with root package name */
        public String f37863j;

        /* renamed from: k, reason: collision with root package name */
        public String f37864k;

        /* renamed from: l, reason: collision with root package name */
        public int f37865l;

        /* renamed from: m, reason: collision with root package name */
        public int f37866m;

        /* renamed from: n, reason: collision with root package name */
        public int f37867n;

        /* renamed from: o, reason: collision with root package name */
        public GTPopupMessage f37868o;

        /* renamed from: p, reason: collision with root package name */
        public String f37869p;

        /* renamed from: q, reason: collision with root package name */
        float f37870q = 0.0f;

        /* renamed from: r, reason: collision with root package name */
        private String f37871r;

        /* renamed from: s, reason: collision with root package name */
        private String f37872s;

        /* renamed from: t, reason: collision with root package name */
        private String f37873t;

        /* renamed from: u, reason: collision with root package name */
        private String f37874u;

        /* renamed from: v, reason: collision with root package name */
        private String f37875v;

        /* renamed from: w, reason: collision with root package name */
        private String f37876w;

        /* renamed from: x, reason: collision with root package name */
        private String f37877x;

        /* renamed from: y, reason: collision with root package name */
        private String f37878y;

        /* renamed from: z, reason: collision with root package name */
        private String f37879z;

        public b(JSONObject jSONObject, String str, String str2, float f11, float f12) {
            String str3;
            String str4;
            String str5;
            JSONObject optJSONObject;
            String str6;
            double d11;
            if (jSONObject == null) {
                return;
            }
            this.F = f11;
            this.G = f12;
            this.f37854a = jSONObject.optString("type");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("layout");
            if (optJSONObject2 != null) {
                this.f37855b = optJSONObject2.optString("align");
                this.f37871r = optJSONObject2.optString("width", null);
                this.f37872s = optJSONObject2.optString("height", null);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("margin");
                if (optJSONObject3 != null) {
                    this.f37874u = optJSONObject3.optString("top", null);
                    this.f37875v = optJSONObject3.optString("bottom", null);
                    this.f37876w = optJSONObject3.optString(TtmlNode.RIGHT, null);
                    this.f37877x = optJSONObject3.optString(TtmlNode.LEFT, null);
                }
                JSONObject optJSONObject4 = optJSONObject2.optJSONObject("padding");
                if (optJSONObject4 != null) {
                    this.f37878y = optJSONObject4.optString("top", null);
                    this.f37879z = optJSONObject4.optString("bottom", null);
                    this.A = optJSONObject4.optString(TtmlNode.RIGHT, null);
                    this.B = optJSONObject4.optString(TtmlNode.LEFT, null);
                }
                this.f37873t = optJSONObject2.optString("maxHeight");
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("properties");
            if (optJSONObject5 != null) {
                this.f37857d = optJSONObject5.optString("name", "");
                this.f37858e = optJSONObject5.optString("elementType");
                this.f37859f = optJSONObject5.optString("elementId", "");
                this.f37861h = optJSONObject5.optString("image");
                this.C = optJSONObject5.optString("cornerRadius", null);
                this.f37864k = optJSONObject5.optString("text");
                this.D = optJSONObject5.optString(qo.h.f82539q, null);
                this.f37856c = optJSONObject5.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, null);
                this.f37862i = TtmlNode.BOLD.equals(optJSONObject5.optString(TtmlNode.ATTR_TTS_FONT_WEIGHT));
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject("color");
                if (optJSONObject6 != null) {
                    d11 = 255.0d;
                    str3 = "";
                    this.f37865l = Color.argb((int) (optJSONObject6.optDouble("a") * 255.0d), (int) optJSONObject6.optDouble(en.r.f50027a), (int) optJSONObject6.optDouble("g"), (int) optJSONObject6.optDouble(yr.e.f100279a));
                } else {
                    str3 = "";
                    d11 = 255.0d;
                }
                JSONObject optJSONObject7 = optJSONObject5.optJSONObject(TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
                if (optJSONObject7 != null) {
                    this.f37866m = Color.argb((int) (optJSONObject7.optDouble("a") * d11), (int) optJSONObject7.optDouble(en.r.f50027a), (int) optJSONObject7.optDouble("g"), (int) optJSONObject7.optDouble(yr.e.f100279a));
                }
                this.E = optJSONObject5.optString("borderWidth", null);
                JSONObject optJSONObject8 = optJSONObject5.optJSONObject("borderColor");
                if (optJSONObject8 != null) {
                    this.f37867n = Color.argb((int) (optJSONObject8.optDouble("a") * d11), (int) optJSONObject8.optDouble(en.r.f50027a), (int) optJSONObject8.optDouble("g"), (int) optJSONObject8.optDouble(yr.e.f100279a));
                }
                this.f37863j = optJSONObject5.optString("backgroundImage");
            } else {
                str3 = "";
            }
            JSONObject optJSONObject9 = jSONObject.optJSONObject("action");
            if (optJSONObject9 == null || (optJSONObject = optJSONObject9.optJSONObject("ANDROID")) == null) {
                str4 = str;
                str5 = str2;
            } else {
                GTPopupMessage gTPopupMessage = new GTPopupMessage();
                gTPopupMessage.setElementType(this.f37858e);
                GTPopupMessage.GtAction gtAction = new GTPopupMessage.GtAction(optJSONObject.optString("actionType"), optJSONObject.optString("intent"), optJSONObject.optString("url"), optJSONObject.optBoolean("closePopup", false));
                String str7 = this.f37859f;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f37857d);
                if (TextUtils.isEmpty(this.f37864k)) {
                    str6 = str3;
                } else {
                    str6 = Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f37864k;
                }
                sb2.append(str6);
                str4 = str;
                str5 = str2;
                GTPopupMessage.EventProperties eventProperties = new GTPopupMessage.EventProperties(str4, str5, str7, sb2.toString());
                gTPopupMessage.setAction(gtAction);
                gTPopupMessage.setEventProperties(eventProperties);
                this.f37868o = gTPopupMessage;
                this.f37869p = optJSONObject.optString("clickActionId", str3);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("subviews");
            if (optJSONArray != null) {
                this.f37860g = new ArrayList<>();
                int i11 = 0;
                while (i11 < optJSONArray.length()) {
                    this.f37860g.add(new b(optJSONArray.optJSONObject(i11), str4, str5, f11, f12));
                    i11++;
                    str4 = str;
                    str5 = str2;
                }
            }
        }

        private static float a(String str) {
            if (str == null || !str.contains("px")) {
                return 0.0f;
            }
            return (float) (com.igexin.push.core.e.f38035l.getResources().getDisplayMetrics().scaledDensity * Double.parseDouble(str.substring(0, str.length() - 2)));
        }

        public final int b() {
            return a(this.f37872s, this.F, this.G);
        }

        public final int c() {
            return ((Integer) a(this.f37874u, 0, this.F, this.G)).intValue();
        }

        public final int d() {
            return ((Integer) a(this.f37875v, 0, this.F, this.G)).intValue();
        }

        public final int e() {
            return ((Integer) a(this.f37876w, 0, this.F, this.G)).intValue();
        }

        public final int f() {
            return ((Integer) a(this.f37877x, 0, this.F, this.G)).intValue();
        }

        public final int g() {
            return ((Integer) a(this.f37878y, 0, this.F, this.G)).intValue();
        }

        public final int h() {
            return ((Integer) a(this.f37879z, 0, this.F, this.G)).intValue();
        }

        public final int i() {
            return ((Integer) a(this.A, 0, this.F, this.G)).intValue();
        }

        public final int j() {
            return ((Integer) a(this.B, 0, this.F, this.G)).intValue();
        }

        public final int k() {
            return ((Integer) a(this.C, 0, this.F, this.G)).intValue();
        }

        public final float l() {
            return ((Float) a(this.D, Float.valueOf(0.0f), this.F, this.G)).floatValue();
        }

        public final int m() {
            return ((Integer) a(this.E, 0, this.F, this.G)).intValue();
        }

        public final int n() {
            return ((Integer) a(this.f37873t, 0, this.F, this.G)).intValue();
        }

        public final int a() {
            return a(this.f37871r, this.F, this.G);
        }

        private static int a(String str, float f11, float f12) {
            if (str == null || !str.contains("px")) {
                return -2;
            }
            return (int) (((m.f37837k ? Math.min(m.f37839m / f12, m.f37838l / f11) : Math.min(m.f37839m / f11, m.f37838l / f12)) * Double.parseDouble(str.substring(0, str.length() - 2))) + 0.5d);
        }

        private Object a(String str, Object obj) {
            if (this.f37870q == 0.0f) {
                this.f37870q = com.igexin.push.core.e.f38035l.getResources().getDisplayMetrics().density;
            }
            if (str == null || !str.contains("px")) {
                return obj;
            }
            double parseDouble = Double.parseDouble(str.substring(0, str.length() - 2));
            return obj instanceof Float ? Double.valueOf(parseDouble * this.f37870q) : obj instanceof Integer ? Integer.valueOf((int) ((parseDouble * this.f37870q) + 0.5d)) : Integer.valueOf((int) ((parseDouble * this.f37870q) + 0.5d));
        }

        private static Object a(String str, Object obj, float f11, float f12) {
            float f13;
            int i11;
            if (str == null || !str.contains("px")) {
                return obj;
            }
            if (m.f37837k) {
                f13 = m.f37839m / f12;
                i11 = m.f37838l;
            } else {
                f13 = m.f37838l / f12;
                i11 = m.f37839m;
            }
            float min = Math.min(f13, i11 / f11);
            float parseFloat = Float.parseFloat(str.substring(0, str.length() - 2));
            if (obj instanceof Float) {
                return Float.valueOf(parseFloat * min);
            }
            boolean z11 = obj instanceof Integer;
            return Integer.valueOf((int) ((parseFloat * min) + 0.5f));
        }
    }

    public static void a(Context context) {
        int i11;
        int i12 = context.getResources().getConfiguration().orientation;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (i12 == 1) {
            f37837k = true;
            f37838l = min;
            i11 = displayMetrics.heightPixels;
        } else {
            f37837k = false;
            f37838l = min;
            i11 = displayMetrics.widthPixels;
        }
        f37839m = i11;
    }

    private String d() {
        return this.f37846g;
    }

    private String e() {
        return this.f37848i;
    }

    private GTPopupMessage f() {
        return this.f37849j;
    }

    private b g() {
        return this.f37841b;
    }

    private b h() {
        return this.f37840a;
    }

    private String i() {
        return this.f37844e;
    }

    private String j() {
        return this.f37847h;
    }

    private String k() {
        return this.f37845f;
    }

    private void a(String str) {
        this.f37844e = str;
    }

    private void b(String str) {
        this.f37845f = str;
    }

    private void c(String str) {
        this.f37846g = str;
    }

    private void d(String str) {
        this.f37847h = str;
    }

    private void a(JSONObject jSONObject) {
        float f11;
        float f12;
        JSONObject optJSONObject = jSONObject.optJSONObject("statisticsInfo");
        if (optJSONObject != null) {
            this.f37842c = optJSONObject.optString("planName", "");
            this.f37843d = optJSONObject.optString("nodeName", "");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("properties");
        if (optJSONObject2 != null) {
            String optString = optJSONObject2.optString("baseWidth");
            String optString2 = optJSONObject2.optString("baseHeight");
            float parseFloat = Float.parseFloat(optString.substring(0, optString.length() - 2));
            f12 = Float.parseFloat(optString2.substring(0, optString2.length() - 2));
            f11 = parseFloat;
        } else {
            f11 = 1.0f;
            f12 = 1.0f;
        }
        this.f37848i = jSONObject.optString("showActionId", "");
        this.f37840a = new b(jSONObject.optJSONObject("mask"), this.f37842c, this.f37843d, f11, f12);
        this.f37841b = new b(jSONObject.optJSONObject("template"), this.f37842c, this.f37843d, f11, f12);
        GTPopupMessage.EventProperties eventProperties = new GTPopupMessage.EventProperties(this.f37842c, this.f37843d, "", "");
        GTPopupMessage gTPopupMessage = new GTPopupMessage();
        gTPopupMessage.setEventProperties(eventProperties);
        this.f37849j = gTPopupMessage;
    }
}
