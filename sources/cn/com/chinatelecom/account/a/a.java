package cn.com.chinatelecom.account.a;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8827a = "a";

    public static String a(Context context, String str, String str2) {
        InputStream inputStream;
        InputStream inputStream2;
        String str3 = "";
        BufferedReader bufferedReader = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestProperty("accept", "*/*");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
                if (TextUtils.isEmpty(str2)) {
                    httpURLConnection.connect();
                } else {
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                    dataOutputStream.write(str2.getBytes("UTF-8"));
                    dataOutputStream.flush();
                    dataOutputStream.close();
                }
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream2 = httpURLConnection.getInputStream();
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream2));
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb2.append(readLine);
                                sb2.append("\n");
                            } catch (Throwable th2) {
                                inputStream = inputStream2;
                                th = th2;
                                bufferedReader = bufferedReader2;
                                try {
                                    th.printStackTrace();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    return str3;
                                } catch (Throwable th3) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                            throw th3;
                                        }
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th3;
                                }
                            }
                        }
                        str3 = sb2.toString();
                        bufferedReader = bufferedReader2;
                    } catch (Throwable th4) {
                        inputStream = inputStream2;
                        th = th4;
                    }
                } else {
                    inputStream2 = null;
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
        return str3;
    }
}
