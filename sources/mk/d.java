package mk;

import java.io.File;
import mk.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements a.InterfaceC0886a {

    /* renamed from: c, reason: collision with root package name */
    public final long f73433c;

    /* renamed from: d, reason: collision with root package name */
    public final c f73434d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f73435a;

        public a(String str) {
            this.f73435a = str;
        }

        @Override // mk.d.c
        public File a() {
            return new File(this.f73435a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f73436a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f73437b;

        public b(String str, String str2) {
            this.f73436a = str;
            this.f73437b = str2;
        }

        @Override // mk.d.c
        public File a() {
            return new File(this.f73436a, this.f73437b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        File a();
    }

    public d(String str, long j11) {
        this(new a(str), j11);
    }

    @Override // mk.a.InterfaceC0886a
    public mk.a build() {
        File a11 = this.f73434d.a();
        if (a11 == null) {
            return null;
        }
        if (a11.isDirectory() || a11.mkdirs()) {
            return e.d(a11, this.f73433c);
        }
        return null;
    }

    public d(String str, String str2, long j11) {
        this(new b(str, str2), j11);
    }

    public d(c cVar, long j11) {
        this.f73433c = j11;
        this.f73434d = cVar;
    }
}
