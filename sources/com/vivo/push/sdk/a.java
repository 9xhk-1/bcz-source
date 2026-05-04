package com.vivo.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.mcssdk.constant.IntentConstant;
import com.vivo.push.b.x;
import com.vivo.push.c.d;
import com.vivo.push.e;
import com.vivo.push.q;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.p;
import com.vivo.push.util.t;
import com.vivo.push.util.u;
import com.vivo.push.util.z;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a extends q {

    /* renamed from: c, reason: collision with root package name */
    private static a f45064c;

    /* renamed from: e, reason: collision with root package name */
    private static final List<Integer> f45065e = Arrays.asList(3);

    /* renamed from: d, reason: collision with root package name */
    private String f45066d;

    /* renamed from: f, reason: collision with root package name */
    private String f45067f = "";

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f45064c == null) {
                    f45064c = new a();
                }
                aVar = f45064c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private boolean c(Intent intent) {
        String c11 = z.c(this.f45055a, "com.vivo.pushservice");
        p.d("CommandWorker", " 配置的验签参数 = ".concat(String.valueOf(c11)));
        if (!TextUtils.equals(c11, "1")) {
            return true;
        }
        String stringExtra = intent.getStringExtra("security_avoid_pull_rsa");
        String stringExtra2 = intent.getStringExtra("security_avoid_rsa_public_key");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            p.a("CommandWorker", "!decrypt.equals, so securityContent == " + stringExtra + " or publickKey isempty ");
            return false;
        }
        try {
            if (d.a(this.f45055a).a().a("com.vivo.pushservice".getBytes("UTF-8"), u.a(stringExtra2), Base64.decode(stringExtra, 2))) {
                p.d("CommandWorker", " RSA验签通过  ");
                return true;
            }
        } catch (Exception e11) {
            p.a("CommandWorker", "checkIntentIsSecurity Exception: " + e11.getMessage());
        }
        p.d("CommandWorker", " RSA验签 不通过  ");
        return false;
    }

    private int d(Intent intent) {
        if (!TextUtils.isEmpty(this.f45067f) && this.f45067f.contains("CommandService") && (intent == null || !b(intent) || !c(intent))) {
            p.a("CommandWorker", " !checkIntentIsSecurity(intent)");
            return 2151;
        }
        String packageName = this.f45055a.getPackageName();
        try {
            String stringExtra = intent.getStringExtra("command_type");
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver")) {
                int intExtra = intent.getIntExtra(IntentConstant.COMMAND, -1);
                if (intExtra < 0) {
                    intExtra = intent.getIntExtra("method", -1);
                }
                if (f45065e.contains(Integer.valueOf(intExtra)) && t.c(this.f45055a, packageName) && !t.c(this.f45055a)) {
                    p.a("CommandWorker", "METHOD_ON_MESSAGE is not support");
                    return 2153;
                }
                String action = intent.getAction();
                if (!TextUtils.isEmpty(this.f45066d)) {
                    return 0;
                }
                String a11 = a(this.f45055a, packageName, action);
                this.f45066d = a11;
                if (!TextUtils.isEmpty(a11)) {
                    return 0;
                }
                p.d("CommandWorker", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                intent.setPackage(packageName);
                this.f45055a.sendBroadcast(intent);
                return 2152;
            }
            p.a("CommandWorker", "commandTypeStr is not satisfy == ".concat(String.valueOf(stringExtra)));
            return 2151;
        } catch (Exception e11) {
            p.a("CommandWorker", e11);
            return 0;
        }
    }

    public final void b() {
        this.f45066d = null;
    }

    @Override // com.vivo.push.q
    public final void b(Message message) {
        Context context;
        Intent intent = (Intent) message.obj;
        if (intent == null || (context = this.f45055a) == null) {
            p.d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f45055a);
            return;
        }
        String packageName = context.getPackageName();
        int d11 = d(intent);
        if (d11 <= 0) {
            try {
                Class<?> cls = Class.forName(this.f45066d);
                Object newInstance = cls.getConstructor(null).newInstance(null);
                Method method = cls.getMethod("onReceive", Context.class, Intent.class);
                intent.setClassName(packageName, this.f45066d);
                method.invoke(newInstance, ContextDelegate.getContext(this.f45055a).getApplicationContext(), intent);
                return;
            } catch (Exception e11) {
                p.b("CommandWorker", "reflect e: ", e11);
                return;
            }
        }
        x xVar = new x(d11);
        HashMap<String, String> hashMap = new HashMap<>();
        Bundle extras = intent.getExtras();
        hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(extras != null ? extras.getLong("notify_id", 404000044642424832L) : 404000044642424832L));
        String b11 = z.b(this.f45055a, packageName);
        if (!TextUtils.isEmpty(b11)) {
            hashMap.put("remoteAppId", b11);
        }
        xVar.a(hashMap);
        e.a().a(xVar);
    }

    public final void a(String str) {
        this.f45067f = str;
    }

    public final void a(Intent intent) {
        if (intent != null && this.f45055a != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            a(obtain);
        } else {
            p.d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f45055a);
        }
    }

    private static String a(Context context, String str, String str2) {
        List<ResolveInfo> queryBroadcastReceivers;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) == null || queryBroadcastReceivers.size() <= 0) {
                    return null;
                }
                return queryBroadcastReceivers.get(0).activityInfo.name;
            } catch (Exception e11) {
                p.a("CommandWorker", "error  " + e11.getMessage());
            }
        }
        return null;
    }

    private boolean b(Intent intent) {
        String stringExtra = intent.getStringExtra("security_avoid_pull");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                String b11 = com.vivo.push.util.a.a(this.f45055a).b(stringExtra);
                if ("com.vivo.pushservice".equals(b11)) {
                    return true;
                }
                p.a("CommandWorker", "!decrypt.equals, so decrypt == ".concat(String.valueOf(b11)));
                return false;
            } catch (Exception e11) {
                p.a("CommandWorker", "checkIntentIsSecurity Exception: " + e11.getMessage());
                return false;
            }
        }
        p.a("CommandWorker", "checkIntentIsSecurityTextUtils.isEmpty");
        return true;
    }
}
