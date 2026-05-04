package com.baicizhan.client.business.util;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ActivityLifeController {
    private static final String TAG = "ActivityLifeController";
    private final List<WeakReference<Activity>> mReferences = new LinkedList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ActivityFinishInstance {
        public static ActivityLifeController sInstance = new ActivityLifeController();

        private ActivityFinishInstance() {
        }
    }

    public static ActivityLifeController get() {
        return ActivityFinishInstance.sInstance;
    }

    public void finishAll() {
        Iterator<WeakReference<Activity>> it = this.mReferences.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity != null) {
                qb.c.b(TAG, "finishAll: " + activity, new Object[0]);
                activity.finish();
            } else {
                it.remove();
            }
        }
    }

    public void register(Activity activity) {
        this.mReferences.add(new WeakReference<>(activity));
    }

    public void unregister(Activity activity) {
        qb.c.b(TAG, "unregister: begin: " + this.mReferences.size(), new Object[0]);
        Iterator<WeakReference<Activity>> it = this.mReferences.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Activity activity2 = it.next().get();
            if (activity2 != null && activity2.equals(activity)) {
                it.remove();
                break;
            }
        }
        qb.c.b(TAG, "unregister: end: " + this.mReferences.size(), new Object[0]);
    }
}
