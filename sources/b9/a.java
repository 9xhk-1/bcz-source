package b9;

import android.app.Activity;
import android.net.Uri;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.tencent.connect.common.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6452a = "630102789";

    /* renamed from: b, reason: collision with root package name */
    public static final String f6453b = "2fcefe3e80820c6ad53dff428970e2a4";

    /* renamed from: c, reason: collision with root package name */
    public static final String f6454c = "https://api.weibo.com/oauth2/default.html";

    /* renamed from: d, reason: collision with root package name */
    public static final String f6455d = "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6456e = "100344605";

    /* renamed from: f, reason: collision with root package name */
    public static final String f6457f = "e7976976dfd09281c748c1af16563211";

    /* renamed from: g, reason: collision with root package name */
    public static final String f6458g = "wxce5d9e837051d623";

    /* renamed from: h, reason: collision with root package name */
    public static final String f6459h = "25a18bdaf8119c58c11b3c8fc1a6b6af";

    /* renamed from: i, reason: collision with root package name */
    public static final String f6460i = "ZscZbfBNTxY5Q0qAySmCdBALechtIHWO2o4I0RlVfSY";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: b9.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0112a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6461a;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            f6461a = iArr;
            try {
                iArr[ShareChannel.QQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6461a[ShareChannel.QZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6461a[ShareChannel.WEIXIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6461a[ShareChannel.WEIXIN_CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6461a[ShareChannel.WEIBO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6461a[ShareChannel.SAVE_PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String a(String originUrl, ShareChannel scene) {
        try {
            return Uri.parse(originUrl).buildUpon().appendQueryParameter("toname", scene.toString()).build().toString();
        } catch (Throwable unused) {
            return originUrl;
        }
    }

    public static String b(ShareChannel platform) {
        int i11 = C0112a.f6461a[platform.ordinal()];
        return (i11 == 1 || i11 == 2) ? Constants.SOURCE_QQ : (i11 == 3 || i11 == 4) ? "微信" : i11 != 5 ? "应用" : "新浪微博";
    }

    public static boolean c(Activity activity, ShareChannel platform) {
        switch (C0112a.f6461a[platform.ordinal()]) {
            case 1:
            case 2:
                return c9.a.c(activity);
            case 3:
            case 4:
                return c9.a.f(activity);
            case 5:
                return c9.a.e(activity);
            case 6:
                return true;
            default:
                return false;
        }
    }
}
