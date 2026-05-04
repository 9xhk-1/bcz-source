package m70;

import org.apache.http.HttpConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface l extends HttpConnection, g {

    /* renamed from: x0, reason: collision with root package name */
    public static final int f72567x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f72568y0 = 1;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f72569z0 = 2;

    HttpResponse N6();

    HttpContext getContext();

    int getStatus();

    HttpRequest n0();
}
