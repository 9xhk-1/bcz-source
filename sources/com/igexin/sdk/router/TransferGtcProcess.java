package com.igexin.sdk.router;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.ProcessSwitchContract;
import com.getui.gtc.base.publish.Broker;
import com.getui.gtc.base.publish.Subscriber;
import com.igexin.push.core.a.c.i;
import com.igexin.push.f.h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class TransferGtcProcess implements Subscriber {
    public static final String POPUACTION_METHODNAME = "checkTopActivityInfo";
    public static final String TYPE145TASK_METHODNAME = "runInGtMainProcess";
    private static String methodName;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final TransferGtcProcess f38767a = new TransferGtcProcess();

        private a() {
        }
    }

    private Bundle createBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(ProcessSwitchContract.CLASS_NAME, getClass().getName());
        bundle.putString(ProcessSwitchContract.GET_INSTANCE, methodName);
        return bundle;
    }

    public static TransferGtcProcess getInstance() {
        methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return a.f38767a;
    }

    @Override // com.getui.gtc.base.publish.Subscriber
    public void receive(Bundle bundle, Bundle bundle2) {
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
            if (TYPE145TASK_METHODNAME.equals(string)) {
                Intent intent = (Intent) bundle.getParcelable("intent");
                h.a();
                h.a(GtcProvider.context(), intent);
            }
            if (POPUACTION_METHODNAME.equals(string)) {
                new i();
                bundle2.putSerializable("map", i.a(GtcProvider.context()));
            }
        } catch (Throwable th3) {
            try {
                arrayList.add(th3);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.igexin.c.a.c.a.a((Throwable) it.next());
                }
            } finally {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.igexin.c.a.c.a.a((Throwable) it2.next());
                }
            }
        }
    }

    public Bundle transferGtcProcess(Context context, Intent intent, String str) {
        GtcProvider.setContext(context);
        Bundle createBundle = createBundle();
        createBundle.putString(ProcessSwitchContract.METHOD_NAME, str);
        createBundle.putParcelable("intent", intent);
        return Broker.getInstance().subscribe(createBundle);
    }
}
