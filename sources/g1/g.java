package g1;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.k;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.u0;
import com.airbnb.lottie.x;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import ku.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final f f52496a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final e f52497b;

    public g(@NonNull f fVar, @NonNull e eVar) {
        this.f52496a = fVar;
        this.f52497b = eVar;
    }

    @Nullable
    @WorkerThread
    public final k a(@NonNull String str, @Nullable String str2) {
        Pair<FileExtension, InputStream> b11;
        if (str2 == null || (b11 = this.f52496a.b(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) b11.first;
        InputStream inputStream = (InputStream) b11.second;
        u0<k> L = fileExtension == FileExtension.ZIP ? x.L(new ZipInputStream(inputStream), str) : x.u(inputStream, str);
        if (L.b() != null) {
            return L.b();
        }
        return null;
    }

    @NonNull
    @WorkerThread
    public final u0<k> b(@NonNull String str, @Nullable String str2) {
        u0<k> u0Var;
        j1.f.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                c a11 = this.f52497b.a(str);
                if (a11.S5()) {
                    u0Var = d(str, a11.C5(), a11.m5(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(u0Var.b() != null);
                    j1.f.a(sb2.toString());
                } else {
                    u0Var = new u0<>(new IllegalArgumentException(a11.v()));
                }
                try {
                    a11.close();
                    return u0Var;
                } catch (IOException e11) {
                    j1.f.f("LottieFetchResult close failed ", e11);
                    return u0Var;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e12) {
                        j1.f.f("LottieFetchResult close failed ", e12);
                    }
                }
                throw th2;
            }
        } catch (Exception e13) {
            u0<k> u0Var2 = new u0<>(e13);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e14) {
                    j1.f.f("LottieFetchResult close failed ", e14);
                }
            }
            return u0Var2;
        }
    }

    @NonNull
    @WorkerThread
    public u0<k> c(@NonNull String str, @Nullable String str2) {
        k a11 = a(str, str2);
        if (a11 != null) {
            return new u0<>(a11);
        }
        j1.f.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }

    @NonNull
    public final u0<k> d(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        FileExtension fileExtension;
        u0<k> f11;
        if (str2 == null) {
            str2 = r0.f68791f;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            j1.f.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            f11 = f(str, inputStream, str3);
        } else {
            j1.f.a("Received json response.");
            fileExtension = FileExtension.JSON;
            f11 = e(str, inputStream, str3);
        }
        if (str3 != null && f11.b() != null) {
            this.f52496a.f(str, fileExtension);
        }
        return f11;
    }

    @NonNull
    public final u0<k> e(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        return str2 == null ? x.u(inputStream, null) : x.u(new FileInputStream(this.f52496a.g(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    @NonNull
    public final u0<k> f(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        return str2 == null ? x.L(new ZipInputStream(inputStream), null) : x.L(new ZipInputStream(new FileInputStream(this.f52496a.g(str, inputStream, FileExtension.ZIP))), str);
    }
}
