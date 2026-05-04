package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.utils.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class WXMusicVipInfo implements SendMessageToWX.IWXMusicVipObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXMusicVipInfo";
    public String musicId;

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXMusicVipObject
    public boolean checkArgs() {
        String str;
        String str2 = this.musicId;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, musicId is null";
        } else {
            if (this.musicId.length() <= 10240) {
                return true;
            }
            str = "checkArgs fail, musicId length is larger than 1024";
        }
        Log.e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXMusicVipObject
    public void serialize(Bundle bundle) {
        bundle.putString("wx_music_vip_id", this.musicId);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXMusicVipObject
    public void unserialize(Bundle bundle) {
        this.musicId = bundle.getString("wx_music_vip_id", "");
    }
}
