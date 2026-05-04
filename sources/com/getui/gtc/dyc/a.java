package com.getui.gtc.dyc;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.getui.gtc.base.ProcessSwitchContract;
import com.getui.gtc.base.publish.Broker;
import com.getui.gtc.base.publish.Subscriber;
import com.getui.gtc.base.util.BundleCompat;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.dyc.Callback;
import com.getui.gtc.dyc.b.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class a implements Subscriber {

    /* renamed from: a, reason: collision with root package name */
    private static String f29972a;

    /* renamed from: com.getui.gtc.dyc.a$a, reason: collision with other inner class name */
    public static class C0355a {

        /* renamed from: a, reason: collision with root package name */
        private static a f29977a = new a();
    }

    private a() {
    }

    public static a a() {
        f29972a = Thread.currentThread().getStackTrace()[2].getMethodName();
        return C0355a.f29977a;
    }

    private Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putString(ProcessSwitchContract.CLASS_NAME, getClass().getName());
        bundle.putString(ProcessSwitchContract.GET_INSTANCE, f29972a);
        return bundle;
    }

    public Map<String, Map<String, String>> c() {
        if (CommonUtil.isGtcProcess()) {
            return f.a().c();
        }
        Bundle d11 = d();
        d11.putString(ProcessSwitchContract.METHOD_NAME, "dyc-3-1");
        return (Map) Broker.getInstance().subscribe(d11).get(ProcessSwitchContract.METHOD_RETURN);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.getui.gtc.base.publish.Subscriber
    public void receive(Bundle bundle, Bundle bundle2) {
        Object a11;
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
                case 2112999862:
                    if (string.equals("dyc-1-1")) {
                        b bVar = (b) bundle.getParcelable("dyc-1-2");
                        final Callback a12 = Callback.a.a(BundleCompat.getBinder(bundle, "dyc-1-3"));
                        if (a12 != null) {
                            bVar.i(new com.getui.gtc.dyc.b.c() { // from class: com.getui.gtc.dyc.a.1
                                @Override // com.getui.gtc.dyc.b.c
                                public void a(Map<String, String> map, Map<String, String> map2) {
                                    try {
                                        a12.a(map, map2);
                                    } catch (RemoteException e11) {
                                        com.getui.gtc.dyc.a.a.a.a(e11);
                                    }
                                }

                                @Override // com.getui.gtc.dyc.b.c
                                public void b(String str) {
                                    try {
                                        a12.b(str);
                                    } catch (RemoteException e11) {
                                        com.getui.gtc.dyc.a.a.a.a(e11);
                                    }
                                }
                            });
                        }
                        a11 = a(bVar);
                        bundle2.putSerializable(ProcessSwitchContract.METHOD_RETURN, (Serializable) a11);
                        break;
                    }
                    break;
                case 2113000823:
                    if (string.equals("dyc-2-1")) {
                        a11 = a(bundle.getString("dyc-2-2"));
                        bundle2.putSerializable(ProcessSwitchContract.METHOD_RETURN, (Serializable) a11);
                        break;
                    }
                    break;
                case 2113001784:
                    if (string.equals("dyc-3-1")) {
                        a11 = c();
                        bundle2.putSerializable(ProcessSwitchContract.METHOD_RETURN, (Serializable) a11);
                        break;
                    }
                    break;
                case 2113002745:
                    if (string.equals("dyc-4-1")) {
                        a(bundle.getString("dyc-4-2"), (HashMap) bundle.getSerializable("dyc-4-3"));
                        break;
                    }
                    break;
            }
        } catch (Throwable th3) {
            try {
                arrayList.add(th3);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.getui.gtc.dyc.a.a.a.a((Throwable) it.next());
                }
            } finally {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.getui.gtc.dyc.a.a.a.a((Throwable) it2.next());
                }
            }
        }
    }

    public Map<String, String> a(final b bVar) {
        if (CommonUtil.isGtcProcess()) {
            return f.a().a(bVar);
        }
        Bundle d11 = d();
        d11.putString(ProcessSwitchContract.METHOD_NAME, "dyc-1-1");
        d11.putParcelable("dyc-1-2", bVar);
        if (bVar.i() != null) {
            BundleCompat.putBinder(d11, "dyc-1-3", new Callback.a() { // from class: com.getui.gtc.dyc.a.2
                @Override // com.getui.gtc.dyc.Callback
                public void a(Map map, Map map2) throws RemoteException {
                    bVar.i().a(map, map2);
                }

                @Override // com.getui.gtc.dyc.Callback
                public void b(String str) throws RemoteException {
                    bVar.i().b(str);
                }
            });
        }
        return (Map) Broker.getInstance().subscribe(d11).get(ProcessSwitchContract.METHOD_RETURN);
    }

    public Map<String, String> a(String str) {
        if (CommonUtil.isGtcProcess()) {
            return f.a().a(str);
        }
        Bundle d11 = d();
        d11.putString(ProcessSwitchContract.METHOD_NAME, "dyc-2-1");
        d11.putString("dyc-2-2", str);
        return (Map) Broker.getInstance().subscribe(d11).get(ProcessSwitchContract.METHOD_RETURN);
    }

    public void a(String str, Map<String, String> map) {
        if (CommonUtil.isGtcProcess()) {
            f.a().a(str, map);
            return;
        }
        Bundle d11 = d();
        d11.putString(ProcessSwitchContract.METHOD_NAME, "dyc-4-1");
        d11.putString("dyc-4-2", str);
        d11.putSerializable("dyc-4-3", (HashMap) map);
        Broker.getInstance().subscribe(d11);
    }
}
