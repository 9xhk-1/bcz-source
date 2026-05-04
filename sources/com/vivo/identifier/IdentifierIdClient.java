package com.vivo.identifier;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import ct.d;

/* loaded from: classes6.dex */
public class IdentifierIdClient {
    private static final String AAID_FLAG = "AAID";
    private static final String ID_APPID = "appid";
    private static final String ID_TYPE = "type";
    private static final String OAID_FLAG = "OAID";
    private static final String SYS_IDENTIFIERID = "persist.sys.identifierid";
    private static final String SYS_IDENTIFIERID_SUPPORTED = "persist.sys.identifierid.supported";
    private static final String TAG = "VMS_SDK_Client";
    private static final int TIME_FOR_QUERY = 2000;
    private static final int TYPE_AAID = 2;
    private static final int TYPE_OAID = 0;
    private static final int TYPE_OAIDSTATUS = 4;
    private static final int TYPE_QUERY = 11;
    private static final int TYPE_VAID = 1;
    private static final String URI_BASE = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String VAID_FLAG = "VAID";
    private static final int VERSION_P = 28;
    private static final int VERSION_Q = 29;
    private static String mAAID = null;
    private static IdentifierIdObserver mAAIDObserver = null;
    private static Context mContext = null;
    private static volatile DataBaseOperation mDatabase = null;
    private static volatile IdentifierIdClient mInstance = null;
    private static boolean mIsSupported = false;
    private static Object mLock = new Object();
    private static String mOAID;
    private static IdentifierIdObserver mOAIDObserver;
    private static String mOAIDStatus;
    private static Handler mSqlHandler;
    private static HandlerThread mSqlThread;
    private static String mVAID;
    private static IdentifierIdObserver mVAIDObserver;

    private IdentifierIdClient() {
        initSqlThread();
        mDatabase = new DataBaseOperation(mContext);
    }

    private static void checkSupported() {
        mIsSupported = "1".equals(getProperty("persist.sys.identifierid.supported", "0")) || "1".equals(getProperty(SYS_IDENTIFIERID, "0"));
    }

    public static IdentifierIdClient getInstance(Context context) {
        if (!isSupported()) {
            return null;
        }
        if (mContext == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            mContext = context;
        }
        if (mInstance == null) {
            synchronized (IdentifierIdClient.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new IdentifierIdClient();
                    }
                } finally {
                }
            }
        }
        return mInstance;
    }

    private static String getProperty(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod(d.f46852f, String.class, String.class).invoke(cls, str, "0");
            } catch (Exception unused) {
                IdentifierIdLog.e(TAG, "getProperty: invoke is error");
                return str2;
            }
        } catch (Throwable unused2) {
            return str2;
        }
    }

    private static synchronized void initObserver(Context context, int i11, String str) {
        ContentResolver contentResolver;
        Uri parse;
        IdentifierIdObserver identifierIdObserver;
        synchronized (IdentifierIdClient.class) {
            try {
                String packageName = context.getPackageName();
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2 && mAAIDObserver == null) {
                            if (Build.VERSION.SDK_INT == 28) {
                                mAAIDObserver = new IdentifierIdObserver(mInstance, 2, str);
                                context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, mAAIDObserver);
                            }
                            mAAIDObserver = new IdentifierIdObserver(mInstance, 2, packageName);
                            contentResolver = context.getContentResolver();
                            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/" + packageName);
                            identifierIdObserver = mAAIDObserver;
                            contentResolver.registerContentObserver(parse, false, identifierIdObserver);
                        }
                    } else if (mVAIDObserver == null) {
                        if (Build.VERSION.SDK_INT == 28) {
                            mVAIDObserver = new IdentifierIdObserver(mInstance, 1, str);
                            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, mVAIDObserver);
                        }
                        mVAIDObserver = new IdentifierIdObserver(mInstance, 1, packageName);
                        contentResolver = context.getContentResolver();
                        parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + packageName);
                        identifierIdObserver = mVAIDObserver;
                        contentResolver.registerContentObserver(parse, false, identifierIdObserver);
                    }
                } else if (mOAIDObserver == null) {
                    mOAIDObserver = new IdentifierIdObserver(mInstance, 0, null);
                    context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, mOAIDObserver);
                }
            } finally {
            }
        }
    }

    private static void initSqlThread() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        mSqlThread = handlerThread;
        handlerThread.start();
        mSqlHandler = new Handler(mSqlThread.getLooper()) { // from class: com.vivo.identifier.IdentifierIdClient.1
            @Override // android.os.Handler
            public native void handleMessage(Message message);
        };
    }

    public static boolean isSupported() {
        if (!mIsSupported) {
            checkSupported();
        }
        return mIsSupported;
    }

    private void queryId(int i11, String str) {
        synchronized (mLock) {
            sendMessageToDataBase(i11, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                mLock.wait(2000L);
            } catch (InterruptedException unused) {
                IdentifierIdLog.e(TAG, "queryId: lock error");
            }
            if (SystemClock.uptimeMillis() - uptimeMillis > 2000) {
                IdentifierIdLog.d(TAG, "query timeout");
            }
        }
    }

    public String getAAID() {
        if (Build.VERSION.SDK_INT == 28) {
            return null;
        }
        String str = mAAID;
        if (str != null) {
            return str;
        }
        String packageName = mContext.getPackageName();
        queryId(2, packageName);
        if (mAAIDObserver == null && mAAID != null) {
            initObserver(mContext, 2, packageName);
        }
        return mAAID;
    }

    public String getOAID() {
        String str = mOAID;
        if (str != null) {
            return str;
        }
        queryId(0, null);
        if (mOAIDObserver == null) {
            initObserver(mContext, 0, null);
        }
        return mOAID;
    }

    public String getOAIDSTATUS() {
        queryId(4, null);
        return mOAIDStatus;
    }

    public String getVAID() {
        if (Build.VERSION.SDK_INT == 28) {
            return null;
        }
        String str = mVAID;
        if (str != null) {
            return str;
        }
        String packageName = mContext.getPackageName();
        queryId(1, packageName);
        if (mVAIDObserver == null && mVAID != null) {
            initObserver(mContext, 1, packageName);
        }
        return mVAID;
    }

    public void sendMessageToDataBase(int i11, String str) {
        Message obtainMessage = mSqlHandler.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i11);
        if (i11 == 1 || i11 == 2) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        mSqlHandler.sendMessage(obtainMessage);
    }

    public String getAAID(String str) {
        String str2 = mAAID;
        if (str2 != null) {
            return str2;
        }
        queryId(2, str);
        if (mAAIDObserver == null && mAAID != null) {
            initObserver(mContext, 2, str);
        }
        return mAAID;
    }

    public String getVAID(String str) {
        String str2 = mVAID;
        if (str2 != null) {
            return str2;
        }
        queryId(1, str);
        if (mVAIDObserver == null && mVAID != null) {
            initObserver(mContext, 1, str);
        }
        return mVAID;
    }
}
