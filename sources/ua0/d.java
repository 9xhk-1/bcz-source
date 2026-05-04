package ua0;

import java.io.PrintStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import org.koin.core.logger.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public final PrintStream f92092b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // ua0.b
    public void b(@k Level level, @k String msg) {
        g0.p(level, "level");
        g0.p(msg, "msg");
        this.f92092b.println('[' + level + "] [Koin] " + msg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k Level level) {
        super(level);
        g0.p(level, "level");
        this.f92092b = level.compareTo(Level.WARNING) >= 0 ? System.err : System.out;
    }

    public /* synthetic */ d(Level level, int i11, v vVar) {
        this((i11 & 1) != 0 ? Level.INFO : level);
    }
}
