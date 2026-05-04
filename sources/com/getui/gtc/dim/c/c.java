package com.getui.gtc.dim.c;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c {
    private static int a(String str) {
        Parcel obtain = Parcel.obtain();
        try {
            TextUtils.writeToParcel(str, obtain, 0);
            return obtain.dataPosition() - 4;
        } finally {
            obtain.recycle();
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static JSONObject b(Location location) {
        JSONObject jSONObject = new JSONObject();
        try {
            Field declaredField = Location.class.getDeclaredField("mLatitude");
            declaredField.setAccessible(true);
            Field declaredField2 = Location.class.getDeclaredField("mLongitude");
            declaredField2.setAccessible(true);
            Field declaredField3 = Location.class.getDeclaredField("mAltitude");
            declaredField3.setAccessible(true);
            jSONObject.put("latitude", declaredField.getDouble(location));
            jSONObject.put("longitude", declaredField2.getDouble(location));
            jSONObject.put("altitude", declaredField3.getDouble(location));
            return jSONObject;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a("location getBelow28", th2);
            return jSONObject;
        }
    }

    public static String a(Location location) throws JSONException {
        double readDouble;
        boolean hasElapsedRealtimeUncertaintyNanos;
        double readDouble2;
        double d11;
        JSONObject jSONObject;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            jSONObject = b(location);
        } else {
            Parcel obtain = Parcel.obtain();
            try {
                location.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                if (i11 == 28) {
                    obtain.readString();
                    obtain.readLong();
                    obtain.readLong();
                    obtain.readByte();
                    readDouble = obtain.readDouble();
                } else {
                    if (i11 != 29 && i11 != 30) {
                        if (i11 < 31 || i11 > 33) {
                            throw new UnsupportedOperationException("cannot read location,API>33");
                        }
                        if (i11 != 33) {
                            obtain.readString();
                        } else {
                            obtain.setDataPosition(a(location.getProvider()));
                        }
                        obtain.readInt();
                        obtain.readLong();
                        obtain.readLong();
                        hasElapsedRealtimeUncertaintyNanos = location.hasElapsedRealtimeUncertaintyNanos();
                        if (hasElapsedRealtimeUncertaintyNanos) {
                            obtain.readDouble();
                        }
                        readDouble = obtain.readDouble();
                        readDouble2 = obtain.readDouble();
                        if (location.hasAltitude()) {
                            d11 = obtain.readDouble();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("latitude", readDouble);
                            jSONObject2.put("longitude", readDouble2);
                            jSONObject2.put("altitude", d11);
                            obtain.recycle();
                            jSONObject = jSONObject2;
                        } else {
                            d11 = 0.0d;
                            JSONObject jSONObject22 = new JSONObject();
                            jSONObject22.put("latitude", readDouble);
                            jSONObject22.put("longitude", readDouble2);
                            jSONObject22.put("altitude", d11);
                            obtain.recycle();
                            jSONObject = jSONObject22;
                        }
                    }
                    obtain.readString();
                    obtain.readLong();
                    obtain.readLong();
                    obtain.readDouble();
                    obtain.readInt();
                    readDouble = obtain.readDouble();
                }
                readDouble2 = obtain.readDouble();
                d11 = obtain.readDouble();
                JSONObject jSONObject222 = new JSONObject();
                jSONObject222.put("latitude", readDouble);
                jSONObject222.put("longitude", readDouble2);
                jSONObject222.put("altitude", d11);
                obtain.recycle();
                jSONObject = jSONObject222;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
        jSONObject.put("hasAccuracy", location.hasAccuracy());
        jSONObject.put("time", location.getTime());
        jSONObject.put(ma.b.f72911h1, location.getProvider());
        jSONObject.put("elapsedRealtimeNanos", location.getElapsedRealtimeNanos());
        jSONObject.put("accuracy", String.valueOf(location.getAccuracy()));
        return jSONObject.toString();
    }
}
