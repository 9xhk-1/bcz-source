package pq;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81108a = "Utils";

    /* renamed from: b, reason: collision with root package name */
    public static final int f81109b = 4096;

    /* renamed from: c, reason: collision with root package name */
    public static final String f81110c = "DEFAULT_INSTANCE";

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e(f81108a, "Exception when closing the 'Closeable'.");
            }
        }
    }

    public static void b(Reader reader, Writer writer) throws IOException {
        c(reader, writer, new char[4096]);
    }

    public static void c(Reader reader, Writer writer, char[] cArr) throws IOException {
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return;
            } else {
                writer.write(cArr, 0, read);
            }
        }
    }

    public static Map<String, String> d(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(e(entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public static String e(String str) {
        int i11 = 0;
        if (str.length() > 0) {
            while (str.charAt(i11) == '/') {
                i11++;
            }
        }
        return "/" + str.substring(i11);
    }

    public static mq.b f(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return mq.b.f73633c;
                }
                if (str2.contains("connect-dre")) {
                    return mq.b.f73634d;
                }
                if (str2.contains("connect-drru")) {
                    return mq.b.f73635e;
                }
                if (str2.contains("connect-dra")) {
                    return mq.b.f73636f;
                }
            }
            return mq.b.f73632b;
        }
        switch (str) {
            case "CN":
                return mq.b.f73633c;
            case "DE":
                return mq.b.f73634d;
            case "RU":
                return mq.b.f73635e;
            case "SG":
                return mq.b.f73636f;
            default:
                return mq.b.f73632b;
        }
    }

    public static String g(InputStream inputStream, String str) throws UnsupportedEncodingException, IOException {
        StringWriter stringWriter = new StringWriter();
        b(new InputStreamReader(inputStream, str), stringWriter);
        return stringWriter.toString();
    }
}
