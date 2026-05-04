package xb;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import zb.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f97941a = "Common";

    public static int a(Context context, float dipValue) {
        return (int) ((dipValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void b(int alpha, View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setAlpha(alpha);
                }
                if (imageView.getBackground() != null) {
                    imageView.getBackground().setAlpha(alpha);
                    return;
                }
                return;
            }
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                textView.setTextColor(textView.getTextColors().withAlpha(alpha));
                if (textView.getBackground() != null) {
                    textView.getBackground().setAlpha(alpha);
                    return;
                }
                return;
            }
            if (view instanceof EditText) {
                EditText editText = (EditText) view;
                editText.setTextColor(editText.getTextColors().withAlpha(alpha));
                if (editText.getBackground() != null) {
                    editText.getBackground().setAlpha(alpha);
                    return;
                }
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i11 >= viewGroup.getChildCount()) {
                return;
            }
            b(alpha, viewGroup.getChildAt(i11));
            if (viewGroup.getBackground() != null) {
                viewGroup.getBackground().setAlpha(alpha);
            }
            i11++;
        }
    }

    @TargetApi(11)
    public static void c(int alpha, View view) {
        view.setAlpha(alpha / 100.0f);
    }

    public static String d(int pid) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            try {
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    readLine = readLine.trim();
                }
                try {
                    bufferedReader.close();
                    return readLine;
                } catch (IOException e11) {
                    qb.c.c(f97941a, "getProcessName", e11);
                    return readLine;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    qb.c.c(f97941a, "getProcessName", th);
                    return null;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e12) {
                            qb.c.c(f97941a, "getProcessName", e12);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static String e(Context context) {
        return d(Process.myPid());
    }

    public static int f(Context context) {
        return g(context, 0);
    }

    public static int g(Context context, int type) {
        return 1 == type ? p(context, r0.heightPixels) : h(context).heightPixels;
    }

    public static DisplayMetrics h(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int i(Context context) {
        return j(context, 0);
    }

    public static int j(Context context, int type) {
        return 1 == type ? p(context, r0.widthPixels) : h(context).widthPixels;
    }

    public static int k(Context context) {
        int a11 = a(context, 25.0f);
        int identifier = context.getResources().getIdentifier(b.C1392b.f102487j, "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : a11;
    }

    public static ComponentName l(Context context, String pkg, String filterActivity) {
        ComponentName componentName;
        Log.d("caohzh", "filter: " + filterActivity);
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(Integer.MAX_VALUE);
        if (runningTasks == null) {
            return null;
        }
        Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
        while (it.hasNext()) {
            componentName = it.next().topActivity;
            Log.d("caohzh", "filter hou: " + componentName.getClassName());
            if (componentName.getPackageName().equals(pkg) && !componentName.getClassName().equals(filterActivity)) {
                return componentName;
            }
        }
        return null;
    }

    public static boolean m(Context context, String pkg, String activity) {
        ComponentName componentName;
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        if (runningTasks != null && !runningTasks.isEmpty()) {
            componentName = runningTasks.get(0).topActivity;
            if (componentName.getPackageName().equals(pkg) && componentName.getClassName().equals(activity)) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(Context context) {
        return ((PowerManager) context.getSystemService(c6.d.f8118j)).isScreenOn();
    }

    public static final String o(final String s11) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(s11.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static int p(Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int q(Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void r(int alpha, View view) {
        c(alpha, view);
    }

    public static int s(Context context, float spValue) {
        return (int) ((spValue * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
