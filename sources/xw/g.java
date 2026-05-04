package xw;

import kotlin.jvm.internal.g0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLoggerFactory;
import xw.e;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f98407a = e0.c(new x00.a() { // from class: xw.f
        @Override // x00.a
        public final Object invoke() {
            e b11;
            b11 = g.b();
            return b11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements e {

        /* renamed from: b, reason: collision with root package name */
        public final Logger f98408b;

        public a() {
            Logger logger = LoggerFactory.getLogger((Class<?>) lw.c.class);
            g0.m(logger);
            this.f98408b = logger;
        }

        @Override // xw.e
        public void log(String message) {
            g0.p(message, "message");
            this.f98408b.info(message);
        }
    }

    public static final e b() {
        return d();
    }

    @m80.k
    public static final e c(@m80.k e.a aVar) {
        g0.p(aVar, "<this>");
        return (e) f98407a.getValue();
    }

    public static final e d() {
        e e11 = e(e.f98405a);
        try {
            Class<?> cls = Class.forName("android.util.Log");
            if (!(LoggerFactory.getILoggerFactory() instanceof NOPLoggerFactory)) {
                return new o(0, 0, e11, 3, null);
            }
            g0.m(cls);
            return new o(0, 0, new c(cls, e11), 3, null);
        } catch (ClassNotFoundException unused) {
            return new o(0, 0, e11, 3, null);
        }
    }

    @m80.k
    public static final e e(@m80.k e.a aVar) {
        g0.p(aVar, "<this>");
        return new a();
    }
}
