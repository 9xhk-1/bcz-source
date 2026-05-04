package com.getui.gtc.dim;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.ProcessSwitchContract;
import com.getui.gtc.base.publish.Broker;
import com.getui.gtc.base.publish.Subscriber;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.dim.DimRequest;
import com.getui.gtc.dim.a;
import com.getui.gtc.dim.b.g;
import com.getui.gtc.dim.e.b;
import com.getui.gtc.dim.e.c;
import com.huawei.hms.android.SystemUtils;
import ct.d;
import java.io.File;

/* loaded from: classes6.dex */
public class DimManager implements Subscriber {
    private static String methodName;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final DimManager f29847a = new DimManager();
    }

    private DimManager() {
    }

    private Bundle createBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(ProcessSwitchContract.CLASS_NAME, getClass().getName());
        bundle.putString(ProcessSwitchContract.GET_INSTANCE, methodName);
        return bundle;
    }

    public static DimManager getInstance() {
        methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return a.f29847a;
    }

    private void notifyGdiLoadSuccess(Class<?> cls) {
        g d11 = g.d();
        if (cls != null) {
            try {
                if (cls.getName().equals(new String(Base64.decode("Y29tLmdldHVpLmd0Yy5leHRlbnNpb24uZGlzdHJpYnV0aW9uLmdkaS5zdHViLlB1c2hFeHRlbnNpb24=", 2)))) {
                    d11.f29910g = cls.getDeclaredMethod(d.f46852f, Bundle.class);
                    d11.f29911h = cls.getDeclaredMethod("updateRuntimeData", String.class);
                    return;
                }
            } catch (Throwable th2) {
                b.b(th2);
                return;
            }
        }
        throw new IllegalArgumentException("not support class:".concat(String.valueOf(cls)));
    }

    public Object get(DimRequest dimRequest) {
        com.getui.gtc.dim.a aVar;
        if (!CommonUtil.isGtcProcess()) {
            Bundle createBundle = createBundle();
            createBundle.putString(ProcessSwitchContract.METHOD_NAME, "dim-1-1-1");
            createBundle.putParcelable("dim-1-1-2", dimRequest);
            Object obj = Broker.getInstance().subscribe(createBundle).get(ProcessSwitchContract.METHOD_RETURN);
            if (!(obj instanceof File)) {
                return obj;
            }
            try {
                byte[] a11 = c.a((File) obj);
                ((File) obj).delete();
                return c.a(a11);
            } catch (Throwable unused) {
                return null;
            }
        }
        aVar = a.C0350a.f29855a;
        Object a12 = aVar.a(dimRequest, true);
        try {
            if ((a12 instanceof String) && "dim-2-1-5-1".equals(dimRequest.getKey())) {
                String str = (String) a12;
                if (SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(Build.MANUFACTURER) && str.contains("#")) {
                    String[] split = str.split("#");
                    if (split.length == 2) {
                        if (!TextUtils.isEmpty(split[1])) {
                            return split[1];
                        }
                        if (!TextUtils.isEmpty(split[0])) {
                            return split[0];
                        }
                    }
                }
            }
            return a12;
        } catch (Throwable th2) {
            b.a(th2);
            return a12;
        }
    }

    public int getCallers() {
        if (CommonUtil.isGtcProcess()) {
            return g.d().c();
        }
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "dim-1-3-1");
        return Broker.getInstance().subscribe(createBundle).getInt(ProcessSwitchContract.METHOD_RETURN);
    }

    public Object getSetting(String str, String str2) {
        com.getui.gtc.dim.a aVar;
        if (CommonUtil.isGtcProcess()) {
            aVar = a.C0350a.f29855a;
            return aVar.b(str, str2);
        }
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "dim-1-5-1");
        createBundle.putString("dim-1-5-2", str);
        createBundle.putString("dim-1-5-3", str2);
        return Broker.getInstance().subscribe(createBundle).getSerializable(ProcessSwitchContract.METHOD_RETURN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106 A[DONT_GENERATE, LOOP:0: B:43:0x0100->B:45:0x0106, LOOP_END] */
    @Override // com.getui.gtc.base.publish.Subscriber
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receive(android.os.Bundle r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.DimManager.receive(android.os.Bundle, android.os.Bundle):void");
    }

    public void set(String str, String str2, String str3) {
        com.getui.gtc.dim.a aVar;
        if (CommonUtil.isGtcProcess()) {
            aVar = a.C0350a.f29855a;
            aVar.a(str, str3);
            return;
        }
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "dim-1-2-1");
        createBundle.putString("dim-1-2-2", str);
        createBundle.putString("dim-1-2-3", str2);
        createBundle.putString("dim-1-2-4", str3);
        Broker.getInstance().subscribe(createBundle);
    }

    public boolean setAppDataProvider(Context context, AppDataProvider appDataProvider) {
        if (context == null) {
            Log.e("DimManager", "setAppDataProvider failed,because context==null");
            return false;
        }
        GtcProvider.setContext(context);
        g.d().a(appDataProvider);
        return true;
    }

    public boolean setSetting(Context context, String str, String str2, String str3) {
        com.getui.gtc.dim.a aVar;
        if (context == null || str == null) {
            return false;
        }
        if (CommonUtil.isGtcProcess()) {
            aVar = a.C0350a.f29855a;
            return aVar.a(str, str2, str3);
        }
        GtcProvider.setContext(context);
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "dim-1-4-1");
        createBundle.putString("dim-1-4-2", str);
        createBundle.putString("dim-1-4-3", str2);
        createBundle.putString("dim-1-4-4", str3);
        return Broker.getInstance().subscribe(createBundle).getBoolean(ProcessSwitchContract.METHOD_RETURN);
    }

    @Deprecated
    public Object get(String str) {
        return get(new DimRequest.Builder().key(str).build());
    }
}
