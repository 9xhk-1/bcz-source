package g80;

import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ProcessBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f53492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53493b;

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f53494c;

    public f() {
        String str;
        String str2 = System.getenv("PATH");
        String str3 = null;
        if (str2 != null) {
            str = null;
            for (String str4 : str2.split(File.pathSeparator)) {
                File file = new File(str4, "tty.exe");
                if (str3 == null && file.canExecute()) {
                    str3 = file.getAbsolutePath();
                }
                File file2 = new File(str4, "stty.exe");
                if (str == null && file2.canExecute()) {
                    str = file2.getAbsolutePath();
                }
            }
        } else {
            str = null;
        }
        String str5 = str3 != null ? str3 : "tty.exe";
        String str6 = str != null ? str : "stty.exe";
        this.f53493b = str5;
        this.f53492a = str6;
        this.f53494c = Pattern.compile("\\bcolumns\\s+(\\d+)\\b");
    }

    public static String d(Process process) throws IOException, InterruptedException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = process.getInputStream();
        try {
            InputStream errorStream = process.getErrorStream();
            while (true) {
                try {
                    int read = inputStream.read();
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(read);
                } finally {
                }
            }
            while (true) {
                int read2 = errorStream.read();
                if (read2 == -1) {
                    process.waitFor();
                    errorStream.close();
                    inputStream.close();
                    return byteArrayOutputStream.toString();
                }
                byteArrayOutputStream.write(read2);
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String a(boolean z11) {
        ProcessBuilder redirectInput;
        try {
            redirectInput = new ProcessBuilder(this.f53493b).redirectInput(b(z11 ? FileDescriptor.out : FileDescriptor.err));
            Process start = redirectInput.start();
            String d11 = d(start);
            if (start.exitValue() == 0) {
                return d11.trim();
            }
            return null;
        } catch (Throwable th2) {
            if (!"java.lang.reflect.InaccessibleObjectException".equals(th2.getClass().getName())) {
                return null;
            }
            System.err.println("MINGW support requires --add-opens java.base/java.lang=ALL-UNNAMED");
            return null;
        }
    }

    public final ProcessBuilder.Redirect b(FileDescriptor fileDescriptor) throws ReflectiveOperationException {
        Class<?> cls = Class.forName("java.lang.ProcessBuilder$RedirectPipeImpl");
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        ProcessBuilder.Redirect a11 = e.a(declaredConstructor.newInstance(null));
        Field declaredField = cls.getDeclaredField(IjkMediaPlayer.OnNativeInvokeListener.ARG_FD);
        declaredField.setAccessible(true);
        declaredField.set(a11, fileDescriptor);
        return a11;
    }

    public int c(String str) {
        try {
            Process start = new ProcessBuilder(this.f53492a, "-F", str, "-a").start();
            String d11 = d(start);
            if (start.exitValue() == 0) {
                Matcher matcher = this.f53494c.matcher(d11);
                if (matcher.find()) {
                    return Integer.parseInt(matcher.group(1));
                }
                throw new IOException("Unable to parse columns");
            }
            throw new IOException("Error executing '" + this.f53492a + "': " + d11);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
