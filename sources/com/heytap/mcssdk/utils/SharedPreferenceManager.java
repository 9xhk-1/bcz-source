package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SharedPreferenceManager {
    private static final String DECRYPT_TAG = "decryptTag";
    private static final String HAS_DEFAULT_CHANNEL_CREATED = "hasDefaultChannelCreated";
    private static final String SHARED_PREFS_NAME = "shared_msg_sdk";
    private static final String STATIC_INFOMATION_SDK_VERSION = "lastUpLoadInfoSDKVersionName";
    private static final String STATIC_INFOMATION_UNIQUE_ID = "lastUploadInfoUniqueID";
    private Context mContext;
    private SharedPreferences mSharedPrefs;
    private Object prefsLock;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SharedPreferenceManagerInstanceHolder {
        static SharedPreferenceManager INSTANCE = new SharedPreferenceManager();

        private SharedPreferenceManagerInstanceHolder() {
        }
    }

    public static SharedPreferenceManager getInstance() {
        return SharedPreferenceManagerInstanceHolder.INSTANCE;
    }

    private SharedPreferences getSharedPrefs() {
        Context context;
        SharedPreferences sharedPreferences = this.mSharedPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.prefsLock) {
            try {
                SharedPreferences sharedPreferences2 = this.mSharedPrefs;
                if (sharedPreferences2 != null || (context = this.mContext) == null) {
                    return sharedPreferences2;
                }
                SharedPreferences sharedPreferences3 = context.getSharedPreferences(SHARED_PREFS_NAME, 0);
                this.mSharedPrefs = sharedPreferences3;
                return sharedPreferences3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Context getStorageContext(Context context) {
        boolean isFBEVersion = ApkInfoUtil.isFBEVersion();
        LogUtil.d("fbeVersion is " + isFBEVersion);
        return isFBEVersion ? context.createDeviceProtectedStorageContext() : context.getApplicationContext();
    }

    public String getDecryptTag() {
        SharedPreferences sharedPrefs = getSharedPrefs();
        return sharedPrefs != null ? sharedPrefs.getString(DECRYPT_TAG, "DES") : "DES";
    }

    public int getIntData(String str) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            return sharedPrefs.getInt(str, 0);
        }
        return 0;
    }

    public String getLastUpdataUniqueID() {
        SharedPreferences sharedPrefs = getSharedPrefs();
        return sharedPrefs != null ? sharedPrefs.getString(STATIC_INFOMATION_UNIQUE_ID, "") : "";
    }

    public String getLastUploadInfoSDKVersion() {
        SharedPreferences sharedPrefs = getSharedPrefs();
        return sharedPrefs != null ? sharedPrefs.getString(STATIC_INFOMATION_SDK_VERSION, "") : "";
    }

    public long getLongData(String str) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        return sharedPrefs != null ? sharedPrefs.getLong(str, Constants.UNKNOWN_LONG.longValue()) : Constants.UNKNOWN_LONG.longValue();
    }

    public boolean hasDefaultChannelCreated() {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            return sharedPrefs.getBoolean(HAS_DEFAULT_CHANNEL_CREATED, false);
        }
        return false;
    }

    public void saveDecryptTag(String str) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            sharedPrefs.edit().putString(DECRYPT_TAG, str).commit();
        }
    }

    public void saveLastUploadUniqueID(String str) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            sharedPrefs.edit().putString(STATIC_INFOMATION_UNIQUE_ID, str).commit();
        }
    }

    public void saveSDKVersionName() {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            sharedPrefs.edit().putString(STATIC_INFOMATION_SDK_VERSION, "3.1.0").commit();
        }
    }

    public void setHasDefaultChannelCreated(boolean z11) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            sharedPrefs.edit().putBoolean(HAS_DEFAULT_CHANNEL_CREATED, z11).commit();
        }
    }

    public void setIntData(String str, int i11) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.putInt(str, i11);
            edit.apply();
        }
    }

    public void setLongData(String str, long j11) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor edit = sharedPrefs.edit();
            edit.putLong(str, j11);
            edit.apply();
        }
    }

    private SharedPreferenceManager() {
        this.prefsLock = new Object();
        Context context = PushService.getInstance().getContext();
        if (context != null) {
            this.mContext = getStorageContext(context);
        }
        Context context2 = this.mContext;
        if (context2 != null) {
            this.mSharedPrefs = context2.getSharedPreferences(SHARED_PREFS_NAME, 0);
        }
    }

    public int getIntData(String str, int i11) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        return sharedPrefs != null ? sharedPrefs.getInt(str, i11) : i11;
    }

    public long getLongData(String str, long j11) {
        SharedPreferences sharedPrefs = getSharedPrefs();
        return sharedPrefs != null ? sharedPrefs.getLong(str, j11) : j11;
    }
}
