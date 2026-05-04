package zh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f102674h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f102675i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f102676j = 0;

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f102677a;

    /* renamed from: b, reason: collision with root package name */
    public Sensor f102678b;

    /* renamed from: e, reason: collision with root package name */
    public b f102681e;

    /* renamed from: g, reason: collision with root package name */
    public c f102683g;

    /* renamed from: c, reason: collision with root package name */
    public int f102679c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f102680d = false;

    /* renamed from: f, reason: collision with root package name */
    public SensorEventListener f102682f = new C1397a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int direction);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f102686a;

        public c(a sensor) {
            super(Looper.getMainLooper());
            this.f102686a = new WeakReference<>(sensor);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            a aVar = this.f102686a.get();
            if (aVar == null || msg.what != 0 || aVar.f102681e == null) {
                return;
            }
            aVar.f102681e.a(msg.arg1);
        }
    }

    public static a e(Context context, b l11) {
        a aVar = new a();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        aVar.f102677a = sensorManager;
        aVar.f102678b = sensorManager.getDefaultSensor(1);
        aVar.f102681e = l11;
        aVar.f102683g = new c(aVar);
        return aVar;
    }

    public int f() {
        return this.f102679c;
    }

    public final void g(int direction) {
        Message obtainMessage = this.f102683g.obtainMessage(0);
        obtainMessage.arg1 = direction;
        this.f102683g.sendMessage(obtainMessage);
    }

    public void h(boolean enabled) {
        if (this.f102680d == enabled) {
            return;
        }
        this.f102680d = enabled;
        if (enabled) {
            this.f102677a.registerListener(this.f102682f, this.f102678b, 2);
        } else {
            this.f102677a.unregisterListener(this.f102682f);
            this.f102683g.removeMessages(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: zh.a$a, reason: collision with other inner class name */
    public class C1397a implements SensorEventListener {

        /* renamed from: a, reason: collision with root package name */
        public float f102684a;

        public C1397a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent event) {
            float f11 = event.values[2];
            if (f11 <= -0.7f) {
                if (1 != a.this.f102679c) {
                    a.this.g(1);
                    a.this.f102679c = 1;
                    return;
                }
                return;
            }
            if (f11 < 7.0f || f11 > 11.0f) {
                return;
            }
            if (Math.abs(f11 - this.f102684a) >= 0.25f) {
                this.f102684a = f11;
            } else if (a.this.f102679c != 0) {
                a.this.g(0);
                a.this.f102679c = 0;
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    }
}
