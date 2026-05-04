package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.AgHmsUpdateInfo;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.AbsUpdateWizard;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HEX;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class InstallerAdapter {
    public static String sHmsApkHash;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream, java.lang.String] */
    private boolean a(Activity activity) {
        InputStream inputStream;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.huawei.hms");
        String str = File.separator;
        sb2.append(str);
        sb2.append("hms.apk");
        ?? sb3 = sb2.toString();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                inputStream = activity.getApplicationContext().getAssets().open(sb3);
                try {
                    if (inputStream == null) {
                        HMSLog.e("InstallerAdapter", "open hms.apk error, inputStream is null");
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((OutputStream) null);
                        return false;
                    }
                    File file = new File(activity.getApplicationContext().getExternalCacheDir().getCanonicalPath() + str + "hms" + str + "hms.apk");
                    if (file.getParentFile() != null && !file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                        HMSLog.e("InstallerAdapter", "failed to create the directory for storing the HMS");
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((OutputStream) null);
                        return false;
                    }
                    if (!file.exists() && !file.createNewFile()) {
                        HMSLog.e("InstallerAdapter", "failed to create the dest file");
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((OutputStream) null);
                        return false;
                    }
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        int i11 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            i11 += read;
                            messageDigest.update(bArr, 0, read);
                            fileOutputStream2.write(bArr, 0, read);
                        }
                        if (i11 > 0) {
                            sHmsApkHash = HEX.encodeHexString(messageDigest.digest(), true);
                            HMSLog.i("InstallerAdapter", "hms.apk hash: " + sHmsApkHash);
                        }
                        HMSLog.i("InstallerAdapter", "copy hms.apk, size: " + i11);
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((OutputStream) fileOutputStream2);
                        return true;
                    } catch (IOException e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        HMSLog.e("InstallerAdapter", "copy assets hms.apk error: " + e.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((OutputStream) fileOutputStream);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        HMSLog.e("InstallerAdapter", "copy assets hms.apk throwable: " + th.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((OutputStream) fileOutputStream);
                        return false;
                    }
                } catch (IOException e12) {
                    e = e12;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                IOUtils.closeQuietly((InputStream) sb3);
                IOUtils.closeQuietly((OutputStream) null);
                throw th4;
            }
        } catch (IOException e13) {
            e = e13;
            inputStream = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
    }

    public void checkHmsUpdateInfo(Context context) {
        if (context == null) {
            HMSLog.e("InstallerAdapter", "checkHmsUpdateInfo: context is null");
        } else {
            HMSLog.i("InstallerAdapter", "enter checkHmsUpdateInfo <context>");
            AgHmsUpdateInfo.getInstance().checkHmsAuthAndUpdateInfo(context);
        }
    }

    public UpdateBean setUpdateBean(Activity activity, int i11, boolean z11) {
        String str;
        if (activity != null) {
            str = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            if (TextUtils.isEmpty(str)) {
                str = "com.huawei.hwid";
            }
        } else {
            HMSLog.w("InstallerAdapter", "activity is null");
            str = null;
        }
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        updateBean.setResolutionInstallHMS(z11);
        HMSLog.i("InstallerAdapter", "target HMS Core packageName is " + str);
        updateBean.setClientPackageName(str);
        updateBean.setClientVersionCode(i11);
        updateBean.setClientAppId("C10132067");
        if (ResourceLoaderUtil.getmContext() == null && activity != null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
        return updateBean;
    }

    public void startUpdateHms(Activity activity, UpdateBean updateBean, int i11) {
        if (SystemUtils.isEMUI() || !a(activity)) {
            HMSLog.i("InstallerAdapter", "old framework HMSCore upgrade process");
            UpdateManager.startUpdate(activity, i11, updateBean);
        } else {
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, AbsUpdateWizard.getClassName(8));
            intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
            activity.startActivityForResult(intentStartBridgeActivity, i11);
        }
    }

    public void checkHmsUpdateInfo(Activity activity) {
        if (activity == null) {
            HMSLog.e("InstallerAdapter", "checkHmsUpdateInfo: activity is null");
        } else {
            HMSLog.i("InstallerAdapter", "enter checkHmsUpdateInfo <activity>");
            AgHmsUpdateInfo.getInstance().checkHmsAuthAndUpdateInfo(activity);
        }
    }
}
