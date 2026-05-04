package c60;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.g0;
import l60.m;
import m80.k;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f8215a = a.f8217a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public static final f f8216b = new a.C0135a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f8217a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: c60.f$a$a, reason: collision with other inner class name */
        public static final class C0135a implements f {
            @Override // c60.f
            public boolean a(int i11, @k List<c60.a> requestHeaders) {
                g0.p(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // c60.f
            public boolean b(int i11, @k List<c60.a> responseHeaders, boolean z11) {
                g0.p(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // c60.f
            public boolean c(int i11, @k m source, int i12, boolean z11) throws IOException {
                g0.p(source, "source");
                source.skip(i12);
                return true;
            }

            @Override // c60.f
            public void d(int i11, @k ErrorCode errorCode) {
                g0.p(errorCode, "errorCode");
            }
        }
    }

    boolean a(int i11, @k List<c60.a> list);

    boolean b(int i11, @k List<c60.a> list, boolean z11);

    boolean c(int i11, @k m mVar, int i12, boolean z11) throws IOException;

    void d(int i11, @k ErrorCode errorCode);
}
