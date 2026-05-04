package com.baicizhan.client.framework.network.http.download;

import java.util.List;
import java.util.Map;
import xb.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface IDownloadManager {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        None,
        Downloading,
        Paused,
        Stopped,
        Successed,
        Failed
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void onComplete(boolean success, String target, int errCode);

        void onGroupComplete(boolean success, List<String> targets, int errCode);

        void onPause();

        void onProgress(int progress);

        void onResume();

        void onStart();

        void onStartDecompress();

        void onStop();
    }

    boolean A(String url, boolean autoDecomp, a callback);

    boolean B();

    IDownloadManager C(boolean autoDecomp);

    Map<String, String> D();

    boolean a();

    IDownloadManager b(String destPath);

    String c();

    boolean d(String url, String destPath, boolean autoDecomp, int maxRetry, int readTimeout, int connTimeout, l policy, a callback);

    boolean e(String url, boolean autoDecomp, int concurrence, a callback);

    boolean f(String url, String destPath, boolean autoDecomp, int concurrence, a callback);

    IDownloadManager g(String url);

    String getUrl();

    boolean h(String url, String destPath, boolean autoDecomp, a callback);

    int i();

    boolean j(String url, int concurrence, a callback);

    boolean k(String url, String destPath, boolean autoDecomp, int concurrence, int maxRetry, int readTimeout, int connTimeout, l policy, a callback);

    State l();

    boolean m(String url, String destPath, a callback);

    IDownloadManager n(int connTimeout);

    int o();

    int p();

    boolean pause();

    boolean q(String url, a callback);

    IDownloadManager r(a callback);

    IDownloadManager s(int maxRetry);

    boolean start();

    boolean stop();

    IDownloadManager t(String url);

    IDownloadManager u(int concurrence);

    int v();

    boolean w(String url, String destPath, int concurrence, a callback);

    IDownloadManager x(l policy);

    IDownloadManager y(int readTimeout);

    IDownloadManager z(String url, String destPath);
}
