package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j implements d<InputStream> {

    /* renamed from: g, reason: collision with root package name */
    public static final String f28750g = "HttpUrlFetcher";

    /* renamed from: h, reason: collision with root package name */
    public static final int f28751h = 5;

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final String f28752i = "Location";

    /* renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    public static final b f28753j = new a();

    /* renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public static final int f28754k = -1;

    /* renamed from: a, reason: collision with root package name */
    public final pk.h f28755a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28756b;

    /* renamed from: c, reason: collision with root package name */
    public final b f28757c;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f28758d;

    /* renamed from: e, reason: collision with root package name */
    public InputStream f28759e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f28760f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(pk.h hVar, int i11) {
        this(hVar, i11, f28753j);
    }

    public static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            if (!Log.isLoggable(f28750g, 3)) {
                return -1;
            }
            Log.d(f28750g, "Failed to get a response code", e11);
            return -1;
        }
    }

    public static boolean d(int i11) {
        return i11 / 100 == 2;
    }

    public static boolean e(int i11) {
        return i11 / 100 == 3;
    }

    public final HttpURLConnection a(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a11 = this.f28757c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a11.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a11.setConnectTimeout(this.f28756b);
            a11.setReadTimeout(this.f28756b);
            a11.setUseCaches(false);
            a11.setDoInput(true);
            a11.setInstanceFollowRedirects(false);
            return a11;
        } catch (IOException e11) {
            throw new HttpException("URL.openConnection threw", 0, e11);
        }
    }

    public final InputStream c(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f28759e = fl.c.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f28750g, 3)) {
                    Log.d(f28750g, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f28759e = httpURLConnection.getInputStream();
            }
            return this.f28759e;
        } catch (IOException e11) {
            throw new HttpException("Failed to obtain InputStream", b(httpURLConnection), e11);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f28760f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.f28759e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f28758d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f28758d = null;
    }

    public final InputStream f(URL url, int i11, URL url2, Map<String, String> map) throws HttpException {
        if (i11 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection a11 = a(url, map);
        this.f28758d = a11;
        try {
            a11.connect();
            this.f28759e = this.f28758d.getInputStream();
            if (this.f28760f) {
                return null;
            }
            int b11 = b(this.f28758d);
            if (d(b11)) {
                return c(this.f28758d);
            }
            if (!e(b11)) {
                if (b11 == -1) {
                    throw new HttpException(b11);
                }
                try {
                    throw new HttpException(this.f28758d.getResponseMessage(), b11);
                } catch (IOException e11) {
                    throw new HttpException("Failed to get a response message", b11, e11);
                }
            }
            String headerField = this.f28758d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", b11);
            }
            try {
                URL url3 = new URL(url, headerField);
                cleanup();
                return f(url3, i11 + 1, url, map);
            } catch (MalformedURLException e12) {
                throw new HttpException("Bad redirect url: " + headerField, b11, e12);
            }
        } catch (IOException e13) {
            throw new HttpException("Failed to connect or obtain data", b(this.f28758d), e13);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(@NonNull Priority priority, @NonNull d.a<? super InputStream> aVar) {
        long b11 = fl.i.b();
        try {
            try {
                aVar.b(f(this.f28755a.i(), 0, null, this.f28755a.e()));
                if (Log.isLoggable(f28750g, 2)) {
                    Log.v(f28750g, "Finished http url fetcher fetch in " + fl.i.a(b11));
                }
            } catch (IOException e11) {
                if (Log.isLoggable(f28750g, 3)) {
                    Log.d(f28750g, "Failed to load data for url", e11);
                }
                aVar.c(e11);
                if (Log.isLoggable(f28750g, 2)) {
                    Log.v(f28750g, "Finished http url fetcher fetch in " + fl.i.a(b11));
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable(f28750g, 2)) {
                Log.v(f28750g, "Finished http url fetcher fetch in " + fl.i.a(b11));
            }
            throw th2;
        }
    }

    @VisibleForTesting
    public j(pk.h hVar, int i11, b bVar) {
        this.f28755a = hVar;
        this.f28756b = i11;
        this.f28757c = bVar;
    }
}
