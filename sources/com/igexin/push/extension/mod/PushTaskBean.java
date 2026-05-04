package com.igexin.push.extension.mod;

import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import com.igexin.push.core.e;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PushTaskBean {
    private String action;
    private List<BaseActionBean> actionChains;
    private String appid;
    private Map<String, String> conditionMap;
    private int currentActionid;
    private int executeTimes;

    /* renamed from: id, reason: collision with root package name */
    private String f38516id;
    private String messageId;
    private String msgAddress;
    private byte[] msgExtra;
    private int perActionid;
    private int status;
    private String taskId;
    private String appKey = "";
    private boolean isHttpImg = false;
    private boolean isStop = false;

    public String getAction() {
        return this.action;
    }

    public BaseActionBean getActionByType(String str) {
        List<BaseActionBean> actionChains = getActionChains();
        if (actionChains == null) {
            return null;
        }
        for (BaseActionBean baseActionBean : actionChains) {
            if (baseActionBean.getType().equals(str)) {
                return baseActionBean;
            }
        }
        return null;
    }

    public List<BaseActionBean> getActionChains() {
        return this.actionChains;
    }

    public String getActionIdByType(String str) {
        List<BaseActionBean> actionChains = getActionChains();
        if (actionChains == null) {
            return null;
        }
        for (BaseActionBean baseActionBean : actionChains) {
            if (baseActionBean.getType().equals(str)) {
                return baseActionBean.getActionId();
            }
        }
        return null;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getAppid() {
        return this.appid;
    }

    public BaseActionBean getBaseAction(String str) {
        for (BaseActionBean baseActionBean : getActionChains()) {
            if (baseActionBean.getActionId().equals(str)) {
                return baseActionBean;
            }
        }
        return null;
    }

    public Map<String, String> getConditionMap() {
        return this.conditionMap;
    }

    public int getCurrentActionid() {
        return this.currentActionid;
    }

    public int getExecuteTimes() {
        return this.executeTimes;
    }

    public String getId() {
        return this.f38516id;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getMsgAddress() {
        return this.msgAddress;
    }

    public byte[] getMsgExtra() {
        return this.msgExtra;
    }

    public int getPerActionid() {
        return this.perActionid;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public boolean isHttpImg() {
        return this.isHttpImg;
    }

    public boolean isStop() {
        return this.isStop;
    }

    public void parse(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("appid") && jSONObject.get("appid").equals(e.f37998a)) {
            this.appid = jSONObject.getString("appid");
        }
        if (jSONObject.has(a.f11004r)) {
            this.appKey = jSONObject.getString(a.f11004r);
        }
        if (jSONObject.has("taskid")) {
            this.taskId = jSONObject.getString("taskid");
        }
        if (jSONObject.has("messageid")) {
            this.messageId = jSONObject.getString("messageid");
        }
        if (TextUtils.isEmpty(this.appid)) {
            this.appid = e.f37998a;
        }
        this.currentActionid = 1;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setActionChains(List<BaseActionBean> list) {
        this.actionChains = list;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setConditionMap(Map<String, String> map) {
        this.conditionMap = map;
    }

    public void setCurrentActionid(int i11) {
        this.currentActionid = i11;
    }

    public void setExecuteTimes(int i11) {
        this.executeTimes = i11;
    }

    public void setHttpImg(boolean z11) {
        this.isHttpImg = z11;
    }

    public void setId(String str) {
        this.f38516id = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setMsgAddress(String str) {
        this.msgAddress = str;
    }

    public void setMsgExtra(byte[] bArr) {
        this.msgExtra = bArr;
    }

    public void setPerActionid(int i11) {
        this.perActionid = i11;
    }

    public void setStatus(int i11) {
        this.status = i11;
    }

    public void setStop(boolean z11) {
        this.isStop = z11;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }
}
