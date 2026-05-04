package com.huawei.hms.push;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.DateUtil;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.support.api.push.PushException;
import com.huawei.hms.support.log.HMSLog;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f36138a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f36139b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f36140c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap<String, Object> f36141d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap<String, Object> f36142e;

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Object> f36143f;

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap<String, Object> f36144g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap<String, Object> f36145h;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f36146i;

    /* renamed from: j, reason: collision with root package name */
    public Notification f36147j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f36148a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f36149b;

        public Builder(String str) {
            Bundle bundle = new Bundle();
            this.f36148a = bundle;
            this.f36149b = new HashMap();
            bundle.putString("to", str);
        }

        public Builder addData(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("add data failed, key is null.");
            }
            this.f36149b.put(str, str2);
            return this;
        }

        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : this.f36149b.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                try {
                    String jSONObject2 = jSONObject.toString();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(RemoteMessageConst.COLLAPSE_KEY, this.f36148a.getString(RemoteMessageConst.COLLAPSE_KEY));
                    jSONObject3.put(RemoteMessageConst.TTL, this.f36148a.getInt(RemoteMessageConst.TTL));
                    jSONObject3.put(RemoteMessageConst.SEND_MODE, this.f36148a.getInt(RemoteMessageConst.SEND_MODE));
                    jSONObject3.put(RemoteMessageConst.RECEIPT_MODE, this.f36148a.getInt(RemoteMessageConst.RECEIPT_MODE));
                    JSONObject jSONObject4 = new JSONObject();
                    if (jSONObject.length() != 0) {
                        jSONObject4.put("data", jSONObject2);
                    }
                    jSONObject4.put("msgId", this.f36148a.getString("msgId"));
                    jSONObject3.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject4);
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, jSONObject3.toString().getBytes(x.f36237a));
                    bundle.putString("to", this.f36148a.getString("to"));
                    bundle.putString("message_type", this.f36148a.getString("message_type"));
                    return new RemoteMessage(bundle);
                } catch (JSONException unused) {
                    HMSLog.w("RemoteMessage", "JSONException: parse message body failed.");
                    throw new PushException(PushException.EXCEPTION_SEND_FAILED);
                }
            } catch (JSONException unused2) {
                HMSLog.w("RemoteMessage", "JSONException: parse data to json failed.");
                throw new PushException(PushException.EXCEPTION_SEND_FAILED);
            }
        }

        public Builder clearData() {
            this.f36149b.clear();
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f36148a.putString(RemoteMessageConst.COLLAPSE_KEY, str);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.f36149b.clear();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f36149b.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder setMessageId(String str) {
            this.f36148a.putString("msgId", str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.f36148a.putString("message_type", str);
            return this;
        }

        public Builder setReceiptMode(int i11) {
            if (i11 != 1 && i11 != 0) {
                throw new IllegalArgumentException("receipt mode can only be 0 or 1.");
            }
            this.f36148a.putInt(RemoteMessageConst.RECEIPT_MODE, i11);
            return this;
        }

        public Builder setSendMode(int i11) {
            if (i11 != 0 && i11 != 1) {
                throw new IllegalArgumentException("send mode can only be 0 or 1.");
            }
            this.f36148a.putInt(RemoteMessageConst.SEND_MODE, i11);
            return this;
        }

        public Builder setTtl(int i11) {
            if (i11 < 1 || i11 > 1296000) {
                throw new IllegalArgumentException("ttl must be greater than or equal to 1 and less than or equal to 1296000");
            }
            this.f36148a.putInt(RemoteMessageConst.TTL, i11);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Notification implements Serializable {
        public final long[] A;
        public final String B;

        /* renamed from: a, reason: collision with root package name */
        public final String f36150a;

        /* renamed from: b, reason: collision with root package name */
        public final String f36151b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f36152c;

        /* renamed from: d, reason: collision with root package name */
        public final String f36153d;

        /* renamed from: e, reason: collision with root package name */
        public final String f36154e;

        /* renamed from: f, reason: collision with root package name */
        public final String[] f36155f;

        /* renamed from: g, reason: collision with root package name */
        public final String f36156g;

        /* renamed from: h, reason: collision with root package name */
        public final String f36157h;

        /* renamed from: i, reason: collision with root package name */
        public final String f36158i;

        /* renamed from: j, reason: collision with root package name */
        public final String f36159j;

        /* renamed from: k, reason: collision with root package name */
        public final String f36160k;

        /* renamed from: l, reason: collision with root package name */
        public final String f36161l;

        /* renamed from: m, reason: collision with root package name */
        public final String f36162m;

        /* renamed from: n, reason: collision with root package name */
        public final Uri f36163n;

        /* renamed from: o, reason: collision with root package name */
        public final int f36164o;

        /* renamed from: p, reason: collision with root package name */
        public final String f36165p;

        /* renamed from: q, reason: collision with root package name */
        public final int f36166q;

        /* renamed from: r, reason: collision with root package name */
        public final int f36167r;

        /* renamed from: s, reason: collision with root package name */
        public final int f36168s;

        /* renamed from: t, reason: collision with root package name */
        public final int[] f36169t;

        /* renamed from: u, reason: collision with root package name */
        public final String f36170u;

        /* renamed from: v, reason: collision with root package name */
        public final int f36171v;

        /* renamed from: w, reason: collision with root package name */
        public final String f36172w;

        /* renamed from: x, reason: collision with root package name */
        public final int f36173x;

        /* renamed from: y, reason: collision with root package name */
        public final String f36174y;

        /* renamed from: z, reason: collision with root package name */
        public final String f36175z;

        public /* synthetic */ Notification(Bundle bundle, b bVar) {
            this(bundle);
        }

        public final Integer a(String str) {
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                HMSLog.w("RemoteMessage", "NumberFormatException: get " + str + " failed.");
                return null;
            }
        }

        public Integer getBadgeNumber() {
            return a(this.f36172w);
        }

        public String getBody() {
            return this.f36153d;
        }

        public String[] getBodyLocalizationArgs() {
            String[] strArr = this.f36155f;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getBodyLocalizationKey() {
            return this.f36154e;
        }

        public String getChannelId() {
            return this.f36162m;
        }

        public String getClickAction() {
            return this.f36160k;
        }

        public String getColor() {
            return this.f36159j;
        }

        public String getIcon() {
            return this.f36156g;
        }

        public Uri getImageUrl() {
            String str = this.f36165p;
            if (str == null) {
                return null;
            }
            return Uri.parse(str);
        }

        public Integer getImportance() {
            return a(this.f36174y);
        }

        public String getIntentUri() {
            return this.f36161l;
        }

        public int[] getLightSettings() {
            int[] iArr = this.f36169t;
            return iArr == null ? new int[0] : (int[]) iArr.clone();
        }

        public Uri getLink() {
            return this.f36163n;
        }

        public int getNotifyId() {
            return this.f36164o;
        }

        public String getSound() {
            return this.f36157h;
        }

        public String getTag() {
            return this.f36158i;
        }

        public String getTicker() {
            return this.f36175z;
        }

        public String getTitle() {
            return this.f36150a;
        }

        public String[] getTitleLocalizationArgs() {
            String[] strArr = this.f36152c;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getTitleLocalizationKey() {
            return this.f36151b;
        }

        public long[] getVibrateConfig() {
            long[] jArr = this.A;
            return jArr == null ? new long[0] : (long[]) jArr.clone();
        }

        public Integer getVisibility() {
            return a(this.B);
        }

        public Long getWhen() {
            if (TextUtils.isEmpty(this.f36170u)) {
                return null;
            }
            try {
                return Long.valueOf(DateUtil.parseUtcToMillisecond(this.f36170u));
            } catch (StringIndexOutOfBoundsException unused) {
                HMSLog.w("RemoteMessage", "StringIndexOutOfBoundsException: parse when failed.");
                return null;
            } catch (ParseException unused2) {
                HMSLog.w("RemoteMessage", "ParseException: parse when failed.");
                return null;
            }
        }

        public boolean isAutoCancel() {
            return this.f36173x == 1;
        }

        public boolean isDefaultLight() {
            return this.f36166q == 1;
        }

        public boolean isDefaultSound() {
            return this.f36167r == 1;
        }

        public boolean isDefaultVibrate() {
            return this.f36168s == 1;
        }

        public boolean isLocalOnly() {
            return this.f36171v == 1;
        }

        public Notification(Bundle bundle) {
            this.f36150a = bundle.getString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.f36153d = bundle.getString("content");
            this.f36151b = bundle.getString(RemoteMessageConst.Notification.TITLE_LOC_KEY);
            this.f36154e = bundle.getString(RemoteMessageConst.Notification.BODY_LOC_KEY);
            this.f36152c = bundle.getStringArray(RemoteMessageConst.Notification.TITLE_LOC_ARGS);
            this.f36155f = bundle.getStringArray(RemoteMessageConst.Notification.BODY_LOC_ARGS);
            this.f36156g = bundle.getString("icon");
            this.f36159j = bundle.getString("color");
            this.f36157h = bundle.getString(RemoteMessageConst.Notification.SOUND);
            this.f36158i = bundle.getString("tag");
            this.f36162m = bundle.getString(RemoteMessageConst.Notification.CHANNEL_ID);
            this.f36160k = bundle.getString(RemoteMessageConst.Notification.CLICK_ACTION);
            this.f36161l = bundle.getString(RemoteMessageConst.Notification.INTENT_URI);
            this.f36164o = bundle.getInt(RemoteMessageConst.Notification.NOTIFY_ID);
            String string = bundle.getString("url");
            this.f36163n = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
            this.f36165p = bundle.getString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.f36166q = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS);
            this.f36167r = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_SOUND);
            this.f36168s = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS);
            this.f36169t = bundle.getIntArray(RemoteMessageConst.Notification.LIGHT_SETTINGS);
            this.f36170u = bundle.getString(RemoteMessageConst.Notification.WHEN);
            this.f36171v = bundle.getInt(RemoteMessageConst.Notification.LOCAL_ONLY);
            this.f36172w = bundle.getString(RemoteMessageConst.Notification.BADGE_SET_NUM, null);
            this.f36173x = bundle.getInt(RemoteMessageConst.Notification.AUTO_CANCEL);
            this.f36174y = bundle.getString("priority", null);
            this.f36175z = bundle.getString(RemoteMessageConst.Notification.TICKER);
            this.A = bundle.getLongArray(RemoteMessageConst.Notification.VIBRATE_TIMINGS);
            this.B = bundle.getString("visibility", null);
        }
    }

    static {
        String[] strArr = new String[0];
        f36138a = strArr;
        int[] iArr = new int[0];
        f36139b = iArr;
        long[] jArr = new long[0];
        f36140c = jArr;
        HashMap<String, Object> hashMap = new HashMap<>(8);
        f36141d = hashMap;
        hashMap.put("from", "");
        hashMap.put(RemoteMessageConst.COLLAPSE_KEY, "");
        hashMap.put(RemoteMessageConst.SEND_TIME, "");
        hashMap.put(RemoteMessageConst.TTL, 86400);
        hashMap.put(RemoteMessageConst.URGENCY, 2);
        hashMap.put(RemoteMessageConst.ORI_URGENCY, 2);
        hashMap.put(RemoteMessageConst.SEND_MODE, 0);
        hashMap.put(RemoteMessageConst.RECEIPT_MODE, 0);
        HashMap<String, Object> hashMap2 = new HashMap<>(8);
        f36142e = hashMap2;
        hashMap2.put(RemoteMessageConst.Notification.TITLE_LOC_KEY, "");
        hashMap2.put(RemoteMessageConst.Notification.BODY_LOC_KEY, "");
        hashMap2.put(RemoteMessageConst.Notification.NOTIFY_ICON, "");
        hashMap2.put(RemoteMessageConst.Notification.TITLE_LOC_ARGS, strArr);
        hashMap2.put(RemoteMessageConst.Notification.BODY_LOC_ARGS, strArr);
        hashMap2.put(RemoteMessageConst.Notification.TICKER, "");
        hashMap2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, "");
        hashMap2.put("content", "");
        HashMap<String, Object> hashMap3 = new HashMap<>(8);
        f36143f = hashMap3;
        hashMap3.put("icon", "");
        hashMap3.put("color", "");
        hashMap3.put(RemoteMessageConst.Notification.SOUND, "");
        hashMap3.put(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS, 1);
        hashMap3.put(RemoteMessageConst.Notification.LIGHT_SETTINGS, iArr);
        hashMap3.put(RemoteMessageConst.Notification.DEFAULT_SOUND, 1);
        hashMap3.put(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS, 1);
        hashMap3.put(RemoteMessageConst.Notification.VIBRATE_TIMINGS, jArr);
        HashMap<String, Object> hashMap4 = new HashMap<>(8);
        f36144g = hashMap4;
        hashMap4.put("tag", "");
        hashMap4.put(RemoteMessageConst.Notification.WHEN, "");
        hashMap4.put(RemoteMessageConst.Notification.LOCAL_ONLY, 1);
        hashMap4.put(RemoteMessageConst.Notification.BADGE_SET_NUM, "");
        hashMap4.put("priority", "");
        hashMap4.put(RemoteMessageConst.Notification.AUTO_CANCEL, 1);
        hashMap4.put("visibility", "");
        hashMap4.put(RemoteMessageConst.Notification.CHANNEL_ID, "");
        HashMap<String, Object> hashMap5 = new HashMap<>(3);
        f36145h = hashMap5;
        hashMap5.put(RemoteMessageConst.Notification.CLICK_ACTION, "");
        hashMap5.put(RemoteMessageConst.Notification.INTENT_URI, "");
        hashMap5.put("url", "");
        CREATOR = new b();
    }

    public RemoteMessage(Bundle bundle) {
        this.f36146i = a(bundle);
    }

    public static JSONObject b(Bundle bundle) {
        try {
            return new JSONObject(w.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
        } catch (JSONException unused) {
            HMSLog.w("RemoteMessage", "JSONException:parse message body failed.");
            return null;
        }
    }

    public static JSONObject c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PARAM);
        }
        return null;
    }

    public static JSONObject d(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        JSONObject b11 = b(bundle);
        JSONObject a11 = a(b11);
        String string = JsonUtil.getString(a11, "data", null);
        bundle2.putString(RemoteMessageConst.ANALYTIC_INFO, JsonUtil.getString(a11, RemoteMessageConst.ANALYTIC_INFO, null));
        bundle2.putString(RemoteMessageConst.DEVICE_TOKEN, bundle.getString(RemoteMessageConst.DEVICE_TOKEN));
        JSONObject d11 = d(a11);
        JSONObject b12 = b(d11);
        JSONObject c11 = c(d11);
        if (bundle.getInt(RemoteMessageConst.INPUT_TYPE) == 1 && s.a(a11, d11, string)) {
            bundle2.putString("data", w.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
            return bundle2;
        }
        String string2 = bundle.getString("to");
        String string3 = bundle.getString("message_type");
        String string4 = JsonUtil.getString(a11, "msgId", null);
        bundle2.putString("to", string2);
        bundle2.putString("data", string);
        bundle2.putString("msgId", string4);
        bundle2.putString("message_type", string3);
        JsonUtil.transferJsonObjectToBundle(b11, bundle2, f36141d);
        bundle2.putBundle("notification", a(b11, a11, d11, b12, c11));
        return bundle2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String getAnalyticInfo() {
        return this.f36146i.getString(RemoteMessageConst.ANALYTIC_INFO);
    }

    public Map<String, String> getAnalyticInfoMap() {
        HashMap hashMap = new HashMap();
        String string = this.f36146i.getString(RemoteMessageConst.ANALYTIC_INFO);
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    hashMap.put(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get analyticInfo from map failed.");
            }
        }
        return hashMap;
    }

    public String getCollapseKey() {
        return this.f36146i.getString(RemoteMessageConst.COLLAPSE_KEY);
    }

    public String getData() {
        return this.f36146i.getString("data");
    }

    public Map<String, String> getDataOfMap() {
        HashMap hashMap = new HashMap();
        String string = this.f36146i.getString("data");
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    hashMap.put(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get data from map failed");
            }
        }
        return hashMap;
    }

    public String getFrom() {
        return this.f36146i.getString("from");
    }

    public String getMessageId() {
        return this.f36146i.getString("msgId");
    }

    public String getMessageType() {
        return this.f36146i.getString("message_type");
    }

    public Notification getNotification() {
        Bundle bundle = this.f36146i.getBundle("notification");
        b bVar = null;
        if (this.f36147j == null && bundle != null) {
            this.f36147j = new Notification(bundle, bVar);
        }
        if (this.f36147j == null) {
            this.f36147j = new Notification(new Bundle(), bVar);
        }
        return this.f36147j;
    }

    public int getOriginalUrgency() {
        int i11 = this.f36146i.getInt(RemoteMessageConst.ORI_URGENCY);
        if (i11 == 1 || i11 == 2) {
            return i11;
        }
        return 0;
    }

    public int getReceiptMode() {
        return this.f36146i.getInt(RemoteMessageConst.RECEIPT_MODE);
    }

    public int getSendMode() {
        return this.f36146i.getInt(RemoteMessageConst.SEND_MODE);
    }

    public long getSentTime() {
        try {
            String string = this.f36146i.getString(RemoteMessageConst.SEND_TIME);
            if (TextUtils.isEmpty(string)) {
                return 0L;
            }
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            HMSLog.w("RemoteMessage", "NumberFormatException: get sendTime error.");
            return 0L;
        }
    }

    public String getTo() {
        return this.f36146i.getString("to");
    }

    public String getToken() {
        return this.f36146i.getString(RemoteMessageConst.DEVICE_TOKEN);
    }

    public int getTtl() {
        return this.f36146i.getInt(RemoteMessageConst.TTL);
    }

    public int getUrgency() {
        int i11 = this.f36146i.getInt(RemoteMessageConst.URGENCY);
        if (i11 == 1 || i11 == 2) {
            return i11;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeBundle(this.f36146i);
        parcel.writeSerializable(this.f36147j);
    }

    public RemoteMessage(Parcel parcel) {
        this.f36146i = parcel.readBundle();
        this.f36147j = (Notification) parcel.readSerializable();
    }

    public static JSONObject b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
        }
        return null;
    }

    public final Bundle a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Bundle bundle = new Bundle();
        JsonUtil.transferJsonObjectToBundle(jSONObject3, bundle, f36142e);
        JsonUtil.transferJsonObjectToBundle(jSONObject4, bundle, f36143f);
        JsonUtil.transferJsonObjectToBundle(jSONObject, bundle, f36144g);
        JsonUtil.transferJsonObjectToBundle(jSONObject5, bundle, f36145h);
        bundle.putInt(RemoteMessageConst.Notification.NOTIFY_ID, JsonUtil.getInt(jSONObject2, RemoteMessageConst.Notification.NOTIFY_ID, 0));
        return bundle;
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }
}
