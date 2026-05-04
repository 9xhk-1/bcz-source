package gi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j0 {
    public static void a(Activity activity) {
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage("com.iqoo.secure");
        if (launchIntentForPackage != null) {
            activity.startActivity(launchIntentForPackage);
            return;
        }
        Intent launchIntentForPackage2 = activity.getPackageManager().getLaunchIntentForPackage("com.oppo.safe");
        if (launchIntentForPackage2 != null) {
            activity.startActivity(launchIntentForPackage2);
            return;
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivity(intent);
    }
}
