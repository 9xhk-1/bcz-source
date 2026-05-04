package qb;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82034a = "UncaughtExceptionWriter";

    /* renamed from: b, reason: collision with root package name */
    public static final int f82035b = 1048576;

    public static void a(String filePath, Throwable t11) {
        if (filePath == null || t11 == null) {
            c.d(f82034a, "null == filePath || null == t", new Object[0]);
            return;
        }
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.length() > 1048576) {
                file.delete();
                file.createNewFile();
            }
            String format = String.format(Locale.getDefault(), "%s %s \n", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()), Log.getStackTraceString(t11));
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append((CharSequence) format);
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e11) {
            c.c(f82034a, "", e11);
        }
    }
}
