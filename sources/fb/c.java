package fb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.baicizhan.client.fm.service.FmService;
import com.baicizhan.client.fm.service.b;
import com.baicizhan.client.fm.service.c;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    public static final int f51480g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f51481h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f51482i = 2;

    /* renamed from: a, reason: collision with root package name */
    public com.baicizhan.client.fm.service.b f51483a;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0614c f51486d;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51484b = false;

    /* renamed from: e, reason: collision with root package name */
    public ServiceConnection f51487e = new a();

    /* renamed from: f, reason: collision with root package name */
    public c.b f51488f = new b();

    /* renamed from: c, reason: collision with root package name */
    public d f51485c = new d(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            c.this.f51483a = b.AbstractBinderC0277b.x0(service);
            try {
                c.this.f51483a.N(c.this.f51488f);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            c.this.f51483a = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends c.b {
        public b() {
        }

        @Override // com.baicizhan.client.fm.service.c
        public void E(int state, int curIndex, int type) {
            c.this.v(state, curIndex, type);
        }

        @Override // com.baicizhan.client.fm.service.c
        public void Q(boolean success, List<String> wordids, List<String> midPaths, int errCode) throws RemoteException {
            c.this.t(success, wordids, midPaths, errCode);
        }

        @Override // com.baicizhan.client.fm.service.c
        public void e(int limit, List<String> wordids, List<String> midPaths) throws RemoteException {
            c.this.u(limit, wordids, midPaths);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: fb.c$c, reason: collision with other inner class name */
    public interface InterfaceC0614c {
        void h(g bean);

        void i(e bean);

        void m(f bean);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<c> f51491a;

        public d(c proxy) {
            this.f51491a = new WeakReference<>(proxy);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            c cVar = this.f51491a.get();
            if (cVar == null) {
                return;
            }
            int i11 = msg.what;
            if (i11 == 0) {
                g gVar = (g) msg.obj;
                if (cVar.f51486d != null) {
                    fb.b bVar = new fb.b();
                    bVar.f51479a = cVar;
                    gVar.f51498a = bVar;
                    cVar.f51486d.h(gVar);
                    return;
                }
                return;
            }
            if (i11 == 1) {
                e eVar = (e) msg.obj;
                if (cVar.f51486d != null) {
                    cVar.f51486d.i(eVar);
                    return;
                }
                return;
            }
            if (i11 != 2) {
                return;
            }
            f fVar = (f) msg.obj;
            if (cVar.f51486d != null) {
                cVar.f51486d.m(fVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f51492a;

        /* renamed from: b, reason: collision with root package name */
        public List<String> f51493b;

        /* renamed from: c, reason: collision with root package name */
        public List<String> f51494c;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public int f51495a;

        /* renamed from: b, reason: collision with root package name */
        public int f51496b;

        /* renamed from: c, reason: collision with root package name */
        public int f51497c;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public fb.b f51498a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f51499b;

        /* renamed from: c, reason: collision with root package name */
        public List<String> f51500c;

        /* renamed from: d, reason: collision with root package name */
        public List<String> f51501d;

        /* renamed from: e, reason: collision with root package name */
        public int f51502e;
    }

    public static c i(InterfaceC0614c callback) {
        c cVar = new c();
        cVar.f51486d = callback;
        return cVar;
    }

    public void A() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.toggle();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void h(Context context) {
        if (!this.f51484b) {
            qb.c.d("", "unbind fm service failed for bound flag not correct!", new Object[0]);
            return;
        }
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.b0(this.f51488f);
            } catch (RemoteException e11) {
                qb.c.c("", "close fm service callback failed for remote exception occured!", e11);
                e11.printStackTrace();
            }
        }
        context.unbindService(this.f51487e);
        this.f51484b = false;
    }

    public void j(Context context) {
        context.bindService(new Intent(context, (Class<?>) FmService.class), this.f51487e, 1);
        this.f51484b = true;
    }

    public void k(int index) {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.I(index);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void l(String absPath) {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.d(absPath);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void m(int index) {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.r0(index);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void n(String notifyJson) {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.k0(notifyJson);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void o() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.pause();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void p() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.play();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void q() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.d0();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void r() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.u0();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void s() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.M();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void t(boolean success, List<String> wordids, List<String> midPaths, int errCode) {
        g gVar = new g();
        gVar.f51499b = success;
        gVar.f51500c = wordids;
        gVar.f51501d = midPaths;
        gVar.f51502e = errCode;
        Message obtainMessage = this.f51485c.obtainMessage(0);
        obtainMessage.obj = gVar;
        this.f51485c.sendMessage(obtainMessage);
    }

    public final void u(int limit, List<String> wordids, List<String> midPaths) {
        e eVar = new e();
        eVar.f51492a = limit;
        eVar.f51493b = wordids;
        eVar.f51494c = midPaths;
        Message obtainMessage = this.f51485c.obtainMessage(1);
        obtainMessage.obj = eVar;
        this.f51485c.sendMessage(obtainMessage);
    }

    public final void v(int state, int curIndex, int type) {
        f fVar = new f();
        fVar.f51495a = state;
        fVar.f51496b = curIndex;
        fVar.f51497c = type;
        Message obtainMessage = this.f51485c.obtainMessage(2);
        obtainMessage.obj = fVar;
        this.f51485c.sendMessage(obtainMessage);
    }

    public void w() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.f0();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void x(int limit) {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.t0(limit);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void y(boolean high) {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.P(high);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void z() {
        com.baicizhan.client.fm.service.b bVar = this.f51483a;
        if (bVar != null) {
            try {
                bVar.stop();
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }
    }
}
