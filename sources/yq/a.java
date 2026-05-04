package yq;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import java.util.Iterator;
import wq.c;
import wq.d;
import wq.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static String a(Context context) {
        String str;
        try {
            ServiceVerifyKit.Builder builder = new ServiceVerifyKit.Builder();
            builder.j(context).p(new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId"), ServiceVerifyKit.Builder.ComponentType.ACTIVITY);
            e a11 = c.a(context);
            Iterator<String> it = a11.b().iterator();
            while (it.hasNext()) {
                builder.b(a11.a(), it.next());
            }
            if (d.a(context) == 2) {
                builder.b("com.huawei.appmarketwear", "CE1EF7188F820973C191227D95D54311ED3A65EC83E37009E898A1C058BBC775");
            }
            str = builder.e();
        } catch (Throwable unused) {
            str = null;
        }
        try {
            Log.d("ServiceVerifyKitUtils", "genVerifiedPackageName, get market packageName from verify kit is: " + str);
            return str;
        } catch (Throwable unused2) {
            Log.e("ServiceVerifyKitUtils", "genVerifiedPackageName error");
            return str;
        }
    }
}
