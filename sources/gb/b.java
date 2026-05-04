package gb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f53547a;

    public b(String tag) {
        this.f53547a = tag;
    }

    public <T> T a(vb.a aVar, String str, Type type) {
        try {
            try {
                if (aVar.q(true)) {
                    return (T) b(aVar.j(str), type);
                }
                throw new IOException("资源库打开失败");
            } catch (Exception e11) {
                qb.c.d(this.f53547a, e11.getMessage(), new Object[0]);
                aVar.b();
                return null;
            }
        } finally {
            aVar.b();
        }
    }

    public final <T> T b(File file, Type type) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return (T) new com.google.gson.d().o(stringBuffer.toString(), type);
                }
                stringBuffer.append(readLine + '\n');
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public void c(vb.a rl2, String filename, Object obj) {
        try {
            try {
                if (!rl2.q(true)) {
                    throw new IOException("资源库打开失败");
                }
                File createTempFile = File.createTempFile("cm_" + filename, null);
                if (!d(createTempFile, obj)) {
                    throw new IOException("无法写入临时文件,请检查磁盘空间与应用权限");
                }
                if (!rl2.r(filename, createTempFile, true)) {
                    throw new IOException("无法向资源库写入数据");
                }
                rl2.b();
            } catch (Exception e11) {
                qb.c.d(this.f53547a, e11.getMessage(), new Object[0]);
                rl2.b();
            }
        } catch (Throwable th2) {
            rl2.b();
            throw th2;
        }
    }

    public final boolean d(File file, Object data) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(new com.google.gson.d().z(data));
            fileWriter.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
