package com.meizu.cloud.pushsdk.platform.message;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l50.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SubTagsStatus extends BasicPushStatus {
    private String pushId;
    private List<Tag> tagList;

    public class Tag implements Serializable {
        private int tagId;
        private String tagName;

        public Tag() {
        }

        public int getTagId() {
            return this.tagId;
        }

        public String getTagName() {
            return this.tagName;
        }

        public void setTagId(int i11) {
            this.tagId = i11;
        }

        public void setTagName(String str) {
            this.tagName = str;
        }

        public String toString() {
            return "Tag{tagId=" + this.tagId + ", tagName='" + this.tagName + '\'' + b.f69928j;
        }
    }

    public SubTagsStatus() {
    }

    public String getPushId() {
        return this.pushId;
    }

    public List<Tag> getTagList() {
        return this.tagList;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public void parseValueData(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull("pushId")) {
            setPushId(jSONObject.getString("pushId"));
        }
        if (jSONObject.isNull("tags")) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("tags");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
            Tag tag = new Tag();
            if (!jSONObject2.isNull("tagId")) {
                tag.tagId = jSONObject2.getInt("tagId");
            }
            if (!jSONObject2.isNull("tagName")) {
                tag.tagName = jSONObject2.getString("tagName");
            }
            arrayList.add(tag);
        }
        DebugLogger.e(BasicPushStatus.TAG, "tags " + arrayList);
        setTagList(arrayList);
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    public void setTagList(List<Tag> list) {
        this.tagList = list;
    }

    @Override // com.meizu.cloud.pushsdk.platform.message.BasicPushStatus
    public String toString() {
        return super.toString() + " SubTagsStatus{pushId='" + this.pushId + "', tagList=" + this.tagList + b.f69928j;
    }

    public SubTagsStatus(String str) {
        super(str);
    }
}
