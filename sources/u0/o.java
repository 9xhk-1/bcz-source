package u0;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDebugLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugLogger.kt\ncoil/util/DebugLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/* loaded from: classes3.dex */
public final class o implements w {

    /* renamed from: a, reason: collision with root package name */
    public int f91462a;

    @w00.k
    public o() {
        this(0, 1, null);
    }

    @Override // u0.w
    public void a(@m80.k String str, int i11, @m80.l String str2, @m80.l Throwable th2) {
        if (str2 != null) {
            Log.println(i11, str, str2);
        }
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            Log.println(i11, str, stringWriter.toString());
        }
    }

    @Override // u0.w
    public void b(int i11) {
        c(i11);
        this.f91462a = i11;
    }

    public final void c(int i11) {
        if (2 > i11 || i11 >= 8) {
            throw new IllegalArgumentException(("Invalid log level: " + i11).toString());
        }
    }

    @Override // u0.w
    public int getLevel() {
        return this.f91462a;
    }

    @w00.k
    public o(int i11) {
        this.f91462a = i11;
        c(i11);
    }

    public /* synthetic */ o(int i11, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? 3 : i11);
    }
}
