package com.huawei.hms.update.http;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface IHttpRequestHelper {
    public static final int HTTP_OK = 200;
    public static final int HTTP_PARTIAL = 206;

    void cancel();

    void close();

    int get(String str, OutputStream outputStream, int i11, int i12, Context context) throws IOException, CanceledException;

    int get(String str, OutputStream outputStream, Context context) throws IOException, CanceledException;

    int post(String str, InputStream inputStream, OutputStream outputStream, Context context) throws IOException, CanceledException;
}
