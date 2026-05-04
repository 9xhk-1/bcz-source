package com.baicizhan.client.business.util;

import android.content.Context;
import com.baicizhan.online.bs_users.BBRedirectInfo;
import com.baicizhan.online.bs_users.BBRedirectType;
import com.baicizhan.online.thrift.basic.AdvertiseRedirectInfo;
import com.baicizhan.online.thrift.basic.AdvertiseRedirectType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Redirector {
    public static final String TAG = "Redirector";
    private Context mContext;

    public Redirector(Context context) {
        this.mContext = context;
    }

    public boolean redirect(AdvertiseRedirectInfo redirectInfo) {
        if (redirectInfo == null) {
            return false;
        }
        AdvertiseRedirectType redirect_type = redirectInfo.getRedirect_type();
        if (redirect_type == AdvertiseRedirectType.REDIRECT_PI) {
            JumpUtils.redirectToPISetting(this.mContext);
            return true;
        }
        if (redirect_type == AdvertiseRedirectType.REDIRECT_TAOBAO) {
            if (JumpUtils.redirectToTaobaoApp(this.mContext, redirectInfo.getRedirect_url()) || JumpUtils.redirectToNativeStore(this.mContext, redirectInfo.getMall_url())) {
                return true;
            }
            JumpUtils.redirectToBrowser(this.mContext, redirectInfo.getRedirect_url());
            return true;
        }
        if (redirect_type == AdvertiseRedirectType.REDIRECT_LOCAL_STORE) {
            if (JumpUtils.redirectToNativeStore(this.mContext, redirectInfo.getMall_url())) {
                return true;
            }
            JumpUtils.redirectToBrowser(this.mContext, redirectInfo.getRedirect_url());
            return true;
        }
        if (redirect_type != AdvertiseRedirectType.REDIRECT_BROWSER) {
            return redirect_type != AdvertiseRedirectType.REDIRECT_NOTHING;
        }
        JumpUtils.redirectToBrowser(this.mContext, redirectInfo.getRedirect_url());
        return true;
    }

    public void redirect(BBRedirectInfo redirectInfo) {
        BBRedirectType redirect_type = redirectInfo.getRedirect_type();
        if (redirect_type == BBRedirectType.REDIRECT_PI) {
            JumpUtils.redirectToPISetting(this.mContext);
            return;
        }
        if (redirect_type == BBRedirectType.REDIRECT_TAOBAO) {
            if (JumpUtils.redirectToTaobaoApp(this.mContext, redirectInfo.getRedirect_url()) || JumpUtils.redirectToNativeStore(this.mContext, redirectInfo.getMall_url())) {
                return;
            }
            JumpUtils.redirectToBrowser(this.mContext, redirectInfo.getRedirect_url());
            return;
        }
        if (redirect_type == BBRedirectType.REDIRECT_LOCAL_STORE) {
            if (JumpUtils.redirectToNativeStore(this.mContext, redirectInfo.getMall_url())) {
                return;
            }
            JumpUtils.redirectToBrowser(this.mContext, redirectInfo.getRedirect_url());
        } else if (redirect_type == BBRedirectType.REDIRECT_BROWSER) {
            JumpUtils.redirectToBrowser(this.mContext, redirectInfo.getRedirect_url());
        }
    }
}
