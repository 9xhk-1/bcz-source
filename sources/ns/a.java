package ns;

import android.content.Context;
import android.provider.Settings;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static int a(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            return 0;
        }
    }

    public static void b(Context context, int brightness) {
        Settings.System.putInt(context.getContentResolver(), "screen_brightness", brightness);
    }
}
