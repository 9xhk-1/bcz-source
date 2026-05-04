package com.huawei.hms.aaid.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PushPreferences {
    public static final String TAG = "PushPreferences";

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f35231a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PushPreferences(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L3f
            android.content.Context r0 = r5.createDeviceProtectedStorageContext()
            java.lang.String r1 = "move_to_de_records"
            r2 = 0
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r2)
            boolean r3 = r1.getBoolean(r6, r2)
            if (r3 != 0) goto L28
            boolean r3 = r0.moveSharedPreferencesFrom(r5, r6)
            if (r3 != 0) goto L1d
            goto L29
        L1d:
            android.content.SharedPreferences$Editor r5 = r1.edit()
            r1 = 1
            r5.putBoolean(r6, r1)
            r5.apply()
        L28:
            r5 = r0
        L29:
            android.content.SharedPreferences r0 = r4.b(r5, r6)
            r4.f35231a = r0
            if (r0 != 0) goto L3e
            java.lang.String r0 = "PushPreferences"
            java.lang.String r1 = "get new sharedPreferences failed,start to get from context. "
            com.huawei.hms.support.log.HMSLog.w(r0, r1)
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r2)
            r4.f35231a = r5
        L3e:
            return
        L3f:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "context is null!"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.aaid.utils.PushPreferences.<init>(android.content.Context, java.lang.String):void");
    }

    public final File a(Context context, String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getDataDir());
            sb2.append("/shared_prefs");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(".xml");
            File file = new File(sb3, sb4.toString());
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception e11) {
            HMSLog.e(TAG, "get failed error." + e11.getMessage());
            return null;
        }
    }

    public final SharedPreferences b(Context context, String str) {
        File a11 = a(context, str);
        if (a11 == null) {
            return null;
        }
        try {
            Constructor<?> declaredConstructor = Class.forName("android.app.SharedPreferencesImpl").getDeclaredConstructor(File.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return (SharedPreferences) declaredConstructor.newInstance(a11, 0);
        } catch (Exception e11) {
            HMSLog.e(TAG, "get SharedPreferences error." + e11.getMessage());
            return null;
        }
    }

    public boolean clear() {
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences != null) {
            return sharedPreferences.edit().clear().commit();
        }
        return false;
    }

    public boolean containsKey(String str) {
        SharedPreferences sharedPreferences = this.f35231a;
        return sharedPreferences != null && sharedPreferences.contains(str);
    }

    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.f35231a;
        return sharedPreferences != null ? sharedPreferences.getAll() : new HashMap();
    }

    public boolean getBoolean(String str) {
        SharedPreferences sharedPreferences = this.f35231a;
        return sharedPreferences != null && sharedPreferences.getBoolean(str, false);
    }

    public int getInt(String str) {
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public long getLong(String str) {
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public String getString(String str) {
        SharedPreferences sharedPreferences = this.f35231a;
        return sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
    }

    public ContentValues read() {
        Map<String, ?> all;
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                contentValues.put(key, String.valueOf(value));
            } else if ((value instanceof Integer) || (value instanceof Short) || (value instanceof Byte)) {
                contentValues.put(key, (Integer) value);
            } else if (value instanceof Long) {
                contentValues.put(key, (Long) value);
            } else if (value instanceof Float) {
                contentValues.put(key, (Float) value);
            } else if (value instanceof Double) {
                contentValues.put(key, Float.valueOf((float) ((Double) value).doubleValue()));
            } else if (value instanceof Boolean) {
                contentValues.put(key, (Boolean) value);
            }
        }
        return contentValues;
    }

    public boolean removeKey(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (edit = this.f35231a.edit()) == null) {
            return false;
        }
        return edit.remove(str).commit();
    }

    public boolean save(String str, Object obj) {
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj instanceof String) {
            edit.putString(str, String.valueOf(obj));
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            edit.putInt(str, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            edit.putInt(str, ((Byte) obj).byteValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            edit.putFloat(str, (float) ((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        }
        return edit.commit();
    }

    public void saveBoolean(String str, boolean z11) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putBoolean(str, z11).commit();
    }

    public void saveInt(String str, Integer num) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putInt(str, num.intValue()).commit();
    }

    public void saveLong(String str, Long l11) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putLong(str, l11.longValue()).commit();
    }

    public void saveMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            save(entry.getKey(), entry.getValue());
        }
    }

    public boolean saveString(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f35231a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.putString(str, str2).commit();
    }

    public boolean write(ContentValues contentValues) {
        if (this.f35231a == null || contentValues == null) {
            return false;
        }
        boolean z11 = true;
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            if (!save(entry.getKey(), entry.getValue())) {
                z11 = false;
            }
        }
        return z11;
    }

    public boolean removeKey(String[] strArr) {
        if (this.f35231a == null) {
            return false;
        }
        for (String str : strArr) {
            if (this.f35231a.contains(str)) {
                this.f35231a.edit().remove(str);
            }
        }
        this.f35231a.edit().commit();
        return true;
    }
}
