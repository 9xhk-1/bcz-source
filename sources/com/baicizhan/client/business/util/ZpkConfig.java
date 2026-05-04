package com.baicizhan.client.business.util;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface ZpkConfig {
    public static final String SCHEME_ZPK = "baicizhan_zpk";

    static Uri getImageUri(String zpkPath, String imageName) {
        return getZpkFileUri(zpkPath, imageName);
    }

    static Uri getZpkFileUri(String zpkPath, String fileName) {
        return new Uri.Builder().scheme(SCHEME_ZPK).appendPath(zpkPath).query(fileName).build();
    }

    static Uri getZpkUriByName(String zpkName, String fileName, int bookId) {
        return getZpkFileUri(ZPackUtils.getZpkFileByName(bookId, zpkName).getAbsolutePath(), fileName);
    }

    default boolean match(Uri uri) {
        return (!SCHEME_ZPK.equals(uri.getScheme()) || TextUtils.isEmpty(uri.getPath()) || TextUtils.isEmpty(uri.getQuery())) ? false : true;
    }
}
