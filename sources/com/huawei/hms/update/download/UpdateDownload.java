package com.huawei.hms.update.download;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.UpdateConstants;
import com.huawei.hms.update.download.api.IOtaUpdate;
import com.huawei.hms.update.download.api.IUpdateCallback;
import com.huawei.hms.update.download.api.UpdateInfo;
import com.huawei.hms.update.download.api.UpdateStatus;
import com.huawei.hms.update.http.CanceledException;
import com.huawei.hms.update.http.HttpRequestHelper;
import com.huawei.hms.update.http.IHttpRequestHelper;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateDownload implements IOtaUpdate {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36466a;

    /* renamed from: b, reason: collision with root package name */
    private final IHttpRequestHelper f36467b = new HttpRequestHelper();

    /* renamed from: c, reason: collision with root package name */
    private final DownloadRecord f36468c = new DownloadRecord();

    /* renamed from: d, reason: collision with root package name */
    private IUpdateCallback f36469d;

    /* renamed from: e, reason: collision with root package name */
    private File f36470e;

    public UpdateDownload(Context context) {
        this.f36466a = context.getApplicationContext();
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public void cancel() {
        HMSLog.i("UpdateDownload", "Enter cancel.");
        a((IUpdateCallback) null);
        this.f36467b.cancel();
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public void downloadPackage(IUpdateCallback iUpdateCallback, UpdateInfo updateInfo) {
        Checker.checkNonNull(iUpdateCallback, "callback must not be null.");
        HMSLog.i("UpdateDownload", "Enter downloadPackage.");
        a(iUpdateCallback);
        if (updateInfo == null || !updateInfo.isValid()) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Invalid update info.");
            a(2201, 0, 0);
            return;
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Invalid external storage for downloading file.");
            a(UpdateStatus.DOWNLOAD_NO_STORAGE, 0, 0);
            return;
        }
        String str = updateInfo.mPackageName;
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
            a(2201, 0, 0);
            return;
        }
        File localFile = UpdateProvider.getLocalFile(this.f36466a, str + UpdateConstants.LOCAL_APK_FILE);
        this.f36470e = localFile;
        if (localFile == null) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Failed to get local file for downloading.");
            a(UpdateStatus.DOWNLOAD_NO_STORAGE, 0, 0);
            return;
        }
        File parentFile = localFile.getParentFile();
        if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
            HMSLog.e("UpdateDownload", "In downloadPackage, Failed to create directory for downloading file.");
            a(2201, 0, 0);
        } else if (parentFile.getUsableSpace() < updateInfo.mSize * 3) {
            HMSLog.e("UpdateDownload", "In downloadPackage, No space for downloading file.");
            a(UpdateStatus.DOWNLOAD_NO_SPACE, 0, 0);
        } else {
            try {
                a(updateInfo);
            } catch (CanceledException unused) {
                HMSLog.w("UpdateDownload", "In downloadPackage, Canceled to download the update file.");
                a(2101, 0, 0);
            }
        }
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public Context getContext() {
        return this.f36466a;
    }

    private synchronized void a(IUpdateCallback iUpdateCallback) {
        this.f36469d = iUpdateCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i11, int i12, int i13) {
        IUpdateCallback iUpdateCallback = this.f36469d;
        if (iUpdateCallback != null) {
            iUpdateCallback.onDownloadPackage(i11, i12, i13, this.f36470e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|(2:12|(2:14|(3:16|17|18)(1:19))(4:45|21|22|(2:29|(3:31|32|33)(3:34|35|36))(3:26|27|28)))(1:46)|20|21|22|(1:24)|29|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        r14 = r0;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        com.huawei.hms.support.log.HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Failed to download." + r14.getMessage());
        a(2201, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        r14 = r0;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
    
        r13.f36467b.close();
        com.huawei.hms.utils.IOUtils.closeQuietly((java.io.OutputStream) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0134, code lost:
    
        throw r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5 A[Catch: all -> 0x00e3, IOException -> 0x00e7, TRY_LEAVE, TryCatch #4 {IOException -> 0x00e7, all -> 0x00e3, blocks: (B:22:0x00a5, B:26:0x00c3, B:29:0x00eb, B:31:0x00f5, B:34:0x0103), top: B:21:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103 A[Catch: all -> 0x00e3, IOException -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x00e7, all -> 0x00e3, blocks: (B:22:0x00a5, B:26:0x00c3, B:29:0x00eb, B:31:0x00f5, B:34:0x0103), top: B:21:0x00a5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.huawei.hms.update.download.api.UpdateInfo r14) throws com.huawei.hms.update.http.CanceledException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.update.download.UpdateDownload.a(com.huawei.hms.update.download.api.UpdateInfo):void");
    }

    private RandomFileOutputStream a(File file, final int i11, final String str) throws IOException {
        return new RandomFileOutputStream(file, i11) { // from class: com.huawei.hms.update.download.UpdateDownload.1

            /* renamed from: b, reason: collision with root package name */
            private long f36471b = 0;

            /* renamed from: c, reason: collision with root package name */
            private int f36472c;

            {
                this.f36472c = UpdateDownload.this.f36468c.a();
            }

            private void a(int i12) {
                UpdateDownload.this.f36468c.update(UpdateDownload.this.getContext(), i12, str);
                UpdateDownload.this.a(2100, i12, i11);
            }

            @Override // com.huawei.hms.update.download.RandomFileOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i12, int i13) throws IOException {
                super.write(bArr, i12, i13);
                int i14 = this.f36472c + i13;
                this.f36472c = i14;
                if (i14 > 209715200) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - this.f36471b) > 1000) {
                    this.f36471b = currentTimeMillis;
                    a(this.f36472c);
                }
                int i15 = this.f36472c;
                if (i15 == i11) {
                    a(i15);
                }
            }
        };
    }
}
