package l90;

import java.io.Reader;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.BomInput;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a {

    /* renamed from: u, reason: collision with root package name */
    public c f70757u;

    /* renamed from: v, reason: collision with root package name */
    public final int f70758v;

    /* renamed from: w, reason: collision with root package name */
    public final int f70759w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f70760x;

    public b(char c11, int i11, int i12, int i13, boolean z11) {
        super(c11, i13, z11);
        this.f70760x = false;
        this.f70758v = i11;
        this.f70759w = i12;
    }

    @Override // k90.c
    public void stop() {
        c cVar;
        if (this.f70760x || (cVar = this.f70757u) == null) {
            return;
        }
        cVar.e();
        this.f70757u.c();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a
    public void x() {
        try {
            a a11 = this.f70757u.a();
            this.f70757u.c();
            this.f78157q = a11.f70755a;
            this.f78158r = a11.f70756b;
        } catch (BomInput.BytesProcessedNotification e11) {
            this.f70760x = true;
            D(e11);
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a
    public void z(Reader reader) {
        if (this.f70760x) {
            this.f70757u.f70767g = reader;
        } else {
            stop();
            c cVar = new c(reader, this.f70758v, this.f70759w, this.f78154n);
            this.f70757u = cVar;
            cVar.c();
        }
        this.f70760x = false;
    }

    public b(char[] cArr, char c11, int i11, int i12, int i13, boolean z11) {
        super(cArr, c11, i13, z11);
        this.f70760x = false;
        this.f70758v = i11;
        this.f70759w = i12;
    }
}
