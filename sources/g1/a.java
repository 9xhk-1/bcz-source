package g1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f52494a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f52494a = httpURLConnection;
    }

    @Override // g1.c
    @NonNull
    public InputStream C5() throws IOException {
        return this.f52494a.getInputStream();
    }

    @Override // g1.c
    public boolean S5() {
        try {
            return this.f52494a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    public final String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52494a.disconnect();
    }

    @Override // g1.c
    @Nullable
    public String m5() {
        return this.f52494a.getContentType();
    }

    @Override // g1.c
    @Nullable
    public String v() {
        try {
            if (S5()) {
                return null;
            }
            return "Unable to fetch " + this.f52494a.getURL() + ". Failed with " + this.f52494a.getResponseCode() + "\n" + a(this.f52494a);
        } catch (IOException e11) {
            j1.f.f("get error failed ", e11);
            return e11.getMessage();
        }
    }
}
