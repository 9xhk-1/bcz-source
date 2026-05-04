package com.baicizhan.client.business.webview.sdk;

import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.webview.sdk.VoiceMgr;
import java.io.File;
import java.util.AbstractMap;
import ub.a;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class VoiceMgr {
    public static final String DOWNLOAD_CACHE;
    public static final String TAG = "VoiceManager";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.webview.sdk.VoiceMgr$1, reason: invalid class name */
    public class AnonymousClass1 implements p<String, rx.c<AbstractMap.SimpleEntry<String, Integer>>> {
        public AnonymousClass1() {
        }

        public static /* synthetic */ AbstractMap.SimpleEntry a(String str, File file) {
            return new AbstractMap.SimpleEntry(str, 1);
        }

        public static /* synthetic */ AbstractMap.SimpleEntry b(String str, Throwable th2) {
            return new AbstractMap.SimpleEntry(str, 0);
        }

        @Override // wb0.p
        public rx.c<AbstractMap.SimpleEntry<String, Integer>> call(final String s11) {
            return H5FileCache.inst().exists(String.valueOf(s11.hashCode())) ? rx.c.M2(new AbstractMap.SimpleEntry(s11, 1)) : VoiceMgr.this.downloadObservable(s11).c3(new p() { // from class: com.baicizhan.client.business.webview.sdk.g
                @Override // wb0.p
                public final Object call(Object obj) {
                    return VoiceMgr.AnonymousClass1.a(s11, (File) obj);
                }
            }).W3(new p() { // from class: com.baicizhan.client.business.webview.sdk.h
                @Override // wb0.p
                public final Object call(Object obj) {
                    return VoiceMgr.AnonymousClass1.b(s11, (Throwable) obj);
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Instance {
        static VoiceMgr INSTANCE = new VoiceMgr();

        private Instance() {
        }
    }

    static {
        File baicizhanFile = PathUtil.getBaicizhanFile("webview/download_cache");
        if (baicizhanFile == null) {
            DOWNLOAD_CACHE = null;
        } else {
            DOWNLOAD_CACHE = baicizhanFile.getAbsolutePath();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.c<File> downloadObservable(String url) {
        return rx.c.M2(url).c3(new p<String, File>() { // from class: com.baicizhan.client.business.webview.sdk.VoiceMgr.2
            @Override // wb0.p
            public File call(String s11) {
                if (s11.startsWith("http")) {
                    try {
                        return VoiceMgr.this.synDownload(s11);
                    } catch (Exception e11) {
                        qb.c.c("VoiceManager", "DOWNLOAD FAILED " + s11, e11);
                        throw vb0.a.c(e11);
                    }
                }
                File file = new File(s11);
                if (file.exists() && file.length() > 0) {
                    return file;
                }
                throw new RuntimeException("file not exists: " + s11);
            }
        }).w5(bc0.c.e());
    }

    public static VoiceMgr getInstance() {
        return Instance.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ rx.c lambda$loadVoice$0(String str, String str2, H5FileCache h5FileCache) {
        try {
            return h5FileCache.exists(str) ? rx.c.M2(h5FileCache.getFile(str)) : downloadObservable(str2);
        } catch (Exception e11) {
            qb.c.c("VoiceManager", "", e11);
            return rx.c.T1(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File synDownload(String url) {
        H5FileCache inst = H5FileCache.inst();
        File file = new File(DOWNLOAD_CACHE + File.separator + System.currentTimeMillis() + "_" + url.hashCode());
        file.delete();
        ub.a a11 = new a.b().a();
        a11.D(3000);
        a11.G(5000);
        a11.F(2);
        a11.H(url);
        a11.E(file.getAbsolutePath());
        if (!a11.I() || !file.exists() || file.length() <= 0) {
            qb.c.i("VoiceManager", "download failed %d, %s", Integer.valueOf(a11.r()), url);
            throw new RuntimeException("down load failed");
        }
        inst.save(String.valueOf(url.hashCode()), file);
        File file2 = inst.getFile(String.valueOf(url.hashCode()));
        qb.c.i("VoiceManager", "down success [%s, %s]", url, file2.getAbsoluteFile());
        return file2;
    }

    public rx.c<File> loadVoice(final String url) {
        H5FileCache inst = H5FileCache.inst();
        final String valueOf = String.valueOf(url.hashCode());
        return rx.c.M2(inst).b2(new p() { // from class: com.baicizhan.client.business.webview.sdk.f
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c lambda$loadVoice$0;
                lambda$loadVoice$0 = VoiceMgr.this.lambda$loadVoice$0(valueOf, url, (H5FileCache) obj);
                return lambda$loadVoice$0;
            }
        }).w5(bc0.c.e());
    }

    public rx.c<AbstractMap.SimpleEntry<String, Integer>> preload(final String[] urls) {
        return rx.c.y2(urls).B1().b2(new AnonymousClass1()).w5(bc0.c.e());
    }

    private VoiceMgr() {
    }
}
