package com.igexin.push.core.a.c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.getui.gtc.base.util.CommonUtil;
import com.igexin.push.a.e;
import com.igexin.push.core.ServiceManager;
import com.igexin.push.core.b.m;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.sdk.PopupActivity;
import com.igexin.sdk.message.GTPopupMessage;
import com.igexin.sdk.router.TransferGtcProcess;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class i implements PushMessageInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37693a = "PopupAction";

    /* renamed from: b, reason: collision with root package name */
    private long f37694b = 0;

    public static HashMap<String, Object> a(Context context) {
        try {
            return CommonUtil.isMainProcess() ? com.igexin.push.g.d.a() : (HashMap) TransferGtcProcess.getInstance().transferGtcProcess(context, new Intent(), TransferGtcProcess.POPUACTION_METHODNAME).getSerializable("map");
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return new HashMap<>();
        }
    }

    private static void b(PushTaskBean pushTaskBean) {
        boolean isAppForeground = CommonUtil.isAppForeground();
        boolean z11 = !com.igexin.push.a.g.f37341a && isAppForeground;
        HashMap<String, Object> a11 = a(com.igexin.push.core.e.f38035l);
        boolean booleanValue = ((Boolean) a11.get("isPause")).booleanValue();
        boolean z12 = ((Boolean) a11.get("isTranslucent")).booleanValue() && ((Integer) ServiceManager.getInstance().initType.first).equals(0);
        if (!z11 || booleanValue || z12) {
            com.igexin.c.a.c.a.b(f37693a, "has one popup = " + com.igexin.push.a.g.f37341a + " , appForeground = " + isAppForeground + " , is guardAndTranslucent = " + z12 + " , has Translucent popu " + booleanValue);
            return;
        }
        com.igexin.push.core.e.c.a();
        com.igexin.push.core.e.c.a(com.igexin.push.core.b.f37711ah, pushTaskBean.getTaskId());
        Map<String, PushTaskBean> map = com.igexin.push.core.e.f38006ah;
        com.igexin.push.core.a.b.d();
        PushTaskBean pushTaskBean2 = map.get(com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId()));
        if (pushTaskBean2 != null) {
            pushTaskBean2.setStatus(com.igexin.push.core.b.f37711ah);
        }
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), "1");
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final boolean executeAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        if (pushTaskBean == null || baseActionBean == null) {
            return false;
        }
        com.igexin.push.core.b.m mVar = (com.igexin.push.core.b.m) baseActionBean;
        mVar.f37844e = pushTaskBean.getAppid();
        mVar.f37845f = pushTaskBean.getMessageId();
        mVar.f37846g = pushTaskBean.getTaskId();
        mVar.f37847h = pushTaskBean.getAppKey();
        Intent intent = new Intent(com.igexin.push.core.e.f38035l, (Class<?>) PopupActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("bean", mVar);
        intent.putExtras(bundle);
        intent.setFlags(343932928);
        intent.putExtra("action", "popup");
        com.igexin.push.core.e.f38035l.startActivity(intent);
        com.igexin.c.a.c.a.b(f37693a, "startActivity PopuAction");
        if (mVar.getDoActionId() == null) {
            return true;
        }
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), mVar.getDoActionId());
        return true;
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final BaseActionBean parseAction(JSONObject jSONObject) {
        float f11;
        float f12;
        try {
            com.igexin.push.core.b.m mVar = new com.igexin.push.core.b.m();
            mVar.setType("popup");
            mVar.setActionId(jSONObject.optString("actionid"));
            mVar.setDoActionId(jSONObject.optString("do"));
            JSONObject jSONObject2 = new JSONObject(com.igexin.push.config.f.a(jSONObject.optString(TtmlNode.TAG_BODY)));
            JSONObject optJSONObject = jSONObject2.optJSONObject("statisticsInfo");
            if (optJSONObject != null) {
                mVar.f37842c = optJSONObject.optString("planName", "");
                mVar.f37843d = optJSONObject.optString("nodeName", "");
            }
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("properties");
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
            mVar.f37848i = jSONObject2.optString("showActionId", "");
            mVar.f37840a = new m.b(jSONObject2.optJSONObject("mask"), mVar.f37842c, mVar.f37843d, f11, f12);
            mVar.f37841b = new m.b(jSONObject2.optJSONObject("template"), mVar.f37842c, mVar.f37843d, f11, f12);
            GTPopupMessage.EventProperties eventProperties = new GTPopupMessage.EventProperties(mVar.f37842c, mVar.f37843d, "", "");
            GTPopupMessage gTPopupMessage = new GTPopupMessage();
            gTPopupMessage.setEventProperties(eventProperties);
            mVar.f37849j = gTPopupMessage;
            return mVar;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    @Override // com.igexin.push.extension.mod.PushMessageInterface
    public final PushMessageInterface.ActionPrepareState prepareExecuteAction(PushTaskBean pushTaskBean, BaseActionBean baseActionBean) {
        boolean isAppForeground = CommonUtil.isAppForeground();
        boolean z11 = (baseActionBean instanceof com.igexin.push.core.b.m) && !com.igexin.push.a.g.f37341a && isAppForeground;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z12 = currentTimeMillis - this.f37694b > 1000;
        HashMap<String, Object> a11 = a(com.igexin.push.core.e.f38035l);
        boolean booleanValue = ((Boolean) a11.get("isPause")).booleanValue();
        boolean z13 = ((Boolean) a11.get("isTranslucent")).booleanValue() && ((Integer) ServiceManager.getInstance().initType.first).equals(0);
        if (z11 && z12 && !booleanValue && !z13) {
            this.f37694b = currentTimeMillis;
            ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
            a(((com.igexin.push.core.b.m) baseActionBean).f37841b, concurrentHashMap);
            if (concurrentHashMap.size() <= 0) {
                return PushMessageInterface.ActionPrepareState.success;
            }
            a(concurrentHashMap, pushTaskBean);
            return PushMessageInterface.ActionPrepareState.wait;
        }
        com.igexin.c.a.c.a.b(f37693a, "has one popup = " + com.igexin.push.a.g.f37341a + " , appForeground = " + isAppForeground + " , is guardAndTranslucent = " + z13 + " ,overLimitTime = " + z12 + " , has Translucent popu " + booleanValue);
        return PushMessageInterface.ActionPrepareState.stop;
    }

    private void a(m.b bVar, ConcurrentHashMap<String, Object> concurrentHashMap) {
        String str = bVar.f37861h;
        if (!TextUtils.isEmpty(str) && !com.igexin.push.a.e.a(str)) {
            concurrentHashMap.put(str, new Object());
        }
        String str2 = bVar.f37863j;
        if (!TextUtils.isEmpty(str2) && !com.igexin.push.a.e.a(str2)) {
            concurrentHashMap.put(str2, new Object());
        }
        ArrayList<m.b> arrayList = bVar.f37860g;
        if (arrayList != null) {
            Iterator<m.b> it = arrayList.iterator();
            while (it.hasNext()) {
                a(it.next(), concurrentHashMap);
            }
        }
    }

    public static /* synthetic */ void a(PushTaskBean pushTaskBean) {
        boolean isAppForeground = CommonUtil.isAppForeground();
        boolean z11 = !com.igexin.push.a.g.f37341a && isAppForeground;
        HashMap<String, Object> a11 = a(com.igexin.push.core.e.f38035l);
        boolean booleanValue = ((Boolean) a11.get("isPause")).booleanValue();
        boolean z12 = ((Boolean) a11.get("isTranslucent")).booleanValue() && ((Integer) ServiceManager.getInstance().initType.first).equals(0);
        if (!z11 || booleanValue || z12) {
            com.igexin.c.a.c.a.b(f37693a, "has one popup = " + com.igexin.push.a.g.f37341a + " , appForeground = " + isAppForeground + " , is guardAndTranslucent = " + z12 + " , has Translucent popu " + booleanValue);
            return;
        }
        com.igexin.push.core.e.c.a();
        com.igexin.push.core.e.c.a(com.igexin.push.core.b.f37711ah, pushTaskBean.getTaskId());
        Map<String, PushTaskBean> map = com.igexin.push.core.e.f38006ah;
        com.igexin.push.core.a.b.d();
        PushTaskBean pushTaskBean2 = map.get(com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId()));
        if (pushTaskBean2 != null) {
            pushTaskBean2.setStatus(com.igexin.push.core.b.f37711ah);
        }
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), "1");
    }

    private void a(final ConcurrentHashMap<String, Object> concurrentHashMap, final PushTaskBean pushTaskBean) {
        for (final String str : concurrentHashMap.keySet()) {
            com.igexin.push.a.e.a(str, new e.a<byte[]>() { // from class: com.igexin.push.core.a.c.i.1
                private void a() {
                    concurrentHashMap.remove(str);
                    if (concurrentHashMap.isEmpty()) {
                        i.a(pushTaskBean);
                    }
                }

                @Override // com.igexin.push.a.e.a
                public final /* synthetic */ void a(byte[] bArr) {
                    concurrentHashMap.remove(str);
                    if (concurrentHashMap.isEmpty()) {
                        i.a(pushTaskBean);
                    }
                }

                @Override // com.igexin.push.a.e.a
                public final void a(Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            });
        }
    }
}
