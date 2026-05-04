package gb;

import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.framework.network.http.download.IDownloadManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f53539a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, com.baicizhan.client.framework.network.http.download.a> f53540b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Double> f53541c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Map<String, b> f53542d = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(double progress);

        void onError(String msg);

        void onStart();

        void onSuccess(String path);
    }

    public a(String tag) {
        this.f53539a = tag;
    }

    public void d(String id2) {
        com.baicizhan.client.framework.network.http.download.a aVar = this.f53540b.get(id2);
        if (aVar != null) {
            aVar.stop();
        }
        this.f53541c.remove(id2);
        this.f53540b.remove(id2);
    }

    public void e(final String id2, final String url, final vb.a rl2, final b listener) {
        File baicizhanFile = PathUtil.getBaicizhanFile("Download/" + id2 + ".temp");
        String absolutePath = baicizhanFile.getAbsolutePath();
        boolean mkdirs = !baicizhanFile.getParentFile().exists() ? baicizhanFile.getParentFile().mkdirs() : false;
        com.baicizhan.client.framework.network.http.download.a aVar = new com.baicizhan.client.framework.network.http.download.a();
        if (mkdirs) {
            aVar.b(absolutePath);
        }
        aVar.t(url).n(3000).y(5000).s(2).r(new C0631a(id2, rl2, listener)).start();
        this.f53540b.put(id2, aVar);
    }

    public Double f(String id2, vb.a rl2) {
        try {
            if (rl2.q(false) && rl2.j(id2) != null) {
                Double valueOf = Double.valueOf(2.0d);
                rl2.b();
                return valueOf;
            }
            Double d11 = this.f53541c.get(id2);
            rl2.b();
            return d11;
        } catch (Exception unused) {
            rl2.b();
            return null;
        } catch (Throwable th2) {
            rl2.b();
            throw th2;
        }
    }

    public void g(String id2, b listener) {
        this.f53542d.put(id2, listener);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gb.a$a, reason: collision with other inner class name */
    public class C0631a implements IDownloadManager.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f53543a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vb.a f53544b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f53545c;

        public C0631a(final String val$id, final vb.a val$rl, final b val$listener) {
            this.f53543a = val$id;
            this.f53544b = val$rl;
            this.f53545c = val$listener;
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onComplete(boolean success, String target, int errCode) {
            File file;
            a.this.f53541c.remove(this.f53543a);
            a.this.f53540b.remove(this.f53543a);
            try {
                if (success) {
                    try {
                        file = new File(target);
                    } catch (Exception e11) {
                        ((b) a.this.f53542d.get(this.f53543a)).onError(e11.getMessage());
                    }
                    if (!this.f53544b.q(true) || !this.f53544b.r(this.f53543a, file, true)) {
                        throw new IOException("下载的音频文件无法写入资源库");
                    }
                    ((b) a.this.f53542d.get(this.f53543a)).onSuccess(this.f53544b.j(this.f53543a).getAbsolutePath());
                } else {
                    ((b) a.this.f53542d.get(this.f53543a)).onError("下载失败");
                }
                a.this.f53542d.remove(this.f53543a);
            } finally {
                this.f53544b.b();
            }
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onProgress(int i11) {
            double d11 = i11 / 100.0d;
            a.this.f53541c.put(this.f53543a, Double.valueOf(d11));
            ((b) a.this.f53542d.get(this.f53543a)).a(d11);
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onStart() {
            a.this.f53541c.put(this.f53543a, Double.valueOf(0.0d));
            ((b) a.this.f53542d.put(this.f53543a, this.f53545c)).onStart();
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onPause() {
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onResume() {
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onStartDecompress() {
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onStop() {
        }

        @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
        public void onGroupComplete(boolean b11, List<String> list, int i11) {
        }
    }
}
