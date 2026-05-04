package com.igexin.sdk.message;

import android.text.TextUtils;
import com.igexin.sdk.Tag;

/* loaded from: classes7.dex */
public class QueryTagCmdMessage extends GTCmdMessage {
    private String code;

    /* renamed from: sn, reason: collision with root package name */
    private String f38764sn;
    private Tag[] tags;

    public QueryTagCmdMessage(String str, String str2, String str3, int i11) {
        super(i11);
        this.f38764sn = str;
        this.code = str2;
        if (TextUtils.isEmpty(str3) || str3.equals("none")) {
            return;
        }
        String[] split = str3.split(" ");
        Tag[] tagArr = new Tag[split.length];
        for (int i12 = 0; i12 < split.length; i12++) {
            Tag tag = new Tag();
            tag.setName(split[i12]);
            tagArr[i12] = tag;
        }
        this.tags = tagArr;
    }

    public String getCode() {
        return this.code;
    }

    public String getSn() {
        return this.f38764sn;
    }

    public Tag[] getTags() {
        return this.tags;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setSn(String str) {
        this.f38764sn = str;
    }

    public void setTags(Tag[] tagArr) {
        this.tags = tagArr;
    }
}
