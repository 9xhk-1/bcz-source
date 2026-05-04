package com.baicizhan.client.business.auth.login;

import android.content.Context;
import android.text.TextUtils;
import c9.a;
import com.baicizhan.client.business.dataset.models.UserRecord;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ThirdPartyUserInfo implements Serializable {
    public static final String GENDER_FEMALE = "f";
    public static final String GENDER_MALE = "m";
    public static final String PROVIDER_HUAWEI = "huawei";
    public static final String PROVIDER_QQ = "qq";
    public static final String PROVIDER_RENREN = "renren";
    public static final String PROVIDER_WEIBO = "weibo";
    public static final String PROVIDER_WEIXIN = "weixin";
    private static final long serialVersionUID = 1;
    public String asecret;
    public String atoken;
    public String authorizationCode;
    public String city;
    public String country;
    public long expireAt;
    public String gender;
    public String imageUrl;
    public int loginType;
    public String nickName;
    public String openid;
    public String provider;
    public String province;
    public String refreshToken;
    public String uid;
    public String unionid;

    public static void clearThirdPartyLoginCache(Context context) {
        a.a();
    }

    public static ThirdPartyUserInfo fromOnlinePartyUserInfo(UserRecord userRecord, com.baicizhan.online.unified_user_service.ThirdPartyUserInfo userInfo) {
        ThirdPartyUserInfo thirdPartyUserInfo = new ThirdPartyUserInfo();
        thirdPartyUserInfo.loginType = userRecord.getLoginType();
        thirdPartyUserInfo.provider = userInfo.provider;
        thirdPartyUserInfo.uid = userInfo.uid;
        thirdPartyUserInfo.asecret = userInfo.asecret;
        thirdPartyUserInfo.openid = userInfo.openid;
        thirdPartyUserInfo.unionid = userInfo.unionid;
        thirdPartyUserInfo.atoken = TextUtils.isEmpty(userInfo.atoken) ? userRecord.getToken() : userInfo.atoken;
        thirdPartyUserInfo.setExpireIn(userInfo.expires_at);
        thirdPartyUserInfo.nickName = TextUtils.isEmpty(userInfo.nickname) ? userRecord.getNickName() : userInfo.nickname;
        thirdPartyUserInfo.imageUrl = TextUtils.isEmpty(userInfo.image_url) ? userRecord.getImage() : userInfo.image_url;
        thirdPartyUserInfo.gender = TextUtils.isEmpty(userInfo.gender) ? userRecord.getThirdPartySex() : userInfo.gender;
        return thirdPartyUserInfo;
    }

    public static UserRecord thirdPartyInfoToUserRecord(ThirdPartyUserInfo thirdPartyUserInfo) {
        UserRecord userRecord = new UserRecord();
        userRecord.setUser(thirdPartyUserInfo.nickName);
        userRecord.setNickName(thirdPartyUserInfo.nickName);
        userRecord.setImage(thirdPartyUserInfo.imageUrl);
        if (TextUtils.equals(thirdPartyUserInfo.gender, "m")) {
            userRecord.setSex(1);
        } else if (TextUtils.equals(thirdPartyUserInfo.gender, "f")) {
            userRecord.setSex(2);
        } else {
            userRecord.setSex(3);
        }
        userRecord.setLoginType(thirdPartyUserInfo.loginType);
        userRecord.setPasswordMD5("");
        return userRecord;
    }

    public void setExpireIn(String expireIn) {
        try {
            this.expireAt = TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) + Long.valueOf(expireIn).longValue();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String toString() {
        return "ThirdPartyUserInfo{asecret='" + this.asecret + "', loginType=" + this.loginType + ", provider='" + this.provider + "', uid='" + this.uid + "', openid='" + this.openid + "', unionid='" + this.unionid + "', atoken='" + this.atoken + "', refreshToken='" + this.refreshToken + "', expireAt=" + this.expireAt + ", nickName='" + this.nickName + "', imageUrl='" + this.imageUrl + "', gender='" + this.gender + "', country='" + this.country + "', province='" + this.province + "', city='" + this.city + "', authorizationCode='" + this.authorizationCode + '\'' + b.f69928j;
    }
}
