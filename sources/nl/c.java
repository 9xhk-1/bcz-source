package nl;

import android.content.Context;
import com.esotericsoftware.spine.f;
import com.esotericsoftware.spine.g;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import jl.i;
import jl.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {
    public static i a(kl.i iVar, String str, Context context) {
        kl.a aVar = new kl.a(iVar);
        j gVar = str.endsWith(".json") ? new g(aVar) : new f(aVar);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
            try {
                i b11 = gVar.b(bufferedInputStream);
                bufferedInputStream.close();
                return b11;
            } finally {
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static i b(kl.i iVar, File file) {
        kl.a aVar = new kl.a(iVar);
        return (file.getPath().endsWith(".json") ? new g(aVar) : new f(aVar)).c(new v1.a(file));
    }

    public static i c(kl.i iVar, URL url, File file) {
        return b(iVar, b.a(url, file));
    }
}
