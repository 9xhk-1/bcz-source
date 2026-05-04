package com.getui.gtc.dim.bean;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import ma.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class GtLocation implements Parcelable {
    public static final Parcelable.Creator<GtLocation> CREATOR = new Parcelable.Creator<GtLocation>() { // from class: com.getui.gtc.dim.bean.GtLocation.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GtLocation createFromParcel(Parcel parcel) {
            return new GtLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GtLocation[] newArray(int i11) {
            return new GtLocation[i11];
        }
    };
    private float accuracy;
    private double altitude;
    private long elapsedRealtimeNanos;
    private boolean hasAccuracy;
    private double latitude;
    private double longitude;
    private String provider;
    private long time;

    private GtLocation() {
    }

    public static GtLocation parseJson(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            GtLocation gtLocation = new GtLocation();
            gtLocation.hasAccuracy = jSONObject.optBoolean("hasAccuracy", false);
            gtLocation.time = jSONObject.optLong("time", 0L);
            gtLocation.provider = jSONObject.optString(b.f72911h1, "");
            gtLocation.longitude = jSONObject.optDouble("longitude", 0.0d);
            gtLocation.latitude = jSONObject.optDouble("latitude", 0.0d);
            gtLocation.elapsedRealtimeNanos = jSONObject.optLong("elapsedRealtimeNanos", 0L);
            gtLocation.altitude = jSONObject.optDouble("altitude", 0.0d);
            try {
                gtLocation.accuracy = Float.parseFloat(jSONObject.optString("accuracy", "0"));
            } catch (Throwable unused) {
            }
            return gtLocation;
        } catch (JSONException e11) {
            com.getui.gtc.dim.e.b.b(e11);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float distanceTo(double d11, double d12) {
        double d13 = this.latitude;
        double d14 = (0.017453292519943295d * d12) - (this.longitude * 0.017453292519943295d);
        double atan = Math.atan(Math.tan(d13 * 0.017453292519943295d) * 0.996647189328169d);
        double atan2 = Math.atan(Math.tan(d11 * 0.017453292519943295d) * 0.996647189328169d);
        double cos = Math.cos(atan);
        double cos2 = Math.cos(atan2);
        double sin = Math.sin(atan);
        double sin2 = Math.sin(atan2);
        double d15 = cos * cos2;
        double d16 = sin * sin2;
        int i11 = 0;
        double d17 = 0.0d;
        double d18 = 0.0d;
        double d19 = 0.0d;
        double d21 = d14;
        while (true) {
            if (i11 >= 20) {
                break;
            }
            double cos3 = Math.cos(d21);
            double sin3 = Math.sin(d21);
            double d22 = cos2 * sin3;
            double d23 = (cos * sin2) - ((sin * cos2) * cos3);
            double d24 = sin;
            double sqrt = Math.sqrt((d22 * d22) + (d23 * d23));
            double d25 = sin2;
            double d26 = d16 + (cos3 * d15);
            d19 = Math.atan2(sqrt, d26);
            double d27 = sqrt == 0.0d ? 0.0d : (sin3 * d15) / sqrt;
            double d28 = 1.0d - (d27 * d27);
            double d29 = d28 == 0.0d ? 0.0d : d26 - ((d16 * 2.0d) / d28);
            double d31 = 0.006739496756586903d * d28;
            double d32 = ((d31 / 16384.0d) * (((((320.0d - (175.0d * d31)) * d31) - 768.0d) * d31) + 4096.0d)) + 1.0d;
            double d33 = (d31 / 1024.0d) * ((d31 * (((74.0d - (47.0d * d31)) * d31) - 128.0d)) + 256.0d);
            double d34 = 2.0955066698943685E-4d * d28 * (((4.0d - (d28 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d35 = d29 * d29;
            d17 = d33 * sqrt * (d29 + ((d33 / 4.0d) * ((((d35 * 2.0d) - 1.0d) * d26) - ((((d33 / 6.0d) * d29) * (((sqrt * 4.0d) * sqrt) - 3.0d)) * ((d35 * 4.0d) - 3.0d)))));
            double d36 = d14 + ((1.0d - d34) * 0.0033528106718309896d * d27 * (d19 + (sqrt * d34 * (d29 + (d34 * d26 * (((2.0d * d29) * d29) - 1.0d))))));
            if (Math.abs((d36 - d21) / d36) < 1.0E-12d) {
                d18 = d32;
                break;
            }
            i11++;
            sin = d24;
            sin2 = d25;
            d21 = d36;
            d18 = d32;
        }
        return (float) (d18 * 6356752.3142d * (d19 - d17));
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public long getElapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getProvider() {
        return this.provider;
    }

    public long getTime() {
        return this.time;
    }

    public boolean hasAccuracy() {
        return this.hasAccuracy;
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hasAccuracy", this.hasAccuracy);
            jSONObject.put("time", this.time);
            jSONObject.put(b.f72911h1, this.provider);
            jSONObject.put("longitude", this.longitude);
            jSONObject.put("latitude", this.latitude);
            jSONObject.put("elapsedRealtimeNanos", this.elapsedRealtimeNanos);
            jSONObject.put("altitude", this.altitude);
            jSONObject.put("accuracy", String.valueOf(this.accuracy));
            return jSONObject.toString();
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.b(th2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.hasAccuracy ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.time);
        parcel.writeString(this.provider);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitude);
        parcel.writeLong(this.elapsedRealtimeNanos);
        parcel.writeDouble(this.altitude);
        parcel.writeFloat(this.accuracy);
    }

    public GtLocation(Location location) {
        this.hasAccuracy = location.hasAccuracy();
        this.accuracy = location.getAccuracy();
        this.time = location.getTime();
        this.provider = location.getProvider();
        this.longitude = location.getLongitude();
        this.latitude = location.getLatitude();
        this.elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        this.altitude = location.getAltitude();
    }

    public GtLocation(Parcel parcel) {
        this.hasAccuracy = parcel.readByte() != 0;
        this.time = parcel.readLong();
        this.provider = parcel.readString();
        this.longitude = parcel.readDouble();
        this.latitude = parcel.readDouble();
        this.elapsedRealtimeNanos = parcel.readLong();
        this.altitude = parcel.readDouble();
        this.accuracy = parcel.readFloat();
    }
}
