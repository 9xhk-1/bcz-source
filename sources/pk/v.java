package pk;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class v implements ik.a<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final String f80766b = "StreamEncoder";

    /* renamed from: a, reason: collision with root package name */
    public final lk.b f80767a;

    public v(lk.b bVar) {
        this.f80767a = bVar;
    }

    @Override // ik.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull File file, @NonNull ik.e eVar) {
        byte[] bArr = (byte[]) this.f80767a.a(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable(f80766b, 3)) {
                            Log.d(f80766b, "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f80767a.put(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f80767a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f80767a.put(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }
}
