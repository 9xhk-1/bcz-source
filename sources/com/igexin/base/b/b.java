package com.igexin.base.b;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private Context f37055a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f37056b;

    public b(Context context, String str) {
        this.f37055a = context;
        this.f37056b = context.getSharedPreferences(str, 0);
    }

    @Override // com.igexin.base.b.a
    public final Object getParam(String str, Object obj) {
        SharedPreferences sharedPreferences = this.f37056b;
        if (sharedPreferences != null) {
            if (obj instanceof String) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if (obj instanceof Integer) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if (obj instanceof Boolean) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (obj instanceof Float) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if (obj instanceof Long) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
        }
        return obj;
    }

    @Override // com.igexin.base.b.a
    public final boolean remove(String str) {
        SharedPreferences.Editor edit = this.f37056b.edit();
        edit.remove(str);
        edit.commit();
        return false;
    }

    @Override // com.igexin.base.b.a
    public final boolean saveParam(String str, Object obj) {
        if (obj == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.f37056b.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        return edit.commit();
    }
}
