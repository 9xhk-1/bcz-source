package com.mob.tools.network;

import com.mob.commons.n;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ReflectHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes7.dex */
public class HttpConnectionImpl implements HttpConnection {

    /* renamed from: a, reason: collision with root package name */
    private Object f41316a;

    static {
        try {
            ReflectHelper.importClass("org.apache.http.HttpResponse");
            ReflectHelper.importClass("org.apache.http.Header");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public HttpConnectionImpl(Object obj) {
        this.f41316a = obj;
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getErrorStream() throws IOException {
        return getInputStream();
    }

    @Override // com.mob.tools.network.HttpConnection
    public Map<String, List<String>> getHeaderFields() throws IOException {
        try {
            HashMap hashMap = new HashMap();
            Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(this.f41316a, "getAllHeaders", new Object[0]);
            if (invokeInstanceMethod != null) {
                int intValue = ((Integer) ReflectHelper.getInstanceField(invokeInstanceMethod, n.a("006)dcCh^cjee5cb"))).intValue();
                Object[] objArr = new Object[intValue];
                System.arraycopy(invokeInstanceMethod, 0, objArr, 0, intValue);
                for (int i11 = 0; i11 < intValue; i11++) {
                    Object obj = objArr[i11];
                    String str = (String) ReflectHelper.invokeInstanceMethod(obj, n.a("007AeeThc0dece.kh"), new Object[0]);
                    String str2 = (String) ReflectHelper.invokeInstanceMethod(obj, "getValue", new Object[0]);
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put(str, Arrays.asList(str2.split(",")));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getInputStream() throws IOException {
        try {
            return (InputStream) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(this.f41316a, "getEntity", new Object[0]), "getContent", new Object[0]);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    @Override // com.mob.tools.network.HttpConnection
    public int getResponseCode() throws IOException {
        try {
            return ((Integer) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(this.f41316a, "getStatusLine", new Object[0]), "getStatusCode", new Object[0])).intValue();
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
