package com.baicizhan.client.business.util;

import android.net.Uri;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import rx.c;
import ub.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WebviewCacheTask {
    private static final String INDEX_NAME = "index.html";
    public static final String MODULE_LECTURE_ROOM = "lecture_room";
    private static final String WV_HOME = "webview";
    private ub.a mDM = new a.b().f(3000).i(5000).h(2).a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Result {
        public String path;
        public int progress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteRedundant(String moduleHome, int limit) {
        File file = new File(moduleHome);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = (listFiles.length - limit) + 1;
            if (length > 0) {
                List asList = Arrays.asList(listFiles);
                Collections.sort(asList, new Comparator<File>() { // from class: com.baicizhan.client.business.util.WebviewCacheTask.2
                    @Override // java.util.Comparator
                    public int compare(File lhs, File rhs) {
                        return (int) (lhs.lastModified() - rhs.lastModified());
                    }
                });
                for (File file2 : asList.subList(0, length)) {
                    if (file2.exists() && file2.isDirectory()) {
                        FileUtils.deleteContents(file2);
                    } else if (file2.exists() && !file2.delete()) {
                        qb.c.d("", "delete older file failed [%s]", file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void download(String url, String destPath, final Result result, final qb0.g<? super Result> subscriber) throws Exception {
        this.mDM.H(url);
        this.mDM.E(destPath);
        this.mDM.B(new a.c() { // from class: com.baicizhan.client.business.util.WebviewCacheTask.3
            @Override // ub.a.c
            public void onProgress(int progress) {
                Result result2 = result;
                result2.progress = progress;
                subscriber.onNext(result2);
            }

            @Override // ub.a.c
            public void onStart() {
            }

            @Override // ub.a.c
            public void onStartDecompress() {
            }

            @Override // ub.a.c
            public void onStop() {
            }

            @Override // ub.a.c
            public void onComplete(boolean success, String destPath2, int errCode) {
            }
        });
        if (this.mDM.I()) {
            new yb.f().f(new File(destPath), null);
            return;
        }
        throw new RuntimeException("download webview file failed, error code: " + this.mDM.r() + ", path: " + this.mDM.s());
    }

    public rx.c<Result> start(final String url, final String module, final int limit) {
        return rx.c.j1(new c.a<Result>() { // from class: com.baicizhan.client.business.util.WebviewCacheTask.1
            @Override // wb0.b
            public void call(qb0.g<? super Result> subscriber) {
                try {
                    Result result = new Result();
                    String file = new URL(url).getFile();
                    String str = File.separator;
                    int lastIndexOf = file.lastIndexOf(str);
                    if (lastIndexOf >= 0) {
                        file = file.substring(lastIndexOf + 1);
                    }
                    if (file.indexOf(".zip") == file.length() - 4) {
                        file = file.substring(0, file.length() - 4);
                    }
                    String str2 = PathUtil.getBaicizhanAppRoot() + str + WebviewCacheTask.WV_HOME + str + module;
                    String str3 = str2 + str + file;
                    File file2 = new File(str3 + str + "index.html");
                    if (file2.exists() && !file2.isDirectory()) {
                        result.path = Uri.fromFile(file2).toString();
                        subscriber.onNext(result);
                        subscriber.onCompleted();
                        return;
                    }
                    WebviewCacheTask.this.deleteRedundant(str2, limit);
                    WebviewCacheTask.this.download(url, str3 + ".zip", result, subscriber);
                    result.progress = 100;
                    result.path = Uri.fromFile(file2).toString();
                    subscriber.onNext(result);
                    subscriber.onCompleted();
                } catch (Throwable th2) {
                    subscriber.onError(th2);
                }
            }
        }).w5(bc0.c.e());
    }

    public void stop() {
        this.mDM.J();
    }
}
