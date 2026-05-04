package g1;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final d f52495a;

    public f(@NonNull d dVar) {
        this.f52495a = dVar;
    }

    public static String c(String str, FileExtension fileExtension, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z11 ? fileExtension.tempExtension() : fileExtension.extension);
        return sb2.toString();
    }

    public void a() {
        File e11 = e();
        if (e11.exists()) {
            File[] listFiles = e11.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : e11.listFiles()) {
                    file.delete();
                }
            }
            e11.delete();
        }
    }

    @Nullable
    @WorkerThread
    public Pair<FileExtension, InputStream> b(String str) {
        try {
            File d11 = d(str);
            if (d11 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d11);
            FileExtension fileExtension = d11.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : FileExtension.JSON;
            j1.f.a("Cache hit for " + str + " at " + d11.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    public final File d(String str) throws FileNotFoundException {
        File file = new File(e(), c(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), c(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final File e() {
        File a11 = this.f52495a.a();
        if (a11.isFile()) {
            a11.delete();
        }
        if (!a11.exists()) {
            a11.mkdirs();
        }
        return a11;
    }

    public void f(String str, FileExtension fileExtension) {
        File file = new File(e(), c(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        j1.f.a("Copying temp file to real file (" + file2 + j.f81007d);
        if (renameTo) {
            return;
        }
        j1.f.e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    public File g(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(e(), c(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }
}
