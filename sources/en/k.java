package en;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f49926a = "ColorResLoaderCreator";

    @Nullable
    public static ResourcesLoader a(@NonNull Context context, @NonNull Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] i11 = m.i(context, map);
            Log.i(f49926a, "Table created, length: " + i11.length);
            if (i11.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
                try {
                    if (fileDescriptor == null) {
                        Log.w(f49926a, "Cannot create memory file descriptor.");
                        if (fileDescriptor == null) {
                            return null;
                        }
                        Os.close(fileDescriptor);
                        return null;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    try {
                        fileOutputStream.write(i11);
                        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                        try {
                            j.a();
                            ResourcesLoader a11 = i.a();
                            loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                            a11.addProvider(loadFromTable);
                            if (dup != null) {
                                dup.close();
                            }
                            fileOutputStream.close();
                            Os.close(fileDescriptor);
                            return a11;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileDescriptor = null;
            }
        } catch (Exception e11) {
            Log.e(f49926a, "Failed to create the ColorResourcesTableCreator.", e11);
            return null;
        }
    }
}
