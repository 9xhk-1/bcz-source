package com.baicizhan.client.framework.network.http.download;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.baicizhan.client.framework.asynctask.LAsyncTask;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.baicizhan.client.framework.network.http.download.IDownloadManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xb.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements IDownloadManager {

    /* renamed from: j, reason: collision with root package name */
    public static final int f17591j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17592k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17593l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17594m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final l f17595n = new tb.a();

    /* renamed from: a, reason: collision with root package name */
    public sb.b f17596a;

    /* renamed from: c, reason: collision with root package name */
    public c f17598c;

    /* renamed from: f, reason: collision with root package name */
    public e f17601f;

    /* renamed from: g, reason: collision with root package name */
    public IDownloadManager.a f17602g;

    /* renamed from: d, reason: collision with root package name */
    public List<sb.b> f17599d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public IDownloadManager.State f17603h = IDownloadManager.State.None;

    /* renamed from: i, reason: collision with root package name */
    public f f17604i = new f();

    /* renamed from: b, reason: collision with root package name */
    public b f17597b = new b(this);

    /* renamed from: e, reason: collision with root package name */
    public d f17600e = new d(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f17605a;

        public b(a dnmanager) {
            this.f17605a = new WeakReference<>(dnmanager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            a aVar = this.f17605a.get();
            if (aVar == null || aVar.f17603h != IDownloadManager.State.Downloading) {
                return;
            }
            sb.c cVar = (sb.c) msg.obj;
            int i11 = msg.what;
            if (i11 != 0) {
                if (i11 != 1 || aVar == null || aVar.f17602g == null) {
                    return;
                }
                aVar.f17602g.onStartDecompress();
                return;
            }
            long a11 = cVar.a();
            long b11 = cVar.b();
            int i12 = (int) (b11 > 0 ? (a11 * 100) / b11 : 0L);
            if (i12 < 0) {
                i12 = 0;
            } else if (i12 > 100) {
                i12 = 100;
            }
            if (aVar == null || aVar.f17602g == null) {
                return;
            }
            aVar.f17602g.onProgress(i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends LAsyncTask<sb.b, Integer, Boolean> {
        public c(String key, int concurrence) {
            R(-2000);
            N(key);
            A(concurrence);
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public Boolean f(sb.b... params) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
            return Boolean.valueOf(params[0].a(a.this.f17597b));
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void w(Boolean result) {
            Log.d("whiz", "onPostExecute, state: " + a.this.f17603h);
            if (a.this.f17596a == null) {
                return;
            }
            if (a.this.f17602g == null) {
                a.this.f17603h = IDownloadManager.State.None;
                return;
            }
            int i11 = a.this.f17596a.b().b().f88212c;
            String a11 = a.this.f17596a.b().b().a();
            if (!result.booleanValue()) {
                if (IDownloadManager.State.Stopped == a.this.f17603h) {
                    a.this.f17602g.onStop();
                } else if (IDownloadManager.State.Paused == a.this.f17603h) {
                    a.this.f17602g.onPause();
                }
                a.this.f17603h = IDownloadManager.State.Failed;
                a.this.f17602g.onComplete(false, a11, i11);
                return;
            }
            IDownloadManager.State state = IDownloadManager.State.Downloading;
            if (state == a.this.f17603h) {
                a.this.f17603h = IDownloadManager.State.Successed;
                a.this.f17602g.onProgress(100);
                a.this.f17602g.onComplete(true, a11, i11);
                return;
            }
            throw new IllegalStateException("The download state is illegal right now. Expect state is: [" + state + "], but the actual one is: [" + a.this.f17603h + "].");
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        public void d() {
            super.d();
            if (a.this.f17596a != null) {
                a.this.f17596a.b().b().f88210a = true;
                a.this.f17596a.b().b().f88211b.f97940a = true;
            }
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        public void u() {
            super.u();
            Log.d("whiz", "onCancelled, state: " + a.this.f17603h);
            if (a.this.f17602g == null) {
                a.this.f17603h = IDownloadManager.State.None;
            } else if (IDownloadManager.State.Stopped == a.this.f17603h) {
                a.this.f17602g.onStop();
            } else if (IDownloadManager.State.Paused == a.this.f17603h) {
                a.this.f17602g.onPause();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f17607a;

        /* renamed from: b, reason: collision with root package name */
        public int f17608b = 0;

        public d(a dnmanager) {
            this.f17607a = new WeakReference<>(dnmanager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            a aVar = this.f17607a.get();
            if (aVar == null || aVar.f17603h != IDownloadManager.State.Downloading) {
                return;
            }
            int i11 = msg.what;
            sb.c cVar = (sb.c) msg.obj;
            if (i11 == 0) {
                if (aVar == null || aVar.f17602g == null) {
                    return;
                }
                long a11 = cVar.a();
                long b11 = cVar.b();
                float size = 100.0f / aVar.f17604i.f17610a.size();
                int i12 = b11 > 0 ? (int) ((a11 * size) / b11) : 0;
                aVar.f17602g.onProgress((int) ((i12 >= 0 ? ((float) i12) > size ? (int) size : i12 : 0) + (this.f17608b * size)));
                return;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                this.f17608b++;
            } else {
                if (aVar == null || aVar.f17602g == null) {
                    return;
                }
                aVar.f17602g.onStartDecompress();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends LAsyncTask<List<sb.b>, Integer, Boolean> {
        public e(String key, int concurrence) {
            R(-2000);
            N(key);
            A(concurrence);
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public Boolean f(List<sb.b>... params) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
            Iterator<sb.b> it = params[0].iterator();
            while (it.hasNext()) {
                if (!it.next().a(a.this.f17600e)) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void w(Boolean result) {
            if (a.this.f17599d.isEmpty()) {
                return;
            }
            if (a.this.f17602g == null) {
                a.this.f17603h = IDownloadManager.State.None;
                return;
            }
            int i11 = ((sb.b) a.this.f17599d.get(a.this.f17599d.size() - 1)).b().b().f88212c;
            ArrayList arrayList = new ArrayList(a.this.f17599d.size());
            Iterator it = a.this.f17599d.iterator();
            while (it.hasNext()) {
                arrayList.add(((sb.b) it.next()).b().b().a());
            }
            if (!result.booleanValue()) {
                if (IDownloadManager.State.Stopped == a.this.f17603h) {
                    a.this.f17602g.onStop();
                } else if (IDownloadManager.State.Paused == a.this.f17603h) {
                    a.this.f17602g.onPause();
                }
                a.this.f17603h = IDownloadManager.State.Failed;
                for (sb.b bVar : a.this.f17599d) {
                    if (bVar.b().b().f88212c < 0) {
                        i11 = bVar.b().b().f88212c;
                    }
                }
                a.this.f17602g.onGroupComplete(false, arrayList, i11);
                return;
            }
            IDownloadManager.State state = IDownloadManager.State.Downloading;
            if (state == a.this.f17603h) {
                a.this.f17603h = IDownloadManager.State.Successed;
                a.this.f17602g.onProgress(100);
                a.this.f17602g.onGroupComplete(true, arrayList, i11);
                return;
            }
            throw new IllegalStateException("The download state is illegal right now. Expect state is: [" + state + "], but the actual one is: [" + a.this.f17603h + "].");
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        public void d() {
            super.d();
            for (sb.b bVar : a.this.f17599d) {
                bVar.b().b().f88210a = true;
                bVar.b().b().f88211b.f97940a = true;
            }
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        public void u() {
            super.u();
            if (a.this.f17602g == null) {
                a.this.f17603h = IDownloadManager.State.None;
            } else if (IDownloadManager.State.Stopped == a.this.f17603h) {
                a.this.f17602g.onStop();
            } else if (IDownloadManager.State.Paused == a.this.f17603h) {
                a.this.f17602g.onPause();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public HashMap<String, String> f17610a;

        /* renamed from: b, reason: collision with root package name */
        public String f17611b;

        /* renamed from: c, reason: collision with root package name */
        public String f17612c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f17613d;

        /* renamed from: e, reason: collision with root package name */
        public int f17614e;

        /* renamed from: f, reason: collision with root package name */
        public int f17615f;

        /* renamed from: g, reason: collision with root package name */
        public int f17616g;

        /* renamed from: h, reason: collision with root package name */
        public int f17617h;

        /* renamed from: i, reason: collision with root package name */
        public l f17618i;

        /* renamed from: j, reason: collision with root package name */
        public IDownloadManager.a f17619j;

        public f() {
            this.f17610a = new HashMap<>();
            this.f17613d = true;
            this.f17614e = 1;
            this.f17615f = 1;
            this.f17616g = 0;
            this.f17617h = 0;
            this.f17618i = a.f17595n;
        }
    }

    public static final String N(String url) {
        return xb.f.o(url);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean A(String url, boolean autoDecomp, IDownloadManager.a callback) {
        return e(url, autoDecomp, 1, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean B() {
        return this.f17604i.f17613d;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager C(boolean autoDecomp) {
        this.f17604i.f17613d = autoDecomp;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public Map<String, String> D() {
        return this.f17604i.f17610a;
    }

    public final c O() {
        HttpRequest a11 = this.f17596a.b().a();
        String N = N(a11.n());
        int g11 = a11.g();
        LAsyncTask<?, ?, ?> K = LAsyncTask.K(N);
        if (K != null && LAsyncTask.LAsyncTaskStatus.RUNNING == K.p()) {
            K.d();
            LAsyncTask.G(-2000, N);
        }
        return new c(N, g11);
    }

    public final e P() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<sb.b> it = this.f17599d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b().a().n());
            sb2.append("; ");
        }
        String N = N(sb2.toString());
        int i11 = this.f17604i.f17614e;
        LAsyncTask<?, ?, ?> K = LAsyncTask.K(N);
        if (K != null && LAsyncTask.LAsyncTaskStatus.RUNNING == K.p()) {
            K.d();
            LAsyncTask.G(-2000, N);
        }
        return new e(N, i11);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean a() {
        if (IDownloadManager.State.Paused == this.f17603h) {
            if (this.f17596a != null && this.f17599d.isEmpty()) {
                c cVar = this.f17598c;
                if (cVar != null && !cVar.r()) {
                    this.f17598c.d();
                }
                this.f17596a.b().b().f88210a = false;
                this.f17596a.b().b().f88211b.f97940a = false;
                c O = O();
                this.f17598c = O;
                O.g(this.f17596a);
                this.f17603h = IDownloadManager.State.Downloading;
                IDownloadManager.a aVar = this.f17602g;
                if (aVar != null) {
                    aVar.onResume();
                }
                return true;
            }
            if (!this.f17599d.isEmpty() && this.f17596a == null) {
                e eVar = this.f17601f;
                if (eVar != null && !eVar.r()) {
                    this.f17601f.d();
                }
                Iterator<sb.b> it = this.f17599d.iterator();
                while (it.hasNext()) {
                    it.next().b().b().f88210a = false;
                }
                e P = P();
                this.f17601f = P;
                P.g(this.f17599d);
                this.f17603h = IDownloadManager.State.Downloading;
                IDownloadManager.a aVar2 = this.f17602g;
                if (aVar2 != null) {
                    aVar2.onResume();
                }
                return true;
            }
            if (!this.f17599d.isEmpty() && this.f17596a != null) {
                throw new RuntimeException("Single download and group download exist at the same time.");
            }
        }
        return false;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager b(String destPath) {
        this.f17604i.f17612c = destPath;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public String c() {
        return this.f17604i.f17612c;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean d(String url, String destPath, boolean autoDecomp, int maxRetry, int readTimeout, int connTimeout, l policy, IDownloadManager.a callback) {
        return k(url, destPath, autoDecomp, 1, maxRetry, readTimeout, connTimeout, policy, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean e(String url, boolean autoDecomp, int concurrence, IDownloadManager.a callback) {
        return f(url, null, autoDecomp, concurrence, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean f(String url, String destPath, boolean autoDecomp, int concurrence, IDownloadManager.a callback) {
        return k(url, destPath, autoDecomp, concurrence, 1, 0, 0, f17595n, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager g(String url) {
        return z(url, null);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public String getUrl() {
        return this.f17604i.f17611b;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean h(String url, String destPath, boolean autoDecomp, IDownloadManager.a callback) {
        return f(url, destPath, autoDecomp, 1, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public int i() {
        return this.f17604i.f17615f;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean j(String url, int concurrence, IDownloadManager.a callback) {
        return w(url, null, concurrence, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean k(String url, String destPath, boolean autoDecomp, int concurrence, int maxRetry, int readTimeout, int connTimeout, l policy, IDownloadManager.a callback) {
        IDownloadManager.State state = IDownloadManager.State.Downloading;
        IDownloadManager.State state2 = this.f17603h;
        if (state == state2 || IDownloadManager.State.Paused == state2) {
            return false;
        }
        if (this.f17601f != null) {
            throw new RuntimeException("A group download task exists as you start a single download task.");
        }
        sb.a aVar = new sb.a();
        this.f17596a = new sb.b(aVar);
        HttpRequest a11 = aVar.a();
        a11.C(url);
        a11.z(HttpRequest.HTTP_METHOD.GET);
        a11.w(destPath);
        a11.s(autoDecomp);
        a11.y(maxRetry);
        a11.B(readTimeout);
        a11.v(connTimeout);
        a11.u(concurrence);
        a11.t(policy);
        this.f17602g = callback;
        c cVar = this.f17598c;
        if (cVar != null && !cVar.r()) {
            this.f17598c.d();
            this.f17596a.b().b().f88210a = false;
            this.f17596a.b().b().f88211b.f97940a = false;
        }
        c O = O();
        this.f17598c = O;
        O.g(this.f17596a);
        this.f17603h = state;
        IDownloadManager.a aVar2 = this.f17602g;
        if (aVar2 == null) {
            return true;
        }
        aVar2.onStart();
        return true;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager.State l() {
        return this.f17603h;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean m(String url, String destPath, IDownloadManager.a callback) {
        return f(url, destPath, true, 1, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager n(int connTimeout) {
        this.f17604i.f17617h = connTimeout;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public int o() {
        return this.f17604i.f17614e;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public int p() {
        return this.f17604i.f17616g;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean pause() {
        if (IDownloadManager.State.Downloading != this.f17603h) {
            return false;
        }
        c cVar = this.f17598c;
        if (cVar != null && this.f17601f == null) {
            cVar.d();
            this.f17603h = IDownloadManager.State.Paused;
            return true;
        }
        e eVar = this.f17601f;
        if (eVar != null && cVar == null) {
            eVar.d();
            this.f17603h = IDownloadManager.State.Paused;
            return true;
        }
        if (cVar == null || eVar == null) {
            return false;
        }
        throw new RuntimeException("Single download and group download exist at the same time.");
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean q(String url, IDownloadManager.a callback) {
        return j(url, 1, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager r(IDownloadManager.a callback) {
        this.f17604i.f17619j = callback;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager s(int maxRetry) {
        this.f17604i.f17615f = maxRetry;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean start() {
        f fVar = this.f17604i;
        String str = fVar.f17611b;
        if (str != null) {
            return k(str, fVar.f17612c, fVar.f17613d, fVar.f17614e, fVar.f17615f, fVar.f17616g, fVar.f17617h, fVar.f17618i, fVar.f17619j);
        }
        if (!fVar.f17610a.isEmpty()) {
            IDownloadManager.State state = IDownloadManager.State.Downloading;
            IDownloadManager.State state2 = this.f17603h;
            if (state != state2 && IDownloadManager.State.Paused != state2) {
                if (this.f17598c != null) {
                    throw new RuntimeException("A single download task exists as you start a group download task.");
                }
                for (Map.Entry<String, String> entry : this.f17604i.f17610a.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    sb.a aVar = new sb.a();
                    sb.b bVar = new sb.b(aVar);
                    HttpRequest a11 = aVar.a();
                    a11.C(key);
                    a11.z(HttpRequest.HTTP_METHOD.GET);
                    a11.w(value);
                    a11.s(this.f17604i.f17613d);
                    a11.y(this.f17604i.f17615f);
                    a11.B(this.f17604i.f17616g);
                    a11.v(this.f17604i.f17617h);
                    a11.u(this.f17604i.f17614e);
                    a11.t(this.f17604i.f17618i);
                    this.f17599d.add(bVar);
                }
                this.f17602g = this.f17604i.f17619j;
                e eVar = this.f17601f;
                if (eVar != null && !eVar.r()) {
                    this.f17601f.d();
                    for (sb.b bVar2 : this.f17599d) {
                        bVar2.b().b().f88210a = false;
                        bVar2.b().b().f88211b.f97940a = false;
                    }
                }
                e P = P();
                this.f17601f = P;
                P.g(this.f17599d);
                this.f17603h = IDownloadManager.State.Downloading;
                IDownloadManager.a aVar2 = this.f17602g;
                if (aVar2 != null) {
                    aVar2.onStart();
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean stop() {
        IDownloadManager.State state = IDownloadManager.State.Downloading;
        IDownloadManager.State state2 = this.f17603h;
        if (state == state2 || IDownloadManager.State.Paused == state2) {
            c cVar = this.f17598c;
            if (cVar != null && this.f17601f == null) {
                cVar.d();
                this.f17598c = null;
                this.f17596a = null;
                this.f17603h = IDownloadManager.State.Stopped;
                f fVar = this.f17604i;
                fVar.f17611b = null;
                fVar.f17612c = null;
                fVar.f17613d = true;
                fVar.f17614e = 1;
                fVar.f17615f = 1;
                fVar.f17616g = 0;
                fVar.f17617h = 0;
                fVar.f17619j = null;
                fVar.f17618i = null;
                return true;
            }
            e eVar = this.f17601f;
            if (eVar != null && cVar == null) {
                eVar.d();
                this.f17601f = null;
                this.f17599d.clear();
                this.f17603h = IDownloadManager.State.Stopped;
                this.f17604i.f17610a.clear();
                f fVar2 = this.f17604i;
                fVar2.f17610a = null;
                fVar2.f17613d = true;
                fVar2.f17614e = 1;
                fVar2.f17615f = 1;
                fVar2.f17616g = 0;
                fVar2.f17617h = 0;
                fVar2.f17619j = null;
                fVar2.f17618i = null;
                return true;
            }
            if (cVar != null && eVar != null) {
                throw new RuntimeException("Single download and group download exist at the same time.");
            }
        }
        return false;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager t(String url) {
        this.f17604i.f17611b = url;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager u(int concurrence) {
        this.f17604i.f17614e = concurrence;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public int v() {
        return this.f17604i.f17617h;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public boolean w(String url, String destPath, int concurrence, IDownloadManager.a callback) {
        return f(url, destPath, true, concurrence, callback);
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager x(l policy) {
        this.f17604i.f17618i = policy;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager y(int readTimeout) {
        this.f17604i.f17616g = readTimeout;
        return this;
    }

    @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager
    public IDownloadManager z(String url, String destPath) {
        this.f17604i.f17610a.put(url, destPath);
        return this;
    }
}
