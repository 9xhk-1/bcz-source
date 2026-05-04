package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class HianalyticsBaseData {
    public static final String EVENT_ID = "url_request";
    public static final int FALSE = 0;
    public static final String SDK_NAME = "sdk_name";
    public static final String SDK_TYPE = "sdk_type";
    public static final String SDK_VERSION = "sdk_version";
    private static final String TAG = "HianalyticsBaseData";
    public static final int TRUE = 1;
    private LinkedHashMap<String, String> data;

    public HianalyticsBaseData() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        this.data = linkedHashMap;
        linkedHashMap.put(SDK_TYPE, "UxPP");
        this.data.put(SDK_NAME, "networkkit");
    }

    public LinkedHashMap<String, String> get() {
        return this.data;
    }

    public HianalyticsBaseData put(String str, String str2) {
        if (str != null && str2 != null) {
            this.data.put(str, str2);
            return this;
        }
        Logger.v(TAG, "key = " + str + " : value = " + str2);
        return this;
    }

    public HianalyticsBaseData putIfNotDefault(String str, long j11, long j12) {
        return j11 == j12 ? this : put(str, j11);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : get().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e11) {
            Logger.w(TAG, "catch JSONException", e11);
        }
        return jSONObject.toString();
    }

    public HianalyticsBaseData put(String str, long j11) {
        if (str == null) {
            Logger.v(TAG, "key = null : value = " + j11);
            return this;
        }
        this.data.put(str, "" + j11);
        return this;
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            this.data.putAll(linkedHashMap);
            return this;
        }
        Logger.v(TAG, "data is null");
        return this;
    }
}
