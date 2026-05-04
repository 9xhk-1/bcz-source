package com.baicizhan.client.business.auth.share;

import com.baicizhan.client.business.webview.JsonParams;
import com.tencent.connect.common.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public enum ShareChannel {
    WEIXIN("weixin"),
    WEIXIN_CIRCLE("weixin_circle"),
    QQ("qq"),
    QZONE(Constants.SOURCE_QZONE),
    WEIBO("weibo"),
    SAVE_PHOTO(JsonParams.ShareResultO.CHANNEL_SAVE);

    private String name;

    ShareChannel(String name) {
        this.name = name;
    }

    public static ShareChannel valueToChannel(String ss2) {
        ss2.getClass();
        switch (ss2) {
            case "weixin":
                return WEIXIN;
            case "qq":
                return QQ;
            case "qzone":
                return QZONE;
            case "weibo":
                return WEIBO;
            case "weixin_circle":
                return WEIXIN_CIRCLE;
            case "save_photo":
                return SAVE_PHOTO;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
