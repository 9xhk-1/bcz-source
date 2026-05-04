package tz;

import android.content.ClipData;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public String f91335a;

    /* renamed from: b, reason: collision with root package name */
    public String f91336b;

    /* renamed from: c, reason: collision with root package name */
    public int f91337c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91338d;

    @Nullable
    public static o b(ClipData clipData) {
        String str;
        boolean m11;
        ClipData.Item itemAt;
        if (clipData == null) {
            return null;
        }
        o oVar = new o();
        if (clipData.getItemCount() <= 0 || (itemAt = clipData.getItemAt(0)) == null) {
            str = null;
        } else {
            String htmlText = itemAt.getHtmlText();
            str = itemAt.getText() != null ? itemAt.getText().toString() : null;
            r0 = htmlText;
        }
        if (r0 != null) {
            if (r0.contains(i0.f91293d)) {
                oVar.h(r0);
                oVar.g(2);
            }
            oVar.e(m(r0));
        }
        if (str == null) {
            return oVar;
        }
        String str2 = i0.f91293d;
        if (str.contains(str2)) {
            oVar.d(str);
            oVar.g(1);
            m11 = m(str);
        } else {
            String b11 = h0.b(str, 8);
            if (b11.contains(str2)) {
                oVar.d(str);
                oVar.g(1);
            }
            m11 = m(b11);
        }
        oVar.e(m11);
        return oVar;
    }

    public static o j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        o oVar = new o();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("pbText")) {
                oVar.d(jSONObject.optString("pbText"));
            }
            if (jSONObject.has("pbHtml")) {
                oVar.h(jSONObject.optString("pbHtml"));
            }
            if (jSONObject.has("pbType")) {
                oVar.c(jSONObject.optInt("pbType"));
            }
            return oVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean m(String str) {
        long j11;
        String str2 = i0.f91294e;
        if (!str.contains(str2)) {
            return false;
        }
        try {
            int indexOf = str.indexOf(str2) + str2.length();
            j11 = Long.parseLong(str.substring(indexOf, str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER, indexOf)));
        } catch (Exception unused) {
            j11 = 0;
        }
        return System.currentTimeMillis() < j11;
    }

    public String a() {
        return this.f91335a;
    }

    public void c(int i11) {
        this.f91337c = i11;
    }

    public void d(String str) {
        this.f91335a = str;
    }

    public void e(boolean z11) {
        this.f91338d = z11;
    }

    public String f() {
        return this.f91336b;
    }

    public void g(int i11) {
        this.f91337c = i11 | this.f91337c;
    }

    public void h(String str) {
        this.f91336b = str;
    }

    public int i() {
        return this.f91337c;
    }

    public boolean k(int i11) {
        return (i11 & this.f91337c) != 0;
    }

    public String l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pbText", this.f91335a);
            jSONObject.put("pbHtml", this.f91336b);
            jSONObject.put("pbType", this.f91337c);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
