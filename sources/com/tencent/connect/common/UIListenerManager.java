package com.tencent.connect.common;

import android.content.Intent;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UIListenerManager {

    /* renamed from: a, reason: collision with root package name */
    private static UIListenerManager f42871a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, ApiTask> f42872b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class ApiTask {
        public IUiListener mListener;
        public int mRequestCode;

        public ApiTask(int i11, IUiListener iUiListener) {
            this.mRequestCode = i11;
            this.mListener = iUiListener;
        }
    }

    private UIListenerManager() {
        Map<String, ApiTask> synchronizedMap = Collections.synchronizedMap(new HashMap());
        this.f42872b = synchronizedMap;
        if (synchronizedMap == null) {
            this.f42872b = Collections.synchronizedMap(new HashMap());
        }
    }

    private IUiListener a(int i11, IUiListener iUiListener) {
        if (i11 == 11101) {
            SLog.e("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
            return iUiListener;
        }
        if (i11 == 11105) {
            SLog.e("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
            return iUiListener;
        }
        if (i11 == 11106) {
            SLog.e("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        return iUiListener;
    }

    public static UIListenerManager getInstance() {
        if (f42871a == null) {
            f42871a = new UIListenerManager();
        }
        return f42871a;
    }

    public IUiListener getListnerWithAction(String str) {
        ApiTask apiTask;
        if (str == null) {
            SLog.e("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f42872b) {
            apiTask = this.f42872b.get(str);
            this.f42872b.remove(str);
        }
        if (apiTask == null) {
            return null;
        }
        return apiTask.mListener;
    }

    public IUiListener getListnerWithRequestCode(int i11) {
        String a11 = k.a(i11);
        if (a11 != null) {
            return getListnerWithAction(a11);
        }
        SLog.e("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i11);
        return null;
    }

    public void handleDataToListener(Intent intent, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.UIListenerManager", "handleDataToListener");
        if (intent == null) {
            iUiListener.onCancel();
            return;
        }
        String stringExtra = intent.getStringExtra(Constants.KEY_ACTION);
        if ("action_login".equals(stringExtra)) {
            int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            if (intExtra != 0) {
                SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
                iUiListener.onError(new UiError(intExtra, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
                return;
            }
            String stringExtra2 = intent.getStringExtra(Constants.KEY_RESPONSE);
            if (stringExtra2 == null) {
                SLog.d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                iUiListener.onComplete(new JSONObject());
                return;
            }
            try {
                iUiListener.onComplete(m.d(stringExtra2));
                return;
            } catch (JSONException e11) {
                iUiListener.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra2));
                SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e11);
                return;
            }
        }
        if ("action_share".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra("result");
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                iUiListener.onCancel();
                return;
            }
            if ("error".equals(stringExtra3)) {
                iUiListener.onError(new UiError(-6, "unknown error", stringExtra4 + ""));
                return;
            }
            if ("complete".equals(stringExtra3)) {
                try {
                    iUiListener.onComplete(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                } catch (JSONException e12) {
                    e12.printStackTrace();
                    iUiListener.onError(new UiError(-4, "json error", stringExtra4 + ""));
                }
            }
        }
    }

    public boolean onActivityResult(int i11, int i12, Intent intent, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i11 + " res=" + i12);
        IUiListener listnerWithRequestCode = getListnerWithRequestCode(i11);
        if (listnerWithRequestCode == null) {
            if (iUiListener == null) {
                SLog.e("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
                return false;
            }
            listnerWithRequestCode = a(i11, iUiListener);
        }
        if (i12 != -1) {
            listnerWithRequestCode.onCancel();
            return true;
        }
        if (intent == null) {
            listnerWithRequestCode.onError(new UiError(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return true;
        }
        String stringExtra = intent.getStringExtra(Constants.KEY_ACTION);
        if ("action_login".equals(stringExtra)) {
            int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            if (intExtra != 0) {
                SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
                listnerWithRequestCode.onError(new UiError(intExtra, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
                return true;
            }
            String stringExtra2 = intent.getStringExtra(Constants.KEY_RESPONSE);
            if (stringExtra2 == null) {
                SLog.d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                listnerWithRequestCode.onComplete(new JSONObject());
                return true;
            }
            try {
                listnerWithRequestCode.onComplete(m.d(stringExtra2));
                return true;
            } catch (JSONException e11) {
                listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra2));
                SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e11);
                return true;
            }
        }
        if ("action_share".equals(stringExtra) || "action_request_avatar".equals(stringExtra) || "action_request_dynamic_avatar".equals(stringExtra) || "action_request_set_emotion".equals(stringExtra) || "guildOpen".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra("result");
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                listnerWithRequestCode.onCancel();
                return true;
            }
            if ("error".equals(stringExtra3)) {
                listnerWithRequestCode.onError(new UiError(-6, "unknown error", stringExtra4 + ""));
                return true;
            }
            if (!"complete".equals(stringExtra3)) {
                return true;
            }
            try {
                listnerWithRequestCode.onComplete(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                return true;
            } catch (JSONException e12) {
                SLog.e("openSDK_LOG.UIListenerManager", "JSONException", e12);
                listnerWithRequestCode.onError(new UiError(-4, "json error", stringExtra4 + ""));
                return true;
            }
        }
        if (!"action_common_channel".equals(stringExtra)) {
            int intExtra2 = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            if (intExtra2 != 0) {
                listnerWithRequestCode.onError(new UiError(intExtra2, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
                return true;
            }
            String stringExtra5 = intent.getStringExtra(Constants.KEY_RESPONSE);
            if (stringExtra5 == null) {
                listnerWithRequestCode.onComplete(new JSONObject());
                return true;
            }
            try {
                listnerWithRequestCode.onComplete(m.d(stringExtra5));
                return true;
            } catch (JSONException unused) {
                listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra5));
                return true;
            }
        }
        int intExtra3 = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
        if (intExtra3 != 0) {
            listnerWithRequestCode.onError(new UiError(intExtra3, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
            return true;
        }
        String stringExtra6 = intent.getStringExtra("response");
        if (stringExtra6 == null) {
            listnerWithRequestCode.onComplete(new JSONObject());
            return true;
        }
        try {
            String stringExtra7 = intent.getStringExtra("message");
            JSONObject d11 = m.d(stringExtra6);
            d11.put("message", stringExtra7);
            listnerWithRequestCode.onComplete(d11);
            return true;
        } catch (JSONException unused2) {
            listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra6));
            return true;
        }
    }

    public Object setListenerWithRequestcode(int i11, IUiListener iUiListener) {
        ApiTask put;
        String a11 = k.a(i11);
        if (a11 == null) {
            SLog.e("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=" + i11);
            return null;
        }
        synchronized (this.f42872b) {
            put = this.f42872b.put(a11, new ApiTask(i11, iUiListener));
        }
        if (put == null) {
            return null;
        }
        return put.mListener;
    }

    public Object setListnerWithAction(String str, IUiListener iUiListener) {
        ApiTask put;
        int b11 = k.b(str);
        if (b11 == -1) {
            SLog.e("openSDK_LOG.UIListenerManager", "setListnerWithAction fail, action = " + str);
            return null;
        }
        synchronized (this.f42872b) {
            put = this.f42872b.put(str, new ApiTask(b11, iUiListener));
        }
        if (put == null) {
            return null;
        }
        return put.mListener;
    }
}
