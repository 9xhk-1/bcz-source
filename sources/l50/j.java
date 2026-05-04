package l50;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f70001a;

    static {
        Object m6308constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            m6308constructorimpl = Result.m6308constructorimpl(property != null ? u30.e0.p1(property) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        Integer num = (Integer) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
        f70001a = num != null ? num.intValue() : 2097152;
    }
}
