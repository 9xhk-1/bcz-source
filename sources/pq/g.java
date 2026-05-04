package pq;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* loaded from: classes7.dex */
public class g implements oq.d {

    /* renamed from: a, reason: collision with root package name */
    public final oq.c f81140a;

    /* renamed from: b, reason: collision with root package name */
    public SecretKey f81141b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f81142c = false;

    public g(oq.c cVar) {
        this.f81140a = cVar;
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    @Override // oq.d
    public String a(String str, String str2) {
        String str3;
        if (!this.f81142c) {
            b();
        }
        if (this.f81141b == null) {
            str3 = "mKey is null, return default value";
        } else {
            if (!c(str)) {
                return str2;
            }
            try {
                return new String(l.b(this.f81141b, a.b(d(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str3);
        return str2;
    }

    public final void b() {
        try {
            this.f81141b = l.a(new f(this.f81140a.getString("/code/code1", null), this.f81140a.getString("/code/code2", null), this.f81140a.getString("/code/code3", null), this.f81140a.getString("/code/code4", null), qr.c.f82661b, 10000));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
            this.f81141b = null;
        }
        this.f81142c = true;
    }

    public final String d(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }
}
