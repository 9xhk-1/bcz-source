package s;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import cn.hugo.android.scanner.camera.FrontLightMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public static final float f86993d = 45.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f86994e = 450.0f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f86995a;

    /* renamed from: b, reason: collision with root package name */
    public t.d f86996b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f86997c;

    public a(Context context) {
        this.f86995a = context;
    }

    public void a(t.d cameraManager) {
        this.f86996b = cameraManager;
        if (FrontLightMode.readPref(PreferenceManager.getDefaultSharedPreferences(this.f86995a)) == FrontLightMode.AUTO) {
            SensorManager sensorManager = (SensorManager) this.f86995a.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f86997c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void b() {
        if (this.f86997c != null) {
            ((SensorManager) this.f86995a.getSystemService("sensor")).unregisterListener(this);
            this.f86996b = null;
            this.f86997c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f11 = sensorEvent.values[0];
        t.d dVar = this.f86996b;
        if (dVar != null) {
            if (f11 <= 45.0f) {
                dVar.k(true);
            } else if (f11 >= 450.0f) {
                dVar.k(false);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
