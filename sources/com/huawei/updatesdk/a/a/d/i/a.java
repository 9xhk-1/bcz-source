package com.huawei.updatesdk.a.a.d.i;

import android.car.Car;
import android.car.CarInfoManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Car f36818a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f36819b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f36820c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f36821d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.updatesdk.a.a.d.i.a$a, reason: collision with other inner class name */
    public static class ServiceConnectionC0450a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                CarInfoManager carInfoManager = (CarInfoManager) a.f36818a.getCarManager("info");
                String unused = a.f36820c = carInfoManager.getManufacturer();
                String unused2 = a.f36819b = carInfoManager.getModel();
                com.huawei.updatesdk.a.a.a.b("CarInfoUtil", "car getManufacturer = " + a.f36820c + "  getModel = " + a.f36819b);
            } catch (Throwable th2) {
                com.huawei.updatesdk.a.a.a.a("CarInfoUtil", "Car not connected in onServiceConnected" + th2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.huawei.updatesdk.a.a.a.b("CarInfoUtil", "onServiceDisconnected");
        }
    }

    public static String d() {
        return f36820c;
    }

    public static String e() {
        return f36819b;
    }

    private static void a(Context context) {
        if (context == null || f36821d) {
            return;
        }
        try {
            f36821d = true;
            Car createCar = Car.createCar(context.getApplicationContext(), new ServiceConnectionC0450a());
            f36818a = createCar;
            if (createCar != null) {
                createCar.connect();
            }
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.a("CarInfoUtil", "Car Service Connect Error" + th2.getMessage());
        }
    }

    public static void b(Context context) {
        a(context);
    }
}
