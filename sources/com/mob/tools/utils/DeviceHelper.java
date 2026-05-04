package com.mob.tools.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.view.View;
import com.mob.MobSDK;
import com.mob.commons.n;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.ReflectHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes7.dex */
public class DeviceHelper implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static DeviceHelper f41382a = new DeviceHelper();

    /* renamed from: b, reason: collision with root package name */
    private Context f41383b;

    public static Object currentActivityThread() {
        return com.mob.tools.a.c.a(MobSDK.getContext()).a().aH();
    }

    public static synchronized DeviceHelper getInstance(Context context) {
        DeviceHelper deviceHelper;
        synchronized (DeviceHelper.class) {
            try {
                DeviceHelper deviceHelper2 = f41382a;
                if (deviceHelper2.f41383b == null && context != null) {
                    deviceHelper2.f41383b = context.getApplicationContext();
                }
                deviceHelper = f41382a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceHelper;
    }

    public static Object invokeRuntimeExec(String str) throws Throwable {
        return ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(n.a("0175geceFi*cedkdccecjeedkfccbcjZc]cdEkh")), n.a("010GeeKhc,fccbcj^c?cd.kh"), new Object[0]), n.a("004hHckJh3cf"), new Object[]{str}, new Class[]{String.class});
    }

    public String Base64AES(String str, String str2) {
        return com.mob.tools.a.c.a(this.f41383b).a().a(str, str2);
    }

    public boolean checkNetworkAvailable() {
        return com.mob.tools.a.c.a(this.f41383b).a().af();
    }

    public boolean checkPad() {
        return com.mob.tools.a.c.a(this.f41383b).a().c();
    }

    public boolean checkPermission(String str) throws Throwable {
        return com.mob.tools.a.c.a(this.f41383b).a().h(str);
    }

    public boolean checkUA() {
        return com.mob.tools.a.c.a(this.f41383b).a().f();
    }

    public boolean cx() {
        return com.mob.tools.a.c.a(this.f41383b).a().b();
    }

    public boolean debugable() {
        return com.mob.tools.a.c.a(this.f41383b).a().d();
    }

    public boolean devEnable() {
        return com.mob.tools.a.c.a(this.f41383b).a().g();
    }

    public String getAdvertisingID() throws Throwable {
        return com.mob.tools.a.c.a(this.f41383b).a().m();
    }

    public int getAlbumCount() {
        return com.mob.tools.a.c.a(this.f41383b).a().Z();
    }

    public String getAppLanguage() {
        return com.mob.tools.a.c.a(this.f41383b).a().aa();
    }

    public long getAppLastUpdateTime() {
        return com.mob.tools.a.c.a(this.f41383b).a().aL();
    }

    public String getAppName() {
        return com.mob.tools.a.c.a(this.f41383b).a().aC();
    }

    public int getAppVersion() {
        return com.mob.tools.a.c.a(this.f41383b).a().aD();
    }

    public String getAppVersionName() {
        return com.mob.tools.a.c.a(this.f41383b).a().aE();
    }

    public Context getApplication() {
        return com.mob.tools.a.c.a(this.f41383b).a().aI();
    }

    public ArrayList<HashMap<String, Object>> getAvailableWifiList() {
        return com.mob.tools.a.c.a(this.f41383b).a().M();
    }

    public String getBaseband() {
        return com.mob.tools.a.c.a(this.f41383b).a().ao();
    }

    public void getBatteryState(ReflectHelper.a<HashMap<String, Object>, Void> aVar) {
        com.mob.tools.a.c.a(this.f41383b).a().a(aVar);
    }

    public String getBluetoothName() {
        return com.mob.tools.a.c.a(this.f41383b).a().B();
    }

    public String getBoardFromSysProperty() {
        return com.mob.tools.a.c.a(this.f41383b).a().ap();
    }

    public String getBoardPlatform() {
        return com.mob.tools.a.c.a(this.f41383b).a().aq();
    }

    public String getBrand() {
        return com.mob.tools.a.c.a(this.f41383b).a().y();
    }

    public String getBssid() {
        return com.mob.tools.a.c.a(this.f41383b).a().r();
    }

    public HashMap<String, String> getCPUFreq() {
        return com.mob.tools.a.c.a(this.f41383b).a().ak();
    }

    public HashMap<String, Object> getCPUInfo() {
        return com.mob.tools.a.c.a(this.f41383b).a().S();
    }

    public String getCPUType() {
        return com.mob.tools.a.c.a(this.f41383b).a().al();
    }

    public ArrayList<HashMap<String, String>> getCamResolution() {
        return com.mob.tools.a.c.a(this.f41383b).a().ah();
    }

    public String getCarrier() {
        return com.mob.tools.a.c.a(this.f41383b).a().s();
    }

    public String getCarrierName() {
        return com.mob.tools.a.c.a(this.f41383b).a().t();
    }

    public int getCdmaBid() {
        return com.mob.tools.a.c.a(this.f41383b).a().H();
    }

    public int getCdmaLat() {
        return com.mob.tools.a.c.a(this.f41383b).a().F();
    }

    public int getCdmaLon() {
        return com.mob.tools.a.c.a(this.f41383b).a().G();
    }

    public int getCdmaNid() {
        return com.mob.tools.a.c.a(this.f41383b).a().J();
    }

    public int getCdmaSid() {
        return com.mob.tools.a.c.a(this.f41383b).a().I();
    }

    public int getCellId() {
        return com.mob.tools.a.c.a(this.f41383b).a().C();
    }

    public int getCellLac() {
        return com.mob.tools.a.c.a(this.f41383b).a().D();
    }

    public String getCurrentProcessName() {
        return com.mob.tools.a.c.a(this.f41383b).a().aG();
    }

    public HashMap<String, Object> getCurrentWifiInfo() {
        return com.mob.tools.a.c.a(this.f41383b).a().L();
    }

    public int getDataNtType() {
        return com.mob.tools.a.c.a(this.f41383b).a().ag();
    }

    public HashMap<String, Object> getDefaultIM() {
        return com.mob.tools.a.c.a(this.f41383b).a().ax();
    }

    public String getDefaultIMPkg() {
        return com.mob.tools.a.c.a(this.f41383b).a().aw();
    }

    public String getDefaultResolvePkg(String str) {
        return com.mob.tools.a.c.a(this.f41383b).a().c(str);
    }

    public String getDetailNetworkTypeForStatic() {
        return com.mob.tools.a.c.a(this.f41383b).a().ae();
    }

    public String getDeviceData() {
        return com.mob.tools.a.c.a(this.f41383b).a().aJ();
    }

    public String getDeviceDataNotAES() {
        return com.mob.tools.a.c.a(this.f41383b).a().aK();
    }

    public String getDeviceId() {
        return com.mob.tools.a.c.a(this.f41383b).a().au();
    }

    public String getDeviceKey() {
        return com.mob.tools.a.c.a(this.f41383b).a().av();
    }

    public HashMap<String, Object> getDeviceMemUsage() {
        return com.mob.tools.a.c.a(this.f41383b).a().ar();
    }

    public String getDeviceType() {
        return com.mob.tools.a.c.a(this.f41383b).a().z();
    }

    public String getFlavor() {
        return com.mob.tools.a.c.a(this.f41383b).a().am();
    }

    public ArrayList<HashMap<String, String>> getIA(boolean z11) {
        return com.mob.tools.a.c.a(this.f41383b).a().c(z11);
    }

    public String getIMEI() {
        return com.mob.tools.a.c.a(this.f41383b).a().n();
    }

    public ArrayList<HashMap<String, Object>> getIMList() {
        return com.mob.tools.a.c.a(this.f41383b).a().ay();
    }

    public String getIMSI() {
        return com.mob.tools.a.c.a(this.f41383b).a().o();
    }

    public String getIPAddress() {
        return com.mob.tools.a.c.a(this.f41383b).a().as();
    }

    public Location getLocation(int i11, int i12, boolean z11) {
        return com.mob.tools.a.c.a(this.f41383b).a().a(i11, i12, z11);
    }

    public String getMIUIVersion() {
        return com.mob.tools.a.c.a(this.f41383b).a().v();
    }

    public String getManufacturer() {
        return com.mob.tools.a.c.a(this.f41383b).a().x();
    }

    public HashMap<String, Long> getMemoryInfo() {
        return com.mob.tools.a.c.a(this.f41383b).a().Y();
    }

    public String getModel() {
        return com.mob.tools.a.c.a(this.f41383b).a().w();
    }

    public ArrayList<HashMap<String, Object>> getNeighboringCellInfo() {
        return com.mob.tools.a.c.a(this.f41383b).a().K();
    }

    public String getNetworkType() {
        return com.mob.tools.a.c.a(this.f41383b).a().ac();
    }

    public String getNetworkTypeForStatic() {
        return com.mob.tools.a.c.a(this.f41383b).a().ad();
    }

    public String getOSCountry() {
        return com.mob.tools.a.c.a(this.f41383b).a().R();
    }

    public String getOSLanguage() {
        return com.mob.tools.a.c.a(this.f41383b).a().Q();
    }

    public int getOSVersionInt() {
        return com.mob.tools.a.c.a(this.f41383b).a().O();
    }

    public String getOSVersionName() {
        return com.mob.tools.a.c.a(this.f41383b).a().P();
    }

    public PackageInfo getPackageInfo(String str, int i11) throws PackageManager.NameNotFoundException {
        return com.mob.tools.a.c.a(this.f41383b).a().a(str, i11);
    }

    public String getPackageName() {
        return com.mob.tools.a.c.a(this.f41383b).a().aB();
    }

    public int getPlatformCode() {
        return 1;
    }

    public int getPsc() {
        return com.mob.tools.a.c.a(this.f41383b).a().E();
    }

    public String getQemuKernel() {
        return com.mob.tools.a.c.a(this.f41383b).a().W();
    }

    public List<String> getResolvePkgs(String str) {
        return com.mob.tools.a.c.a(this.f41383b).a().d(str);
    }

    public ArrayList<HashMap<String, String>> getSA() {
        return com.mob.tools.a.c.a(this.f41383b).a().at();
    }

    public String getSSID() {
        return com.mob.tools.a.c.a(this.f41383b).a().q();
    }

    public int getScreenBrightness() {
        return com.mob.tools.a.c.a(this.f41383b).a().U();
    }

    public int getScreenBrightnessMode() {
        return com.mob.tools.a.c.a(this.f41383b).a().V();
    }

    public String getScreenSize() {
        return com.mob.tools.a.c.a(this.f41383b).a().ab();
    }

    public String getSdcardPath() {
        return com.mob.tools.a.c.a(this.f41383b).a().az();
    }

    public boolean getSdcardState() {
        return false;
    }

    public String getSerialno() {
        return com.mob.tools.a.c.a(this.f41383b).a().l();
    }

    public String getSignMD5() {
        return com.mob.tools.a.c.a(this.f41383b).a().aA();
    }

    public String getSimSerialNumber() {
        return com.mob.tools.a.c.a(this.f41383b).a().u();
    }

    public HashMap<String, HashMap<String, Long>> getSizeInfo() {
        return com.mob.tools.a.c.a(this.f41383b).a().X();
    }

    public HashMap<String, Object> getSupport() {
        return com.mob.tools.a.c.a(this.f41383b).a().aj();
    }

    public String getSystemProperties(String str) {
        return com.mob.tools.a.c.a(this.f41383b).a().b(str);
    }

    public Object getSystemServiceSafe(String str) {
        try {
            return this.f41383b.getSystemService(str);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public ArrayList<ArrayList<String>> getTTYDriversInfo() {
        return com.mob.tools.a.c.a(this.f41383b).a().T();
    }

    public String getTimezone() {
        return com.mob.tools.a.c.a(this.f41383b).a().ai();
    }

    public Activity getTopActivity() {
        return null;
    }

    public HashMap<String, Object> getTraffic() {
        return com.mob.tools.a.c.a(this.f41383b).a().an();
    }

    public void hideSoftInput(View view) {
        com.mob.tools.a.c.a(this.f41383b).a().a(view);
    }

    public <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) {
        try {
            return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public boolean isFakePass(String str) {
        return com.mob.tools.a.c.a(this.f41383b).a().a(str);
    }

    public boolean isInMainProcess() {
        return com.mob.tools.a.c.a(this.f41383b).a().aF();
    }

    public boolean isPackageInstalled(String str) {
        return com.mob.tools.a.c.a(this.f41383b).a().e(str);
    }

    public boolean isRooted() {
        return com.mob.tools.a.c.a(this.f41383b).a().a();
    }

    public boolean isSensitiveDevice() {
        return com.mob.tools.a.c.a(this.f41383b).a().k();
    }

    public boolean isSmlt() {
        return com.mob.tools.a.c.a(this.f41383b).a().j();
    }

    public boolean isWifiProxy() {
        return com.mob.tools.a.c.a(this.f41383b).a().i();
    }

    public String[] queryIMEI() {
        return com.mob.tools.a.c.a(this.f41383b).a().A();
    }

    public String[] queryIMSI() {
        return com.mob.tools.a.c.a(this.f41383b).a().p();
    }

    public List<ResolveInfo> queryIntentServices(Intent intent, int i11) {
        return com.mob.tools.a.c.a(this.f41383b).a().a(intent, i11);
    }

    public void regReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) throws Throwable {
        ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), n.a("016PcgWhIeecdef0chGcgfc;hWcfWhQcd>ihPcg"), new Object[]{broadcastReceiver, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
    }

    public void registerWifiScanReceiver(final BlockingQueue<Boolean> blockingQueue) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.mob.tools.utils.DeviceHelper.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    DeviceHelper.this.unregReceiver(this);
                    if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                        blockingQueue.put(Boolean.TRUE);
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            regReceiver(broadcastReceiver, intentFilter);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public ResolveInfo resolveActivity(Intent intent, int i11) {
        return com.mob.tools.a.c.a(this.f41383b).a().b(intent, i11);
    }

    public boolean scanWifiList() {
        return com.mob.tools.a.c.a(this.f41383b).a().N();
    }

    public void showSoftInput(View view) {
        com.mob.tools.a.c.a(this.f41383b).a().b(view);
    }

    public void unregReceiver(BroadcastReceiver broadcastReceiver) throws Throwable {
        ReflectHelper.invokeInstanceMethod(this.f41383b, n.a("018QcbcjcgYhFeecdef2ch0cgfc.hScf)hCcdJihGcg"), new Object[]{broadcastReceiver}, new Class[]{BroadcastReceiver.class});
    }

    public boolean usbEnable() {
        return com.mob.tools.a.c.a(this.f41383b).a().h();
    }

    public boolean vpn() {
        return com.mob.tools.a.c.a(this.f41383b).a().e();
    }

    public String getAppName(String str) {
        return com.mob.tools.a.c.a(this.f41383b).a().g(str);
    }

    public String getDeviceKey(boolean z11) {
        return com.mob.tools.a.c.a(this.f41383b).a().d(z11);
    }

    public String getSignMD5(String str) {
        return com.mob.tools.a.c.a(this.f41383b).a().f(str);
    }

    public <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
        try {
            return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr, clsArr);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }
}
