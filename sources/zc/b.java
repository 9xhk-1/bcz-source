package zc;

import com.baicizhan.learning_strategy.util.L;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public File f102544a;

    public b(File file) {
        this.f102544a = file;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0022: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:35), block:B:27:0x0022 */
    @Override // zc.d
    public ad.a load() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader3 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(this.f102544a));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuffer.append(readLine);
                        stringBuffer.append("\n");
                    } catch (Exception e11) {
                        e = e11;
                        L.log.error("load error", e);
                        try {
                            bufferedReader.close();
                        } catch (Exception unused) {
                        }
                        return null;
                    }
                }
                ad.a load = new e(stringBuffer.toString()).load();
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                return load;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader3 = bufferedReader2;
                try {
                    bufferedReader3.close();
                } catch (Exception unused3) {
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader3.close();
            throw th;
        }
    }
}
