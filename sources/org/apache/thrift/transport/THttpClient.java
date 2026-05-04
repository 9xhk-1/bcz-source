package org.apache.thrift.transport;

import a80.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class THttpClient extends TTransport {
    private final HttpClient client;
    private final HttpHost host;
    private String url;
    private URL url_;
    private final ByteArrayOutputStream requestBuffer_ = new ByteArrayOutputStream();
    private InputStream inputStream_ = null;
    private int connectTimeout_ = 0;
    private int readTimeout_ = 0;
    private Map<String, String> customHeaders_ = null;

    public THttpClient(String str) throws TTransportException {
        this.url_ = null;
        this.url = null;
        try {
            this.url_ = new URL(str);
            this.url = str;
            this.client = null;
            this.host = null;
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    private static void consume(HttpEntity httpEntity) throws IOException {
        InputStream w11;
        if (httpEntity == null || !httpEntity.q() || (w11 = httpEntity.w()) == null) {
            return;
        }
        w11.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void flushUsingHttpClient() throws org.apache.thrift.transport.TTransportException {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.thrift.transport.THttpClient.flushUsingHttpClient():void");
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.inputStream_;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.inputStream_ = null;
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void flush() throws TTransportException {
        if (this.client != null) {
            flushUsingHttpClient();
            return;
        }
        byte[] byteArray = this.requestBuffer_.toByteArray();
        this.requestBuffer_.reset();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.url_.openConnection();
            int i11 = this.connectTimeout_;
            if (i11 > 0) {
                httpURLConnection.setConnectTimeout(i11);
            }
            int i12 = this.readTimeout_;
            if (i12 > 0) {
                httpURLConnection.setReadTimeout(i12);
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-thrift");
            httpURLConnection.setRequestProperty("Accept", "application/x-thrift");
            httpURLConnection.setRequestProperty("User-Agent", "Java/THttpClient");
            Map<String, String> map = this.customHeaders_;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(byteArray);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                this.inputStream_ = httpURLConnection.getInputStream();
                return;
            }
            throw new TTransportException("HTTP Response code: " + responseCode);
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        InputStream inputStream = this.inputStream_;
        if (inputStream == null) {
            throw new TTransportException("Response buffer is empty, no request.");
        }
        try {
            int read = inputStream.read(bArr, i11, i12);
            if (read != -1) {
                return read;
            }
            throw new TTransportException("No more data available.");
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    public void setConnectTimeout(int i11) {
        this.connectTimeout_ = i11;
        HttpClient httpClient = this.client;
        if (httpClient != null) {
            httpClient.getParams().setParameter(b.f2296f, Integer.valueOf(this.connectTimeout_));
        }
    }

    public void setCustomHeader(String str, String str2) {
        if (this.customHeaders_ == null) {
            this.customHeaders_ = new HashMap();
        }
        this.customHeaders_.put(str, str2);
    }

    public void setCustomHeaders(Map<String, String> map) {
        this.customHeaders_ = map;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void setMethodName(String str) throws TTransportException {
        try {
            this.url_ = new URL(this.url + "/" + str);
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    public void setReadTimeout(int i11) {
        this.readTimeout_ = i11;
        HttpClient httpClient = this.client;
        if (httpClient != null) {
            httpClient.getParams().setParameter(b.f2291a, Integer.valueOf(this.readTimeout_));
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) {
        this.requestBuffer_.write(bArr, i11, i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory extends TTransportFactory {
        private final HttpClient client;
        private final String url;

        public Factory(String str) {
            this.url = str;
            this.client = null;
        }

        @Override // org.apache.thrift.transport.TTransportFactory
        public TTransport getTransport(TTransport tTransport) {
            try {
                HttpClient httpClient = this.client;
                return httpClient != null ? new THttpClient(this.url, httpClient) : new THttpClient(this.url);
            } catch (TTransportException unused) {
                return null;
            }
        }

        public Factory(String str, HttpClient httpClient) {
            this.url = str;
            this.client = httpClient;
        }
    }

    public THttpClient(String str, HttpClient httpClient) throws TTransportException {
        this.url_ = null;
        this.url = null;
        try {
            URL url = new URL(str);
            this.url_ = url;
            this.url = str;
            this.client = httpClient;
            this.host = new HttpHost(url.getHost(), -1 == this.url_.getPort() ? this.url_.getDefaultPort() : this.url_.getPort(), this.url_.getProtocol());
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() {
    }
}
