package cw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.MultiImageObject;
import com.sina.weibo.sdk.api.SuperGroupObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.VideoSourceObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.share.ShareTransActivity;
import gw.a;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f46864a;

    public static void a(Activity activity, WeiboMultiMessage weiboMultiMessage) {
        a.C0646a a11;
        if (activity == null) {
            return;
        }
        if (weiboMultiMessage != null) {
            ArrayList arrayList = new ArrayList();
            TextObject textObject = weiboMultiMessage.textObject;
            if (textObject != null) {
                arrayList.add(textObject);
            }
            ImageObject imageObject = weiboMultiMessage.imageObject;
            if (imageObject != null) {
                arrayList.add(imageObject);
            }
            MediaObject mediaObject = weiboMultiMessage.mediaObject;
            if (mediaObject != null) {
                arrayList.add(mediaObject);
            }
            MultiImageObject multiImageObject = weiboMultiMessage.multiImageObject;
            if (multiImageObject != null) {
                arrayList.add(multiImageObject);
            }
            VideoSourceObject videoSourceObject = weiboMultiMessage.videoSourceObject;
            if (videoSourceObject != null) {
                arrayList.add(videoSourceObject);
            }
            SuperGroupObject superGroupObject = weiboMultiMessage.superGroupObject;
            if (superGroupObject != null) {
                arrayList.add(superGroupObject);
            }
            if (weiboMultiMessage.superGroupObject != null && ((a11 = gw.a.a(activity)) == null || a11.f57827c < 10791)) {
                SuperGroupObject superGroupObject2 = weiboMultiMessage.superGroupObject;
                if (!arrayList.isEmpty() && superGroupObject2 != null && arrayList.contains(superGroupObject2) && arrayList.size() == 1) {
                    Toast.makeText(activity, "微博版本过低，不支持超话分享", 0).show();
                    return;
                }
                weiboMultiMessage.superGroupObject = null;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("_weibo_command_type", 1);
        bundle.putString("_weibo_transaction", System.currentTimeMillis() + "");
        bundle.putAll(weiboMultiMessage.writeToBundle(bundle));
        Intent intent = new Intent(activity, (Class<?>) ShareTransActivity.class);
        intent.putExtra("start_flag", 1001);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 10001);
    }
}
