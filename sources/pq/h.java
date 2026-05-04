package pq;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* loaded from: classes7.dex */
public class h implements oq.d {

    /* renamed from: a, reason: collision with root package name */
    public SecretKey f81143a;

    /* renamed from: b, reason: collision with root package name */
    public final f f81144b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f81145c = false;

    public h(f fVar) {
        this.f81144b = fVar;
    }

    private void b() {
        try {
            this.f81143a = l.a(this.f81144b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'.");
            this.f81143a = null;
        }
        this.f81145c = true;
    }

    @Override // oq.d
    public String a(String str, String str2) {
        if (!this.f81145c) {
            b();
        }
        if (this.f81143a != null && !TextUtils.isEmpty(str)) {
            try {
                return new String(l.b(this.f81143a, a.b(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e11) {
                Log.e("AGC_LocalResource", "decrypt exception:" + e11.getMessage());
            }
        }
        return str2;
    }
}
