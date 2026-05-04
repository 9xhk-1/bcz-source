package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.message.BasicHeader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j extends a {

    /* renamed from: g, reason: collision with root package name */
    public g f10284g;

    public j(g gVar, Method method, int i11, String str, byte[] bArr, boolean z11) {
        super(method, i11, str, bArr, "application/x-www-form-urlencoded", z11);
        this.f10284g = gVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.v
    public final Object a() {
        o oVar = new o(this.f10284g.a());
        oVar.a(this.f10253b);
        oVar.a(this.f10256e);
        oVar.a(this.f10257f);
        oVar.a("id", String.valueOf(this.f10255d));
        oVar.a("operationType", this.f10254c);
        oVar.a("gzip", String.valueOf(this.f10284g.d()));
        oVar.a(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<org.apache.http.e> b11 = this.f10284g.c().b();
        if (b11 != null && !b11.isEmpty()) {
            Iterator<org.apache.http.e> it = b11.iterator();
            while (it.hasNext()) {
                oVar.a(it.next());
            }
        }
        Thread.currentThread().getId();
        oVar.toString();
        try {
            u uVar = this.f10284g.b().a(oVar).get();
            if (uVar != null) {
                return uVar.b();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e11) {
            throw new RpcException(13, "", e11);
        } catch (CancellationException e12) {
            throw new RpcException(13, "", e12);
        } catch (ExecutionException e13) {
            Throwable cause = e13.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e13);
            }
            HttpException httpException = (HttpException) cause;
            int code = httpException.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case 7:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        }
    }
}
