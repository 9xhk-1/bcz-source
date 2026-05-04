package c7;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import com.baicizhan.app.biz.platform.DeviceType;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"HardwareIds"})
@u0({"SMAP\nDeviceRepo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceRepo.android.kt\ncom/baicizhan/app/biz/platform/DeviceRepo\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,41:1\n58#2,6:42\n*S KotlinDebug\n*F\n+ 1 DeviceRepo.android.kt\ncom/baicizhan/app/biz/platform/DeviceRepo\n*L\n12#1:42,6\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f8242b = e0.b(jb0.c.f64013a.b(), new a(this, null, null));

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f8243c = e0.c(new x00.a() { // from class: c7.d
        @Override // x00.a
        public final Object invoke() {
            String b11;
            b11 = e.b(e.this);
            return b11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class a implements x00.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f8244a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f8245b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f8246c;

        public a(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f8244a = aVar;
            this.f8245b = aVar2;
            this.f8246c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [android.app.Application, java.lang.Object] */
        @Override // x00.a
        public final Application invoke() {
            pa0.a aVar = this.f8244a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(Application.class), this.f8245b, this.f8246c);
        }
    }

    public static final String b(e eVar) {
        try {
            String string = Settings.Secure.getString(eVar.d().getContentResolver(), "android_id");
            return string == null ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : string;
        } catch (Exception e11) {
            z6.b.f101032b.i("DeviceRepo", "get deviceId error:", e11);
            return PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
        }
    }

    @m80.k
    public final String c() {
        String str = Build.BRAND;
        return str == null ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : str;
    }

    @m80.k
    public final Application d() {
        return (Application) this.f8242b.getValue();
    }

    @m80.k
    public final String e() {
        return l();
    }

    @m80.k
    public final DeviceType f() {
        return DeviceType.Android;
    }

    @m80.k
    public final String g() {
        String str = Build.MANUFACTURER;
        return str == null ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : str;
    }

    @m80.k
    public final String i() {
        String str = Build.MODEL;
        return str == null ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : str;
    }

    @m80.k
    public final String j() {
        String str = Build.VERSION.CODENAME;
        return str == null ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : str;
    }

    @m80.k
    public final String k() {
        String str = Build.VERSION.RELEASE;
        return str == null ? PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN : str;
    }

    public final String l() {
        return (String) this.f8243c.getValue();
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
