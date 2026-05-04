package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class WXChannelOpenProfile {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Req extends BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final String TAG = "MicroMsg.SDK.WXChannelOpenProfile.Req";
        public String userName;

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            if (b.b(this.userName)) {
                str = "userName is null";
            } else {
                if (this.userName.length() <= 1024) {
                    return true;
                }
                str = "userName.length too long";
            }
            Log.e(TAG, str);
            return false;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.userName = bundle.getString("_wxapi_finder_userName");
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 34;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_userName", this.userName);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Resp extends BaseResp {
        public String extMsg;

        public Resp() {
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 34;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }
    }
}
