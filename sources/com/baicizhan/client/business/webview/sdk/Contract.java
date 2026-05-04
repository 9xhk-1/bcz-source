package com.baicizhan.client.business.webview.sdk;

import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.util.networks.upload.RxLargeFileUpload;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Contract {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BehaviorRecordParam implements NoProguard {
        public int behavior;
        public int bookId;
        public String questionType;
        public int topicId;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomNavParam implements NoProguard {
        public boolean enable = false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NavToParam implements NoProguard {
        public boolean isReplace = false;
        public String url;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecordSuccess implements NoProguard {
        public int duration;
        public String format = "aac";
        public int sampleRate = 8000;
        public String tempFilePath;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartRecordParam implements NoProguard {
        public int duration;
        public int sampleRate = 8000;
        public String format = "aac";
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UploadSuccess implements NoProguard {
        public String data;
        public String tempFilePath;

        public UploadSuccess(RxLargeFileUpload.Response response, String path) {
            this.data = response.msg;
            this.tempFilePath = path;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UploadFailed implements NoProguard {
        public int code;
        public String message;
        public String tempFilePath;

        public UploadFailed(RxLargeFileUpload.Response response, String path) {
            this.message = response.msg;
            this.code = response.code;
            this.tempFilePath = path;
        }

        public UploadFailed(int code, String msg, String path) {
            this.message = msg;
            this.code = code;
            this.tempFilePath = path;
        }
    }
}
