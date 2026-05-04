package com.getui.gtc.dim.c;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import s.n;

/* loaded from: classes6.dex */
public final class e {
    private static Object a(Parcel parcel) {
        try {
            int dataPosition = parcel.dataPosition();
            int readInt = parcel.readInt();
            parcel.setDataPosition(dataPosition);
            if (readInt > 100) {
                return null;
            }
            Class<?> cls = Class.forName("android.net.wifi.WifiSsid");
            return ((Parcelable.Creator) cls.getDeclaredField("CREATOR").get(cls)).createFromParcel(parcel);
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a("getWifiSsid", th2);
            return null;
        }
    }

    private static String b(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Method declaredMethod = cls.getDeclaredMethod("getHexString", null);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(obj, null);
            }
            Method declaredMethod2 = cls.getDeclaredMethod("getOctets", null);
            declaredMethod2.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod2.invoke(obj, null);
            String str = "0x";
            for (byte b11 : bArr) {
                str = str + String.format(Locale.US, "%02x", Byte.valueOf(b11));
            }
            return bArr.length > 0 ? str : "<unknown ssid>";
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a("getHexString ", th2);
            return "<unknown ssid>";
        }
    }

    public static String a(WifiInfo wifiInfo) throws JSONException {
        JSONObject jSONObject;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            Parcel obtain = Parcel.obtain();
            try {
                wifiInfo.writeToParcel(obtain, 0);
                boolean z11 = false;
                while (i11 >= 28 && i11 <= 33) {
                    obtain.setDataPosition(0);
                    obtain.readInt();
                    obtain.readInt();
                    obtain.readInt();
                    if (i11 >= 29) {
                        obtain.readInt();
                        obtain.readInt();
                    }
                    if (z11) {
                        obtain.readInt();
                    }
                    obtain.readInt();
                    if (obtain.readByte() == 1) {
                        obtain.createByteArray();
                    }
                    Object a11 = obtain.readInt() == 1 ? a(obtain) : null;
                    if (!z11 && a11 == null) {
                        z11 = true;
                    }
                    jSONObject = new JSONObject();
                    if (a11 != null) {
                        jSONObject.put("BSSID", obtain.readString());
                    }
                    jSONObject.put(n.f.f87059b, a(a11));
                    obtain.recycle();
                }
                throw new UnsupportedOperationException("cannot read wifiInfo,API>33");
            } finally {
                obtain.recycle();
            }
        }
        jSONObject = b(wifiInfo);
        jSONObject.put("rssi", wifiInfo.getRssi());
        jSONObject.put("toString", wifiInfo.toString());
        return jSONObject.toString();
    }

    @SuppressLint({"SoonBlockedPrivateApi", "DiscouragedPrivateApi"})
    private static JSONObject b(WifiInfo wifiInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            Field declaredField = WifiInfo.class.getDeclaredField("mBSSID");
            declaredField.setAccessible(true);
            Field declaredField2 = WifiInfo.class.getDeclaredField("mWifiSsid");
            declaredField2.setAccessible(true);
            jSONObject.put("BSSID", declaredField.get(wifiInfo));
            jSONObject.put(n.f.f87059b, a(declaredField2.get(wifiInfo)));
            return jSONObject;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a("wifiInfo getBelow28", th2);
            return jSONObject;
        }
    }

    private static String a(Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                return "\"" + obj2 + "\"";
            }
            String b11 = b(obj);
            if (b11 != null) {
                return b11;
            }
        }
        return "<unknown ssid>";
    }
}
