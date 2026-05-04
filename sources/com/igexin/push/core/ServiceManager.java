package com.igexin.push.core;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Pair;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.igexin.push.g.h;
import com.igexin.push.g.o;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.IPushCore;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushService;
import com.igexin.sdk.main.PushCoreLoader;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class ServiceManager {

    /* renamed from: b, reason: collision with root package name */
    public static Context f37612b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final String f37613c = "ServiceManager";

    /* renamed from: a, reason: collision with root package name */
    public IPushCore f37614a;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f37615d;

    /* renamed from: e, reason: collision with root package name */
    private String f37616e;

    /* renamed from: f, reason: collision with root package name */
    private Class f37617f;

    /* renamed from: g, reason: collision with root package name */
    private Class f37618g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f37619h;

    /* renamed from: i, reason: collision with root package name */
    private final ServiceConnection f37620i;
    public Pair<Integer, String> initType;

    /* renamed from: com.igexin.push.core.ServiceManager$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f37632a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f37634c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37635d;

        public AnonymousClass4(Intent intent, long j11, Activity activity, String str) {
            this.f37632a = intent;
            this.f37633b = j11;
            this.f37634c = activity;
            this.f37635d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!com.igexin.push.g.j.a(ServiceManager.f37612b)) {
                    Intent intent = this.f37632a;
                    if (intent != null && intent.getExtras() != null) {
                        try {
                            Bundle extras = this.f37632a.getExtras();
                            IBinder binder = extras.getBinder("callback");
                            if (binder != null) {
                                new com.igexin.a.b(binder).a(new Bundle());
                                extras.remove("callback");
                            }
                        } catch (Throwable th2) {
                            com.igexin.c.a.c.a.a(th2);
                        }
                    }
                    long a11 = com.igexin.push.core.d.d.a().a(com.igexin.push.core.d.d.f37973b, 0);
                    long a12 = com.igexin.push.core.d.d.a().a(com.igexin.push.core.d.d.f37974c, 0);
                    boolean z11 = (a11 == 0 || a12 == 0 || a12 >= a11) ? false : true;
                    if (a11 != 0) {
                        long j11 = this.f37633b;
                        if (j11 - a11 < 5000 || j11 - a12 < 5000) {
                            z11 = true;
                        }
                    }
                    Activity activity = this.f37634c;
                    com.igexin.push.core.a.b.d();
                    Intent intent2 = new Intent(activity, (Class<?>) com.igexin.push.core.a.b.a((Context) this.f37634c));
                    Intent intent3 = this.f37632a;
                    if (intent3 != null && intent3.hasExtra("action") && this.f37632a.hasExtra("isSlave")) {
                        intent2.putExtra("action", this.f37632a.getStringExtra("action"));
                        intent2.putExtra("isSlave", this.f37632a.getBooleanExtra("isSlave", false));
                        if (this.f37632a.hasExtra("op_app")) {
                            intent2.putExtra("op_app", this.f37632a.getStringExtra("op_app"));
                        }
                    }
                    Intent intent4 = this.f37632a;
                    if (intent4 != null && intent4.hasExtra(b.aC)) {
                        intent2.putExtra(b.aC, this.f37632a.getStringExtra(b.aC));
                    }
                    intent2.putExtra("isGuard", true);
                    intent2.putExtra("isGuardForce", z11);
                    ServiceManager.this.b(this.f37634c, intent2);
                    com.igexin.c.a.c.a.a("ServiceManager|start PushService from da " + this.f37635d, new Object[0]);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final ServiceManager f37645a = new ServiceManager(0);

        private a() {
        }
    }

    private ServiceManager() {
        this.f37615d = new AtomicBoolean(false);
        this.f37619h = new AtomicBoolean(false);
        this.f37620i = new ServiceConnection() { // from class: com.igexin.push.core.ServiceManager.7
            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(Service service) {
        com.igexin.c.a.c.a.a("ServiceManager|start by system ####", new Object[0]);
        if (!g(service)) {
            service.stopSelf();
            return 2;
        }
        com.igexin.c.a.c.a.a("ServiceManager|intent = null", new Object[0]);
        if (!this.f37615d.getAndSet(true)) {
            a(service);
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(Service service, Intent intent, int i11, int i12) {
        com.igexin.c.a.c.a.a("ServiceManager|start from guard...", new Object[0]);
        if (!g(service)) {
            this.f37615d.set(false);
            service.stopSelf();
            return 2;
        }
        a(service);
        IPushCore iPushCore = this.f37614a;
        if (iPushCore != null) {
            return iPushCore.onServiceStartCommand(intent, i11, i12);
        }
        return 2;
    }

    public static String d(Context context) {
        return (String) o.b(context, o.f38735d, "");
    }

    public static String e(Context context) {
        return (String) o.b(context, "us", "");
    }

    private static boolean g(Context context) {
        return !com.igexin.push.g.j.a(context);
    }

    public static ServiceManager getInstance() {
        return a.f37645a;
    }

    public final int a(final Service service, final Intent intent, final int i11, final int i12) {
        final Context applicationContext = service.getApplicationContext();
        com.igexin.b.a.a().a("pushservice").execute(new Runnable() { // from class: com.igexin.push.core.ServiceManager.1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceManager serviceManager;
                Service service2;
                Intent intent2;
                int i13;
                Context context;
                Pair<Integer, String> pair;
                try {
                    com.igexin.c.a.c.a.a(ServiceManager.f37613c, "| PushService startCommand... time = " + System.currentTimeMillis() + " intent = " + intent);
                    Intent intent3 = intent;
                    if (intent3 == null) {
                        ServiceManager.this.initType = Pair.create(0, null);
                        ServiceManager.this.b(service);
                        return;
                    }
                    o.a(applicationContext, intent3);
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        for (String str : extras.keySet()) {
                            extras.get(str);
                            com.igexin.c.a.c.a.a("ServiceManager|key [" + str + "]: " + extras.get(str), new Object[0]);
                        }
                    } else {
                        com.igexin.c.a.c.a.a("ServiceManager|no extras", new Object[0]);
                    }
                    String stringExtra = intent.getStringExtra("action");
                    boolean booleanExtra = intent.getBooleanExtra("isGuard", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("isGuardForce", false);
                    if (ServiceManager.this.f37615d.getAndSet(true)) {
                        if (((Integer) ServiceManager.this.initType.first).equals(0) && booleanExtra2) {
                            ServiceManager.this.initType = Pair.create(1, intent.getStringExtra(b.aC));
                            o.a(applicationContext, "it", ServiceManager.this.initType.first);
                        }
                        ServiceManager.this.a(intent, i11, i12);
                        return;
                    }
                    if (booleanExtra) {
                        ServiceManager.this.initType = Pair.create(1, intent.getStringExtra(b.aC));
                        ServiceManager.this.c(service, intent, i11, i12);
                        context = applicationContext;
                        pair = ServiceManager.this.initType;
                    } else {
                        ServiceManager.this.initType = Pair.create(0, null);
                        if (!com.igexin.push.g.j.a(applicationContext)) {
                            serviceManager = ServiceManager.this;
                            service2 = service;
                            intent2 = intent;
                            i13 = i11;
                        } else if (!PushConsts.ACTION_SERVICE_INITIALIZE.equals(stringExtra)) {
                            ServiceManager.this.f37615d.set(false);
                            service.stopSelf();
                            return;
                        } else {
                            serviceManager = ServiceManager.this;
                            service2 = service;
                            intent2 = intent;
                            i13 = i11;
                        }
                        serviceManager.b(service2, intent2, i13, i12);
                        context = applicationContext;
                        pair = ServiceManager.this.initType;
                    }
                    o.a(context, "it", pair.first);
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            }
        });
        return 2;
    }

    public final void f(Context context) {
        f37612b = context.getApplicationContext();
        final boolean isMainProcess = CommonUtil.isMainProcess();
        if (this.f37619h.getAndSet(true)) {
            final long currentTimeMillis = System.currentTimeMillis();
            com.igexin.b.a.a().a("gd").execute(new Runnable() { // from class: com.igexin.push.core.ServiceManager.3
                @Override // java.lang.Runnable
                public final void run() {
                    com.igexin.push.core.d.d.a().a(isMainProcess ? com.igexin.push.core.d.d.f37973b : com.igexin.push.core.d.d.f37974c, Long.valueOf(currentTimeMillis));
                    StringBuilder sb2 = new StringBuilder("init in ");
                    sb2.append(isMainProcess ? "main process " : "other process ");
                    sb2.append(currentTimeMillis);
                    com.igexin.c.a.c.a.b(ServiceManager.f37613c, sb2.toString());
                }
            });
        }
    }

    public /* synthetic */ ServiceManager(byte b11) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Intent intent, int i11, int i12) {
        if (this.f37614a == null) {
            return 2;
        }
        com.igexin.c.a.c.a.a("ServiceManager|inInit = true, call onServiceStartCommand...", new Object[0]);
        return this.f37614a.onServiceStartCommand(intent, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(Service service, Intent intent, int i11, int i12) {
        com.igexin.c.a.c.a.a("ServiceManager|start from initialize...", new Object[0]);
        com.igexin.c.a.c.a.d.a().a("[ServiceManager] ServiceManager start from initialize...");
        a(service);
        IPushCore iPushCore = this.f37614a;
        if (iPushCore != null) {
            return iPushCore.onServiceStartCommand(intent, i11, i12);
        }
        return 2;
    }

    public final Class c(Context context) {
        Class cls = this.f37617f;
        if (cls != null) {
            return cls;
        }
        Class cls2 = (Class) com.igexin.push.g.d.a(context, GTIntentService.class).second;
        this.f37617f = cls2;
        if (cls2 != null) {
            return cls2;
        }
        try {
            String str = (String) o.b(context, o.f38734c, "");
            if (!TextUtils.isEmpty(str)) {
                Class<?> cls3 = Class.forName(str);
                this.f37617f = cls3;
                return cls3;
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        return this.f37617f;
    }

    private boolean c(final Context context, final Intent intent) {
        com.igexin.b.a.a().a("pushservice").execute(new Runnable() { // from class: com.igexin.push.core.ServiceManager.6
            private void a() {
                try {
                    com.igexin.c.a.c.a.a("ServiceManager|startPService by bind", new Object[0]);
                    intent.setType("PB-" + System.nanoTime());
                    Intent intent2 = intent;
                    Context context2 = context;
                    intent2.setClass(context2, ServiceManager.this.b(context2));
                    context.getApplicationContext().bindService(intent, ServiceManager.this.f37620i, 1);
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.b(ServiceManager.f37613c, "startPService exception = " + th2.toString());
                    com.igexin.c.a.c.a.a(th2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT < 26 || !com.igexin.push.g.c.g()) {
                        context.getApplicationContext().startService(intent);
                    } else {
                        a();
                    }
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.b(ServiceManager.f37613c, "startPService exception = " + th2.toString());
                    com.igexin.c.a.c.a.a(th2);
                    if (th2 instanceof IllegalStateException) {
                        a();
                    }
                }
            }
        });
        return true;
    }

    public final Class b(Context context) {
        ComponentName componentName;
        try {
            if (this.f37618g == null) {
                Class cls = (Class) com.igexin.push.g.d.a(context, PushService.class).second;
                this.f37618g = cls;
                if (cls == null) {
                    String str = (String) o.b(context, o.f38733b, "");
                    if (!TextUtils.isEmpty(str)) {
                        this.f37618g = Class.forName(str);
                    }
                }
                if (this.f37618g == null) {
                    this.f37618g = PushService.class;
                }
            }
            componentName = new ComponentName(context, (Class<?>) this.f37618g);
        } catch (Throwable th2) {
            try {
                this.f37618g = PushService.class;
                com.igexin.c.a.c.a.a(th2);
                componentName = new ComponentName(context, (Class<?>) this.f37618g);
            } catch (Throwable th3) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) this.f37618g), 1, 1);
                throw th3;
            }
        }
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        return this.f37618g;
    }

    private void b() {
        com.igexin.c.a.c.a.a("ServiceManager|onDestroy...", new Object[0]);
        IPushCore iPushCore = this.f37614a;
        if (iPushCore != null) {
            iPushCore.onServiceDestroy();
        }
    }

    public final IBinder a(Service service, Intent intent) {
        com.igexin.c.a.c.a.a("ServiceManager|onBind...", new Object[0]);
        a(service, intent, 0, 0);
        IPushCore iPushCore = this.f37614a;
        if (iPushCore != null) {
            return iPushCore.onServiceBind(intent);
        }
        return null;
    }

    public final boolean b(Context context, Intent intent) {
        return c(context.getApplicationContext(), intent);
    }

    public static void a() {
        com.igexin.c.a.c.a.a("ServiceManager|onLowMemory...", new Object[0]);
    }

    private void a(Activity activity) {
        Activity activity2;
        long currentTimeMillis;
        String name;
        Intent intent;
        try {
            Context applicationContext = activity.getApplicationContext();
            f37612b = applicationContext;
            GtcProvider.setContext(applicationContext);
            currentTimeMillis = System.currentTimeMillis();
            name = activity.getClass().getName();
            intent = activity.getIntent();
            activity2 = activity;
        } catch (Throwable th2) {
            th = th2;
            activity2 = activity;
        }
        try {
            com.igexin.b.a.a().a("gd").execute(new AnonymousClass4(intent, currentTimeMillis, activity2, name));
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            activity2.finish();
            com.igexin.c.a.c.a.a(th4);
        }
    }

    private void a(final Service service) {
        com.igexin.c.a.c.a.a("ServiceManager|startGTCore ++++", new Object[0]);
        if (!com.igexin.push.g.g.a()) {
            com.igexin.b.a.a().f37028a.execute(new h.AnonymousClass1(service, new h.a() { // from class: com.igexin.push.core.ServiceManager.2
                @Override // com.igexin.push.g.h.a
                public final void a(boolean z11) {
                    com.igexin.c.a.c.a.a(ServiceManager.f37613c, "load encrypt error, report bi result = " + z11 + " ###########");
                    com.igexin.c.a.c.a.a("ServiceManager|load encrypt error, report bi result = " + z11 + " ###########", new Object[0]);
                    service.stopSelf();
                }
            }));
            return;
        }
        PushCoreLoader.getInstance().init(service);
        this.f37614a = PushCoreLoader.getInstance().getPushCore();
        if (PushCoreLoader.getInstance().getGtcCore() != null) {
            PushCoreLoader.getInstance().getGtcCore().start(service);
        }
        IPushCore iPushCore = this.f37614a;
        if (iPushCore != null) {
            iPushCore.start(service);
        }
    }

    public static void a(Context context) {
        f37612b = context.getApplicationContext();
    }

    public final void a(final Context context, final Intent intent) {
        try {
            Context applicationContext = context.getApplicationContext();
            f37612b = applicationContext;
            GtcProvider.setContext(applicationContext);
            final long currentTimeMillis = System.currentTimeMillis();
            com.igexin.b.a.a().a("gd").execute(new Runnable() { // from class: com.igexin.push.core.ServiceManager.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.igexin.push.g.j.a(ServiceManager.f37612b)) {
                        return;
                    }
                    Intent intent2 = intent;
                    if (intent2 != null && intent2.getExtras() != null) {
                        try {
                            Bundle extras = intent.getExtras();
                            IBinder binder = extras.getBinder("callback");
                            if (binder != null) {
                                new com.igexin.a.b(binder).a(new Bundle());
                                extras.remove("callback");
                            }
                        } catch (Throwable th2) {
                            com.igexin.c.a.c.a.a(th2);
                        }
                    }
                    long a11 = com.igexin.push.core.d.d.a().a(com.igexin.push.core.d.d.f37973b, 0);
                    long a12 = com.igexin.push.core.d.d.a().a(com.igexin.push.core.d.d.f37974c, 0);
                    boolean z11 = (a11 == 0 || a12 == 0 || a12 >= a11) ? false : true;
                    if (a11 != 0 && currentTimeMillis - a11 < 5000) {
                        z11 = true;
                    }
                    Context context2 = context;
                    com.igexin.push.core.a.b.d();
                    Intent intent3 = new Intent(context2, (Class<?>) com.igexin.push.core.a.b.a(context));
                    Intent intent4 = intent;
                    if (intent4 != null && intent4.hasExtra("action") && intent.hasExtra("isSlave")) {
                        intent3.putExtra("action", intent.getStringExtra("action"));
                        intent3.putExtra("isSlave", intent.getBooleanExtra("isSlave", false));
                        if (intent.hasExtra("op_app")) {
                            intent3.putExtra("op_app", intent.getStringExtra("op_app"));
                        }
                    }
                    Intent intent5 = intent;
                    if (intent5 != null && intent5.hasExtra(b.aC)) {
                        intent3.putExtra(b.aC, intent.getStringExtra(b.aC));
                    }
                    intent3.putExtra("isGuard", true);
                    intent3.putExtra("isGuardForce", z11);
                    ServiceManager.this.b(context, intent3);
                    com.igexin.c.a.c.a.a("ServiceManager|start PushService from da", new Object[0]);
                }
            });
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }
}
