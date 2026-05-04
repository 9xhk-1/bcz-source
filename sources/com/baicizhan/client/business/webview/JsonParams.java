package com.baicizhan.client.business.webview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.NoProguard;
import com.tencent.open.SocialConstants;
import com.vivo.push.PushClientConstants;
import ix.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class JsonParams implements NoProguard {
    public static final String TAG = "JsonParams";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.webview.JsonParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            $SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel = iArr;
            try {
                iArr[ShareChannel.WEIXIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel[ShareChannel.WEIXIN_CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel[ShareChannel.QQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel[ShareChannel.QZONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel[ShareChannel.WEIBO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel[ShareChannel.SAVE_PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeroIntentI {

        @wo.c("activityId")
        public String activityId;

        public static HeroIntentI fromJson(String intent) {
            try {
                return (HeroIntentI) BczJson.readFromJson(intent, new bp.a<HeroIntentI>() { // from class: com.baicizhan.client.business.webview.JsonParams.HeroIntentI.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "HeroIntentI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImageUploadStateO {
        public static final int STATE_COMPLETE = 1;
        public static final int STATE_ERROR = -1;
        public static final int STATE_START = 0;

        @wo.c("msg")
        public String msg;

        @wo.c("state")
        public int state;

        public static String toJson(ImageUploadStateO state) {
            try {
                return BczJson.writeToJson(state, new bp.a<ImageUploadStateO>() { // from class: com.baicizhan.client.business.webview.JsonParams.ImageUploadStateO.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "ImageUploadStateO#toJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IntentMetaI {

        @wo.c(PushClientConstants.TAG_PKG_NAME)
        public String pkgName;

        public static IntentMetaI fromJson(String meta) {
            try {
                return (IntentMetaI) BczJson.readFromJson(meta, new bp.a<IntentMetaI>() { // from class: com.baicizhan.client.business.webview.JsonParams.IntentMetaI.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "IntentMetaI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LocationResultO {
        public static final int ERR_CODE_FAILED = -1;
        public static final int ERR_CODE_SUCCESS = 0;
        public static final String ERR_MSG_FAILED = "failed";
        public static final String ERR_MSG_SUCCESS = "success";

        @wo.c("errCode")
        public int errCode = 0;

        @wo.c("errMsg")
        public String errMsg = "success";

        public static String toJson(LocationResultO result) {
            try {
                return BczJson.writeToJson(result, new bp.a<LocationResultO>() { // from class: com.baicizhan.client.business.webview.JsonParams.LocationResultO.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "LocationResultO#toJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NativeAppIntentParam {

        @wo.c("launchUrl")
        public String launchUrl;

        @wo.c(PushClientConstants.TAG_PKG_NAME)
        public String packageName;

        public static NativeAppIntentParam fromJson(String input) {
            try {
                return (NativeAppIntentParam) BczJson.readFromJson(input, new bp.a<NativeAppIntentParam>() { // from class: com.baicizhan.client.business.webview.JsonParams.NativeAppIntentParam.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "NativeAppIntent#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NetworkStateO {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;

        @wo.c("type")
        public int type;

        public NetworkStateO(Context context) {
            this.type = 0;
            int b11 = rb.d.b(context);
            if (b11 == 0) {
                this.type = 1;
                return;
            }
            if (b11 == 1) {
                this.type = 4;
                return;
            }
            if (b11 == 2) {
                this.type = 3;
            } else if (b11 != 3) {
                this.type = 0;
            } else {
                this.type = 2;
            }
        }

        public static String toJson(NetworkStateO state) {
            try {
                return BczJson.writeToJson(state, new bp.a<NetworkStateO>() { // from class: com.baicizhan.client.business.webview.JsonParams.NetworkStateO.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "NetworkStateO#toJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareParamI {
        public static final String TYPE_H5 = "h5";
        public static final String TYPE_IMAGE = "image";
        public static final String TYPE_MINI_PROGRAM = "mini-program";
        public static final String TYPE_TEXT = "text";

        @wo.c("channel")
        public String channel;

        @wo.c("coverImageData")
        public String coverImage;

        @wo.c(SocialConstants.PARAM_APP_DESC)
        public String desc;

        @wo.c(SocialConstants.PARAM_IMG_URL)
        public String img;

        @wo.c("imgData")
        public String imgData;

        @wo.c("programId")
        public String programId;

        @wo.c("programPath")
        public String programPath;

        @wo.c("programType")
        public int programType;

        @wo.c("stat")
        public Stat stat;

        @wo.c("text")
        public String text;

        @wo.c("title")
        public String title;

        @wo.c("url")
        public String url;

        @wo.c("webpageUrl")
        public String webPageUrl;

        @wo.c("shareType")
        public String shareType = "";

        @wo.c("saveToLocal")
        public boolean saveToLocal = false;

        @wo.c("withShareTicket")
        public boolean withShareTicket = false;

        public static ShareParamI fromJson(String param) {
            try {
                return (ShareParamI) BczJson.readFromJson(param, new bp.a<ShareParamI>() { // from class: com.baicizhan.client.business.webview.JsonParams.ShareParamI.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "ShareParamI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareResultO {
        public static final String CHANNEL_QQ = "qq_session";
        public static final String CHANNEL_QZONE = "qq_timeline";
        public static final String CHANNEL_SAVE = "save_photo";
        public static final String CHANNEL_SINA = "weibo";
        public static final String CHANNEL_WEIXIN = "session";
        public static final String CHANNEL_WEIXIN_CIRCLE = "timeline";
        public static final int SHARE_CANCELLED = -2;
        public static final int SHARE_FAILED = -1;
        public static final int SHARE_SUCCESS = 0;

        @wo.c("channel")
        public String channel;

        @wo.c("errCode")
        public int errCode;

        public static String parseChannel(ShareChannel media) {
            switch (AnonymousClass1.$SwitchMap$com$baicizhan$client$business$auth$share$ShareChannel[media.ordinal()]) {
                case 1:
                    return CHANNEL_WEIXIN;
                case 2:
                    return CHANNEL_WEIXIN_CIRCLE;
                case 3:
                    return CHANNEL_QQ;
                case 4:
                    return CHANNEL_QZONE;
                case 5:
                    return "weibo";
                case 6:
                    return CHANNEL_SAVE;
                default:
                    return null;
            }
        }

        public static String toJson(ShareResultO result) {
            try {
                return BczJson.writeToJson(result, new bp.a<ShareResultO>() { // from class: com.baicizhan.client.business.webview.JsonParams.ShareResultO.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "ShareResultO#toJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareStateI {

        @wo.c("visibility")
        public boolean visibility;

        public static ShareStateI fromJson(String state) {
            try {
                return (ShareStateI) BczJson.readFromJson(state, new bp.a<ShareStateI>() { // from class: com.baicizhan.client.business.webview.JsonParams.ShareStateI.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "ShareStateI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Stat {

        @wo.c("pageId")
        public String pageId;

        @wo.c("pageName")
        public String pageName;

        @wo.c("product")
        public String product;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TitleI {

        @wo.c("title")
        public String title;

        public static TitleI fromJson(String title) {
            try {
                return (TitleI) BczJson.readFromJson(title, new bp.a<TitleI>() { // from class: com.baicizhan.client.business.webview.JsonParams.TitleI.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "TitleI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UploadImageMetaI {

        @wo.c("fieldName")
        public String fieldName;

        @wo.c("maxSaveSize")
        public int maxSaveSize;

        @wo.c("url")
        public String url;

        public static UploadImageMetaI fromJson(String meta) {
            try {
                return (UploadImageMetaI) BczJson.readFromJson(meta, new bp.a<UploadImageMetaI>() { // from class: com.baicizhan.client.business.webview.JsonParams.UploadImageMetaI.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "UploadImageMetaI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UploadInfo {

        @wo.c("network")
        public int network;

        @wo.c(g.b.f62794h)
        public long size;

        public static String toJson(UploadInfo state) {
            try {
                return BczJson.writeToJson(state, new bp.a<UploadInfo>() { // from class: com.baicizhan.client.business.webview.JsonParams.UploadInfo.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.c(JsonParams.TAG, "ImageUploadStateO#toJson failed. ", th2);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WXSubscribeI {

        @wo.c("reserved")
        public String reserved;

        @wo.c("scene")
        public int scene;

        public static WXSubscribeI fromJson(String input) {
            try {
                return (WXSubscribeI) BczJson.readFromJson(input, new bp.a<WXSubscribeI>() { // from class: com.baicizhan.client.business.webview.JsonParams.WXSubscribeI.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "WXSubscribeI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WeChatMiniProgramParam {

        @wo.c("programId")
        public String programId;

        @wo.c("programPath")
        public String programPath;

        @wo.c("programType")
        public Integer programType = 0;

        public static WeChatMiniProgramParam fromJson(String input) {
            try {
                return (WeChatMiniProgramParam) BczJson.readFromJson(input, new bp.a<WeChatMiniProgramParam>() { // from class: com.baicizhan.client.business.webview.JsonParams.WeChatMiniProgramParam.1
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "WeChatMiniProgramParam#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WebActivityIntentI implements Parcelable {
        public static final Parcelable.Creator<WebActivityIntentI> CREATOR = new Parcelable.Creator<WebActivityIntentI>() { // from class: com.baicizhan.client.business.webview.JsonParams.WebActivityIntentI.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WebActivityIntentI createFromParcel(Parcel in2) {
                return new WebActivityIntentI(in2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WebActivityIntentI[] newArray(int size) {
                return new WebActivityIntentI[size];
            }
        };
        public static final String TYPE_LITTLE_CLASS = "little_class";

        @wo.c("isLandscape")
        public boolean isLandscape;

        @wo.c("statusBar")
        public StatusBar statusBar;

        @wo.c("title")
        public String title;

        @wo.c("type")
        public String type;

        @wo.c("url")
        public String url;

        public WebActivityIntentI(Parcel in2) {
            this.isLandscape = false;
            this.statusBar = null;
            this.type = in2.readString();
            this.title = in2.readString();
            this.url = in2.readString();
            this.isLandscape = in2.readByte() != 0;
            this.statusBar = (StatusBar) in2.readParcelable(StatusBar.class.getClassLoader());
        }

        public static WebActivityIntentI fromJson(String intent) {
            try {
                return (WebActivityIntentI) BczJson.readFromJson(intent, new bp.a<WebActivityIntentI>() { // from class: com.baicizhan.client.business.webview.JsonParams.WebActivityIntentI.2
                }.getType());
            } catch (Throwable th2) {
                qb.c.d(JsonParams.TAG, "WebActivityIntentI#fromJson failed. " + th2, new Object[0]);
                return null;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            parcel.writeString(this.url);
            parcel.writeByte(this.isLandscape ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.statusBar, i11);
        }
    }

    private JsonParams() {
    }

    public static String repeatEscape(String json) {
        if (json != null) {
            return json.replaceAll("\\\\", "\\\\\\\\");
        }
        return null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StatusBar implements Parcelable {
        public static final Parcelable.Creator<StatusBar> CREATOR = new Parcelable.Creator<StatusBar>() { // from class: com.baicizhan.client.business.webview.JsonParams.StatusBar.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StatusBar createFromParcel(Parcel source) {
                return new StatusBar(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public StatusBar[] newArray(int size) {
                return new StatusBar[size];
            }
        };

        @wo.c("statusBarVisible")
        public boolean statusBarVisible;

        @wo.c("statusContentColorBlack")
        public boolean statusContentColorBlack;

        public StatusBar() {
            this.statusBarVisible = true;
            this.statusContentColorBlack = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeByte(this.statusBarVisible ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.statusContentColorBlack ? (byte) 1 : (byte) 0);
        }

        public StatusBar(Parcel in2) {
            this.statusBarVisible = true;
            this.statusContentColorBlack = true;
            this.statusBarVisible = in2.readByte() != 0;
            this.statusContentColorBlack = in2.readByte() != 0;
        }
    }
}
