package com.huawei.hms.api;

import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class FailedBinderCallBack {
    private static final long AGING_TIME = 10000;
    public static final String CALLER_ID = "callId";
    private static final String TAG = "FailedBinderCallBack";
    private static FailedBinderCallBack instance;
    private static Map<Long, BinderCallBack> binderCallBackMap = new ConcurrentHashMap();
    private static final Object LOCK_OBJECT = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface BinderCallBack {
        void binderCallBack(int i11);
    }

    private FailedBinderCallBack() {
    }

    private void agingCheck() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10000;
        for (Long l11 : binderCallBackMap.keySet()) {
            if (time >= l11.longValue()) {
                binderCallBackMap.remove(l11);
            }
        }
    }

    public static FailedBinderCallBack getInstance() {
        synchronized (LOCK_OBJECT) {
            try {
                if (instance == null) {
                    instance = new FailedBinderCallBack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return instance;
    }

    private void putCallBackInMap(Long l11, BinderCallBack binderCallBack) {
        if (binderCallBackMap == null) {
            HMSLog.e(TAG, "binderCallBackMap is null");
        } else {
            agingCheck();
            binderCallBackMap.put(l11, binderCallBack);
        }
    }

    public BinderCallBack getCallBack(Long l11) {
        Map<Long, BinderCallBack> map = binderCallBackMap;
        if (map != null) {
            return map.remove(l11);
        }
        HMSLog.e(TAG, "binderCallBackMap is null");
        return null;
    }

    public void setCallBack(Long l11, BinderCallBack binderCallBack) {
        putCallBackInMap(l11, binderCallBack);
    }
}
