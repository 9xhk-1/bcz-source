package com.getui.gtc.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.getui.gtc.api.GtcIdCallback;
import com.getui.gtc.api.OnDycEnableChangedListener;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.ProcessSwitchContract;
import com.getui.gtc.base.publish.Broker;
import com.getui.gtc.base.publish.Subscriber;
import com.getui.gtc.base.util.BundleCompat;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.d.a;
import com.getui.gtc.dim.Caller;
import com.getui.gtc.dim.DimManager;
import com.getui.gtc.f.b;
import com.getui.gtc.i.c.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class GtcManager implements Subscriber {
    private static String methodName;

    public static class InstanceHolder {
        private static final GtcManager instance = new GtcManager();

        private InstanceHolder() {
        }
    }

    private GtcManager() {
    }

    private void checkSdkInfo(SdkInfo sdkInfo) {
        if (TextUtils.isEmpty(sdkInfo.getModuleName())) {
            a.c("moduleName not set for sdkinfo");
            throw new RuntimeException("moduleName not set for sdkinfo");
        }
        if (TextUtils.isEmpty(sdkInfo.getAppid())) {
            a.c("appid not set for sdkinfo");
            throw new RuntimeException("appid not set for sdkinfo");
        }
        if (TextUtils.isEmpty(sdkInfo.getVersion())) {
            a.c("version not set for sdkinfo");
            throw new RuntimeException("version not set for sdkinfo");
        }
    }

    private Bundle createBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(ProcessSwitchContract.CLASS_NAME, getClass().getName());
        bundle.putString(ProcessSwitchContract.GET_INSTANCE, methodName);
        return bundle;
    }

    private static Caller getFromTrace() {
        String className;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = GtcManager.class.getName();
            int i11 = -1;
            for (int i12 = 2; i12 < stackTrace.length; i12++) {
                if (!stackTrace[i12].getClassName().equals(name)) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    i11 = i12;
                }
            }
            className = stackTrace[i11 + 1].getClassName();
        } catch (Throwable th2) {
            a.c(th2);
        }
        if (className.startsWith("com.igexin")) {
            return Caller.PUSH;
        }
        if (className.startsWith("com.g.gysdk")) {
            return Caller.GY;
        }
        if (className.startsWith("com.getui.gs")) {
            return Caller.IDO;
        }
        if (className.startsWith("com.sdk.plus")) {
            return Caller.WUS;
        }
        return Caller.UNKNOWN;
    }

    public static GtcManager getInstance() {
        methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return InstanceHolder.instance;
    }

    public void addOnDycEnableChangedListener(Context context, OnDycEnableChangedListener.Stub stub) {
        if (CommonUtil.isGtcProcess()) {
            b.a().a(stub);
            return;
        }
        GtcProvider.setContext(context);
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "gtc-5-1");
        BundleCompat.putBinder(createBundle, "gtc-5-2", stub);
        Bundle subscribe = Broker.getInstance().subscribe(createBundle);
        if (subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION) != null) {
            a.c((Throwable) subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION));
        }
    }

    public ClassLoader getClassLoader(Bundle bundle) {
        return com.getui.gtc.g.b.a(bundle);
    }

    @Deprecated
    public void init(Context context, GtcIdCallback.Stub stub) {
        initialize(context, stub);
    }

    @Deprecated
    public String initialize(Context context, GtcIdCallback.Stub stub) {
        return initialize(context, getFromTrace(), stub);
    }

    public boolean loadBundle(Context context, Bundle bundle) {
        if (context != null) {
            GtcProvider.setContext(context.getApplicationContext());
        }
        return com.getui.gtc.g.b.a(context, bundle);
    }

    public void loadSdk(SdkInfo sdkInfo) {
        com.getui.gtc.d.a aVar;
        checkSdkInfo(sdkInfo);
        if (CommonUtil.isGtcProcess()) {
            aVar = a.C0349a.f29846a;
            aVar.a(sdkInfo);
            return;
        }
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "gtc-2-1");
        createBundle.putParcelable("gtc-2-2", sdkInfo);
        Bundle subscribe = Broker.getInstance().subscribe(createBundle);
        if (subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION) != null) {
            com.getui.gtc.i.c.a.c((Throwable) subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.getui.gtc.base.publish.Subscriber
    public void receive(Bundle bundle, Bundle bundle2) {
        com.getui.gtc.d.a aVar;
        com.getui.gtc.d.a aVar2;
        com.getui.gtc.d.a aVar3;
        com.getui.gtc.d.a aVar4;
        ArrayList arrayList = new ArrayList();
        try {
            Throwable th2 = (Throwable) bundle2.getSerializable(ProcessSwitchContract.METHOD_EXCEPTION);
            if (th2 != null) {
                arrayList.add(th2);
            }
            String string = bundle.getString(ProcessSwitchContract.METHOD_NAME);
            if (TextUtils.isEmpty(string)) {
                throw new RuntimeException("methodName missed");
            }
            switch (string.hashCode()) {
                case 337397854:
                    if (string.equals("gtc-1-1")) {
                        DimManager.getInstance().set("dim-2-2-3-1", "dim-2-2-3-1", bundle.getString("gtc-1-3"));
                        GtcIdCallback asInterface = GtcIdCallback.Stub.asInterface(BundleCompat.getBinder(bundle, "gtc-1-2"));
                        aVar = a.C0349a.f29846a;
                        bundle2.putString(ProcessSwitchContract.METHOD_RETURN, aVar.a(asInterface));
                        break;
                    }
                    break;
                case 337398815:
                    if (string.equals("gtc-2-1")) {
                        SdkInfo sdkInfo = (SdkInfo) bundle.getParcelable("gtc-2-2");
                        aVar2 = a.C0349a.f29846a;
                        aVar2.a(sdkInfo);
                        break;
                    }
                    break;
                case 337399776:
                    if (string.equals("gtc-3-1")) {
                        bundle.getString("gtc-3-2");
                        int[] intArray = bundle.getIntArray("gtc-3-3");
                        aVar3 = a.C0349a.f29846a;
                        aVar3.a(intArray);
                        break;
                    }
                    break;
                case 337400737:
                    if (string.equals("gtc-4-1")) {
                        int i11 = bundle.getInt("gtc-4-2");
                        aVar4 = a.C0349a.f29846a;
                        aVar4.a(i11);
                        break;
                    }
                    break;
                case 337401698:
                    if (string.equals("gtc-5-1")) {
                        b.a().a(OnDycEnableChangedListener.Stub.asInterface(BundleCompat.getBinder(bundle, "gtc-5-2")));
                        break;
                    }
                    break;
            }
        } catch (Throwable th3) {
            try {
                arrayList.add(th3);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.getui.gtc.i.c.a.b((Throwable) it.next());
                }
            } finally {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.getui.gtc.i.c.a.b((Throwable) it2.next());
                }
            }
        }
    }

    public void removeExt(String str, int[] iArr) {
        com.getui.gtc.d.a aVar;
        if (CommonUtil.isGtcProcess()) {
            aVar = a.C0349a.f29846a;
            aVar.a(iArr);
            return;
        }
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "gtc-3-1");
        createBundle.putString("gtc-3-2", str);
        createBundle.putIntArray("gtc-3-3", iArr);
        Bundle subscribe = Broker.getInstance().subscribe(createBundle);
        if (subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION) != null) {
            com.getui.gtc.i.c.a.c((Throwable) subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION));
        }
    }

    public void startType(int i11) {
        com.getui.gtc.d.a aVar;
        if (CommonUtil.isGtcProcess()) {
            aVar = a.C0349a.f29846a;
            aVar.a(i11);
            return;
        }
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "gtc-4-1");
        createBundle.putInt("gtc-4-2", i11);
        Broker.getInstance().subscribe(createBundle);
        Bundle subscribe = Broker.getInstance().subscribe(createBundle);
        if (subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION) != null) {
            com.getui.gtc.i.c.a.c((Throwable) subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION));
        }
    }

    public String initialize(Context context, Caller caller, GtcIdCallback.Stub stub) {
        com.getui.gtc.d.a aVar;
        if (CommonUtil.isGtcProcess()) {
            DimManager.getInstance().set("dim-2-2-3-1", "dim-2-2-3-1", caller != null ? caller.name() : null);
            aVar = a.C0349a.f29846a;
            return aVar.a(stub);
        }
        GtcProvider.setContext(context);
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, "gtc-1-1");
        createBundle.putString("gtc-1-3", caller != null ? caller.name() : null);
        BundleCompat.putBinder(createBundle, "gtc-1-2", stub);
        Bundle subscribe = Broker.getInstance().subscribe(createBundle);
        Object obj = subscribe.get(ProcessSwitchContract.METHOD_EXCEPTION);
        if (obj instanceof Throwable) {
            com.getui.gtc.i.c.a.a("initialize", (Throwable) obj);
        }
        return subscribe.getString(ProcessSwitchContract.METHOD_RETURN);
    }
}
